package poo;

public class elfo extends poo.Personaje implements Guerrero {

    elfo(){
        calc();
        setName("elfo");
        setLife("500");

    }
    @Override
    public String lifedeta(){
        String life = this.getLife()l;
        String respuesta = "El elfo tiene una vidad de" + life +" recarga";
        return respuesta;

    }
    @Override
    public String wakanda(){
        String wakanda = " El" +this.getname()+"tiene pelea";
        return wakanda;

    }
}
