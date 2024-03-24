package lab200.problem;

public class Problem {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cop copI = new CopInheritance();
    }

}



class Cop {
    public int gun;
    public int getGun(){
        return gun;
    }
    private void fire(){
        System.out.println("shoot!");
    }
}
