package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/runtime/k2;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/k2;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateExitObserver$1 */
public final class C8633xa5f2bac8 extends Lambda implements C11300l<C8578k2<?>, C11079d2> {
    final /* synthetic */ SnapshotStateObserver.ObservedScopeMap this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8633xa5f2bac8(SnapshotStateObserver.ObservedScopeMap observedScopeMap) {
        super(1);
        this.this$0 = observedScopeMap;
    }

    /* renamed from: a */
    public final void mo16525a(@C12579k C8578k2<?> k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "it");
        SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
        observedScopeMap.f23161j = observedScopeMap.f23161j - 1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16525a((C8578k2) obj);
        return C11079d2.f28267a;
    }
}
