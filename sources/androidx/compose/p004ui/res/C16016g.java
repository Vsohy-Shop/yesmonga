package androidx.compose.p004ui.res;

import android.content.Context;
import androidx.annotation.C0331e;
import androidx.annotation.C0340g0;
import androidx.annotation.C0342h;
import androidx.annotation.C0364q;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPrimitiveResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,82:1\n76#2:83\n76#2:84\n76#2:85\n76#2:86\n76#2:87\n*S KotlinDebug\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n*L\n38#1:83\n51#1:84\n64#1:85\n77#1:86\n78#1:87\n*E\n"})
/* renamed from: androidx.compose.ui.res.g */
public final class C16016g {
    @C8540g
    @C8582l1
    /* renamed from: a */
    public static final boolean m71850a(@C0342h int i, @C12580l C8592o oVar, int i2) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-432394447, i2, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:62)");
        }
        boolean z = ((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getResources().getBoolean(i);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return z;
    }

    @C8540g
    @C8582l1
    /* renamed from: b */
    public static final float m71851b(@C0364q int i, @C12580l C8592o oVar, int i2) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(804324951, i2, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        float M = C16483g.m74435M(((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getResources().getDimension(i) / ((C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i())).getDensity());
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return M;
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: c */
    public static final int[] m71852c(@C0331e int i, @C12580l C8592o oVar, int i2) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-93991766, i2, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:49)");
        }
        int[] intArray = ((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getResources().getIntArray(i);
        Intrinsics.checkNotNullExpressionValue(intArray, "context.resources.getIntArray(id)");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return intArray;
    }

    @C8540g
    @C8582l1
    /* renamed from: d */
    public static final int m71853d(@C0340g0 int i, @C12580l C8592o oVar, int i2) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(916701108, i2, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getResources().getInteger(i);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return integer;
    }
}
