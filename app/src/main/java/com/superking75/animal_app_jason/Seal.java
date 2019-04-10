package com.superking75.animal_app_jason;

public class Seal extends Animal
{
    public final String TYPE = "seal";

    public String getTYPE() {
        return TYPE;
    }


    @Override
    public String say()
    {
        //super.say();
        return  "bArK";

    }

    public Seal()
    {
       // type = "Seal";
    }


}
