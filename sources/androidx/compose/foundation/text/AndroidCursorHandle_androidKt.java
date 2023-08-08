package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,82:1\n154#2:83\n88#3:84\n71#3:85\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n35#1:83\n36#1:84\n36#1:85\n*E\n"})
public final class AndroidCursorHandle_androidKt {

    /* renamed from: a */
    public static final float f7061a = 1.4142135f;

    /* renamed from: b */
    public static final float f7062b;

    /* renamed from: c */
    public static final float f7063c;

    static {
        float M = C16483g.m74435M((float) 25);
        f7062b = M;
        f7063c = C16483g.m74435M(C16483g.m74435M(M * 2.0f) / 2.4142137f);
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m12180a(long j, @C12579k C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        C8592o o = oVar.mo15009o(-5185995);
        if ((i & 14) == 0) {
            if (o.mo14980g(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-5185995, i2, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:38)");
            }
            AndroidSelectionHandles_androidKt.m12665b(j, HandleReferencePoint.TopMiddle, C8553b.m31048b(o, -1458480226, true, new AndroidCursorHandle_androidKt$CursorHandle$1(pVar, mVar, i2)), o, (i2 & 14) | 432);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AndroidCursorHandle_androidKt$CursorHandle$2(j, mVar, pVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m12181b(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        C8592o o = oVar.mo15009o(694251107);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(694251107, i, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            C2428y0.m10726a(m12182c(SizeKt.m10089E(mVar, f7063c, f7062b)), o, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new AndroidCursorHandle_androidKt$DefaultCursorHandle$1(mVar, i));
        }
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m12182c(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, AndroidCursorHandle_androidKt$drawCursorHandle$1.f7064f, 1, (Object) null);
    }

    /* renamed from: d */
    public static final float m12183d() {
        return f7062b;
    }

    /* renamed from: e */
    public static final float m12184e() {
        return f7063c;
    }
}
