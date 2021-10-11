package entities;

public class Artist extends PublicPerson implements SingingDancing {
    protected int perfomances; //that artist knows
    protected int russianArtistAwards;
    protected int worldArtistRewards;

    @Override
    public String singOneSong(){
        return "Artist sing one song";
    }

    @Override
    public String singSongs(int songNum){
        return "Artist sing songs";
    }

    @Override
    public String danceOneDance(){
        return "Artist dancing one dance";
    }

    @Override
    public String danceSomeDances(int danceNum){
        return "Artist dancing some dances";
    }

    public String doArtistActions(){
        return "Artist do artist actions";
    }

    @Override
    public void toCreateSomethingNew(){
        //creating perfomances
    }

    public Artist(String name, int age, int experienceTime, String stageName, boolean group, int perfomanceAmount,
                  int perfomances, int russianArtistAwards, int worldArtistRewards) {
        super(name, age, experienceTime, stageName, group, perfomanceAmount);
        this.perfomances = perfomances;
        this.russianArtistAwards = russianArtistAwards;
        this.worldArtistRewards = worldArtistRewards;
    }

    public Artist(String name, int age, int experienceTime, String stageName, boolean group, int perfomanceAmount,
                  int perfomances) {
        super(name, age, experienceTime, stageName, group, perfomanceAmount);
        this.perfomances = perfomances;
        this.russianArtistAwards = 0;
        this.worldArtistRewards = 0;
    }

    public int getPerfomances() {
        return perfomances;
    }

    public void setPerfomances(int perfomances) {
        this.perfomances = perfomances;
    }

    public int getRussianArtistAwards() {
        return russianArtistAwards;
    }

    public void setRussianArtistAwards(int russianArtistAwards) {
        this.russianArtistAwards = russianArtistAwards;
    }

    public int getWorldArtistRewards() {
        return worldArtistRewards;
    }

    public void setWorldArtistRewards(int worldArtistRewards) {
        this.worldArtistRewards = worldArtistRewards;
    }
}
