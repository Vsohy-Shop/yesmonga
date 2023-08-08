package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

public class zzep extends IOException {
    private C39076w3 zza = null;

    public zzep(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    public static zzeo m161100a() {
        return new zzeo("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zzep m161101b() {
        return new zzep("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static zzep m161102c() {
        return new zzep("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static zzep m161103d() {
        return new zzep("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static zzep m161104e() {
        return new zzep("Failed to parse the message.");
    }

    /* renamed from: g */
    public static zzep m161105g() {
        return new zzep("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: f */
    public final zzep mo123207f(C39076w3 w3Var) {
        this.zza = w3Var;
        return this;
    }

    public zzep(String str) {
        super(str);
    }
}
