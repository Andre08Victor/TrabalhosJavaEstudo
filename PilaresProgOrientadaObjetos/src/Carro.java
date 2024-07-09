public class Carro extends Veiculo {
    
    public void ligar() {
        conferirCambio();
        conferirCombustivel();
        System.out.println("Carro Ligado.");
    }

    private void conferirCambio(){
        System.out.println("Conferindo câmbio no Parking...");
    }

    private void conferirCombustivel(){
        System.out.println("Combustível conferido.");
    }

}
