package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C2837n;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/layout/o;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/o;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextController$coreModifiers$1 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$coreModifiers$1(TextController textController) {
        super(1);
        this.this$0 = textController;
    }

    /* renamed from: a */
    public final void mo9352a(@C12579k C15588o oVar) {
        C2837n a;
        Intrinsics.checkNotNullParameter(oVar, "it");
        this.this$0.mo9331l().mo9477l(oVar);
        if (SelectionRegistrarKt.m12854b(this.this$0.f7170b, this.this$0.mo9331l().mo9473h())) {
            long g = C15591p.m69305g(oVar);
            if (!C15094f.m64876l(g, this.this$0.mo9331l().mo9471f()) && (a = this.this$0.f7170b) != null) {
                a.mo9703d(this.this$0.mo9331l().mo9473h());
            }
            this.this$0.mo9331l().mo9481p(g);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9352a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
