package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.C0376v0;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31538p;
import com.google.android.material.transition.platform.C31793l;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.j */
public class C31791j {

    /* renamed from: a */
    public final Path f77474a = new Path();

    /* renamed from: b */
    public final Path f77475b = new Path();

    /* renamed from: c */
    public final Path f77476c = new Path();

    /* renamed from: d */
    public final C31538p f77477d = C31538p.m127630k();

    /* renamed from: e */
    public C31534o f77478e;

    /* renamed from: a */
    public void mo92194a(Canvas canvas) {
        canvas.clipPath(this.f77474a);
    }

    /* renamed from: b */
    public void mo92195b(float f, C31534o oVar, C31534o oVar2, RectF rectF, RectF rectF2, RectF rectF3, C31793l.C31798e eVar) {
        C31534o o = C31823v.m129123o(oVar, oVar2, rectF, rectF3, eVar.mo92259d(), eVar.mo92258c(), f);
        this.f77478e = o;
        this.f77477d.mo90859d(o, 1.0f, rectF2, this.f77475b);
        this.f77477d.mo90859d(this.f77478e, 1.0f, rectF3, this.f77476c);
        this.f77474a.op(this.f77475b, this.f77476c, Path.Op.UNION);
    }

    /* renamed from: c */
    public C31534o mo92196c() {
        return this.f77478e;
    }

    /* renamed from: d */
    public Path mo92197d() {
        return this.f77474a;
    }
}
