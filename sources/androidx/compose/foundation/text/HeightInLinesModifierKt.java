package androidx.compose.foundation.text;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.text.C16361p0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:135\n*E\n"})
public final class HeightInLinesModifierKt {

    /* renamed from: a */
    public static final int f7111a = 1;

    @C12579k
    /* renamed from: a */
    public static final C8767m m12293a(@C12579k C8767m mVar, @C12579k C16361p0 p0Var, int i, int i2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(p0Var, "textStyle");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2716x3f87673a(i, i2, p0Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new HeightInLinesModifierKt$heightInLines$2(i, i2, p0Var));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m12294b(C8767m mVar, C16361p0 p0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m12293a(mVar, p0Var, i, i2);
    }

    /* renamed from: c */
    public static final void m12295c(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i <= 0 || i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i > i2) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
    }
}
