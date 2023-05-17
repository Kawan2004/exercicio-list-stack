import fleet.Delivery;
import fleet.Fleet;

public class MyApp {

    public static void main(String[] args) {
        
        Fleet fleet = new Fleet();

        fleet.newTruck(Delivery.OUTRO);
        fleet.newTruck(Delivery.OUTRO);
        fleet.newTruck(Delivery.PERECIVEL);
        fleet.newTruck(Delivery.OUTRO);
        fleet.newTruck(Delivery.PERECIVEL);
        fleet.newTruck(Delivery.OUTRO);
        fleet.newTruck(Delivery.PERECIVEL);
        fleet.newTruck(Delivery.OUTRO);

        fleet.displayOrder();


        

    }
}

/*  
    Logica do codigo: 
    
    como a questão tinha o objetivo de ser interpretada de forma individual, criei uma class pilha (Stack)
    com apenas os metodos mais comuns (push, pop, peek, empty), logo em seguida criei uma classe Fleet (Frota),
    que tem como objetivo guardar todos os caminhoes, a estrutura dessas classes, foram baseadas em uma lista,
    logo uma frota tem seus caminhoes, que apontam para outros caminhoes, e cada caminhao recebe um valor que representa o seu tipo de carga,
    que é representado por um enum, que tem como objetivo limitar os tipos possiveis de cargas.
    Logo em seguida criei um metodo(displayOrder) na classe fleet para representar
    como os caminhoes estao organizados, para representar a ordem de saida, onde caminhoes que carregam alimentos pere-
    civeis, tem prioridades;


*/