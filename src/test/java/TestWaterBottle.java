import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100, 100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hasDrunkWater(){
        assertEquals(90, waterBottle.drinkWater());
    }

    @Test
    public void hasDrunkMoreWater(){
        waterBottle.drinkWater();
        assertEquals(80, waterBottle.drinkWater());
    }

    @Test
    public void hasEmptiedBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void hasFilledBottle(){
        waterBottle.emptyBottle();
        assertEquals(100, waterBottle.fillBottle());
    }


}
