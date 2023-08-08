package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.input.C16334z0;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HorizontalScrollLayoutModifier$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C15611w0 $placeable;
    final /* synthetic */ C15568h0 $this_measure;
    final /* synthetic */ int $width;
    final /* synthetic */ HorizontalScrollLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalScrollLayoutModifier$measure$1(C15568h0 h0Var, HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, C15611w0 w0Var, int i) {
        super(1);
        this.$this_measure = h0Var;
        this.this$0 = horizontalScrollLayoutModifier;
        this.$placeable = w0Var;
        this.$width = i;
    }

    /* renamed from: a */
    public final void mo9311a(@C12579k C15611w0.C15612a aVar) {
        C16260h0 h0Var;
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15568h0 h0Var2 = this.$this_measure;
        int n = this.this$0.mo9306n();
        C16334z0 r = this.this$0.mo9309r();
        C2851y invoke = this.this$0.mo9308q().invoke();
        if (invoke != null) {
            h0Var = invoke.mo9930i();
        } else {
            h0Var = null;
        }
        C16260h0 h0Var3 = h0Var;
        if (this.$this_measure.getLayoutDirection() == LayoutDirection.Rtl) {
            z = true;
        } else {
            z = false;
        }
        this.this$0.mo9307o().mo9425l(Orientation.Horizontal, TextFieldScrollKt.m12446b(h0Var2, n, r, h0Var3, z, this.$placeable.mo44471K0()), this.$width, this.$placeable.mo44471K0());
        C15611w0.C15612a.m69414v(aVar, this.$placeable, C11409d.m43851L0(-this.this$0.mo9307o().mo9417d()), 0, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9311a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
