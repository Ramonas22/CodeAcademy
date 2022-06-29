package codeAcademy.zilvinas.inheritance2.task3;

import java.util.ArrayList;

class RemoteDrive implements Vault{
    ArrayList<Info> infoArrayList = new ArrayList<>();

    @Override
    public void saveInfo(Info info) {
        System.out.println("Info saved to remote disk");
        infoArrayList.add(info);
    }

    @Override
    public Info findInfo(Integer id) {
        System.out.println("Info found in remote disk by ID");
        for (Info info: infoArrayList
             ) {
            if(info.getID().equals(id)){
                return info;
            }
        }
        return null;
    }

    @Override
    public Info findInfo(String text) {
        System.out.println("Info found in remote disk by text that does not contain entered word");
        for (Info info : infoArrayList) {
            if (!info.getText().contains(text)) {
                return info;
            }
        }
        return null;
    }
}
