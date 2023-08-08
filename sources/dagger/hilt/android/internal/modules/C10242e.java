package dagger.hilt.android.internal.modules;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: dagger.hilt.android.internal.modules.e */
public final class C10242e implements C10324h<Context> {

    /* renamed from: a */
    public final C10240c f27955a;

    public C10242e(C10240c cVar) {
        this.f27955a = cVar;
    }

    /* renamed from: a */
    public static C10242e m38490a(C10240c cVar) {
        return new C10242e(cVar);
    }

    /* renamed from: c */
    public static Context m38491c(C10240c cVar) {
        return (Context) C10335o.m38554f(cVar.mo21685b());
    }

    /* renamed from: b */
    public Context get() {
        return m38491c(this.f27955a);
    }
}
