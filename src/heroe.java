

public class heroe extends Personaje implements Guerrero{

    Public Heroe(){
        calc();
        setName("Heroe");
        setVida("1200");

    }
    @Override
    public String lifedeta(){
        String life = this.getlife();
        String call = " El heroe tiene una vidad de" + life +" recarga";
        return call;
    }
    @Override
    public String wakanda(){
        String wakanda = " El" +this.getname()+"tiene pelea";
        return wakanda;
    }

}
