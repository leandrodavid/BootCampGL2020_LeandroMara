/**
 * 
 */
package mockito.example.services;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import junit.framework.Assert;
import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;
import mockito.example.services.impl.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	@InjectMocks
	private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
	
	@Mock
	private BasicOperationsService basicOperationsService;
	
	@Mock DataService dataService;
	
	@Spy BasicOperationsServiceImpl spyBasicOperationsService;
	@Spy DataServiceImpl spyDataService;
	
	@Test
	public void testCalculateSum() {
		
		when(basicOperationsService.add(4, 2)).thenReturn(6.0);
		
		Assert.assertEquals(6.0, calculatorService.calculateSum(4, 2));
		verify(basicOperationsService, times(1)).add(4, 2);
	}
	
	@Test
	public void testCalculateSubstraction() {
        when(basicOperationsService.subtract(4, 2)).thenReturn(2.0);
		
		Assert.assertEquals(2.0, calculatorService.calculateSubstraction(4, 2));
		
		verify(basicOperationsService, times(1)).subtract(4, 2);
		verify(basicOperationsService).subtract(4, 2);
	}
	
	@Test
	public void testCalculateDivision() {
        when(basicOperationsService.divide(4, 2)).thenReturn(2.0);
		
		Assert.assertEquals(2.0, calculatorService.calculateDivision(4, 2));	
		verify(basicOperationsService, times(1)).divide(4, 2);
	}
	
	@Test
	public void testCalculateDivisionCero() {
        //when(basicOperationsService.divide(4, 0)).thenReturn(0.0);
		//Assert.assertEquals(0.0, basicOperationsService.divide(4, 0));
		
        Throwable exception = assertThrows(ArithmeticException.class, () -> calculatorService.calculateDivision(4, 0));
		System.out.println(exception.getMessage());
        Assert.assertEquals("Error al dividir por cero", exception.getMessage());	
        verify(basicOperationsService, never()).divide(4, 0);
	}
	
	
	@Test
	public void testCalculateMultiplication() {
        when(basicOperationsService.multiply(2, 2)).thenReturn(4.0);
		
		Assert.assertEquals(4.0, calculatorService.calculateMultiplication(2, 2));
		verify(basicOperationsService, times(1)).multiply(2, 2);
	}
	
	@Test
	public void testCalculateAverage() {
		int[] retorno = {1, 2, 3, 4, 5}; 
		when(dataService.getListOfNumbers()).thenReturn(retorno);
		
		Assert.assertEquals(3.0, calculatorService.calculateAverage());
		
	}
	
	@Test
	public void testCalculateAverageNull() {
		
		when(dataService.getListOfNumbers()).thenReturn(null);
		Throwable exception = assertThrows(NullPointerException.class, () -> calculatorService.calculateAverage());
		
		assertEquals(null, exception.getMessage());
		
	}
	
	@Test
	public void testPrintResult() {
        when(basicOperationsService.add(3, 2)).thenReturn(5.0);
		
        
		Assert.assertEquals("El resultado es: 5.0", calculatorService.printResult(calculatorService.calculateSum(3, 2)));
		verify(basicOperationsService).add(3, 2);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6 ,8})
	public void testIsEven (int valor) {
		Assert.assertTrue(calculatorService.isOdd(valor));
	}
	
	@Test
	public void spyAddBasicOprerationService() {
		
		Assert.assertEquals(5.0, spyBasicOperationsService.add(2, 3));
		
		when(spyBasicOperationsService.multiply(3, 2)).thenReturn(6.0);
	    Assert.assertEquals(6.0, spyBasicOperationsService.multiply(3, 2));
	}
	
	@Test
	public void spyGetListOfNumbersDataService() {
		
		int[] listMock = new int[] { 1, 2};
		when(dataService.getListOfNumbers()).thenReturn(new int[] { 1, 2 });
		assertArrayEquals(listMock,dataService.getListOfNumbers());
		
		int[] listReal = new int[] { 1, 2, 3, 4, 5};
		//assertArrayEquals(objetoReal,objetoReal);
		assertArrayEquals(spyDataService.getListOfNumbers(),listReal);
		
	}

}
