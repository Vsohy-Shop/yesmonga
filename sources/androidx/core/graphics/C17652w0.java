package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.w0 */
public final class C17652w0 {
    /* renamed from: a */
    public static final float m80770a(@C12579k PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return pointF.x;
    }

    /* renamed from: b */
    public static final int m80771b(@C12579k Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return point.x;
    }

    /* renamed from: c */
    public static final float m80772c(@C12579k PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return pointF.y;
    }

    /* renamed from: d */
    public static final int m80773d(@C12579k Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return point.y;
    }

    @C12579k
    /* renamed from: e */
    public static final Point m80774e(@C12579k Point point, int i) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    @C12579k
    /* renamed from: f */
    public static final Point m80775f(@C12579k Point point, @C12579k Point point2) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Intrinsics.checkNotNullParameter(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @C12579k
    /* renamed from: g */
    public static final PointF m80776g(@C12579k PointF pointF, float f) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    @C12579k
    /* renamed from: h */
    public static final PointF m80777h(@C12579k PointF pointF, @C12579k PointF pointF2) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        Intrinsics.checkNotNullParameter(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @C12579k
    /* renamed from: i */
    public static final Point m80778i(@C12579k Point point, int i) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    @C12579k
    /* renamed from: j */
    public static final Point m80779j(@C12579k Point point, @C12579k Point point2) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Intrinsics.checkNotNullParameter(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @C12579k
    /* renamed from: k */
    public static final PointF m80780k(@C12579k PointF pointF, float f) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }

    @C12579k
    /* renamed from: l */
    public static final PointF m80781l(@C12579k PointF pointF, @C12579k PointF pointF2) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        Intrinsics.checkNotNullParameter(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @C12579k
    /* renamed from: m */
    public static final Point m80782m(@C12579k PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @C12579k
    /* renamed from: n */
    public static final PointF m80783n(@C12579k Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return new PointF(point);
    }

    @C12579k
    /* renamed from: o */
    public static final Point m80784o(@C12579k Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    @C12579k
    /* renamed from: p */
    public static final PointF m80785p(@C12579k PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}
