public class DietaAdapter extends DietaCalorias {

    private DietaAlimento dietaAlimento;

    public DietaAdapter(DietaAlimento sucoInstantaneo) {
        this.dietaAlimento = sucoInstantaneo;
    }

    public String recuperarDieta() {
        if (this.getNumCalorias() <= 236.0)
            dietaAlimento.setDieta("Batata doce e frango");
        else if (this.getNumCalorias() > 236.0)
            dietaAlimento.setDieta("Batata frita com queijo");
        if (this.getNumCalorias() > 596.0)
            dietaAlimento.setDieta("Tapioca com ovo frito");
        return dietaAlimento.getDieta();
    }

    public void salvarDieta() {
        if (dietaAlimento.getDieta().equals("Batata doce e frango"))
            this.setNumCalorias(236);
        else if (dietaAlimento.getDieta().equals("Batata frita com queijo"))
            this.setNumCalorias(300);
        else if (dietaAlimento.getDieta().equals("Tapioca com ovo frito"))
            this.setNumCalorias(600);
    }
}
