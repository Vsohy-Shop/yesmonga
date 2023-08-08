package com.contentsquare.android.sdk;

import java.io.IOException;

/* renamed from: com.contentsquare.android.sdk.h5 */
public class C14394h5 extends IOException {

    /* renamed from: a */
    public C14218ba f35593a = null;

    /* renamed from: b */
    public boolean f35594b;

    /* renamed from: com.contentsquare.android.sdk.h5$a */
    public static class C14395a extends C14394h5 {
        public C14395a(String str) {
            super(str);
        }
    }

    public C14394h5(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: c */
    public static C14394h5 m62025c() {
        return new C14394h5("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: d */
    public static C14394h5 m62026d() {
        return new C14394h5("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    public static C14394h5 m62027e() {
        return new C14394h5("Protocol message had invalid UTF-8.");
    }

    /* renamed from: f */
    public static C14395a m62028f() {
        return new C14395a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    public static C14394h5 m62029g() {
        return new C14394h5("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: h */
    public static C14394h5 m62030h() {
        return new C14394h5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: i */
    public static C14394h5 m62031i() {
        return new C14394h5("Failed to parse the message.");
    }

    /* renamed from: j */
    public static C14394h5 m62032j() {
        return new C14394h5("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: k */
    public static C14394h5 m62033k() {
        return new C14394h5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public C14394h5 mo35491a(C14218ba baVar) {
        this.f35593a = baVar;
        return this;
    }

    /* renamed from: b */
    public boolean mo35492b() {
        return this.f35594b;
    }

    public C14394h5(String str) {
        super(str);
    }
}
