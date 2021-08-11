public class JvmComprehension {  // поиск и загрузка класса
    // поиск в кэше Application ClassLoader
    // поиск в кэше Platform ClassLoader
    // поиск в кэше Bootstrap ClassLoader
    // поиск Bootstrap ClassLoader в jdk
    // поиск Platform ClassLoader в jre
    // поиск Application ClassLoader в корневой папке
    // связывание класса (проверка, подготовка, разрешение символьных ссылок)
    // загрузка класса в область памяти Metaspace
    public static void main(String[] args) { // 1 создание фрейма main() в области памяти Stack Memory
        int i = 1;                      // 2 создание переменной "i" равной 1 в фрейме main()
        Object o = new Object();        // 3 создание экземпляра класса Object в области памяти Heap Memory,
                                        // создание переменгной "о" в фрейме main() и ссылки на экземпляра класса Object
        Integer ii = 2;                 // 4 создание экземпляра класса Integer в области памяти Heap Memory,
                                        // создание переменгной "ii" в фрейме main() и ссылки на экземпляра класса Integer
        printAll(o, i, ii);             // 5 создание фрейма printAll() в области памяти Stack Memory
        System.out.println("finished"); // 7 оздание экземпляра класса String в String Pool в области памяти Heap Memory,
                                        // cоздание фрейма println() в области памяти Stack Memory
                                        // создание переменной в фрейме println() и ссылки на экземпляр класса String
    } // завершение программы и освобождение всей памяти

    private static void printAll(Object o, int i, Integer ii) { // 6 создание переменной "о" в фрейме printAll()
        // и ссылки на экземпляр класса Object
        // в области памяти Heap Memory в раздел Eden
        // создание переменной "i" равной 1 в фрейме printAll()
        // создание переменной "ii" в фрейме printAll()
        // и ссылки на экземпляр класса Integer
        // в оласти памяти Heap Memory в раздел Eden
        Integer uselessVar = 700;                   // 7 создание экземпляра класса Integer
                                                    // в области памяти Heap Memory в раздел Eden,
                                                    // создание переменгной "uselessVar" в фрейме printAll()
                                                    // и ссылки на экземпляра класса Integer
        System.out.println(o.toString() + i + ii);  // 6 оздание экземпляров класса String в String Pool
                                                    // в области памяти Heap Memory в раздел Eden,
                                                    // cоздание фрейма println() в области памяти Stack Memory
                                                    // создание переменной в фрейме println()
                                                    // и ссылки на экземпляр класса String
    } // удаление фрейма printAll() в области памяти Stack Memory и ссылок на экземпляры классов
    // Stop The World
    // удаление экземпляра класса Integer uselessVar сборщиком мусора
}
