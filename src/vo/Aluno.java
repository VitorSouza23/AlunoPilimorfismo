/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

    
/**
 *
 * @author Aluno
 */
public class Aluno implements Serializable{
    private String nome;
    private long matricula;
    private List<Aluno> alunos = new ArrayList();
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public long getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    
    public void Inserir (Aluno a){
        if(a instanceof AlunoTecnico){
            AlunoTecnico at = new AlunoTecnico();
            at = (AlunoTecnico) a;
            alunos.add(at);
            
        }else{
            AlunoGraduado ag = new AlunoGraduado();
            ag = (AlunoGraduado) a;
            alunos.add(ag);
        }
    }
        
    /**
     * @return the alunos
     */
    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    }

