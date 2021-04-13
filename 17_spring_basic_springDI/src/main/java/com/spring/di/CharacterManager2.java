package com.spring.di;

public class CharacterManager2 { 
	
	Warrior warrior;
	Wizard 	wizard;
	Hunter 	hunter;
	
	public CharacterManager2() {}
	
	
	// 방법1) 생성자를 통하여 외부 객체를 주입한다.
	// Manager클래스와 외부 클래스와의 결합력이 약하다. (의존성이 약하다.)
	public CharacterManager2(Warrior warrior) {
		this.warrior = warrior;
	}
	public CharacterManager2(Wizard wizard) {
		this.wizard = wizard;
	}
	public CharacterManager2(Hunter hunter) {
		this.hunter = hunter;
	}
	
	// 방법2) setter 메소드를 통하여 외부 객채를 주입한다.
	// Manager클래스와 외부 클래스와의 결합력이 약하다. (의존성이 약하다.)
	public Warrior getWarrior() {
		return warrior;
	}
	public void setWarrior(Warrior warrior) {
		this.warrior = warrior;
	}
	public Wizard getWizard() {
		return wizard;
	}
	public void setWizard(Wizard wizard) {
		this.wizard = wizard;
	}
	public Hunter getHunter() {
		return hunter;
	}
	public void setHunter(Hunter hunter) {
		this.hunter = hunter;
	}
	
	//----------------------------------------------------------------
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
