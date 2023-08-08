package androidx.core.net;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C18001r;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.C11626x;

/* renamed from: androidx.core.net.c */
public final class C17767c {

    /* renamed from: b */
    public static final String f46167b = "mailto:";

    /* renamed from: c */
    public static final String f46168c = "mailto";

    /* renamed from: d */
    public static final String f46169d = "to";

    /* renamed from: e */
    public static final String f46170e = "body";

    /* renamed from: f */
    public static final String f46171f = "cc";

    /* renamed from: g */
    public static final String f46172g = "bcc";

    /* renamed from: h */
    public static final String f46173h = "subject";

    /* renamed from: a */
    public HashMap<String, String> f46174a = new HashMap<>();

    /* renamed from: g */
    public static boolean m81120g(@C0363p0 Uri uri) {
        if (uri == null || !f46168c.equals(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m81121h(@C0363p0 String str) {
        if (str == null || !str.startsWith(f46167b)) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: i */
    public static C17767c m81122i(@C0359n0 Uri uri) throws ParseException {
        return m81123j(uri.toString());
    }

    @C0359n0
    /* renamed from: j */
    public static C17767c m81123j(@C0359n0 String str) throws ParseException {
        String str2;
        String str3;
        String str4;
        C18001r.m81775l(str);
        if (m81121h(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                str3 = Uri.decode(str.substring(7));
                str2 = null;
            } else {
                str3 = Uri.decode(str.substring(7, indexOf2));
                str2 = str.substring(indexOf2 + 1);
            }
            C17767c cVar = new C17767c();
            if (str2 != null) {
                for (String split : str2.split("&")) {
                    String[] split2 = split.split("=", 2);
                    if (split2.length != 0) {
                        String lowerCase = Uri.decode(split2[0]).toLowerCase(Locale.ROOT);
                        if (split2.length > 1) {
                            str4 = Uri.decode(split2[1]);
                        } else {
                            str4 = null;
                        }
                        cVar.f46174a.put(lowerCase, str4);
                    }
                }
            }
            String f = cVar.mo52214f();
            if (f != null) {
                str3 = str3 + ", " + f;
            }
            cVar.f46174a.put("to", str3);
            return cVar;
        }
        throw new ParseException("Not a mailto scheme");
    }

    @C0363p0
    /* renamed from: a */
    public String mo52209a() {
        return this.f46174a.get(f46172g);
    }

    @C0363p0
    /* renamed from: b */
    public String mo52210b() {
        return this.f46174a.get("body");
    }

    @C0363p0
    /* renamed from: c */
    public String mo52211c() {
        return this.f46174a.get("cc");
    }

    @C0363p0
    /* renamed from: d */
    public Map<String, String> mo52212d() {
        return this.f46174a;
    }

    @C0363p0
    /* renamed from: e */
    public String mo52213e() {
        return this.f46174a.get(f46173h);
    }

    @C0363p0
    /* renamed from: f */
    public String mo52214f() {
        return this.f46174a.get("to");
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder(f46167b);
        sb.append('?');
        for (Map.Entry next : this.f46174a.entrySet()) {
            sb.append(Uri.encode((String) next.getKey()));
            sb.append('=');
            sb.append(Uri.encode((String) next.getValue()));
            sb.append(C11626x.f28913d);
        }
        return sb.toString();
    }
}
