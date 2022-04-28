import java.util.Scanner;
class Cpudls{
	public static void main(String[] args) {
		cpu c=new cpu();
	}
}
class cpu{
	
	int price;
	cpu(){
		processor p=new processor();
		p.proinput();
		ram r=new ram();
		r.raminput();
		System.out.println("Details of CPU");
		p.prodisplay();
		r.ramdisplay();
	}
	class processor{
		Scanner sn=new Scanner(System.in);
		int ncore;
		String manufacturer;
		void proinput(){
			System.out.println("Enter Processor details:");
			System.out.print("Enter number of Core:");
			ncore=sn.nextInt();
			System.out.print("Enter manufacturer:");
			manufacturer=sn.next();
		}
		void prodisplay(){
			System.out.println("\n...............\n");
			System.out.println("Processor");
			System.out.println("\n...............\n");
			System.out.println("Number of Cores:"+ncore);
			System.out.println("Manufacturer:"+manufacturer);
		}
	}
	static class ram{
		Scanner sn=new Scanner(System.in);
		int memory;
		String manufacturer;
		void raminput(){
			System.out.println("Enter details of RAM:");
			System.out.print("Enter memory:");
			memory=sn.nextInt();
			System.out.print("Enter manufacturer:");
			manufacturer=sn.next();
		}
		void ramdisplay(){
			System.out.println("\n...............\n");
			System.out.println("RAM");
			System.out.println("\n.................\n");
			System.out.println("Memory:"+memory);
			System.out.println("Manufacturer:"+manufacturer);
		}
	}
}