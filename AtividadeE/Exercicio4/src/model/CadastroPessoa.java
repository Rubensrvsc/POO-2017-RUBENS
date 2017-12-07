package model;

public class CadastroPessoa {
	public Pessoa[] pe;
	public int tamanho;
	public int indice;
	public CadastroPessoa(int tamanho){
		this.tamanho=tamanho;
		pe=new Pessoa[tamanho];
	}
	
	public void inserir(Pessoa p){
		pe[indice]=p;
		indice++;
	}
	
	public void atualiza(Pessoa p){
		for(int i=0;i<pe.length;i++){
			if(pe[i].nome==p.nome){
				pe[i].id=p.id;
			}
		}
	}
	
	public void salva(Pessoa p){
		for(int i=0;i<pe.length;i++){
			if(pe[i].nome==p.nome){
				atualiza(p);
			}
		}
		inserir(p);
	}
}
