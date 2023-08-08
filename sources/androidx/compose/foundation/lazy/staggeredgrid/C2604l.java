package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15564g0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.l */
public final class C2604l implements C2600i, C15564g0 {
    @C12579k

    /* renamed from: a */
    public final int[] f6889a;
    @C12579k

    /* renamed from: b */
    public final int[] f6890b;

    /* renamed from: c */
    public final float f6891c;
    @C12579k

    /* renamed from: d */
    public final C15564g0 f6892d;

    /* renamed from: e */
    public final boolean f6893e;

    /* renamed from: f */
    public final boolean f6894f;

    /* renamed from: g */
    public final boolean f6895g;

    /* renamed from: h */
    public final int f6896h;
    @C12579k

    /* renamed from: i */
    public final List<C2596e> f6897i;

    /* renamed from: j */
    public final long f6898j;

    /* renamed from: k */
    public final int f6899k;

    /* renamed from: l */
    public final int f6900l;

    /* renamed from: m */
    public final int f6901m;

    /* renamed from: n */
    public final int f6902n;

    /* renamed from: o */
    public final int f6903o;
    @C12579k

    /* renamed from: p */
    public final Orientation f6904p;

    public /* synthetic */ C2604l(int[] iArr, int[] iArr2, float f, C15564g0 g0Var, boolean z, boolean z2, boolean z3, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f, g0Var, z, z2, z3, i, list, j, i2, i3, i4, i5, i6);
    }

    @C12579k
    /* renamed from: a */
    public Orientation mo8941a() {
        return this.f6904p;
    }

    /* renamed from: b */
    public long mo8942b() {
        return this.f6898j;
    }

    /* renamed from: c */
    public int mo8943c() {
        return this.f6902n;
    }

    /* renamed from: d */
    public int mo8944d() {
        return this.f6900l;
    }

    /* renamed from: e */
    public int mo8945e() {
        return this.f6896h;
    }

    /* renamed from: f */
    public int mo8946f() {
        return this.f6901m;
    }

    /* renamed from: g */
    public int mo8947g() {
        return this.f6903o;
    }

    public int getHeight() {
        return this.f6892d.getHeight();
    }

    public int getWidth() {
        return this.f6892d.getWidth();
    }

    /* renamed from: h */
    public int mo8948h() {
        return this.f6899k;
    }

    @C12579k
    /* renamed from: i */
    public List<C2596e> mo8949i() {
        return this.f6897i;
    }

    /* renamed from: j */
    public final boolean mo8980j() {
        return this.f6894f;
    }

    /* renamed from: k */
    public final boolean mo8981k() {
        return this.f6893e;
    }

    /* renamed from: l */
    public final float mo8982l() {
        return this.f6891c;
    }

    @C12579k
    /* renamed from: m */
    public final int[] mo8983m() {
        return this.f6889a;
    }

    @C12579k
    /* renamed from: n */
    public final int[] mo8984n() {
        return this.f6890b;
    }

    @C12579k
    /* renamed from: o */
    public final C15564g0 mo8985o() {
        return this.f6892d;
    }

    /* renamed from: p */
    public final boolean mo8986p() {
        return this.f6895g;
    }

    @C12579k
    /* renamed from: w */
    public Map<C15531a, Integer> mo8593w() {
        return this.f6892d.mo8593w();
    }

    /* renamed from: x */
    public void mo8594x() {
        this.f6892d.mo8594x();
    }

    public C2604l(int[] iArr, int[] iArr2, float f, C15564g0 g0Var, boolean z, boolean z2, boolean z3, int i, List<? extends C2596e> list, long j, int i2, int i3, int i4, int i5, int i6) {
        boolean z4 = z3;
        this.f6889a = iArr;
        this.f6890b = iArr2;
        this.f6891c = f;
        this.f6892d = g0Var;
        this.f6893e = z;
        this.f6894f = z2;
        this.f6895g = z4;
        this.f6896h = i;
        this.f6897i = list;
        this.f6898j = j;
        this.f6899k = i2;
        this.f6900l = i3;
        this.f6901m = i4;
        this.f6902n = i5;
        this.f6903o = i6;
        this.f6904p = z4 ? Orientation.Vertical : Orientation.Horizontal;
    }
}
