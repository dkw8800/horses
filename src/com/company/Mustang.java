package com.company;

public class Mustang implements Horse{
    public String name;
    public int weight;

    public Mustang(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName()
    {
        return this.name;
    }

    public int getWeight()
    {
        return this.weight;
    }
}
