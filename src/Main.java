import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        Map<String,String> forme = new HashMap<>();
        forme.put("Q","quadrato");
        forme.put("C","cerchio");
        forme.put("T","triangolo");

        System.out.println("La mappa Forme:" + forme);

        Map<String, String> stagioni = Map.of("IN","inverno","AT","autunno","ES","estate","PM","primavera");

        System.out.println("La mappa Stagioni:" + stagioni);

        Map<String,String> giorni = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("LU","lunedì"),
                new AbstractMap.SimpleEntry<>("MA","martedì"),
                new AbstractMap.SimpleEntry<>("ME","mercoledì"),
                new AbstractMap.SimpleEntry<>("GIO","giovedì"),
                new AbstractMap.SimpleEntry<>("VE","venerdì"),
                new AbstractMap.SimpleEntry<>("SA","sabato"),
                new AbstractMap.SimpleEntry<>("DO","domenica")
        );

        System.out.println("La mappa Giorni:" + giorni);

    }
}
