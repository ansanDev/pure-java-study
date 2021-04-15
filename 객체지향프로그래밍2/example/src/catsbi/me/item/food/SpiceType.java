package catsbi.me.item.food;

import java.util.function.IntFunction;

public enum SpiceType {
    HONEY(energy-> energy * 3),
    SALT(energy-> energy * 2);

    private final IntFunction function;

    SpiceType(IntFunction function) {
        this.function = function;
    }

    public static int spiceAddOns(SpiceType spiceType, int energy) {
        return (int) spiceType.function.apply(energy);
    }
}
