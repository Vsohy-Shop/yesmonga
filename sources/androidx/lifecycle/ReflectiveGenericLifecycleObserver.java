package androidx.lifecycle;

import androidx.annotation.C0359n0;
import androidx.lifecycle.C19400d;
import androidx.lifecycle.Lifecycle;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C19470t {

    /* renamed from: a */
    public final Object f49716a;

    /* renamed from: b */
    public final C19400d.C19401a f49717b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f49716a = obj;
        this.f49717b = C19400d.f49780c.mo57563c(obj.getClass());
    }

    /* renamed from: i */
    public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
        this.f49717b.mo57566a(wVar, event, this.f49716a);
    }
}
