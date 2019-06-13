package cn.itcast.chapter09.model1.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Calculator {
	private String firstNum;
	private String secondNum;
	private char operator;
	
	private Map<String,String> errors=new HashMap<String,String>();
	
	public String getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(String firstNum) {
		this.firstNum = firstNum;
	}
	public String getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(String secondNum) {
		this.secondNum = secondNum;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public Map<String, String> getErrors() {
		return errors;
	}
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	
	public String calculate() {
		BigDecimal result = null;
		
		BigDecimal first=  new BigDecimal(firstNum);
		BigDecimal second = new BigDecimal(secondNum);
		switch (operator) {
		case '+':
			result = first.add(second);
			break;
		case '-':
			result = first.subtract(second);
			break;
		case '*':
			result = first.multiply(second);
			break;
		case '/':
			if ("0".equals(secondNum)) {
				throw new RuntimeException("��������Ϊ0��");
			}
			result = first.divide(second);
			break;
		default:
			break;
		}
		return result.toString();
	}
	
	public boolean validate() {
        
		boolean flag = true;
		Pattern p = Pattern.compile("\\d+");// �������ʽ��ƥ������
		if (firstNum == null || "".equals(firstNum)) { // �жϲ���Ϊ��
			errors.put("firstNum", "��һ������������Ϊ��");
			flag = false;
		} else if (!p.matcher(firstNum).matches()) { // �жϲ���Ϊ������
			errors.put("firstNum", "��һ������������Ϊ����");
			flag = false;
		}
		if (secondNum == null || "".equals(secondNum)) { 
			errors.put("secondNum", "�ڶ�������������Ϊ��");
			flag = false;
		} else if (!p.matcher(secondNum).matches()) {
			errors.put("secondNum", "�ڶ�������������Ϊ����");
			flag = false;
		}
		return flag;
	}
	
	public String isNullorEmpty() {
		if(firstNum==null) {
			return "����Null"; 
		}
		if("".equals(firstNum)) {
			return "���ǿյ��ַ���";
		}
		return "����ֵ";
		
	}
	
	public String isOperator() {
		if(operator == '\0') {
			return "����Null"; 
		}
		if("".equals(operator)) {
			return "���ǿյ��ַ���";
		}
		return "����ֵ";
		
	}
	
}