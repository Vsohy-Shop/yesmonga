package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.C16656b;
import androidx.core.internal.view.C17673a;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.compose.h0 */
public class C16599h0 {

    /* renamed from: u */
    public static final int f41249u = 0;

    /* renamed from: v */
    public static final int f41250v = 1;

    /* renamed from: w */
    public static final int f41251w = 2;

    /* renamed from: x */
    public static final int f41252x = 50;

    /* renamed from: y */
    public static final int f41253y = 16;

    /* renamed from: a */
    public float[] f41254a;

    /* renamed from: b */
    public int[] f41255b;

    /* renamed from: c */
    public float[] f41256c;

    /* renamed from: d */
    public Path f41257d;

    /* renamed from: e */
    public Paint f41258e;

    /* renamed from: f */
    public Paint f41259f;

    /* renamed from: g */
    public Paint f41260g;

    /* renamed from: h */
    public Paint f41261h;

    /* renamed from: i */
    public Paint f41262i;

    /* renamed from: j */
    public float[] f41263j;

    /* renamed from: k */
    public final int f41264k = -21965;

    /* renamed from: l */
    public final int f41265l = -2067046;

    /* renamed from: m */
    public final int f41266m = -13391360;

    /* renamed from: n */
    public final int f41267n = 1996488704;

    /* renamed from: o */
    public final int f41268o = 10;

    /* renamed from: p */
    public DashPathEffect f41269p;

    /* renamed from: q */
    public int f41270q;

    /* renamed from: r */
    public Rect f41271r = new Rect();

    /* renamed from: s */
    public boolean f41272s = false;

    /* renamed from: t */
    public int f41273t = 1;

    public C16599h0(float f) {
        Paint paint = new Paint();
        this.f41258e = paint;
        paint.setAntiAlias(true);
        this.f41258e.setColor(-21965);
        this.f41258e.setStrokeWidth(2.0f);
        this.f41258e.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f41259f = paint2;
        paint2.setAntiAlias(true);
        this.f41259f.setColor(-2067046);
        this.f41259f.setStrokeWidth(2.0f);
        this.f41259f.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.f41260g = paint3;
        paint3.setAntiAlias(true);
        this.f41260g.setColor(-13391360);
        this.f41260g.setStrokeWidth(2.0f);
        this.f41260g.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.f41261h = paint4;
        paint4.setAntiAlias(true);
        this.f41261h.setColor(-13391360);
        this.f41261h.setTextSize(f);
        this.f41263j = new float[8];
        Paint paint5 = new Paint();
        this.f41262i = paint5;
        paint5.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.f41269p = dashPathEffect;
        this.f41260g.setPathEffect(dashPathEffect);
        this.f41256c = new float[100];
        this.f41255b = new int[50];
        if (this.f41272s) {
            this.f41258e.setStrokeWidth(8.0f);
            this.f41262i.setStrokeWidth(8.0f);
            this.f41259f.setStrokeWidth(8.0f);
            this.f41273t = 4;
        }
    }

