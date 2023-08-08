package androidx.compose.p004ui.platform;

import android.view.KeyEvent;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.input.key.C15436b;
import androidx.compose.p004ui.input.key.C15437c;
import androidx.compose.p004ui.input.key.C15439d;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/input/key/b;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1 */
public final class AndroidComposeView$keyInputModifier$1 extends Lambda implements C11300l<C15436b, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo45372a(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "it");
        C15059d t = this.this$0.mo44997t(keyEvent);
        if (t == null || !C15437c.m68266g(C15439d.m68274b(keyEvent), C15437c.f38419b.mo43929a())) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.this$0.getFocusOwner().mo42077g(t.mo42182q()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo45372a(((C15436b) obj).mo43922h());
    }
}
