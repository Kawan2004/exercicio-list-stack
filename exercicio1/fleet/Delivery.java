package fleet;

public enum Delivery {

    PERECIVEL("perecivel"), 
    OUTRO("outro");

    private String value;

    Delivery (String value){
        this.value = value;
    }

    public String getValue () {
        return this.value;
    }

    

}
