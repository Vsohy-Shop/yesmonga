package com.urbanairship.util;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.urbanairship.C36059m;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.urbanairship.util.o0 */
public abstract class C9669o0 {
    @C0363p0
    /* renamed from: a */
    public static byte[] m36220a(@C0363p0 String str) {
        if (m36224e(str)) {
            return null;
        }
        try {
            return Base64.decode(str, 0);
        } catch (IllegalArgumentException unused) {
            C36059m.m148419o("Failed to decode string: %s", str);
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public static String m36221b(@C0363p0 String str) {
        byte[] a = m36220a(str);
        if (a == null) {
            return null;
        }
        try {
            return new String(a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C36059m.m148411g(e, "Failed to create string", new Object[0]);
            return null;
        }
    }

    @C0359n0
    /* renamed from: c */
    public static String m36222c(@C0359n0 byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m36223d(@C0363p0 String str, @C0363p0 String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: e */
    public static boolean m36224e(@C0363p0 String str) {
        return str == null || str.length() == 0;
    }

    @C0359n0
    /* renamed from: f */
    public static String m36225f(@C0359n0 Collection<String> collection, @C0359n0 String str) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @C0359n0
    /* renamed from: g */
    public static String m36226g(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2) {
        int identifier = context.getResources().getIdentifier(str, C16717v.C16719b.f42182e, context.getApplicationInfo().packageName);
        if (identifier == 0) {
            return str2;
        }
        return context.getString(identifier);
    }

    @C0363p0
    /* renamed from: h */
    public static String m36227h(@C0363p0 String str) {
        if (m36224e(str)) {
            return null;
        }
        return str;
    }

    @C0359n0
    /* renamed from: i */
    public static String m36228i(@C0359n0 String str, int i, @C0359n0 String str2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < i) {
            sb.append(str);
            i2++;
            if (i2 != i) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    @C0363p0
    /* renamed from: j */
    public static String m36229j(@C0363p0 String str) {
        if (str == null) {
            return null;
        }
        try {
            return m36222c(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            C36059m.m148411g(e, "Failed to encode string: %s", str);
            return null;
        }
    }

    @C0363p0
    /* renamed from: k */
    public static byte[] m36230k(@C0363p0 String str) {
        if (str == null) {
            return null;
        }
        try {
            return MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            C36059m.m148411g(e, "Failed to encode string: %s", str);
            return null;
        }
    }
}
