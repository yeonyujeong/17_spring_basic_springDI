package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DI_Ex02 {
	
	@RequestMapping(value="/diEx02" , method=RequestMethod.GET)
	public String main() {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:CharacterApplicationContext.xml");
		
		// 방법 1) .getBean("bean의 id값" , 클래스명.class);
		//CharacterManager2 cm2 = context.getBean("characterManager2" , CharacterManager2.class); 

		// 방법 2) .getBean("bean의 id값");
		//CharacterManager2 cm2 = (CharacterManager2)context.getBean("CharacterManager2");
		
		// 방법 3) bean이 유일한경우 bean의 id값 생략 가능
		CharacterManager2 cm2 = context.getBean(CharacterManager2.class);
		
		System.out.println("======= XML 파일을 통한 객체 주입 =======");
		
		Warrior warrior1  = context.getBean("warrior" , Warrior.class);
		Wizard  wizard1	  = context.getBean("wizard" , Wizard.class);
		Hunter  hunter1_1 = context.getBean("hunter1" , Hunter.class);
		Hunter  hunter1_2 = context.getBean("hunter2" , Hunter.class);
		
		cm2.setWarrior(warrior1);
		cm2.printCharacter1Info();
		
		cm2.setWizard(wizard1);
		cm2.printCharacter2Info();
		
		cm2.setHunter(hunter1_1);
		cm2.printCharacter3Info();
		
		cm2.setHunter(hunter1_2);
		cm2.printCharacter3Info();
		
		System.out.println("===========================================");
		
		Warrior warrior2  = context.getBean(Warrior.class);
		Wizard  wizard2	  = context.getBean(Wizard.class);
		//Hunter  hunter2 = context.getBean(Hunter.class); 
		
		cm2.setWarrior(warrior2);
		cm2.printCharacter1Info();
		
		cm2.setWizard(wizard2);
		cm2.printCharacter2Info();
		
		//cm2.setHunter(hunter2);
		//cm2.printCharacter3Info();
		
		System.out.println("===========================================");

		
		
		return "home";
		
	}
	
}
