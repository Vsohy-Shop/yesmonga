package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C2537a;
import androidx.compose.p004ui.layout.C15540b1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.lazy.i */
public final class C2514i implements C2537a {
    @C12579k

    /* renamed from: a */
    public final LazyListState f6677a;

    public C2514i(@C12579k LazyListState lazyListState) {
        Intrinsics.checkNotNullParameter(lazyListState, "state");
        this.f6677a = lazyListState;
    }

    /* renamed from: a */
    public int mo8643a() {
        return this.f6677a.mo8343u().mo8374e();
    }

    /* renamed from: b */
    public void mo8644b() {
        C15540b1 B = this.f6677a.mo8319B();
        if (B != null) {
            B.mo44367e();
        }
    }

    /* renamed from: c */
    public boolean mo8645c() {
        return !this.f6677a.mo8343u().mo8378i().isEmpty();
    }

    /* renamed from: d */
    public int mo8646d() {
        return this.f6677a.mo8339q();
    }

    /* renamed from: e */
    public int mo8647e() {
        return ((C2517l) CollectionsKt___CollectionsKt.m40653k3(this.f6677a.mo8343u().mo8378i())).getIndex();
    }

    @C12579k
    /* renamed from: f */
    public final LazyListState mo8648f() {
        return this.f6677a;
    }
}
