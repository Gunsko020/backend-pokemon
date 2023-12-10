public class Main {
    public static void main(String[] args) {

        FirePokemon charmander = new FirePokemon("Charmander",99,80,32,"fire",80,89);

        charmander.sleeps();
        charmander.flameThrower();
        charmander.fireLash();
        charmander.accelaration(99);
        System.out.println(" ");

        WaterPokemon squirtle = new WaterPokemon("Squirtle",79,67,34,"water",89,45);

        squirtle.eats();
        squirtle.gust();
        squirtle.surf();
        squirtle.accelaration(79);
        System.out.println(" ");

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu",112,12,109,"electric",90,134);

        pikachu.sleeps();
        pikachu.electroBall();
        pikachu.thunderPunch();
        pikachu.accelaration(112);
        System.out.println(" ");

        GrassPokemon balbasar = new GrassPokemon("Balbasar",200,56,189,"grass",160,180);

        balbasar.sleeps();
        balbasar.leafStorm();
        balbasar.leafStorm();
        balbasar.accelaration(200);

    }
}