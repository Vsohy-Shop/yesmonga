package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.animation.core.Animatable$runAnimation$2", mo22502f = "Animatable.kt", mo22503i = {0, 0}, mo22504l = {305}, mo22505m = "invokeSuspend", mo22506n = {"endState", "clampingNeeded"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H@"}, mo22516d2 = {"T", "Landroidx/compose/animation/core/o;", "V", "Landroidx/compose/animation/core/e;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Animatable$runAnimation$2 extends SuspendLambda implements C11300l<C11045c<? super C1960e<T, V>>, Object> {
    final /* synthetic */ C1950c<T, V> $animation;
    final /* synthetic */ C11300l<Animatable<T, V>, C11079d2> $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable<T, V> animatable, T t, C1950c<T, V> cVar, long j, C11300l<? super Animatable<T, V>, C11079d2> lVar, C11045c<? super Animatable$runAnimation$2> cVar2) {
        super(1, cVar2);
        this.this$0 = animatable;
        this.$initialVelocity = t;
        this.$animation = cVar;
        this.$startTime = j;
        this.$block = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C1976i iVar;
        Ref.BooleanRef booleanRef;
        AnimationEndReason animationEndReason;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo6607o().mo6855q((C1997o) this.this$0.mo6611s().mo6792a().invoke(this.$initialVelocity));
            this.this$0.mo6596A(this.$animation.mo6800g());
            this.this$0.mo6618z(true);
            final C1976i h2 = C1980j.m8433h(this.this$0.mo6607o(), (Object) null, (C1997o) null, 0, Long.MIN_VALUE, false, 23, (Object) null);
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            C1950c<T, V> cVar = this.$animation;
            long j = this.$startTime;
            final Animatable<T, V> animatable = this.this$0;
            final C11300l<Animatable<T, V>, C11079d2> lVar = this.$block;
            C19161 r6 = new C11300l<C1964f<T, V>, C11079d2>() {
                /* renamed from: a */
                public final void mo6621a(@C12579k C1964f<T, V> fVar) {
                    Intrinsics.checkNotNullParameter(fVar, "$this$animate");
                    SuspendAnimationKt.m8091r(fVar, animatable.mo6607o());
                    Object a = animatable.mo6603k(fVar.mo6828g());
                    if (!Intrinsics.areEqual(a, (Object) fVar.mo6828g())) {
                        animatable.mo6607o().mo6854p(a);
                        h2.mo6854p(a);
                        C11300l<Animatable<T, V>, C11079d2> lVar = lVar;
                        if (lVar != null) {
                            lVar.invoke(animatable);
                        }
                        fVar.mo6822a();
                        booleanRef2.element = true;
                        return;
                    }
                    C11300l<Animatable<T, V>, C11079d2> lVar2 = lVar;
                    if (lVar2 != null) {
                        lVar2.invoke(animatable);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo6621a((C1964f) obj);
                    return C11079d2.f28267a;
                }
            };
            this.L$0 = h2;
            this.L$1 = booleanRef2;
            this.label = 1;
            if (SuspendAnimationKt.m8077d(h2, cVar, j, r6, this) == h) {
                return h;
            }
            iVar = h2;
            booleanRef = booleanRef2;
        } else if (i == 1) {
            booleanRef = (Ref.BooleanRef) this.L$1;
            iVar = (C1976i) this.L$0;
            try {
                C11661u0.m45747n(obj);
            } catch (CancellationException e) {
                this.this$0.mo6605m();
                throw e;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (booleanRef.element) {
            animationEndReason = AnimationEndReason.BoundReached;
        } else {
            animationEndReason = AnimationEndReason.Finished;
        }
        this.this$0.mo6605m();
        return new C1960e(iVar, animationEndReason);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C1960e<T, V>> cVar) {
        return ((Animatable$runAnimation$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
