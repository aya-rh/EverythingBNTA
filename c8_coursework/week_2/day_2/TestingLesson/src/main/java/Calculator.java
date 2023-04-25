public class Calculator {
    Long add(Long a,Long b){
        return a + b;
    }

    Long subtract(Long a, Long b){
        return a - b;
    }

    Long sumArray(Long[] numbers){
        Long sum = 0L;

        for(var num : numbers) {
            sum += num;

        }
        return sum;
    }

    Long productOfArray(Long[] numbers){
        Long product = 1L;

        for (var num : numbers) {
            product *= num;
        }
        return product;
    }

    // add (20, 10) - first argument is first -> first parameter etc. so 20 would be a.
}
