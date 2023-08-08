package com.skydoves.landscapist;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15110a2;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15127c4;
import androidx.compose.p004ui.graphics.C15178d4;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15247k0;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15268m4;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.skydoves.landscapist.d */
public final class C35317d extends Painter {
    @C12579k

    /* renamed from: g */
    public final C15403w2 f86786g;
    @C12579k

    /* renamed from: v */
    public final Painter f86787v;
    @C12579k

    /* renamed from: w */
    public final C8700z0 f86788w = C8415c2.m30241j(Float.valueOf(0.0f), C8415c2.m30243l());

    public C35317d(@C12579k C15403w2 w2Var, @C12579k Painter painter) {
        Intrinsics.checkNotNullParameter(w2Var, "imageBitmap");
        Intrinsics.checkNotNullParameter(painter, "painter");
        this.f86786g = w2Var;
        this.f86787v = painter;
    }

    /* renamed from: l */
    public long mo42949l() {
        return this.f86787v.mo42949l();
    }

    /* renamed from: n */
    public void mo42951n(@C12579k C15187e eVar) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        C15211f3 f3Var = (C15211f3) C35318e.f86789a.mo52469b();
        if (f3Var == null) {
            f3Var = C15271n0.m66286a();
        }
        C15211f3 f3Var2 = f3Var;
        Intrinsics.checkNotNullExpressionValue(f3Var2, "paintPool.acquire() ?: Paint()");
        Matrix matrix = new Matrix();
        try {
            Shader b = C15178d4.m65580b(this.f86786g, C15268m4.f37596b.mo42908a(), 0, 4, (Object) null);
            C15127c4 a = C15110a2.m65150a(b);
            Paint q = f3Var2.mo42764q();
            q.setAntiAlias(true);
            q.setDither(true);
            q.setFilterBitmap(true);
            C15118b2 c = eVar.mo42683q5().mo42705c();
            c.mo42447x(C15106n.m65045m(eVar.mo42718b()), f3Var2);
            float f3 = 0.0f;
            RectF rectF = new RectF(0.0f, 0.0f, C15104m.m65023t(eVar.mo42718b()), C15104m.m65016m(eVar.mo42718b()));
            float width = (float) C15247k0.m66138b(this.f86786g).getWidth();
            float height = (float) C15247k0.m66138b(this.f86786g).getHeight();
            if (rectF.height() * width > rectF.width() * height) {
                f = rectF.height() / height;
                f2 = 0.0f;
                f3 = (rectF.width() - (width * f)) * 0.5f;
            } else {
                f = rectF.width() / width;
                f2 = (rectF.height() - (height * f)) * 0.5f;
            }
            matrix.setScale(f, f);
            matrix.postTranslate(f3 + 0.5f + rectF.left, f2 + 0.5f + rectF.top);
            b.setLocalMatrix(matrix);
            float f4 = (float) 2;
            C15187e.m65722x4(eVar, a, C11479u.m44444t(C15104m.m65023t(eVar.mo42718b()), C15104m.m65016m(eVar.mo42718b())) * mo105774o(), C15096g.m64898a(C15104m.m65023t(eVar.mo42718b()) / f4, C15104m.m65016m(eVar.mo42718b()) / f4), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
            c.mo42443q();
        } finally {
            f3Var2.mo42764q().reset();
            C35318e.f86789a.mo52468a(f3Var2);
        }
    }

    /* renamed from: o */
    public final float mo105774o() {
        return ((Number) this.f86788w.getValue()).floatValue();
    }

    /* renamed from: p */
    public final void mo105775p(float f) {
        this.f86788w.setValue(Float.valueOf(f));
    }
}
