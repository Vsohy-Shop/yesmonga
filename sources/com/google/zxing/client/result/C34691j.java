package com.google.zxing.client.result;

import com.google.zxing.C34761k;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.client.result.j */
public final class C34691j extends C34673a {

    /* renamed from: g */
    public static final Pattern f83982g = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* renamed from: s */
    public static boolean m141484s(String str) {
        return str != null && f83982g.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    /* renamed from: t */
    public C34687h mo102518k(C34761k kVar) {
        String[] q;
        String c = C34702t.m141532c(kVar);
        if (!c.startsWith("MATMSG:") || (q = C34673a.m141366q("TO:", c, true)) == null) {
            return null;
        }
        for (String s : q) {
            if (!m141484s(s)) {
                return null;
            }
        }
        return new C34687h(q, (String[]) null, (String[]) null, C34673a.m141367r("SUB:", c, false), C34673a.m141367r("BODY:", c, false));
    }
}
