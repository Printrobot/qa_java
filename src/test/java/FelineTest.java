import com.practicum.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {
    Feline feline = new Feline();
    private final int quantityKittens;

    public FelineTest (int quantityKittens) {
        this.quantityKittens = quantityKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getCountKittensInput() {
        return new Object[][]{
                {0},
                {1},
                {10000},
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
        int actual = feline.getKittens(quantityKittens);
        assertEquals(quantityKittens, actual);
    }
}
