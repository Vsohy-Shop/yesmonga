package androidx.compose.runtime.snapshots;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "state", "Lkotlin/d2;", "a", "(Ljava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapshotKt$mergedReadObserver$1 extends Lambda implements C11300l<Object, C11079d2> {
    final /* synthetic */ C11300l<Object, C11079d2> $parentObserver;
    final /* synthetic */ C11300l<Object, C11079d2> $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotKt$mergedReadObserver$1(C11300l<Object, C11079d2> lVar, C11300l<Object, C11079d2> lVar2) {
        super(1);
        this.$readObserver = lVar;
        this.$parentObserver = lVar2;
    }

    /* renamed from: a */
    public final void mo16451a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "state");
        this.$readObserver.invoke(obj);
        this.$parentObserver.invoke(obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16451a(obj);
        return C11079d2.f28267a;
    }
}
