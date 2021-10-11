package entities;

public abstract class CreativePerson {
    protected String name;
    protected int age;
    protected int experienceTime; //time in hobby or job

    public abstract void toCreateSomethingNew();
    public void doHobby(){
        //creative person do his hobby
    }

    public CreativePerson(String name, int age) {
        this.name = name;
        this.age = age;
        this.experienceTime = 0;
    }

    public CreativePerson(String name, int age, int experienceTime) {
        this.name = name;
        this.age = age;
        this.experienceTime = experienceTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperienceTime() {
        return experienceTime;
    }

    public void setExperienceTime(int experienceTime) {
        this.experienceTime = experienceTime;
    }
}
