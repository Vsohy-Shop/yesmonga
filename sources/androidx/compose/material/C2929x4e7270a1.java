package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 */
public final class C2929x4e7270a1 extends Lambda implements C11304p<C16497o, C16497o, C11079d2> {
    final /* synthetic */ C8700z0<C15283o4> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2929x4e7270a1(C8700z0<C15283o4> z0Var) {
        super(2);
        this.$transformOriginState = z0Var;
    }

    /* renamed from: a */
    public final void mo10203a(@C12579k C16497o oVar, @C12579k C16497o oVar2) {
        Intrinsics.checkNotNullParameter(oVar, "parentBounds");
        Intrinsics.checkNotNullParameter(oVar2, "menuBounds");
        this.$transformOriginState.setValue(C15283o4.m66370b(MenuKt.m13571h(oVar, oVar2)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo10203a((C16497o) obj, (C16497o) obj2);
        return C11079d2.f28267a;
    }
}
