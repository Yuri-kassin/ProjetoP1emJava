public class Moto extends Veiculo {
    private int velocidade = 3;
    private int x;
    private int y;

    public Moto(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
