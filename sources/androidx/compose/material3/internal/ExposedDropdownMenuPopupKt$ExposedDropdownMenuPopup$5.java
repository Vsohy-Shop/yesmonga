package androidx.compose.material3.internal;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16499p;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    /* renamed from: a */
    public final void mo12664a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "childCoordinates");
        C15588o w0 = oVar.mo44438w0();
        Intrinsics.checkNotNull(w0);
        long a = w0.mo44434a();
        long g = C15591p.m69305g(w0);
        this.$popupLayout.mo12687p(C16499p.m74645b(C16496n.m74593a(C11409d.m43851L0(C15094f.m64880p(g)), C11409d.m43851L0(C15094f.m64882r(g))), a));
        this.$popupLayout.mo12699u();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12664a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
