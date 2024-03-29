public class bloodData extends Main{
    type Type;
    String RH;

    bloodData(){
    this.Type = type.O;
    this.RH = "+";

    }
    bloodData(String t, String rh){
        this.Type = type.valueOf(t.toUpperCase());
        this.RH = rh;
    }

    public void setType(String t){
        this.Type = type.valueOf(t.toUpperCase());
    }
    public void setRH(String rh){
        this.RH = rh;
    }

    public type getType(){
        return Type;
    }
    public String getRH(){
        return RH;
    }
    public String toString(){
        return RH + Type.toString();
    }
}
