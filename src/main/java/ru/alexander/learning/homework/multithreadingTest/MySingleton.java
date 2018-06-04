package ru.alexander.learning.homework.multithreadingTest;

import java.util.Date;

public class MySingleton implements Runnable {

    /*Задача для самостоятельного выполнения: нужно написать thread-safe lazy singleton
lazy значит что он будет создаваться при первом обращении.
Нужно чтобы он был thread-safe, т.е. можно было обращаться из нескольких потоков, при этом должно гарантироваться что
экземпляр создается не больше одного раза. В примере по ссылке потокобезопасность не реализована
Эту задачу можно выполнить по-разному, усложнение кода может дать более высокую производительность.  С точки зрения перформанса лушче:
- уменьшать количество критических секций (synchronized)
- уменьшать содержимое критических секций
*/

    private static MySingleton instance;

    public static synchronized MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
            System.out.println("1");
        }else {
            System.out.println("0");
        }
        return instance;
    }

    @Override
    public void run() {

    }
}