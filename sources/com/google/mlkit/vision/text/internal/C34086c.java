package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.mlkit.vision.text.internal.c */
public final class C34086c {
    /* renamed from: a */
    public static Rect m137039a(List<Point> list) {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point next : list) {
            i = Math.min(i, next.x);
            i2 = Math.max(i2, next.x);
            i4 = Math.min(i4, next.y);
            i3 = Math.max(i3, next.y);
        }
        return new Rect(i, i4, i2, i3);
    }

    /* renamed from: b */
    public static List<Point> m137040b(zzf zzf) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians((double) zzf.f72423e));
        double cos = Math.cos(Math.toRadians((double) zzf.f72423e));
        pointArr[0] = new Point(zzf.f72419a, zzf.f72420b);
        int i = zzf.f72419a;
        double d = (double) zzf.f72421c;
        Point point = new Point((int) (((double) i) + (d * cos)), (int) (((double) zzf.f72420b) + (d * sin)));
        pointArr[1] = point;
        int i2 = zzf.f72422d;
        pointArr[2] = new Point((int) (((double) point.x) - (((double) i2) * sin)), (int) (((double) pointArr[1].y) + (((double) i2) * cos)));
        Point point2 = pointArr[0];
        int i3 = point2.x;
        Point point3 = pointArr[2];
        int i4 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point(i3 + (i4 - point4.x), point2.y + (point3.y - point4.y));
        return Arrays.asList(pointArr);
    }
}
