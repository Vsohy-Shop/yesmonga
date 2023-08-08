package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/animation/core/f;", "", "Landroidx/compose/animation/core/k;", "Lkotlin/d2;", "a", "(Landroidx/compose/animation/core/f;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapFlingBehaviorKt$animateSnap$2 extends Lambda implements C11300l<C1964f<Float, C1983k>, C11079d2> {
    final /* synthetic */ float $cancelOffset;
    final /* synthetic */ Ref.FloatRef $consumedUpToNow;
    final /* synthetic */ C11300l<Float, C11079d2> $onAnimationStep;
    final /* synthetic */ C2201l $this_animateSnap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehaviorKt$animateSnap$2(float f, Ref.FloatRef floatRef, C2201l lVar, C11300l<? super Float, C11079d2> lVar2) {
        super(1);
        this.$cancelOffset = f;
        this.$consumedUpToNow = floatRef;
        this.$this_animateSnap = lVar;
        this.$onAnimationStep = lVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if (r0 == false) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7567a(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1964f<java.lang.Float, androidx.compose.animation.core.C1983k> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "$this$animateTo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Object r0 = r6.mo6828g()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r1 = r5.$cancelOffset
            float r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m9621j(r0, r1)
            kotlin.jvm.internal.Ref$FloatRef r1 = r5.$consumedUpToNow
            float r1 = r1.element
            float r1 = r0 - r1
            androidx.compose.foundation.gestures.l r2 = r5.$this_animateSnap
            float r2 = r2.mo7360a(r1)
            kotlin.jvm.functions.l<java.lang.Float, kotlin.d2> r3 = r5.$onAnimationStep
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            r3.invoke(r4)
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0048
            java.lang.Object r1 = r6.mo6828g()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x004b
        L_0x0048:
            r6.mo6822a()
        L_0x004b:
            kotlin.jvm.internal.Ref$FloatRef r6 = r5.$consumedUpToNow
            float r0 = r6.element
            float r0 = r0 + r2
            r6.element = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2.mo7567a(androidx.compose.animation.core.f):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7567a((C1964f) obj);
        return C11079d2.f28267a;
    }
}
