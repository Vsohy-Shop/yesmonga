package androidx.lifecycle;

import androidx.arch.core.util.C0843a;
import androidx.lifecycle.Transformations;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;

public final class Transformations$switchMap$2 implements C19426h0<Object> {
    @C12580l

    /* renamed from: a */
    public LiveData<Object> f49744a;

    /* renamed from: b */
    public final /* synthetic */ C0843a<Object, LiveData<Object>> f49745b;

    /* renamed from: c */
    public final /* synthetic */ C19406e0<Object> f49746c;

    public Transformations$switchMap$2(C0843a<Object, LiveData<Object>> aVar, C19406e0<Object> e0Var) {
        this.f49745b = aVar;
        this.f49746c = e0Var;
    }

    /* renamed from: a */
    public void mo4590a(Object obj) {
        LiveData<Object> apply = this.f49745b.apply(obj);
        LiveData<Object> liveData = this.f49744a;
        if (liveData != apply) {
            if (liveData != null) {
                C19406e0<Object> e0Var = this.f49746c;
                Intrinsics.checkNotNull(liveData);
                e0Var.mo57571t(liveData);
            }
            this.f49744a = apply;
            if (apply != null) {
                C19406e0<Object> e0Var2 = this.f49746c;
                Intrinsics.checkNotNull(apply);
                e0Var2.mo4611s(apply, new Transformations.C19384a(new Transformations$switchMap$2$onChanged$1(this.f49746c)));
            }
        }
    }

    @C12580l
    /* renamed from: b */
    public final LiveData<Object> mo57531b() {
        return this.f49744a;
    }

    /* renamed from: c */
    public final void mo57532c(@C12580l LiveData<Object> liveData) {
        this.f49744a = liveData;
    }
}
