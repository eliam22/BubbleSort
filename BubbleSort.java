import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BubbleSort {

    @GetMapping("/")
    public String bubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Tu algoritmo de ordenamiento Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Construir una cadena con los valores ordenados para devolverla como respuesta
        StringBuilder sortedArray = new StringBuilder();
        sortedArray.append("Array ordenado: ");
        for (int value : arr) {
            sortedArray.append(value).append(" ");
        }
        return sortedArray.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(BubbleSort.class, args);
    }
}


