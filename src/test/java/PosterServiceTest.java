import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterServiceTest {
    @Test
    public void findAllTest() {
        PosterService posterService = new PosterService();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";

        posterService.add(movie1);
        posterService.add(movie2);
        posterService.add(movie3);

        String[] expected = {movie1, movie2, movie3};
        String[] actual = posterService.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastlTest() {
        PosterService posterService = new PosterService();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        posterService.add(movie1);
        posterService.add(movie2);
        posterService.add(movie3);
        posterService.add(movie4);
        posterService.add(movie5);
        posterService.add(movie6);
        posterService.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        String[] actual = posterService.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMinLimitlTest() {
        PosterService posterService = new PosterService();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";


        posterService.add(movie1);
        posterService.add(movie2);
        posterService.add(movie3);


        String[] expected = {movie3, movie2, movie1};
        String[] actual = posterService.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitlTest() {
        PosterService posterService = new PosterService(6);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        posterService.add(movie1);
        posterService.add(movie2);
        posterService.add(movie3);
        posterService.add(movie4);
        posterService.add(movie5);
        posterService.add(movie6);
        posterService.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        String[] actual = posterService.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
