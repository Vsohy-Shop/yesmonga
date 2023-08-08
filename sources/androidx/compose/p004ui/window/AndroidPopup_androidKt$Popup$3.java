package androidx.compose.p004ui.window;

import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3 */
public final class AndroidPopup_androidKt$Popup$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ C11289a<C11079d2> $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ C16547h $properties;
    final /* synthetic */ String $testTag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$3(PopupLayout popupLayout, C11289a<C11079d2> aVar, C16547h hVar, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$properties = hVar;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    public final void invoke() {
        this.$popupLayout.mo48066t(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
    }
}
