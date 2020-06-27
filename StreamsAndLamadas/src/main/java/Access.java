import java.util.List;
import java.util.stream.Collectors;

public class Access {
public double average(List<Integer> l)
{
  return l.stream()
      .mapToInt(val -> val).average().orElse(0.0);
}
public List<String> checkLength(List <String> a)
{
  return a.stream()
  .filter(value -> ((value.length()==3) && (value.charAt(0)=='a') ))
  .collect(Collectors.toList()); 
}
public List<String> checkPallindrome(List <String> a)
{
  return a.stream()
    .filter(value -> check(value))  
    .collect(Collectors.toList());
}

private static boolean  check(String value) {
  String s="";
  for(int i1=value.length()-1;i1>=0;i1--)
  {
    s+=value.charAt(i1);
  }
  if(value.equals(s))
  {
  return(true);
  }
  else {
    return(false);
  }
}
}