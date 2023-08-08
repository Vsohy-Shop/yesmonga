package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.C0354l;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.core.graphics.drawable.C17549d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.appcompat.graphics.drawable.d */
public class C0522d extends Drawable {

    /* renamed from: m */
    public static final int f1369m = 0;

    /* renamed from: n */
    public static final int f1370n = 1;

    /* renamed from: o */
    public static final int f1371o = 2;

    /* renamed from: p */
    public static final int f1372p = 3;

    /* renamed from: q */
    public static final float f1373q = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    public final Paint f1374a;

    /* renamed from: b */
    public float f1375b;

    /* renamed from: c */
    public float f1376c;

    /* renamed from: d */
    public float f1377d;

    /* renamed from: e */
    public float f1378e;

    /* renamed from: f */
    public boolean f1379f;

    /* renamed from: g */
    public final Path f1380g = new Path();

    /* renamed from: h */
    public final int f1381h;

    /* renamed from: i */
    public boolean f1382i = false;

    /* renamed from: j */
    public float f1383j;

    /* renamed from: k */
    public float f1384k;

    /* renamed from: l */
    public int f1385l = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.graphics.drawable.d$a */
    public @interface C0523a {
    }

    public C0522d(Context context) {
        Paint paint = new Paint();
        this.f1374a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C0387a.C0400m.DrawerArrowToggle, C0387a.C0389b.drawerArrowStyle, C0387a.C0399l.Base_Widget_AppCompat_DrawerArrowToggle);
        mo1725p(obtainStyledAttributes.getColor(C0387a.C0400m.DrawerArrowToggle_color, 0));
        mo1724o(obtainStyledAttributes.getDimension(C0387a.C0400m.DrawerArrowToggle_thickness, 0.0f));
        mo1728s(obtainStyledAttributes.getBoolean(C0387a.C0400m.DrawerArrowToggle_spinBars, true));
        mo1727r((float) Math.round(obtainStyledAttributes.getDimension(C0387a.C0400m.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f1381h = obtainStyledAttributes.getDimensionPixelSize(C0387a.C0400m.DrawerArrowToggle_drawableSize, 0);
        this.f1376c = (float) Math.round(obtainStyledAttributes.getDimension(C0387a.C0400m.DrawerArrowToggle_barLength, 0.0f));
        this.f1375b = (float) Math.round(obtainStyledAttributes.getDimension(C0387a.C0400m.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f1377d = obtainStyledAttributes.getDimension(C0387a.C0400m.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    public static float m2435k(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public float mo1707a() {
        return this.f1375b;
    }

    /* renamed from: b */
    public float mo1708b() {
        return this.f1377d;
    }

    /* renamed from: c */
    public float mo1709c() {
        return this.f1376c;
    }

    /* renamed from: d */
    public float mo1710d() {
        return this.f1374a.getStrokeWidth();
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.f1385l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? C17549d.m80444f(this) == 0 : C17549d.m80444f(this) == 1))) {
            z = true;
        }
        float f3 = this.f1375b;
        float k = m2435k(this.f1376c, (float) Math.sqrt((double) (f3 * f3 * 2.0f)), this.f1383j);
        float k2 = m2435k(this.f1376c, this.f1377d, this.f1383j);
        float round = (float) Math.round(m2435k(0.0f, this.f1384k, this.f1383j));
        float k3 = m2435k(0.0f, f1373q, this.f1383j);
        if (z) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        float k4 = m2435k(f, f2, this.f1383j);
        double d = (double) k;
        float f4 = k4;
        double d2 = (double) k3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f1380g.rewind();
        float k5 = m2435k(this.f1378e + this.f1374a.getStrokeWidth(), -this.f1384k, this.f1383j);
        float f5 = (-k2) / 2.0f;
        this.f1380g.moveTo(f5 + round, 0.0f);
        this.f1380g.rLineTo(k2 - (round * 2.0f), 0.0f);
        this.f1380g.moveTo(f5, k5);
        this.f1380g.rLineTo(round2, round3);
        this.f1380g.moveTo(f5, -k5);
        this.f1380g.rLineTo(round2, -round3);
        this.f1380g.close();
        canvas.save();
        float strokeWidth = this.f1374a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f6 = this.f1378e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f6))) / 4) * 2)) + (strokeWidth * 1.5f) + f6);
        if (this.f1379f) {
            if (this.f1382i ^ z2) {
                i = -1;
            } else {
                i = 1;
            }
            canvas2.rotate(f4 * ((float) i));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f1380g, this.f1374a);
        canvas.restore();
    }

    @C0354l
    /* renamed from: e */
    public int mo1712e() {
        return this.f1374a.getColor();
    }

    /* renamed from: f */
    public int mo1713f() {
        return this.f1385l;
    }

    /* renamed from: g */
    public float mo1714g() {
        return this.f1378e;
    }

    public int getIntrinsicHeight() {
        return this.f1381h;
    }

    public int getIntrinsicWidth() {
        return this.f1381h;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final Paint mo1718h() {
        return this.f1374a;
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: i */
    public float mo1719i() {
        return this.f1383j;
    }

    /* renamed from: j */
    public boolean mo1720j() {
        return this.f1379f;
    }

    /* renamed from: l */
    public void mo1721l(float f) {
        if (this.f1375b != f) {
            this.f1375b = f;
            invalidateSelf();
        }
    }

    /* renamed from: m */
    public void mo1722m(float f) {
        if (this.f1377d != f) {
            this.f1377d = f;
            invalidateSelf();
        }
    }

    /* renamed from: n */
    public void mo1723n(float f) {
        if (this.f1376c != f) {
            this.f1376c = f;
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void mo1724o(float f) {
        if (this.f1374a.getStrokeWidth() != f) {
            this.f1374a.setStrokeWidth(f);
            this.f1384k = (float) (((double) (f / 2.0f)) * Math.cos((double) f1373q));
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public void mo1725p(@C0354l int i) {
        if (i != this.f1374a.getColor()) {
            this.f1374a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void mo1726q(int i) {
        if (i != this.f1385l) {
            this.f1385l = i;
            invalidateSelf();
        }
    }

    /* renamed from: r */
    public void mo1727r(float f) {
        if (f != this.f1378e) {
            this.f1378e = f;
            invalidateSelf();
        }
    }

    /* renamed from: s */
    public void mo1728s(boolean z) {
        if (this.f1379f != z) {
            this.f1379f = z;
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        if (i != this.f1374a.getAlpha()) {
            this.f1374a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1374a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        if (this.f1383j != f) {
            this.f1383j = f;
            invalidateSelf();
        }
    }

    /* renamed from: t */
    public void mo1732t(boolean z) {
        if (this.f1382i != z) {
            this.f1382i = z;
            invalidateSelf();
        }
    }
}
