package androidx.compose.runtime.snapshots;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Landroidx/compose/runtime/snapshots/b;", "a", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/b;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n*L\n1323#1:2192\n1323#1:2193\n*E\n"})
public final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends Lambda implements C11300l<SnapshotIdSet, C8637b> {
    final /* synthetic */ C11300l<Object, C11079d2> $readObserver;
    final /* synthetic */ C11300l<Object, C11079d2> $writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedMutableSnapshot$1(C11300l<Object, C11079d2> lVar, C11300l<Object, C11079d2> lVar2) {
        super(1);
        this.$readObserver = lVar;
        this.$writeObserver = lVar2;
    }

    @C12579k
    /* renamed from: a */
    public final C8637b invoke(@C12579k SnapshotIdSet snapshotIdSet) {
        int h;
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.m31447E()) {
            h = SnapshotKt.f23130f;
            SnapshotKt.f23130f = h + 1;
        }
        return new C8637b(h, snapshotIdSet, this.$readObserver, this.$writeObserver);
    }
}
