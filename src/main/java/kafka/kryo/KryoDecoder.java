package kafka.kryo;

import java.io.ByteArrayInputStream;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import kafka.kryo.example.Person;
import kafka.utils.VerifiableProperties;

public abstract class KryoDecoder<T> extends Kryo implements kafka.serializer.Decoder<T> {

	protected abstract Class<T> getRegisteredClass();

    public KryoDecoder(VerifiableProperties props){
    }

	@SuppressWarnings("unchecked")
	public KryoDecoder() {
	}

	@Override
	@SuppressWarnings("unchecked")
	public T fromBytes(byte[] arg0) {
		Input input = new Input(new ByteArrayInputStream(arg0));
		return (T) readObject(input,getRegisteredClass());
	}
}
