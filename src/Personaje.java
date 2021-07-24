package poo;





abstract class Personaje{
    private String name;
    private String life = "100";

    public personaje(){}
    public String getName(){return name; }
    public String getLife() {return life;}
    public void setName(String name) {this.name = name;}
    public void setLife(String life) { this.life = life;}
    public abstract String lifedeta();



}
