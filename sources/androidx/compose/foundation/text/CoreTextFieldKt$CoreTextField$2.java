package androidx.compose.foundation.text;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1087:1\n62#2,5:1088\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2\n*L\n326#1:1088,5\n*E\n"})
public final class CoreTextFieldKt$CoreTextField$2 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ TextFieldState $state;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2\n*L\n1#1,484:1\n327#2,4:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$a */
    public static final class C2702a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ TextFieldState f7092a;

        public C2702a(TextFieldState textFieldState) {
            this.f7092a = textFieldState;
        }

        /* renamed from: g */
        public void mo791g() {
            if (this.f7092a.mo9440d()) {
                CoreTextFieldKt.m12259n(this.f7092a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2(TextFieldState textFieldState) {
        super(1);
        this.$state = textFieldState;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C2702a(this.$state);
    }
}
