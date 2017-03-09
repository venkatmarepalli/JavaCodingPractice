package com.journaldev.threads;

public class Message {
    private String msg;
    private int num1;
    private int num2;
    public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	private int result;
    
    public Message(String str){
        this.msg=str;
    }

    public int getNum() {
		return num1;
	}

	public void setNum(int num) {
		this.num1 = num;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMsg() {
        return msg;
    }

    public void setMsg(String str) {
        this.msg=str;
    }

}
