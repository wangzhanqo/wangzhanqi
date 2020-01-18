import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.Set;

public class Three {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("127.0.0.1",6379);
        //jedis.set("money","111");
        //jedis.expire("money",999);
       //System.out.println(jedis.ping());
        // System.out.println(jedis);
//        jedis.set("wang","250");
////        jedis.watch("wang");
////        jedis.set("wang","9999");
////        jedis.unwatch();
////        jedis.watch("wang");
////        jedis.multi();
////        jedis.set("wang","10000");
        Transaction transaction=jedis.multi();
        transaction.set("456","v456");
        transaction.exec();
    }
}
