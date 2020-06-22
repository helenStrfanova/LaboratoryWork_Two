/*
 *
 * Classname : Main
 *
 * Created on 22 June 2020
 *
 * Copyright Alyona Sviridova NTU KhPI
 *
 * Laboratory Work No.2
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BoxedCandies AVK1 = new BoxedCandies(50, 25, 4, 255);
        BoxedCandies AVK2 = new BoxedCandies(150, 450, 90, 100);
        BoxedCandies AVK3 = new BoxedCandies(120, 100, 20, 55);
        BoxedCandies AVK4 = new BoxedCandies(86, 54, 7, 139);
        BoxedCandies AVK5 = new BoxedCandies(105, 240, 96, 378);

        List<ICandiesMethods> candiesBox = new ArrayList<>();
        candiesBox.add(AVK1);
        candiesBox.add(AVK2);
        candiesBox.add(AVK3);
        candiesBox.add(AVK4);
        candiesBox.add(AVK5);

        CandiesByWeight Roshen1 = new CandiesByWeight(158, 500,78,555);
        CandiesByWeight Roshen2 = new CandiesByWeight(68, 500,90,250);
        CandiesByWeight Roshen3 = new CandiesByWeight(78, 500,45,320);
        CandiesByWeight Roshen4 = new CandiesByWeight(58, 500,99,150);
        CandiesByWeight Roshen5 = new CandiesByWeight(97, 500,20,78);
        CandiesByWeight Roshen6 = new CandiesByWeight(102, 500,68,148);

        List<ICandiesMethods> candieByWeight = new ArrayList<>();
        candiesBox.add(Roshen1);
        candiesBox.add(Roshen2);
        candiesBox.add(Roshen3);
        candiesBox.add(Roshen4);
        candiesBox.add(Roshen5);
    }
}
