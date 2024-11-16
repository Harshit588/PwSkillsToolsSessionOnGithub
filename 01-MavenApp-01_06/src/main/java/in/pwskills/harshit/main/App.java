package in.pwskills.harshit.main;

class Airthmetic {
    public int sum(int x, int y) {
        return x + y;
    }
}

public class App {
    public static void main(String[] args) {
        Airthmetic a = new Airthmetic();
        System.out.println("THE SUM IS :: " + a.sum(10, 20));

    }
}
