public class Auto extends Vozilo{
    private short brojVrata;

    public Auto(String model, double cijenaIznajmljivanja, short brojVrata){
        super(model, cijenaIznajmljivanja);
        this.brojVrata = brojVrata;
    }
}
