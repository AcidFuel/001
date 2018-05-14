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
public class e_Test {
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
* Тестируем метод с входными параметрами 7, 2, 1.2, 1.9, 3500, 2100, 3000, 2 и с предполагаемым результатом 267680.0
*/
assertEquals("267680.0", test.SetToutCost(7, 2, 1.2, 1.9, 3500, 2100, 3000, 2));
}
}