import org.junit.Assert;
import org.junit.Test;
import ru.sc.vsu.berezin_y_a.Translator;

import java.io.FileNotFoundException;

public class TranslatorTest {

    Translator translator = new Translator();
    String correctResult;
    String actualResult;

    @Test
    public void test1() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/1.txt")));
        correctResult = "один";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test2() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/2.txt")));
        correctResult = "двенадцать";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test3() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/3.txt")));
        correctResult = "пятьдесят семь";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test4() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/4.txt")));
        correctResult = "сто двадцать один";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test5() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/5.txt")));
        correctResult = "шесть тысяч семьсот восемьдесят девять";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test6() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/6.txt")));
        correctResult = "сто двенадцать тысяч триста сорок пять";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test7() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/7.txt")));
        correctResult = "девятьсот девяносто девять тысяч девятьсот девяносто девять";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test8() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/8.txt")));
        correctResult = "один миллион";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test9() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/9.txt")));
        correctResult = "Введенное число должно быть от 1 до 1 000 000.";
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test10() throws FileNotFoundException {
        actualResult = String.valueOf(translator.translateNumberToWords(translator.readIntFromFile("testSrc/testFiles/10.txt")));
        correctResult = "Введенное число должно быть от 1 до 1 000 000.";
        Assert.assertEquals(correctResult, actualResult);
    }

}
