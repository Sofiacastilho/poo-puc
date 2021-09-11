package tdeum;

public class Automovel extends Veiculo {

    Automovel ferrari = new Automovel();
    Automovel fusca = new Automovel();

    public void passarMarcha (){
        System.out.println("passando marcha..");
    }


    public Automovel getFerrari() {
        return ferrari;
    }

    public void setFerrari(Automovel ferrari) {
        this.ferrari = ferrari;
    }

    public Automovel getFusca() {
        return fusca;
    }

    public void setFusca(Automovel fusca) {
        this.fusca = fusca;
    }


}
