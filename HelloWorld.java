import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Bruno", 10);
        notas.get("Bruno"); // retorna 10

        //iterando

        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            // tenho acesso a cada um dos itens do HashMap
            String key = entry.getKey();
            Integer value = entry.getValue();
        }

        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.remove(10);

        for(Integer elemento : numeros) {

        }
        numeros.contains(10); // retorna boleano se existe ou não o item
    }
}