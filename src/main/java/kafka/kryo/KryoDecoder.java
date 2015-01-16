package kafka.kryo;

import java.io.ByteArrayInputStream;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import kafka.kryo.example.Person;
import kafka.utils.VerifiableProperties;

public class KryoDecoder<T> extends Kryo implements kafka.serializer.Decoder<T> {

    public KryoDecoder(VerifiableProperties props){
    }

	@SuppressWarnings("unchecked")
	public KryoDecoder() {
		Type type = getClass().getGenericSuperclass();
		Type[] trueType = ((ParameterizedType) type).getActualTypeArguments();
		super.register((Class<T>) trueType[0]);
	}

	@Override
	@SuppressWarnings("unchecked")
	public T fromBytes(byte[] arg0) {
		Input input = new Input(new ByteArrayInputStream(arg0));
		return (T) readObject(input, Person.class);
	}
}
