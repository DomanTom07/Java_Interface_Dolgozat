/*
File: NameGetter.java
Author: Tamás Domán
Copyright: 2022, Tamás Domán
Group: Szoft II N
Date: 2022-10-28
Github: https://github.com/DomanTom07/
Licenc: GNU GPL
*/

public class NameGetter implements Name {
    public void getNames(String[] nevek) {
        for (String nev : nevek) {
            System.out.println(nev);
        }
    }
}
