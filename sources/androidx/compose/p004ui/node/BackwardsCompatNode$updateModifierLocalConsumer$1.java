package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.modifier.C15627d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1 */
public final class BackwardsCompatNode$updateModifierLocalConsumer$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ BackwardsCompatNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateModifierLocalConsumer$1(BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.this$0 = backwardsCompatNode;
    }

    public final void invoke() {
        C8767m.C8770c k0 = this.this$0.mo44556k0();
        Intrinsics.checkNotNull(k0, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
        ((C15627d) k0).mo7151V3(this.this$0);
    }
}
