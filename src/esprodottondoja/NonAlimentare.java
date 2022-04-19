package esprodottondoja;

/**
 * La classe gestisce la tipologia NonAlimentare di Prodotto
 */
public class NonAlimentare extends Prodotto {
    /**
     * materiale principale costituente del prodotto
     */
    protected String materialePrincipale;
    /**
     * Se il prodotto è riciclabile o meno
     */
    protected boolean riciclabile;

    /**
     * Costruttore Parametrico - Costruisce un oggetto di tipo Prodotto NonAlimentare
     * @param materialePrincipale Nome del materiale principale
     * @param riciclabile True se riciclabile, False altrimenti
     * @param nome nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo prezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza nazione di produzione del nuovo oggetto Prodotto
     */
    public NonAlimentare(String materialePrincipale, boolean riciclabile, String nome, double prezzo, String provenienza) {
        super(nome, prezzo, provenienza);
        this.materialePrincipale = materialePrincipale;
        this.riciclabile = riciclabile;
    }
    /**
     * Applica uno sconto sul prodotto Non Alimentare.
     * <ul>
     *      <li>Se il prodotto è riciclabile viene applicato uno sconto del 15%</li>
     *      <li>Altrimenti sconto del 10%</li>
     * </ul>
     */
    @Override
    public void applicaSconto(){
        if(isRiciclabile())
            setPrezzo(prezzo - (prezzo/10) - (prezzo/20));
        else
        super.applicaSconto();
    }
    
    public String getMaterialePrincipale() {
        return this.materialePrincipale;
    }

    public void setMaterialePrincipale(String materialePrincipale) {
        this.materialePrincipale = materialePrincipale;
    }

    public boolean isRiciclabile() {
        return this.riciclabile;
    }

    public boolean getRiciclabile() {
        return this.riciclabile;
    }

    public void setRiciclabile(boolean riciclabile) {
        this.riciclabile = riciclabile;
    }

    @Override
    public String toString() {
        return "{" +
            " materialePrincipale='" + getMaterialePrincipale() + "'" +
            ", riciclabile='" + isRiciclabile() + "'" +
            "}";
    }


}
