package org.jsoup.parser;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.installations.local.C33093b;
import kotlinx.serialization.json.internal.C12361b;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;

/* renamed from: org.jsoup.parser.g */
public class C12894g {

    /* renamed from: c */
    public static final char f31877c = '\\';

    /* renamed from: a */
    public String f31878a;

    /* renamed from: b */
    public int f31879b = 0;

    public C12894g(String str) {
        C12750d.m55073j(str);
        this.f31878a = str;
    }

    /* renamed from: D */
    public static String m55964D(String str) {
        StringBuilder b = C12759f.m55102b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                b.append(c2);
            } else if (c == '\\') {
                b.append(c2);
            }
            i++;
            c = c2;
        }
        return C12759f.m55116p(b);
    }

    @Deprecated
    /* renamed from: A */
    public char mo30203A() {
        if (mo30223r()) {
            return 0;
        }
        return this.f31878a.charAt(this.f31879b);
    }

    /* renamed from: B */
    public String mo30204B() {
        String substring = this.f31878a.substring(this.f31879b);
        this.f31879b = this.f31878a.length();
        return substring;
    }

    /* renamed from: C */
    public final int mo30205C() {
        return this.f31878a.length() - this.f31879b;
    }

    @Deprecated
    /* renamed from: a */
    public void mo30206a(Character ch) {
        mo30207b(ch.toString());
    }

    /* renamed from: b */
    public void mo30207b(String str) {
        this.f31878a = str + this.f31878a.substring(this.f31879b);
        this.f31879b = 0;
    }

    /* renamed from: c */
    public void mo30208c() {
        if (!mo30223r()) {
            this.f31879b++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c A[LOOP:0: B:1:0x0009->B:40:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0055 A[EDGE_INSN: B:42:0x0055->B:34:0x0055 ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo30209d(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
            r7 = r4
            r8 = r7
        L_0x0009:
            boolean r9 = r11.mo30223r()
            if (r9 == 0) goto L_0x0010
            goto L_0x0055
        L_0x0010:
            char r9 = r11.mo30212g()
            r10 = 92
            if (r2 == r10) goto L_0x0042
            r10 = 39
            if (r9 != r10) goto L_0x0023
            if (r9 == r12) goto L_0x0023
            if (r3 != 0) goto L_0x0023
            r4 = r4 ^ 1
            goto L_0x002d
        L_0x0023:
            r10 = 34
            if (r9 != r10) goto L_0x002d
            if (r9 == r12) goto L_0x002d
            if (r4 != 0) goto L_0x002d
            r3 = r3 ^ 1
        L_0x002d:
            if (r4 != 0) goto L_0x0053
            if (r3 != 0) goto L_0x0053
            if (r8 == 0) goto L_0x0034
            goto L_0x0053
        L_0x0034:
            if (r9 != r12) goto L_0x003d
            int r7 = r7 + 1
            if (r5 != r0) goto L_0x004d
            int r5 = r11.f31879b
            goto L_0x004d
        L_0x003d:
            if (r9 != r13) goto L_0x004d
            int r7 = r7 + -1
            goto L_0x004d
        L_0x0042:
            r10 = 81
            if (r9 != r10) goto L_0x0048
            r8 = 1
            goto L_0x004d
        L_0x0048:
            r10 = 69
            if (r9 != r10) goto L_0x004d
            r8 = r1
        L_0x004d:
            if (r7 <= 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            int r6 = r11.f31879b
        L_0x0053:
            if (r7 > 0) goto L_0x007c
        L_0x0055:
            if (r6 < 0) goto L_0x005e
            java.lang.String r12 = r11.f31878a
            java.lang.String r12 = r12.substring(r5, r6)
            goto L_0x0060
        L_0x005e:
            java.lang.String r12 = ""
        L_0x0060:
            if (r7 <= 0) goto L_0x007b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = "'"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            org.jsoup.helper.C12750d.m55064a(r13)
        L_0x007b:
            return r12
        L_0x007c:
            r2 = r9
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C12894g.mo30209d(char, char):java.lang.String");
    }

    /* renamed from: e */
    public String mo30210e(String str) {
        String m = mo30218m(str);
        mo30224s(str);
        return m;
    }

    /* renamed from: f */
    public String mo30211f(String str) {
        String o = mo30220o(str);
        mo30224s(str);
        return o;
    }

    /* renamed from: g */
    public char mo30212g() {
        String str = this.f31878a;
        int i = this.f31879b;
        this.f31879b = i + 1;
        return str.charAt(i);
    }

    /* renamed from: h */
    public void mo30213h(String str) {
        if (mo30225t(str)) {
            int length = str.length();
            if (length <= mo30205C()) {
                this.f31879b += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    @Deprecated
    /* renamed from: i */
    public String mo30214i() {
        int i = this.f31879b;
        while (!mo30223r() && (mo30232z() || mo30227u('-', '_', C12361b.f30257h))) {
            this.f31879b++;
        }
        return this.f31878a.substring(i, this.f31879b);
    }

    /* renamed from: j */
    public String mo30215j() {
        int i = this.f31879b;
        while (!mo30223r() && (mo30232z() || mo30227u('-', '_'))) {
            this.f31879b++;
        }
        return this.f31878a.substring(i, this.f31879b);
    }

    /* renamed from: k */
    public String mo30216k() {
        int i = this.f31879b;
        while (!mo30223r() && (mo30232z() || mo30228v("*|", C33093b.f80279g, C32920e.f79928l, "-"))) {
            this.f31879b++;
        }
        return this.f31878a.substring(i, this.f31879b);
    }

    @Deprecated
    /* renamed from: l */
    public String mo30217l() {
        int i = this.f31879b;
        while (!mo30223r() && (mo30232z() || mo30227u(C12361b.f30257h, '_', '-'))) {
            this.f31879b++;
        }
        return this.f31878a.substring(i, this.f31879b);
    }

    /* renamed from: m */
    public String mo30218m(String str) {
        int indexOf = this.f31878a.indexOf(str, this.f31879b);
        if (indexOf == -1) {
            return mo30204B();
        }
        String substring = this.f31878a.substring(this.f31879b, indexOf);
        this.f31879b += substring.length();
        return substring;
    }

    /* renamed from: n */
    public String mo30219n(String... strArr) {
        int i = this.f31879b;
        while (!mo30223r() && !mo30228v(strArr)) {
            this.f31879b++;
        }
        return this.f31878a.substring(i, this.f31879b);
    }

    /* renamed from: o */
    public String mo30220o(String str) {
        int i = this.f31879b;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!mo30223r() && !mo30225t(str)) {
            if (equals) {
                int indexOf = this.f31878a.indexOf(substring, this.f31879b);
                int i2 = this.f31879b;
                int i3 = indexOf - i2;
                if (i3 == 0) {
                    this.f31879b = i2 + 1;
                } else if (i3 < 0) {
                    this.f31879b = this.f31878a.length();
                } else {
                    this.f31879b = i2 + i3;
                }
            } else {
                this.f31879b++;
            }
        }
        return this.f31878a.substring(i, this.f31879b);
    }

    /* renamed from: p */
    public boolean mo30221p() {
        boolean z = false;
        while (mo30231y()) {
            this.f31879b++;
            z = true;
        }
        return z;
    }

    /* renamed from: q */
    public String mo30222q() {
        int i = this.f31879b;
        while (mo30232z()) {
            this.f31879b++;
        }
        return this.f31878a.substring(i, this.f31879b);
    }

    /* renamed from: r */
    public boolean mo30223r() {
        return mo30205C() == 0;
    }

    /* renamed from: s */
    public boolean mo30224s(String str) {
        if (!mo30225t(str)) {
            return false;
        }
        this.f31879b += str.length();
        return true;
    }

    /* renamed from: t */
    public boolean mo30225t(String str) {
        return this.f31878a.regionMatches(true, this.f31879b, str, 0, str.length());
    }

    public String toString() {
        return this.f31878a.substring(this.f31879b);
    }

    /* renamed from: u */
    public boolean mo30227u(char... cArr) {
        if (mo30223r()) {
            return false;
        }
        for (char c : cArr) {
            if (this.f31878a.charAt(this.f31879b) == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo30228v(String... strArr) {
        for (String t : strArr) {
            if (mo30225t(t)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: w */
    public boolean mo30229w(String str) {
        return this.f31878a.startsWith(str, this.f31879b);
    }

    @Deprecated
    /* renamed from: x */
    public boolean mo30230x() {
        return mo30205C() >= 2 && this.f31878a.charAt(this.f31879b) == '<' && Character.isLetter(this.f31878a.charAt(this.f31879b + 1));
    }

    /* renamed from: y */
    public boolean mo30231y() {
        return !mo30223r() && C12759f.m55110j(this.f31878a.charAt(this.f31879b));
    }

    /* renamed from: z */
    public boolean mo30232z() {
        return !mo30223r() && Character.isLetterOrDigit(this.f31878a.charAt(this.f31879b));
    }
}
