package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.C7875k1;
import androidx.compose.p004ui.C8776o;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,38:1\n76#2:39\n76#2:40\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n26#1:39\n27#1:40\n*E\n"})
/* renamed from: androidx.compose.material.l1 */
public final class C7879l1 {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final String m25061a(int i, @C12580l C8592o oVar, int i2) {
        String str;
        oVar.mo14918M(-726638443);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        oVar.mo15032w(AndroidCompositionLocals_androidKt.m70951f());
        Resources resources = ((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getResources();
        C7875k1.C7876a aVar = C7875k1.f18863b;
        if (C7875k1.m25043k(i, aVar.mo10865e())) {
            str = resources.getString(C8776o.C8779c.navigation_menu);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.navigation_menu)");
        } else if (C7875k1.m25043k(i, aVar.mo10861a())) {
            str = resources.getString(C8776o.C8779c.close_drawer);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_drawer)");
        } else if (C7875k1.m25043k(i, aVar.mo10862b())) {
            str = resources.getString(C8776o.C8779c.close_sheet);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_sheet)");
        } else if (C7875k1.m25043k(i, aVar.mo10863c())) {
            str = resources.getString(C8776o.C8779c.default_error_message);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (C7875k1.m25043k(i, aVar.mo10864d())) {
            str = resources.getString(C8776o.C8779c.dropdown_menu);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.dropdown_menu)");
        } else if (C7875k1.m25043k(i, aVar.mo10867g())) {
            str = resources.getString(C8776o.C8779c.range_start);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_start)");
        } else if (C7875k1.m25043k(i, aVar.mo10866f())) {
            str = resources.getString(C8776o.C8779c.range_end);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return str;
    }
}
