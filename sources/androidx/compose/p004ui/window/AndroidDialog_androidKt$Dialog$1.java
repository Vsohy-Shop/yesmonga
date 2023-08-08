package androidx.compose.p004ui.window;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,456:1\n62#2,5:457\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n186#1:457,5\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1 */
public final class AndroidDialog_androidKt$Dialog$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ DialogWrapper $dialog;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n1#1,484:1\n187#2,3:485\n*E\n"})
    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$a */
    public static final class C16526a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ DialogWrapper f40973a;

        public C16526a(DialogWrapper dialogWrapper) {
            this.f40973a = dialogWrapper;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f40973a.dismiss();
            this.f40973a.mo48038k();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$1(DialogWrapper dialogWrapper) {
        super(1);
        this.$dialog = dialogWrapper;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        this.$dialog.show();
        return new C16526a(this.$dialog);
    }
}
