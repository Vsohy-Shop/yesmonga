package androidx.constraintlayout.core.motion.utils;

/* renamed from: androidx.constraintlayout.core.motion.utils.x */
public class C16729x {

    /* renamed from: g */
    public static String f42361g = "VelocityMatrix";

    /* renamed from: a */
    public float f42362a;

    /* renamed from: b */
    public float f42363b;

    /* renamed from: c */
    public float f42364c;

    /* renamed from: d */
    public float f42365d;

    /* renamed from: e */
    public float f42366e;

    /* renamed from: f */
    public float f42367f;

    /* renamed from: a */
    public void mo49117a(float f, float f2, int i, int i2, float[] fArr) {
        int i3 = i;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f42364c;
        float f8 = f4 + this.f42365d;
        float f9 = f7 + (this.f42362a * f5);
        float f10 = f8 + (this.f42363b * f6);
        float radians = (float) Math.toRadians((double) this.f42366e);
        double radians2 = (double) ((float) Math.toRadians((double) this.f42367f));
        double d = (double) (((float) i2) * f6);
        fArr[0] = f9 + (((float) ((((double) (((float) (-i3)) * f5)) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) ((((double) (((float) i3) * f5)) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    /* renamed from: b */
    public void mo49118b() {
        this.f42366e = 0.0f;
        this.f42365d = 0.0f;
        this.f42364c = 0.0f;
        this.f42363b = 0.0f;
        this.f42362a = 0.0f;
    }

    /* renamed from: c */
    public void mo49119c(C16686h hVar, float f) {
        if (hVar != null) {
            this.f42366e = hVar.mo49020c(f);
        }
    }

    /* renamed from: d */
    public void mo49120d(C16703o oVar, float f) {
        if (oVar != null) {
            this.f42366e = oVar.mo49073c(f);
            this.f42367f = oVar.mo49071a(f);
        }
    }

    /* renamed from: e */
    public void mo49121e(C16686h hVar, C16686h hVar2, float f) {
        if (hVar != null) {
            this.f42362a = hVar.mo49020c(f);
        }
        if (hVar2 != null) {
            this.f42363b = hVar2.mo49020c(f);
        }
    }

    /* renamed from: f */
    public void mo49122f(C16703o oVar, C16703o oVar2, float f) {
        if (oVar != null) {
            this.f42362a = oVar.mo49073c(f);
        }
        if (oVar2 != null) {
            this.f42363b = oVar2.mo49073c(f);
        }
    }

    /* renamed from: g */
    public void mo49123g(C16686h hVar, C16686h hVar2, float f) {
        if (hVar != null) {
            this.f42364c = hVar.mo49020c(f);
        }
        if (hVar2 != null) {
            this.f42365d = hVar2.mo49020c(f);
        }
    }

    /* renamed from: h */
    public void mo49124h(C16703o oVar, C16703o oVar2, float f) {
        if (oVar != null) {
            this.f42364c = oVar.mo49073c(f);
        }
        if (oVar2 != null) {
            this.f42365d = oVar2.mo49073c(f);
        }
    }
}
