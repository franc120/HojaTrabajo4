/**
 * 
 */

/**
 * @author francisco Avila
 *
 */
public class MiStack<AnyType> {
	
	//stack que contiene la cabeza del nodo
	public Minodo<AnyType> head;
	
	//constructor
	public MiStack() {
		head = new Minodo<AnyType>();
		
	}	
	
	//metodo chequea que el estack este vacio
	public boolean isEmpty() {
		
		if(head.next == null) {
			return true;
		}
		
		return false;
		
	}

	// inserta el metodo
	public void push(AnyType x) {
		
			Minodo<AnyType> temp = new Minodo<AnyType>();
		
			temp.data = x;
			temp.next = head.next;
			head.next = temp;
		
	}
	

	//elimina el método
	public AnyType pop() {
		
		if(isEmpty() == true) {
			return null;
		}
		else {
			Minodo<AnyType> temp = new Minodo<AnyType>();
		
			temp.data = head.next.data;
			head.next = head.next.next;
		
			return temp.data;
		}	
	}

	//agarra el metodo y retorna el valor más alto
	public AnyType peek() {
		return head.next.data;
	}

	//este metodo manda a llamar a mi nodo
	public void print() {
		
		head.next.print();
		
	}

}