/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.ai.server.repository.db;

import rs.ac.bg.fon.ai.server.repository.Repository;

/**
 *
 * @author PC
 */
public interface DBRepository<T> extends Repository<T>{
    
    default public void connect() throws Exception{
        DBConnectionFactory.getInstance().getConnection();
    }
    
    default public void disconnect() throws Exception{
        DBConnectionFactory.getInstance().getConnection().close();
    }
    
    default public void commit() throws Exception{
        DBConnectionFactory.getInstance().getConnection().commit();
    }
    
    default public void rollback() throws Exception{
        DBConnectionFactory.getInstance().getConnection().rollback();
    }
    
    
}
