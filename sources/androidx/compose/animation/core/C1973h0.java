package androidx.compose.animation.core;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.h0 */
public final class C1973h0 implements C1965f0 {

    /* renamed from: c */
    public static final int f5489c = 0;

    /* renamed from: a */
    public final float f5490a;

    /* renamed from: b */
    public final float f5491b;

    public C1973h0() {
        this(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public float mo6838a() {
        return this.f5490a;
    }

    /* renamed from: b */
    public float mo6839b(long j, float f, float f2) {
        return f2 * ((float) Math.exp((double) ((((float) (j / 1000000)) / 1000.0f) * this.f5491b)));
    }

    /* renamed from: c */
    public long mo6840c(float f, float f2) {
        return ((long) ((((float) Math.log((double) (mo6838a() / Math.abs(f2)))) * 1000.0f) / this.f5491b)) * 1000000;
    }

    /* renamed from: d */
    public float mo6841d(float f, float f2) {
        if (Math.abs(f2) <= mo6838a()) {
            return f;
        }
        double log = Math.log((double) Math.abs(mo6838a() / f2));
        float f3 = this.f5491b;
        return (f - (f2 / f3)) + ((f2 / f3) * ((float) Math.exp((((double) f3) * ((log / ((double) f3)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    /* renamed from: e */
    public float mo6842e(long j, float f, float f2) {
        float f3 = this.f5491b;
        return (f - (f2 / f3)) + ((f2 / f3) * ((float) Math.exp((double) ((f3 * ((float) (j / 1000000))) / 1000.0f))));
    }

    public C1973h0(float f, float f2) {
        this.f5490a = Math.max(1.0E-7f, Math.abs(f2));
        this.f5491b = Math.max(1.0E-4f, f) * -4.2f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1973h0(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.1f : f2);
    }
}
