import com.craftmojo.Segitiga;
import org.junit.Assert;
import org.junit.Test;

public class SegitigaTest {
    @Test
    public void hitungLuas() {
        Segitiga s1 = new Segitiga();
        s1.setTinggi(5);
        s1.setAlas(10);
        double expected, actual;
        expected = 25.0;
        actual = s1.hitungLuas();

        Assert.assertEquals(expected, actual,0.0f);
    }
}