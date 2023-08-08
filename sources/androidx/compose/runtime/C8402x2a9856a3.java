package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C8646f;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo22516d2 = {"T", "", "", "changed", "Landroidx/compose/runtime/snapshots/f;", "<anonymous parameter 1>", "Lkotlin/d2;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/f;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 */
public final class C8402x2a9856a3 extends Lambda implements C11304p<Set<? extends Object>, C8646f, C11079d2> {
    final /* synthetic */ C11744g<Set<Object>> $appliedChanges;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8402x2a9856a3(C11744g<Set<Object>> gVar) {
        super(2);
        this.$appliedChanges = gVar;
    }

    /* renamed from: a */
    public final void mo15314a(@C12579k Set<? extends Object> set, @C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(set, "changed");
        Intrinsics.checkNotNullParameter(fVar, "<anonymous parameter 1>");
        this.$appliedChanges.mo23751L(set);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo15314a((Set) obj, (C8646f) obj2);
        return C11079d2.f28267a;
    }
}
