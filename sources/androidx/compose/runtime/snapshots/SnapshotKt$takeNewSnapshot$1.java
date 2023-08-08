package androidx.compose.runtime.snapshots;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/snapshots/f;", "T", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "a", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/f;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n*L\n1784#1:2192\n1784#1:2193\n*E\n"})
public final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements C11300l<SnapshotIdSet, T> {
    final /* synthetic */ C11300l<SnapshotIdSet, T> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotKt$takeNewSnapshot$1(C11300l<? super SnapshotIdSet, ? extends T> lVar) {
        super(1);
        this.$block = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final T invoke(@C12579k SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalid");
        T t = (C8646f) this.$block.invoke(snapshotIdSet);
        synchronized (SnapshotKt.m31447E()) {
            SnapshotKt.f23129e = SnapshotKt.f23129e.mo16442e0(t.mo16599g());
            C11079d2 d2Var = C11079d2.f28267a;
        }
        return t;
    }
}
