public class Carro extends Veiculo {
    private int velocidade = 2;
    private int x;
    private int y;
    public int getVelocidade() {
        return velocidade;
    }
    public Carro(int x,int y){
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
