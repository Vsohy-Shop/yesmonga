package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import com.google.android.material.color.C31266s;

/* renamed from: com.google.android.material.progressindicator.k */
public final class C31488k extends C31485h<C31496n> {

    /* renamed from: c */
    public float f76226c = 300.0f;

    /* renamed from: d */
    public float f76227d;

    /* renamed from: e */
    public float f76228e;

    public C31488k(@C0359n0 C31496n nVar) {
        super(nVar);
    }

    /* renamed from: a */
    public void mo90529a(@C0359n0 Canvas canvas, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f76226c = (float) clipBounds.width();
        float f2 = (float) ((C31496n) this.f76219a).f76155a;
        canvas.translate(((float) clipBounds.left) + (((float) clipBounds.width()) / 2.0f), ((float) clipBounds.top) + (((float) clipBounds.height()) / 2.0f) + Math.max(0.0f, ((float) (clipBounds.height() - ((C31496n) this.f76219a).f76155a)) / 2.0f));
        if (((C31496n) this.f76219a).f76255i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f76220b.mo90575n() && ((C31496n) this.f76219a).f76159e == 1) || (this.f76220b.mo90574m() && ((C31496n) this.f76219a).f76160f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f76220b.mo90575n() || this.f76220b.mo90574m()) {
            canvas.translate(0.0f, (((float) ((C31496n) this.f76219a).f76155a) * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f76226c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f76219a;
        this.f76227d = ((float) ((C31496n) s).f76155a) * f;
        this.f76228e = ((float) ((C31496n) s).f76156b) * f;
    }

    /* renamed from: b */
    public void mo90530b(@C0359n0 Canvas canvas, @C0359n0 Paint paint, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2, @C0354l int i) {
        if (f != f2) {
            float f3 = this.f76226c;
            float f4 = this.f76228e;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f5 = this.f76227d;
            RectF rectF = new RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
            float f6 = this.f76228e;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
    }

    /* renamed from: c */
    public void mo90531c(@C0359n0 Canvas canvas, @C0359n0 Paint paint) {
        int a = C31266s.m125950a(((C31496n) this.f76219a).f76158d, this.f76220b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f = this.f76226c;
        float f2 = this.f76227d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f76228e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    /* renamed from: d */
    public int mo90532d() {
        return ((C31496n) this.f76219a).f76155a;
    }

    /* renamed from: e */
    public int mo90533e() {
        return -1;
    }
}
