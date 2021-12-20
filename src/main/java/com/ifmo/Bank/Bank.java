package com.ifmo.Bank;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* Написать приложение Bank, методы которого вызываются в многопоточной среде.
   Это значит, что любой метод может быть вызван одновременно из сотни потоков.
      Наиболее важная реализация - метод transferMoney()
   Он должен атомарно перевести деньги с одного счёта на другой.
   Это значит, что во время перевода никакой другой поток не может ни увидеть
   промежуточное состояние счетов, ни выполнять над ними операции.
   Ещё все операции должны выполняться по возможности параллельно.
 */
public class Bank extends Thread  {
    private ConcurrentMap<Long, Account> accMap = new ConcurrentHashMap<>();

    public Account createAccount(long userId) throws RuntimeException {
        if (!accMap.containsKey(userId)){
            Account acc = new Account(userId);
            accMap.put(userId, acc);
            return acc;
        }
        else
            throw new RuntimeException("Аккаунт с id " + userId + " уже существует");

    }
    //public double getAmount(long accId){}
    //public void blockAccoint(long accId){}
    //public boolean isAccountBlocked(long accId){}

    public synchronized void  changeAmount(long accId, double amount) throws RuntimeException{
        Account acc=accMap.get(accId);
                if (!acc.isBlocked()) {
                    if (acc.getAmount() + amount >= 0 )
                        acc.addAmount(amount);
                    else
                        throw new RuntimeException("На счету недостаточно средств. Баланс: " + acc.getAmount());


                    //в сообщ об ош больше инф класть (значение изза кот вылезла ошибка)
                    //проверки на блокировку счета и на наличие средств вывести в отд метод

                }


    }

    public synchronized void transferMoney(long srcAccId, long dstAccId, double amount) {
        Account fromAcc=accMap.get(srcAccId);
        Account toAcc=accMap.get(dstAccId);
        changeAmount(fromAcc.getUserID(), -1*amount);
        changeAmount(toAcc.getUserID(), amount);

    }


}
