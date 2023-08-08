package androidx.core.p027os;

import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.p */
public final class C17819p implements C17824q {

    /* renamed from: c */
    public static final Locale[] f46199c = new Locale[0];

    /* renamed from: d */
    public static final Locale f46200d = new Locale("en", "XA");

    /* renamed from: e */
    public static final Locale f46201e = new Locale("ar", "XB");

    /* renamed from: f */
    public static final Locale f46202f = C17812o.m81210b("en-Latn");

    /* renamed from: a */
    public final Locale[] f46203a;
    @C0359n0

    /* renamed from: b */
    public final String f46204b;

    @C0376v0(21)
    /* renamed from: androidx.core.os.p$a */
    public static class C17820a {
        @C0373u
        /* renamed from: a */
        public static String m81246a(Locale locale) {
            return locale.getScript();
        }
    }

    public C17819p(@C0359n0 Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f46203a = f46199c;
            this.f46204b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m81238k(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f46203a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f46204b = sb.toString();
    }

    /* renamed from: h */
    public static String m81235h(Locale locale) {
        String a = C17820a.m81246a(locale);
        if (!a.isEmpty()) {
            return a;
        }
        return "";
    }

    /* renamed from: i */
    public static boolean m81236i(Locale locale) {
        return f46200d.equals(locale) || f46201e.equals(locale);
    }

    @C0337f0(from = 0, mo995to = 1)
    /* renamed from: j */
    public static int m81237j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m81236i(locale) || m81236i(locale2)) {
            return 0;
        }
        String h = m81235h(locale);
        if (!h.isEmpty()) {
            return h.equals(m81235h(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        if (country.isEmpty() || country.equals(locale2.getCountry())) {
            return 1;
        }
        return 0;
    }

    @C0344h1
    /* renamed from: k */
    public static void m81238k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public int mo52243a(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f46203a;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: b */
    public String mo52244b() {
        return this.f46204b;
    }

    @C0363p0
    /* renamed from: c */
    public Object mo52245c() {
        return null;
    }

    /* renamed from: d */
    public Locale mo52246d(@C0359n0 String[] strArr) {
        return mo52247e(Arrays.asList(strArr), false);
    }

    /* renamed from: e */
    public final Locale mo52247e(Collection<String> collection, boolean z) {
        int f = mo52249f(collection, z);
        if (f == -1) {
            return null;
        }
        return this.f46203a[f];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17819p)) {
            return false;
        }
        Locale[] localeArr = ((C17819p) obj).f46203a;
        if (this.f46203a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f46203a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L_0x001f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52249f(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f46203a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x0008
            return r3
        L_0x0008:
            int r0 = r0.length
            if (r0 != 0) goto L_0x000d
            r5 = -1
            return r5
        L_0x000d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L_0x001e
            java.util.Locale r6 = f46202f
            int r6 = r4.mo52250g(r6)
            if (r6 != 0) goto L_0x001b
            return r3
        L_0x001b:
            if (r6 >= r0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r6 = r0
        L_0x001f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0023:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.p027os.C17812o.m81210b(r1)
            int r1 = r4.mo52250g(r1)
            if (r1 != 0) goto L_0x003a
            return r3
        L_0x003a:
            if (r1 >= r6) goto L_0x0023
            r6 = r1
            goto L_0x0023
        L_0x003e:
            if (r6 != r0) goto L_0x0041
            return r3
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p027os.C17819p.mo52249f(java.util.Collection, boolean):int");
    }

    /* renamed from: g */
    public final int mo52250g(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f46203a;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (m81237j(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f46203a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f46203a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f46203a.length == 0;
    }

    public int size() {
        return this.f46203a.length;
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f46203a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f46203a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
