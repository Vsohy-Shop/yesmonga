package dev.chrisbanes.snapper;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/animation/core/f;", "", "Landroidx/compose/animation/core/k;", "Lkotlin/d2;", "a", "(Landroidx/compose/animation/core/f;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class SnapperFlingBehavior$performDecayFling$4 extends Lambda implements C11300l<C1964f<Float, C1983k>, C11079d2> {
    final /* synthetic */ boolean $canSpringThenFling;
    final /* synthetic */ Ref.FloatRef $lastValue;
    final /* synthetic */ int $targetIndex;
    final /* synthetic */ C2201l $this_performDecayFling;
    final /* synthetic */ Ref.FloatRef $velocityLeft;
    final /* synthetic */ SnapperFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior$performDecayFling$4(Ref.FloatRef floatRef, C2201l lVar, Ref.FloatRef floatRef2, SnapperFlingBehavior snapperFlingBehavior, boolean z, int i) {
        super(1);
        this.$lastValue = floatRef;
        this.$this_performDecayFling = lVar;
        this.$velocityLeft = floatRef2;
        this.this$0 = snapperFlingBehavior;
        this.$canSpringThenFling = z;
        this.$targetIndex = i;
    }

    /* renamed from: a */
    public final void mo21783a(@C12579k C1964f<Float, C1983k> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "$this$animateDecay");
        float floatValue = fVar.mo6828g().floatValue() - this.$lastValue.element;
        float a = this.$this_performDecayFling.mo7360a(floatValue);
        this.$lastValue.element = fVar.mo6828g().floatValue();
        this.$velocityLeft.element = fVar.mo6829h().floatValue();
        if (Math.abs(floatValue - a) > 0.5f) {
            fVar.mo6822a();
        }
        C10369g e = this.this$0.f28001a.mo21756e();
        if (e == null) {
            fVar.mo6822a();
            return;
        }
        if (fVar.mo6831j() && this.$canSpringThenFling) {
            if (fVar.mo6829h().floatValue() > 0.0f && e.mo21792a() == this.$targetIndex - 1) {
                fVar.mo6822a();
            } else if (fVar.mo6829h().floatValue() < 0.0f && e.mo21792a() == this.$targetIndex) {
                fVar.mo6822a();
            }
        }
        if (fVar.mo6831j() && this.this$0.mo21780n(fVar, e, this.$targetIndex, new C11300l<Float, Float>(this.$this_performDecayFling) {
            @C12579k
            /* renamed from: d */
            public final Float mo21784d(float f) {
                return Float.valueOf(((C2201l) this.receiver).mo7360a(f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo21784d(((Number) obj).floatValue());
            }
        })) {
            fVar.mo6822a();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo21783a((C1964f) obj);
        return C11079d2.f28267a;
    }
}
