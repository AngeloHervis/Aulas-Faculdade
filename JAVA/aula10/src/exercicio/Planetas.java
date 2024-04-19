package exercicio;

public enum Planetas {
    MERCURIO(2439.7f, "3,3011 x 10^23kg"),
    VENUS(6051.8f, "3,3011 x 10^23kg"),
    TERRA(6317f, "3,3011 x 10^23kg"),
    JUPITER(69911f, "3,3011 x 10^23kg"),
    MARTE(3389.5f, "3,3011 x 10^23kg"),
    SATURNO(58232f, "3,3011 x 10^23kg"),
    URANO(2536f, "3,3011 x 10^23kg"),
    NETUNO(24622f, "3,3011 x 10^23kg");

    private float raio;
    private String massa;
    
    private Planetas(float raio, String massa) {
        this.raio = raio;
        this.massa = massa;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public String getMassa() {
        return massa;
    }
    public void setMassa(String massa) {
        this.massa = massa;
    }

    public static String planetasMaiores(Planetas p){
        String res = "";
        for (Planetas plan : Planetas.values()) {
            if (plan.getRaio() > p.getRaio()) {
                res += plan + "\n";
            }    
        }
        return res;
    }
    
}
