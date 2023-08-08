package com.google.zxing.client.result;

import com.google.zxing.C34761k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.client.result.c0 */
public final class C34678c0 extends C34702t {

    /* renamed from: g */
    public static final Pattern f83913g = Pattern.compile("[-._~:/?#\\[\\]@!$&'()*+,;=%A-Za-z0-9]+");

    /* renamed from: h */
    public static final Pattern f83914h = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: i */
    public static final Pattern f83915i = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: j */
    public static final Pattern f83916j = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* renamed from: q */
    public static boolean m141383q(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f83915i.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f83916j.matcher(str);
        if (!matcher2.find() || matcher2.start() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m141384r(String str) {
        return !f83913g.matcher(str).matches() || f83914h.matcher(str).find();
    }

    /* renamed from: s */
    public C34676b0 mo102518k(C34761k kVar) {
        String c = C34702t.m141532c(kVar);
        if (c.startsWith("URL:") || c.startsWith("URI:")) {
            return new C34676b0(c.substring(4).trim(), (String) null);
        }
        String trim = c.trim();
        if (!m141383q(trim) || m141384r(trim)) {
            return null;
        }
        return new C34676b0(trim, (String) null);
    }
}
