package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,863:1\n135#2:864\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n666#1:864\n*E\n"})
public interface AnimatedVisibilityScope {

    /* renamed from: androidx.compose.animation.AnimatedVisibilityScope$a */
    public static final class C1902a {
        @C2031i
        @Deprecated
        @C12579k
        /* renamed from: a */
        public static C8767m m7760a(@C12579k AnimatedVisibilityScope animatedVisibilityScope, @C12579k C8767m mVar, @C12579k C2025e eVar, @C12579k C2028g gVar, @C12579k String str) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(eVar, "enter");
            Intrinsics.checkNotNullParameter(gVar, "exit");
            Intrinsics.checkNotNullParameter(str, "label");
            return AnimatedVisibilityScope.super.mo6486b(mVar, eVar, gVar, str);
        }

        @C2031i
        /* renamed from: c */
        public static /* synthetic */ void m7762c() {
        }
    }

    /* renamed from: a */
    static /* synthetic */ C8767m m7756a(AnimatedVisibilityScope animatedVisibilityScope, C8767m mVar, C2025e eVar, C2028g gVar, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                eVar = EnterExitTransitionKt.m7842v((C1956d0) null, 0.0f, 3, (Object) null).mo7023c(EnterExitTransitionKt.m7838r((C1956d0) null, (C8734c) null, false, (C11300l) null, 15, (Object) null));
            }
            if ((i & 2) != 0) {
                gVar = EnterExitTransitionKt.m7844x((C1956d0) null, 0.0f, 3, (Object) null).mo7029c(EnterExitTransitionKt.m7803G((C1956d0) null, (C8734c) null, false, (C11300l) null, 15, (Object) null));
            }
            if ((i & 4) != 0) {
                str = "animateEnterExit";
            }
            return animatedVisibilityScope.mo6486b(mVar, eVar, gVar, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
    }

    @C2031i
    @C12579k
    /* renamed from: b */
    C8767m mo6486b(@C12579k C8767m mVar, @C12579k C2025e eVar, @C12579k C2028g gVar, @C12579k String str) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "enter");
        Intrinsics.checkNotNullParameter(gVar, "exit");
        Intrinsics.checkNotNullParameter(str, "label");
        if (InspectableValueKt.m71063e()) {
            lVar = new C1903x599743f2(eVar, gVar, str);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new AnimatedVisibilityScope$animateEnterExit$2(this, eVar, gVar, str));
    }

    @C2031i
    @C12579k
    /* renamed from: c */
    Transition<EnterExitState> mo6487c();
}
