package androidx.compose.p004ui.node;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/node/ModifierNodeOwnerScope;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/ModifierNodeOwnerScope;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1 */
public final class ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1 extends Lambda implements C11300l<ModifierNodeOwnerScope, C11079d2> {

    /* renamed from: f */
    public static final ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1 f38925f = new ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1();

    public ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo44817a(@C12579k ModifierNodeOwnerScope modifierNodeOwnerScope) {
        Intrinsics.checkNotNullParameter(modifierNodeOwnerScope, "it");
        if (modifierNodeOwnerScope.mo44553e0()) {
            modifierNodeOwnerScope.mo44815b().mo42163r();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo44817a((ModifierNodeOwnerScope) obj);
        return C11079d2.f28267a;
    }
}
