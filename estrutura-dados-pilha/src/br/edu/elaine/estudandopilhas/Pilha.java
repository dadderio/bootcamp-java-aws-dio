package br.edu.elaine.estudandopilhas;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPopped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPopped;
        }
        return null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }



    public boolean isEmpty(){
       /*if(refNoEntradaPilha == null){
           return true;
       }
       return false;*/
       return refNoEntradaPilha == null ? true: false;
    }

    @Override
    public String toString(){
        String stringRetorno =  "-------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno +=  "-------------------\n";

        No noAuxiliar  = refNoEntradaPilha;

        while(true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No {dados = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
            stringRetorno +=  "-------------------";
            return stringRetorno;

    }
}
