package androidx.compose.p004ui.res;

import androidx.annotation.C0324b1;
import androidx.annotation.C0331e;
import androidx.annotation.C0370s0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.res.i */
public final class C16018i {
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: a */
    public static final String m71855a(@C0370s0 int i, int i2, @C12580l C8592o oVar, int i3) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1784741530, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = C16017h.m71854a(oVar, 0).getQuantityString(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityString(id, count)");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return quantityString;
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: b */
    public static final String m71856b(@C0370s0 int i, int i2, @C12579k Object[] objArr, @C12580l C8592o oVar, int i3) {
        Intrinsics.checkNotNullParameter(objArr, "formatArgs");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = C16017h.m71854a(oVar, 0).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return quantityString;
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: c */
    public static final String[] m71857c(@C0331e int i, @C12580l C8592o oVar, int i2) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1562162650, i2, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = C16017h.m71854a(oVar, 0).getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(id)");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return stringArray;
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: d */
    public static final String m71858d(@C0324b1 int i, @C12580l C8592o oVar, int i2) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = C16017h.m71854a(oVar, 0).getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return string;
    }

    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: e */
    public static final String m71859e(@C0324b1 int i, @C12579k Object[] objArr, @C12580l C8592o oVar, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "formatArgs");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = C16017h.m71854a(oVar, 0).getString(i, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id, *formatArgs)");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return string;
    }
}
