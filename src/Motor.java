public class Motor extends Vozilo{
    private float zapremnina;

    public Motor(String model, double cijenaIznajmljivanja, float zapremnina){
        super(model, cijenaIznajmljivanja);
        this.zapremnina = zapremnina;
    }
}
