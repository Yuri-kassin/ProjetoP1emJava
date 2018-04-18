import java.util.ArrayList;
import java.util.Random;

class Mover{ // classe que vai gerar os numeros atelatorios para os veiculos
    private Random random = new Random();
//   estes dois primeiros servira para colocar aleatoriamente os 10 veiculos de cada tipo e para criar a pocissão dos veculos q forem criados na fabrica
    public int getRandomX(){
        return random.nextInt(31);
    }
    public int getRandomY(){
        return random.nextInt(61);
    }
    //estas duas funções sao usadas para mover os veiculos ja existentes no mapa
    public int getX(){
        return random.nextInt(5);
    }

    public void getY(){
        return random.nextInt(5);
    }

    public int
}



