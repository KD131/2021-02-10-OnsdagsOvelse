package com.company;

public class Finnish implements Dialog
{
    private String s = "suomi";
    
    @Override
    public String getLanguage()
    {
        return s;
    }
    
    @Override
    public String quit()
    {
        return "paina q lopettaaksesi";
    }
    
    @Override
    public String selectedLanguage()
    {
        return "valittu kieli on";
    }
}
