package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C17483q;
import androidx.core.graphics.C17634r0;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.vectordrawable.graphics.drawable.g */
public class C20727g implements Interpolator {

    /* renamed from: c */
    public static final float f53479c = 0.002f;

    /* renamed from: d */
    public static final int f53480d = 3000;

    /* renamed from: e */
    public static final double f53481e = 1.0E-5d;

    /* renamed from: a */
    public float[] f53482a;

    /* renamed from: b */
    public float[] f53483b;

    public C20727g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: a */
    public final void mo62016a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        mo62017b(path);
    }

    /* renamed from: b */
    public final void mo62017b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f53482a = new float[min];
            this.f53483b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f53482a[i2] = fArr[0];
                this.f53483b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f53482a[0])) <= 1.0E-5d && ((double) Math.abs(this.f53483b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f53482a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f53483b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f53482a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f53482a[0]);
            sb.append(",");
            sb.append(this.f53483b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f53482a[i6]);
            sb.append(",");
            sb.append(this.f53483b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    public final void mo62018c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        mo62017b(path);
    }

    /* renamed from: d */
    public final void mo62019d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C17483q.m80242r(xmlPullParser, "pathData")) {
            String m = C17483q.m80237m(typedArray, xmlPullParser, "pathData", 4);
            Path e = C17634r0.m80739e(m);
            if (e != null) {
                mo62017b(e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m);
        } else if (!C17483q.m80242r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C17483q.m80242r(xmlPullParser, "controlY1")) {
            float j = C17483q.m80234j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float j2 = C17483q.m80234j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean r = C17483q.m80242r(xmlPullParser, "controlX2");
            if (r != C17483q.m80242r(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!r) {
                mo62018c(j, j2);
            } else {
                mo62016a(j, j2, C17483q.m80234j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C17483q.m80234j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f53482a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f53482a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f53482a;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f53483b[i];
        }
        float[] fArr2 = this.f53483b;
        float f5 = fArr2[i];
        return f5 + (((f - f3) / f4) * (fArr2[length] - f5));
    }

    public C20727g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C20714a.f53430r0);
        mo62019d(s, xmlPullParser);
        s.recycle();
    }
}
