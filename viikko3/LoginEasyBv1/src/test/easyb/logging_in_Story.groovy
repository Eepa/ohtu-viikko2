import ohtu.*
import ohtu.services.*
import ohtu.data_access.*
import ohtu.domain.*
import ohtu.io.*

description 'User can log in with valid username/password-combination'

scenario "user can login with correct password", {
    given 'command login selected', {
       
       app = luoApp("pekka", "akkep")
    }

    when 'a valid username and password are entered', {
       app.run()
    }

    then 'user will be logged in to system', {
       io.getPrints().shouldHave("logged in")
    }
}

scenario "user can not login with incorrect password", {
    given 'command login selected', {
       
       app = luoApp("pekka", "pr")
    }
    when 'a valid username and incorrect password are entered', {
        app.run()
    }
    then 'user will not be logged in to system',{
        io.getPrints().shouldHave("wrong username or password")

    }
}

scenario "nonexistent user can not login to ", {
    given 'command login selected',{
       
       app = luoApp("ekka", "pr")
    }
    when 'a nonexistent username and some password are entered',{
        app.run()
    }
    then 'user will not be logged in to system',{
        io.getPrints().shouldHave("wrong username or password")
    }


}

def luoApp(name, password) {
    userDao = new InMemoryUserDao()
    auth = new AuthenticationService(userDao)
    io = new StubIO("login", name, password) 
    
    return new App(io, auth)

}