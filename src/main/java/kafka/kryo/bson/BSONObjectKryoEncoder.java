package kafka.kryo.bson;

import com.mongodb.DBObject;
import kafka.kryo.KryoEncoder;
import kafka.utils.VerifiableProperties;
import org.bson.BSONObject;

/**
 * Created by luca on 6/11/14.
 */
public class BSONObjectKryoEncoder extends KryoEncoder<BSONObject>{
    public BSONObjectKryoEncoder(VerifiableProperties props) {
        super(props);
    }

    public BSONObjectKryoEncoder() {
    }

    @Override
    public byte[] toBytes(BSONObject doc) {
        return super.toBytes(doc);
    }
}
