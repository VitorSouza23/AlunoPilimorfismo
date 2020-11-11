/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Serializacao {

    public void saveText(List<Aluno> list) {
        try {
            FileOutputStream fo = new FileOutputStream("Aluno.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);

            for (Aluno aluno : list) {
                oo.writeObject(aluno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> loadList() {

        List<Aluno> list = new ArrayList<>();

        try {
            FileInputStream fi = new FileInputStream("Aluno.txt");
            ObjectInputStream oo = new ObjectInputStream(fi);
            Aluno aluno;
            while ((aluno = (Aluno) oo.readObject()) != null) {
                list.add(aluno);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return list;
    }
}
