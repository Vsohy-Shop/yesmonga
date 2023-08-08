package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.material.badge.C31132a;
import com.urbanairship.C36064q;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.z */
public class C9689z implements C36064q<String>, C9333e {

    /* renamed from: E0 */
    public static final String f26521E0 = "^([0-9]+)(\\.[0-9]+)?(\\.[0-9]+)?$";

    /* renamed from: F0 */
    public static final Pattern f26522F0;

    /* renamed from: G0 */
    public static final Pattern f26523G0 = Pattern.compile(f26521E0);

    /* renamed from: H0 */
    public static final Pattern f26524H0 = Pattern.compile(f26527Z);

    /* renamed from: X */
    public static final String f26525X = "([0-9]+)(\\.[0-9]+)?(\\.[0-9]+)?";

    /* renamed from: Y */
    public static final String f26526Y;

    /* renamed from: Z */
    public static final String f26527Z = "^(.*)\\+$";

    /* renamed from: c */
    public static final String f26528c = "[";

    /* renamed from: d */
    public static final String f26529d = "]";

    /* renamed from: e */
    public static final String f26530e = "(";

    /* renamed from: f */
    public static final String f26531f = "]";

    /* renamed from: g */
    public static final String f26532g = "[";

    /* renamed from: v */
    public static final String f26533v = ")";

    /* renamed from: w */
    public static final String f26534w = ",";

    /* renamed from: x */
    public static final String f26535x = "\\s";

    /* renamed from: y */
    public static final String f26536y;

    /* renamed from: z */
    public static final String f26537z;

    /* renamed from: a */
    public final C36064q<String> f26538a;

    /* renamed from: b */
    public final String f26539b;

    /* renamed from: com.urbanairship.util.z$a */
    public class C9690a implements C36064q<String> {
        /* renamed from: a */
        public boolean apply(String str) {
            return true;
        }
    }

    /* renamed from: com.urbanairship.util.z$b */
    public class C9691b implements C36064q<String> {

        /* renamed from: a */
        public final /* synthetic */ String f26540a;

        public C9691b(String str) {
            this.f26540a = str;
        }

        /* renamed from: a */
        public boolean apply(@C0359n0 String str) {
            String str2 = this.f26540a;
            if (str2 == null) {
                return false;
            }
            return str.startsWith(str2);
        }
    }

    /* renamed from: com.urbanairship.util.z$c */
    public class C9692c implements C36064q<String> {

        /* renamed from: a */
        public final /* synthetic */ String f26541a;

        /* renamed from: b */
        public final /* synthetic */ C9694e f26542b;

        /* renamed from: c */
        public final /* synthetic */ String f26543c;

        /* renamed from: d */
        public final /* synthetic */ C9694e f26544d;

        public C9692c(String str, C9694e eVar, String str2, C9694e eVar2) {
            this.f26541a = str;
            this.f26542b = eVar;
            this.f26543c = str2;
            this.f26544d = eVar2;
        }

