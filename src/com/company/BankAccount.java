package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        System.out.println("у вас осталось "+ amount);
        return amount;
    }
    void deposit(double sum ){
        amount+=sum;


    } void withDraw(int sum) throws LimitException {
        if (sum>amount){
            throw new LimitException("Запращиваемая сумма вывода больше вашего баланса",amount);
        }
        else {
            amount-=sum;
            System.out.println("было снято"+sum);
            System.out.println("осталось"+amount);

        }


    }
}
