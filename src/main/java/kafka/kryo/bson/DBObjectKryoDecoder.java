package kafka.kryo.bson;

import com.mongodb.DBObject;
import kafka.kryo.KryoDecoder;
import kafka.utils.VerifiableProperties;

/**
 * Created by luca on 6/11/14.
 */
public class DBObjectKryoDecoder extends KryoDecoder<DBObject>{
    public DBObjectKryoDecoder(VerifiableProperties props) {
        super(props);
    }

    public DBObjectKryoDecoder() {
    }

    @Override
    public DBObject fromBytes(byte[] serializedDoc) {
        return super.fromBytes(serializedDoc);
    }
}
