package org.example.gift;

import org.example.chocolate.Choco;
import org.example.sweets.Sweet;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Gift
{
    private ArrayList<Choco> chocolateslist;
    private ArrayList<Sweet> sweetslist;

    public Gift()
    {
        chocolateslist = new ArrayList<>();
        sweetslist = new ArrayList<>();
    }

    public void addChocolatesToList(Choco chocolate)
    {
        this.chocolateslist.addAll(Arrays.asList(chocolate));
    }

    public void addSweetsToList(Sweet sweet)
    {
        this.sweetslist.addAll(Arrays.asList(sweet));
    }

    public ArrayList<Choco> getChocolatesFromList()
    {
        return chocolateslist;
    }

    public ArrayList<Sweet> getSweetsFromList()
    {
        return sweetslist;
    }

    public void sort()
    {
        Collections.sort(sweetslist);
        Collections.sort(chocolateslist);
    }

    public int calWeightofGift()
    {
        int totalWeight = 0;
        for(Choco ch : this.chocolateslist)
        {
            totalWeight = totalWeight + ch.getWeight();
        }
        for(Sweet sw : this.sweetslist)
        {
            totalWeight = totalWeight + sw.getWeight();
        }
        return  totalWeight;
    }
}