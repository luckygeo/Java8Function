package lambda.serialized;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LambdaTest {
    public static void printIt(Long l) {
        System.out.println(l);
    }

    public static void main(String[] args) throws Exception {
        doConsumeWithSerialize(LambdaTest::printIt);
    }

    private static void doConsumeWithSerialize(SerializableConsumer<Long> consumer) throws Exception {
        consumer.accept(123L);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(consumer);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        SerializableConsumer<Long> newConsumer = (SerializableConsumer<Long>) ois.readObject();
        newConsumer.accept(234L);
    }

}
