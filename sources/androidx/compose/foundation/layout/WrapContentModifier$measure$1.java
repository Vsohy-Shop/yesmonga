package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class WrapContentModifier$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $placeable;
    final /* synthetic */ C15568h0 $this_measure;
    final /* synthetic */ int $wrapperHeight;
    final /* synthetic */ int $wrapperWidth;
    final /* synthetic */ WrapContentModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentModifier$measure$1(WrapContentModifier wrapContentModifier, int i, C15611w0 w0Var, int i2, C15568h0 h0Var) {
        super(1);
        this.this$0 = wrapContentModifier;
        this.$wrapperWidth = i;
        this.$placeable = w0Var;
        this.$wrapperHeight = i2;
        this.$this_measure = h0Var;
    }

    /* renamed from: a */
    public final void mo7983a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69413r(aVar2, this.$placeable, ((C16494m) this.this$0.f6230f.invoke(C16500q.m74651b(C16502r.m74668a(this.$wrapperWidth - this.$placeable.mo44471K0(), this.$wrapperHeight - this.$placeable.mo44468G0())), this.$this_measure.getLayoutDirection())).mo47856w(), 0.0f, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7983a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
