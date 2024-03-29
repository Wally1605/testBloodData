public class Patient {
    int ID;
    int age;
    bloodData data;

    Patient(){
        this.ID = 0;
        this.age = 0;
        this.data = new bloodData();
    }
    Patient(int ID, int age, bloodData b){
        this.ID = ID;
        this.age = age;
        this.data = b;

    }

    public int getID(){
        return ID;
    }
    public int getAge(){
        return age;
    }
    public bloodData getData(){
        return data;
    }

    public String toString(){
        return "Patient "+ID+": \n"+age+" years old, \n"+data.toString()+" blood type.";
    }
}
