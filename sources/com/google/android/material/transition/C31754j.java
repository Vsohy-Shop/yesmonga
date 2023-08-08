package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31538p;
import com.google.android.material.transition.C31756l;

/* renamed from: com.google.android.material.transition.j */
public class C31754j {

    /* renamed from: a */
    public final Path f77319a = new Path();

    /* renamed from: b */
    public final Path f77320b = new Path();

    /* renamed from: c */
    public final Path f77321c = new Path();

    /* renamed from: d */
    public final C31538p f77322d = C31538p.m127630k();

    /* renamed from: e */
    public C31534o f77323e;

    /* renamed from: a */
    public void mo92093a(Canvas canvas) {
        canvas.clipPath(this.f77319a);
    }

    /* renamed from: b */
    public void mo92094b(float f, C31534o oVar, C31534o oVar2, RectF rectF, RectF rectF2, RectF rectF3, C31756l.C31761e eVar) {
        C31534o o = C31837u.m129199o(oVar, oVar2, rectF, rectF3, eVar.mo92150d(), eVar.mo92149c(), f);
        this.f77323e = o;
        this.f77322d.mo90859d(o, 1.0f, rectF2, this.f77320b);
        this.f77322d.mo90859d(this.f77323e, 1.0f, rectF3, this.f77321c);
        this.f77319a.op(this.f77320b, this.f77321c, Path.Op.UNION);
    }

    /* renamed from: c */
    public C31534o mo92095c() {
        return this.f77323e;
    }

    /* renamed from: d */
    public Path mo92096d() {
        return this.f77319a;
    }
}
