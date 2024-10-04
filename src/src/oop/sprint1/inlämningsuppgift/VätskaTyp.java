package src.oop.sprint1.inlämningsuppgift;

public enum VätskaTyp {
    KRANVATTEN ("kranvatten"),
    MINERALVATTEN ("mineralvatten"),
    PROTEINDRYCK ("proteindryck");

    public final String vätska;

    VätskaTyp(String vätska) {
        this.vätska = vätska;
    }

    public String getVätska() {
        return vätska;
    }
}
