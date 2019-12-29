public class AppleWeightPredicate implements ApplePredicate{


    @Override
    public boolean test(Apple apple) {

        String characteristic = apple.getWeight() > 150 ? "Heavy" : "light";

        return apple.getWeight() > 150;
        //"A " + characteristic + " " + apple.getColor() +" apple";



    }
}
