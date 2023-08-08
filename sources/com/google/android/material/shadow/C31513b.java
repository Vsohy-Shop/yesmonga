package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17586h0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.shadow.b */
public class C31513b {

    /* renamed from: i */
    public static final int f76330i = 68;

    /* renamed from: j */
    public static final int f76331j = 20;

    /* renamed from: k */
    public static final int f76332k = 0;

    /* renamed from: l */
    public static final int[] f76333l = new int[3];

    /* renamed from: m */
    public static final float[] f76334m = {0.0f, 0.5f, 1.0f};

    /* renamed from: n */
    public static final int[] f76335n = new int[4];

    /* renamed from: o */
    public static final float[] f76336o = {0.0f, 0.0f, 0.5f, 1.0f};
    @C0359n0

    /* renamed from: a */
    public final Paint f76337a;
    @C0359n0

    /* renamed from: b */
    public final Paint f76338b;
    @C0359n0

    /* renamed from: c */
    public final Paint f76339c;

    /* renamed from: d */
    public int f76340d;

    /* renamed from: e */
    public int f76341e;

    /* renamed from: f */
    public int f76342f;

    /* renamed from: g */
    public final Path f76343g;

    /* renamed from: h */
    public Paint f76344h;

    public C31513b() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo90689a(@C0359n0 Canvas canvas, @C0363p0 Matrix matrix, @C0359n0 RectF rectF, int i, float f, float f2) {
        boolean z;
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        if (f3 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f76343g;
        if (z) {
            int[] iArr = f76335n;
            iArr[0] = 0;
            iArr[1] = this.f76342f;
            iArr[2] = this.f76341e;
            iArr[3] = this.f76340d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f76335n;
            iArr2[0] = 0;
            iArr2[1] = this.f76340d;
            iArr2[2] = this.f76341e;
            iArr2[3] = this.f76342f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f6 = 1.0f - (((float) i2) / width);
            float[] fArr = f76336o;
            fArr[1] = f6;
            fArr[2] = ((1.0f - f6) / 2.0f) + f6;
            this.f76338b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f76335n, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f76344h);
            }
            canvas.drawArc(rectF, f, f2, true, this.f76338b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo90690b(@C0359n0 Canvas canvas, @C0363p0 Matrix matrix, @C0359n0 RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f76333l;
        iArr[0] = this.f76342f;
        iArr[1] = this.f76341e;
        iArr[2] = this.f76340d;
        Paint paint = this.f76339c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f76334m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f76339c);
        canvas.restore();
    }

    @C0359n0
    /* renamed from: c */
    public Paint mo90691c() {
        return this.f76337a;
    }

    /* renamed from: d */
    public void mo90692d(int i) {
        this.f76340d = C17586h0.m80563B(i, 68);
        this.f76341e = C17586h0.m80563B(i, 20);
        this.f76342f = C17586h0.m80563B(i, 0);
        this.f76337a.setColor(this.f76340d);
    }

    public C31513b(int i) {
        this.f76343g = new Path();
        this.f76344h = new Paint();
        this.f76337a = new Paint();
        mo90692d(i);
        this.f76344h.setColor(0);
        Paint paint = new Paint(4);
        this.f76338b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f76339c = new Paint(paint);
    }
}
