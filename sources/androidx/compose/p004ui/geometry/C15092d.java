package androidx.compose.p004ui.geometry;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,101:1\n40#1,5:102\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:102,5\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.d */
public final class C15092d {

    /* renamed from: e */
    public static final int f37251e = 8;

    /* renamed from: a */
    public float f37252a;

    /* renamed from: b */
    public float f37253b;

    /* renamed from: c */
    public float f37254c;

    /* renamed from: d */
    public float f37255d;

    public C15092d(float f, float f2, float f3, float f4) {
        this.f37252a = f;
        this.f37253b = f2;
        this.f37254c = f3;
        this.f37255d = f4;
    }

    /* renamed from: a */
    public final boolean mo42226a(long j) {
        return C15094f.m64880p(j) >= this.f37252a && C15094f.m64880p(j) < this.f37254c && C15094f.m64882r(j) >= this.f37253b && C15094f.m64882r(j) < this.f37255d;
    }

    /* renamed from: b */
    public final float mo42227b() {
        return this.f37255d;
    }

    /* renamed from: c */
    public final float mo42228c() {
        return mo42227b() - mo42232g();
    }

    /* renamed from: d */
    public final float mo42229d() {
        return this.f37252a;
    }

    /* renamed from: e */
    public final float mo42230e() {
        return this.f37254c;
    }

    /* renamed from: f */
    public final long mo42231f() {
        return C15106n.m65033a(mo42230e() - mo42229d(), mo42227b() - mo42232g());
    }

    /* renamed from: g */
    public final float mo42232g() {
        return this.f37253b;
    }

    /* renamed from: h */
    public final float mo42233h() {
        return mo42230e() - mo42229d();
    }

    @C8547h2
    /* renamed from: i */
    public final void mo42234i(float f, float f2, float f3, float f4) {
        this.f37252a = Math.max(f, this.f37252a);
        this.f37253b = Math.max(f2, this.f37253b);
        this.f37254c = Math.min(f3, this.f37254c);
        this.f37255d = Math.min(f4, this.f37255d);
    }

    /* renamed from: j */
    public final boolean mo42235j() {
        return this.f37252a >= this.f37254c || this.f37253b >= this.f37255d;
    }

    /* renamed from: k */
    public final void mo42236k(float f, float f2, float f3, float f4) {
        this.f37252a = f;
        this.f37253b = f2;
        this.f37254c = f3;
        this.f37255d = f4;
    }

    /* renamed from: l */
    public final void mo42237l(float f) {
        this.f37255d = f;
    }

    /* renamed from: m */
    public final void mo42238m(float f) {
        this.f37252a = f;
    }

    /* renamed from: n */
    public final void mo42239n(float f) {
        this.f37254c = f;
    }

    /* renamed from: o */
    public final void mo42240o(float f) {
        this.f37253b = f;
    }

    @C12579k
    public String toString() {
        return "MutableRect(" + C15091c.m64848a(this.f37252a, 1) + ", " + C15091c.m64848a(this.f37253b, 1) + ", " + C15091c.m64848a(this.f37254c, 1) + ", " + C15091c.m64848a(this.f37255d, 1) + ')';
    }
}
