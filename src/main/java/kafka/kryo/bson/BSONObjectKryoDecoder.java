package kafka.kryo.bson;

import kafka.kryo.KryoDecoder;
import kafka.utils.VerifiableProperties;
import org.bson.BSONObject;

/**
 * Created by luca on 6/11/14.
 */
public class BSONObjectKryoDecoder extends KryoDecoder<BSONObject>{
    @Override
    protected Class<BSONObject> getRegisteredClass() {
        return BSONObject.class;
    }

    public BSONObjectKryoDecoder(VerifiableProperties props) {
        super(props);
    }

    public BSONObjectKryoDecoder() {
    }

    @Override
    public BSONObject fromBytes(byte[] serializedDoc) {
        return super.fromBytes(serializedDoc);
    }
}
