package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.snapshots.C8646f;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,110:1\n76#2:111\n102#2,2:112\n76#2:114\n102#2,2:115\n1#3:117\n480#4,4:118\n485#4:127\n480#4,4:128\n485#4:137\n122#5,5:122\n122#5,5:132\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n34#1:111\n34#1:112,2\n36#1:114\n36#1:115,2\n57#1:118,4\n57#1:127\n92#1:128,4\n92#1:137\n57#1:122,5\n92#1:132,5\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.s */
public final class C2575s {
    @C12579k

    /* renamed from: a */
    public final C8700z0 f6794a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f6795b;

    /* renamed from: c */
    public boolean f6796c;
    @C12580l

    /* renamed from: d */
    public Object f6797d;

    public C2575s() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final int mo8831a() {
        return ((C2452b) this.f6794a.getValue()).mo8368n();
    }

    /* renamed from: b */
    public final int mo8832b() {
        return ((Number) this.f6795b.getValue()).intValue();
    }

    /* renamed from: c */
    public final void mo8833c(int i, int i2) {
        mo8836f(i, i2);
        this.f6797d = null;
    }

    /* renamed from: d */
    public final void mo8834d(int i) {
        this.f6794a.setValue(C2452b.m10904a(i));
    }

    /* renamed from: e */
    public final void mo8835e(int i) {
        this.f6795b.setValue(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo8836f(int i, int i2) {
        boolean z;
        if (((float) i) >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!C2452b.m10909f(i, mo8831a())) {
                mo8834d(i);
            }
            if (i2 != mo8832b()) {
                mo8835e(i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }

    /* renamed from: g */
    public final void mo8837g(@C12579k C2572p pVar) {
        Object obj;
        C8646f p;
        Intrinsics.checkNotNullParameter(pVar, "measureResult");
        C2620u s = pVar.mo8819s();
        if (s != null) {
            obj = s.mo9029c();
        } else {
            obj = null;
        }
        this.f6797d = obj;
        if (this.f6796c || pVar.mo8374e() > 0) {
            boolean z = true;
            this.f6796c = true;
            int t = pVar.mo8820t();
            int i = 0;
            if (((float) t) < 0.0f) {
                z = false;
            }
            if (z) {
                C8646f a = C8646f.f23196e.mo16621a();
                try {
                    p = a.mo16617p();
                    C2620u s2 = pVar.mo8819s();
                    if (s2 != null) {
                        i = s2.mo9028b();
                    }
                    mo8836f(C2452b.m10906c(i), t);
                    C11079d2 d2Var = C11079d2.f28267a;
                    a.mo16619w(p);
                    a.mo16415d();
                } catch (Throwable th) {
                    a.mo16415d();
                    throw th;
                }
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + t + ')').toString());
            }
        }
    }

    @C2855v
    /* renamed from: h */
    public final void mo8838h(@C12579k C2569n nVar) {
        C8646f p;
        Intrinsics.checkNotNullParameter(nVar, "itemProvider");
        C8646f a = C8646f.f23196e.mo16621a();
        try {
            p = a.mo16617p();
            mo8836f(C2452b.m10906c(C2550i.m11425c(nVar, this.f6797d, mo8831a())), mo8832b());
            C11079d2 d2Var = C11079d2.f28267a;
            a.mo16619w(p);
            a.mo16415d();
        } catch (Throwable th) {
            a.mo16415d();
            throw th;
        }
    }

    public C2575s(int i, int i2) {
        this.f6794a = C8539f2.m30981g(C2452b.m10904a(C2452b.m10906c(i)), (C8410b2) null, 2, (Object) null);
        this.f6795b = C8539f2.m30981g(Integer.valueOf(i2), (C8410b2) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2575s(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
