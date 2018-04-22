public class Bussao extends Veiculo {
    private int velocidade = 1;
    private int x;
    private int y;

    public Bussao(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
