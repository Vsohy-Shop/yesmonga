package androidx.compose.runtime.snapshots;

import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n1686#2:2194\n70#3:2193\n70#3:2195\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1292#1:2192\n1346#1:2194\n1292#1:2193\n1346#1:2195\n*E\n"})
public final class GlobalSnapshot extends C8637b {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GlobalSnapshot(int r5, @org.jetbrains.annotations.C12579k androidx.compose.runtime.snapshots.SnapshotIdSet r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.m31447E()
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f23133i     // Catch:{ all -> 0x003b }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L_0x0024
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f23133i     // Catch:{ all -> 0x003b }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x003b }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r1)     // Catch:{ all -> 0x003b }
            goto L_0x0025
        L_0x0024:
            r1 = r2
        L_0x0025:
            if (r1 == 0) goto L_0x0035
            java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40631f5(r1)     // Catch:{ all -> 0x003b }
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3     // Catch:{ all -> 0x003b }
            if (r3 != 0) goto L_0x0036
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r3 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch:{ all -> 0x003b }
            r3.<init>(r1)     // Catch:{ all -> 0x003b }
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L_0x003b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    @C12579k
    /* renamed from: A */
    public C8646f mo16410A(@C12580l C11300l<Object, C11079d2> lVar) {
        return SnapshotKt.m31472b0(new GlobalSnapshot$takeNestedSnapshot$1(lVar));
    }

    @C12579k
    /* renamed from: J */
    public C8650g mo16411J() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @C12579k
    /* renamed from: X */
    public C8637b mo16412X(@C12580l C11300l<Object, C11079d2> lVar, @C12580l C11300l<Object, C11079d2> lVar2) {
        return (C8637b) SnapshotKt.m31472b0(new GlobalSnapshot$takeNestedMutableSnapshot$1(lVar, lVar2));
    }

    @C12579k
    /* renamed from: b0 */
    public Void mo16416q(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: c0 */
    public Void mo16417r(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C8669u.m31848b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public void mo16415d() {
        synchronized (SnapshotKt.m31447E()) {
            mo16618u();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: s */
    public void mo16418s() {
        SnapshotKt.m31504y();
    }
}
