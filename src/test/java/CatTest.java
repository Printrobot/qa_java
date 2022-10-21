import com.practicum.example.Cat;
import com.practicum.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
// 1
    @Test
    public void getSound_PositiveTest() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
// 2
    @Test
    public void getFood_PositiveTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of();
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}