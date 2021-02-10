package com.company;

public class Swahili implements Dialog
{
    private String s = "Kiswahili";
    
    @Override
    public String getLanguage()
    {
        return s;
    }
    
    @Override
    public String quit()
    {
        return "weka q kwa kuacha";
    }
    
    @Override
    public String selectedLanguage()
    {
        return "lugha iliyochaguliwa ni";
    }
}
