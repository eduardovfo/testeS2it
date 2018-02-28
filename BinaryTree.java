package arvore;

public class BinaryTree {
	private int valor;
	private BinaryTree left;
	private BinaryTree right;

	public BinaryTree() {
	}

	public BinaryTree(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	public int soma() {
		return valor + (right == null ? 0 : right.soma()) + (left == null ? 0 : left.soma());
	}
}
