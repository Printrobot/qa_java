import com.practicum.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {
    Feline feline = new Feline();
    private final int testCountKittens;

    public FelineTest (int testCountKittens) {
        this.testCountKittens = testCountKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getTestDataForCountKittens() {
        return new Object[][]{
                {1},
                {-1},
                {0},
        };
    }
// 1
    @Test
    public void eatMeat_TrueTest() throws Exception {
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }
// 2
    @Test
    public void getFamily_PositiveTest() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
// 3
    @Test
    public void getKittens_PositiveTest() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
// 4
    @Test
    public void getKittens_PositiveParamTest() {
        int actual = feline.getKittens(testCountKittens);
        assertEquals(testCountKittens, actual);
    }
}
