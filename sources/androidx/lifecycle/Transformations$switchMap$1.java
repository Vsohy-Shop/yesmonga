package androidx.lifecycle;

import androidx.lifecycle.Transformations;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;

public final class Transformations$switchMap$1 implements C19426h0<X> {
    @C12580l

    /* renamed from: a */
    public LiveData<Y> f49741a;

    /* renamed from: b */
    public final /* synthetic */ C11300l<X, LiveData<Y>> f49742b;

    /* renamed from: c */
    public final /* synthetic */ C19406e0<Y> f49743c;

    public Transformations$switchMap$1(C11300l<X, LiveData<Y>> lVar, C19406e0<Y> e0Var) {
        this.f49742b = lVar;
        this.f49743c = e0Var;
    }

    /* renamed from: a */
    public void mo4590a(X x) {
        LiveData<Y> invoke = this.f49742b.invoke(x);
        LiveData<Y> liveData = this.f49741a;
        if (liveData != invoke) {
            if (liveData != null) {
                C19406e0<Y> e0Var = this.f49743c;
                Intrinsics.checkNotNull(liveData);
                e0Var.mo57571t(liveData);
            }
            this.f49741a = invoke;
            if (invoke != null) {
                C19406e0<Y> e0Var2 = this.f49743c;
                Intrinsics.checkNotNull(invoke);
                e0Var2.mo4611s(invoke, new Transformations.C19384a(new Transformations$switchMap$1$onChanged$1(this.f49743c)));
            }
        }
    }

    @C12580l
    /* renamed from: b */
    public final LiveData<Y> mo57528b() {
        return this.f49741a;
    }

    /* renamed from: c */
    public final void mo57529c(@C12580l LiveData<Y> liveData) {
        this.f49741a = liveData;
    }
}
