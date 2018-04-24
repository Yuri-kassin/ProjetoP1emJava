/**
 * Moto
 *Classe que armazena informacoes de uma Moto
 *
 * @author YuriKassin
 */
public class Moto{
    private int velocidade = 3;
    private int x;
    private int y;
    /**
     * Construtor q recebe a possiçao da moto
     * @param x
     * @param y
     */
    public Moto(int x,int y){
        this.x = x;
        this.y = y;
    }
    /**
     * Funcoes gets para a para retorna
     * @return velocidade
     * @return x
     * @return y
     */
    public int getVelocidade() {
        return velocidade;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    /**funcoes set que atualizam a possicao do moto
     *
     * @param x
     * @param y
     */
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
