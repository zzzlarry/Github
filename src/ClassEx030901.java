
public class ClassEx030901 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 = new Name("001", "105050501");
		Name n2 = new Name("002", "105050502");
		Name n3 = new Name("003", "105050503");
		Name n4 = new Name("004", "105050504");
		Name n5 = new Name("005", "105050505");
		n1.setGender('男');
		n2.setGender('女');
		n3.setGender('女');
		n4.setGender('男');
		n5.setGender('男');
		
		n1.setHigh(160);
		n2.setHigh(161);
		n3.setHigh(162);
		n4.setHigh(163);
		n5.setHigh(164);
		System.out.println("姓名"+"    "+"ID"+"       "+"性別"+" "+"   "+"身高");
		System.out.println(n1.getName()+" " +n1.getID()+" "  +n1.getGender()+"   " +n1.getHigh());
		System.out.println(n2.getName()+" " +n2.getID()+" "  +n2.getGender()+"   " +n2.getHigh());
		System.out.println(n3.getName()+" " +n3.getID()+" "  +n3.getGender()+"   " +n3.getHigh());
		System.out.println(n4.getName()+" " +n4.getID()+" "  +n4.getGender()+"   " +n4.getHigh());
		System.out.println(n5.getName()+" " +n5.getID()+" "  +n5.getGender()+"   " +n5.getHigh());
	}
}
