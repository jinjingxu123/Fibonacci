package com.fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Fibonacci {
	
	/**
	 * Fibonacci获取指定长度的斐波那契数列的值
	 * java.math.BigDecimal,java.math.BigInteger都可用于数值类型处理值过大溢出的情况，建议使用BigDecimal
	 * @param count	长度
	 * @return
	 */
	public static BigDecimal of (int count) {
		BigDecimal defValue = new BigDecimal("1");
		// 如果输入的count小于3，直接返回默认值
		if (count < 3) {
			return defValue;
		}
		// 计算count指定长度的斐波那契数列的值
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
		// 迭代输出1——200的斐波那契数列的值
		for (int i = 1; i <= deepVal; i++) {
			BigDecimal fibonacciVal = Fibonacci.of(i);
			System.out.println("【Fibonacci值计算结果】，count值为：" + i + "时，对应的斐波那契数列的值为： " + fibonacciVal);
		}
	}
}
