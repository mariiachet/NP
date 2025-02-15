public class Main {
    //считаем с использованием типа float(32-битный)
    public static float CalculateFloat(float a, float b) {
        //вычисляем числитель дроби
        float numerator = (float) (Math.pow(a + b, 3) - Math.pow(a, 3));

        //вычисляем знаменатель дроби
        float denominator = 3 * a * b * b + (float) Math.pow(b, 3) + 3 * a * a * b;

        //делим числитель на знаменатель и возвращаем результат
        return numerator / denominator;
    }

    //считаем с использованием типа double(64-битный)
    public static double CalculateDouble(double a, double b) {
        //вычисляем числитель дроби
        double numerator = (double) (Math.pow(a + b, 3) - Math.pow(a, 3));

        //ычисляем знаменатель дроби
        double denominator =  3 * a * b * b + Math.pow(b, 3) + 3 * a * a * b;

        //делим числитель на знаменатель и возвращаем результат
        return numerator / denominator;
    }
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные
        float a_f = 1000f, b_f = 0.0001f;
        double a_d = 1000, b_d = 0.0001;

        // Вызываем методы для вычислений и сохраняем результаты
        float resultF = CalculateFloat(a_f, b_f);
        double resultD = CalculateDouble(a_d, b_d);

        System.out.println("Результат вычислений (float): " + resultF);
        System.out.println("Результат вычислений (double): " + resultD);
        }
    }
