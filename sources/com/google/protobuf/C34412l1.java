package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.protobuf.l1 */
public interface C34412l1 extends C34417m1 {

    /* renamed from: com.google.protobuf.l1$a */
    public interface C34413a extends C34417m1, Cloneable {
        /* renamed from: A1 */
        C34413a mo100838A1(C34412l1 l1Var);

        /* renamed from: G1 */
        C34413a mo100459G1(C34448s sVar, C34368g0 g0Var) throws IOException;

        /* renamed from: M */
        C34413a mo100839M(InputStream inputStream) throws IOException;

        /* renamed from: M2 */
        boolean mo100840M2(InputStream inputStream, C34368g0 g0Var) throws IOException;

        /* renamed from: Q */
        C34412l1 mo100467Q();

        /* renamed from: T2 */
        C34413a mo100841T2(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException;

        /* renamed from: W */
        C34413a mo100842W(byte[] bArr) throws InvalidProtocolBufferException;

        /* renamed from: X */
        boolean mo100843X(InputStream inputStream) throws IOException;

        C34413a clear();

        C34413a clone();

        /* renamed from: e2 */
        C34413a mo100470e2(byte[] bArr, int i, int i2, C34368g0 g0Var) throws InvalidProtocolBufferException;

        /* renamed from: f0 */
        C34413a mo100472f0(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        /* renamed from: g */
        C34412l1 mo100473g();

        /* renamed from: l2 */
        C34413a mo100847l2(ByteString byteString) throws InvalidProtocolBufferException;

        /* renamed from: m2 */
        C34413a mo100848m2(C34448s sVar) throws IOException;

        /* renamed from: p0 */
        C34413a mo100851p0(InputStream inputStream, C34368g0 g0Var) throws IOException;

        /* renamed from: y2 */
        C34413a mo100855y2(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException;
    }

    C34504y1<? extends C34412l1> getParserForType();

    int getSerializedSize();

    C34413a newBuilderForType();

    C34413a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
