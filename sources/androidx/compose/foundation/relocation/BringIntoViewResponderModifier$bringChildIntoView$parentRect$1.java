package androidx.compose.foundation.relocation;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/geometry/i;", "a", "()Landroidx/compose/ui/geometry/i;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderModifier$bringChildIntoView$parentRect$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
public final class BringIntoViewResponderModifier$bringChildIntoView$parentRect$1 extends Lambda implements C11289a<C15098i> {
    final /* synthetic */ C11289a<C15098i> $boundsProvider;
    final /* synthetic */ C15588o $childCoordinates;
    final /* synthetic */ BringIntoViewResponderModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier$bringChildIntoView$parentRect$1(BringIntoViewResponderModifier bringIntoViewResponderModifier, C15588o oVar, C11289a<C15098i> aVar) {
        super(0);
        this.this$0 = bringIntoViewResponderModifier;
        this.$childCoordinates = oVar;
        this.$boundsProvider = aVar;
    }

    @C12580l
    /* renamed from: a */
    public final C15098i invoke() {
        C15098i g = BringIntoViewResponderModifier.m12035l(this.this$0, this.$childCoordinates, this.$boundsProvider);
        if (g != null) {
            return this.this$0.mo9135m().mo7335a(g);
        }
        return null;
    }
}
