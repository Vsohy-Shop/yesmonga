package androidx.compose.foundation.relocation;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.unit.C16502r;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/geometry/i;", "a", "()Landroidx/compose/ui/geometry/i;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BringIntoViewRequesterModifier$bringIntoView$2 extends Lambda implements C11289a<C15098i> {
    final /* synthetic */ C15098i $rect;
    final /* synthetic */ BringIntoViewRequesterModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterModifier$bringIntoView$2(C15098i iVar, BringIntoViewRequesterModifier bringIntoViewRequesterModifier) {
        super(0);
        this.$rect = iVar;
        this.this$0 = bringIntoViewRequesterModifier;
    }

    @C12580l
    /* renamed from: a */
    public final C15098i invoke() {
        C15098i iVar = this.$rect;
        if (iVar != null) {
            return iVar;
        }
        C15588o b = this.this$0.mo9143b();
        if (b != null) {
            return C15106n.m65045m(C16502r.m74673f(b.mo44434a()));
        }
        return null;
    }
}
