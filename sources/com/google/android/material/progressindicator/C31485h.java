package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import com.google.android.material.progressindicator.C31471b;

/* renamed from: com.google.android.material.progressindicator.h */
public abstract class C31485h<S extends C31471b> {

    /* renamed from: a */
    public S f76219a;

    /* renamed from: b */
    public C31481g f76220b;

    public C31485h(S s) {
        this.f76219a = s;
    }

    /* renamed from: a */
    public abstract void mo90529a(@C0359n0 Canvas canvas, @C0379x(from = 0.0d, mo1016to = 1.0d) float f);

    /* renamed from: b */
    public abstract void mo90530b(@C0359n0 Canvas canvas, @C0359n0 Paint paint, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2, @C0354l int i);

    /* renamed from: c */
    public abstract void mo90531c(@C0359n0 Canvas canvas, @C0359n0 Paint paint);

    /* renamed from: d */
    public abstract int mo90532d();

    /* renamed from: e */
    public abstract int mo90533e();

    /* renamed from: f */
    public void mo90605f(@C0359n0 C31481g gVar) {
        this.f76220b = gVar;
    }

    /* renamed from: g */
    public void mo90606g(@C0359n0 Canvas canvas, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f76219a.mo90528e();
        mo90529a(canvas, f);
    }
}
