package com.google.mlkit.vision.text.bundled.common;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.C0363p0;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29056av;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.mlkit.vision.text.bundled.common.j */
public final class C34064j {
    /* renamed from: a */
    public static Rect m136991a(List<Point> list, @C0363p0 Matrix matrix) {
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
        RectF rectF = new RectF((float) i, (float) i4, (float) i2, (float) i3);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    /* renamed from: b */
    public static List<Point> m136992b(C29056av avVar) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians((double) avVar.mo84512v()));
        double cos = Math.cos(Math.toRadians((double) avVar.mo84512v()));
        pointArr[0] = new Point(avVar.mo84514x(), avVar.mo84515y());
        Point point = new Point((int) (((double) avVar.mo84514x()) + (((double) avVar.mo84511A()) * cos)), (int) (((double) avVar.mo84515y()) + (((double) avVar.mo84511A()) * sin)));
        pointArr[1] = point;
        pointArr[2] = new Point((int) (((double) point.x) - (((double) avVar.mo84513w()) * sin)), (int) (((double) pointArr[1].y) + (((double) avVar.mo84513w()) * cos)));
        Point point2 = pointArr[0];
        int i = point2.x;
        Point point3 = pointArr[2];
        int i2 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point(i + (i2 - point4.x), point2.y + (point3.y - point4.y));
        return Arrays.asList(pointArr);
    }
}
