package dagger.hilt.android.internal.modules;

import android.app.Application;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q
@C10338r
/* renamed from: dagger.hilt.android.internal.modules.d */
public final class C10241d implements C10324h<Application> {

    /* renamed from: a */
    public final C10240c f27954a;

    public C10241d(C10240c cVar) {
        this.f27954a = cVar;
    }

    /* renamed from: a */
    public static C10241d m38487a(C10240c cVar) {
        return new C10241d(cVar);
    }

    /* renamed from: c */
    public static Application m38488c(C10240c cVar) {
        return (Application) C10335o.m38554f(cVar.mo21684a());
    }

    /* renamed from: b */
    public Application get() {
        return m38488c(this.f27954a);
    }
}
