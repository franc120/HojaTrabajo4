/**
 * 
 */

/**
 * @author francisco Avila
 *
 */
public class MiCola<Anytype> {

	//"Mi cola" tiene cola y cabeza.
		public Midoblenodo<Anytype> head;
		public Midoblenodo<Anytype> tail;
		
		//constructor
		public MiCola() {
			head = new Midoblenodo<Anytype>();
			tail = new Midoblenodo<Anytype>();
			head.next = tail;
			head.prev = null;
			tail.next = null;
			tail.prev = head;
		}
		
		//metodo de eliminación
		public void enqueue(Anytype x) {
			
			Midoblenodo<Anytype> temp = new Midoblenodo<Anytype>();
			
				temp.data = x;
				temp.prev = tail.prev;
				temp.next = tail;
				(temp.prev).next = temp;
				(temp.next).prev = temp;
		}
		
		//metodo de eliminación
		public Anytype dequeue() {
			
			Midoblenodo<Anytype> temp = new Midoblenodo<Anytype>();
			
			if(isEmpty() == true) {
				return null;
			}
			else {
				temp.data = head.next.data;
				head.next = head.next.next;
				head.next.prev = head;
				
				return temp.data;
			}
		}

		//devuelve el nodo top para sin eliminarlo
		public Anytype peek() {
			
			if(isEmpty() == true) {
				return null;
			}
			else {
				return head.next.data;
			}
		}

		//chequea si la cola está vacia
		public boolean isEmpty() {
			
			if(head.next == tail) {
				return true;
			}
			return false;
		}
		
		//este metodo llama al metodo print de midoblenodo
		public void print() {
			
			head.next.print();
			
		}
}
