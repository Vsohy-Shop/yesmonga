package androidx.fragment.app.strictmode;

import androidx.fragment.app.strictmode.FragmentStrictMode;

/* renamed from: androidx.fragment.app.strictmode.a */
public final /* synthetic */ class C19273a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FragmentStrictMode.C19270b f49611a;

    /* renamed from: b */
    public final /* synthetic */ Violation f49612b;

    public /* synthetic */ C19273a(FragmentStrictMode.C19270b bVar, Violation violation) {
        this.f49611a = bVar;
        this.f49612b = violation;
    }

    public final void run() {
        FragmentStrictMode.m90374f(this.f49611a, this.f49612b);
    }
}
