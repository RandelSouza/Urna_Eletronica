import java.util.ArrayList;


public class Urna {
 
    private ArrayList<Candidato> candidatos = new ArrayList<>(10);
    
    public  Urna(){
        this.candidatos.add(new Candidato("Amilton Quintela", 4559, "Deputado Federal"));
        this.candidatos.add(new Candidato("Danilo o Fraco", 45898, "Deputado Estadual"));
        this.candidatos.add(new Candidato("Mayara Cacinbinha", 678, "Senadora"));
        this.candidatos.add(new Candidato("Victor Ramos", 901, "Senador"));
        this.candidatos.add(new Candidato("Maria Aparecida", 78, "Governador"));
        this.candidatos.add(new Candidato("Almir Junho", 78, "Presidente"));     
    }
    
    public boolean Confirmar(int numero){
        for(Candidato candidato : candidatos) {
            if(candidato.getNumero() == numero){
                candidato.setVotos(candidato.getVotos()+1);
                return true;
            }
        }     
 
        return false;
    }
    
    public Candidato retornarCandidato(int numero){
           for(Candidato candidato : candidatos) {
                if(candidato.getNumero() == numero){
                    return candidato;
                }
            }
           
           return null;
    }
    
    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }
   
    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
    
    
    
}