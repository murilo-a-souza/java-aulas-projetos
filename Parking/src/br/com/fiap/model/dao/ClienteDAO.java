package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO implements IDAO{
    //atributos
    private Connection con;
    private Cliente cliente;

    //construtor com passagem de parâmetro
    public ClienteDAO(Connection con) {
        this.con = con;
    }

    //getters
    public Connection getCon() {
        return con;
    }

    //metodos da classe
    public String inserir(Object object){
        cliente = (Cliente) object;

        String sql = "Insert into ddd_cliente(nome_cliente,placa) values(?,?)";
        try (PreparedStatement ps = getCon().prepareStatement(sql)){

            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());

            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }

        } catch (SQLException e) {
            return "Erro de SQL:" + e.getMessage();
        }
    }

    public String alterar(Object object){
        cliente = (Cliente) object;
        String sql = "update ddd_cliente set nome_cliente=?, placa=? where id_cliente=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)){

            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());
            ps.setInt(3, cliente.getIdCliente());

            if (ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            } else {
                return "Erro ao alterar";
            }

        } catch (SQLException e) {
            return "Erro de SQL:" + e.getMessage();
        }
    }

    public String excluir(Object object){
        cliente = (Cliente) object;
        String sql = "delete from ddd_cliente where id_cliente=?";
        try (PreparedStatement ps = getCon().prepareStatement(sql)){

            ps.setInt(1, cliente.getIdCliente());

            if (ps.executeUpdate() > 0){
                return "Excluido com sucesso";
            } else {
                return "Erro ao excluir";
            }

        } catch (SQLException e) {
            return "Erro de SQL:" + e.getMessage();
        }
    }

    public String listarUm(Object object){
        cliente = (Cliente) object;
        String sql = "select * from ddd_cliente where id_cliente=?";


        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setInt(1,cliente.getIdCliente());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return "\nID cliente: " + rs.getString("id_cliente") + "\nNome cliente: " + rs.getString("nome_cliente") + "Placa: " + cliente.getPlaca();


            } else {
                return "Registro não foi encontrado";
            }

        } catch (SQLException e) {
            return "Erro de SQL:" + e.getMessage();

        }
    }

}
