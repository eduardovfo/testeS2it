package arvore;

class TesteABC {
	public static String gerarNumeroC(String a, String b) {
		if (a == null || b == null) {
			return "";
		}
		String c = "";
		int limite = Math.max(a.length(), b.length());
		for (int i = 0; i <= limite; i++) {
			if (i < a.length()) {
				c += a.charAt(i);
			}
			if (i < b.length()) {
				c += b.charAt(i);
			}
		}
		System.out.println(c);
		if (Long.valueOf(c) > 1000000) {
			c = "-1";
		}
		return c;
	}

	public static void gerar(String a, String b) {
		System.out.println("Valor de C: " + gerarNumeroC(a, b));
	}

	public static void main(String[] args) {
		gerar("10256", "512");
	}
}