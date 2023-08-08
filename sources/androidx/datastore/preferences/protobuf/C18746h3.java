package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.h3 */
public interface C18746h3 extends C18675a2 {
    boolean containsFields(String str);

    @Deprecated
    Map<String, Value> getFields();

    int getFieldsCount();

    Map<String, Value> getFieldsMap();

    Value getFieldsOrThrow(String str);

    /* renamed from: j */
    Value mo54622j(String str, Value value);
}
