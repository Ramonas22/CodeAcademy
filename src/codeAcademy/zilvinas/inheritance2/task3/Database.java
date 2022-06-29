package codeAcademy.zilvinas.inheritance2.task3;

import java.util.HashMap;
import java.util.Map;

class Database implements Vault {

    HashMap<Integer, Info> infoHashMap = new HashMap<>();

    @Override
    public void saveInfo(Info info) {
        System.out.println("Info saved to database");
        infoHashMap.put(info.getID(), info);
    }

    @Override
    public Info findInfo(Integer id) {
        System.out.println("Info found by ID in database");
        return infoHashMap.get(id);
    }

    @Override
    public Info findInfo(String text) {
        System.out.println("Info found by word in database");
        for (Map.Entry entry : infoHashMap.entrySet()
        ) {
            if (((Info) entry.getValue()).getText().contains(text)) {
                return (Info) entry.getValue();
            }
        }/*
        for (int i = 0; i < infoHashMap.size(); i++) {
            if(infoHashMap.get(i+1).getText().contains(text)){
                return infoHashMap.get(i+1);
            }
        }*/
        return null;
    }
}
