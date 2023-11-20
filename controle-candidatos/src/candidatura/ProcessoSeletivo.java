package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContado(candidato);
        }
    }
    static void entrandoEmContado(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }while (continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato + " NA "+ (tentativasRealizadas+1) + " TENTATIVA");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato+", NÚMERO MÁXIMO TENTATIVAS "+ tentativasRealizadas + " TENTATIVA");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
        /*
new Random().nextInt(3) gera um número aleatório entre 0 (inclusivo) e 3 (exclusivo). Ou seja, pode gerar 0, 1 ou 2.
A expressão new Random().nextInt(3) == 1 verifica se o número aleatório gerado é igual a 1.
Então, esse método atender() retornará true apenas quando o número aleatório gerado for igual a 1 e false nos outros casos (quando o número gerado for 0 ou 2).
*/
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprime o candidato informando o índice");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato nº "+ (indice+1) + " é o "+ candidatos[indice]);
        }

        System.out.println("Imprime o candidato informando SEM o índice");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }

    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO","MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase = 2000.0;
        //se a condição do while não limitar colocando 'candidatoAtual < candidatos.length', enquanto não houver candidatoSelecionado, o while continua fazendo loop e aumentando
        //candidatoAtual e assim extrapolando a quantidade de elementos o array candidatos
        while(candidatosSelecionados <5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " solicitou este valor de salario " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