    /* renamed from: a */
    public void mo48518a(Canvas canvas, C16656b bVar, int i, int i2, int i3, int i4) {
        int v = bVar.mo48845v();
        if (i2 > 0 && v == 0) {
            v = 1;
        }
        if (v != 0) {
            this.f41270q = bVar.mo48832j(this.f41256c, this.f41255b, (int[]) null);
            if (v >= 1) {
                int i5 = i / 16;
                float[] fArr = this.f41254a;
                if (fArr == null || fArr.length != i5 * 2) {
                    this.f41254a = new float[(i5 * 2)];
                    this.f41257d = new Path();
                }
                int i6 = this.f41273t;
                canvas.translate((float) i6, (float) i6);
                this.f41258e.setColor(1996488704);
                this.f41262i.setColor(1996488704);
                this.f41259f.setColor(1996488704);
                this.f41260g.setColor(1996488704);
                bVar.mo48833k(this.f41254a, i5);
                Canvas canvas2 = canvas;
                int i7 = v;
                C16656b bVar2 = bVar;
                int i8 = i3;
                int i9 = i4;
                mo48520c(canvas2, i7, this.f41270q, bVar2, i8, i9);
                this.f41258e.setColor(-21965);
                this.f41259f.setColor(-2067046);
                this.f41262i.setColor(-2067046);
                this.f41260g.setColor(-13391360);
                int i10 = this.f41273t;
                canvas.translate((float) (-i10), (float) (-i10));
                mo48520c(canvas2, i7, this.f41270q, bVar2, i8, i9);
                if (v == 5) {
                    mo48528k(canvas, bVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo48519b(Canvas canvas, HashMap<String, C16656b> hashMap, int i, int i2, int i3, int i4) {
        if (hashMap != null && hashMap.size() != 0) {
            canvas.save();
            for (C16656b a : hashMap.values()) {
                mo48518a(canvas, a, i, i2, i3, i4);
            }
            canvas.restore();
        }
    }

    /* renamed from: c */
    public void mo48520c(Canvas canvas, int i, int i2, C16656b bVar, int i3, int i4) {
        if (i == 4) {
            mo48522e(canvas);
        }
        if (i == 2) {
            mo48525h(canvas);
        }
        if (i == 3) {
            mo48523f(canvas);
        }
        mo48521d(canvas);
        mo48529l(canvas, i, i2, bVar, i3, i4);
    }

    /* renamed from: d */
    public final void mo48521d(Canvas canvas) {
        canvas.drawLines(this.f41254a, this.f41258e);
    }

    /* renamed from: e */
    public final void mo48522e(Canvas canvas) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < this.f41270q; i++) {
            int i2 = this.f41255b[i];
            if (i2 == 1) {
                z = true;
            }
            if (i2 == 0) {
                z2 = true;
            }
        }
        if (z) {
            mo48525h(canvas);
        }
        if (z2) {
            mo48523f(canvas);
        }
    }

    /* renamed from: f */
    public final void mo48523f(Canvas canvas) {
        float[] fArr = this.f41254a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f41260g);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f41260g);
    }

    /* renamed from: g */
    public final void mo48524g(Canvas canvas, float f, float f2) {
        Canvas canvas2 = canvas;
        float[] fArr = this.f41254a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float min = Math.min(f3, f5);
        float max = Math.max(f4, f6);
        float min2 = f - Math.min(f3, f5);
        float max2 = Math.max(f4, f6) - f2;
        String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
        mo48531n(str, this.f41261h);
        canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.f41271r.width() / 2))) + min, f2 - 20.0f, this.f41261h);
        canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f41260g);
        String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
        mo48531n(str2, this.f41261h);
        canvas2.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f41271r.height() / 2))), this.f41261h);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f41260g);
    }

    /* renamed from: h */
    public final void mo48525h(Canvas canvas) {
        float[] fArr = this.f41254a;
        canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f41260g);
    }

    /* renamed from: i */
    public final void mo48526i(Canvas canvas, float f, float f2) {
        float[] fArr = this.f41254a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
        float f10 = f3 + (f7 * f9);
        float f11 = f4 + (f9 * f8);
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
        String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
        mo48531n(str, this.f41261h);
        canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f41271r.width() / 2)), -20.0f, this.f41261h);
        canvas.drawLine(f, f2, f10, f11, this.f41260g);
    }

    /* renamed from: j */
    public final void mo48527j(Canvas canvas, float f, float f2, int i, int i2, int i3, int i4) {
        Canvas canvas2 = canvas;
        String str = "" + (((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (i3 - i)))) + 0.5d))) / 100.0f);
        mo48531n(str, this.f41261h);
        canvas2.drawText(str, ((f / 2.0f) - ((float) (this.f41271r.width() / 2))) + 0.0f, f2 - 20.0f, this.f41261h);
        canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f41260g);
        String str2 = "" + (((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (i4 - i2)))) + 0.5d))) / 100.0f);
        mo48531n(str2, this.f41261h);
        canvas2.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.f41271r.height() / 2))), this.f41261h);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f41260g);
    }

    /* renamed from: k */
    public final void mo48528k(Canvas canvas, C16656b bVar) {
        this.f41257d.reset();
        for (int i = 0; i <= 50; i++) {
            bVar.mo48834l(((float) i) / ((float) 50), this.f41263j, 0);
            Path path = this.f41257d;
            float[] fArr = this.f41263j;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.f41257d;
            float[] fArr2 = this.f41263j;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.f41257d;
            float[] fArr3 = this.f41263j;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.f41257d;
            float[] fArr4 = this.f41263j;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.f41257d.close();
        }
        this.f41258e.setColor(1140850688);
        canvas.translate(2.0f, 2.0f);
        canvas.drawPath(this.f41257d, this.f41258e);
        canvas.translate(-2.0f, -2.0f);
        this.f41258e.setColor(C17673a.f46025c);
        canvas.drawPath(this.f41257d, this.f41258e);
    }

    /* renamed from: l */
    public final void mo48529l(Canvas canvas, int i, int i2, C16656b bVar, int i3, int i4) {
        int i5;
        int i6;
        float f;
        float f2;
        int i7;
        Canvas canvas2 = canvas;
        int i8 = i;
        if (bVar.mo48806O() != null) {
            i6 = bVar.mo48806O().mo48892D();
            i5 = bVar.mo48806O().mo48922k();
        } else {
            i6 = 0;
            i5 = 0;
        }
        for (int i9 = 1; i9 < i2 - 1; i9++) {
            if (i8 != 4 || this.f41255b[i9 - 1] != 0) {
                float[] fArr = this.f41256c;
                int i10 = i9 * 2;
                float f3 = fArr[i10];
                float f4 = fArr[i10 + 1];
                this.f41257d.reset();
                this.f41257d.moveTo(f3, f4 + 10.0f);
                this.f41257d.lineTo(f3 + 10.0f, f4);
                this.f41257d.lineTo(f3, f4 - 10.0f);
                this.f41257d.lineTo(f3 - 10.0f, f4);
                this.f41257d.close();
                int i11 = i9 - 1;
                bVar.mo48793B(i11);
                if (i8 == 4) {
                    int i12 = this.f41255b[i11];
                    if (i12 == 1) {
                        mo48526i(canvas2, f3 - 0.0f, f4 - 0.0f);
                    } else if (i12 == 0) {
                        mo48524g(canvas2, f3 - 0.0f, f4 - 0.0f);
                    } else if (i12 == 2) {
                        f2 = f4;
                        f = f3;
                        i7 = 2;
                        mo48527j(canvas, f3 - 0.0f, f4 - 0.0f, i6, i5, i3, i4);
                        canvas2.drawPath(this.f41257d, this.f41262i);
                    }
                    f2 = f4;
                    f = f3;
                    i7 = 2;
                    canvas2.drawPath(this.f41257d, this.f41262i);
                } else {
                    f2 = f4;
                    f = f3;
                    i7 = 2;
                }
                if (i8 == i7) {
                    mo48526i(canvas2, f - 0.0f, f2 - 0.0f);
                }
                if (i8 == 3) {
                    mo48524g(canvas2, f - 0.0f, f2 - 0.0f);
                }
                if (i8 == 6) {
                    mo48527j(canvas, f - 0.0f, f2 - 0.0f, i6, i5, i3, i4);
                }
                canvas2.drawPath(this.f41257d, this.f41262i);
            }
        }
        float[] fArr2 = this.f41254a;
        if (fArr2.length > 1) {
            canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f41259f);
            float[] fArr3 = this.f41254a;
            canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f41259f);
        }
    }

    /* renamed from: m */
    public final void mo48530m(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.drawRect(f, f2, f3, f4, this.f41260g);
        canvas.drawLine(f, f2, f3, f4, this.f41260g);
    }

    /* renamed from: n */
    public void mo48531n(String str, Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.f41271r);
    }
}
