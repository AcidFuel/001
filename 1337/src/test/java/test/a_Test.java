/**
* Устанавливаем принадлежность класса к пакету testPackage
*/
package test;
/**
* Импортируем библиотеку
*/
import static org.junit.Assert.*;
/**
* Импортируем библиотеку
*/
import org.junit.*;
/**
* Импортируем класс Calculator
*/
import mainPackage.Calculator;
/**
* Основной класс
*/
public class a_Test {
/**
* Объявляем переменную типа Calculator
*/
private Calculator test;
/**
* Обозначаем , что следующий метод будет тестируемым
*/
@Test
/**
* тестируемый метод
*/
public void testCalculator() {
/**
* Инициализируем переменную test
*/
test = new Calculator();
/**
* Тестируем метод с входными параметрами 5, 7, 1.9, 1.8, 2500, 2300, 2100, 2 и с предполагаемым результатом 500780.0
*/
assertEquals("500780.0", test.SetToutCost(5, 7, 1.9, 1.8, 2500, 2300, 2100, 2));
}
}