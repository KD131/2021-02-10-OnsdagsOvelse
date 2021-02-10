package com.company;

public class Spanish implements Dialog{

    private String s = "Español";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "presione q para salir";
    }

    @Override
    public String selectedLanguage() {
        return "el idioma seleccionado es";
    }
}
