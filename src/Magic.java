import java.util.ArrayList;

public class Magic {
    private ArrayList<Carro> Car = new ArrayList<>();
    private ArrayList<Moto> Mot = new ArrayList<>();
    private ArrayList<Bussao> Bus = new ArrayList<>();
    private CMapa map = new CMapa();//instanciando o obj map da classe CMapa
    private Mover mov = new Mover();//instanciando o bj mov da classe Mover
    private int[][] MAPA = new int[1][];

    public Magic(){
        MAPA = map.getMapa();
        for( int i=0; i<10; i++){ //add os primeiros 30 veiculos, sendo 10 de cada tipo
            Car.add(new Carro(mov.getRandomX(),mov.getRandomY()));//add 10 carros
            Mot.add(new Moto(mov.getRandomX(),mov.getRandomY()));//add 10 motos
            Bus.add(new Bussao(mov.getRandomX(),mov.getRandomY()));//add 10 busao
        }
    }
    public void possicao(){
        for(int i=0; i<map.getTamanho_x(); i++){
            for(int j=0; j<map.getTamanho_y(); j++){
                if(Car.size() != 0) {
                    for (int k = 0; k < Car.size(); k++) {
                        if (Car.get(k).getX() == i && Car.get(k).getY() ==j ) MAPA[i][j]=3;
                    }
                }
                if(Mot.size() != 0) {
                    for (int k = 0; k < Mot.size(); k++) {
                        if (Mot.get(k).getX() == i && Mot.get(k).getY() ==j ) MAPA[i][j]=4;
                    }
                }
                if(Bus.size() != 0) {
                    for (int k = 0; k < Car.size(); k++) {
                        if (Bus.get(k).getX() == i && Bus.get(k).getY() ==j ) MAPA[i][j]=3;
                    }
                }
            }
        }

    }
    public void mover(){
        int x;
        if(Car.size() != 0) {
            for (int k = 0; k < Car.size(); k++) {
                x = mov.getNumber();
                if(x==1)Car.get(k).setY(Car.get(k).getY()+Car.get(k).getVelocidade());
                else if(x==2)Car.get(k).setX(Car.get(k).getX()+Car.get(k).getVelocidade());
                else if(x==3)Car.get(k).setX(Car.get(k).getX()-Car.get(k).getVelocidade());
                else if(x==4)Car.get(k).setY(Car.get(k).getY()-Car.get(k).getVelocidade());
                if(Car.get(k).getX() >= map.getTamanho_x()) Car.get(k).setX(Car.get(k).getX()-map.getTamanho_x());
                if(Car.get(k).getY() >= map.getTamanho_y()) Car.get(k).setY(Car.get(k).getY()-map.getTamanho_y());
            }
        }
        if(Mot.size() != 0) {
            for (int k = 0; k < Mot.size(); k++) {
                x = mov.getNumber();
                if(x==1)Mot.get(k).setY(Mot.get(k).getY()+Mot.get(k).getVelocidade());
                else if(x==2)Mot.get(k).setX(Mot.get(k).getX()+Mot.get(k).getVelocidade());
                else if(x==3)Mot.get(k).setX(Mot.get(k).getX()-Mot.get(k).getVelocidade());
                else if(x==4)Mot.get(k).setY(Mot.get(k).getY()-Mot.get(k).getVelocidade());
                if(Mot.get(k).getX() >= map.getTamanho_x()) Mot.get(k).setX(Mot.get(k).getX()-map.getTamanho_x());
                if(Mot.get(k).getY() >= map.getTamanho_y()) Mot.get(k).setY(Mot.get(k).getY()-map.getTamanho_y());
            }
        }
        if(Bus.size() != 0) {
            for (int k = 0; k < Bus.size(); k++) {
                x = mov.getNumber();
                if(x==1)Bus.get(k).setY(Bus.get(k).getY()+Bus.get(k).getVelocidade());
                else if(x==2)Bus.get(k).setX(Bus.get(k).getX()+Bus.get(k).getVelocidade());
                else if(x==3)Bus.get(k).setX(Bus.get(k).getX()-Bus.get(k).getVelocidade());
                else if(x==4)Bus.get(k).setY(Bus.get(k).getY()-Bus.get(k).getVelocidade());
                if(Bus.get(k).getX() >= map.getTamanho_x()) Bus.get(k).setX(Bus.get(k).getX()-map.getTamanho_x());
                if(Bus.get(k).getY() >= map.getTamanho_y()) Bus.get(k).setY(Bus.get(k).getY()-map.getTamanho_y());

            }
        }


    }
}
