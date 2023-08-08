package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.input.C16313q;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1087:1\n62#2,5:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n528#1:1088,5\n*E\n"})
public final class CoreTextFieldKt$CoreTextField$4 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C16313q $imeOptions;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ C16321t0 $textInputService;
    final /* synthetic */ TextFieldValue $value;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n1#1,484:1\n528#2:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$a */
    public static final class C2704a implements C8430d0 {
        /* renamed from: g */
        public void mo791g() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$4(C16321t0 t0Var, TextFieldState textFieldState, TextFieldValue textFieldValue, C16313q qVar) {
        super(1);
        this.$textInputService = t0Var;
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$imeOptions = qVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        if (this.$textInputService != null && this.$state.mo9440d()) {
            TextFieldState textFieldState = this.$state;
            textFieldState.mo9459w(TextFieldDelegate.f7187a.mo9373i(this.$textInputService, this.$value, textFieldState.mo9447k(), this.$imeOptions, this.$state.mo9446j(), this.$state.mo9445i()));
        }
        return new C2704a();
    }
}
