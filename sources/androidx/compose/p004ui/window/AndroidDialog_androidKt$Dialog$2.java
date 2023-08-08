package androidx.compose.p004ui.window;

import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2 */
public final class AndroidDialog_androidKt$Dialog$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ DialogWrapper $dialog;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ C11289a<C11079d2> $onDismissRequest;
    final /* synthetic */ C16541b $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$2(DialogWrapper dialogWrapper, C11289a<C11079d2> aVar, C16541b bVar, LayoutDirection layoutDirection) {
        super(0);
        this.$dialog = dialogWrapper;
        this.$onDismissRequest = aVar;
        this.$properties = bVar;
        this.$layoutDirection = layoutDirection;
    }

    public final void invoke() {
        this.$dialog.mo48042o(this.$onDismissRequest, this.$properties, this.$layoutDirection);
    }
}
