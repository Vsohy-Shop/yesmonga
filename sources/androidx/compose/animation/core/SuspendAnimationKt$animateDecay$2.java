package androidx.compose.animation.core;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/animation/core/f;", "", "Landroidx/compose/animation/core/k;", "Lkotlin/d2;", "a", "(Landroidx/compose/animation/core/f;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SuspendAnimationKt$animateDecay$2 extends Lambda implements C11300l<C1964f<Float, C1983k>, C11079d2> {
    final /* synthetic */ C11304p<Float, Float, C11079d2> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animateDecay$2(C11304p<? super Float, ? super Float, C11079d2> pVar) {
        super(1);
        this.$block = pVar;
    }

    /* renamed from: a */
    public final void mo6680a(@C12579k C1964f<Float, C1983k> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "$this$animate");
        this.$block.invoke(fVar.mo6828g(), Float.valueOf(fVar.mo6830i().mo6872f()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo6680a((C1964f) obj);
        return C11079d2.f28267a;
    }
}
