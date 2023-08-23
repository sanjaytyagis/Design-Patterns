package AdapterDesignPattern;

public class PngShower implements AdvancedImageViewer {

	@Override
	public void showPng(String fileName) {
		System.out.println("Showing png file. Name: "+ fileName);
		
	}

	@Override
	public void showJpg(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
