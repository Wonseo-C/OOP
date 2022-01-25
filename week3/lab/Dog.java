public class Dog {
    public int weightInPounds;
    public static String biomen = "Canis familiaris";

    public Dog(int w) { weightInPounds = w; }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("wooof!");
        }
    }

    public static Dog MaxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        } else {
            return d2;
        }
    }
}
