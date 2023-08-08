package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.y */
public class C20686y<T> extends Property<T, Float> {

    /* renamed from: a */
    public final Property<T, PointF> f53346a;

    /* renamed from: b */
    public final PathMeasure f53347b;

    /* renamed from: c */
    public final float f53348c;

    /* renamed from: d */
    public final float[] f53349d = new float[2];

    /* renamed from: e */
    public final PointF f53350e = new PointF();

    /* renamed from: f */
    public float f53351f;

    public C20686y(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f53346a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f53347b = pathMeasure;
        this.f53348c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f53351f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f53351f = f.floatValue();
        this.f53347b.getPosTan(this.f53348c * f.floatValue(), this.f53349d, (float[]) null);
        PointF pointF = this.f53350e;
        float[] fArr = this.f53349d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f53346a.set(t, pointF);
    }
}
