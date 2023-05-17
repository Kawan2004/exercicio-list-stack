import stack.Stack;

public class MyApp {

    public static void main (String [] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        System.out.print(stack.peek());

    }


    /*
     *  Como a proposta da questão era criar algo que desfaça as açoes, então criei uma pilha, onde é possivel desfazer
     *  as açoes, seguindo o padrão "first in, last out", retirando sempre a ultima ação realizada, porem é possivel desfa-
     *  zer até 16 açoes com o pop(), o metodo contem um laço de repitição, que chama o metodo pop. 
     *  (O paramentro do pop é opcional, ja que foi usado o polimorfismo por sobrecarga, rescrevendo 
     *  o metodo 2x, uma sem parametro e outra recebendo um parametro inteiro)
     * 
     * 
     * 
    */
    
    
}
