package Lesson4;

public class Climber {

    private String fillName;
    private int age;
    private String email;

    public String getFillName() {
        return fillName;
    }

    public void setFillName(String fillName) {
        if (fillName.isEmpty() || fillName.trim().length()<3){throw new IllegalArgumentException("Значение <1");}

        this.fillName = fillName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<18){
            throw new IllegalArgumentException("Значение <18");
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.trim().contains("@")){
            throw new IllegalArgumentException("Это не email");
        }
        this.email = email;
    }



}
