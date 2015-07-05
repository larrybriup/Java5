package com.briup.enumeration;

//import java.rmi.dgc.VMID;

public enum VMEnum implements Info {
	// ONE,TWO,THREE;

	ONE(1) {
		public int getInfo() {
			// TODO Auto-generated method stub
			return 1;
		}
	},
	TWO(3) {
		public int getInfo() {
			// TODO Auto-generated method stub
			return 3;
		}
	},
	THREE(5) {
		public int getInfo() {
			// TODO Auto-generated method stub
			return 5;
		}
	};
	private int i;

	private VMEnum(int i) {
		this.i = i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public static void main(String[] args) {
		VMEnum ONE = VMEnum.ONE;
		ONE.setI(9);
		System.out.println(ONE.getI());

		VMEnum TWO = VMEnum.TWO;
		ONE.setI(900);
		System.out.println(ONE.getI());
	}

	@Override
	public int getInfo() {
		// TODO Auto-generated method stub
		return 0;
	}
}

interface Info {
	int getInfo();
}
