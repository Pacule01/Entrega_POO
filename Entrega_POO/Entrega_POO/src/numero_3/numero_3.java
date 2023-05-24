package numero_3;

import java.util.List;
import java.util.ArrayList;

public class numero_3 {

    public static void main(String[] args) {
        /*List<Cachorro> listaCachorro = new ArrayList<Cachorro>();
        List<Homem> listaHomem = new ArrayList<Homem>();
        List<Beija_Flor> listaBeijaFlor = new ArrayList<Beija_Flor>();
        
        listaCachorro.add(new Cachorro("Billy", "Castanho", 'F', "Doberman"));
        listaCachorro.add(new Cachorro("Bacon", "Branco e preto", 'F', "Rotwailer"));
        listaCachorro.add(new Cachorro("Bolt", "Preto", 'M', "Labrador"));
        
        listaHomem.add(new Homem("Manuel Arnaldo", "Castanho Claro", 'M', "Estudante"));
        listaHomem.add(new Homem("Labron James", "Castanho Claro", 'M', "Jogador de Basket"));
        
        listaBeijaFlor.add(new Beija_Flor("Viotear", "Verde", 'F', "Rosa"));
        
        System.out.println("LISTA DOS CACHORROS");
        for (Cachorro cr : listaCachorro) {
            System.out.println(cr);
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------\nLISTA DOS HOMENS");
        for(int i = 0; i < listaHomem.size(); i++) {
            System.out.println(listaHomem.get(i));
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------\nLISTA DE BEIJA - FLORES");
        for(Beija_Flor bf : listaBeijaFlor) {
            System.out.println(bf);
        }
        
        Tarefa.gravarObjecto(listaCachorro, "Cachorro.dat");
        Tarefa.gravarObjecto(listaHomem, "Homem.dat");
        Tarefa.gravarObjecto(listaBeijaFlor, "Beija_Flor.dat");*/
        
        List<Cachorro> objC = (List<Cachorro>) Tarefa.recuperarObjecto("Cachorro.dat");
        List<Homem> objH = (List<Homem>) Tarefa.recuperarObjecto("Homem.dat");
        List<Beija_Flor> objBf = (List<Beija_Flor>) Tarefa.recuperarObjecto("Beija_Flor.dat");
        
        System.out.println("LISTA DOS CACHORROS");
        for (Cachorro cr : objC) {
            System.out.println(cr);
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------\nLISTA DOS HOMENS");
        for(int i = 0; i < objH.size(); i++) {
            System.out.println(objH.get(i));
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------\nLISTA DE BEIJA - FLORES");
        for(Beija_Flor bf : objBf) {
            System.out.println(bf);
        }
    }
    
}
