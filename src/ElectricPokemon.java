public class ElectricPokemon extends PokemonSuper {

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

    public ElectricPokemon(String name, int level, int hp, int xp, String sort, int defence, int attack) {
        super(name, level, hp, xp, sort);
        this.defence = defence;
        this.attack = attack;
    }

    public void electroBall() {
        System.out.println("Pokemon is throwing an electroBall");
    }

    public void thunderPunch(){
        System.out.println("Pokemon is thunderpunching");
    }


    @Override
    public void accelaration (int level){
        System.out.println("Pokemon is accelerating at "+getLevel());

    }

}
