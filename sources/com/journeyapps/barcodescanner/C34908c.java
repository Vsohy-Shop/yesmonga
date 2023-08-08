package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.journeyapps.barcodescanner.c */
public class C34908c {

    /* renamed from: d */
    public static final float f84886d = 4.0f;

    /* renamed from: e */
    public static final float f84887e = 10.0f;

    /* renamed from: a */
    public C34761k f84888a;

    /* renamed from: b */
    public C34960v f84889b;

    /* renamed from: c */
    public final int f84890c = 2;

    public C34908c(C34761k kVar, C34960v vVar) {
        this.f84888a = kVar;
        this.f84889b = vVar;
    }

    /* renamed from: a */
    public static void m142712a(Canvas canvas, Paint paint, C34762l lVar, C34762l lVar2, int i) {
        if (lVar != null && lVar2 != null) {
            float f = (float) i;
            canvas.drawLine(lVar.mo102883c() / f, lVar.mo102884d() / f, lVar2.mo102883c() / f, lVar2.mo102884d() / f, paint);
        }
    }

    /* renamed from: m */
    public static List<C34762l> m142713m(List<C34762l> list, C34960v vVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C34762l p : list) {
            arrayList.add(vVar.mo103575p(p));
        }
        return arrayList;
    }

    /* renamed from: b */
    public BarcodeFormat mo103375b() {
        return this.f84888a.mo102873b();
    }

    /* renamed from: c */
    public Bitmap mo103376c() {
        return this.f84889b.mo103563d((Rect) null, 2);
    }

    /* renamed from: d */
    public int mo103377d() {
        return 2;
    }

    /* renamed from: e */
    public Bitmap mo103378e(int i) {
        Bitmap c = mo103376c();
        List<C34762l> l = mo103385l();
        if (l.isEmpty() || c == null) {
            return c;
        }
        Bitmap createBitmap = Bitmap.createBitmap(c.getWidth(), c.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(c, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(i);
        if (l.size() == 2) {
            paint.setStrokeWidth(4.0f);
            m142712a(canvas, paint, l.get(0), l.get(1), 2);
        } else if (l.size() == 4 && (this.f84888a.mo102873b() == BarcodeFormat.UPC_A || this.f84888a.mo102873b() == BarcodeFormat.EAN_13)) {
            m142712a(canvas, paint, l.get(0), l.get(1), 2);
            m142712a(canvas, paint, l.get(2), l.get(3), 2);
        } else {
            paint.setStrokeWidth(10.0f);
            for (C34762l next : l) {
                if (next != null) {
                    canvas.drawPoint(next.mo102883c() / 2.0f, next.mo102884d() / 2.0f, paint);
                }
            }
        }
        return createBitmap;
    }

    /* renamed from: f */
    public byte[] mo103379f() {
        return this.f84888a.mo102875d();
    }

    /* renamed from: g */
    public C34761k mo103380g() {
        return this.f84888a;
    }

    /* renamed from: h */
    public Map<ResultMetadataType, Object> mo103381h() {
        return this.f84888a.mo102876e();
    }

    /* renamed from: i */
    public C34762l[] mo103382i() {
        return this.f84888a.mo102877f();
    }

    /* renamed from: j */
    public String mo103383j() {
        return this.f84888a.mo102878g();
    }

    /* renamed from: k */
    public long mo103384k() {
        return this.f84888a.mo102879h();
    }

    /* renamed from: l */
    public List<C34762l> mo103385l() {
        if (this.f84888a.mo102877f() == null) {
            return Collections.emptyList();
        }
        return m142713m(Arrays.asList(this.f84888a.mo102877f()), this.f84889b);
    }

    public String toString() {
        return this.f84888a.mo102878g();
    }
}
