package ru.netology.sqr;
public class SquareNumbers {
    public int calculateSquareNumber(int border1, int border2) {

        int number_of_numbers = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > border1 && i * i < border2) {
                number_of_numbers++;
            }
        }
    return number_of_numbers;
    }
}