        /* renamed from: a */
        public boolean apply(@C0359n0 String str) {
            try {
                C9694e eVar = new C9694e(str);
                String str2 = this.f26541a;
                if (!(str2 == null || this.f26542b == null)) {
                    str2.hashCode();
                    if (!str2.equals("[")) {
                        if (str2.equals("]") && eVar.compareTo(this.f26542b) > 0) {
                            return false;
                        }
                    } else if (eVar.compareTo(this.f26542b) >= 0) {
                        return false;
                    }
                }
                String str3 = this.f26543c;
                if (str3 == null || this.f26544d == null) {
                    return true;
                }
                str3.hashCode();
                if (!str3.equals("[")) {
                    if (str3.equals("]") && eVar.compareTo(this.f26544d) <= 0) {
                        return false;
                    }
                    return true;
                } else if (eVar.compareTo(this.f26544d) < 0) {
                    return false;
                } else {
                    return true;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        }
    }

    /* renamed from: com.urbanairship.util.z$d */
    public class C9693d implements C36064q<String> {

        /* renamed from: a */
        public final /* synthetic */ String f26545a;

        public C9693d(String str) {
            this.f26545a = str;
        }

        /* renamed from: a */
        public boolean apply(String str) {
            return this.f26545a.equals(str);
        }
    }

    /* renamed from: com.urbanairship.util.z$e */
    public static class C9694e implements Comparable<C9694e> {

        /* renamed from: a */
        public final int[] f26546a = {0, 0, 0};

        /* renamed from: b */
        public final String f26547b;

        public C9694e(String str) {
            this.f26547b = str;
            String[] split = str.split("\\.");
            int i = 0;
            while (i < 3 && split.length > i) {
                this.f26546a[i] = Integer.parseInt(split[i]);
                i++;
            }
        }

        /* renamed from: b */
        public int compareTo(@C0359n0 C9694e eVar) {
            for (int i = 0; i < 3; i++) {
                int i2 = this.f26546a[i] - eVar.f26546a[i];
                if (i2 != 0) {
                    return i2 > 0 ? 1 : -1;
                }
            }
            return 0;
        }
    }

    static {
        Locale locale = Locale.US;
        String format = String.format(locale, "([\\%s\\%s\\%s])", new Object[]{"[", "]", "("});
        f26536y = format;
        String format2 = String.format(locale, "([\\%s\\%s\\%s])", new Object[]{"]", "[", ")"});
        f26537z = format2;
        String format3 = String.format(locale, "^(%s(%s)?)%s((%s)?%s)", new Object[]{format, f26525X, ",", f26525X, format2});
        f26526Y = format3;
        f26522F0 = Pattern.compile(format3);
    }

    public C9689z(C36064q<String> qVar, String str) {
        this.f26538a = qVar;
        this.f26539b = str;
    }

    @C0359n0
    /* renamed from: b */
    public static C9689z m36263b(@C0359n0 String str) {
        String replaceAll = str.replaceAll(f26535x, "");
        C36064q<String> c = m36264c(replaceAll);
        if (c != null) {
            return new C9689z(c, replaceAll);
        }
        C36064q<String> d = m36265d(replaceAll);
        if (d != null) {
            return new C9689z(d, replaceAll);
        }
        C36064q<String> e = m36266e(replaceAll);
        if (e != null) {
            return new C9689z(e, replaceAll);
        }
        throw new IllegalArgumentException("Invalid constraint: " + replaceAll);
    }

    @C0363p0
    /* renamed from: c */
    public static C36064q<String> m36264c(@C0359n0 String str) {
        if (!f26523G0.matcher(str).matches()) {
            return null;
        }
        return new C9693d(str);
    }

    @C0363p0
    /* renamed from: d */
    public static C36064q<String> m36265d(String str) {
        Matcher matcher = f26524H0.matcher(str);
        String str2 = null;
        if (!matcher.matches()) {
            return null;
        }
        if (C31132a.f74628J0.equals(str)) {
            return new C9690a();
        }
        if (matcher.groupCount() >= 1) {
            str2 = matcher.group(1);
        }
        return new C9691b(str2);
    }

    @C0363p0
    /* renamed from: e */
    public static C36064q<String> m36266e(String str) {
        String str2;
        C9694e eVar;
        String str3;
        String str4;
        C9694e eVar2;
        String str5;
        Matcher matcher = f26522F0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        if (matcher.groupCount() >= 7) {
            str2 = matcher.group(7);
        } else {
            str2 = null;
        }
        if (!C9669o0.m36224e(str2)) {
            str3 = str2.substring(str2.length() - 1);
            if (str2.length() > 1) {
                eVar = new C9694e(str2.substring(0, str2.length() - 1));
            } else {
                eVar = null;
            }
        } else {
            str3 = null;
            eVar = null;
        }
        if (matcher.groupCount() >= 1) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        if (!C9669o0.m36224e(str4)) {
            str5 = str4.substring(0, 1);
            if (str4.length() > 1) {
                eVar2 = new C9694e(str4.substring(1));
            } else {
                eVar2 = null;
            }
        } else {
            str5 = null;
            eVar2 = null;
        }
        if (")".equals(str3) && eVar != null) {
            return null;
        }
        if (!"(".equals(str5) || eVar2 == null) {
            return new C9692c(str3, eVar, str5, eVar2);
        }
        return null;
    }

    /* renamed from: a */
    public boolean apply(@C0363p0 String str) {
        if (str == null) {
            return false;
        }
        return this.f26538a.apply(str.trim());
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.f26539b;
        String str2 = ((C9689z) obj).f26539b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26539b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return JsonValue.m34968N(this.f26539b);
    }
}
