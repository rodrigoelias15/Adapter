public class Nutricionista {
    IDieta dieta;
    DietaAdapter programaDieta;

    public Nutricionista() {
        dieta = new DietaAlimento();
        programaDieta = new DietaAdapter(dieta);
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
