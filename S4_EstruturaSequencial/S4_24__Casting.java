package S4_EstruturaSequencial;

public class S4_24__Casting {
    
    public static void main(String[] args) {
        
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);

        int a;
        double b;
        a = 5;
        b = 2 * a;
        System.out.println("\n" + a);
        System.out.println(b);

        double c, d, e, area;
        c = 6.0;
        d = 8.0;
        e = 5.0;
        area = ((c + d) / 2) * e;
        System.out.println("\n" + area);

        // sem o casting "(double)" o resultado dessa expressão seria também 2 n inteiros
        int f, g;
        double resultado;
        f = 5;
        g = 2;
        resultado = (double) f / g;
        System.out.println("\n" + resultado);

        // para passar uma variavel double para int, sem importar com a perda de informacao das casas decimais,
        // é necessario usar o cast para que o programa funcione
        double h;
        int i;
        h = 5.0;
        i = (int) h;
        System.out.println("\n" + i);

    }
}
