
// Classe Candidato apresenta os atributos e métodos necessários para que um canditado sejá armazenado na urna eletrônica
public class Candidato {
    private String nome;
    private int numero;
    private int votos;
    private String[] datas;
    private String funcao;
 
    public Candidato(String nome, int numero, String funcao){
        this.nome = nome;
        this.numero = numero;
        this.votos = 0;
        this.datas = new String[10];
        this.funcao = funcao;
    }
    public String toString(){
        return "Nome: " + this.nome + " \n" + "Número: " + this.numero + " \n" + " Função: " + this.funcao;
    } 
    
    public String getFuncao() {
        return funcao;
    }

    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNumero() {
        return numero;
    }
   
    public void setNumero(int numero) {
        this.numero = numero;
    }

   
    public int getVotos() {
        return votos;
    }
   
    public void setVotos(int votos) {
        this.votos = votos;
    }

    public String[] getDatas() {
        return datas;
    }

    public void setDatas(String[] datas) {
        this.datas = datas;
    }
}
