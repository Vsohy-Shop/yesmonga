package androidx.compose.animation.core;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"T", "Landroidx/compose/animation/core/o;", "V", "", "it", "Lkotlin/d2;", "a", "(J)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SuspendAnimationKt$animate$9 extends Lambda implements C11300l<Long, C11079d2> {
    final /* synthetic */ C1950c<T, V> $animation;
    final /* synthetic */ C11300l<C1964f<T, V>, C11079d2> $block;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ Ref.ObjectRef<C1964f<T, V>> $lateInitScope;
    final /* synthetic */ C1976i<T, V> $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$9(Ref.ObjectRef<C1964f<T, V>> objectRef, float f, C1950c<T, V> cVar, C1976i<T, V> iVar, C11300l<? super C1964f<T, V>, C11079d2> lVar) {
        super(1);
        this.$lateInitScope = objectRef;
        this.$durationScale = f;
        this.$animation = cVar;
        this.$this_animate = iVar;
        this.$block = lVar;
    }

    /* renamed from: a */
    public final void mo6679a(long j) {
        T t = this.$lateInitScope.element;
        Intrinsics.checkNotNull(t);
        SuspendAnimationKt.m8089p((C1964f) t, j, this.$durationScale, this.$animation, this.$this_animate, this.$block);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo6679a(((Number) obj).longValue());
        return C11079d2.f28267a;
    }
}
