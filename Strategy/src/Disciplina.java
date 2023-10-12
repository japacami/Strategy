
public class Disciplina {
	private String nome;
	private double p1;
	private double p2;
	private double media;
	private String situacao;
	private ICalcMedia calcMedia;
	
	public Disciplina(ICalcMedia calcMedia) {
		this.calcMedia = calcMedia;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setP1(double p1) {
		this.p1 = p1;
	}
	
	public void setP2(double p2) {
		this.p2 = p2;
	}
	
	
	public void calcularMedia() {
		media = calcMedia.calculaMedia(p1, p2);
		situacao = calcMedia.situacao(media);
	}
	
	public double getMedia() {
		return media;
	}
	
	public String getSituacao() {
		return situacao;
	}

}
