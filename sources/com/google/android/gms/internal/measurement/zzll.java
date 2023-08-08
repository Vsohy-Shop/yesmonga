package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzll extends IOException {
    public zzll(String str) {
        super(str);
    }

    /* renamed from: a */
    public static zzlk m171372a() {
        return new zzlk("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static zzll m171373b() {
        return new zzll("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static zzll m171374c() {
        return new zzll("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static zzll m171375d() {
        return new zzll("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static zzll m171376e() {
        return new zzll("Failed to parse the message.");
    }

    /* renamed from: f */
    public static zzll m171377f() {
        return new zzll("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
