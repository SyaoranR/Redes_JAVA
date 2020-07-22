/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.transfer.Professor;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Labredes
 */
public class ProfessorDAO extends MyConnection implements BasicCommand{

    @Override
    public boolean insert(Object obj) throws Exception {
        try {
            // como se fosse um obj descompactado
            Professor prof = (Professor) obj; // pega o obj e converte em prof 
            String sql = "insert into public.Professor(nome, vl_hora_aula)"
                    + " values(?, ?)";
            openConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, prof.getNome());
            ps.setObject(2, prof.getVl_hora_aula());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            closeConnection();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> consult() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
