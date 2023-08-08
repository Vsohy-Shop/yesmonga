package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
public final class TooltipSync {
    @C12579k

    /* renamed from: a */
    public static final TooltipSync f19952a = new TooltipSync();
    @C12579k

    /* renamed from: b */
    public static final MutatorMutex f19953b = new MutatorMutex();
    @C12580l

    /* renamed from: c */
    public static C8265p3 f19954c;

    @C12580l
    /* renamed from: a */
    public final Object mo12393a(@C12579k C8265p3 p3Var, @C12579k C11045c<? super C11079d2> cVar) {
        if (!Intrinsics.areEqual((Object) p3Var, (Object) f19954c)) {
            return C11079d2.f28267a;
        }
        Object d = f19953b.mo7229d(MutatePriority.UserInput, new TooltipSync$dismissCurrentTooltip$2((C11045c<? super TooltipSync$dismissCurrentTooltip$2>) null), cVar);
        if (d == C11063b.m42612h()) {
            return d;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: b */
    public final MutatorMutex mo12394b() {
        return f19953b;
    }

    @C12580l
    /* renamed from: c */
    public final C8265p3 mo12395c() {
        return f19954c;
    }

    /* renamed from: d */
    public final void mo12396d(@C12580l C8265p3 p3Var) {
        f19954c = p3Var;
    }

    @C12580l
    /* renamed from: e */
    public final Object mo12397e(@C12579k C8265p3 p3Var, boolean z, @C12579k C11045c<? super C11079d2> cVar) {
        C11300l lVar;
        C11289a aVar;
        if (p3Var instanceof C8364w1) {
            lVar = new TooltipSync$show$2(p3Var, (C11045c<? super TooltipSync$show$2>) null);
            aVar = new TooltipSync$show$3(p3Var);
        } else if (p3Var instanceof C8194e2) {
            TooltipSync$show$4 tooltipSync$show$4 = new TooltipSync$show$4(z, p3Var, (C11045c<? super TooltipSync$show$4>) null);
            aVar = new TooltipSync$show$5(p3Var);
            lVar = tooltipSync$show$4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object d = f19953b.mo7229d(MutatePriority.Default, new TooltipSync$show$6(p3Var, lVar, aVar, (C11045c<? super TooltipSync$show$6>) null), cVar);
        if (d == C11063b.m42612h()) {
            return d;
        }
        return C11079d2.f28267a;
    }
}
