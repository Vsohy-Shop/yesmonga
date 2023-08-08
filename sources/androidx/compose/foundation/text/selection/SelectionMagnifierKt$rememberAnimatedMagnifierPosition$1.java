package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1986l;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", mo22502f = "SelectionMagnifier.kt", mo22503i = {}, mo22504l = {88}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Animatable<C15094f, C1986l> $animatable;
    final /* synthetic */ C8578k2<C15094f> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(C8578k2<C15094f> k2Var, Animatable<C15094f, C1986l> animatable, C11045c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1> cVar) {
        super(2, cVar);
        this.$targetValue$delegate = k2Var;
        this.$animatable = animatable;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, cVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C12074o0 o0Var = (C12074o0) this.L$0;
            final C8578k2<C15094f> k2Var = this.$targetValue$delegate;
            C11907e v = C8415c2.m30253v(new C11289a<C15094f>() {
                /* renamed from: a */
                public final long mo9621a() {
                    return SelectionMagnifierKt.m12713i(k2Var);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return C15094f.m64868d(mo9621a());
                }
            });
            final Animatable<C15094f, C1986l> animatable = this.$animatable;
            C27962 r3 = new C11908f<C15094f>() {
                @C12580l
                /* renamed from: c */
                public final Object mo9622c(long j, @C12579k C11045c<? super C11079d2> cVar) {
                    boolean z;
                    if (C15096g.m64901d(animatable.mo6613u().mo42242A()) && C15096g.m64901d(j)) {
                        if (C15094f.m64882r(animatable.mo6613u().mo42242A()) == C15094f.m64882r(j)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C2797x2d93455c(animatable, j, (C11045c<? super C2797x2d93455c>) null), 3, (Object) null);
                            return C11079d2.f28267a;
                        }
                    }
                    Object B = animatable.mo6597B(C15094f.m64868d(j), cVar);
                    if (B == C11063b.m42612h()) {
                        return B;
                    }
                    return C11079d2.f28267a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
                    return mo9622c(((C15094f) obj).mo42242A(), cVar);
                }
            };
            this.label = 1;
            if (v.collect(r3, this) == h) {
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
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
