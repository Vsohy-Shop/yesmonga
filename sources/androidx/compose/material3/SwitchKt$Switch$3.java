package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,478:1\n62#2,5:479\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3\n*L\n128#1:479,5\n*E\n"})
public final class SwitchKt$Switch$3 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ Animatable<Float, C1983k> $offset;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ float $targetValue;

    @C11067d(mo22501c = "androidx.compose.material3.SwitchKt$Switch$3$1", mo22502f = "Switch.kt", mo22503i = {}, mo22504l = {125}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$1 */
    public static final class C81281 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C81281(animatable, f, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                Animatable<Float, C1983k> animatable = animatable;
                Float e = C11064a.m42619e(f);
                C2023z0 g = SwitchKt.f19816g;
                this.label = 1;
                if (Animatable.m7942i(animatable, e, g, (Object) null, (C11300l) null, this, 12, (Object) null) == h) {
                    return h;
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
            return ((C81281) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3\n*L\n1#1,484:1\n128#2:485\n*E\n"})
    /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$a */
    public static final class C8129a implements C8430d0 {
        /* renamed from: g */
        public void mo791g() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$3(Animatable<Float, C1983k> animatable, float f, C12074o0 o0Var) {
        super(1);
        this.$offset = animatable;
        this.$targetValue = f;
        this.$scope = o0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        boolean z;
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        float floatValue = this.$offset.mo6610r().floatValue();
        final float f = this.$targetValue;
        if (floatValue == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C12074o0 o0Var = this.$scope;
            final Animatable<Float, C1983k> animatable = this.$offset;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C81281((C11045c<? super C81281>) null), 3, (Object) null);
        }
        return new C8129a();
    }
}
