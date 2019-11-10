import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProjectMain {
    private TestProject t1;
    @Before
    public void init() {
        t1 = new TestProject();
    }


    @Test
    public void sum_Test1() {
        Assert.assertEquals(8, t1.sum(3, 5));
    }

    @Test
    public void sum_Test2() {
        Assert.assertEquals(12, t1.sum(10, 2));
    }

    @Test
    public void multiplication_Test1() {
        Assert.assertEquals(10, t1.multiplication(5, 2));
    }

    @Test
    public void multiplication_Test2() {
        Assert.assertEquals(12, t1.multiplication(2, 6));
    }

    @Test
    public void multiplication_Test3() {
        Assert.assertEquals(0, t1.multiplication(10, 0));
    }

    @Test
    public void division_Test1() {
        Assert.assertEquals(5, t1.division(10, 2));
    }

    @Test
    public void division_Test2() {
        Assert.assertEquals(10, t1.division(20, 2));
    }

    @Test
    public void division_Test3() {
        Assert.assertEquals(20, t1.division(100, 5));
    }


    @Test
    public void totalCharacters_Test1() {
        Assert.assertEquals(6, t1.totalCharacters("States"));
    }

    @Test
    public void totalCharacters_Test2() {
        Assert.assertEquals(6, t1.totalCharacters("United"));
    }

    @Test
    public void totalCharacters_Test3() {
        Assert.assertEquals(7, t1.totalCharacters("America"));
    }

}
