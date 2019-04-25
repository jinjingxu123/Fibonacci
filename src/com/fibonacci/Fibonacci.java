package com.fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Fibonacci {
	
	/**
	 * Fibonacci��ȡָ�����ȵ�쳲��������е�ֵ
	 * java.math.BigDecimal,java.math.BigInteger����������ֵ���ʹ���ֵ������������������ʹ��BigDecimal
	 * @param count	����
	 * @return
	 */
	public static BigDecimal of (int count) {
		BigDecimal defValue = new BigDecimal("1");
		// ��������countС��3��ֱ�ӷ���Ĭ��ֵ
		if (count < 3) {
			return defValue;
		}
		// ����countָ�����ȵ�쳲��������е�ֵ
		BigDecimal[] valAry = new BigDecimal[count];
		valAry[0] = defValue;
		valAry[1] = defValue;
		for (int i = 2; i < count; i++) {
			valAry[i] = valAry[i-1].add(valAry[i-2]);
		}
        return valAry[count - 1];
	}
	
	public static void main(String[] args) {
		int deepVal = 200;
		// �������1����200��쳲��������е�ֵ
		for (int i = 1; i <= deepVal; i++) {
			BigDecimal fibonacciVal = Fibonacci.of(i);
			System.out.println("��Fibonacciֵ����������countֵΪ��" + i + "ʱ����Ӧ��쳲��������е�ֵΪ�� " + fibonacciVal);
		}
	}
}
