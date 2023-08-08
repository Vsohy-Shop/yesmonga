package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;

public class zbye extends IOException {
    private x00 zba = null;

    public zbye(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    public static zbyd m121509a() {
        return new zbyd("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zbye m121510b() {
        return new zbye("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static zbye m121511c() {
        return new zbye("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static zbye m121512d() {
        return new zbye("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static zbye m121513e() {
        return new zbye("Failed to parse the message.");
    }

    /* renamed from: g */
    public static zbye m121514g() {
        return new zbye("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: f */
    public final zbye mo85004f(x00 x00) {
        this.zba = x00;
        return this;
    }

    public zbye(String str) {
        super(str);
    }
}
