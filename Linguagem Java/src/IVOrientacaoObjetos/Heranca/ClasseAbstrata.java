package IVOrientacaoObjetos.Heranca;

/**
 * A classe abstrata define alguns comportamentos que as classes que herdam devem ter.
 * Uma classe abstrata não pode ser instanciada, é usada para moldar classes que herdam seu comportamento.
 * Uma classe abstrata deve ter no mínimo um método abstrato. Assim, podem existir métodos já implementados.
 */
public abstract class ClasseAbstrata {

    // Comportamento obrigatório nas classes filhas
    abstract void ligar();

    // Comportamento definido em uma classe abstrata
    private void desligar() {
        System.out.println("Até mais!");
    }
}
