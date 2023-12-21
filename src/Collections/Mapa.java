package Collections;
import java.util.HashMap;
import java.util.Map;
public class Mapa {
    public static void main(String args[]) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); // adiciona caso não existir e substitui se já existir - metodo put.
        usuarios.put(1, "Ricardo");
        usuarios.put(2, "Jubileu");
        usuarios.put(3, "Jubiraca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Jubiraca"));
        System.out.println(usuarios.get(3));

        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Gui"));

        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

        System.out.println(usuarios);
    }
}
