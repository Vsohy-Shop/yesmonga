package com.contentsquare.android.sdk;

import android.graphics.Point;
import android.graphics.Rect;

/* renamed from: com.contentsquare.android.sdk.w8 */
public class C14829w8 {

    /* renamed from: a */
    public final C14830a f36770a = new C14830a();

    /* renamed from: b */
    public final Point f36771b = new Point();

    /* renamed from: com.contentsquare.android.sdk.w8$a */
    public static class C14830a {

        /* renamed from: a */
        public final Rect f36772a = new Rect();

        /* renamed from: b */
        public float f36773b;
    }

    /* renamed from: a */
    public final float mo36726a(int i, int i2, boolean z) {
        if (!z) {
            return 0.0f;
        }
        int i3 = i * i2;
        int width = this.f36770a.f36772a.width() * this.f36770a.f36772a.height();
        if (i3 == 0 || width == 0) {
            return 1.0f;
        }
        return ((float) width) / ((float) i3);
    }

    /* renamed from: b */
    public Point mo36727b(int i, int i2, int i3, int i4) {
        Point point = this.f36771b;
        point.x = i - i3;
        point.y = i2 - i4;
        return point;
    }

    /* renamed from: c */
    public C14830a mo36728c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        C14830a aVar = this.f36770a;
        Rect rect = aVar.f36772a;
        rect.left = i;
        rect.top = i2;
        int i9 = i + i3;
        rect.right = i9;
        int i10 = i2 + i4;
        rect.bottom = i10;
        boolean z2 = true;
        if (i < i5) {
            rect.left = i5;
            z = true;
        } else {
            z = false;
        }
        if (i2 < i6) {
            rect.top = i6;
            z = true;
        }
        int i11 = i5 + i7;
        if (i9 > i11) {
            rect.right = i11;
            z = true;
        }
        int i12 = i6 + i8;
        if (i10 > i12) {
            rect.bottom = i12;
        } else {
            z2 = z;
        }
        aVar.f36773b = mo36726a(i3, i4, z2);
        return this.f36770a;
    }

    /* renamed from: d */
    public boolean mo36729d(int i, int i2) {
        return i > 0 && i2 > 0;
    }

    /* renamed from: e */
    public boolean mo36730e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return i3 + i > i5 && i4 + i2 > i6 && i < i5 + i7 && i2 < i6 + i8;
    }
}
