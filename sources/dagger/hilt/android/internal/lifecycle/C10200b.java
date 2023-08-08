package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.builders.C10191f;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import java.util.Set;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@C10338r
/* renamed from: dagger.hilt.android.internal.lifecycle.b */
public final class C10200b implements C10324h<C10195a.C10199d> {

    /* renamed from: a */
    public final Provider<Set<String>> f27914a;

    /* renamed from: b */
    public final Provider<C10191f> f27915b;

    public C10200b(Provider<Set<String>> provider, Provider<C10191f> provider2) {
        this.f27914a = provider;
        this.f27915b = provider2;
    }

    /* renamed from: a */
    public static C10200b m38427a(Provider<Set<String>> provider, Provider<C10191f> provider2) {
        return new C10200b(provider, provider2);
    }

    /* renamed from: c */
    public static C10195a.C10199d m38428c(Set<String> set, C10191f fVar) {
        return new C10195a.C10199d(set, fVar);
    }

    /* renamed from: b */
    public C10195a.C10199d get() {
        return m38428c(this.f27914a.get(), this.f27915b.get());
    }
}
