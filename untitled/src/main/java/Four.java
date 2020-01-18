import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class Four {
    public static void main(String[] args) {

        Jedis jedis=new Jedis("127.0.0.1",6379);

        int balance;
        int dept;
        int order=10;
        balance=Integer.parseInt(jedis.get("balance"));
        if (balance<order){
            jedis.unwatch();
            System.out.println("lose");
        }else {

        }
    }
}
