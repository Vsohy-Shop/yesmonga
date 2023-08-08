package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.C1863g;

/* renamed from: androidx.cardview.widget.c */
public class C1858c implements C1861e {

    /* renamed from: a */
    public final RectF f5056a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    public class C1859a implements C1863g.C1864a {
        public C1859a() {
        }

        /* renamed from: a */
        public void mo6070a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C1858c.this.f5056a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C1858c.this.f5056a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C1858c.this.f5056a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C1858c.this.f5056a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C1858c.this.f5056a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    /* renamed from: a */
    public void mo6071a(C1860d dVar, float f) {
        mo6087q(dVar).mo6126p(f);
        mo6081k(dVar);
    }

    /* renamed from: b */
    public float mo6072b(C1860d dVar) {
        return mo6087q(dVar).mo6112g();
    }

    /* renamed from: c */
    public void mo6073c(C1860d dVar, float f) {
        mo6087q(dVar).mo6128r(f);
    }

    /* renamed from: d */
    public float mo6074d(C1860d dVar) {
        return mo6087q(dVar).mo6116i();
    }

    /* renamed from: e */
    public ColorStateList mo6075e(C1860d dVar) {
        return mo6087q(dVar).mo6111f();
    }

    /* renamed from: f */
    public float mo6076f(C1860d dVar) {
        return mo6087q(dVar).mo6118j();
    }

    /* renamed from: g */
    public void mo6077g(C1860d dVar) {
        mo6087q(dVar).mo6121m(dVar.mo6067f());
        mo6081k(dVar);
    }

    /* renamed from: h */
    public void mo6078h(C1860d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1863g p = mo6086p(context, colorStateList, f, f2, f3);
        p.mo6121m(dVar.mo6067f());
        dVar.mo6063b(p);
        mo6081k(dVar);
    }

    /* renamed from: i */
    public float mo6079i(C1860d dVar) {
        return mo6087q(dVar).mo6120l();
    }

    /* renamed from: j */
    public void mo6080j(C1860d dVar) {
    }

    /* renamed from: k */
    public void mo6081k(C1860d dVar) {
        Rect rect = new Rect();
        mo6087q(dVar).mo6115h(rect);
        dVar.mo6066e((int) Math.ceil((double) mo6082m(dVar)), (int) Math.ceil((double) mo6076f(dVar)));
        dVar.mo6062a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: l */
    public void mo6069l() {
        C1863g.f5071s = new C1859a();
    }

    /* renamed from: m */
    public float mo6082m(C1860d dVar) {
        return mo6087q(dVar).mo6119k();
    }

    /* renamed from: n */
    public void mo6083n(C1860d dVar, @C0363p0 ColorStateList colorStateList) {
        mo6087q(dVar).mo6123o(colorStateList);
    }

    /* renamed from: o */
    public void mo6084o(C1860d dVar, float f) {
        mo6087q(dVar).mo6127q(f);
        mo6081k(dVar);
    }

    /* renamed from: p */
    public final C1863g mo6086p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C1863g(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: q */
    public final C1863g mo6087q(C1860d dVar) {
        return (C1863g) dVar.mo6065d();
    }
}
