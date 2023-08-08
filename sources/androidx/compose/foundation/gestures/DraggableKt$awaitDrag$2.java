package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C2187d;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15492p;
import androidx.compose.p004ui.input.pointer.C15507w;
import androidx.compose.p004ui.input.pointer.util.C15504d;
import androidx.compose.p004ui.input.pointer.util.C15505e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C11763t;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/w;", "event", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/input/pointer/w;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DraggableKt$awaitDrag$2 extends Lambda implements C11300l<C15507w, C11079d2> {
    final /* synthetic */ C11763t<C2187d> $channel;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ C15504d $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDrag$2(C15504d dVar, C11763t<? super C2187d> tVar, boolean z) {
        super(1);
        this.$velocityTracker = dVar;
        this.$channel = tVar;
        this.$reverseDirection = z;
    }

    /* renamed from: a */
    public final void mo7396a(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "event");
        C15505e.m68781c(this.$velocityTracker, wVar);
        if (!C15492p.m68685e(wVar)) {
            long k = C15492p.m68691k(wVar);
            wVar.mo44168a();
            C11763t<C2187d> tVar = this.$channel;
            if (this.$reverseDirection) {
                k = C15094f.m64888x(k, -1.0f);
            }
            tVar.mo23751L(new C2187d.C2189b(k, (DefaultConstructorMarker) null));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7396a((C15507w) obj);
        return C11079d2.f28267a;
    }
}
