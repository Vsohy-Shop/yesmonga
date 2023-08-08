package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.core.graphics.drawable.p */
public abstract class C17564p extends Drawable {

    /* renamed from: n */
    public static final int f45906n = 3;

    /* renamed from: a */
    public final Bitmap f45907a;

    /* renamed from: b */
    public int f45908b = 160;

    /* renamed from: c */
    public int f45909c = 119;

    /* renamed from: d */
    public final Paint f45910d = new Paint(3);

    /* renamed from: e */
    public final BitmapShader f45911e;

    /* renamed from: f */
    public final Matrix f45912f = new Matrix();

    /* renamed from: g */
    public float f45913g;

    /* renamed from: h */
    public final Rect f45914h = new Rect();

    /* renamed from: i */
    public final RectF f45915i = new RectF();

    /* renamed from: j */
    public boolean f45916j = true;

    /* renamed from: k */
    public boolean f45917k;

    /* renamed from: l */
    public int f45918l;

    /* renamed from: m */
    public int f45919m;

    public C17564p(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f45908b = resources.getDisplayMetrics().densityDpi;
        }
        this.f45907a = bitmap;
        if (bitmap != null) {
            mo51953a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f45911e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f45919m = -1;
        this.f45918l = -1;
        this.f45911e = null;
    }

    /* renamed from: j */
    public static boolean m80494j(float f) {
        return f > 0.05f;
    }

    /* renamed from: a */
    public final void mo51953a() {
        this.f45918l = this.f45907a.getScaledWidth(this.f45908b);
        this.f45919m = this.f45907a.getScaledHeight(this.f45908b);
    }

    @C0363p0
    /* renamed from: b */
    public final Bitmap mo51954b() {
        return this.f45907a;
    }

    /* renamed from: c */
    public float mo51955c() {
        return this.f45913g;
    }

    /* renamed from: d */
    public int mo51956d() {
        return this.f45909c;
    }

    public void draw(@C0359n0 Canvas canvas) {
        Bitmap bitmap = this.f45907a;
        if (bitmap != null) {
            mo51979t();
            if (this.f45910d.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f45914h, this.f45910d);
                return;
            }
            RectF rectF = this.f45915i;
            float f = this.f45913g;
            canvas.drawRoundRect(rectF, f, f, this.f45910d);
        }
    }

    @C0359n0
    /* renamed from: e */
    public final Paint mo51958e() {
        return this.f45910d;
    }

    /* renamed from: f */
    public void mo51949f(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public boolean mo51959g() {
        return this.f45910d.isAntiAlias();
    }

    public int getAlpha() {
        return this.f45910d.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f45910d.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f45919m;
    }

    public int getIntrinsicWidth() {
        return this.f45918l;
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.f45909c != 119 || this.f45917k || (bitmap = this.f45907a) == null || bitmap.hasAlpha() || this.f45910d.getAlpha() < 255 || m80494j(this.f45913g)) {
            return -3;
        }
        return -1;
    }

    /* renamed from: h */
    public boolean mo51951h() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public boolean mo51965i() {
        return this.f45917k;
    }

    /* renamed from: k */
    public void mo51966k(boolean z) {
        this.f45910d.setAntiAlias(z);
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo51967l(boolean z) {
        this.f45917k = z;
        this.f45916j = true;
        if (z) {
            mo51974s();
            this.f45910d.setShader(this.f45911e);
            invalidateSelf();
            return;
        }
        mo51968m(0.0f);
    }

    /* renamed from: m */
    public void mo51968m(float f) {
        if (this.f45913g != f) {
            this.f45917k = false;
            if (m80494j(f)) {
                this.f45910d.setShader(this.f45911e);
            } else {
                this.f45910d.setShader((Shader) null);
            }
            this.f45913g = f;
            invalidateSelf();
        }
    }

    /* renamed from: n */
    public void mo51969n(int i) {
        if (this.f45909c != i) {
            this.f45909c = i;
            this.f45916j = true;
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void mo51952o(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void onBoundsChange(@C0359n0 Rect rect) {
        super.onBoundsChange(rect);
        if (this.f45917k) {
            mo51974s();
        }
        this.f45916j = true;
    }

    /* renamed from: p */
    public void mo51971p(int i) {
        if (this.f45908b != i) {
            if (i == 0) {
                i = 160;
            }
            this.f45908b = i;
            if (this.f45907a != null) {
                mo51953a();
            }
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void mo51972q(@C0359n0 Canvas canvas) {
        mo51971p(canvas.getDensity());
    }

    /* renamed from: r */
    public void mo51973r(@C0359n0 DisplayMetrics displayMetrics) {
        mo51971p(displayMetrics.densityDpi);
    }

    /* renamed from: s */
    public final void mo51974s() {
        this.f45913g = (float) (Math.min(this.f45919m, this.f45918l) / 2);
    }

    public void setAlpha(int i) {
        if (i != this.f45910d.getAlpha()) {
            this.f45910d.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f45910d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f45910d.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f45910d.setFilterBitmap(z);
        invalidateSelf();
    }

    /* renamed from: t */
    public void mo51979t() {
        if (this.f45916j) {
            if (this.f45917k) {
                int min = Math.min(this.f45918l, this.f45919m);
                mo51949f(this.f45909c, min, min, getBounds(), this.f45914h);
                int min2 = Math.min(this.f45914h.width(), this.f45914h.height());
                this.f45914h.inset(Math.max(0, (this.f45914h.width() - min2) / 2), Math.max(0, (this.f45914h.height() - min2) / 2));
                this.f45913g = ((float) min2) * 0.5f;
            } else {
                mo51949f(this.f45909c, this.f45918l, this.f45919m, getBounds(), this.f45914h);
            }
            this.f45915i.set(this.f45914h);
            if (this.f45911e != null) {
                Matrix matrix = this.f45912f;
                RectF rectF = this.f45915i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f45912f.preScale(this.f45915i.width() / ((float) this.f45907a.getWidth()), this.f45915i.height() / ((float) this.f45907a.getHeight()));
                this.f45911e.setLocalMatrix(this.f45912f);
                this.f45910d.setShader(this.f45911e);
            }
            this.f45916j = false;
        }
    }
}
