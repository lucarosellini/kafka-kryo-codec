package kafka.kryo;

import kafka.utils.VerifiableProperties;

import java.util.TreeMap;

/**
 * Created by Luca Rosellini .
 */
public class MapKryoDecoder extends KryoDecoder<TreeMap<String, Object>> {

    @Override
    protected Class<TreeMap<String, Object>> getRegisteredClass() {
        return (Class<TreeMap<String, Object>>) Utils.getTypeArguments(KryoDecoder.class,getClass()).get(0);
    }

    public MapKryoDecoder(VerifiableProperties props) {
        super(props);
    }


    public MapKryoDecoder() {
        super();
    }

    @Override
    public TreeMap<String, Object> fromBytes(byte[] arg0) {
        return super.fromBytes(arg0);
    }
}
