package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.input.C15430a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/input/a;", "it", "", "a", "(I)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1 */
public final class AndroidComposeView$_inputModeManager$1 extends Lambda implements C11300l<C15430a, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo45368a(int i) {
        boolean z;
        C15430a.C15431a aVar = C15430a.f38121b;
        if (C15430a.m67354f(i, aVar.mo43612b())) {
            z = this.this$0.isInTouchMode();
        } else if (!C15430a.m67354f(i, aVar.mo43611a())) {
            z = false;
        } else if (this.this$0.isInTouchMode()) {
            z = this.this$0.requestFocusFromTouch();
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo45368a(((C15430a) obj).mo43609i());
    }
}
