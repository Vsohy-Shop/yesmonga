package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OffsetPxModifier$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $placeable;
    final /* synthetic */ C15568h0 $this_measure;
    final /* synthetic */ OffsetPxModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier$measure$1(OffsetPxModifier offsetPxModifier, C15568h0 h0Var, C15611w0 w0Var) {
        super(1);
        this.this$0 = offsetPxModifier;
        this.$this_measure = h0Var;
        this.$placeable = w0Var;
    }

    /* renamed from: a */
    public final void mo7820a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        long w = this.this$0.mo7817r().invoke(this.$this_measure).mo47856w();
        if (this.this$0.mo7818s()) {
            C15611w0.C15612a.m69416z(aVar, this.$placeable, C16494m.m74581m(w), C16494m.m74583o(w), 0.0f, (C11300l) null, 12, (Object) null);
            return;
        }
        C15611w0.C15612a.m69399D(aVar, this.$placeable, C16494m.m74581m(w), C16494m.m74583o(w), 0.0f, (C11300l) null, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7820a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
