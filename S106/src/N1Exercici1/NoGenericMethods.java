package N1exercici1;

public class NoGenericMethods {
    private String atr1;
    private String atr2;
    private String atr3;

    public NoGenericMethods (String atr1, String atr2,String atr3) {
        this.atr1 = atr1;
        this.atr2 = atr2;
        this.atr3 = atr3;
    }
    //metodos getter
    public String getAtr1() {
        return atr1;
    }
    public String getAtr2() {
        return atr2;
    }
    public String getAtr3() {
        return atr3;
    }

    //metodos setter
    public void setAtr1(String atr1) {
        this.atr1 = atr1;
    }



    public void setAtr2(String atr2) {
        this.atr2 = atr2;
    }

    public void setAtr3(String atr3) {
        this.atr3 = atr3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "atr1='" + atr1 + '\'' +
                ", atr2='" + atr2 + '\'' +
                ", atr3='" + atr3 + '\'' +
                '}';
    }
}

