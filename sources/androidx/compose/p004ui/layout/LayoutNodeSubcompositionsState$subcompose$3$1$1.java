package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,774:1\n169#2,9:775\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n*L\n447#1:775,9\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1 */
public final class LayoutNodeSubcompositionsState$subcompose$3$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ LayoutNodeSubcompositionsState.C15517a $nodeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$subcompose$3$1$1(LayoutNodeSubcompositionsState.C15517a aVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(2);
        this.$nodeState = aVar;
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-34810602, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:445)");
            }
            boolean a = this.$nodeState.mo44283a();
            C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
            oVar.mo14944V(ComposerKt.f22652v, Boolean.valueOf(a));
            boolean b = oVar.mo14961b(a);
            if (a) {
                pVar.invoke(oVar, 0);
            } else {
                oVar.mo15001m(b);
            }
            oVar.mo14915L();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
