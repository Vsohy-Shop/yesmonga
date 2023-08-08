package androidx.webkit;

import androidx.annotation.C0359n0;
import androidx.webkit.internal.C20937w0;
import java.util.concurrent.Executor;

/* renamed from: androidx.webkit.e */
public abstract class C20845e {

    /* renamed from: androidx.webkit.e$a */
    public static class C20846a {

        /* renamed from: a */
        public static final C20845e f53915a = new C20937w0();
    }

    @C0359n0
    /* renamed from: b */
    public static C20845e m96772b() {
        if (C20980u.m97120a(C20980u.f54097L)) {
            return C20846a.f53915a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    /* renamed from: a */
    public abstract void mo62599a(@C0359n0 Executor executor, @C0359n0 Runnable runnable);

    /* renamed from: c */
    public abstract void mo62600c(@C0359n0 C20841d dVar, @C0359n0 Executor executor, @C0359n0 Runnable runnable);
}
