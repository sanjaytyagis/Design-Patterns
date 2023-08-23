package AdapterDesignPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GalleryApp gallery = new GalleryApp();

	      gallery.show("jpeg", "naruto.jpeg");
	      gallery.show("png", "sasuke.png");
	      gallery.show("jpg", "jiraya.jpg");
	      gallery.show("gif", "sakura.gif");
	   }
}
