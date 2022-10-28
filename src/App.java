/*
File: App.java
Author: Tamás Domán
Copyright: 2022, Tamás Domán
Group: Szoft II N
Date: 2022-10-28
Github: https://github.com/DomanTom07/
Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        NameGetter nameGetter = new NameGetter();
        String[] nevek = {"Béla", "Géza"};

        System.out.println("--------------");
        System.out.println("Tamás Domán");
        System.out.println("2022-10-28");
        System.out.println("Szoft II N");
        System.out.println("--------------");

        nameGetter.getNames(nevek);
    }
}
