package androidx.compose.foundation;

import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FocusableKt$focusable$2$4$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ C8700z0<Boolean> $isFocused$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusable$2$4$1(C8700z0<Boolean> z0Var, FocusRequester focusRequester) {
        super(1);
        this.$isFocused$delegate = z0Var;
        this.$focusRequester = focusRequester;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71965J0(qVar, FocusableKt$focusable$2.m8931g(this.$isFocused$delegate));
        final FocusRequester focusRequester = this.$focusRequester;
        final C8700z0<Boolean> z0Var = this.$isFocused$delegate;
        SemanticsPropertiesKt.m72049x0(qVar, (String) null, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                focusRequester.mo42129h();
                return Boolean.valueOf(FocusableKt$focusable$2.m8931g(z0Var));
            }
        }, 1, (Object) null);
    }
}
