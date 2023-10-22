public class App {
    public static void main(String[] args) throws Exception {
      
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy";
        celularB.tamanhoTela = 7.1f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO de %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
         System.out.format("Celular %s com tela de %.1f, com %dgb e SO de %s", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
    }
}
