import java.util.ArrayList;

public class Print {
    //declarando as ArrayList Para cada tipo de Veiculo
    private CMapa map = new CMapa();

//    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    public Print(){
        int x = 0;
        Magic mag = new Magic();
        int[][] MAPA ;
        while(x == 0){
            MAPA = mag.mover();
            for(int i=0; i<map.getTamanho_x(); i++){
                for (int j=0; j<map.getTamanho_y(); j++){
                    if(MAPA[i][j]==0) System.out.print(" ");
                    else System.out.print(MAPA[i][j]);
                }
                System.out.println();
            }
        }
    }



}
