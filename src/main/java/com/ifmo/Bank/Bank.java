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

    public Account createAccount(long userId){
        Account acc = new Account(userId);
        accMap.put(userId, acc);
        return acc;
    }
    //public double getAmount(long accId){}
    //public void blockAccoint(long accId){}
    //public boolean isAccountBlocked(long accId){}

    public void changeAmount(long accId, double amount) throws RuntimeException{
        synchronized (this) {
            for (ConcurrentMap.Entry<Long, Account> entry : accMap.entrySet()) {
                if (entry.getKey() == accId && !entry.getValue().isBlocked()) {
                    if (entry.getValue().getAmount() + amount >= 0 )
                        entry.getValue().addAmount(amount);
                    else
                        System.out.println("На счету недостаточно средств");


                    /*
                    try {
                        entry.getValue().addAmount(amount);
                    } catch (NoMoneyException e) {
                        throw new NoMoneyException("На счету недостаточно средств");
                    }
                     */
                }

            }
        }
    }

    public void transferMoney(long srcAccId, long dstAccId, double amount) {
        synchronized (this) {
            for (ConcurrentMap.Entry<Long, Account> entry : accMap.entrySet()){

                if(entry.getKey()==srcAccId){
                    changeAmount(entry.getValue().getId(), -1*amount);
                }

                if(entry.getKey()==dstAccId){
                    changeAmount(entry.getValue().getId(), amount);
                }
            }
        }


    }
}
