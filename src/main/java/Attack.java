public interface Attack extends Ability {

    public default Integer attack(Monster target) {
        return null;
    }
}
