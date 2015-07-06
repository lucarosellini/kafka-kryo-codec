package kafka.kryo;

import kafka.utils.VerifiableProperties;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Luca Rosellini.
 */
public class MapKryoEncoder extends KryoEncoder<Map<String,Object>> {


    @Override
    protected Class<Map<String, Object>> getRegisteredClass() {
        return (Class<Map<String, Object>>) Utils.getTypeArguments(KryoEncoder.class,getClass()).get(0);
    }

    public MapKryoEncoder(VerifiableProperties props) {
        super(props);
    }

    public MapKryoEncoder() {
        super();
    }

    @Override
    public byte[] toBytes(Map<String, Object> arg0) {
        return super.toBytes(arg0);
    }
}
