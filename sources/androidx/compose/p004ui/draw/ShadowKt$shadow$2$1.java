package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15327u2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/u2;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/u2;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow$2$1 */
public final class ShadowKt$shadow$2$1 extends Lambda implements C11300l<C15327u2, C11079d2> {
    final /* synthetic */ long $ambientColor;
    final /* synthetic */ boolean $clip;
    final /* synthetic */ float $elevation;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ long $spotColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadow$2$1(float f, C15218g4 g4Var, boolean z, long j, long j2) {
        super(1);
        this.$elevation = f;
        this.$shape = g4Var;
        this.$clip = z;
        this.$ambientColor = j;
        this.$spotColor = j2;
    }

    /* renamed from: a */
    public final void mo17160a(@C12579k C15327u2 u2Var) {
        Intrinsics.checkNotNullParameter(u2Var, "$this$graphicsLayer");
        u2Var.mo42477h3(u2Var.mo7425g5(this.$elevation));
        u2Var.mo42460Q4(this.$shape);
        u2Var.mo42471e2(this.$clip);
        u2Var.mo42464W1(this.$ambientColor);
        u2Var.mo42482p2(this.$spotColor);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo17160a((C15327u2) obj);
        return C11079d2.f28267a;
    }
}
