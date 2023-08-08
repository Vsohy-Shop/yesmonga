package androidx.compose.material3;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTimeFormat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeFormat.android.kt\nandroidx/compose/material3/TimeFormat_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,27:1\n76#2:28\n*S KotlinDebug\n*F\n+ 1 TimeFormat.android.kt\nandroidx/compose/material3/TimeFormat_androidKt\n*L\n26#1:28\n*E\n"})
/* renamed from: androidx.compose.material3.g3 */
public final class C8206g3 {
    @C8540g
    @C8582l1
    @C11314h(name = "is24HourFormat")
    /* renamed from: a */
    public static final boolean m27121a(@C12580l C8592o oVar, int i) {
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-972868615, i, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:25)");
        }
        boolean is24HourFormat = DateFormat.is24HourFormat((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g()));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return is24HourFormat;
    }
}
