import com.sun.source.tree.DoWhileLoopTree;

public class Main {
    public static void main(String[] args) {
        var numeroWhile = 2;
        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);
    }
}