package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Value;

/* renamed from: androidx.datastore.preferences.protobuf.a4 */
public interface C18686a4 extends C18675a2 {
    boolean getBoolValue();

    Value.KindCase getKindCase();

    C18838p1 getListValue();

    NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    ByteString getStringValueBytes();

    C18738g3 getStructValue();

    boolean hasListValue();

    boolean hasStructValue();
}
