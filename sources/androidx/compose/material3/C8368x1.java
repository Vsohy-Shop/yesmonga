package androidx.compose.material3;

import androidx.compose.animation.core.C2014v0;
import androidx.compose.material3.tokens.C8296d0;
import androidx.compose.material3.tokens.C8298e;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.material3.x1 */
public final class C8368x1 {
    @C12579k

    /* renamed from: a */
    public static final C8368x1 f22469a = new C8368x1();

    /* renamed from: b */
    public static final float f22470b = C8298e.f20970a.mo13402b();

    /* renamed from: c */
    public static final int f22471c;

    /* renamed from: d */
    public static final int f22472d;

    /* renamed from: e */
    public static final int f22473e;
    @C12579k

    /* renamed from: f */
    public static final C2014v0<Float> f22474f = new C2014v0<>(1.0f, 50.0f, Float.valueOf(0.001f));

    /* renamed from: g */
    public static final int f22475g = 0;

    static {
        C15244j4.C15245a aVar = C15244j4.f37564b;
        f22471c = aVar.mo42862a();
        f22472d = aVar.mo42862a();
        f22473e = aVar.mo42864c();
    }

    @C8540g
    @C11314h(name = "getCircularColor")
    /* renamed from: a */
    public final long mo14781a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1803349725);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1803349725, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:509)");
        }
        long k = ColorSchemeKt.m25524k(C8298e.f20970a.mo13401a(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    /* renamed from: b */
    public final int mo14782b() {
        return f22472d;
    }

    /* renamed from: c */
    public final int mo14783c() {
        return f22473e;
    }

    /* renamed from: d */
    public final float mo14784d() {
        return f22470b;
    }

    @C8540g
    @C11314h(name = "getCircularTrackColor")
    /* renamed from: e */
    public final long mo14785e(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-404222247);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-404222247, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:517)");
        }
        long s = C15240j2.f37547b.mo42850s();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return s;
    }

    @C8540g
    @C11314h(name = "getLinearColor")
    /* renamed from: f */
    public final long mo14786f(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-914312983);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-914312983, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:505)");
        }
        long k = ColorSchemeKt.m25524k(C8296d0.f20901a.mo13339a(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    /* renamed from: g */
    public final int mo14787g() {
        return f22471c;
    }

    @C8540g
    @C11314h(name = "getLinearTrackColor")
    /* renamed from: h */
    public final long mo14788h(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1677541593);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1677541593, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:513)");
        }
        long k = ColorSchemeKt.m25524k(C8296d0.f20901a.mo13346h(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k;
    }

    @C12579k
    /* renamed from: i */
    public final C2014v0<Float> mo14789i() {
        return f22474f;
    }
}
