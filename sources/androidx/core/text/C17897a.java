package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.C11626x;

/* renamed from: androidx.core.text.a */
public final class C17897a {

    /* renamed from: d */
    public static final C17917f0 f46317d;

    /* renamed from: e */
    public static final char f46318e = '‪';

    /* renamed from: f */
    public static final char f46319f = '‫';

    /* renamed from: g */
    public static final char f46320g = '‬';

    /* renamed from: h */
    public static final char f46321h = '‎';

    /* renamed from: i */
    public static final char f46322i = '‏';

    /* renamed from: j */
    public static final String f46323j = Character.toString(f46321h);

    /* renamed from: k */
    public static final String f46324k = Character.toString(f46322i);

    /* renamed from: l */
    public static final String f46325l = "";

    /* renamed from: m */
    public static final int f46326m = 2;

    /* renamed from: n */
    public static final int f46327n = 2;

    /* renamed from: o */
    public static final C17897a f46328o;

    /* renamed from: p */
    public static final C17897a f46329p;

    /* renamed from: q */
    public static final int f46330q = -1;

    /* renamed from: r */
    public static final int f46331r = 0;

    /* renamed from: s */
    public static final int f46332s = 1;

    /* renamed from: a */
    public final boolean f46333a;

    /* renamed from: b */
    public final int f46334b;

    /* renamed from: c */
    public final C17917f0 f46335c;

    /* renamed from: androidx.core.text.a$b */
    public static class C17899b {

        /* renamed from: f */
        public static final int f46339f = 1792;

        /* renamed from: g */
        public static final byte[] f46340g = new byte[f46339f];

        /* renamed from: a */
        public final CharSequence f46341a;

        /* renamed from: b */
        public final boolean f46342b;

        /* renamed from: c */
        public final int f46343c;

        /* renamed from: d */
        public int f46344d;

        /* renamed from: e */
        public char f46345e;

        static {
            for (int i = 0; i < 1792; i++) {
                f46340g[i] = Character.getDirectionality(i);
            }
        }

        public C17899b(CharSequence charSequence, boolean z) {
            this.f46341a = charSequence;
            this.f46342b = z;
            this.f46343c = charSequence.length();
        }

        /* renamed from: c */
        public static byte m81442c(char c) {
            return c < 1792 ? f46340g[c] : Character.getDirectionality(c);
        }

        /* renamed from: a */
        public byte mo52323a() {
            char charAt = this.f46341a.charAt(this.f46344d - 1);
            this.f46345e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f46341a, this.f46344d);
                this.f46344d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f46344d--;
            byte c = m81442c(this.f46345e);
            if (!this.f46342b) {
                return c;
            }
            char c2 = this.f46345e;
            if (c2 == '>') {
                return mo52329h();
            }
            if (c2 == ';') {
                return mo52327f();
            }
            return c;
        }

