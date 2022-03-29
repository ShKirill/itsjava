package comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Boy implements Comparable<Boy>{
	private final String name;
	private double age;
	private double high;
	

	@Override
	public int compareTo(Boy o) {
		return (int) (high - o.high);
	}


	
	
}
