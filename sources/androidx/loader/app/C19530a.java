package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19499w;
import androidx.loader.content.C19547c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.app.a */
public abstract class C19530a {

    /* renamed from: androidx.loader.app.a$a */
    public interface C19531a<D> {
        @C0353k0
        /* renamed from: a */
        void mo57727a(@C0359n0 C19547c<D> cVar, D d);

        @C0353k0
        @C0359n0
        /* renamed from: b */
        C19547c<D> mo57728b(int i, @C0363p0 Bundle bundle);

        @C0353k0
        /* renamed from: c */
        void mo57729c(@C0359n0 C19547c<D> cVar);
    }

    /* renamed from: c */
    public static void m90900c(boolean z) {
        C19532b.f49914d = z;
    }

    @C0359n0
    /* renamed from: d */
    public static <T extends C19499w & C19395b1> C19530a m90901d(@C0359n0 T t) {
        return new C19532b(t, ((C19395b1) t).getViewModelStore());
    }

    @C0353k0
    /* renamed from: a */
    public abstract void mo57720a(int i);

    @Deprecated
    /* renamed from: b */
    public abstract void mo57721b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @C0363p0
    /* renamed from: e */
    public abstract <D> C19547c<D> mo57722e(int i);

    /* renamed from: f */
    public boolean mo57723f() {
        return false;
    }

    @C0353k0
    @C0359n0
    /* renamed from: g */
    public abstract <D> C19547c<D> mo57724g(int i, @C0363p0 Bundle bundle, @C0359n0 C19531a<D> aVar);

    /* renamed from: h */
    public abstract void mo57725h();

    @C0353k0
    @C0359n0
    /* renamed from: i */
    public abstract <D> C19547c<D> mo57726i(int i, @C0363p0 Bundle bundle, @C0359n0 C19531a<D> aVar);
}
