package androidx.compose.p004ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,34:1\n76#2:35\n76#2:36\n*S KotlinDebug\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n*L\n32#1:35\n33#1:36\n*E\n"})
/* renamed from: androidx.compose.ui.res.h */
public final class C16017h {
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: a */
    public static final Resources m71854a(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1554054999, i, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        oVar.mo15032w(AndroidCompositionLocals_androidKt.m70951f());
        Resources resources = ((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return resources;
    }
}
