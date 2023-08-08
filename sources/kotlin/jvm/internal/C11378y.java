package kotlin.jvm.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.y */
public final class C11378y extends C11340k0<float[]> {
    @C12579k

    /* renamed from: d */
    public final float[] f28529d;

    public C11378y(int i) {
        super(i);
        this.f28529d = new float[i];
    }

    /* renamed from: h */
    public final void mo22881h(float f) {
        float[] fArr = this.f28529d;
        int b = mo22791b();
        mo22792e(b + 1);
        fArr[b] = f;
    }

    /* renamed from: i */
    public int mo22769c(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @C12579k
    /* renamed from: j */
    public final float[] mo22883j() {
        return (float[]) mo22794g(this.f28529d, new float[mo22793f()]);
    }
}
