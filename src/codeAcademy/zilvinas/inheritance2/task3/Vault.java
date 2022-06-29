package codeAcademy.zilvinas.inheritance2.task3;

interface Vault {
    void saveInfo(Info info);
    Info findInfo(Integer id);
    Info findInfo(String text);
}
