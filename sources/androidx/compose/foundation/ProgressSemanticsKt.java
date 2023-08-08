package androidx.compose.foundation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import org.jetbrains.annotations.C12579k;

public final class ProgressSemanticsKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m9051a(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return SemanticsModifierKt.m71867b(mVar, true, ProgressSemanticsKt$progressSemantics$2.f5776f);
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C8767m m9052b(@C12579k C8767m mVar, float f, @C12579k C11457f<Float> fVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "valueRange");
        return SemanticsModifierKt.m71867b(mVar, true, new ProgressSemanticsKt$progressSemantics$1(f, fVar, i));
    }

    /* renamed from: c */
    public static /* synthetic */ C8767m m9053c(C8767m mVar, float f, C11457f<Float> fVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fVar = C11478t.m44305e(0.0f, 1.0f);
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m9052b(mVar, f, fVar, i);
    }
}
