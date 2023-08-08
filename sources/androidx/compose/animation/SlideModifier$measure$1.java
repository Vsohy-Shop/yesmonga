package androidx.compose.animation;

import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SlideModifier$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ C15611w0 $placeable;
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlideModifier$measure$1(SlideModifier slideModifier, C15611w0 w0Var, long j) {
        super(1);
        this.this$0 = slideModifier;
        this.$placeable = w0Var;
        this.$measuredSize = j;
    }

    /* renamed from: a */
    public final void mo6580a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0.C15612a aVar2 = aVar;
        C15611w0.C15612a.m69400F(aVar2, this.$placeable, this.this$0.mo6575a().mo6717a(this.this$0.mo6578g(), new SlideModifier$measure$1$slideOffset$1(this.this$0, this.$measuredSize)).getValue().mo47856w(), 0.0f, (C11300l) null, 6, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo6580a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
