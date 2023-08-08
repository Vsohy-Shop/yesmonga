package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Field;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.x0 */
public interface C18903x0 extends C18675a2 {
    Field.Cardinality getCardinality();

    int getCardinalityValue();

    String getDefaultValue();

    ByteString getDefaultValueBytes();

    String getJsonName();

    ByteString getJsonNameBytes();

    Field.Kind getKind();

    int getKindValue();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    C18819n2 getOptions(int i);

    int getOptionsCount();

    List<C18819n2> getOptionsList();

    boolean getPacked();

    String getTypeUrl();

    ByteString getTypeUrlBytes();
}
