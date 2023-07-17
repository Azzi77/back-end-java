import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Puby", "Marron", 25, 5.5, 5,"nada");
        Gato gato1 = new Gato("Felix", "Preto", 5,5.5,"nada");
        Passaro passaro1 = new Passaro("Frajola","Amarelo",1,5.4,"nada");

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());


        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());




        cachorro1.soar();
        gato1.soar();
        passaro1.soar();


     //   Cachorro cachorro2 = new Cachorro("Rex", "Marron", 25, 5.5, 5,"nada");
      //  System.out.println(cachorro2.getNumeroDeCachorros());
     //   System.out.println(cachorro1.getNumeroDeCachorros());

       // System.out.println(cachorro1.toString());
       // System.out.println(cachorro2.toString());

        //*cachorro1.latir();

        //System.out.println(cachorro2.getNome());
        //System.out.println(cachorro2.getPeso());
        //System.out.println("O cachorro pegou uma " + cachorro1.pegar());

       // System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
       // System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
       // System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir"));




    }
}