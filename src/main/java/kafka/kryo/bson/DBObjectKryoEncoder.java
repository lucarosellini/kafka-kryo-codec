package kafka.kryo.bson;

import com.mongodb.DBObject;
import kafka.kryo.KryoEncoder;
import kafka.utils.VerifiableProperties;

/**
 * Created by luca on 6/11/14.
 */
public class DBObjectKryoEncoder extends KryoEncoder<DBObject>{
    public DBObjectKryoEncoder(VerifiableProperties props) {
        super(props);
    }

    public DBObjectKryoEncoder() {
    }

    @Override

    public byte[] toBytes(DBObject doc) {
        return super.toBytes(doc);
    }
}
