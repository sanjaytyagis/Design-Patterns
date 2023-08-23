package AdapterDesignPattern;

public class ImageAdapter implements ImageViewer{

	AdvancedImageViewer advancedImageViewer;
	
	public ImageAdapter(String imageFormat){
		   
	      if(imageFormat.equalsIgnoreCase("png") ){
	         advancedImageViewer = new PngShower();			
	      }else if (imageFormat.equalsIgnoreCase("jpg")){
	         advancedImageViewer = new JpgShower();
	      }	
	   }
	
	@Override
	public void show(String imageFormat, String fileName) {
		// TODO Auto-generated method stub
		if(imageFormat.equalsIgnoreCase("png")){
	         advancedImageViewer.showPng(fileName);
	      }
	      else if(imageFormat.equalsIgnoreCase("jpg")){
	         advancedImageViewer.showJpg(fileName);
	      }
	}

}
