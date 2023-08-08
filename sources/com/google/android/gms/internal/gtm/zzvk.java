package com.google.android.gms.internal.gtm;

import java.io.IOException;

public class zzvk extends IOException {
    private C41627uk zza = null;
    private boolean zzb;

    public zzvk(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    public static zzvj m168994a() {
        return new zzvj("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zzvk m168995b() {
        return new zzvk("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static zzvk m168996c() {
        return new zzvk("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static zzvk m168997d() {
        return new zzvk("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static zzvk m168998e() {
        return new zzvk("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static zzvk m168999f() {
        return new zzvk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static zzvk m169000g() {
        return new zzvk("Failed to parse the message.");
    }

    /* renamed from: i */
    public static zzvk m169001i() {
        return new zzvk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    public static zzvk m169002j() {
        return new zzvk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final zzvk mo136159h(C41627uk ukVar) {
        this.zza = ukVar;
        return this;
    }

    /* renamed from: k */
    public final void mo136160k() {
        this.zzb = true;
    }

    /* renamed from: l */
    public final boolean mo136161l() {
        return this.zzb;
    }

    public zzvk(String str) {
        super(str);
    }
}
