package androidx.compose.foundation.text;

import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1087:1\n245#2:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n*L\n372#1:1088\n*E\n"})
public final class CoreTextFieldKt$CoreTextField$drawModifier$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$drawModifier$1(TextFieldState textFieldState, TextFieldValue textFieldValue, C16281c0 c0Var) {
        super(1);
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$offsetMapping = c0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$drawBehind");
        C2851y g = this.$state.mo9443g();
        if (g != null) {
            TextFieldValue textFieldValue = this.$value;
            C16281c0 c0Var = this.$offsetMapping;
            TextFieldState textFieldState = this.$state;
            C15118b2 c = eVar.mo42683q5().mo42705c();
            TextFieldDelegate.f7187a.mo9367b(c, textFieldValue, c0Var, g.mo9930i(), textFieldState.mo9449m());
        }
    }
}
