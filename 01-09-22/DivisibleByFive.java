import static java.lang.System.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class DivisibleByFive {
	public static void main(String[] args) {
		Stream.iterate(1,i->i+1).filter(i->i%5==0).limit(20).forEach(out::println); 
	}
}