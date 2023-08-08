package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14198b2;
import java.util.Locale;

/* renamed from: com.contentsquare.android.sdk.jf */
public class C14453jf {

    /* renamed from: b */
    public static C14198b2 f35699b;

    /* renamed from: c */
    public static final C14198b2.C14203e f35700c;

    /* renamed from: d */
    public static C14198b2.C14203e f35701d;

    /* renamed from: e */
    public static C14800v9 f35702e = new C14800v9();

    /* renamed from: a */
    public final String f35703a;

    static {
        C14198b2 b2Var = new C14198b2();
        f35699b = b2Var;
        C14198b2.C14203e a = b2Var.mo34629a(C14198b2.C14202d.f35091a);
        f35700c = a;
        f35701d = a;
    }

    public C14453jf() {
        this.f35703a = "CSLIB";
    }

    /* renamed from: a */
    public static String m62243a(String str) {
        return "CSLIB|" + str;
    }

    /* renamed from: b */
    public static void m62244b(C14198b2.C14202d dVar) {
        f35701d = (f35702e.mo36635a() || dVar == C14198b2.C14202d.VERBOSE) ? f35699b.mo34629a(C14198b2.C14202d.VERBOSE) : f35699b.mo34629a(dVar);
    }

    /* renamed from: h */
    public static void m62245h(String str) {
        f35701d.mo34638b("CSLIB", str);
    }

    /* renamed from: k */
    public static void m62246k(String str, Object... objArr) {
        f35701d.mo34638b("CSLIB", String.format(str, objArr));
    }

    /* renamed from: c */
    public void mo35674c(String str, Object... objArr) {
        f35701d.mo34639c(this.f35703a, String.format(str, objArr));
    }

    /* renamed from: d */
    public void mo35675d(Throwable th, String str, Object... objArr) {
        f35701d.mo34643g(this.f35703a, String.format(str, objArr), th);
    }

    /* renamed from: e */
    public void mo35676e(String str) {
        f35701d.mo34639c(this.f35703a, str);
    }

    /* renamed from: f */
    public void mo35677f(String str, Object... objArr) {
        f35701d.mo34642f(this.f35703a, String.format(str, objArr));
    }

    /* renamed from: g */
    public void mo35678g(Throwable th, String str, Object... objArr) {
        f35701d.mo34641e(this.f35703a, String.format(str, objArr), th);
    }

    /* renamed from: i */
    public void mo35679i(String str, Object... objArr) {
        f35701d.mo34637a("CSLIB", String.format(Locale.ENGLISH, str, objArr));
    }

    /* renamed from: j */
    public void mo35680j(Throwable th, String str, Object... objArr) {
        f35701d.mo34644h(this.f35703a, String.format(str, objArr), th);
    }

    /* renamed from: l */
    public void mo35681l(String str, Object... objArr) {
        f35701d.mo34640d(this.f35703a, String.format(str, objArr));
    }

    public C14453jf(String str) {
        this.f35703a = m62243a(str);
    }
}
