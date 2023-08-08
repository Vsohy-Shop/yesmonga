package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.snapshots.C8646f;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,113:1\n76#2:114\n102#2,2:115\n76#2:117\n102#2,2:118\n1#3:120\n480#4,4:121\n485#4:130\n480#4,4:131\n485#4:140\n122#5,5:125\n122#5,5:135\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n35#1:114\n35#1:115,2\n38#1:117\n38#1:118,2\n59#1:121,4\n59#1:130\n95#1:131,4\n95#1:140\n59#1:125,5\n95#1:135,5\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.s */
public final class C2504s {
    @C12579k

    /* renamed from: a */
    public final C8700z0 f6659a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f6660b;

    /* renamed from: c */
    public boolean f6661c;
    @C12580l

    /* renamed from: d */
    public Object f6662d;

    public C2504s() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final int mo8619a() {
        return ((C2489e) this.f6659a.getValue()).mo8568n();
    }

    /* renamed from: b */
    public final int mo8620b() {
        return ((Number) this.f6660b.getValue()).intValue();
    }

    /* renamed from: c */
    public final void mo8621c(int i, int i2) {
        mo8624f(i, i2);
        this.f6662d = null;
    }

    /* renamed from: d */
    public final void mo8622d(int i) {
        this.f6659a.setValue(C2489e.m11165a(i));
    }

    /* renamed from: e */
    public final void mo8623e(int i) {
        this.f6660b.setValue(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo8624f(int i, int i2) {
        boolean z;
        if (((float) i) >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!C2489e.m11170f(i, mo8619a())) {
                mo8622d(i);
            }
            if (i2 != mo8620b()) {
                mo8623e(i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }

    /* renamed from: g */
    public final void mo8625g(@C12579k C2499n nVar) {
        Object obj;
        C8646f p;
        C2500o[] b;
        C2500o oVar;
        C2500o[] b2;
        C2500o oVar2;
        Intrinsics.checkNotNullParameter(nVar, "measureResult");
        C2501p m = nVar.mo8591m();
        if (m == null || (b2 = m.mo8604b()) == null || (oVar2 = (C2500o) ArraysKt___ArraysKt.m39233Oc(b2)) == null) {
            obj = null;
        } else {
            obj = oVar2.mo8597c();
        }
        this.f6662d = obj;
        if (this.f6661c || nVar.mo8550e() > 0) {
            boolean z = true;
            this.f6661c = true;
            int n = nVar.mo8592n();
            int i = 0;
            if (((float) n) < 0.0f) {
                z = false;
            }
            if (z) {
                C8646f a = C8646f.f23196e.mo16621a();
                try {
                    p = a.mo16617p();
                    C2501p m2 = nVar.mo8591m();
                    if (!(m2 == null || (b = m2.mo8604b()) == null || (oVar = (C2500o) ArraysKt___ArraysKt.m39233Oc(b)) == null)) {
                        i = oVar.mo8596b();
                    }
                    mo8624f(C2489e.m11167c(i), n);
                    C11079d2 d2Var = C11079d2.f28267a;
                    a.mo16619w(p);
                    a.mo16415d();
                } catch (Throwable th) {
                    a.mo16415d();
                    throw th;
                }
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + n + ')').toString());
            }
        }
    }

    /* renamed from: h */
    public final void mo8626h(@C12579k C2495j jVar) {
        C8646f p;
        Intrinsics.checkNotNullParameter(jVar, "itemProvider");
        C8646f a = C8646f.f23196e.mo16621a();
        try {
            p = a.mo16617p();
            mo8624f(C2489e.m11167c(C2550i.m11425c(jVar, this.f6662d, mo8619a())), mo8620b());
            C11079d2 d2Var = C11079d2.f28267a;
            a.mo16619w(p);
            a.mo16415d();
        } catch (Throwable th) {
            a.mo16415d();
            throw th;
        }
    }

    public C2504s(int i, int i2) {
        this.f6659a = C8539f2.m30981g(C2489e.m11165a(C2489e.m11167c(i)), (C8410b2) null, 2, (Object) null);
        this.f6660b = C8539f2.m30981g(Integer.valueOf(i2), (C8410b2) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2504s(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
