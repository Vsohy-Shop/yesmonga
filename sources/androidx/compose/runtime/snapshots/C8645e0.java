package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.snapshots.e0 */
public final class C8645e0 extends C8646f {
    @C12580l

    /* renamed from: g */
    public final C8646f f23190g;

    /* renamed from: h */
    public final boolean f23191h;

    /* renamed from: i */
    public final boolean f23192i;
    @C12580l

    /* renamed from: j */
    public final C11300l<Object, C11079d2> f23193j;
    @C12580l

    /* renamed from: k */
    public final C11300l<Object, C11079d2> f23194k;
    @C12579k

    /* renamed from: l */
    public final C8646f f23195l;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r4 = r4.mo16429j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8645e0(@org.jetbrains.annotations.C12580l androidx.compose.runtime.snapshots.C8646f r4, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<java.lang.Object, kotlin.C11079d2> r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$a r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.f23119e
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.mo16447a()
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            r3.f23190g = r4
            r3.f23191h = r6
            r3.f23192i = r7
            if (r4 == 0) goto L_0x0019
            kotlin.jvm.functions.l r4 = r4.mo16429j()
            if (r4 != 0) goto L_0x0027
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r4 = androidx.compose.runtime.snapshots.SnapshotKt.f23134j
            java.lang.Object r4 = r4.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r4 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r4
            kotlin.jvm.functions.l r4 = r4.mo16429j()
        L_0x0027:
            kotlin.jvm.functions.l r4 = androidx.compose.runtime.snapshots.SnapshotKt.m31451I(r5, r4, r6)
            r3.f23193j = r4
            r3.f23195l = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C8645e0.<init>(androidx.compose.runtime.snapshots.f, kotlin.jvm.functions.l, boolean, boolean):void");
    }

    @C12579k
    /* renamed from: A */
    public C8646f mo16410A(@C12580l C11300l<Object, C11079d2> lVar) {
        C11300l J = SnapshotKt.m31452J(lVar, mo16429j(), false, 4, (Object) null);
        if (!this.f23191h) {
            return SnapshotKt.m31505z(mo16605G().mo16410A((C11300l<Object, C11079d2>) null), J, true);
        }
        return mo16605G().mo16410A(J);
    }

    /* renamed from: G */
    public final C8646f mo16605G() {
        C8646f fVar = this.f23190g;
        if (fVar != null) {
            return fVar;
        }
        Object obj = SnapshotKt.f23134j.get();
        Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
        return (C8646f) obj;
    }

    @C12579k
    /* renamed from: H */
    public Void mo16416q(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: I */
    public Void mo16417r(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: J */
    public void mo16608J(@C12580l Set<C8635a0> set) {
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public void mo16415d() {
        C8646f fVar;
        mo16620x(true);
        if (this.f23192i && (fVar = this.f23190g) != null) {
            fVar.mo16415d();
        }
    }

    /* renamed from: g */
    public int mo16599g() {
        return mo16605G().mo16599g();
    }

    @C12579k
    /* renamed from: h */
    public SnapshotIdSet mo16600h() {
        return mo16605G().mo16600h();
    }

    @C12580l
    /* renamed from: i */
    public Set<C8635a0> mo16428i() {
        return mo16605G().mo16428i();
    }

    @C12580l
    /* renamed from: j */
    public C11300l<Object, C11079d2> mo16429j() {
        return this.f23193j;
    }

    /* renamed from: k */
    public boolean mo16430k() {
        return mo16605G().mo16430k();
    }

    @C12579k
    /* renamed from: l */
    public C8646f mo16431l() {
        return this.f23195l;
    }

    @C12580l
    /* renamed from: m */
    public C11300l<Object, C11079d2> mo16432m() {
        return this.f23194k;
    }

    /* renamed from: n */
    public boolean mo16433n() {
        return mo16605G().mo16433n();
    }

    /* renamed from: s */
    public void mo16418s() {
        mo16605G().mo16418s();
    }

    /* renamed from: t */
    public void mo16434t(@C12579k C8635a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "state");
        mo16605G().mo16434t(a0Var);
    }

    /* renamed from: y */
    public void mo16601y(int i) {
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: z */
    public void mo16602z(@C12579k SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "value");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }
}
