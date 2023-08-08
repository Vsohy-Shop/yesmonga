package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8746f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1 */
public final class BackwardsCompatNode$updateDrawCache$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C8767m.C8770c $element;
    final /* synthetic */ BackwardsCompatNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateDrawCache$1(C8767m.C8770c cVar, BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.$element = cVar;
        this.this$0 = backwardsCompatNode;
    }

    public final void invoke() {
        ((C8746f) this.$element).mo17173h4(this.this$0);
    }
}
