/**
 * @author YuriKassin
 *
 *
 */

public class Main {
    public static void main(String[] args)throws InterruptedException{
        int x=0;
        Imprimir print = new Imprimir ();
        while(x==0){
            Thread.sleep(300);
            print.imprimir();

        }



    }
}
