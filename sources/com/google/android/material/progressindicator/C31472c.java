package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import com.google.android.material.color.C31266s;

/* renamed from: com.google.android.material.progressindicator.c */
public final class C31472c extends C31485h<C31478e> {

    /* renamed from: c */
    public int f76161c = 1;

    /* renamed from: d */
    public float f76162d;

    /* renamed from: e */
    public float f76163e;

    /* renamed from: f */
    public float f76164f;

    public C31472c(@C0359n0 C31478e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public void mo90529a(@C0359n0 Canvas canvas, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        int i;
        S s = this.f76219a;
        float f2 = (((float) ((C31478e) s).f76189g) / 2.0f) + ((float) ((C31478e) s).f76190h);
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f76219a;
        if (((C31478e) s2).f76191i == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f76161c = i;
        this.f76162d = ((float) ((C31478e) s2).f76155a) * f;
        this.f76163e = ((float) ((C31478e) s2).f76156b) * f;
        this.f76164f = ((float) (((C31478e) s2).f76189g - ((C31478e) s2).f76155a)) / 2.0f;
        if ((this.f76220b.mo90575n() && ((C31478e) this.f76219a).f76159e == 2) || (this.f76220b.mo90574m() && ((C31478e) this.f76219a).f76160f == 1)) {
            this.f76164f += ((1.0f - f) * ((float) ((C31478e) this.f76219a).f76155a)) / 2.0f;
        } else if ((this.f76220b.mo90575n() && ((C31478e) this.f76219a).f76159e == 1) || (this.f76220b.mo90574m() && ((C31478e) this.f76219a).f76160f == 2)) {
            this.f76164f -= ((1.0f - f) * ((float) ((C31478e) this.f76219a).f76155a)) / 2.0f;
        }
    }

    /* renamed from: b */
    public void mo90530b(@C0359n0 Canvas canvas, @C0359n0 Paint paint, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2, @C0354l int i) {
        float f3;
        Paint paint2 = paint;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f76162d);
            int i2 = this.f76161c;
            float f4 = f * 360.0f * ((float) i2);
            if (f2 >= f) {
                f3 = f2 - f;
            } else {
                f3 = (1.0f + f2) - f;
            }
            float f5 = f3 * 360.0f * ((float) i2);
            float f6 = this.f76164f;
            canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
            if (this.f76163e > 0.0f && Math.abs(f5) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                mo90534h(canvas2, paint3, this.f76162d, this.f76163e, f4);
                mo90534h(canvas2, paint3, this.f76162d, this.f76163e, f4 + f5);
            }
        }
    }

    /* renamed from: c */
    public void mo90531c(@C0359n0 Canvas canvas, @C0359n0 Paint paint) {
        int a = C31266s.m125950a(((C31478e) this.f76219a).f76158d, this.f76220b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f76162d);
        float f = this.f76164f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    /* renamed from: d */
    public int mo90532d() {
        return mo90535i();
    }

    /* renamed from: e */
    public int mo90533e() {
        return mo90535i();
    }

    /* renamed from: h */
    public final void mo90534h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f76164f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    public final int mo90535i() {
        S s = this.f76219a;
        return ((C31478e) s).f76189g + (((C31478e) s).f76190h * 2);
    }
}
