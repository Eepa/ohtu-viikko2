import ohtu.*
import ohtu.services.*
import ohtu.data_access.*
import ohtu.domain.*
import ohtu.io.*

description """A new user account can be created 
              if a proper unused username 
              and a proper password are given"""

scenario "creation succesfull with correct username and password", {
    given 'command new user is selected', {
       
       app = luoApp("eero", "sala1nen")
    }
 
    when 'a valid username and password are entered', {
      app.run()
    }

    then 'new user is registered to system', {
      io.getPrints().shouldHave("new user registered")
    }
}

scenario "can login with succesfully generated account", {
    given 'command new user is selected', {
     
       app = luoLoginApp("eero", "sala1nen")
    }
 
    when 'a valid username and password are entered', {
      app.run()
    }

    then  'new credentials allow logging in to system', {
       io.getPrints().shouldHave("logged in")
    }
}

scenario "creation fails with correct username and too short password", {
    given 'command new user is selected',{
       
       app = luoApp("eero", "sala1" )
    }
    when 'a valid username and too short password are entered', {
      app.run()
    }
    then 'new user is not be registered to system', {
       io.getPrints().shouldHave("new user not registered")
    }
}

scenario "creation fails with correct username and pasword consisting of letters", {
    given 'command new user is selected',{
       
       app = luoApp("eero", "salasfsdfsf")
    }
    when 'a valid username and password consisting of letters are entered', {
      app.run()
    }
    then 'new user is not be registered to system', {
       io.getPrints().shouldHave("new user not registered")
    }
}


scenario "creation fails with too short username and valid pasword", {
    given 'command new user is selected',{
      
       app = luoApp("ee", "salasfsdf!sf")
    }
    when 'a too sort username and valid password are entered', {
      app.run()
    }
    then 'new user is not be registered to system', {
       io.getPrints().shouldHave("new user not registered")
    }
}

scenario "creation fails with already taken username and valid pasword", {
    given 'command new user is selected', {
       
       app = luoApp("pekka", "abcdabcd!")
    }
    when 'a already taken username and valid password are entered', {
        app.run()
    }
    then 'new user is not be registered to system', {
        io.getPrints().shouldHave("new user not registered")
    }
}

scenario "can not login with account that is not succesfully created", {
    given 'command new user is selected', {
       
       app = app = luoLoginApp("te", "abcdabcd!")
    }
    when 'a invalid username/password are entered', {
        app.run()
    }
    then  'new credentials do not allow logging in to system', {
        io.getPrints().shouldHave("wrong username or password")
    }
}

def luoApp(name, password) {
    userDao = new InMemoryUserDao()
    auth = new AuthenticationService(userDao)
    
    io = new StubIO("new", name, password) 
    
    return new App(io, auth)

}

def luoLoginApp(name, password) {
    userDao = new InMemoryUserDao()
    auth = new AuthenticationService(userDao)
    io = new StubIO("new", name, password, "login", name, password)
    
    return new App(io, auth)

}

