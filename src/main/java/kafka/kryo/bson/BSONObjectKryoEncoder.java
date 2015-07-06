package kafka.kryo.bson;

import kafka.kryo.KryoEncoder;
import kafka.utils.VerifiableProperties;
import org.bson.BSONObject;

/**
 * Created by luca on 6/11/14.
 */
public class BSONObjectKryoEncoder extends KryoEncoder<BSONObject>{
    @Override
    protected Class<BSONObject> getRegisteredClass() {
        return BSONObject.class;
    }

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
