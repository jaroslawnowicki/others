package nowicki;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;


public class AvroParser {

    public void parser() {
        Schema.Parser parser = new Schema.Parser();
        Schema schema = null;

        try {
            schema = parser.parse(new File("/home/jarek/Projekty/others/avro/src/main/resources/StringPair.avsc"));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        GenericRecord datum = new GenericData.Record(schema);
        datum.put("left", "L");
        datum.put("right", "R");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DatumWriter<GenericRecord> writer = new GenericDatumWriter<GenericRecord>(schema);
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        try {
            writer.write(datum, encoder);
            encoder.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        DatumReader<GenericRecord> reader = new GenericDatumReader<GenericRecord>(schema);
        Decoder decoder = DecoderFactory.get().binaryDecoder(out.toByteArray(), null);

        GenericRecord result = null;

        try {
            result = reader.read(null, decoder);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(result.get("left").toString());
        System.out.println(result.get("right").toString());


    }
}
