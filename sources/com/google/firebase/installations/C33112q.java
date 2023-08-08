package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.C0359n0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.q */
public class C33112q {

    /* renamed from: a */
    public static final byte f80289a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f80290b = Byte.parseByte("00001111", 2);

    /* renamed from: c */
    public static final int f80291c = 22;

    /* renamed from: b */
    public static String m133544b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m133545c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @C0359n0
    /* renamed from: a */
    public String mo95867a() {
        byte[] c = m133545c(UUID.randomUUID(), new byte[17]);
        byte b = c[0];
        c[16] = b;
        c[0] = (byte) ((b & f80290b) | f80289a);
        return m133544b(c);
    }
}
