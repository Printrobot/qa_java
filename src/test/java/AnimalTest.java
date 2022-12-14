import com.practicum.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)

    public class AnimalTest {
        Animal animal = new Animal();
        private final String animalKindTest;
        private final List<String> listFoodTest;

        public AnimalTest (String animalKindTest, List<String> listFoodTest) {
            this.animalKindTest = animalKindTest;
            this.listFoodTest = listFoodTest;
        }

@Parameterized.Parameters
        public static Object[][] getFoodInput() {
            return new Object[][]{
                    {"Травоядное", List.of("Трава", "Различные растения")},
                    {"Хищник", List.of("Животные", "Птицы", "Рыба")},
            };
        }
// 1
        @Test
        public void getFood_PositiveTest() throws Exception {
            List <String> actualListOfFeed = animal.getFood(animalKindTest);
            assertEquals(listFoodTest, actualListOfFeed);
        }
// 2
        @Test
        public void getFamily_PositiveTest() {
            String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
            String actual = animal.getFamily();
            assertEquals(expected, actual);
        }
// 3
        @Test
        public void getFood_FailTest() {
            try {
                animal.getFood("Неизвестный вид животного");
                fail("Неизвестный вид животного");
            } catch (Exception e) {
                assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                        e.getMessage());
            }
        }
}

