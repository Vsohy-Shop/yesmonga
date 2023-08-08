package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15507w;
import androidx.compose.p004ui.input.pointer.util.C15504d;
import androidx.compose.p004ui.input.pointer.util.C15505e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/w;", "event", "Landroidx/compose/ui/geometry/f;", "offset", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/input/pointer/w;J)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends Lambda implements C11304p<C15507w, C15094f, C11079d2> {
    final /* synthetic */ Ref.LongRef $initialDelta;
    final /* synthetic */ C15504d $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(C15504d dVar, Ref.LongRef longRef) {
        super(2);
        this.$velocityTracker = dVar;
        this.$initialDelta = longRef;
    }

    /* renamed from: a */
    public final void mo7395a(@C12579k C15507w wVar, long j) {
        Intrinsics.checkNotNullParameter(wVar, "event");
        C15505e.m68781c(this.$velocityTracker, wVar);
        wVar.mo44168a();
        this.$initialDelta.element = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo7395a((C15507w) obj, ((C15094f) obj2).mo42242A());
        return C11079d2.f28267a;
    }
}
