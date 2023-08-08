package androidx.datastore.preferences.protobuf;

import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.f2 */
public interface C18730f2 extends C18675a2 {
    String getName();

    ByteString getNameBytes();

    C18819n2 getOptions(int i);

    int getOptionsCount();

    List<C18819n2> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    ByteString getResponseTypeUrlBytes();

    Syntax getSyntax();

    int getSyntaxValue();
}
