/**
 * 
 */

/**
 * @author fracisco avila
 *
 */
public class Minodo<Anytype> {
	
	//estos contienen las información de los elementos
		public Anytype data;
		public Minodo<Anytype> next;

		//constructor
		public Minodo() {
			data = null;
			next = null;
		}
		
		//metodo para hacer pruebas
		public void print() {
			if(this == null || this.data == null) {
				return;
			}
			else{
				System.out.print(data);
				if(this.next != null) {
					this.next.print();
				}
			}	
		}

}
