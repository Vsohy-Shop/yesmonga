package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* renamed from: com.google.firebase.crashlytics.internal.f */
public class C32741f {

    /* renamed from: c */
    public static final String f79489c = "FirebaseCrashlytics";

    /* renamed from: d */
    public static final C32741f f79490d = new C32741f(f79489c);

    /* renamed from: a */
    public final String f79491a;

    /* renamed from: b */
    public int f79492b = 4;

    public C32741f(String str) {
        this.f79491a = str;
    }

    /* renamed from: f */
    public static C32741f m132248f() {
        return f79490d;
    }

    /* renamed from: a */
    public final boolean mo95051a(int i) {
        return this.f79492b <= i || Log.isLoggable(this.f79491a, i);
    }

    /* renamed from: b */
    public void mo95052b(String str) {
        mo95053c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo95053c(String str, Throwable th) {
        mo95051a(3);
    }

    /* renamed from: d */
    public void mo95054d(String str) {
        mo95055e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo95055e(String str, Throwable th) {
        mo95051a(6);
    }

    /* renamed from: g */
    public void mo95056g(String str) {
        mo95057h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo95057h(String str, Throwable th) {
        mo95051a(4);
    }

    /* renamed from: i */
    public void mo95058i(int i, String str) {
        mo95059j(i, str, false);
    }

    /* renamed from: j */
    public void mo95059j(int i, String str, boolean z) {
        if (z || mo95051a(i)) {
            Log.println(i, this.f79491a, str);
        }
    }

    /* renamed from: k */
    public void mo95060k(String str) {
        mo95061l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo95061l(String str, Throwable th) {
        mo95051a(2);
    }

    /* renamed from: m */
    public void mo95062m(String str) {
        mo95063n(str, (Throwable) null);
    }

    /* renamed from: n */
    public void mo95063n(String str, Throwable th) {
        mo95051a(5);
    }
}
