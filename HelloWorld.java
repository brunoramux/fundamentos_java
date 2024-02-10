import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String args[]) {
        int teste = 10;

        if (teste == 11){
            System.out.println(teste);
        } else {
            System.out.println("Falhou");
        }

        List<String> nomes  = new ArrayList<>();
        nomes.add("Bruno");
        nomes.add("Thamires");

        System.out.println(nomes);
        System.out.println(nomes.get(0));
        
        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.forEach(nome -> System.out.println(nome));

    }
}