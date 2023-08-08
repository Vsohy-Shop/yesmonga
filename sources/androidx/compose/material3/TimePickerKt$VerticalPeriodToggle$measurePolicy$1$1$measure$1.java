package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ List<C15611w0> $items;
    final /* synthetic */ C15611w0 $spacerPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1$measure$1(List<? extends C15611w0> list, C15611w0 w0Var) {
        super(1);
        this.$items = list;
        this.$spacerPlaceable = w0Var;
    }

    /* renamed from: a */
    public final void mo12320a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a.m69412p(aVar, this.$items.get(0), 0, 0, 0.0f, 4, (Object) null);
        C15611w0.C15612a.m69412p(aVar, this.$items.get(1), 0, this.$items.get(0).mo44468G0(), 0.0f, 4, (Object) null);
        C15611w0.C15612a.m69412p(aVar, this.$spacerPlaceable, 0, this.$items.get(0).mo44468G0() - (this.$spacerPlaceable.mo44468G0() / 2), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12320a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
