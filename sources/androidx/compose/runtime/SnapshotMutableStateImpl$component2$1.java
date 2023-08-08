package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"T", "it", "Lkotlin/d2;", "a", "(Ljava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapshotMutableStateImpl$component2$1 extends Lambda implements C11300l<T, C11079d2> {
    final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotMutableStateImpl$component2$1(SnapshotMutableStateImpl<T> snapshotMutableStateImpl) {
        super(1);
        this.this$0 = snapshotMutableStateImpl;
    }

    /* renamed from: a */
    public final void mo15304a(T t) {
        this.this$0.setValue(t);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo15304a(obj);
        return C11079d2.f28267a;
    }
}
