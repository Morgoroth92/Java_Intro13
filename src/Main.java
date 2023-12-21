
public class Main {
    public static void main(String[] args) {

        compreso(1,5,3);
    }
    public static void compreso(int minimo, int massimo, int valore) {
        boolean result = (valore > minimo) && (valore < massimo);
        System.out.println("Il valore " + valore + " è compreso tra " + minimo + " e " + massimo + "? " + result);
    }
}