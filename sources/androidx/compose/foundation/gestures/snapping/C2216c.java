package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1980j;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2013v;
import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.gestures.snapping.c */
public final class C2216c implements C2215b<Float, C1983k> {
    @C12579k

    /* renamed from: a */
    public final C2013v<Float> f5964a;

    public C2216c(@C12579k C2013v<Float> vVar) {
        Intrinsics.checkNotNullParameter(vVar, "decayAnimationSpec");
        this.f5964a = vVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo7572a(C2201l lVar, Object obj, Object obj2, C11300l lVar2, C11045c cVar) {
        return mo7573b(lVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), lVar2, cVar);
    }

    @C12580l
    /* renamed from: b */
    public Object mo7573b(@C12579k C2201l lVar, float f, float f2, @C12579k C11300l<? super Float, C11079d2> lVar2, @C12579k C11045c<? super C2214a<Float, C1983k>> cVar) {
        Object a = SnapFlingBehaviorKt.m9617f(lVar, f, C1980j.m8428c(0.0f, f2, 0, 0, false, 28, (Object) null), this.f5964a, lVar2, cVar);
        if (a == C11063b.m42612h()) {
            return a;
        }
        return (C2214a) a;
    }
}
