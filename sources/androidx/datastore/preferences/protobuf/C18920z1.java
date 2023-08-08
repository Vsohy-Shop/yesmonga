package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: androidx.datastore.preferences.protobuf.z1 */
public interface C18920z1 extends C18675a2 {

    /* renamed from: androidx.datastore.preferences.protobuf.z1$a */
    public interface C18921a extends C18675a2, Cloneable {
        /* renamed from: A0 */
        C18921a mo54258A0(ByteString byteString) throws InvalidProtocolBufferException;

        /* renamed from: C0 */
        C18921a mo54259C0(C18889w wVar) throws IOException;

        /* renamed from: J3 */
        boolean mo54260J3(InputStream inputStream, C18836p0 p0Var) throws IOException;

        /* renamed from: K0 */
        C18921a mo54009K0(byte[] bArr, int i, int i2, C18836p0 p0Var) throws InvalidProtocolBufferException;

        /* renamed from: M */
        C18921a mo54261M(InputStream inputStream) throws IOException;

        /* renamed from: M1 */
        C18921a mo54010M1(C18889w wVar, C18836p0 p0Var) throws IOException;

        /* renamed from: Q */
        C18920z1 mo54011Q();

        /* renamed from: W */
        C18921a mo54263W(byte[] bArr) throws InvalidProtocolBufferException;

        /* renamed from: X */
        boolean mo54264X(InputStream inputStream) throws IOException;

        /* renamed from: X1 */
        C18921a mo54265X1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException;

        /* renamed from: Y1 */
        C18921a mo54266Y1(InputStream inputStream, C18836p0 p0Var) throws IOException;

        /* renamed from: c2 */
        C18921a mo54270c2(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException;

        C18921a clear();

        C18921a clone();

        /* renamed from: f0 */
        C18921a mo54017f0(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        /* renamed from: g */
        C18920z1 mo54018g();

        /* renamed from: t0 */
        C18921a mo54276t0(C18920z1 z1Var);
    }

    /* renamed from: J */
    void mo53979J(CodedOutputStream codedOutputStream) throws IOException;

    C18841p2<? extends C18920z1> getParserForType();

    int getSerializedSize();

    C18921a newBuilderForType();

    C18921a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
