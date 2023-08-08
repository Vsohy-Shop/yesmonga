package com.urbanairship;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.util.C9669o0;
import java.util.Locale;

/* renamed from: com.urbanairship.m */
public class C36059m {
    @C0359n0

    /* renamed from: a */
    public static String f89102a = "UALib";

    /* renamed from: b */
    public static C36061o f89103b = new C36061o(6, f89102a);

    /* renamed from: a */
    public static void m148405a(@C0359n0 C36060n nVar) {
        f89103b.mo107817a(nVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public static void m148406b(@C0359n0 String str, @C0363p0 Object... objArr) {
        f89103b.mo107819d(3, (Throwable) null, str, objArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public static void m148407c(@C0359n0 Throwable th, @C0359n0 String str, @C0363p0 Object... objArr) {
        f89103b.mo107819d(3, th, str, objArr);
    }

    /* renamed from: d */
    public static void m148408d() {
        f89103b.mo107821g(false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public static void m148409e(@C0359n0 String str, @C0363p0 Object... objArr) {
        f89103b.mo107819d(6, (Throwable) null, str, objArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public static void m148410f(@C0359n0 Throwable th) {
        f89103b.mo107819d(6, th, (String) null, (Object[]) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public static void m148411g(@C0359n0 Throwable th, @C0359n0 String str, @C0363p0 Object... objArr) {
        f89103b.mo107819d(6, th, str, objArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public static int m148412h() {
        return f89103b.mo107818c();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: i */
    public static void m148413i(@C0359n0 String str, @C0359n0 Object... objArr) {
        f89103b.mo107819d(4, (Throwable) null, str, objArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j */
    public static void m148414j(@C0359n0 Throwable th, @C0359n0 String str, @C0363p0 Object... objArr) {
        f89103b.mo107819d(4, th, str, objArr);
    }

    /* renamed from: k */
    public static int m148415k(@C0363p0 String str, int i) throws IllegalArgumentException {
        if (C9669o0.m36224e(str)) {
            return i;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.hashCode();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case 2251950:
                if (upperCase.equals("INFO")) {
                    c = 0;
                    break;
                }
                break;
            case 2402104:
                if (upperCase.equals("NONE")) {
                    c = 1;
                    break;
                }
                break;
            case 2656902:
                if (upperCase.equals("WARN")) {
                    c = 2;
                    break;
                }
                break;
            case 64921139:
                if (upperCase.equals("DEBUG")) {
                    c = 3;
                    break;
                }
                break;
            case 66247144:
                if (upperCase.equals("ERROR")) {
                    c = 4;
                    break;
                }
                break;
            case 1069090146:
                if (upperCase.equals("VERBOSE")) {
                    c = 5;
                    break;
                }
                break;
            case 1940088646:
                if (upperCase.equals("ASSERT")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 4;
            case 1:
            case 6:
                return 7;
            case 2:
                return 5;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 2;
            default:
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt <= 7 && parseInt >= 2) {
                        return parseInt;
                    }
                    m148421q("%s is not a valid log level. Falling back to %s.", Integer.valueOf(parseInt), Integer.valueOf(i));
                    return i;
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Invalid log level: " + str);
                }
        }
    }

    /* renamed from: l */
    public static void m148416l(@C0359n0 C36060n nVar) {
        f89103b.mo107820f(nVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m */
    public static void m148417m(int i) {
        f89103b.mo107822h(i);
    }

    /* renamed from: n */
    public static void m148418n(@C0359n0 String str) {
        f89103b.mo107823i(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o */
    public static void m148419o(@C0359n0 String str, @C0363p0 Object... objArr) {
        f89103b.mo107819d(2, (Throwable) null, str, objArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public static void m148420p(@C0359n0 Throwable th) {
        f89103b.mo107819d(2, th, (String) null, (Object[]) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public static void m148421q(@C0359n0 String str, @C0363p0 Object... objArr) {
        f89103b.mo107819d(5, (Throwable) null, str, objArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public static void m148422r(@C0359n0 Throwable th) {
        f89103b.mo107819d(5, th, (String) null, (Object[]) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s */
    public static void m148423s(@C0359n0 Throwable th, @C0359n0 String str, @C0363p0 Object... objArr) {
        f89103b.mo107819d(5, th, str, objArr);
    }
}
