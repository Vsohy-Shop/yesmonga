package com.google.protobuf;

import com.google.protobuf.C34319a;
import com.google.protobuf.C34412l1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.b */
public abstract class C34329b<MessageType extends C34412l1> implements C34504y1<MessageType> {

    /* renamed from: a */
    public static final C34368g0 f83206a = C34368g0.m139242d();

    /* renamed from: A */
    public final MessageType mo100907A(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw mo100908B(messagetype).mo100731a().mo100518l(messagetype);
    }

    /* renamed from: B */
    public final UninitializedMessageException mo100908B(MessageType messagetype) {
        if (messagetype instanceof C34319a) {
            return ((C34319a) messagetype).newUninitializedMessageException();
        }
        return new UninitializedMessageException((C34412l1) messagetype);
    }

    /* renamed from: C */
    public MessageType mo100934b(InputStream inputStream) throws InvalidProtocolBufferException {
        return mo100951s(inputStream, f83206a);
    }

    /* renamed from: D */
    public MessageType mo100951s(InputStream inputStream, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return mo100907A(mo100956y(inputStream, g0Var));
    }

    /* renamed from: E */
    public MessageType mo100945m(ByteString byteString) throws InvalidProtocolBufferException {
        return mo100942j(byteString, f83206a);
    }

    /* renamed from: F */
    public MessageType mo100942j(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return mo100907A(mo100944l(byteString, g0Var));
    }

    /* renamed from: G */
    public MessageType mo100946n(C34448s sVar) throws InvalidProtocolBufferException {
        return mo100952t(sVar, f83206a);
    }

    /* renamed from: H */
    public MessageType mo100952t(C34448s sVar, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return mo100907A((C34412l1) mo100482z(sVar, g0Var));
    }

    /* renamed from: I */
    public MessageType mo100937e(InputStream inputStream) throws InvalidProtocolBufferException {
        return mo100955x(inputStream, f83206a);
    }

    /* renamed from: J */
    public MessageType mo100955x(InputStream inputStream, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return mo100907A(mo100954w(inputStream, g0Var));
    }

    /* renamed from: K */
    public MessageType mo100941i(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return mo100948p(byteBuffer, f83206a);
    }

    /* renamed from: L */
    public MessageType mo100948p(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        C34448s n = C34448s.m140152n(byteBuffer);
        C34412l1 l1Var = (C34412l1) mo100482z(n, g0Var);
        try {
            n.mo101527a(0);
            return mo100907A(l1Var);
        } catch (InvalidProtocolBufferException e) {
            throw e.mo100518l(l1Var);
        }
    }

    /* renamed from: M */
    public MessageType mo100932a(byte[] bArr) throws InvalidProtocolBufferException {
        return mo100950r(bArr, f83206a);
    }

    /* renamed from: N */
    public MessageType mo100939g(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return mo100953u(bArr, i, i2, f83206a);
    }

    /* renamed from: O */
    public MessageType mo100953u(byte[] bArr, int i, int i2, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return mo100907A(mo100481v(bArr, i, i2, g0Var));
    }

    /* renamed from: P */
    public MessageType mo100950r(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return mo100953u(bArr, 0, bArr.length, g0Var);
    }

    /* renamed from: Q */
    public MessageType mo100936d(InputStream inputStream) throws InvalidProtocolBufferException {
        return mo100956y(inputStream, f83206a);
    }

    /* renamed from: R */
    public MessageType mo100956y(InputStream inputStream, C34368g0 g0Var) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return mo100954w(new C34319a.C34320a.C34321a(inputStream, C34448s.m140144O(read, inputStream)), g0Var);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e);
        }
    }

    /* renamed from: S */
    public MessageType mo100943k(ByteString byteString) throws InvalidProtocolBufferException {
        return mo100944l(byteString, f83206a);
    }

    /* renamed from: T */
    public MessageType mo100944l(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        C34448s v0 = byteString.mo99254v0();
        MessageType messagetype = (C34412l1) mo100482z(v0, g0Var);
        try {
            v0.mo101527a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo100518l(messagetype);
        }
    }

    /* renamed from: U */
    public MessageType mo100947o(C34448s sVar) throws InvalidProtocolBufferException {
        return (C34412l1) mo100482z(sVar, f83206a);
    }

    /* renamed from: V */
    public MessageType mo100938f(InputStream inputStream) throws InvalidProtocolBufferException {
        return mo100954w(inputStream, f83206a);
    }

    /* renamed from: W */
    public MessageType mo100954w(InputStream inputStream, C34368g0 g0Var) throws InvalidProtocolBufferException {
        C34448s j = C34448s.m140148j(inputStream);
        MessageType messagetype = (C34412l1) mo100482z(j, g0Var);
        try {
            j.mo101527a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo100518l(messagetype);
        }
    }

    /* renamed from: X */
    public MessageType mo100935c(byte[] bArr) throws InvalidProtocolBufferException {
        return mo100481v(bArr, 0, bArr.length, f83206a);
    }

    /* renamed from: Y */
    public MessageType mo100940h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return mo100481v(bArr, i, i2, f83206a);
    }

    /* renamed from: Z */
    public MessageType mo100481v(byte[] bArr, int i, int i2, C34368g0 g0Var) throws InvalidProtocolBufferException {
        C34448s q = C34448s.m140155q(bArr, i, i2);
        MessageType messagetype = (C34412l1) mo100482z(q, g0Var);
        try {
            q.mo101527a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo100518l(messagetype);
        }
    }

    /* renamed from: a0 */
    public MessageType mo100949q(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return mo100481v(bArr, 0, bArr.length, g0Var);
    }
}
