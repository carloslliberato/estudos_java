package generics.teste;

import java.util.ArrayList;
import java.util.List;

// ==========================================
// 1. HIERARQUIA DE CLASSES (MUNDO DE NARUTO)
// ==========================================

class SerVivo {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Pessoa extends SerVivo {}

class Ninja extends Pessoa {}

class SenhorFeudal extends Pessoa {}

// ==========================================
// 2. CLASSE PRINCIPAL COM A MAIN
// ==========================================

public class Teste {

    public static void main(String[] args) {
        
        System.out.println("=== 1. DEMO: ? super Pessoa ===");
        // Aceita List<Pessoa>, List<SerVivo> ou List<Object>
        List<Pessoa> listaDePessoas = new ArrayList<>();
        
        // Podemos adicionar TANTO Ninja QUANTO SenhorFeudal!
        adicionarHabitantes(listaDePessoas);
        System.out.println("Conteúdo da lista de pessoas: " + listaDePessoas);


        System.out.println("\n=== 2. DEMO: ? super Ninja ===");
        // Aceita List<Ninja>, List<Pessoa>, List<SerVivo> ou List<Object>
        List<SerVivo> listaDeSeresVivos = new ArrayList<>();
        
        // Adiciona apenas Ninjas (e o SenhorFeudal fica de fora)
        adicionarApenasNinjas(listaDeSeresVivos);
        System.out.println("Conteúdo da lista de seres vivos: " + listaDeSeresVivos);


        System.out.println("\n=== 3. DEMO: ? extends Pessoa (Leitura) ===");
        List<Ninja> timeKakashi = new ArrayList<>();
        timeKakashi.add(new Ninja());
        timeKakashi.add(new Ninja());

        // Passamos uma List<Ninja> para um método que lê ? extends Pessoa
        imprimirPessoas(timeKakashi);
    }

    // ==========================================
    // 3. MÉTODOS COM GENERICS
    // ==========================================

    /**
     * Usa ? super Pessoa:
     * Pode ADICIONAR Ninja e SenhorFeudal, pois ambos "SÃO Pessoa".
     */
    public static void adicionarHabitantes(List<? super Pessoa> lista) {
        lista.add(new Ninja());        // ✅ VÁLIDO! Todo Ninja é Pessoa.
        lista.add(new SenhorFeudal()); // ✅ VÁLIDO! Todo Senhor Feudal é Pessoa.
    }

    /**
     * Usa ? super Ninja:
     * Pode ADICIONAR apenas Ninjas.
     */
    public static void adicionarApenasNinjas(List<? super Ninja> lista) {
        lista.add(new Ninja()); // ✅ VÁLIDO!
        
        // lista.add(new SenhorFeudal()); // ❌ ERRO DE COMPILAÇÃO!
        // Descomentar a linha acima dará erro pois SenhorFeudal NÃO é um Ninja.
    }

    /**
     * Usa ? extends Pessoa:
     * Foco na LEITURA. Garante que qualquer item sorteado é pelo menos Pessoa.
     */
    public static void imprimirPessoas(List<? extends Pessoa> lista) {
        for (Pessoa p : lista) { // ✅ LEITURA SEGURA: Todo item herda de Pessoa
            System.out.println("Processando cidadão: " + p);
        }
        
        // lista.add(new Ninja()); // ❌ ERRO DE COMPILAÇÃO! 
        // O Java proíbe adições em "? extends" para proteger a integridade da lista.
    }
}