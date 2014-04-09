package ohtu;

public class Submission {

    private String student_number;
    private int hours;
    private int week;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;
    private boolean a21;

    private int tehtaviaYhteensa;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;

    }

    //_______________________________________TEHTAVAT
    public void laskeTehtavat() {
        this.tehtaviaYhteensa = 0;
        if (a1) {
            this.tehtaviaYhteensa++;
        }
        if (a2) {
            this.tehtaviaYhteensa++;
        }
        if (a3) {
            this.tehtaviaYhteensa++;
        }
        if (a4) {
            this.tehtaviaYhteensa++;
        }
        if (a5) {
            this.tehtaviaYhteensa++;
        }
        if (a6) {
            this.tehtaviaYhteensa++;
        }
        if (a7) {
            this.tehtaviaYhteensa++;
        }
        if (a8) {
            this.tehtaviaYhteensa++;
        }
        if (a9) {
            this.tehtaviaYhteensa++;
        }
        if (a10) {
            this.tehtaviaYhteensa++;
        }
        if (a11) {
            this.tehtaviaYhteensa++;
        }
        if (a12) {
            this.tehtaviaYhteensa++;
        }
        if (a13) {
            this.tehtaviaYhteensa++;
        }
        if (a14) {
            this.tehtaviaYhteensa++;
        }
        if (a15) {
            this.tehtaviaYhteensa++;
        }
        if (a16) {
            this.tehtaviaYhteensa++;
        }
        if (a17) {
            this.tehtaviaYhteensa++;
        }
        if (a18) {
            this.tehtaviaYhteensa++;
        }
        if (a19) {
            this.tehtaviaYhteensa++;
        }
        if (a20) {
            this.tehtaviaYhteensa++;
        }
        if (a21) {
            this.tehtaviaYhteensa++;
        }

    }

    public boolean getA1() {
        return a1;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;

    }

    public boolean getA2() {
        return a2;

    }

    public void setA2(boolean a2) {
        this.a2 = a2;

    }

    public boolean getA3() {
        return a3;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;

    }

    public boolean getA4() {
        return a4;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;

    }

    public boolean getA5() {
        return a5;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;

    }

    public boolean getA6() {
        return a6;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;

    }

    public boolean getA7() {
        return a7;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;

    }

    public boolean getA8() {
        return a8;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;

    }

    public boolean getA9() {
        return a9;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;

    }

    public boolean getA10() {
        return a10;
    }

    public void setA10(boolean a10) {
        this.a10 = a10;

    }

    public boolean getA11() {
        return a11;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;

    }

    public boolean getA12() {
        return a12;
    }

    public void setA12(boolean a12) {
        this.a12 = a12;

    }

    public boolean getA13() {
        return a13;
    }

    public void setA13(boolean a13) {
        this.a13 = a13;

    }

    public boolean getA14() {
        return a14;
    }

    public void setA14(boolean a14) {
        this.a14 = a14;

    }

    public boolean getA15() {
        return a15;
    }

    public void setA15(boolean a15) {
        this.a15 = a15;

    }

    public boolean getA16() {
        return a16;
    }

    public void setA16(boolean a16) {
        this.a16 = a16;

    }

    public boolean getA17() {
        return a17;
    }

    public void setA17(boolean a17) {
        this.a17 = a17;

    }

    public boolean getA18() {
        return a18;
    }

    public void setA18(boolean a18) {
        this.a18 = a18;

    }

    public boolean getA19() {
        return a19;
    }

    public void setA19(boolean a19) {
        this.a19 = a19;

    }

    public boolean getA20() {
        return a20;
    }

    public void setA20(boolean a20) {
        this.a20 = a20;

    }

    public boolean getA21() {
        return a21;
    }

    public void setA21(boolean a21) {
        this.a21 = a21;

    }

    //_______________________________________TEHTAVAT LOPPU
    public int getTehtaviaYhteensa() {
        this.laskeTehtavat();
        return this.tehtaviaYhteensa;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String kirjoitaTehdytTehtavat() {
        String tehdyt = "";
        if (a1) {
            tehdyt = tehdyt + 1 + " ";
        }
        if (a2) {
            tehdyt = tehdyt + 2 + " ";
        }
        if (a3) {
            tehdyt = tehdyt + 3 + " ";
        }
        if (a4) {
            tehdyt = tehdyt + 4 + " ";
        }
        if (a5) {
            tehdyt = tehdyt + 5 + " ";
        }
        if (a6) {
            tehdyt = tehdyt + 6 + " ";
        }
        if (a7) {
            tehdyt = tehdyt + 7 + " ";
        }
        if (a8) {
            tehdyt = tehdyt + 8 + " ";
        }
        if (a9) {
            tehdyt = tehdyt + 9 + " ";
        }
        if (a10) {
            tehdyt = tehdyt + 10 + " ";
        }
        if (a11) {
            tehdyt = tehdyt + 11 + " ";
        }
        if (a12) {
            tehdyt = tehdyt + 12 + " ";
        }
        if (a13) {
            tehdyt = tehdyt + 13 + " ";
        }
        if (a14) {
            tehdyt = tehdyt + 14 + " ";
        }
        if (a15) {
            tehdyt = tehdyt + 15 + " ";
        }
        if (a16) {
            tehdyt = tehdyt + 16 + " ";
        }
        if (a17) {
            tehdyt = tehdyt + 17 + " ";
        }
        if (a18) {
            tehdyt = tehdyt + 18 + " ";
        }
        if (a19) {
            tehdyt = tehdyt + 19 + " ";
        }
        if (a20) {
            tehdyt = tehdyt + 20 + " ";
        }
        if (a21) {
            tehdyt = tehdyt + 21 + " ";
        }
        return tehdyt;
    }

    @Override
    public String toString() {
        String tulostus = "Opiskelijanumero " + this.student_number + "\n\n"
                + "viikko " + this.week + ": tehtyjä tehtäviä yhteensä: " + this.getTehtaviaYhteensa() + ", aikaa kului " + this.hours + " tuntia, tehdyt tehtävät: " + this.kirjoitaTehdytTehtavat() + "\n\n-----------------------";
        return tulostus;
    }

}
