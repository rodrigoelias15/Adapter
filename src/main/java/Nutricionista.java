public class Nutricionista {
    IDieta dieta;
    DietaAdapter programaDieta;

    public Nutricionista(IDieta dieta, DietaAdapter programaDieta) {
        this.dieta = dieta;
        this.programaDieta = programaDieta;
    }

    public void setDieta(String alimento) {
        dieta.setDieta(alimento);
        programaDieta.salvarDieta();
    }

    public String getDieta() {
        return programaDieta.recuperarDieta();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getCalorias() {
        return programaDieta.getNumCalorias();
    }


}
