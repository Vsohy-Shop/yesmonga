package androidx.compose.foundation;

import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BorderKt$drawGenericBorder$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ C15421z1 $brush;
    final /* synthetic */ C15174d3.C15175a $outline;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawGenericBorder$1(C15174d3.C15175a aVar, C15421z1 z1Var) {
        super(1);
        this.$outline = aVar;
        this.$brush = z1Var;
    }

    /* renamed from: a */
    public final void mo7135a(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "$this$onDrawWithContent");
        cVar.mo42716g6();
        C15187e.m65694J4(cVar, this.$outline.mo42646b(), this.$brush, 0.0f, (C15192h) null, (C15249k2) null, 0, 60, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7135a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
