package exercicio73;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Pessoa> filaNormal;
    private Queue<Pessoa> filaPrioridade;

    public Fila() {
        filaNormal = new LinkedList<>();
        filaPrioridade = new LinkedList<>();
    }

    public void adicionar(String nome, String tipoDeSenhaN_P) {
        Pessoa p = new Pessoa(nome, tipoDeSenhaN_P, Senha.setSenha());
        if (tipoDeSenhaN_P.charAt(0) == 'N') {
            this.filaNormal.add(p);
        } else {
            this.filaPrioridade.add(p);
        }
    }

    public String listarTudo() {
        String linha="Atendimento Normal: ";
        for (Pessoa pessoa : filaNormal) {
            linha += pessoa.getNome() + "["+pessoa.getSenha() + "] - ";
        }
        linha +="\nAtendimento Prioritário: ";
        for (Pessoa pessoa : filaPrioridade) {
            linha += pessoa.getNome() + "["+pessoa.getSenha() + "] - ";
        }
        linha +="\n";
        return linha;
    }

}
