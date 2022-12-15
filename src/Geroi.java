public class Geroi {
    private int zdorovie;
    private String superSpasobnact;
    private int uron;

    public Geroi(int zdorovie, String superSpasobnact, int uron) {
        this.zdorovie = zdorovie;
        this.superSpasobnact = superSpasobnact;
        this.uron = uron;
    }

    public Geroi(int zdorovie, int uron) {
        this.zdorovie = zdorovie;
        this.uron = uron;
    }

    public int getZdorovie() {
        return zdorovie;
    }



    public String getSuperSpasobnact() {
        return superSpasobnact;
    }



    public int getUron() {
        return uron;
    }


}
