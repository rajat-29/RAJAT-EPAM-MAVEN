package org.example;
import org.example.chocolate.Choco;
import org.example.chocolate.Chocolate1;
import org.example.chocolate.Chocolate2;
import org.example.chocolate.Chocolate3;

import org.example.sweets.Sweet;
import org.example.sweets.Sweet1;
import org.example.sweets.Sweet2;
import org.example.sweets.Sweet3;

import org.example.gift.Gift;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Choco c1 = new Chocolate1("5 Star",100,25);
        Choco c2 = new Chocolate2("Perk",150,30);
        Choco c3 = new Chocolate3("Munch",200,35);

        Sweet s1 = new Sweet1("Barfi",200,100);
        Sweet s2 = new Sweet2("Ladoo",300,200);
        Sweet s3 = new Sweet3("Pedha",400,300);

        Gift g1 = new Gift();
        g1.addChocolatesToList(c1);
        g1.addChocolatesToList(c2);
        g1.addChocolatesToList(c3);
        g1.addSweetsToList(s1);
        g1.addSweetsToList(s2);
        g1.addSweetsToList(s3);

        System.out.print("Gift items are sorted according to their price set : \n");
        g1.sort();

        int getWeight = g1.calWeightofGift();
        System.out.print("Gift Weight is : " + getWeight + "\n");

        System.out.print("Enter 1 for all chocolates : \n");
        System.out.print("Enter 2 for all sweets : \n");
        System.out.print("Enter 3 for expensive gift of chocolate and sweet : \n");
        System.out.print("Enter your choice : ");

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if(n == 1)
        {
            ArrayList<Choco> chocolate = g1.getChocolatesFromList();
            for(Choco ch : chocolate)
            {
                System.out.print(ch.toString() + "\n");
            }
        }
        if(n == 2)
        {
            ArrayList<Sweet> sweet = g1.getSweetsFromList();
            for (Sweet sw : sweet) {
                System.out.print(sw.toString() + "\n");
            }
        }
        if(n == 3)
        {
            System.out.print("Get Most Expensive gift of chocolate and sweet : \n");
            System.out.print("Chocolate : " + expensiveGift(g1.getChocolatesFromList()) + "\n");
            System.out.print("Sweet : " + expensiveGift(g1.getSweetsFromList()) + "\n");
        }
    }

    private static <R> String expensiveGift(ArrayList<R> expGift)
    {
        return expGift.get(0).toString();
    }
}
