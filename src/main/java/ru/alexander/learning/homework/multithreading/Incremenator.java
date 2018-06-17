package ru.alexander.learning.homework.multithreading;

//public class Incremenator extends Thread {
//    public volatile boolean mIsIncrement = true;
//
//    public void changeAction() {
//        mIsIncrement = !mIsIncrement;
//    }
//
//    @Override
//    public void run() {
//        do {
//            if (Thread.interrupted()) {
//                if (mIsIncrement) {
//                    Program.mValue++;
//                } else {
//                    Program.mValue--;
//                }
//                System.out.println(Program.mValue + " ");
//            } else {
//                return;
//            }
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                return;
//            }
//        }
//        while (true);
//
//    }
//}

class Incremenator extends Thread
{
    private volatile boolean mIsIncrement = true;

    public void changeAction()	//Меняет действие на противоположное
    {
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run()
    {
        do
        {
            if(!Thread.interrupted())	//Проверка прерывания
            {
                if(mIsIncrement) Program.mValue++;	//Инкремент
                else Program.mValue--;			//Декремент

                //Вывод текущего значения переменной
                System.out.print(Program.mValue + " ");
            }
            else
                return;		//Завершение потока

            try{
                Thread.sleep(1000);		//Приостановка потока на 1 сек.
            }catch(InterruptedException e){
                return;	//Завершение потока после прерывания
            }
        }
        while(true);
    }
}
