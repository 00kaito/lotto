public class Monk extends Monster {
    Monk(){
        this.setName("Monk");
        this.setAttack(20);
        this.setHealth(10);
        System.out.println(this.getName()+" Created");
    }
    Monk(int player){
        this.setName("Monk");
        this.setAttack(20);
        this.setHealth(10);
        this.setPlayer(player);
        System.out.println(this.getName()+" Created");
    }
}
