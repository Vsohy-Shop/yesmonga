package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,517:1\n76#2:518\n76#2:519\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n*L\n409#1:518\n413#1:519\n*E\n"})
public final class TabRowDefaults$tabIndicatorOffset$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C7906r1 $currentTabPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2(C7906r1 r1Var) {
        super(3);
        this.$currentTabPosition = r1Var;
    }

    /* renamed from: b */
    public static final float m14100b(C8578k2<C16483g> k2Var) {
        return k2Var.getValue().mo47823t0();
    }

    /* renamed from: c */
    public static final float m14101c(C8578k2<C16483g> k2Var) {
        return k2Var.getValue().mo47823t0();
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo10614a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-398757863);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-398757863, i, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:407)");
        }
        C8592o oVar2 = oVar;
        C8578k2 d = AnimateAsStateKt.m7970d(this.$currentTabPosition.mo10998c(), C1972h.m8392q(250, 0, C1947b0.m8290b(), 2, (Object) null), (C11300l) null, oVar2, 0, 4);
        C8767m H = SizeKt.m10092H(OffsetKt.m10000f(SizeKt.m10098N(SizeKt.m10114n(mVar, 0.0f, 1, (Object) null), C8734c.f23406a.mo17065g(), false, 2, (Object) null), m14101c(AnimateAsStateKt.m7970d(this.$currentTabPosition.mo10996a(), C1972h.m8392q(250, 0, C1947b0.m8290b(), 2, (Object) null), (C11300l) null, oVar2, 0, 4)), 0.0f, 2, (Object) null), m14100b(d));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return H;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo10614a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
