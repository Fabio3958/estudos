package CodeWars;

public class CuboidVolume {

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        double baseArea = length * width;
        double volume = baseArea * height;

        return volume;
    }

    public static void main(String[] args) {
        System.out.println(getVolumeOfCuboid(2.8, 1.45, 6.7));
    }

}
