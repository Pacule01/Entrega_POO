package numero_2_entrega;

import java.util.List;
import java.util.ArrayList;

public class Numero_2_Entrega {

    public static void main(String[] args) {
        /*List<Mamifero> listaM = new ArrayList<Mamifero>();
        List<Peixe> listaP = new ArrayList<Peixe>();
        
        listaM.add(new Mamifero("Morcego", 2, "Preto"));
        listaM.add(new Mamifero("Macaco", 2, "Vermelho"));
        
        listaP.add(new Peixe("Peixe Vermelho", "Calmo"));
        
        System.out.println("LISTA DOS MAMIFEROS\n-------------");
        for(Mamifero m : listaM) {
            System.out.println(m);
            System.out.println("---------------");
        }
        System.out.println("\nLISTA DOS PEIXES\n-------------");
        for (Peixe p : listaP) {
            System.out.println(p);
        }
        
        //Ficheiros
        //Gravacao
        Tarefa.gravarObjecto(listaM, "Mamifero.dat");
        Tarefa.gravarObjecto(listaP, "Peixe.dat");*/
        
        
        //Leitura
        System.out.println("LISTA DOS MAMIFEROS\n-------------");
        List<Mamifero> obj = (List<Mamifero>) Tarefa.recuperarObjecto("Mamifero.dat");
        for (Mamifero m : obj) {
            System.out.println(m);
            System.out.println("---------------");
        }
        
        System.out.println("\nLISTA DOS PEIXES\n-------------");
        List<Peixe> objP = (List<Peixe>) Tarefa.recuperarObjecto("Peixe.dat");
        for (Peixe p : objP) {
            System.out.println(p);
            System.out.println("-----------------");
        }
    }
    
}
