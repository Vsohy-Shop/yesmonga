package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C2555n;
import androidx.compose.p004ui.layout.C15608v0;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.snapshots.C8646f;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n76#2:162\n102#2,2:163\n76#2:165\n102#2,2:166\n76#2:168\n102#2,2:169\n76#2:171\n102#2,2:172\n480#3,4:174\n485#3:183\n122#4,5:178\n1#5:184\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n104#1:162\n104#1:163,2\n110#1:165\n110#1:166,2\n115#1:168\n115#1:169,2\n121#1:171\n121#1:172,2\n124#1:174,4\n124#1:183\n124#1:178,5\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.m */
public final class C2554m implements C15608v0, C15608v0.C15609a, C2555n.C2556a {
    @C12580l

    /* renamed from: a */
    public final Object f6732a;
    @C12579k

    /* renamed from: b */
    public final C2555n f6733b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f6734c = C8539f2.m30981g(-1, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: d */
    public final C8700z0 f6735d = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: e */
    public final C8700z0 f6736e = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: f */
    public final C8700z0 f6737f = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    public C2554m(@C12580l Object obj, @C12579k C2555n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "pinnedItemList");
        this.f6732a = obj;
        this.f6733b = nVar;
    }

    @C12579k
    /* renamed from: a */
    public C15608v0.C15609a mo8743a() {
        C15608v0.C15609a aVar;
        if (mo8746d() == 0) {
            this.f6733b.mo8757H(this);
            C15608v0 c = mo8745c();
            if (c != null) {
                aVar = c.mo8743a();
            } else {
                aVar = null;
            }
            mo8752h(aVar);
        }
        mo8754j(mo8746d() + 1);
        return this;
    }

    /* renamed from: b */
    public final C15608v0.C15609a mo8744b() {
        return (C15608v0.C15609a) this.f6736e.getValue();
    }

    @C12580l
    /* renamed from: c */
    public final C15608v0 mo8745c() {
        return mo8747e();
    }

    /* renamed from: d */
    public final int mo8746d() {
        return ((Number) this.f6735d.getValue()).intValue();
    }

    /* renamed from: e */
    public final C15608v0 mo8747e() {
        return (C15608v0) this.f6737f.getValue();
    }

    /* renamed from: f */
    public final void mo8748f() {
        int d = mo8746d();
        for (int i = 0; i < d; i++) {
            release();
        }
    }

    /* renamed from: g */
    public void mo8749g(int i) {
        this.f6734c.setValue(Integer.valueOf(i));
    }

    public int getIndex() {
        return ((Number) this.f6734c.getValue()).intValue();
    }

    @C12580l
    public Object getKey() {
        return this.f6732a;
    }

    /* renamed from: h */
    public final void mo8752h(C15608v0.C15609a aVar) {
        this.f6736e.setValue(aVar);
    }

    /* renamed from: i */
    public final void mo8753i(@C12580l C15608v0 v0Var) {
        C8646f p;
        C15608v0.C15609a aVar;
        C8646f a = C8646f.f23196e.mo16621a();
        try {
            p = a.mo16617p();
            if (v0Var != mo8747e()) {
                mo8755k(v0Var);
                if (mo8746d() > 0) {
                    C15608v0.C15609a b = mo8744b();
                    if (b != null) {
                        b.release();
                    }
                    if (v0Var != null) {
                        aVar = v0Var.mo8743a();
                    } else {
                        aVar = null;
                    }
                    mo8752h(aVar);
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
            a.mo16619w(p);
            a.mo16415d();
        } catch (Throwable th) {
            a.mo16415d();
            throw th;
        }
    }

    /* renamed from: j */
    public final void mo8754j(int i) {
        this.f6735d.setValue(Integer.valueOf(i));
    }

    /* renamed from: k */
    public final void mo8755k(C15608v0 v0Var) {
        this.f6737f.setValue(v0Var);
    }

    public void release() {
        boolean z;
        if (mo8746d() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo8754j(mo8746d() - 1);
            if (mo8746d() == 0) {
                this.f6733b.mo8758M(this);
                C15608v0.C15609a b = mo8744b();
                if (b != null) {
                    b.release();
                }
                mo8752h((C15608v0.C15609a) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }
}
