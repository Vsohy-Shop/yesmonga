package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.p004ui.graphics.C15334v3;
import androidx.compose.p004ui.graphics.C15416y1;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/u2;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/u2;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.draw.BlurKt$blur$1 */
public final class BlurKt$blur$1 extends Lambda implements C11300l<C15327u2, C11079d2> {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ C15218g4 $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f, float f2, int i, C15218g4 g4Var, boolean z) {
        super(1);
        this.$radiusX = f;
        this.$radiusY = f2;
        this.$tileMode = i;
        this.$edgeTreatment = g4Var;
        this.$clip = z;
    }

    /* renamed from: a */
    public final void mo17088a(@C12579k C15327u2 u2Var) {
        C15416y1 y1Var;
        Intrinsics.checkNotNullParameter(u2Var, "$this$graphicsLayer");
        float g5 = u2Var.mo7425g5(this.$radiusX);
        float g52 = u2Var.mo7425g5(this.$radiusY);
        if (g5 <= 0.0f || g52 <= 0.0f) {
            y1Var = null;
        } else {
            y1Var = C15334v3.m66726a(g5, g52, this.$tileMode);
        }
        u2Var.mo42450B(y1Var);
        C15218g4 g4Var = this.$edgeTreatment;
        if (g4Var == null) {
            g4Var = C15321t3.m66567a();
        }
        u2Var.mo42460Q4(g4Var);
        u2Var.mo42471e2(this.$clip);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo17088a((C15327u2) obj);
        return C11079d2.f28267a;
    }
}
