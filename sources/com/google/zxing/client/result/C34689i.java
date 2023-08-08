package com.google.zxing.client.result;

import androidx.core.net.C17767c;
import com.google.zxing.C34761k;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.client.result.i */
public final class C34689i extends C34702t {

    /* renamed from: g */
    public static final Pattern f83973g = Pattern.compile(",");

    /* renamed from: q */
    public C34687h mo102518k(C34761k kVar) {
        String[] strArr;
        String str;
        String str2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String str3;
        String c = C34702t.m141532c(kVar);
        String[] strArr6 = null;
        if (c.startsWith(C17767c.f46167b) || c.startsWith("MAILTO:")) {
            String substring = c.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            try {
                String p = C34702t.m141544p(substring);
                if (!p.isEmpty()) {
                    strArr = f83973g.split(p);
                } else {
                    strArr = null;
                }
                Map<String, String> m = C34702t.m141541m(c);
                if (m != null) {
                    if (strArr == null && (str3 = m.get("to")) != null) {
                        strArr = f83973g.split(str3);
                    }
                    String str4 = m.get("cc");
                    if (str4 != null) {
                        strArr5 = f83973g.split(str4);
                    } else {
                        strArr5 = null;
                    }
                    String str5 = m.get(C17767c.f46172g);
                    if (str5 != null) {
                        strArr6 = f83973g.split(str5);
                    }
                    str = m.get("body");
                    strArr4 = strArr;
                    strArr2 = strArr6;
                    strArr3 = strArr5;
                    str2 = m.get(C17767c.f46173h);
                } else {
                    strArr4 = strArr;
                    strArr3 = null;
                    strArr2 = null;
                    str2 = null;
                    str = null;
                }
                return new C34687h(strArr4, strArr3, strArr2, str2, str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (!C34691j.m141484s(c)) {
            return null;
        } else {
            return new C34687h(c);
        }
    }
}
