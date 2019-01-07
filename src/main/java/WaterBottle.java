public class WaterBottle {
    private int currentVolume;
    private int originalVolume;

    public WaterBottle(int currentVolume, int originalVolume){
        this.currentVolume = currentVolume;
        this.originalVolume = originalVolume;

    }

    public int getVolume() {
        return this.currentVolume;
    }

    public int drinkWater() {
        return this.currentVolume -= 10;
    }

    public int emptyBottle() {
        return this.currentVolume = 0;
    }

    public int fillBottle() {
        return this.currentVolume = this.originalVolume;
    }
}
