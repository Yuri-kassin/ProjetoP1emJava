import java.util.ArrayList;

public class Print {
    //declarando as ArrayList Para cada tipo de Veiculo
    private ArrayList<Carro> Car = new ArrayList<>();
    private ArrayList<Moto> Mot = new ArrayList<>();
    private ArrayList<Bussao> Bus = new ArrayList<>();

//    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    public Print(){
        int x = 0;
        CMapa map;//instanciando o obj map da classe CMapa
        Mover mov;//instanciando o bj mov da classe Mover

        int[][] MAPA = map.getMapa();

        for( int i; i<10; i++){ //add os primeiros 30 veiculos, sendo 10 de cada tipo
            Car.add(new Carro(mov.getRandomX(),mov.getRandomY()));//add 10 carros
            Mot.add(new Moto(mov.getRandomX(),mov.getRandomY()));//add 10 motos
            Bus.add(new Bussao(mov.getRandomX(),mov.getRandomY()));//add 10 busao
        }

        while(x == 0){
            for( int i=0; i< map.getTamanho_y(); i++){
                for( int j=0; j<map.getTamanho_x(); j++){


                }
        }

    }
    }



}
