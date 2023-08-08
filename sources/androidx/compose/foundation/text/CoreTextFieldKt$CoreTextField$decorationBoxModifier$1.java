package androidx.compose.foundation.text;

import androidx.compose.p004ui.layout.C15588o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(TextFieldState textFieldState) {
        super(1);
        this.$state = textFieldState;
    }

    /* renamed from: a */
    public final void mo9278a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "it");
        C2851y g = this.$state.mo9443g();
        if (g != null) {
            g.mo9933l(oVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9278a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
