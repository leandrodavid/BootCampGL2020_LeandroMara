import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prueba {

	public static void main(String[] args) {
		
		StreamApi streamApi= new StreamApi();
		Car autoUno = new Ford();
		Car autoDos = new RatonAleman();
		IOtionalImpl optional = new IOtionalImpl(); 
		
		System.out.println(streamApi.toString());
		streamApi.pasarCiudadesMayuscula();
		System.out.println("-----------------");
		streamApi.ordenarCiudades();
		System.out.println("-----------------");
		streamApi.lasPrimerTresCiudades();
		System.out.println("-----------------");
		streamApi.todasMenosLima();
		System.out.println("-----------------");
		streamApi.pasarAIntStream();
		System.out.println("-----------------");
		streamApi.mostrarCantidadIntStream();
		System.out.println("-----------------");
		streamApi.mostrarMaxIntStream();
		System.out.println("-----------------");
		streamApi.mostrarMinIntStream();
		System.out.println("-----------------");
		streamApi.mostrarPromedioIntStream();
		System.out.println("-----------------");
		System.out.println("El auto ford tiene puertas ="+autoUno.getDoors());
		System.out.println("-----------------");
		System.out.println("El modelo de auto es " +autoUno.getModel());
		System.out.println("-----------------");
		System.out.println("El auto Aleman tiene puertas ="+autoDos.getDoors());
		System.out.println("-----------------");
		System.out.println("El modelo de auto es " +autoDos.getModel());
		System.out.println("-----------------");
		System.out.println("Sin variable optional " +optional.getName(null));
		System.out.println("-----------------");
		System.out.println("Con variable optional " +optional.getName("Hay variable"));

		
	}

}
class StreamApi {

	final List<String> cities = Arrays.asList("Quito", "Barcelona", "Madrid", "La Habana",
			"Paris", "New York", "Bogotá", "Rio de Janeiro", "Lima", "Buenos Aires");
	
	final int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

	@Override
	public String toString() {
		return "StreamApi [cities=" + cities + "]";
	}

	public void pasarCiudadesMayuscula() {
		Stream<String> stream = cities.stream();
		stream.map(c -> c.toUpperCase()).forEach(System.out::println);
	}

	public void ordenarCiudades() {
		Stream<String> stream = cities.stream();
		stream.sorted(Comparator.naturalOrder()).forEach(System.out::println);
	}

	public void lasPrimerTresCiudades() {
		Stream<String> stream = cities.stream().limit(3);
		stream.sorted(Comparator.naturalOrder()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

	public void todasMenosLima() {
		Stream<String> stream = cities.stream();
		stream.filter(c ->!c.contentEquals("Lima")).forEach(System.out::println);
	}	
	
	public void pasarAIntStream() {
		IntStream valuesDeIntStream = IntStream.of(values);
		valuesDeIntStream.forEach(System.out::println);
	}
	
	public void mostrarCantidadIntStream() {
		IntStream valuesDeIntStream = IntStream.of(values);
		System.out.println(valuesDeIntStream.count());
	}
	
	public void mostrarMaxIntStream() {
		IntStream valuesDeIntStream = IntStream.of(values);
		System.out.println(valuesDeIntStream.mapToLong(p ->p).summaryStatistics().getMax());
	}
	
	public void mostrarMinIntStream() {
		IntStream valuesDeIntStream = IntStream.of(values);
		System.out.println(valuesDeIntStream.mapToLong(p ->p).summaryStatistics().getMin());
	}
	
	public void mostrarPromedioIntStream() {
		IntStream valuesDeIntStream = IntStream.of(values);
		System.out.println(valuesDeIntStream.mapToLong(p ->p).summaryStatistics().getAverage());
	}

}

interface Car {
	
	public String getModel();
	public default int getDoors() {
		return 4;
	}
	
}

class Ford implements Car {
	@Override
	public String getModel() {
		return this.getClass().getName();				
	}
}

class RatonAleman implements Car {
	@Override
	public String getModel() {
		return this.getClass().getName();				
	}
	
	@Override
	public int getDoors() {
		return 3;
	}
	
}

interface IOptional {
	public String getName(String name);
}

class IOtionalImpl implements IOptional{
	@Override
	public String getName (String name) {
		return Optional.ofNullable(name).orElse("Empty");
		    		
	}
}

class Java11 {
	
//	public boolean esVacioString(String string) {
//		return string.isBlank();
//			
//	}
//	public void repeatString(String string, int cant) {
//	System.out.println( string.repeat(int));
//		
//}	
//	public String esVacioString(String string) {
//	return string.stripTrailing();
//		
//}
	
	
	
}
