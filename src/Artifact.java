public class Artifact {
    int number;
    String culture;
    int century;
    public Artifact (int number) {
        this.number = number;
    }
    public Artifact (int number, String culture){
        this.number = number;
        this.culture = culture;
    }
    public Artifact (int number, String culture, int century){
        this.number = number;
        this.culture = culture;
        this.century = century;
    }
    public static void main (String[] args){
        Artifact number = new Artifact(212121);
        Artifact culture = new Artifact(21211,"Ацтеки");
        Artifact century = new Artifact( 212121, "Ацтеки", 12);
        System.out.println(number.number);
        System.out.println(number.number + " , " + culture.culture);
        System.out.println(number.number + ", " + culture.culture + ", " + century.century);
    }
}
