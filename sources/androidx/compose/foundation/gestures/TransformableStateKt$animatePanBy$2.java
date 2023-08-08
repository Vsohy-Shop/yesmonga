package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1976i;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.C1997o;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.geometry.C15094f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", mo22502f = "TransformableState.kt", mo22503i = {}, mo22504l = {182}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/p;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements C11304p<C2209p, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C1968g<C15094f> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref.LongRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(Ref.LongRef longRef, long j, C1968g<C15094f> gVar, C11045c<? super TransformableStateKt$animatePanBy$2> cVar) {
        super(2, cVar);
        this.$previous = longRef;
        this.$offset = j;
        this.$animationSpec = gVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, cVar);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C2209p pVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((TransformableStateKt$animatePanBy$2) create(pVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C2209p pVar = (C2209p) this.L$0;
            C1976i iVar = new C1976i(VectorConvertersKt.m8217b(C15094f.f37256b), C15094f.m64868d(this.$previous.element), (C1997o) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
            C15094f d = C15094f.m64868d(this.$offset);
            C1968g<C15094f> gVar = this.$animationSpec;
            final Ref.LongRef longRef = this.$previous;
            C21801 r7 = new C11300l<C1964f<C15094f, C1986l>, C11079d2>() {
                /* renamed from: a */
                public final void mo7515a(@C12579k C1964f<C15094f, C1986l> fVar) {
                    Intrinsics.checkNotNullParameter(fVar, "$this$animateTo");
                    C2209p.m9577b(pVar, 0.0f, C15094f.m64885u(fVar.mo6828g().mo42242A(), longRef.element), 0.0f, 5, (Object) null);
                    longRef.element = fVar.mo6828g().mo42242A();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo7515a((C1964f) obj);
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m8086m(iVar, d, gVar, false, r7, this, 4, (Object) null) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
