package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.internal.view.C17673a;
import com.google.android.material.circularreveal.C31220c;
import com.google.android.material.math.C31440a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.material.circularreveal.b */
public class C31217b {

    /* renamed from: k */
    public static final boolean f75114k = false;

    /* renamed from: l */
    public static final int f75115l = 0;

    /* renamed from: m */
    public static final int f75116m = 1;

    /* renamed from: n */
    public static final int f75117n = 2;

    /* renamed from: o */
    public static final int f75118o = 2;

    /* renamed from: a */
    public final C31218a f75119a;
    @C0359n0

    /* renamed from: b */
    public final View f75120b;
    @C0359n0

    /* renamed from: c */
    public final Path f75121c = new Path();
    @C0359n0

    /* renamed from: d */
    public final Paint f75122d = new Paint(7);
    @C0359n0

    /* renamed from: e */
    public final Paint f75123e;
    @C0363p0

    /* renamed from: f */
    public C31220c.C31225e f75124f;
    @C0363p0

    /* renamed from: g */
    public Drawable f75125g;

    /* renamed from: h */
    public Paint f75126h;

    /* renamed from: i */
    public boolean f75127i;

    /* renamed from: j */
    public boolean f75128j;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    public interface C31218a {
        /* renamed from: c */
        void mo89127c(Canvas canvas);

        /* renamed from: d */
        boolean mo89128d();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.circularreveal.b$b */
    public @interface C31219b {
    }

    public C31217b(C31218a aVar) {
        this.f75119a = aVar;
        View view = (View) aVar;
        this.f75120b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f75123e = paint;
        paint.setColor(0);
    }

    /* renamed from: a */
    public void mo89139a() {
        if (f75118o == 0) {
            this.f75127i = true;
            this.f75128j = false;
            this.f75120b.buildDrawingCache();
            Bitmap drawingCache = this.f75120b.getDrawingCache();
            if (!(drawingCache != null || this.f75120b.getWidth() == 0 || this.f75120b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f75120b.getWidth(), this.f75120b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f75120b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f75122d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f75127i = false;
            this.f75128j = true;
        }
    }

    /* renamed from: b */
    public void mo89140b() {
        if (f75118o == 0) {
            this.f75128j = false;
            this.f75120b.destroyDrawingCache();
            this.f75122d.setShader((Shader) null);
            this.f75120b.invalidate();
        }
    }

    /* renamed from: c */
    public void mo89141c(@C0359n0 Canvas canvas) {
        if (mo89154p()) {
            int i = f75118o;
            if (i == 0) {
                C31220c.C31225e eVar = this.f75124f;
                canvas.drawCircle(eVar.f75134a, eVar.f75135b, eVar.f75136c, this.f75122d);
                if (mo89156r()) {
                    C31220c.C31225e eVar2 = this.f75124f;
                    canvas.drawCircle(eVar2.f75134a, eVar2.f75135b, eVar2.f75136c, this.f75123e);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f75121c);
                this.f75119a.mo89127c(canvas);
                if (mo89156r()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f75120b.getWidth(), (float) this.f75120b.getHeight(), this.f75123e);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f75119a.mo89127c(canvas);
                if (mo89156r()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f75120b.getWidth(), (float) this.f75120b.getHeight(), this.f75123e);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.f75119a.mo89127c(canvas);
            if (mo89156r()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f75120b.getWidth(), (float) this.f75120b.getHeight(), this.f75123e);
            }
        }
        mo89144f(canvas);
    }

    /* renamed from: d */
    public final void mo89142d(@C0359n0 Canvas canvas, int i, float f) {
        this.f75126h.setColor(i);
        this.f75126h.setStrokeWidth(f);
        C31220c.C31225e eVar = this.f75124f;
        canvas.drawCircle(eVar.f75134a, eVar.f75135b, eVar.f75136c - (f / 2.0f), this.f75126h);
    }

    /* renamed from: e */
    public final void mo89143e(@C0359n0 Canvas canvas) {
        this.f75119a.mo89127c(canvas);
        if (mo89156r()) {
            C31220c.C31225e eVar = this.f75124f;
            canvas.drawCircle(eVar.f75134a, eVar.f75135b, eVar.f75136c, this.f75123e);
        }
        if (mo89154p()) {
            mo89142d(canvas, -16777216, 10.0f);
            mo89142d(canvas, C17673a.f46025c, 5.0f);
        }
        mo89144f(canvas);
    }

    /* renamed from: f */
    public final void mo89144f(@C0359n0 Canvas canvas) {
        if (mo89155q()) {
            Rect bounds = this.f75125g.getBounds();
            float width = this.f75124f.f75134a - (((float) bounds.width()) / 2.0f);
            float height = this.f75124f.f75135b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f75125g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    @C0363p0
    /* renamed from: g */
    public Drawable mo89145g() {
        return this.f75125g;
    }

    @C0354l
    /* renamed from: h */
    public int mo89146h() {
        return this.f75123e.getColor();
    }

    /* renamed from: i */
    public final float mo89147i(@C0359n0 C31220c.C31225e eVar) {
        return C31440a.m127027b(eVar.f75134a, eVar.f75135b, 0.0f, 0.0f, (float) this.f75120b.getWidth(), (float) this.f75120b.getHeight());
    }

    @C0363p0
    /* renamed from: j */
    public C31220c.C31225e mo89148j() {
        C31220c.C31225e eVar = this.f75124f;
        if (eVar == null) {
            return null;
        }
        C31220c.C31225e eVar2 = new C31220c.C31225e(eVar);
        if (eVar2.mo89167a()) {
            eVar2.f75136c = mo89147i(eVar2);
        }
        return eVar2;
    }

    /* renamed from: k */
    public final void mo89149k() {
        if (f75118o == 1) {
            this.f75121c.rewind();
            C31220c.C31225e eVar = this.f75124f;
            if (eVar != null) {
                this.f75121c.addCircle(eVar.f75134a, eVar.f75135b, eVar.f75136c, Path.Direction.CW);
            }
        }
        this.f75120b.invalidate();
    }

    /* renamed from: l */
    public boolean mo89150l() {
        return this.f75119a.mo89128d() && !mo89154p();
    }

    /* renamed from: m */
    public void mo89151m(@C0363p0 Drawable drawable) {
        this.f75125g = drawable;
        this.f75120b.invalidate();
    }

    /* renamed from: n */
    public void mo89152n(@C0354l int i) {
        this.f75123e.setColor(i);
        this.f75120b.invalidate();
    }

    /* renamed from: o */
    public void mo89153o(@C0363p0 C31220c.C31225e eVar) {
        if (eVar == null) {
            this.f75124f = null;
        } else {
            C31220c.C31225e eVar2 = this.f75124f;
            if (eVar2 == null) {
                this.f75124f = new C31220c.C31225e(eVar);
            } else {
                eVar2.mo89169c(eVar);
            }
            if (C31440a.m127030e(eVar.f75136c, mo89147i(eVar), 1.0E-4f)) {
                this.f75124f.f75136c = Float.MAX_VALUE;
            }
        }
        mo89149k();
    }

    /* renamed from: p */
    public final boolean mo89154p() {
        boolean z;
        C31220c.C31225e eVar = this.f75124f;
        if (eVar == null || eVar.mo89167a()) {
            z = true;
        } else {
            z = false;
        }
        if (f75118o != 0) {
            return !z;
        }
        if (z || !this.f75128j) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean mo89155q() {
        return (this.f75127i || this.f75125g == null || this.f75124f == null) ? false : true;
    }

    /* renamed from: r */
    public final boolean mo89156r() {
        return !this.f75127i && Color.alpha(this.f75123e.getColor()) != 0;
    }
}
