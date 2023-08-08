package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18665a;
import androidx.datastore.preferences.protobuf.C18920z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: androidx.datastore.preferences.protobuf.b */
public abstract class C18687b<MessageType extends C18920z1> implements C18841p2<MessageType> {

    /* renamed from: a */
    public static final C18836p0 f47798a = C18836p0.m87223d();

    /* renamed from: A */
    public final MessageType mo54346A(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw mo54347B(messagetype).mo54135a().mo54083j(messagetype);
    }

    /* renamed from: B */
    public final UninitializedMessageException mo54347B(MessageType messagetype) {
        if (messagetype instanceof C18665a) {
            return ((C18665a) messagetype).mo54257y();
        }
        return new UninitializedMessageException((C18920z1) messagetype);
    }

    /* renamed from: C */
    public MessageType mo54373b(InputStream inputStream) throws InvalidProtocolBufferException {
        return mo54382k(inputStream, f47798a);
    }

    /* renamed from: D */
    public MessageType mo54382k(InputStream inputStream, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return mo54346A(mo54393w(inputStream, p0Var));
    }

    /* renamed from: E */
    public MessageType mo54391u(ByteString byteString) throws InvalidProtocolBufferException {
        return mo54387q(byteString, f47798a);
    }

    /* renamed from: F */
    public MessageType mo54387q(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return mo54346A(mo54389s(byteString, p0Var));
    }

    /* renamed from: G */
    public MessageType mo54395y(C18889w wVar) throws InvalidProtocolBufferException {
        return mo54386o(wVar, f47798a);
    }

    /* renamed from: H */
    public MessageType mo54386o(C18889w wVar, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return mo54346A((C18920z1) mo54035z(wVar, p0Var));
    }

    /* renamed from: I */
    public MessageType mo54376e(InputStream inputStream) throws InvalidProtocolBufferException {
        return mo54384m(inputStream, f47798a);
    }

    /* renamed from: J */
    public MessageType mo54384m(InputStream inputStream, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return mo54346A(mo54390t(inputStream, p0Var));
    }

    /* renamed from: K */
    public MessageType mo54380i(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return mo54394x(byteBuffer, f47798a);
    }

    /* renamed from: L */
    public MessageType mo54394x(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        C18889w n = C18889w.m87626n(byteBuffer);
        C18920z1 z1Var = (C18920z1) mo54035z(n, p0Var);
        try {
            n.mo55500a(0);
            return mo54346A(z1Var);
        } catch (InvalidProtocolBufferException e) {
            throw e.mo54083j(z1Var);
        }
    }

    /* renamed from: M */
    public MessageType mo54371a(byte[] bArr) throws InvalidProtocolBufferException {
        return mo54381j(bArr, f47798a);
    }

    /* renamed from: N */
    public MessageType mo54378g(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return mo54388r(bArr, i, i2, f47798a);
    }

    /* renamed from: O */
    public MessageType mo54388r(byte[] bArr, int i, int i2, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return mo54346A(mo54034p(bArr, i, i2, p0Var));
    }

    /* renamed from: P */
    public MessageType mo54381j(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return mo54388r(bArr, 0, bArr.length, p0Var);
    }

    /* renamed from: Q */
    public MessageType mo54375d(InputStream inputStream) throws InvalidProtocolBufferException {
        return mo54393w(inputStream, f47798a);
    }

    /* renamed from: R */
    public MessageType mo54393w(InputStream inputStream, C18836p0 p0Var) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return mo54390t(new C18665a.C18666a.C18667a(inputStream, C18889w.m87618O(read, inputStream)), p0Var);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e);
        }
    }

    /* renamed from: S */
    public MessageType mo54392v(ByteString byteString) throws InvalidProtocolBufferException {
        return mo54389s(byteString, f47798a);
    }

    /* renamed from: T */
    public MessageType mo54389s(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        C18889w v0 = byteString.mo53766v0();
        MessageType messagetype = (C18920z1) mo54035z(v0, p0Var);
        try {
            v0.mo55500a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo54083j(messagetype);
        }
    }

    /* renamed from: U */
    public MessageType mo54385n(C18889w wVar) throws InvalidProtocolBufferException {
        return (C18920z1) mo54035z(wVar, f47798a);
    }

    /* renamed from: V */
    public MessageType mo54377f(InputStream inputStream) throws InvalidProtocolBufferException {
        return mo54390t(inputStream, f47798a);
    }

    /* renamed from: W */
    public MessageType mo54390t(InputStream inputStream, C18836p0 p0Var) throws InvalidProtocolBufferException {
        C18889w j = C18889w.m87622j(inputStream);
        MessageType messagetype = (C18920z1) mo54035z(j, p0Var);
        try {
            j.mo55500a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo54083j(messagetype);
        }
    }

    /* renamed from: X */
    public MessageType mo54374c(byte[] bArr) throws InvalidProtocolBufferException {
        return mo54034p(bArr, 0, bArr.length, f47798a);
    }

    /* renamed from: Y */
    public MessageType mo54379h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return mo54034p(bArr, i, i2, f47798a);
    }

    /* renamed from: Z */
    public MessageType mo54034p(byte[] bArr, int i, int i2, C18836p0 p0Var) throws InvalidProtocolBufferException {
        C18889w q = C18889w.m87629q(bArr, i, i2);
        MessageType messagetype = (C18920z1) mo54035z(q, p0Var);
        try {
            q.mo55500a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo54083j(messagetype);
        }
    }

    /* renamed from: a0 */
    public MessageType mo54383l(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return mo54034p(bArr, 0, bArr.length, p0Var);
    }
}
