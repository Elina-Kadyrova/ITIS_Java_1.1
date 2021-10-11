package entities;

public class PublicPerson extends CreativePerson {
    protected String stageName;
    protected int perfomanceAmount;
    protected boolean group; // false - no group

    @Override
    public void toCreateSomethingNew(){
        //creating...
    }

    public void toPerfomance(){
        //go to stage and perfomance
    }

    public PublicPerson(String name, int age, int experienceTime, String stageName, boolean group, int perfomanceAmount) {
        super(name, age, experienceTime);
        this.group = group;
        this.stageName = stageName;
        this.perfomanceAmount = 0;
    }

    public PublicPerson(String name, int age, int experienceTime, String stageName, boolean group) {
        super(name, age, experienceTime);
        this.stageName = stageName;
        this.group = group;
    }

    public PublicPerson(String name, int age, int experienceTime, int perfomanceAmount) {
        super(name, age, experienceTime);
        this.perfomanceAmount = perfomanceAmount;
    }

    public int getPerfomanceAmount() {
        return perfomanceAmount;
    }

    public void setPerfomanceAmount(int perfomanceAmount) {
        this.perfomanceAmount = perfomanceAmount;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }
}
