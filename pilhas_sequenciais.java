//=============================
//PILHAS SEQUENCIAIS
//=============================

// LIFO -> Last In First Out 
// Estilo uma pilha de livros ou uma garagem

// Operações Basicas:
//     -push (empurra elementos para a pilha, aumenta o tamanho da pilha)
//     -pop (retira do topo da pilha, diminui o tamanho da pilha)
//     -top (le o elemento do topo)

// Operações Auxiliares:
//     -inti (inicia pilha)
//     -isEmpty (verifica se a pilha esta vazia)
//     -isFull (verifica se a pilha esta cheia)

public class pilhas_sequenciais{
    public final int NUMERO_MAXIMO_ELEMENTO_PILHA = 6;
    int topo;
    int dados[] = new int[NUMERO_MAXIMO_ELEMENTO_PILHA];

    public void push(int elem){
        dados[topo] = elem;
        topo++;
    }

    public int pop(){
        topo--;
        return dados[topo];
    }

    public int top(){
        return dados[topo - 1];
    }
    
}
