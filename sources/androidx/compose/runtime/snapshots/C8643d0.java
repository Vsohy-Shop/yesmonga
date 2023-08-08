package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.snapshots.d0 */
public final class C8643d0 extends C8637b {
    @C12580l

    /* renamed from: o */
    public final C8637b f23183o;
    @C12580l

    /* renamed from: p */
    public final C11300l<Object, C11079d2> f23184p;
    @C12580l

    /* renamed from: q */
    public final C11300l<Object, C11079d2> f23185q;

    /* renamed from: r */
    public final boolean f23186r;

    /* renamed from: s */
    public final boolean f23187s;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.mo16429j();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8643d0(@org.jetbrains.annotations.C12580l androidx.compose.runtime.snapshots.C8637b r5, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<java.lang.Object, kotlin.C11079d2> r6, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<java.lang.Object, kotlin.C11079d2> r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$a r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.f23119e
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.mo16447a()
            if (r5 == 0) goto L_0x000e
            kotlin.jvm.functions.l r1 = r5.mo16429j()
            if (r1 != 0) goto L_0x001c
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.f23134j
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            kotlin.jvm.functions.l r1 = r1.mo16429j()
        L_0x001c:
            kotlin.jvm.functions.l r1 = androidx.compose.runtime.snapshots.SnapshotKt.m31451I(r6, r1, r8)
            if (r5 == 0) goto L_0x0028
            kotlin.jvm.functions.l r2 = r5.mo16432m()
            if (r2 != 0) goto L_0x0036
        L_0x0028:
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f23134j
            java.lang.Object r2 = r2.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2
            kotlin.jvm.functions.l r2 = r2.mo16432m()
        L_0x0036:
            kotlin.jvm.functions.l r2 = androidx.compose.runtime.snapshots.SnapshotKt.m31453K(r7, r2)
            r3 = 0
            r4.<init>(r3, r0, r1, r2)
            r4.f23183o = r5
            r4.f23184p = r6
            r4.f23185q = r7
            r4.f23186r = r8
            r4.f23187s = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C8643d0.<init>(androidx.compose.runtime.snapshots.b, kotlin.jvm.functions.l, kotlin.jvm.functions.l, boolean, boolean):void");
    }

    @C12579k
    /* renamed from: A */
    public C8646f mo16410A(@C12580l C11300l<Object, C11079d2> lVar) {
        C11300l J = SnapshotKt.m31452J(lVar, mo16429j(), false, 4, (Object) null);
        if (!this.f23186r) {
            return SnapshotKt.m31505z(mo16594b0().mo16410A((C11300l<Object, C11079d2>) null), J, true);
        }
        return mo16594b0().mo16410A(J);
    }

    @C12579k
    /* renamed from: J */
    public C8650g mo16411J() {
        return mo16594b0().mo16411J();
    }

    /* renamed from: U */
    public void mo16541U(@C12580l Set<C8635a0> set) {
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: X */
    public C8637b mo16412X(@C12580l C11300l<Object, C11079d2> lVar, @C12580l C11300l<Object, C11079d2> lVar2) {
        C11300l J = SnapshotKt.m31452J(lVar, mo16429j(), false, 4, (Object) null);
        C11300l l = SnapshotKt.m31453K(lVar2, mo16432m());
        if (!this.f23186r) {
            return new C8643d0(mo16594b0().mo16412X((C11300l<Object, C11079d2>) null, l), J, l, false, true);
        }
        return mo16594b0().mo16412X(J, l);
    }

    /* renamed from: b0 */
    public final C8637b mo16594b0() {
        C8637b bVar = this.f23183o;
        if (bVar != null) {
            return bVar;
        }
        Object obj = SnapshotKt.f23134j.get();
        Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
        return (C8637b) obj;
    }

    @C12580l
    /* renamed from: c0 */
    public final C11300l<Object, C11079d2> mo16595c0() {
        return this.f23184p;
    }

    /* renamed from: d */
    public void mo16415d() {
        C8637b bVar;
        mo16620x(true);
        if (this.f23187s && (bVar = this.f23183o) != null) {
            bVar.mo16415d();
        }
    }

    @C12580l
    /* renamed from: d0 */
    public final C11300l<Object, C11079d2> mo16596d0() {
        return this.f23185q;
    }

    @C12579k
    /* renamed from: e0 */
    public Void mo16416q(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: f0 */
    public Void mo16417r(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public int mo16599g() {
        return mo16594b0().mo16599g();
    }

    @C12579k
    /* renamed from: h */
    public SnapshotIdSet mo16600h() {
        return mo16594b0().mo16600h();
    }

    @C12580l
    /* renamed from: i */
    public Set<C8635a0> mo16428i() {
        return mo16594b0().mo16428i();
    }

    /* renamed from: k */
    public boolean mo16430k() {
        return mo16594b0().mo16430k();
    }

    /* renamed from: n */
    public boolean mo16433n() {
        return mo16594b0().mo16433n();
    }

    /* renamed from: s */
    public void mo16418s() {
        mo16594b0().mo16418s();
    }

    /* renamed from: t */
    public void mo16434t(@C12579k C8635a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "state");
        mo16594b0().mo16434t(a0Var);
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
