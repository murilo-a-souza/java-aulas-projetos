package br.com.fiap.dao;

import br.com.fiap.to.RemedioTO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioDAO {
    public ArrayList<RemedioTO> findAll() {
        ArrayList<RemedioTO> remedios = new ArrayList<RemedioTO>();
        String sql = "select * from DDD_REMEDIOS order by CODIGO";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){
            if (rs != null) {
                while (rs.next()) {
                    RemedioTO remedio = new RemedioTO();
                    remedio.setCodigo(rs.getLong(1));
                    remedio.setNome(rs.getString(2));
                    remedio.setPreco(rs.getDouble(3));
                    remedio.setDataDeFabricacao(rs.getDate(4).toLocalDate());
                    remedio.setDataDeValidade(rs.getDate(5).toLocalDate());
                    remedios.add(remedio);
                }
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro na consulta: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return remedios;
    }

    public RemedioTO findByCodigo(Long codigo){
        RemedioTO remedio = new RemedioTO();
        String sql = "select * from DDD_REMEDIOS where CODIGO = ? order by CODIGO";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql);
             ){
            ps.setLong(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                remedio.setCodigo(rs.getLong(1));
                remedio.setNome(rs.getString(2));
                remedio.setPreco(rs.getDouble(3));
                remedio.setDataDeFabricacao(rs.getDate(4).toLocalDate());
                remedio.setDataDeValidade(rs.getDate(5).toLocalDate());
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro na consulta: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return remedio;
    }

    public RemedioTO save(RemedioTO remedio){
        String sql = "insert into ddd_remedios(nome, preco, data_de_fabricacao, data_de_validade) values (?, ?, ?, ?)";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql);){
            ps.setString(1, remedio.getNome());
            ps.setDouble(2, remedio.getPreco());
            ps.setDate(3, Date.valueOf(remedio.getDataDeFabricacao()));
            ps.setDate(4, Date.valueOf(remedio.getDataDeValidade()));

            if(ps.executeUpdate() > 0){
                System.out.println("Sucesso ao inserir");
                return remedio;
            } else{
                System.out.println("Erro ao inserir");
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return null;
    }

    public RemedioTO update(RemedioTO remedio) {
        String sql = "update DDD_REMEDIOS set NOME=?,PRECO=?,DATA_DE_FABRICACAO=?,DATA_DE_VALIDADE=? where CODIGO=?";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)){
            ps.setString(1,remedio.getNome());
            ps.setDouble(2,remedio.getPreco());
            ps.setDate(3,Date.valueOf(remedio.getDataDeFabricacao()));
            ps.setDate(4,Date.valueOf(remedio.getDataDeValidade()));
            ps.setLong(5,remedio.getCodigo());
            if (ps.executeUpdate() > 0) {
                System.out.println("Sucesso ao editar");
                return remedio;
            } else{
                System.out.println("Erro ao editar");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return null;
    }

    public boolean delete(Long codigo) {
        String sql = "delete from DDD_REMEDIOS where CODIGO = ?";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setLong(1, codigo);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return false;
    }
}
