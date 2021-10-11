package entities;

public class Singer extends PublicPerson implements Singing {
    protected int songs; //that singer knows
    protected int russianSingingAwards;
    protected int worldSingingRewards;

    public Singer(String name, int age, int experienceTime, String stageName, boolean group, int perfomanceAmount,
                  int songs, int russianSingingAwards, int worldSingingRewards) {
        super(name, age, experienceTime, stageName, group, perfomanceAmount);
        this.songs = songs;
        this.russianSingingAwards = russianSingingAwards;
        this.worldSingingRewards = worldSingingRewards;
    }

    public Singer(String name, int age, int experienceTime, String stageName, boolean group, int perfomanceAmount,
                  int songs) {
        super(name, age, experienceTime, stageName, group, perfomanceAmount);
        this.songs = songs;
        this.russianSingingAwards = 0;
        this.worldSingingRewards = 0;
    }

    @Override
    public String singOneSong(){
        return "Singer sing one song";
    }

    @Override
    public String singSongs(int songNum){
        return "Singer sing songs";
    }

    @Override
    public void toCreateSomethingNew(){
        //creating songs
    }

    @Override
    public void doHobby(){
        //singer do his hobby
    }

    public int getSongs() {
        return songs;
    }

    public void setSongs(int songs) {
        this.songs = songs;
    }

    public int getRussianSingingAwards() {
        return russianSingingAwards;
    }

    public void setRussianSingingAwards(int russianSingingAwards) {
        this.russianSingingAwards = russianSingingAwards;
    }

    public int getWorldSingingRewards() {
        return worldSingingRewards;
    }

    public void setWorldSingingRewards(int worldSingingRewards) {
        this.worldSingingRewards = worldSingingRewards;
    }
}
