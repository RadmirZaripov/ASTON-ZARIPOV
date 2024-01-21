import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Устанавливаем число 10 в качестве ввода (может быть изменено на ввод с клавиатуры)
        int number = 10;

        // Проверяем условие и выводим сообщение
        if (number > 7) {
            System.out.println("Привет");
        }

        // Закрываем Scanner, чтобы избежать утечек ресурсов
        scanner.close();
    }
}