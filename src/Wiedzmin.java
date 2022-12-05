public class Wiedzmin {
    private String name;
    private String rank;
    private int strength_points;
    private int many_points;
    private boolean type;

    public Wiedzmin(String name, String rank, int strength_points, int many_points, boolean type) {
        this.name = name;
        this.rank = rank;
        this.strength_points = strength_points;
        this.many_points = many_points;
        this.type = type;

    }
    public Wiedzmin (String name, String rank, boolean type){
        this.name= name;
        this.rank= rank;
        this.type= type;



    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getStrength_points() {
        return strength_points;
    }

    public int getMany_points() {
        return many_points;
    }

    public boolean gettype() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setStrength_points(int strength_points) {
        this.strength_points = strength_points;
    }

    public void setMany_points(int many_points) {
        this.many_points = many_points;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int power (){
        return (strength_points*many_points)/2;
    }
}
