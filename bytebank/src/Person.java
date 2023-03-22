public class Person {

    private String name;
    private int age;
    private String cpf;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void personData(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Cpf: " + this.getCpf());
    }

}
