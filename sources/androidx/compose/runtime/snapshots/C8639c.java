package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.C16934c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1390#1:2192\n1390#1:2193\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.c */
public final class C8639c extends C8637b {
    @C12579k

    /* renamed from: o */
    public final C8637b f23175o;

    /* renamed from: p */
    public boolean f23176p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8639c(int i, @C12579k SnapshotIdSet snapshotIdSet, @C12580l C11300l<Object, C11079d2> lVar, @C12580l C11300l<Object, C11079d2> lVar2, @C12579k C8637b bVar) {
        super(i, snapshotIdSet, lVar, lVar2);
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalid");
        Intrinsics.checkNotNullParameter(bVar, C16934c.f44493V1);
        this.f23175o = bVar;
        bVar.mo16416q(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    @org.jetbrains.annotations.C12579k
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.snapshots.C8650g mo16411J() {
        /*
            r6 = this;
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o
            boolean r0 = r0.mo16531K()
            if (r0 != 0) goto L_0x00c0
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o
            boolean r0 = r0.mo16615f()
            if (r0 == 0) goto L_0x0012
            goto L_0x00c0
        L_0x0012:
            java.util.Set r0 = r6.mo16428i()
            int r1 = r6.mo16599g()
            if (r0 == 0) goto L_0x0027
            androidx.compose.runtime.snapshots.b r2 = r6.f23175o
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r2.mo16600h()
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.m31458P(r2, r6, r3)
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.m31447E()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.m31482g0(r6)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x006b
            int r4 = r0.size()     // Catch:{ all -> 0x00bd }
            if (r4 != 0) goto L_0x0039
            goto L_0x006b
        L_0x0039:
            androidx.compose.runtime.snapshots.b r4 = r6.f23175o     // Catch:{ all -> 0x00bd }
            int r4 = r4.mo16599g()     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.b r5 = r6.f23175o     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.SnapshotIdSet r5 = r5.mo16600h()     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.g r2 = r6.mo16534N(r4, r2, r5)     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.g$b r4 = androidx.compose.runtime.snapshots.C8650g.C8652b.f23207b     // Catch:{ all -> 0x00bd }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x00bd }
            if (r4 != 0) goto L_0x0053
            monitor-exit(r3)
            return r2
        L_0x0053:
            androidx.compose.runtime.snapshots.b r2 = r6.f23175o     // Catch:{ all -> 0x00bd }
            java.util.Set r2 = r2.mo16428i()     // Catch:{ all -> 0x00bd }
            if (r2 != 0) goto L_0x0065
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00bd }
            r2.<init>()     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.b r4 = r6.f23175o     // Catch:{ all -> 0x00bd }
            r4.mo16541U(r2)     // Catch:{ all -> 0x00bd }
        L_0x0065:
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x00bd }
            r2.addAll(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x006e
        L_0x006b:
            r6.mo16613b()     // Catch:{ all -> 0x00bd }
        L_0x006e:
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o     // Catch:{ all -> 0x00bd }
            int r0 = r0.mo16599g()     // Catch:{ all -> 0x00bd }
            if (r0 >= r1) goto L_0x007b
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o     // Catch:{ all -> 0x00bd }
            r0.mo16530I()     // Catch:{ all -> 0x00bd }
        L_0x007b:
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.mo16600h()     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.mo16437H(r1)     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r6.mo16532L()     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.mo16446y(r4)     // Catch:{ all -> 0x00bd }
            r0.mo16602z(r2)     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o     // Catch:{ all -> 0x00bd }
            r0.mo16535O(r1)     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o     // Catch:{ all -> 0x00bd }
            int r1 = r6.mo16609C()     // Catch:{ all -> 0x00bd }
            r0.mo16537Q(r1)     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r6.mo16532L()     // Catch:{ all -> 0x00bd }
            r0.mo16536P(r1)     // Catch:{ all -> 0x00bd }
            androidx.compose.runtime.snapshots.b r0 = r6.f23175o     // Catch:{ all -> 0x00bd }
            int[] r1 = r6.mo16533M()     // Catch:{ all -> 0x00bd }
            r0.mo16538R(r1)     // Catch:{ all -> 0x00bd }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00bd }
            monitor-exit(r3)
            r0 = 1
            r6.mo16540T(r0)
            r6.mo16552b0()
            androidx.compose.runtime.snapshots.g$b r0 = androidx.compose.runtime.snapshots.C8650g.C8652b.f23207b
            return r0
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00c0:
            androidx.compose.runtime.snapshots.g$a r0 = new androidx.compose.runtime.snapshots.g$a
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C8639c.mo16411J():androidx.compose.runtime.snapshots.g");
    }

    /* renamed from: b0 */
    public final void mo16552b0() {
        if (!this.f23176p) {
            this.f23176p = true;
            this.f23175o.mo16417r(this);
        }
    }

    @C12579k
    /* renamed from: c0 */
    public final C8637b mo16553c0() {
        return this.f23175o;
    }

    /* renamed from: d */
    public void mo16415d() {
        if (!mo16615f()) {
            super.mo16415d();
            mo16552b0();
        }
    }

    @C12579k
    /* renamed from: l */
    public C8646f mo16431l() {
        return this.f23175o.mo16431l();
    }
}
