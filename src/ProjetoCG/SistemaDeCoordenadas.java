package ProjetoCG;

public class SistemaDeCoordenadas {
	
	public double ndcx;
	public double ndcy;
	public double dcx;
	public double dcy;
	
	//Para coordenadas normalizadas
	public double paraNDCX(double x){
		
		
		ndcx = (x - 0)/ (500 - 0);

		return ndcx;
	}
	
	public double paraNDCY(double y){
		
		
		ndcy = (y - 0)/( 500 - 0);

		return ndcy;
	}
	//Para coordenadas do dispositivo
	public int paraNCX(){
		
		dcx = ((500-1)* ndcx); 
		dcx = Math.round(dcx);
		
		return (int) dcx;
		
	}
	
	public int paraNCY(){

		
		dcy = ((500-1)* ndcy); 
		dcy = Math.round(dcy);
		
		return (int) dcy;
	}
	
	
}
