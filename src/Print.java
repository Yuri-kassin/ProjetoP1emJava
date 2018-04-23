import java.util.ArrayList;

public class Print {

    public Print(){
        CMapa map = new CMapa();
        int x = 0;
        Magic mag = new Magic();
        int[][] MAPA ;
        System.out.println("ate aqui foi!");

        while(x == 0){
//            Thread.sleep(1000);
            MAPA = mag.mover();
            System.out.printf("Carros: %d", mag.getCar());
            System.out.printf(" Motos: %d", mag.getMot());
            System.out.printf(" Bussao: %d\n", mag.getBus());
            for(int i=0; i<map.getTamanho_x(); i++){
                for (int j=0; j<map.getTamanho_y(); j++){
                    if(MAPA[i][j]==0) System.out.print(" ");
                    else if(MAPA[i][j] == 1)System.out.print("\u001b[47m \033[0m");
                    else if(MAPA[i][j] == 2)System.out.print("\u001b[42m \033[0m");
                    else if(MAPA[i][j] == 3)System.out.print("\u001b[41m \033[0m");
                    else if(MAPA[i][j] == 4)System.out.print("\u001b[44;1m \033[0m");
                    else if(MAPA[i][j] == 5)System.out.print("\u001b[43m \033[0m");
                    else System.out.print(MAPA[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }



}
