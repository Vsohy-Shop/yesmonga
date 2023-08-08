package androidx.compose.material;

import androidx.compose.foundation.C2223i;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.unit.C16483g;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextFieldKt$drawIndicatorLine$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ C2223i $indicatorBorder;
    final /* synthetic */ float $strokeWidthDp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$drawIndicatorLine$1(float f, C2223i iVar) {
        super(1);
        this.$strokeWidthDp = f;
        this.$indicatorBorder = iVar;
    }

    /* renamed from: a */
    public final void mo10669a(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "$this$drawWithContent");
        cVar.mo42716g6();
        if (!C16483g.m74440e0(this.$strokeWidthDp, C16483g.f40871b.mo47826a())) {
            float density = this.$strokeWidthDp * cVar.getDensity();
            float m = C15104m.m65016m(cVar.mo42718b()) - (density / ((float) 2));
            C15187e.m65712f6(cVar, this.$indicatorBorder.mo7586c(), C15096g.m64898a(0.0f, m), C15096g.m64898a(C15104m.m65023t(cVar.mo42718b()), m), density, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34592d1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10669a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
