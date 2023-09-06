package org.example;

import java.math.BigInteger;

public class ReverseBits {
    public int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n))
                .replace(' ', '0');

        StringBuilder stringBuilder = new StringBuilder();
        String reversed = stringBuilder.append(binary).reverse().toString();

        return new BigInteger(reversed, 2).intValue();
    }
}
