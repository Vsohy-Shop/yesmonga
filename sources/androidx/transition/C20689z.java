package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.core.content.res.C17483q;
import androidx.core.graphics.C17634r0;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.z */
public class C20689z extends C20684x {

    /* renamed from: a */
    public Path f53359a;

    /* renamed from: b */
    public final Path f53360b;

    /* renamed from: c */
    public final Matrix f53361c;

    public C20689z() {
        Path path = new Path();
        this.f53360b = path;
        this.f53361c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f53359a = path;
    }

    /* renamed from: b */
    public static float m96154b(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    @C0359n0
    /* renamed from: a */
    public Path mo61606a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = m96154b(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f53361c.setScale(b, b);
        this.f53361c.postRotate((float) Math.toDegrees(atan2));
        this.f53361c.postTranslate(f, f2);
        Path path = new Path();
        this.f53360b.transform(this.f53361c, path);
        return path;
    }

    /* renamed from: c */
    public Path mo61933c() {
        return this.f53359a;
    }

    /* renamed from: d */
    public void mo61934d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f53361c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / m96154b(f5, f6);
        this.f53361c.postScale(b, b);
        this.f53361c.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f53361c, this.f53360b);
        this.f53359a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public C20689z(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        this.f53360b = new Path();
        this.f53361c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20592g0.f53080k);
        try {
            String m = C17483q.m80237m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m != null) {
                mo61934d(C17634r0.m80739e(m));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public C20689z(Path path) {
        this.f53360b = new Path();
        this.f53361c = new Matrix();
        mo61934d(path);
    }
}
