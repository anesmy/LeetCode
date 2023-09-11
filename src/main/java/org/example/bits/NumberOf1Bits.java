package org.example.bits;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        return (int) binary.chars().filter(c -> c == '1').count();
    }
}
