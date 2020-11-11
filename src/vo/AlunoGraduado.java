/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Aluno
 */
public class AlunoGraduado extends Aluno{
    private String nivel;
    private int quantSemestre;

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the quantSemestre
     */
    public int getQuantSemestre() {
        return quantSemestre;
    }

    /**
     * @param quantSemestre the quantSemestre to set
     */
    public void setQuantSemestre(int quantSemestre) {
        this.quantSemestre = quantSemestre;
    }
}
