public class pilha{

    //definição de nó
    private static class NO{
        public int dado;
        public NO prox;
    }

    //definição do retonorno nos metodos POP e TOP
    private static class Retorno{
        public int item;
        public boolean ok;
    }

    //definição no ponteiro topo da pilha
    private static NO topo;

    public void INIT(){
        topo = null;
    }

    public boolean isEmpty(){
        return topo == null;
    }

    public void PUSH(int item){
        if (isEmpty){
            NO node = new N0();
            node.dado = item;
            node.prox = topo;
            topo = node;
        }
    }

    public Retorna POP(){
        Retorna retorna = new Retorna();
        if(!isEmpty()){
            retorna.item = topo.dado;
            topo = topo.prox;
            retorno.ok = true;
        }
        else {
            retorno.ok = false;
        }

        return retorno;
    }





}