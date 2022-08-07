import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {
    Films first = new Films(1, "Первый", 300);
    Films second = new Films(2, "Второй", 400);
    Films third = new Films(3, "Третий", 390);
    Films four = new Films(4, "Четвертый", 410);
    Films five = new Films(5, "Пятый", 320);
    Films six = new Films(6, "Шестой", 450);
    Films seven = new Films(7, "Седьмой", 450);

    @Test
    void firstTest() {

        ManagerFilms manager = new ManagerFilms(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.findAll();
        manager.findLast();

        Films[] actual = manager.findLast();
        Films[] expected = {seven, six, five, four, third};

        Assertions.assertArrayEquals(expected,actual);


    }
    @Test
    void secondTest() {

        ManagerFilms manager = new ManagerFilms();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.findAll();

        Films[] actual = manager.findAll();
        Films[] expected = {first, second, third, four, five, six, seven};

        Assertions.assertArrayEquals(expected,actual);


    }

    @Test
    void thirdTest() {

        ManagerFilms manager = new ManagerFilms();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.findLast();

        Films[] actual = manager.findLast();
        Films[] expected = {seven, six, five, four, third, second, first};

        Assertions.assertArrayEquals(expected,actual);


    }
}