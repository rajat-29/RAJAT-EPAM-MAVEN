package org.example.sweets;

import org.example.chocolate.Choco;

public class Sweet implements Comparable<Sweet>
{
    private String name;
    private int price;
    private int weight;

    public Sweet(String name,int price,int weight)
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
        return "Sweet [ name = '" + name + '\'' + ", weight = " + weight + ", price = " + price + ']';
    }

    @Override
    public int compareTo(Sweet sw)
    {
        if(sw.price < price)
            return -1;
        if(sw.price > price)
            return 1;
        else
            return 0;
    }
}