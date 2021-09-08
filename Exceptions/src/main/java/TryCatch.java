public class TryCatch {

    public static void App(String[] args) throws Throwable {
    }

    public static void App1(String[] args) {
        try {
        } catch (Throwable t) {
        }
    }

    public static void throwsError(String[] args) {
        // Error - потомок Throwable
        throw new Error();
    }

    public static void throwingNullAndGettingNullPointerException(String[] args) {
        throw null;
    }

    public static void createNewErrorAndThrowingIt(String[] args) {
        Error ref = new Error(); // создаем экземпляр
        throw ref;               // "бросаем" его
    }

    public static class NullPointerExceptionHandleEndlessLoop {
        public static void main(String[] args) {
            f(null);
        }

        public static void f(NullPointerException e) {
            try {
                throw e;
            } catch (NullPointerException npe) {
                f(npe);
            }
        }
    }

    public static void print(String[] args) {
        System.out.println("sout");
        throw new Error();
    }

    public static class ReturnResult {
        public static double sqr1(double arg) { // надо double
            return arg * arg;           // double * double - это double
        }

        public static double sqr2(double arg) { // надо double
            int k = 1;                  // есть int
            return k;                   // можно неявно преобразовать int в double
        }

        // на самом деле, компилятор сгенерирует байт-код для следующих исходников
        public static double sqr3(double arg) { // надо double
            int k = 1;                  // есть int
            return (double) k;          // явное преобразование int в double
        }

        /**
         * Можно ничего не возвращать, а «повесить метод»
         */

        public static void LoopingMethod(String[] args) {
            double d = sqr4(10.0);   // sqr - навсегда "повиснет", и
            System.out.println(d);      // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
        }

        public static double sqr4(double arg) {
            while (true) ;               // Вот тут мы на века "повисли"
        }

        /**
         * Механизм исключений позволяет ничего не возвращать
         */
        public static double sqr5(double arg) {
            throw new RuntimeException();
        }

        public static double sqr6(double arg) {// согласно объявлению метода ты должен вернуть double
            long time = System.currentTimeMillis();
            if (time % 2 == 0) {
                return arg * arg;             // ок, вот твой double
            } else if (time % 2 == 1) {
                while (true) ;                 // не, я решил "повиснуть"
            } else {
                throw new RuntimeException(); // или бросить исключение
            }
        }

        public static void LoopingMethodTwo(String[] args) {
            // sqr - "сломается" (из него "выскочит" исключение),
            double d = sqr6(10.0);  // выполнение метода main() прервется в этой строчке и
            // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
            System.out.println(d); // и печатать нам ничего не придется!
        }

        public static double sqr7(double arg) {
            throw new RuntimeException(); // "бросаем" исключение
        }
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }

    public static class App1 {
        public static void main(String[] args) {
            // Пример: ОПЕРАТОР ПОСЛЕДОВАТЕЛЬНОСТИ
            int x = 42;    // первый шаг
            int y = x * x; // второй шаг
            x = x * y;     // третий шаг
            //...
        }
    }

    public static class App2 {
        public static void main(String[] args) {
            // Пример: ОПЕРАТОР ВЕТВЛЕНИЯ
            if (args.length > 2) {
                // первый шаг
                // второй шаг или тут
                //...
            } else {
                // или тут
                //...
            }
            // третий шаг
            //...
        }
    }

    public static class App3 {
        public static void main(String[] args) {
            // Пример: ОПЕРАТОР ЦИКЛА do..while
            int x = 1;
            do {
                //...
            } while (x++ < 10);
            //...
        }
    }

    public static class App4 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            f(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println("#1.out"); // вернулись
        } // выходим из текущего фрейма, кончились инструкции

        public static void f() {
            System.err.println(".   #2.in");
            g(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println(".   #2.out");  //вернулись
        } // выходим из текущего фрейма, кончились инструкции

        public static void g() {
            System.err.println(".   .   #3.in");
            h(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println(".   .   #3.out"); // вернулись
        } // выходим из текущего фрейма, кончились инструкции

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.RETURN");
                return; // выходим из текущего фрейма по 'return'
            }
            System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
        }
    }

    public static class App5 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            f(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println("#1.out"); // ПРОПУСТИЛИ!
        }

        public static void f() {
            System.err.println(".   #2.in");
            g(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
        }

        public static void g() {
            System.err.println(".   .   #3.in");
            h(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
        }

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.THROW");
                throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
            }
            System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
        }
    }

    public static class App6 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            try {
                f(); // создаем фрейм, помещаем в стек, передаем в него управление
            } catch (Error e) { // "перехватили" "летящее" исключение
                System.err.println("#1.CATCH");  // и работаем
            }
            System.err.println("#1.out");  // работаем дальше
        }

        public static void f() {
            System.err.println(".   #2.in");
            g(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
        }

        public static void g() {
            System.err.println(".   .   #3.in");
            h(); // создаем фрейм, помещаем в стек, передаем в него управление
            System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
        }

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.THROW");
                throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
            }
            System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
        }
    }
}










