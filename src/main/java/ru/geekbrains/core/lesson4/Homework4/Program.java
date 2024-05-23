package ru.geekbrains.core.lesson4.Homework4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный баланс для счета 1: ");
        double initialBalance1 = scanner.nextDouble();
        Account account1 = new Account(initialBalance1);

        System.out.print("Введите начальный баланс для счета 2: ");
        double initialBalance2 = scanner.nextDouble();
        Account account2 = new Account(initialBalance2);

        System.out.print("Введите сумму для перевода со счета 1 на счет 2: ");
        double transferAmount = scanner.nextDouble();

        Transaction transaction = new Transaction();
        transaction.transfer(account1, account2, transferAmount);

        System.out.println("Баланс счета 1: " + account1.getBalance());
        System.out.println("Баланс счета 2: " + account2.getBalance());
    }
}
