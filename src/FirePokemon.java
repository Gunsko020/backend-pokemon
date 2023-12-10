public class FirePokemon extends PokemonSuper {

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

    public FirePokemon(String name, int level, int hp, int xp, String sort, int defence, int attack) {
        super(name, level, hp, xp, sort);
        this.defence = defence;
        this.attack = attack;
    }

    public void flameThrower() {
        System.out.println("Pokemon is flamethrowering");
    }

    public void fireLash(){
        System.out.println("Pokemon is firelashing");
    }


    @Override
    public void accelaration (int level){
        System.out.println("Pokemon is accelerating at "+getLevel());

    }

}
