package com.spring.di;

public class characterManager1 { //결합력 높음
	
	// 클래스 내부에서 외부 객체를 직접 생성
	// Manager클래스는 외부 클래스와의 결합력이 강하다. ( 의존성이 강하다. )
	
	Warrior warrior = new Warrior();
	Wizard wizard 	= new Wizard();
	Hunter hunter 	= new Hunter();
	
	void printCharacter1Info() {
		System.out.println(warrior.getOccupation() + "/" + warrior.getLevel());
	}
	void printCharacter2Info() {
		System.out.println(wizard.getOccupation() + "/" + wizard.getLevel());
	}
	void printCharacter3Info() {
		System.out.println(hunter.getOccupation() + "/" + hunter.getLevel());
	}
	
	
}
