package com.superking75.animal_app_jason;

public class Fox extends Animal implements Fun
{

    public String[] foxSay = {"","Ring-ding-ding-ding-dingeringeding!","Wa-pa-pa-pa-pa-pa-pow!","Hatee-hatee-hatee-ho!", "Joff-tchoff-tchoffo-tchoffo-tchoff!", "Fraka-kaka-kaka-kaka-kow!","A-hee-ahee ha-hee!"};
    public Fox()
    {
        type = "Fox";
    }

    public String play()
    {
        return "WHAT DOES THE FOX SAY!!~!~~~";
    }
    @Override
    public String say()
    {
        int random = (int ) (Math.random() * 6);
        return foxSay[random];

    }



}
