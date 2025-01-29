import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
  public static String classifySalary(Employee e) {
		if (e.getSalary() < 1000) {
			return "low";
		}
		else if (e.getSalary() > 1000 && e.getSalary() < 5000) {
			return "medium";
		}
		else {
			return "hight";
		}
		
	}
    public static void main(String[] args) {
       List<Employee> emps = Arrays.asList(
			 new Employee(1, "tch", 500),
			 new Employee(2, "ch", 2000), 
			 new Employee(3, "gk", 7000));
	 
	 
	 Map<String, List<Employee>> mymap = emps.stream().collect(Collectors.groupingBy(Main::classifySalary));
	 
	 for (var x: mymap.entrySet()) {
		 System.out.println(x.getKey() + " " + x.getValue());
	 }
     Double percent = 10.0 ; 
     double res = emps.stream().collect(Collectors.reducing(0.0, e -> e.getSalary() * percent / 100, (s1, s2) -> s1 + s2));
     System.out.println(res);
		
	}
  
}