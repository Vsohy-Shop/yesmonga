package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C34959u;

/* renamed from: com.journeyapps.barcodescanner.camera.o */
public class C34930o extends C34935s {

    /* renamed from: b */
    public static final String f84983b = "o";

    /* renamed from: c */
    public float mo103483c(C34959u uVar, C34959u uVar2) {
        if (uVar.f85046a <= 0 || uVar.f85047b <= 0) {
            return 0.0f;
        }
        C34959u y = uVar.mo103559y(uVar2);
        float f = (((float) y.f85046a) * 1.0f) / ((float) uVar.f85046a);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) uVar2.f85046a) * 1.0f) / ((float) y.f85046a)) * ((((float) uVar2.f85047b) * 1.0f) / ((float) y.f85047b));
        return f * (((1.0f / f2) / f2) / f2);
    }

    /* renamed from: d */
    public Rect mo103484d(C34959u uVar, C34959u uVar2) {
        C34959u y = uVar.mo103559y(uVar2);
        StringBuilder sb = new StringBuilder();
        sb.append("Preview: ");
        sb.append(uVar);
        sb.append("; Scaled: ");
        sb.append(y);
        sb.append("; Want: ");
        sb.append(uVar2);
        int i = (y.f85046a - uVar2.f85046a) / 2;
        int i2 = (y.f85047b - uVar2.f85047b) / 2;
        return new Rect(-i, -i2, y.f85046a - i, y.f85047b - i2);
    }
}
