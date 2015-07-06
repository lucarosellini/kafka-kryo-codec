package kafka.kryo.example;

import kafka.kryo.KryoEncoder;


public class PersonKryoEncoder extends KryoEncoder<Person> {
    @Override
    protected Class<Person> getRegisteredClass() {
        return Person.class;
    }
}
