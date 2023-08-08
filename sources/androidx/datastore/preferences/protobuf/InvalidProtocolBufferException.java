package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private C18920z1 unfinishedMessage = null;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: b */
    public static InvalidProtocolBufferException m85085b() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static InvalidProtocolBufferException m85086c() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static InvalidProtocolBufferException m85087d() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static InvalidWireTypeException m85088e() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    public static InvalidProtocolBufferException m85089f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    public static InvalidProtocolBufferException m85090g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    public static InvalidProtocolBufferException m85091h() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: i */
    public static InvalidProtocolBufferException m85092i() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: k */
    public static InvalidProtocolBufferException m85093k() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: l */
    public static InvalidProtocolBufferException m85094l() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public C18920z1 mo54082a() {
        return this.unfinishedMessage;
    }

    /* renamed from: j */
    public InvalidProtocolBufferException mo54083j(C18920z1 z1Var) {
        this.unfinishedMessage = z1Var;
        return this;
    }

    /* renamed from: m */
    public IOException mo54084m() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public InvalidProtocolBufferException(String str, IOException iOException) {
        super(str, iOException);
    }
}
