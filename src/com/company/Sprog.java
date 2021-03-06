package com.company;

import java.util.HashMap;

public class Sprog  {

    private HashMap<String, Dialog> dialoger = new HashMap<>();

    public Sprog() {
        // her tilføjer du ny sprog
        dialoger.put("da", new Dansk());
        dialoger.put("eng", new English());
        dialoger.put("swa", new Swahili());
        dialoger.put("fin", new Finnish());
        dialoger.put("esp", new Spanish());
    }
    
    public HashMap<String, Dialog> getAll()
    {
        return dialoger;
    }
    
    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }
}
