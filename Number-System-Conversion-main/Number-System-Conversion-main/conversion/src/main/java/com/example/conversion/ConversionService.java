package com.example.conversion;

import org.springframework.stereotype.Service;

@Service
public class ConversionService {

    public int decimalToBinary(int decimal) {
        int rem,bin=0,pow=0;
        int n=decimal;
        while(n>0){
            rem=n%2;
            bin= bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        return bin;
    }

    public int binaryToDecimal(int binary) {
        int pow=0,dec=0;
        int n=binary;
        while(n>0){
            int ld=n%10;
            dec=dec+(ld * (int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        return dec;
    }
}
