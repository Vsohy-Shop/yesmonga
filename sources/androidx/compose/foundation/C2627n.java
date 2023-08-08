package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDarkTheme.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n76#2:52\n*S KotlinDebug\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n*L\n48#1:52\n*E\n"})
/* renamed from: androidx.compose.foundation.n */
public final class C2627n {
    @C8540g
    @C8582l1
    /* renamed from: a */
    public static final boolean m11886a(@C12580l C8592o oVar, int i) {
        boolean z;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-882615028, i, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        if ((((Configuration) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70951f())).uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return z;
    }
}
