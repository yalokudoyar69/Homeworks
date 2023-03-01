package homework12;


public class WorkingWithInitialization {

    static int count = 0;

        static {
            count++;
            System.out.println("Статичний блок ініціалізації " + count);
        }
        {
            count++;
            System.out.println("Блок ініціалізації " + count);
        }
        {
            count++;
            System.out.println("Блок ініціалізації " + count);
        }
        public WorkingWithInitialization() {
            System.out.println("Конструктор класу");
        }

        static {
            count++;
            System.out.println("Статичний блок ініціалізації " + count);
        }

    }

