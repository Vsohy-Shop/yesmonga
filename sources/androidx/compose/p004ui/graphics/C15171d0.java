package androidx.compose.p004ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.graphics.C15325u1;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.d0 */
public final class C15171d0 {
    /* renamed from: a */
    public static final boolean m65559a(int i) {
        if (Build.VERSION.SDK_INT >= 29 || C15325u1.m66580G(i, C15325u1.f37708b.mo43015B()) || m65561c(i) != PorterDuff.Mode.SRC_OVER) {
            return true;
        }
        return false;
    }

    @C0376v0(29)
    @C12579k
    /* renamed from: b */
    public static final BlendMode m65560b(int i) {
        C15325u1.C15326a aVar = C15325u1.f37708b;
        if (C15325u1.m66580G(i, aVar.mo43017a())) {
            return BlendMode.CLEAR;
        }
        if (C15325u1.m66580G(i, aVar.mo43040x())) {
            return BlendMode.SRC;
        }
        if (C15325u1.m66580G(i, aVar.mo43023g())) {
            return BlendMode.DST;
        }
        if (C15325u1.m66580G(i, aVar.mo43015B())) {
            return BlendMode.SRC_OVER;
        }
        if (C15325u1.m66580G(i, aVar.mo43027k())) {
            return BlendMode.DST_OVER;
        }
        if (C15325u1.m66580G(i, aVar.mo43042z())) {
            return BlendMode.SRC_IN;
        }
        if (C15325u1.m66580G(i, aVar.mo43025i())) {
            return BlendMode.DST_IN;
        }
        if (C15325u1.m66580G(i, aVar.mo43014A())) {
            return BlendMode.SRC_OUT;
        }
        if (C15325u1.m66580G(i, aVar.mo43026j())) {
            return BlendMode.DST_OUT;
        }
        if (C15325u1.m66580G(i, aVar.mo43041y())) {
            return BlendMode.SRC_ATOP;
        }
        if (C15325u1.m66580G(i, aVar.mo43024h())) {
            return BlendMode.DST_ATOP;
        }
        if (C15325u1.m66580G(i, aVar.mo43016C())) {
            return BlendMode.XOR;
        }
        if (C15325u1.m66580G(i, aVar.mo43036t())) {
            return BlendMode.PLUS;
        }
        if (C15325u1.m66580G(i, aVar.mo43033q())) {
            return BlendMode.MODULATE;
        }
        if (C15325u1.m66580G(i, aVar.mo43038v())) {
            return BlendMode.SCREEN;
        }
        if (C15325u1.m66580G(i, aVar.mo43035s())) {
            return BlendMode.OVERLAY;
        }
        if (C15325u1.m66580G(i, aVar.mo43021e())) {
            return BlendMode.DARKEN;
        }
        if (C15325u1.m66580G(i, aVar.mo43031o())) {
            return BlendMode.LIGHTEN;
        }
        if (C15325u1.m66580G(i, aVar.mo43020d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (C15325u1.m66580G(i, aVar.mo43019c())) {
            return BlendMode.COLOR_BURN;
        }
        if (C15325u1.m66580G(i, aVar.mo43029m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (C15325u1.m66580G(i, aVar.mo43039w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (C15325u1.m66580G(i, aVar.mo43022f())) {
            return BlendMode.DIFFERENCE;
        }
        if (C15325u1.m66580G(i, aVar.mo43028l())) {
            return BlendMode.EXCLUSION;
        }
        if (C15325u1.m66580G(i, aVar.mo43034r())) {
            return BlendMode.MULTIPLY;
        }
        if (C15325u1.m66580G(i, aVar.mo43030n())) {
            return BlendMode.HUE;
        }
        if (C15325u1.m66580G(i, aVar.mo43037u())) {
            return BlendMode.SATURATION;
        }
        if (C15325u1.m66580G(i, aVar.mo43018b())) {
            return BlendMode.COLOR;
        }
        if (C15325u1.m66580G(i, aVar.mo43032p())) {
            return BlendMode.LUMINOSITY;
        }
        return BlendMode.SRC_OVER;
    }

    @C12579k
    /* renamed from: c */
    public static final PorterDuff.Mode m65561c(int i) {
        C15325u1.C15326a aVar = C15325u1.f37708b;
        if (C15325u1.m66580G(i, aVar.mo43017a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (C15325u1.m66580G(i, aVar.mo43040x())) {
            return PorterDuff.Mode.SRC;
        }
        if (C15325u1.m66580G(i, aVar.mo43023g())) {
            return PorterDuff.Mode.DST;
        }
        if (C15325u1.m66580G(i, aVar.mo43015B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (C15325u1.m66580G(i, aVar.mo43027k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (C15325u1.m66580G(i, aVar.mo43042z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (C15325u1.m66580G(i, aVar.mo43025i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (C15325u1.m66580G(i, aVar.mo43014A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (C15325u1.m66580G(i, aVar.mo43026j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (C15325u1.m66580G(i, aVar.mo43041y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (C15325u1.m66580G(i, aVar.mo43024h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (C15325u1.m66580G(i, aVar.mo43016C())) {
            return PorterDuff.Mode.XOR;
        }
        if (C15325u1.m66580G(i, aVar.mo43036t())) {
            return PorterDuff.Mode.ADD;
        }
        if (C15325u1.m66580G(i, aVar.mo43038v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (C15325u1.m66580G(i, aVar.mo43035s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (C15325u1.m66580G(i, aVar.mo43021e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (C15325u1.m66580G(i, aVar.mo43031o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (C15325u1.m66580G(i, aVar.mo43033q())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
