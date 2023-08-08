package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.p004ui.input.key.C15436b;
import androidx.compose.p004ui.input.key.C15437c;
import androidx.compose.p004ui.input.key.C15439d;
import androidx.compose.p004ui.input.key.C15443h;
import androidx.compose.p004ui.text.input.C16331y0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/input/key/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1 extends Lambda implements C11300l<C15436b, Boolean> {
    final /* synthetic */ C15068j $focusManager;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(C15068j jVar, TextFieldState textFieldState) {
        super(1);
        this.$focusManager = jVar;
        this.$state = textFieldState;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo9376a(@C12579k KeyEvent keyEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        InputDevice device = keyEvent.getDevice();
        if (device == null) {
            return Boolean.FALSE;
        }
        if (device.getKeyboardType() == 2 && device.isVirtual()) {
            return Boolean.FALSE;
        }
        if (!C15437c.m68266g(C15439d.m68274b(keyEvent), C15437c.f38419b.mo43929a())) {
            return Boolean.FALSE;
        }
        switch (C15443h.m68291b(C15439d.m68273a(keyEvent))) {
            case 19:
                z = this.$focusManager.mo42077g(C15059d.f37228b.mo42193n());
                break;
            case 20:
                z = this.$focusManager.mo42077g(C15059d.f37228b.mo42184a());
                break;
            case 21:
                z = this.$focusManager.mo42077g(C15059d.f37228b.mo42188h());
                break;
            case 22:
                z = this.$focusManager.mo42077g(C15059d.f37228b.mo42192m());
                break;
            case 23:
                C16331y0 e = this.$state.mo9441e();
                if (e != null) {
                    e.mo47332f();
                }
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo9376a(((C15436b) obj).mo43922h());
    }
}
