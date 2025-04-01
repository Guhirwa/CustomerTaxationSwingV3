package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.TaxPayer;

/**
 *
 * @author Guhirwa
 */
public class TaxPayerDao {
    private String dbUrl = "jdbc:mysql://localhost:3306/Taxation";
    private String dbUsername = "@Guhirwa";
    private String dbPasswd = "@Guhirwa9188@";

    // CREATE (Insert) TaxPayer
    public int createTaxPayer(TaxPayer taxPayerObj) {
        try (Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPasswd)) {
            String sql = "INSERT INTO TaxPayer (Names, TIN, National_ID, Amount) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, taxPayerObj.getNames());
            pst.setString(2, taxPayerObj.getTin());
            pst.setString(3, taxPayerObj.getNid());
            pst.setDouble(4, taxPayerObj.getAmount());
            
            return pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    // READ (Retrieve a single taxpayer by TIN)
    public TaxPayer getTaxPayerByTin(String tin) {
        TaxPayer taxpayer = null; // Initialize the TaxPayer object
        try (Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPasswd)) {
            String sql = "SELECT * FROM TaxPayer WHERE TIN=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tin);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // If a record is found, create a TaxPayer object with the retrieved data
                taxpayer = new TaxPayer(
                        rs.getString("Names"),
                        rs.getString("TIN"),
                        rs.getString("National_ID"),
                        rs.getDouble("Amount")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return taxpayer;
    }

    // READ (Retrieve all taxpayers)
    public List<TaxPayer> getAllTaxPayers() {
        List<TaxPayer> taxpayers = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPasswd)) {
            String sql = "SELECT * FROM TaxPayer";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                TaxPayer taxpayer = new TaxPayer(
                        rs.getString("Names"),
                        rs.getString("TIN"),
                        rs.getString("National_ID"),
                        rs.getDouble("Amount")
                );
                taxpayers.add(taxpayer);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return taxpayers;
    }

    // UPDATE TaxPayer
    public int updateTaxPayer(TaxPayer taxPayerObj) {
        try (Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPasswd)) {
            String sql = "UPDATE TaxPayer SET Names=?, Amount=? WHERE TIN=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, taxPayerObj.getNames());
            pst.setDouble(2, taxPayerObj.getAmount());
            pst.setString(3, taxPayerObj.getTin());

            return pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    // DELETE TaxPayer
    public int deleteTaxPayer(String tin) {
        try (Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPasswd)) {
            String sql = "DELETE FROM TaxPayer WHERE TIN=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tin);

            return pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}
