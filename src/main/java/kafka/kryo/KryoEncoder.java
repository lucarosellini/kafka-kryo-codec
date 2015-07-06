package kafka.kryo;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import kafka.utils.VerifiableProperties;

import java.io.ByteArrayOutputStream;

public abstract class KryoEncoder<T> extends Kryo implements kafka.serializer.Encoder<T> {

	protected abstract Class<T> getRegisteredClass();

    public KryoEncoder(VerifiableProperties props){
    }

	@SuppressWarnings("unchecked")
	public KryoEncoder() {
		super.register(getRegisteredClass());
	}

	@Override
	public byte[] toBytes(T arg0) {
		Output out = new Output(new ByteArrayOutputStream());
		super.writeObject(out, arg0);
		byte[] res = out.getBuffer();
		out.close();
		return res;
	}

}
