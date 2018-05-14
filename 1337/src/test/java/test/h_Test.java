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
public class h_Test {
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
* Тестируем метод с входными параметрами 4, 5, 1.4, 2, 5000, 6000, 1200, 1 и с предполагаемым результатом 190000.0
*/
assertEquals("190000.0", test.SetToutCost(4, 5, 1.4, 2, 5000, 6000, 1200, 1));
}
}