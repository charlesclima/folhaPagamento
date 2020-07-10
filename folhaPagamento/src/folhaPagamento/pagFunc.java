package folhaPagamento;

public class pagFunc {

	public static void main(String[] args) {
		
		folPag func[] ;
		func=new folPag[10];
		func[0]=new folPag(1001,"charles","aspone",1200); 
		func[1]=new folPag(1001,"cassius","chapa",1500);		
		func[2]=new folPag(1003,"lima","acessor de nada",3000);
		func[3]=new folPag(1004,"charlão","executivo de fronteiras", 500);
		func[4]=new folPag(1005,"isidro","Professor",10000);
		func[5]=new folPag(1006,"Thiago","coordenador",2300);
		func[6]=new folPag(1007,"isidro","espec java",12000);
		func[7]=new folPag(1008,"paulo","gerente",20000);
		func[8]=new folPag(1009,"charles lima","deputado",25000);
		func[9]=new folPag(1010,"cassius lima","desocupado",6000);
	    for (int a=0 ; a<10 ; a++) {
	    	double salarioLiq=func[a].getSalarioBruto()-func[a].calcularImposto();
	    	System.out.println(func[a].getNome()+" "+func[a].getFuncao()+" "+func[a].getSalarioBruto()+" "+salarioLiq);
	    }
	}

}
