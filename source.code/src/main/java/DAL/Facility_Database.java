package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import Facility.Facility;
import Student_Detail.Student;

public class Facility_Database {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/facility/";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "1stbeaner";

    public Facility_Database(){
        try{
            Class.forName(JDBC_DRIVER);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Facility> listFacilities(){
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        List<Facility> facilityList = new ArrayList<Facility>();
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = con.createStatement();
            String sql = "SELECT NAME, FACILITY_TYPE, FACILITY_DIMENSION, CAPACITY, ADDRESS FROM FACILITY";
            resultSet = stmt.executeQuery(sql);
            while(resultSet.next()){
                Facility facility = new Facility();
                facility.setName(resultSet.getString("NAME"));
                facility.setFacilityType(resultSet.getString("FACILITY_TYPE"));
                facility.setDimensions(resultSet.getString("FACILITY_DIMENSION"));
                facility.setCapacity(Integer.valueOf(resultSet.getString("CAPACITY")));
                //facility.setAddress(Address.toString().valueOf(resultSet.getString("ADDRESS")));
                facilityList.add(facility);
            }
        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            try{
                if(resultSet !=null){
                    resultSet.close();

                }
                if(stmt !=null){
                    stmt.close();
                }
                if(con !=null){
                    con.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return facilityList;

    }

    public Facility addNewFacility(Facility facility) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO FACILITY (NAME, FACILITY_TYPE, FACILITY_DIMENSION, CAPACITY, ADDRESS) VALUES (?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, facility.getName());
            pstmt.setString(2, facility.getFacilityType());
            pstmt.setString(3, facility.getDimensions());
            pstmt.setInt(4, facility.getAvailableCapacity());
            pstmt.setString(5, String.valueOf(facility.getAddress()));

            pstmt.executeUpdate();

        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            try{

                if(pstmt !=null){
                    pstmt.close();
                }
                if(con !=null){
                    con.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return facility;
    }

    public Object getFacilityInformation(String facilityNo) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Facility facility = new Facility();
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = con.createStatement();
            String sql = "SELECT NAME, FACILITY_TYPE, FACILITY_DIMENSION, USAGE, CAPACITY, FACILITY_NO="+facilityNo;
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                facility.setCapacity(rs.getInt("CAPACITY"));
                facility.setFacilityType(rs.getString("FACILITY_TYPE"));
                facility.setDimensions(rs.getString("FACILITY_DIMENSION"));
                facility.setUsage(rs.getDouble("USAGE"));
                facility.setName(rs.getString("Name"));
            }
        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            try{
                if(rs !=null){
                    rs.close();

                }
                if(stmt !=null){
                    stmt.close();
                }
                if(con !=null){
                    con.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return facility;
    }
    public Object requestAvailableCapacity(String facilityNo){
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        int capacity = 0;

        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = con.createStatement();
            String sql = "SELECT CAPACITY FROM FACILITY WHERE FACILITY_NO="+facilityNo;
            resultSet = stmt.executeQuery(sql);
            capacity = resultSet.getInt("CAPACITY");
        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            try{
                if(resultSet !=null){
                    resultSet.close();

                }
                if(stmt !=null){
                    stmt.close();
                }
                if(con !=null){
                    con.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return capacity;
    }
    public void addFacilityDetail(Facility facility ){
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "UPDATE FACILITY SET FACILITY_TYPE =?, CAPACITY=?, USAGE = ?  WHERE FACILITY?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, facility.getFacilityType());
            pstmt.setInt(2, facility.getAvailableCapacity());
            pstmt.setDouble(3, facility.getUsage());
            pstmt.executeUpdate();
        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            try{

                if(pstmt !=null){
                    pstmt.close();
                }
                if(con !=null){
                    con.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
    public Object removeFacility(String facilityNo){
        Connection con = null;
        PreparedStatement pstmt = null;
        int success = 0;
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "DELETE FROM FACILITY WHERE FACILITY_NO = ?"+facilityNo;
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, facilityNo);
            success = pstmt.executeUpdate();
        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            try{

                if(pstmt !=null){
                    pstmt.close();
                }
                if(con !=null){
                    con.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return success;
    }
    public Object assignFacilityToUse(Student student){
        Connection con = null;
        PreparedStatement pstmt = null;
        int success = 0;
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "INSERT FROM STUDENT (NAME, ADDRESS) INTO FACILITY";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setString(3, String.valueOf(student.getAddress()));
            success = pstmt.executeUpdate();
        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            try{

                if(pstmt !=null){
                    pstmt.close();
                }
                if(con !=null){
                    con.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return success;
    }


    public Object vacateFacility(Student student) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int success = 0;
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "DELETE FROM FACILITY WHERE STUDENT = "+ student.getFullName();
            pstmt = con.prepareStatement(sql);
            pstmt.executeUpdate();
        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            try{

                if(pstmt !=null){
                    pstmt.close();
                }
                if(con !=null){
                    con.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return success;
    }

}
