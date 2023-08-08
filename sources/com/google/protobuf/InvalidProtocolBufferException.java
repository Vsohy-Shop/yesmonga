package com.google.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private C34412l1 unfinishedMessage = null;
    private boolean wasThrownFromInputStream;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: c */
    public static InvalidProtocolBufferException m138413c() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: d */
    public static InvalidProtocolBufferException m138414d() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    public static InvalidProtocolBufferException m138415e() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: f */
    public static InvalidWireTypeException m138416f() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    public static InvalidProtocolBufferException m138417g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: h */
    public static InvalidProtocolBufferException m138418h() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: i */
    public static InvalidProtocolBufferException m138419i() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: j */
    public static InvalidProtocolBufferException m138420j() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: m */
    public static InvalidProtocolBufferException m138421m() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: n */
    public static InvalidProtocolBufferException m138422n() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public boolean mo100515a() {
        return this.wasThrownFromInputStream;
    }

    /* renamed from: b */
    public C34412l1 mo100516b() {
        return this.unfinishedMessage;
    }

    /* renamed from: k */
    public void mo100517k() {
        this.wasThrownFromInputStream = true;
    }

    /* renamed from: l */
    public InvalidProtocolBufferException mo100518l(C34412l1 l1Var) {
        this.unfinishedMessage = l1Var;
        return this;
    }

    /* renamed from: o */
    public IOException mo100519o() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public InvalidProtocolBufferException(String str, IOException iOException) {
        super(str, iOException);
    }
}
