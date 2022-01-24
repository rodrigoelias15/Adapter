public class DietaAlimento implements IDieta {

    private String alimento;


    @Override
    public String getDieta() {
        return this.alimento;
    }

    @Override
    public void setDieta(String alimento) {
        this.alimento = alimento;
    }
}
