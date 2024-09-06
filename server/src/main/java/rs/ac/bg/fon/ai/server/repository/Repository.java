/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.ai.server.repository;

import java.sql.PreparedStatement;
import java.util.List;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public interface Repository<T> {
    List<T> getAll (T param, String uslov) throws Exception;
    PreparedStatement add(T param) throws Exception;
    void edit(T param) throws Exception;
    void delete(T param) throws Exception;
    List<T> getAll();
}
