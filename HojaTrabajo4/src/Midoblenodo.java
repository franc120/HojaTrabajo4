/**
 * 
 */

/**
 * @author francisco Avila
 *
 */
public class Midoblenodo<Anytype> {
	
	//estos contienen las información de los elementos
			public Anytype data;
			public Midoblenodo<Anytype> next;
			public Midoblenodo<Anytype> prev;

			//constructor
			public Midoblenodo() {
				data = null;
				next = null;
				prev = null;
			}
			
			//metodo para hacer pruebas
			public void print() {
				if(this == null || this.data == null) {
					return;
				}
				else{
					System.out.print(data);
						this.next.print();
					}
				}	
			}

