package com.superking75.animal_app_jason;

public class Seal extends Animal implements Fun
{
    public final String TYPE = "seal";

    public String getTYPE() {
        return TYPE;
    }

    public String play()
    {
        return "Da Seal cuts a boat in half";
    }

    @Override
    public String say()
    {
        //super.say();
        return  "bArK";

    }

    public Seal()
    {
        type = "Seal";
    }


}
