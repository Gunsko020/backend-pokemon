public abstract class PokemonSuper {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    int hp;
    int xp;

    String sort;

    public PokemonSuper (String name, int level, int hp , int xp, String sort){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.sort = sort;

    }

   public void eats(){
       System.out.println("Pokemon is eating");
   }

   public void sleeps(){
       System.out.println("Pokemon is sleeping");
   }

   public abstract void accelaration (int level);

}