import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> arrStrng = list.stream().filter(s->s.length()<4).collect(Collectors.toList());
    }
}
