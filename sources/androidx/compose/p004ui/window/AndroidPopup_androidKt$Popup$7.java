package androidx.compose.p004ui.window;

import androidx.compose.p004ui.layout.C15588o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7 */
public final class AndroidPopup_androidKt$Popup$7 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$7(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    /* renamed from: a */
    public final void mo48012a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "childCoordinates");
        C15588o w0 = oVar.mo44438w0();
        Intrinsics.checkNotNull(w0);
        this.$popupLayout.mo48068v(w0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48012a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
