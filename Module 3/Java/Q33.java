import java.sql.*;

public class TransactionDemo {
    public void transfer(int from, int to, int amount) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:sqlite:bank.db");
        con.setAutoCommit(false);
        try {
            PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            debit.setInt(1, amount);
            debit.setInt(2, from);
            debit.executeUpdate();

            PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setInt(1, amount);
            credit.setInt(2, to);
            credit.executeUpdate();

            con.commit();
        } catch (Exception e) {
            con.rollback();
            throw e;
        } finally {
            con.close();
        }
    }
}
