package androidx.work.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.LiveData;
import androidx.work.C21397o;
import androidx.work.impl.utils.futures.C21317a;
import com.google.common.util.concurrent.C32487a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.o */
public class C21282o implements C21397o {

    /* renamed from: c */
    public final C19423g0<C21397o.C21399b> f54906c = new C19423g0<>();

    /* renamed from: d */
    public final C21317a<C21397o.C21399b.C21402c> f54907d = C21317a.m98425v();

    public C21282o() {
        mo63600b(C21397o.f55146b);
    }

    @C0359n0
    /* renamed from: a */
    public C32487a<C21397o.C21399b.C21402c> mo63599a() {
        return this.f54907d;
    }

    /* renamed from: b */
    public void mo63600b(@C0359n0 C21397o.C21399b bVar) {
        this.f54906c.mo57493o(bVar);
        if (bVar instanceof C21397o.C21399b.C21402c) {
            this.f54907d.mo63659p((C21397o.C21399b.C21402c) bVar);
        } else if (bVar instanceof C21397o.C21399b.C21400a) {
            this.f54907d.mo63660r(((C21397o.C21399b.C21400a) bVar).mo63841a());
        }
    }

    @C0359n0
    public LiveData<C21397o.C21399b> getState() {
        return this.f54906c;
    }
}
