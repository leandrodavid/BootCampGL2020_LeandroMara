package mockito.example.services.impl;

import mockito.example.services.DataService;

public class DataServiceImpl implements DataService {

	@Override
	public int[] getListOfNumbers() {
		
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