        /* renamed from: b */
        public byte mo52324b() {
            char charAt = this.f46341a.charAt(this.f46344d);
            this.f46345e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f46341a, this.f46344d);
                this.f46344d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f46344d++;
            byte c = m81442c(this.f46345e);
            if (!this.f46342b) {
                return c;
            }
            char c2 = this.f46345e;
            if (c2 == '<') {
                return mo52330i();
            }
            if (c2 == '&') {
                return mo52328g();
            }
            return c;
        }

        /* renamed from: d */
        public int mo52325d() {
            this.f46344d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f46344d < this.f46343c && i == 0) {
                byte b = mo52324b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f46344d > 0) {
                switch (mo52323a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: e */
        public int mo52326e() {
            this.f46344d = this.f46343c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f46344d > 0) {
                    byte a = mo52323a();
                    if (a != 0) {
                        if (a == 1 || a == 2) {
                            if (i == 0) {
                                return 1;
                            }
                            if (i2 == 0) {
                            }
                        } else if (a != 9) {
                            switch (a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i--;
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                        }
                    }
                }
                return 0;
            }
        }

        /* renamed from: f */
        public final byte mo52327f() {
            char charAt;
            int i = this.f46344d;
            do {
                int i2 = this.f46344d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f46341a;
                int i3 = i2 - 1;
                this.f46344d = i3;
                charAt = charSequence.charAt(i3);
                this.f46345e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f46344d = i;
            this.f46345e = ';';
            return 13;
        }

        /* renamed from: g */
        public final byte mo52328g() {
            char charAt;
            do {
                int i = this.f46344d;
                if (i >= this.f46343c) {
                    return 12;
                }
                CharSequence charSequence = this.f46341a;
                this.f46344d = i + 1;
                charAt = charSequence.charAt(i);
                this.f46345e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        public final byte mo52329h() {
            char charAt;
            int i = this.f46344d;
            while (true) {
                int i2 = this.f46344d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f46341a;
                int i3 = i2 - 1;
                this.f46344d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f46345e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f46344d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f46341a;
                        int i5 = i4 - 1;
                        this.f46344d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f46345e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f46344d = i;
            this.f46345e = C11626x.f28915f;
            return 13;
        }

        /* renamed from: i */
        public final byte mo52330i() {
            char charAt;
            int i = this.f46344d;
            while (true) {
                int i2 = this.f46344d;
                if (i2 < this.f46343c) {
                    CharSequence charSequence = this.f46341a;
                    this.f46344d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f46345e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f46344d;
                            if (i3 >= this.f46343c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f46341a;
                            this.f46344d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f46345e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f46344d = i;
                    this.f46345e = C11626x.f28914e;
                    return 13;
                }
            }
        }
    }

    static {
        C17917f0 f0Var = C17919g0.f46380c;
        f46317d = f0Var;
        f46328o = new C17897a(false, 2, f0Var);
        f46329p = new C17897a(true, 2, f0Var);
    }

    public C17897a(boolean z, int i, C17917f0 f0Var) {
        this.f46333a = z;
        this.f46334b = i;
        this.f46335c = f0Var;
    }

    /* renamed from: a */
    public static int m81417a(CharSequence charSequence) {
        return new C17899b(charSequence, false).mo52325d();
    }

    /* renamed from: b */
    public static int m81418b(CharSequence charSequence) {
        return new C17899b(charSequence, false).mo52326e();
    }

    /* renamed from: c */
    public static C17897a m81419c() {
        return new C17898a().mo52319a();
    }

    /* renamed from: d */
    public static C17897a m81420d(Locale locale) {
        return new C17898a(locale).mo52319a();
    }

    /* renamed from: e */
    public static C17897a m81421e(boolean z) {
        return new C17898a(z).mo52319a();
    }

    /* renamed from: j */
    public static boolean m81422j(Locale locale) {
        return C17927h0.m81524b(locale) == 1;
    }

    /* renamed from: f */
    public boolean mo52305f() {
        return (this.f46334b & 2) != 0;
    }

    /* renamed from: g */
    public boolean mo52306g(CharSequence charSequence) {
        return this.f46335c.mo52361a(charSequence, 0, charSequence.length());
    }

    /* renamed from: h */
    public boolean mo52307h(String str) {
        return mo52306g(str);
    }

    /* renamed from: i */
    public boolean mo52308i() {
        return this.f46333a;
    }

    /* renamed from: k */
    public final String mo52309k(CharSequence charSequence, C17917f0 f0Var) {
        boolean a = f0Var.mo52361a(charSequence, 0, charSequence.length());
        if (!this.f46333a && (a || m81418b(charSequence) == 1)) {
            return f46323j;
        }
        if (!this.f46333a) {
            return "";
        }
        if (!a || m81418b(charSequence) == -1) {
            return f46324k;
        }
        return "";
    }

    /* renamed from: l */
    public final String mo52310l(CharSequence charSequence, C17917f0 f0Var) {
        boolean a = f0Var.mo52361a(charSequence, 0, charSequence.length());
        if (!this.f46333a && (a || m81417a(charSequence) == 1)) {
            return f46323j;
        }
        if (!this.f46333a) {
            return "";
        }
        if (!a || m81417a(charSequence) == -1) {
            return f46324k;
        }
        return "";
    }

    /* renamed from: m */
    public CharSequence mo52311m(CharSequence charSequence) {
        return mo52313o(charSequence, this.f46335c, true);
    }

    /* renamed from: n */
    public CharSequence mo52312n(CharSequence charSequence, C17917f0 f0Var) {
        return mo52313o(charSequence, f0Var, true);
    }

    /* renamed from: o */
    public CharSequence mo52313o(CharSequence charSequence, C17917f0 f0Var, boolean z) {
        C17917f0 f0Var2;
        char c;
        C17917f0 f0Var3;
        if (charSequence == null) {
            return null;
        }
        boolean a = f0Var.mo52361a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo52305f() && z) {
            if (a) {
                f0Var3 = C17919g0.f46379b;
            } else {
                f0Var3 = C17919g0.f46378a;
            }
            spannableStringBuilder.append(mo52310l(charSequence, f0Var3));
        }
        if (a != this.f46333a) {
            if (a) {
                c = f46319f;
            } else {
                c = f46318e;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f46320g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (a) {
                f0Var2 = C17919g0.f46379b;
            } else {
                f0Var2 = C17919g0.f46378a;
            }
            spannableStringBuilder.append(mo52309k(charSequence, f0Var2));
        }
        return spannableStringBuilder;
    }

    /* renamed from: p */
    public CharSequence mo52314p(CharSequence charSequence, boolean z) {
        return mo52313o(charSequence, this.f46335c, z);
    }

    /* renamed from: q */
    public String mo52315q(String str) {
        return mo52317s(str, this.f46335c, true);
    }

    /* renamed from: r */
    public String mo52316r(String str, C17917f0 f0Var) {
        return mo52317s(str, f0Var, true);
    }

    /* renamed from: s */
    public String mo52317s(String str, C17917f0 f0Var, boolean z) {
        if (str == null) {
            return null;
        }
        return mo52313o(str, f0Var, z).toString();
    }

    /* renamed from: t */
    public String mo52318t(String str, boolean z) {
        return mo52317s(str, this.f46335c, z);
    }

    /* renamed from: androidx.core.text.a$a */
    public static final class C17898a {

        /* renamed from: a */
        public boolean f46336a;

        /* renamed from: b */
        public int f46337b;

        /* renamed from: c */
        public C17917f0 f46338c;

        public C17898a() {
            mo52320c(C17897a.m81422j(Locale.getDefault()));
        }

        /* renamed from: b */
        public static C17897a m81437b(boolean z) {
            return z ? C17897a.f46329p : C17897a.f46328o;
        }

        /* renamed from: a */
        public C17897a mo52319a() {
            if (this.f46337b == 2 && this.f46338c == C17897a.f46317d) {
                return m81437b(this.f46336a);
            }
            return new C17897a(this.f46336a, this.f46337b, this.f46338c);
        }

        /* renamed from: c */
        public final void mo52320c(boolean z) {
            this.f46336a = z;
            this.f46338c = C17897a.f46317d;
            this.f46337b = 2;
        }

        /* renamed from: d */
        public C17898a mo52321d(C17917f0 f0Var) {
            this.f46338c = f0Var;
            return this;
        }

        /* renamed from: e */
        public C17898a mo52322e(boolean z) {
            if (z) {
                this.f46337b |= 2;
            } else {
                this.f46337b &= -3;
            }
            return this;
        }

        public C17898a(boolean z) {
            mo52320c(z);
        }

        public C17898a(Locale locale) {
            mo52320c(C17897a.m81422j(locale));
        }
    }
}
