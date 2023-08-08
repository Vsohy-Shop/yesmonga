package androidx.compose.foundation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,147:1\n135#2:148\n135#2:149\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n49#1:148\n78#1:149\n*E\n"})
public final class BackgroundKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m8822a(@C12579k C8767m mVar, @C12579k C15421z1 z1Var, @C12579k C15218g4 g4Var, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        if (InspectableValueKt.m71063e()) {
            lVar = new BackgroundKt$background$$inlined$debugInspectorInfo$1(f, z1Var, g4Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2123g((C15240j2) null, z1Var, f, g4Var, lVar, 1, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m8823b(C8767m mVar, C15421z1 z1Var, C15218g4 g4Var, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            g4Var = C15321t3.m66567a();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return m8822a(mVar, z1Var, g4Var, f);
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m8824c(@C12579k C8767m mVar, long j, @C12579k C15218g4 g4Var) {
        BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1 r6;
        Intrinsics.checkNotNullParameter(mVar, "$this$background");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        C15240j2 n = C15240j2.m66071n(j);
        if (InspectableValueKt.m71063e()) {
            r6 = new BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(j, g4Var);
        } else {
            r6 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2123g(n, (C15421z1) null, 0.0f, g4Var, r6, 6, (DefaultConstructorMarker) null));
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m8825d(C8767m mVar, long j, C15218g4 g4Var, int i, Object obj) {
        if ((i & 2) != 0) {
            g4Var = C15321t3.m66567a();
        }
        return m8824c(mVar, j, g4Var);
    }
}
