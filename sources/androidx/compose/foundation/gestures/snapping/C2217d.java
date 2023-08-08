package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1980j;
import androidx.compose.animation.core.C1983k;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/LowVelocityApproachAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
/* renamed from: androidx.compose.foundation.gestures.snapping.d */
public final class C2217d implements C2215b<Float, C1983k> {
    @C12579k

    /* renamed from: a */
    public final C1968g<Float> f5965a;
    @C12579k

    /* renamed from: b */
    public final C2218e f5966b;
    @C12579k

    /* renamed from: c */
    public final C16479d f5967c;

    public C2217d(@C12579k C1968g<Float> gVar, @C12579k C2218e eVar, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(gVar, "lowVelocityAnimationSpec");
        Intrinsics.checkNotNullParameter(eVar, "layoutInfoProvider");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f5965a = gVar;
        this.f5966b = eVar;
        this.f5967c = dVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo7572a(C2201l lVar, Object obj, Object obj2, C11300l lVar2, C11045c cVar) {
        return mo7574b(lVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), lVar2, cVar);
    }

    @C12580l
    /* renamed from: b */
    public Object mo7574b(@C12579k C2201l lVar, float f, float f2, @C12579k C11300l<? super Float, C11079d2> lVar2, @C12579k C11045c<? super C2214a<Float, C1983k>> cVar) {
        C2201l lVar3 = lVar;
        float f3 = f;
        Object c = SnapFlingBehaviorKt.m9619h(lVar3, (Math.abs(f) + this.f5966b.mo7546a(this.f5967c)) * Math.signum(f2), f3, C1980j.m8428c(0.0f, f2, 0, 0, false, 28, (Object) null), this.f5965a, lVar2, cVar);
        if (c == C11063b.m42612h()) {
            return c;
        }
        return (C2214a) c;
    }
}
