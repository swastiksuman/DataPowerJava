package com.webservice.prepaidservice.dto;

public class Address {
	private String State;

	private String Main;

	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}

	public String getMain() {
		return Main;
	}

	public void setMain(String Main) {
		this.Main = Main;
	}

	@Override
	public String toString() {
		return "ClassPojo [State = " + State + ", Main = " + Main + "]";
	}
}
