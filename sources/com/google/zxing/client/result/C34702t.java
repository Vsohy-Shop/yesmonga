package com.google.zxing.client.result;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.zxing.C34761k;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.client.result.t */
public abstract class C34702t {

    /* renamed from: a */
    public static final C34702t[] f84009a = {new C34683f(), new C34677c(), new C34691j(), new C34675b(), new C34682e0(), new C34681e(), new C34684f0(), new C34689i(), new C34706x(), new C34708z(), new C34703u(), new C34705w(), new C34696n(), new C34692j0(), new C34680d0(), new C34678c0(), new C34698p(), new C34701s(), new C34694l(), new C34688h0()};

    /* renamed from: b */
    public static final Pattern f84010b = Pattern.compile("\\d+");

    /* renamed from: c */
    public static final Pattern f84011c = Pattern.compile("&");

    /* renamed from: d */
    public static final Pattern f84012d = Pattern.compile("=");

    /* renamed from: e */
    public static final String f84013e = "﻿";

    /* renamed from: f */
    public static final String[] f84014f = new String[0];

    /* renamed from: a */
    public static void m141530a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f84012d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], m141544p(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m141531b(CharSequence charSequence, int i) {
        int i2 = i - 1;
        int i3 = 0;
        while (i2 >= 0 && charSequence.charAt(i2) == '\\') {
            i3++;
            i2--;
        }
        return i3;
    }

    /* renamed from: c */
    public static String m141532c(C34761k kVar) {
        String g = kVar.mo102878g();
        if (g.startsWith(f84013e)) {
            return g.substring(1);
        }
        return g;
    }

    /* renamed from: d */
    public static boolean m141533d(CharSequence charSequence, int i) {
        return charSequence != null && i > 0 && i == charSequence.length() && f84010b.matcher(charSequence).matches();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = r4 + r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m141534e(java.lang.CharSequence r2, int r3, int r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x001f
            if (r4 > 0) goto L_0x0006
            goto L_0x001f
        L_0x0006:
            int r4 = r4 + r3
            int r1 = r2.length()
            if (r1 < r4) goto L_0x001f
            java.util.regex.Pattern r1 = f84010b
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)
            java.util.regex.Matcher r2 = r1.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x001f
            r2 = 1
            return r2
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.C34702t.m141534e(java.lang.CharSequence, int, int):boolean");
    }

    /* renamed from: f */
    public static String[] m141535f(String str, String str2, char c, boolean z) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            boolean z2 = true;
            ArrayList arrayList2 = arrayList;
            int i2 = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c, i2);
                if (indexOf2 < 0) {
                    i2 = str2.length();
                } else if (m141531b(str2, indexOf2) % 2 != 0) {
                    i2 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String o = m141543o(str2.substring(length2, indexOf2));
                    if (z) {
                        o = o.trim();
                    }
                    if (!o.isEmpty()) {
                        arrayList2.add(o);
                    }
                    i2 = indexOf2 + 1;
                }
                z2 = false;
            }
            i = i2;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(f84014f);
    }

    /* renamed from: g */
    public static String m141536g(String str, String str2, char c, boolean z) {
        String[] f = m141535f(str, str2, c, z);
        if (f == null) {
            return null;
        }
        return f[0];
    }

    /* renamed from: h */
    public static void m141537h(String str, StringBuilder sb) {
        if (str != null) {
            sb.append(10);
            sb.append(str);
        }
    }

    /* renamed from: i */
    public static void m141538i(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String append : strArr) {
                sb.append(10);
                sb.append(append);
            }
        }
    }

    /* renamed from: j */
    public static String[] m141539j(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    /* renamed from: l */
    public static int m141540l(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = C15369g.f37993s;
        if (c < 'a' || c > 'f') {
            c2 = C15369g.f37994t;
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: m */
    public static Map<String, String> m141541m(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String a : f84011c.split(str.substring(indexOf + 1))) {
            m141530a(a, hashMap);
        }
        return hashMap;
    }

    /* renamed from: n */
    public static C34699q m141542n(C34761k kVar) {
        for (C34702t k : f84009a) {
            C34699q k2 = k.mo102518k(kVar);
            if (k2 != null) {
                return k2;
            }
        }
        return new C34674a0(kVar.mo102878g(), (String) null);
    }

    /* renamed from: o */
    public static String m141543o(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z || charAt != '\\') {
                sb.append(charAt);
                z = false;
            } else {
                z = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    /* renamed from: p */
    public static String m141544p(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public abstract C34699q mo102518k(C34761k kVar);
}
