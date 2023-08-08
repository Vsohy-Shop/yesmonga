package androidx.compose.p004ui.focus;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode$invalidateFocus$1 */
public final class FocusTargetModifierNode$invalidateFocus$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ Ref.ObjectRef<FocusProperties> $focusProperties;
    final /* synthetic */ FocusTargetModifierNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusTargetModifierNode$invalidateFocus$1(Ref.ObjectRef<FocusProperties> objectRef, FocusTargetModifierNode focusTargetModifierNode) {
        super(0);
        this.$focusProperties = objectRef;
        this.this$0 = focusTargetModifierNode;
    }

    public final void invoke() {
        this.$focusProperties.element = this.this$0.mo42161p0();
    }
}
