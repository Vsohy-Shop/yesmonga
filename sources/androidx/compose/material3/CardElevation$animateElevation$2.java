package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.interaction.C2230a;
import androidx.compose.foundation.interaction.C2234b;
import androidx.compose.foundation.interaction.C2237c;
import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.CardElevation$animateElevation$2", mo22502f = "Card.kt", mo22503i = {}, mo22504l = {681, 688}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CardElevation$animateElevation$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Animatable<C16483g, C1983k> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2240d $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ CardElevation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2(boolean z, Animatable<C16483g, C1983k> animatable, CardElevation cardElevation, float f, C2240d dVar, C11045c<? super CardElevation$animateElevation$2> cVar) {
        super(2, cVar);
        this.$enabled = z;
        this.$animatable = animatable;
        this.this$0 = cardElevation;
        this.$target = f;
        this.$interaction = dVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CardElevation$animateElevation$2(this.$enabled, this.$animatable, this.this$0, this.$target, this.$interaction, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (this.$enabled) {
                float t0 = this.$animatable.mo6610r().mo47823t0();
                C2240d dVar = null;
                if (C16483g.m74440e0(t0, this.this$0.f19197b)) {
                    dVar = new C2245i.C2247b(C15094f.f37256b.mo42248e(), (DefaultConstructorMarker) null);
                } else if (C16483g.m74440e0(t0, this.this$0.f19199d)) {
                    dVar = new C2237c.C2238a();
                } else if (C16483g.m74440e0(t0, this.this$0.f19198c)) {
                    dVar = new C2234b.C2235a();
                } else if (C16483g.m74440e0(t0, this.this$0.f19200e)) {
                    dVar = new C2230a.C2232b();
                }
                Animatable<C16483g, C1983k> animatable = this.$animatable;
                float f = this.$target;
                C2240d dVar2 = this.$interaction;
                this.label = 1;
                if (C8245m0.m27377d(animatable, f, dVar, dVar2, this) == h) {
                    return h;
                }
            } else {
                Animatable<C16483g, C1983k> animatable2 = this.$animatable;
                C16483g w = C16483g.m74451w(this.$target);
                this.label = 2;
                if (animatable2.mo6597B(w, this) == h) {
                    return h;
                }
            }
        } else if (i == 1 || i == 2) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CardElevation$animateElevation$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
