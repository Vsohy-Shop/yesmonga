package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.text.input.C16281c0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CoreTextFieldKt$CoreTextField$pointerModifier$1 extends Lambda implements C11300l<C15094f, C11079d2> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$pointerModifier$1(TextFieldState textFieldState, FocusRequester focusRequester, boolean z, TextFieldSelectionManager textFieldSelectionManager, C16281c0 c0Var) {
        super(1);
        this.$state = textFieldState;
        this.$focusRequester = focusRequester;
        this.$readOnly = z;
        this.$manager = textFieldSelectionManager;
        this.$offsetMapping = c0Var;
    }

    /* renamed from: a */
    public final void mo9283a(long j) {
        boolean z = true;
        CoreTextFieldKt.m12261p(this.$state, this.$focusRequester, !this.$readOnly);
        if (!this.$state.mo9440d()) {
            return;
        }
        if (this.$state.mo9439c() != HandleState.Selection) {
            C2851y g = this.$state.mo9443g();
            if (g != null) {
                TextFieldState textFieldState = this.$state;
                long j2 = j;
                TextFieldDelegate.f7187a.mo9374j(j2, g, textFieldState.mo9447k(), this.$offsetMapping, textFieldState.mo9446j());
                if (textFieldState.mo9454r().mo9579n().length() <= 0) {
                    z = false;
                }
                if (z) {
                    textFieldState.mo9457u(HandleState.Cursor);
                    return;
                }
                return;
            }
            return;
        }
        this.$manager.mo9766q(C15094f.m64868d(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9283a(((C15094f) obj).mo42242A());
        return C11079d2.f28267a;
    }
}
