package androidx.datastore.preferences.protobuf;

import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.p3 */
public interface C18842p3 extends C18675a2 {
    Field getFields(int i);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i);

    ByteString getOneofsBytes(int i);

    int getOneofsCount();

    List<String> getOneofsList();

    C18819n2 getOptions(int i);

    int getOptionsCount();

    List<C18819n2> getOptionsList();

    C18691b3 getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
