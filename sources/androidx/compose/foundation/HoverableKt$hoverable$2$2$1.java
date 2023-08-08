package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2237c;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", mo22502f = "Hoverable.kt", mo22503i = {}, mo22504l = {88}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HoverableKt$hoverable$2$2$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C8700z0<C2237c.C2238a> $hoverInteraction$delegate;
    final /* synthetic */ C2243g $interactionSource;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverableKt$hoverable$2$2$1(boolean z, C8700z0<C2237c.C2238a> z0Var, C2243g gVar, C11045c<? super HoverableKt$hoverable$2$2$1> cVar) {
        super(2, cVar);
        this.$enabled = z;
        this.$hoverInteraction$delegate = z0Var;
        this.$interactionSource = gVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HoverableKt$hoverable$2$2$1(this.$enabled, this.$hoverInteraction$delegate, this.$interactionSource, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (!this.$enabled) {
                C8700z0<C2237c.C2238a> z0Var = this.$hoverInteraction$delegate;
                C2243g gVar = this.$interactionSource;
                this.label = 1;
                if (HoverableKt$hoverable$2.m8957f(z0Var, gVar, this) == h) {
                    return h;
                }
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HoverableKt$hoverable$2$2$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
