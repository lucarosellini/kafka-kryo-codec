package kafka.kryo.example;

import kafka.kryo.KryoDecoder;


public class PersonKryoDecoder extends KryoDecoder<Person> {


	@Override
	protected Class<Person> getRegisteredClass() {
		return Person.class;
	}

	public PersonKryoDecoder() {

	}

}
