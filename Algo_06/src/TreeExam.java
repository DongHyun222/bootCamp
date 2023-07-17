
public class TreeExam {
	
	static class Node<K,V>{	//K,V와 같이 받는 형식을 Generic이라고 부름 얘는 현재 타입을 지정하는게 아니라 향후에 객체를 만들때 객체를 지정하겠다는 의미
		private K key;
		private V value;
		private Node<K,V> left;		//왼쪽 포인터
		private Node<K,V> right;	//오른쪽 포인터
		
		public Node(K key, V value, Node<K, V> left, Node<K, V> right) {
			super();
			this.key = key;
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
		public Node(K key, V value) {
			this(key, value, null, null);
		}
		
		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			return "K: " + key + ", V: " + value + ", LEFT: " + left + ", RIGHT: " + right;
		}
	}
	
	
	
	public static void main(String[] args) {
		Node<String, Integer> node = new Node<String, Integer>("홍", 90, null, null);
		Node<String, Integer> node2 = new Node<String, Integer>("홍", 90);
		System.out.println(node.toString());
		System.out.println(node2.toString());
	}
}
