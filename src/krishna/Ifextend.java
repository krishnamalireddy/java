package krishna;
interface basic{
	void addition();
}
	interface loops extends basic{
		void whileloop();
		void  dowhileloop();
		void forloop();
	}
		interface statements extends loops{
			void continuestatement();
			void breakstatement();
		}
		class myphone implements statements {
			
		

			
			public void whileloop() {
				System.out.println("Implement whileloop().");
				
			}

			
			public void dowhileloop() {
				System.out.println("shoot dowhileloop().");
				
			}

			
			public void forloop() {
				System.out.println("Implement forloop().");
				
			}

		
			public void addition() {
				System.out.println("Implement addition().");
				
			}

			
			public void continuestatement() {
				System.out.println("Implement continuestatement().");
				
			}


			public void breakstatement() {
				System.out.println("Implement breakstatement().");
			
				
			}}
		public 	class Ifextend {
				public static void main(String arg[]) {
					myphone ob = new myphone();
				ob.addition();
				ob.whileloop();
				ob.dowhileloop();
				ob.forloop();
				ob.continuestatement();
				ob.breakstatement();
				
				
				
				
					
			}
			}
			
			
			
			
			
		
			
			
			
			
		
		
