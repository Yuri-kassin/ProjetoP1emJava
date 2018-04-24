/**
 * Onibus
 *Classe que armazena informacoes de um onibus
 *
 * @author YuriKassin
 */
public class Bussao{
    private int velocidade = 1;
    private int x;
    private int y;
    /**
     * Construtor q recebe a possiçao do onibus
     * @param x
     * @param y
     */
    public Bussao(int x,int y){
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
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    /**funcoes set que atualizam a possicao do onibus
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
