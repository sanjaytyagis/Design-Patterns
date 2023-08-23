package AdapterDesignPattern;

public class JpgShower implements AdvancedImageViewer {

	@Override
	public void showPng(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showJpg(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Showing jpg file. Name: "+ fileName);		
	}

}
