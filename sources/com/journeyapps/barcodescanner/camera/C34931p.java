package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C34959u;

/* renamed from: com.journeyapps.barcodescanner.camera.p */
public class C34931p extends C34935s {

    /* renamed from: b */
    public static final String f84984b = "p";

    /* renamed from: e */
    public static float m142865e(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    /* renamed from: c */
    public float mo103483c(C34959u uVar, C34959u uVar2) {
        int i = uVar.f85046a;
        if (i <= 0 || uVar.f85047b <= 0) {
            return 0.0f;
        }
        float e = (1.0f / m142865e((((float) i) * 1.0f) / ((float) uVar2.f85046a))) / m142865e((((float) uVar.f85047b) * 1.0f) / ((float) uVar2.f85047b));
        float e2 = m142865e(((((float) uVar.f85046a) * 1.0f) / ((float) uVar.f85047b)) / ((((float) uVar2.f85046a) * 1.0f) / ((float) uVar2.f85047b)));
        return e * (((1.0f / e2) / e2) / e2);
    }

    /* renamed from: d */
    public Rect mo103484d(C34959u uVar, C34959u uVar2) {
        return new Rect(0, 0, uVar2.f85046a, uVar2.f85047b);
    }
}
