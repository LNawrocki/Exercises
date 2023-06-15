package pl.coderslab.xls;

public class Pos {
    private String posNr;
    private String articleCode;
    private int pcs;
    private String unit = "";
    private String additionalInformation = "";

    public Pos(String posNr, String articleCode, int pcs, String unit, String additionalInformation) {
        this.posNr = posNr;
        this.articleCode = articleCode;
        this.pcs = pcs;
        this.unit = unit;
        this.additionalInformation = additionalInformation;
    }

    public String getPosNr() {
        return posNr;
    }

    public void setPosNr(String posNr) {
        this.posNr = posNr;
    }
}
