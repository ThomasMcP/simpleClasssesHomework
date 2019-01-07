import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 500, 10, 20);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.checkPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(10, printer.checkTonerLevel());
    }

    @Test
    public void canPrint(){
        assertEquals(true, printer.print(2, 5));
    }

    @Test
    public void printerPaperReducedAfterPrint(){
        printer.print(2, 5);
        assertEquals(90, printer.checkPaper());
    }

    @Test
    public void printerPaperCanBeRefilled(){
        assertEquals(500, printer.refillPaper());
    }

    @Test
    public void tonerLevelReducedWhenPrint(){
        printer.print(2, 5);
        assertEquals(0, printer.checkTonerLevel());
    }


}
