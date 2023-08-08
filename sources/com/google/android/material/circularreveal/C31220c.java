package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.material.circularreveal.C31217b;
import com.google.android.material.math.C31440a;

/* renamed from: com.google.android.material.circularreveal.c */
public interface C31220c extends C31217b.C31218a {

    /* renamed from: com.google.android.material.circularreveal.c$b */
    public static class C31222b implements TypeEvaluator<C31225e> {

        /* renamed from: b */
        public static final TypeEvaluator<C31225e> f75129b = new C31222b();

        /* renamed from: a */
        public final C31225e f75130a = new C31225e();

        @C0359n0
        /* renamed from: a */
        public C31225e evaluate(float f, @C0359n0 C31225e eVar, @C0359n0 C31225e eVar2) {
            this.f75130a.mo89168b(C31440a.m127031f(eVar.f75134a, eVar2.f75134a, f), C31440a.m127031f(eVar.f75135b, eVar2.f75135b, f), C31440a.m127031f(eVar.f75136c, eVar2.f75136c, f));
            return this.f75130a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    public static class C31223c extends Property<C31220c, C31225e> {

        /* renamed from: a */
        public static final Property<C31220c, C31225e> f75131a = new C31223c("circularReveal");

        public C31223c(String str) {
            super(C31225e.class, str);
        }

        @C0363p0
        /* renamed from: a */
        public C31225e get(@C0359n0 C31220c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(@C0359n0 C31220c cVar, @C0363p0 C31225e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    public static class C31224d extends Property<C31220c, Integer> {

        /* renamed from: a */
        public static final Property<C31220c, Integer> f75132a = new C31224d("circularRevealScrimColor");

        public C31224d(String str) {
            super(Integer.class, str);
        }

        @C0359n0
        /* renamed from: a */
        public Integer get(@C0359n0 C31220c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(@C0359n0 C31220c cVar, @C0359n0 Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$e */
    public static class C31225e {

        /* renamed from: d */
        public static final float f75133d = Float.MAX_VALUE;

        /* renamed from: a */
        public float f75134a;

        /* renamed from: b */
        public float f75135b;

        /* renamed from: c */
        public float f75136c;

        /* renamed from: a */
        public boolean mo89167a() {
            return this.f75136c == Float.MAX_VALUE;
        }

        /* renamed from: b */
        public void mo89168b(float f, float f2, float f3) {
            this.f75134a = f;
            this.f75135b = f2;
            this.f75136c = f3;
        }

        /* renamed from: c */
        public void mo89169c(@C0359n0 C31225e eVar) {
            mo89168b(eVar.f75134a, eVar.f75135b, eVar.f75136c);
        }

        public C31225e() {
        }

        public C31225e(float f, float f2, float f3) {
            this.f75134a = f;
            this.f75135b = f2;
            this.f75136c = f3;
        }

        public C31225e(@C0359n0 C31225e eVar) {
            this(eVar.f75134a, eVar.f75135b, eVar.f75136c);
        }
    }

    /* renamed from: a */
    void mo89125a();

    /* renamed from: b */
    void mo89126b();

    void draw(Canvas canvas);

    @C0363p0
    Drawable getCircularRevealOverlayDrawable();

    @C0354l
    int getCircularRevealScrimColor();

    @C0363p0
    C31225e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@C0363p0 Drawable drawable);

    void setCircularRevealScrimColor(@C0354l int i);

    void setRevealInfo(@C0363p0 C31225e eVar);
}
