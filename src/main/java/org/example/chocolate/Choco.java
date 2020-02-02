package org.example.chocolate;

public class Choco implements Comparable<Choco>
{
    private String name;
    private int price;
    private int weight;

    public Choco(String name,int price,int weight)
    {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
    public int getWeight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return "Chocolate [ name = '" + name + '\'' + ", weight = " + weight + ", price = " + price + ']';
    }

    @Override
    public int compareTo(Choco ch)
    {
        if(ch.price < price)
            return -1;
        if(ch.price > price)
            return 1;
        else
            return 0;
    }

}