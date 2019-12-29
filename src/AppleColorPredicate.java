public class AppleColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple a) {
        return "red".equals(a.getColor());
    }
}
