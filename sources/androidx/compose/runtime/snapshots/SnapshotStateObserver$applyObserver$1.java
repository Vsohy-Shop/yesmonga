package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"", "", "applied", "Landroidx/compose/runtime/snapshots/f;", "<anonymous parameter 1>", "Lkotlin/d2;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/f;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapshotStateObserver$applyObserver$1 extends Lambda implements C11304p<Set<? extends Object>, C8646f, C11079d2> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.this$0 = snapshotStateObserver;
    }

    /* renamed from: a */
    public final void mo16526a(@C12579k Set<? extends Object> set, @C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(set, "applied");
        Intrinsics.checkNotNullParameter(fVar, "<anonymous parameter 1>");
        this.this$0.mo16497j(set);
        if (this.this$0.mo16501n()) {
            this.this$0.mo16508u();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo16526a((Set) obj, (C8646f) obj2);
        return C11079d2.f28267a;
    }
}
