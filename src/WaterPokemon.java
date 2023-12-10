public class WaterPokemon extends PokemonSuper {

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

    public WaterPokemon(String name, int level, int hp, int xp, String sort, int defence, int attack) {
        super(name, level, hp, xp, sort);
        this.defence = defence;
        this.attack = attack;
    }

    public void surf() {
        System.out.println("Pokemon is surfing");
    }

    public void gust(){
        System.out.println("Pokemon is gusting");
    }


    @Override
    public void accelaration (int level){
        System.out.println("Pokemon is accelerating at "+getLevel());

    }

}
