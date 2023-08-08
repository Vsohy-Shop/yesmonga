package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTimePicker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,33:1\n76#2:34\n*S KotlinDebug\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n*L\n26#1:34\n*E\n"})
/* renamed from: androidx.compose.material3.k3 */
public final class C8237k3 {
    @C8540g
    @C8582l1
    @C11314h(name = "getDefaultTimePickerLayoutType")
    /* renamed from: a */
    public static final int m27257a(@C12580l C8592o oVar, int i) {
        int i2;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1979410629, i, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:25)");
        }
        Configuration configuration = (Configuration) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70951f());
        if (configuration.screenHeightDp < configuration.screenWidthDp) {
            i2 = C8230j3.f20250b.mo12727a();
        } else {
            i2 = C8230j3.f20250b.mo12728b();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return i2;
    }

    /* renamed from: b */
    public static /* synthetic */ void m27258b() {
    }
}
