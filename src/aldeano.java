package poo;


public class aldeano extends Personaje{

    public aldeano(){
        calc();
        setname("aldeano");
        setlife("200");


}
    @Override
     public sString lifedeta(){
     String life = this.getlife();
     String respuesta = "El Aldeano tiena una vida de " + vida +"recarga";
     return respuesta;
    }
}

