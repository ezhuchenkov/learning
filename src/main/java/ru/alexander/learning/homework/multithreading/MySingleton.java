package ru.alexander.learning.homework.multithreading;

public class MySingleton {
    static final Object monitor = new Object();
    /*Задача для самостоятельного выполнения: нужно написать thread-safe lazy singleton
lazy значит что он будет создаваться при первом обращении.
Нужно чтобы он был thread-safe, т.е. можно было обращаться из нескольких потоков, при этом должно гарантироваться что
экземпляр создается не больше одного раза. В примере по ссылке потокобезопасность не реализована
Эту задачу можно выполнить по-разному, усложнение кода может дать более высокую производительность.  С точки зрения перформанса лушче:
- уменьшать количество критических секций (synchronized)
- уменьшать содержимое критических секций
*/

    private static volatile MySingleton instance;

    public static MySingleton getInstance() {
        if (instance != null) {
            return instance;
        } else {
            synchronized (monitor) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}