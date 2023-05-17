import stack.Stack;
import note.Note;

public class Main {
    
    public static void main(String[] args) {
        Note [] aluno = new Note[10];
        aluno[0] = new Note("Goku", 5, 10);
        aluno[1] = new Note("Ze", 4, 7);
        aluno[2] = new Note("Kawan", 7, 8);

        Stack stack = new Stack();
        stack.push(aluno[0]);
        stack.push(aluno[1]);
        stack.push(aluno[2]);

        stack.displayStack();
    }
}

/*
 *  Como a questão pedia para criar um programa que armazenasse notas em ordem cronologica, logo em seguida exibisse na ordem inversa seguindo
 *  a logica de pilhas, entao criei uma pilha, com os metodos push, pop, peek e displayStack(Funciona para exibir toda a pilha) e uma classe 
 *  Note, com os atributos, name, firstNote e secondNote, ao criar o objeto Note, implementa-se ele na pilha Stack usando o metodo push, logo
 *  em seguida exibe todos os elementos com o metodo displayStack com ordem inversa a adicionada.
 */ 
