package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CoreTextFieldKt$CoreTextField$onPositionedModifier$1 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$onPositionedModifier$1(TextFieldState textFieldState, boolean z, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, C16281c0 c0Var) {
        super(1);
        this.$state = textFieldState;
        this.$enabled = z;
        this.$manager = textFieldSelectionManager;
        this.$value = textFieldValue;
        this.$offsetMapping = c0Var;
    }

    /* renamed from: a */
    public final void mo9282a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "it");
        this.$state.mo9460x(oVar);
        if (this.$enabled) {
            if (this.$state.mo9439c() == HandleState.Selection) {
                if (this.$state.mo9451o()) {
                    this.$manager.mo9759e0();
                } else {
                    this.$manager.mo9742N();
                }
                this.$state.mo9435D(TextFieldSelectionManagerKt.m12939c(this.$manager, true));
                this.$state.mo9434C(TextFieldSelectionManagerKt.m12939c(this.$manager, false));
            } else if (this.$state.mo9439c() == HandleState.Cursor) {
                this.$state.mo9432A(TextFieldSelectionManagerKt.m12939c(this.$manager, true));
            }
            CoreTextFieldKt.m12257l(this.$state, this.$value, this.$offsetMapping);
        }
        C2851y g = this.$state.mo9443g();
        if (g != null) {
            g.mo9934m(oVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9282a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
