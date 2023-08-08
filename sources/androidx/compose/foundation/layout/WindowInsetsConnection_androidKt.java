package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,708:1\n135#2:709\n76#3:710\n76#3:711\n76#3:712\n83#4,3:713\n1057#5,6:716\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n76#1:709\n112#1:710\n114#1:711\n115#1:712\n116#1:713,3\n116#1:716,6\n*E\n"})
public final class WindowInsetsConnection_androidKt {

    /* renamed from: a */
    public static final float f6169a = 0.35f;

    /* renamed from: b */
    public static final float f6170b = ViewConfiguration.getScrollFriction();

    /* renamed from: c */
    public static final float f6171c = 9.80665f;

    /* renamed from: d */
    public static final float f6172d = 39.37f;

    /* renamed from: e */
    public static final double f6173e;

    /* renamed from: f */
    public static final double f6174f;

    /* renamed from: g */
    public static final float f6175g = 0.5f;

    /* renamed from: h */
    public static final float f6176h = 1.0f;

    /* renamed from: i */
    public static final float f6177i = 0.175f;

    /* renamed from: j */
    public static final float f6178j = 0.35000002f;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f6173e = log;
        f6174f = log - 1.0d;
    }

    @C12579k
    @C2396p
    /* renamed from: d */
    public static final C8767m m10172d(@C12579k C8767m mVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return mVar;
        }
        if (InspectableValueKt.m71063e()) {
            lVar = new C2297x91d9d996();
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, WindowInsetsConnection_androidKt$imeNestedScroll$2.f6179f);
    }

    @C8540g
    @C12579k
    @C2396p
    /* renamed from: e */
    public static final C15446a m10173e(@C12579k C2356f fVar, int i, @C12580l C8592o oVar, int i2) {
        Intrinsics.checkNotNullParameter(fVar, "windowInsets");
        oVar.mo14918M(-1011341039);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1011341039, i2, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:104)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            C2390n nVar = C2390n.f6303a;
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            return nVar;
        }
        C2420x0 a = C2420x0.f6370a.mo8238a(i, (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p()));
        View view = (View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k());
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        Object[] objArr = {fVar, view, a, dVar};
        oVar.mo14918M(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= oVar.mo15006n0(objArr[i3]);
        }
        Object N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            N = new WindowInsetsNestedScrollConnection(fVar, view, a, dVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) N;
        EffectsKt.m29891c(windowInsetsNestedScrollConnection, new C2298x76e50d25(windowInsetsNestedScrollConnection), oVar, 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return windowInsetsNestedScrollConnection;
    }
}
