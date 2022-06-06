//=============================
//FILAS ENCADEADAS
//=============================

// FIFO = First In First Out
// Estilo uma fila de banco ou uma fila de restaurante

//     -NO (dado e ponteiro para proximo)
//     -init (os ponteiros INI e FIM devem receber null)
//     -isEmpty (verifica se a fila esta cheia)
//     -enqueue (inserir na fila)
//     -dequeue (retira o primeiro da fila)
//     -first (le o inicio da fila)

//definição no de fila
public class filas_encadeadas{
    public static class NO{
        public int dado;
        public NO prox;
    }

    private static NO ini;
    private static NO fim;

    public static class Retorno{
        public int item;
        public boolean ok;
    }

    public void INIT(){
        ini = null;
        fim = null;
    }

    public boolean isEmpty(){
        return (ini==null && fim==null);
    }

    public void ENQUEUE(int item){
        NO novo = new NO();
        novo.dado = item;
        novo.prox = null;

        if(isEmpty())
            ini = novo;
        else 
            fim.prox = novo;
        fim = novo;
    }

    public Retorno DENQUEUE(){
        Retorno saida = new Retorno();
        if(!isEmpty()){
            saida.item = ini.dado;
            ini = ini.prox;
            if (ini == null)
            fim = null;
            saida.ok = true;
        }
        else{
            saida.ok = false;
        }
        return saida;
    }
}