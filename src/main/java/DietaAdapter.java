public class DietaAdapter extends DietaCalorias {

    private IDieta dietaAlimento;

    public DietaAdapter(IDieta dietaAlimento) {
        this.dietaAlimento = dietaAlimento;
    }

    public String recuperarDieta() {
        if (this.getNumCalorias() < 236.0)
            dietaAlimento.setDieta("Batata doce e frango");
        else if (this.getNumCalorias() >= 236.0)
            dietaAlimento.setDieta("Pão integral com queijo muçarela");
        if (this.getNumCalorias() >= 600.0)
            dietaAlimento.setDieta("Tapioca com carne bovina");
        return dietaAlimento.getDieta();
    }

    public void salvarDieta() {
        if (dietaAlimento.getDieta().equals("Batata doce e frango"))
            this.setNumCalorias(200);
        else if (dietaAlimento.getDieta().equals("Pão integral com queijo muçarela"))
            this.setNumCalorias(300);
        else if (dietaAlimento.getDieta().equals("Tapioca com carne bovina"))
            this.setNumCalorias(610);
    }
}
