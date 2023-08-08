package androidx.constraintlayout.compose;

import androidx.compose.p004ui.graphics.C15291p4;
import androidx.compose.p004ui.graphics.C15327u2;
import androidx.constraintlayout.core.state.C16772o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Landroidx/compose/ui/graphics/u2;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class Measurer$performLayout$1$layerBlock$1 extends Lambda implements C11300l<C15327u2, C11079d2> {
    final /* synthetic */ C16772o $frame;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Measurer$performLayout$1$layerBlock$1(C16772o oVar) {
        super(1);
        this.$frame = oVar;
    }

    /* renamed from: a */
    public final void mo48415a(@C12579k C15327u2 u2Var) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(u2Var, "$this$null");
        if (!Float.isNaN(this.$frame.f42607f) || !Float.isNaN(this.$frame.f42608g)) {
            float f3 = 0.5f;
            if (Float.isNaN(this.$frame.f42607f)) {
                f2 = 0.5f;
            } else {
                f2 = this.$frame.f42607f;
            }
            if (!Float.isNaN(this.$frame.f42608g)) {
                f3 = this.$frame.f42608g;
            }
            u2Var.mo42480o2(C15291p4.m66401a(f2, f3));
        }
        if (!Float.isNaN(this.$frame.f42609h)) {
            u2Var.mo42452E(this.$frame.f42609h);
        }
        if (!Float.isNaN(this.$frame.f42610i)) {
            u2Var.mo42453F(this.$frame.f42610i);
        }
        if (!Float.isNaN(this.$frame.f42611j)) {
            u2Var.mo42456I(this.$frame.f42611j);
        }
        if (!Float.isNaN(this.$frame.f42612k)) {
            u2Var.mo42462S(this.$frame.f42612k);
        }
        if (!Float.isNaN(this.$frame.f42613l)) {
            u2Var.mo42479o(this.$frame.f42613l);
        }
        if (!Float.isNaN(this.$frame.f42614m)) {
            u2Var.mo42477h3(this.$frame.f42614m);
        }
        if (!Float.isNaN(this.$frame.f42615n) || !Float.isNaN(this.$frame.f42616o)) {
            float f4 = 1.0f;
            if (Float.isNaN(this.$frame.f42615n)) {
                f = 1.0f;
            } else {
                f = this.$frame.f42615n;
            }
            u2Var.mo42487x(f);
            if (!Float.isNaN(this.$frame.f42616o)) {
                f4 = this.$frame.f42616o;
            }
            u2Var.mo42457J(f4);
        }
        if (!Float.isNaN(this.$frame.f42617p)) {
            u2Var.mo42473g(this.$frame.f42617p);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48415a((C15327u2) obj);
        return C11079d2.f28267a;
    }
}
