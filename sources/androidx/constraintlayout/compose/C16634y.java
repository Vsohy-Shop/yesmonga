package androidx.constraintlayout.compose;

/* renamed from: androidx.constraintlayout.compose.y */
public final class C16634y implements C16633x {

    /* renamed from: a */
    public float f41336a;

    /* renamed from: b */
    public float f41337b;

    /* renamed from: c */
    public boolean f41338c;

    public C16634y(float f, float f2) {
        this.f41336a = f2;
        this.f41337b = f;
    }

    public float value() {
        if (!this.f41338c) {
            this.f41337b += this.f41336a;
        }
        return this.f41337b;
    }
}
