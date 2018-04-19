public class Bussao extends Veiculo {
    private int velocidade = 1;
    private int x;
    private int y;
    public int getVelocidade() {
        return velocidade;
    }
    public Bussao(int x,int y){
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
