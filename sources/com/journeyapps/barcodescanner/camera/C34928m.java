package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C34959u;

/* renamed from: com.journeyapps.barcodescanner.camera.m */
public class C34928m extends C34935s {

    /* renamed from: b */
    public static final String f84977b = "m";

    /* renamed from: c */
    public float mo103483c(C34959u uVar, C34959u uVar2) {
        if (uVar.f85046a <= 0 || uVar.f85047b <= 0) {
            return 0.0f;
        }
        C34959u w = uVar.mo103558w(uVar2);
        float f = (((float) w.f85046a) * 1.0f) / ((float) uVar.f85046a);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) w.f85046a) * 1.0f) / ((float) uVar2.f85046a)) + ((((float) w.f85047b) * 1.0f) / ((float) uVar2.f85047b));
        return f * ((1.0f / f2) / f2);
    }

    /* renamed from: d */
    public Rect mo103484d(C34959u uVar, C34959u uVar2) {
        C34959u w = uVar.mo103558w(uVar2);
        StringBuilder sb = new StringBuilder();
        sb.append("Preview: ");
        sb.append(uVar);
        sb.append("; Scaled: ");
        sb.append(w);
        sb.append("; Want: ");
        sb.append(uVar2);
        int i = (w.f85046a - uVar2.f85046a) / 2;
        int i2 = (w.f85047b - uVar2.f85047b) / 2;
        return new Rect(-i, -i2, w.f85046a - i, w.f85047b - i2);
    }
}
