package codeAcademy.zilvinas.inheritance2.task3;

class Info {
    private Integer ID;
    private String text;

    public Info(Integer ID, String text) {
        this.ID = ID;
        this.text = text;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        return ("ID is " + getID() + ",text\n" + getText());
    }
    public boolean isInText(String text){
        return getText().contains(text);
    }
}
