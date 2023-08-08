package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "Landroidx/compose/ui/unit/d;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/unit/d;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2Kt$swipeAnchors$1 extends Lambda implements C11300l<C16479d, C11079d2> {
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$swipeAnchors$1(SwipeableV2State<T> swipeableV2State) {
        super(1);
        this.$state = swipeableV2State;
    }

    /* renamed from: a */
    public final void mo12085a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "it");
        this.$state.mo12097I(dVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12085a((C16479d) obj);
        return C11079d2.f28267a;
    }
}
