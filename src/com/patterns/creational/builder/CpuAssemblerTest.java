package com.patterns.creational.builder;

import com.patterns.creational.builder.CPU.CPUAssembler;

public class CpuAssemblerTest {

	public static void main(String[] args) {

		CPUAssembler assembler = new CPUAssembler();
		
		//Building an old slow CPU
		CPU oldPentium = assembler.addGraphicsCard(false)
				.addHDD(120)
				.addProcessor("Pentium P1")
				.addRAM(2)
				.addTouchScreen(false)
				.build();
		
		assembler.clean();
		
		// Building a modern CPU with i7 processor
		CPU newCorei7 = assembler.addGraphicsCard(true)
				.addHDD(1024)
				.addProcessor("Core i7")
				.addRAM(16)
				.addTouchScreen(true)
				.build();
		
		assembler.clean();
		
		// Building a notebook
		CPU noteBook= assembler.addGraphicsCard(false)
				.addHDD(500)
				.addRAM(8)
				.addTouchScreen(true)
				.addProcessor("Core i5")
				.build();
		
		assembler.clean();
		
		// Building a dummy CPU with no value set;
		CPU dummy = assembler.build();
		
		System.out.println(oldPentium.toString());
		System.out.println(newCorei7.toString());
		System.out.println(noteBook.toString());
		System.out.println(dummy.toString());
	}

}
