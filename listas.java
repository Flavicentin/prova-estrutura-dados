public class listas{

    public static class NO{
        private int dado;
        private NO prox;
    }
    public void inserir(int elem){
        NO novo = new NO();
        novo.dado = elem;
        if (lista == null){
            novo.prox = null;
            lista = novo;
        } 
        if else (novo.dado < lista.dado){
                novo.prox = lista;
                lista = novo;
        } else {
            aux = lista; 
            achou = false;
            while (aux.prox != null && achou == false){
                if (aux.prox.dado < novo.dado){
                    aux = aux.prox;
                } else {
                    achou = true;
                }
                novo.prox = aux.prox;
                aux.prox = novo;
            }
        }
    }
}