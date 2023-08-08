package com.google.firebase.perf.logging;

import androidx.annotation.C0344h1;
import java.util.Locale;

/* renamed from: com.google.firebase.perf.logging.a */
public class C33363a {

    /* renamed from: c */
    public static volatile C33363a f81042c;

    /* renamed from: a */
    public final C33365c f81043a;

    /* renamed from: b */
    public boolean f81044b;

    @C0344h1
    public C33363a(C33365c cVar) {
        this.f81044b = false;
        this.f81043a = cVar == null ? C33365c.m134466c() : cVar;
    }

    /* renamed from: e */
    public static C33363a m134449e() {
        if (f81042c == null) {
            synchronized (C33363a.class) {
                if (f81042c == null) {
                    f81042c = new C33363a();
                }
            }
        }
        return f81042c;
    }

    /* renamed from: a */
    public void mo96429a(String str) {
        if (this.f81044b) {
            this.f81043a.mo96441a(str);
        }
    }

    /* renamed from: b */
    public void mo96430b(String str, Object... objArr) {
        if (this.f81044b) {
            this.f81043a.mo96441a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: c */
    public void mo96431c(String str) {
        if (this.f81044b) {
            this.f81043a.mo96442b(str);
        }
    }

    /* renamed from: d */
    public void mo96432d(String str, Object... objArr) {
        if (this.f81044b) {
            this.f81043a.mo96442b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: f */
    public void mo96433f(String str) {
        if (this.f81044b) {
            this.f81043a.mo96443d(str);
        }
    }

    /* renamed from: g */
    public void mo96434g(String str, Object... objArr) {
        if (this.f81044b) {
            this.f81043a.mo96443d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: h */
    public boolean mo96435h() {
        return this.f81044b;
    }

    /* renamed from: i */
    public void mo96436i(boolean z) {
        this.f81044b = z;
    }

    /* renamed from: j */
    public void mo96437j(String str) {
        if (this.f81044b) {
            this.f81043a.mo96444e(str);
        }
    }

    /* renamed from: k */
    public void mo96438k(String str, Object... objArr) {
        if (this.f81044b) {
            this.f81043a.mo96444e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: l */
    public void mo96439l(String str) {
        if (this.f81044b) {
            this.f81043a.mo96445f(str);
        }
    }

    /* renamed from: m */
    public void mo96440m(String str, Object... objArr) {
        if (this.f81044b) {
            this.f81043a.mo96445f(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public C33363a() {
        this((C33365c) null);
    }
}
