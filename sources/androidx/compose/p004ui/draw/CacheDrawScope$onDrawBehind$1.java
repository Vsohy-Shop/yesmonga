package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1 */
public final class CacheDrawScope$onDrawBehind$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ C11300l<C15187e, C11079d2> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$onDrawBehind$1(C11300l<? super C15187e, C11079d2> lVar) {
        super(1);
        this.$block = lVar;
    }

    /* renamed from: a */
    public final void mo17097a(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "$this$onDrawWithContent");
        this.$block.invoke(cVar);
        cVar.mo42716g6();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo17097a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
