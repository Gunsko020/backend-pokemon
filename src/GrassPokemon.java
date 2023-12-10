public class GrassPokemon extends PokemonSuper {

    private int defence ;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence){
        this.defence = defence;

    }

    private int attack;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public GrassPokemon(String name, int level, int hp, int xp, String sort, int defence, int attack) {
        super(name, level, hp, xp, sort);
        this.defence = defence;
        this.attack = attack;
    }

    public void leafStorm() {
        System.out.println("Pokemon is leafstorming");
    }

    public void leaveBlade(){
        System.out.println("Pokemon is leaveblading");
    }


    @Override
    public void accelaration (int level){
        System.out.println("Pokemon is accelerating at "+getLevel());

    }

}
