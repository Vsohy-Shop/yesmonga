package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.focus.C15087z;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/focus/z;", "focusState", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/focus/z;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SelectionManager$modifier$3 extends Lambda implements C11300l<C15087z, C11079d2> {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$3(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    /* renamed from: a */
    public final void mo9683a(@C12579k C15087z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "focusState");
        if (!zVar.mo42156g() && this.this$0.mo9625B()) {
            this.this$0.mo9637N();
        }
        this.this$0.mo9649Z(zVar.mo42156g());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9683a((C15087z) obj);
        return C11079d2.f28267a;
    }
}
