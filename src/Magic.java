import java.util.ArrayList;

public class Magic {
    private ArrayList<Carro> Car = new ArrayList<>();
    private ArrayList<Moto> Mot = new ArrayList<>();
    private ArrayList<Bussao> Bus = new ArrayList<>();
    private CMapa map = new CMapa();//instanciando o obj map da classe CMapa
    private Mover mov = new Mover();//instanciando o bj mov da classe Mover
    private int[][] MAPA= new int[map.getTamanho_x()][map.getTamanho_y()];
    private int[][] MAPAR = map.getMapa();

    public Magic(){
        for( int i=0; i<10; i++){ //add os primeiros 30 veiculos, sendo 10 de cada tipo
            Car.add(new Carro(mov.getRandomX(),mov.getRandomY()));//add 10 carros
            Mot.add(new Moto(mov.getRandomX(),mov.getRandomY()));//add 10 motos
            Bus.add(new Bussao(mov.getRandomX(),mov.getRandomY()));//add 10 busao
        }
    }

    public void Reset(){
        MAPAR = map.getMapa();
        for(int i=0; i<map.getTamanho_x(); i++){
            for(int j=0; j<map.getTamanho_y(); j++) {
              MAPA[i][j] = MAPAR[i][j];
            }
        }
    }

    public int[][] possicao(){
        Reset();
        Colizao();
        for(int i=0; i<map.getTamanho_x(); i++){
            for(int j=0; j<map.getTamanho_y(); j++){
                if(Car.size() != 0) {
                    for (int k = 0; k < Car.size(); k++) {
                        if (Car.get(k).getX() == i && Car.get(k).getY() ==j ){
                            MAPA[i][j]=3;
                            if(MAPAR[i][j]== 2) Car.add(new Carro(mov.getRandomX(),mov.getRandomY()));
                        }
                    }
                }
                if(Mot.size() != 0) {
                    for (int k = 0; k < Mot.size(); k++) {
                        if (Mot.get(k).getX() == i && Mot.get(k).getY() ==j ){
                            MAPA[i][j]=4;
                            if(MAPAR[i][j]== 2) Mot.add(new Moto(mov.getRandomX(),mov.getRandomY()));
                        }

                    }
                }
                if(Bus.size() != 0) {
                    for (int k = 0; k < Bus.size(); k++) {
                        if (Bus.get(k).getX() == i && Bus.get(k).getY() ==j ) {
                            MAPA[i][j]=5;
                            if(MAPAR[i][j]== 2) Bus.add(new Bussao(mov.getRandomX(),mov.getRandomY()));
                        }
                    }
                }
            }
        }

        return MAPA;
    }

    public int[][] mover(){
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
                if(Car.get(k).getX() <= 0) Car.get(k).setX(Car.get(k).getX()+map.getTamanho_x());
                if(Car.get(k).getY() <= 0) Car.get(k).setY(Car.get(k).getY()+map.getTamanho_y());

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
                if(Mot.get(k).getX() <= 0) Mot.get(k).setX(Mot.get(k).getX()+map.getTamanho_x());
                if(Mot.get(k).getY() <= 0) Mot.get(k).setY(Mot.get(k).getY()+map.getTamanho_y());
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
                if(Bus.get(k).getX() <= 0) Bus.get(k).setX(Bus.get(k).getX()+map.getTamanho_x());
                if(Bus.get(k).getY() <= 0) Bus.get(k).setY(Bus.get(k).getY()+map.getTamanho_y());
//                System.out.printf("X: %d Y: %d ",Bus.get(k).getX(),Bus.get(k).getY());
            }
        }

        return possicao();
    }

    public void Colizao(){
        /// Colizao com apenas onibus
        for(int i=0; i<Bus.size(); i++){
            for(int j=0; j<Bus.size(); j++){
                if(i!=j){
                    if(Bus.get(i).getX() == Bus.get(j).getX() && Bus.get(i).getY() == Bus.get(j).getY()) {
                        Bus.remove(Bus.get(j));
                        Bus.remove(Bus.get(i));
                        if(i-2>0-1)i-=2;
                        if(j-2>-1)j-=2;
                        if(Bus.size() == 0){
                            j=Bus.size();
                            i=Bus.size();
                        }
                    }
                }
            }
        }
        ///colizao com apenas Moto
        for(int i=0; i<Mot.size(); i++) {
            for (int j = 0; j < Mot.size(); j++) {
                if (i != j) {
                    if (Mot.get(i).getX() == Mot.get(j).getX() && Mot.get(i).getY() == Mot.get(j).getY()) {
                        Mot.remove(Mot.get(j));
                        Mot.remove(Mot.get(i));
                        if(i-2 >-1)i-=2;
                        if(j-2 >-1)j-=2;
                        if(Mot.size() == 0){
                            j=Mot.size();
                            i=Mot.size();
                        }
                    }
                }
            }
        }
        ///colizao com apenas Carro
        for(int i=0; i<Car.size(); i++) {
            for (int j = 0; j < Car.size(); j++) {
                if (i != j) {
                    if (Car.get(i).getX() == Car.get(j).getX() && Car.get(i).getY() == Car.get(j).getY()) {
                        Car.remove(Car.get(j));
                        Car.remove(Car.get(i));
                        if(i-2>-1)i-=2;
                        if(j-2>-1)j-=2;
                        if(Mot.size() == 0){
                            j=Car.size();
                            i=Car.size();
                        }

                    }
                }
            }
        }
        ///colizao moto com onibus
        for(int i =0; i<Mot.size(); i++){
            for(int j=0; j<Bus.size(); j++ ){
                if (Mot.get(i).getX() == Bus.get(j).getX() && Mot.get(i).getY() == Bus.get(j).getY()){
                    Mot.remove(Mot.get(i));
                    if(Mot.size() == 0)j=Bus.size();
                    if(i-1>0-1)i--;
                }
            }
        }
        ///colizao moto com carro
        for(int i =0; i<Mot.size(); i++){
            for(int j=0; j<Car.size(); j++ ){
                if (Mot.get(i).getX() == Car.get(j).getX() && Mot.get(i).getY() == Car.get(j).getY()){
                    Mot.remove(Mot.get(i));
                    if(Mot.size() == 0)j=Car.size();
                    if(i-1>0-1)i--;
                }
            }
        }
        ///colizao carro com onibus
        for(int i =0; i<Car.size(); i++){
            for(int j=0; j<Bus.size(); j++ ){
                if (Car.get(i).getX() == Bus.get(j).getX() && Car.get(i).getY() == Bus.get(j).getY()){
                    Car.remove(Car.get(i));
                    if(Car.size() == 0)j=Bus.size();
                    if(i-1>-1)i--;
                }
            }
        }


    }

    public int getCar() {
        return Car.size();
    }

    public int getMot() {
        return Mot.size();
    }

    public int getBus() {
        return Bus.size();
    }

}
