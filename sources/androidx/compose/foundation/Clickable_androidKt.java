package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p004ui.input.key.C15437c;
import androidx.compose.p004ui.input.key.C15439d;
import androidx.compose.p004ui.input.key.C15443h;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nClickable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,74:1\n76#2:75\n*S KotlinDebug\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n*L\n36#1:75\n*E\n"})
public final class Clickable_androidKt {

    /* renamed from: a */
    public static final long f5736a = ((long) ViewConfiguration.getTapTimeout());

    /* renamed from: b */
    public static final long m8912b() {
        return f5736a;
    }

    /* renamed from: c */
    public static final boolean m8913c(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$isClick");
        if (!C15437c.m68266g(C15439d.m68274b(keyEvent), C15437c.f38419b.mo43930b()) || !m8915e(keyEvent)) {
            return false;
        }
        return true;
    }

    @C8540g
    @C12579k
    /* renamed from: d */
    public static final C11289a<Boolean> m8914d(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1990508712);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1990508712, i, -1, "androidx.compose.foundation.isComposeRootInScrollableContainer (Clickable.android.kt:34)");
        }
        Clickable_androidKt$isComposeRootInScrollableContainer$1 clickable_androidKt$isComposeRootInScrollableContainer$1 = new Clickable_androidKt$isComposeRootInScrollableContainer$1((View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k()));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return clickable_androidKt$isComposeRootInScrollableContainer$1;
    }

    /* renamed from: e */
    public static final boolean m8915e(KeyEvent keyEvent) {
        int b = C15443h.m68291b(C15439d.m68273a(keyEvent));
        return b == 23 || b == 66 || b == 160;
    }

    /* renamed from: f */
    public static final boolean m8916f(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m8917g(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "$this$isPress");
        if (!C15437c.m68266g(C15439d.m68274b(keyEvent), C15437c.f38419b.mo43929a()) || !m8915e(keyEvent)) {
            return false;
        }
        return true;
    }
}
