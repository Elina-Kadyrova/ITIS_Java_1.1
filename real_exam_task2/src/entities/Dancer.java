package entities;

public class Dancer extends PublicPerson implements Dancing{
    protected int dances; //that dancer knows
    protected int russianDancingAwards;
    protected int worldDancingRewards;

    @Override
    public String danceOneDance(){
        return "Dancer dancing one dance";
    }

    @Override
    public String danceSomeDances(int danceNum){
        return "Dancer dancing some dances";
    }

    @Override
    public void toCreateSomethingNew(){
        //creating dances
    }

    @Override
    public void doHobby(){
        //dancer do his hobby
    }

    public Dancer(String name, int age, int experienceTime, String stageName, boolean group, int perfomanceAmount,
                  int dances, int russianDancingAwards, int worldDancingRewards) {
        super(name, age, experienceTime, stageName, group, perfomanceAmount);
        this.dances = dances;
        this.russianDancingAwards = russianDancingAwards;
        this.worldDancingRewards = worldDancingRewards;
    }

    public Dancer(String name, int age, int experienceTime, String stageName, boolean group, int perfomanceAmount,
                  int dances) {
        super(name, age, experienceTime, stageName, group, perfomanceAmount);
        this.dances = dances;
        this.worldDancingRewards = 0;
        this.russianDancingAwards = 0;
    }

    public int getDances() {
        return dances;
    }

    public void setDances(int dances) {
        this.dances = dances;
    }

    public int getRussianDancingAwards() {
        return russianDancingAwards;
    }

    public void setRussianDancingAwards(int russianDancingAwards) {
        this.russianDancingAwards = russianDancingAwards;
    }

    public int getWorldDancingRewards() {
        return worldDancingRewards;
    }

    public void setWorldDancingRewards(int worldDancingRewards) {
        this.worldDancingRewards = worldDancingRewards;
    }
}
