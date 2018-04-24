/**
 * Classe que oferece numeros aleatorios para mover os veiculos e possiciona-los na classe Magic
 * @author YuriKassin
 */

import java.util.Random;

public class Mover { // classe que vai gerar os numeros atelatorios para os veiculos
    private Random random = new Random();

    //   estes dois primeiros servira para colocar aleatoriamente os 10 veiculos de cada tipo e para criar a pocissão dos veculos q forem criados na fabrica
    public int getRandomX() {
        return random.nextInt(31);
    }

    public int getRandomY() {
        return random.nextInt(61);
    }

    //estas duas funções sao usadas para mover os veiculos ja existentes no mapa
    public int getNumber() {
        return random.nextInt(4)+1;
    }


}
