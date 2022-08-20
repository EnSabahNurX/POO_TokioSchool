public class ClasseC extends ClasseA {
    private final long renew;
    public int licenceNumber;
    protected char categoryGroup;

    public ClasseC(int licenceNumber, long renew, char categoryGroup, String nome, int idade, float altura) {
        super(nome, idade, altura);
        this.licenceNumber = licenceNumber;
        this.renew = renew;
        this.categoryGroup = categoryGroup;

    }

    public long getRenew() {
        return renew;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public char getCategoryGroup() {
        return categoryGroup;
    }

    public void setCategoryGroup(char categoryGroup) {
        this.categoryGroup = categoryGroup;
    }

    @Override
    public String toString() {
        return "ClasseC{" +
                "renew=" + renew +
                ", licenceNumber=" + licenceNumber +
                ", categoryGroup=" + categoryGroup +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
