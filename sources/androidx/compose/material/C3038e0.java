package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2009t;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.material.e0 */
public final class C3038e0 {
    @C12579k

    /* renamed from: a */
    public static final C2023z0<C16483g> f8107a = new C2023z0(120, 0, C1947b0.m8290b(), 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public static final C2023z0<C16483g> f8108b = new C2023z0(150, 0, new C2009t(0.4f, 0.0f, 0.6f, 1.0f), 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final C2023z0<C16483g> f8109c = new C2023z0(120, 0, new C2009t(0.4f, 0.0f, 0.6f, 1.0f), 2, (DefaultConstructorMarker) null);

    @C12580l
    /* renamed from: d */
    public static final Object m14268d(@C12579k Animatable<C16483g, ?> animatable, float f, @C12580l C2240d dVar, @C12580l C2240d dVar2, @C12579k C11045c<? super C11079d2> cVar) {
        C1968g<C16483g> gVar;
        if (dVar2 != null) {
            gVar = C3035d0.f8100a.mo10744a(dVar2);
        } else if (dVar != null) {
            gVar = C3035d0.f8100a.mo10745b(dVar);
        } else {
            gVar = null;
        }
        C1968g<C16483g> gVar2 = gVar;
        if (gVar2 != null) {
            Object i = Animatable.m7942i(animatable, C16483g.m74451w(f), gVar2, (Object) null, (C11300l) null, cVar, 12, (Object) null);
            if (i == C11063b.m42612h()) {
                return i;
            }
            return C11079d2.f28267a;
        }
        Object B = animatable.mo6597B(C16483g.m74451w(f), cVar);
        if (B == C11063b.m42612h()) {
            return B;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m14269e(Animatable animatable, float f, C2240d dVar, C2240d dVar2, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            dVar = null;
        }
        if ((i & 4) != 0) {
            dVar2 = null;
        }
        return m14268d(animatable, f, dVar, dVar2, cVar);
    }
}
