package androidx.compose.p004ui;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.e */
public final class C8757e implements C8734c {

    /* renamed from: d */
    public static final int f23459d = 0;

    /* renamed from: b */
    public final float f23460b;

    /* renamed from: c */
    public final float f23461c;

    @C8585m0
    /* renamed from: androidx.compose.ui.e$a */
    public static final class C8758a implements C8734c.C8736b {

        /* renamed from: b */
        public static final int f23462b = 0;

        /* renamed from: a */
        public final float f23463a;

        public C8758a(float f) {
            this.f23463a = f;
        }

        /* renamed from: d */
        public static /* synthetic */ C8758a m32567d(C8758a aVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = aVar.f23463a;
            }
            return aVar.mo17195c(f);
        }

        /* renamed from: a */
        public int mo17075a(int i, int i2, @C12579k LayoutDirection layoutDirection) {
            float f;
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            float f2 = ((float) (i2 - i)) / 2.0f;
            if (layoutDirection == LayoutDirection.Ltr) {
                f = this.f23463a;
            } else {
                f = ((float) -1) * this.f23463a;
            }
            return C11409d.m43851L0(f2 * (((float) 1) + f));
        }

        /* renamed from: b */
        public final float mo17194b() {
            return this.f23463a;
        }

        @C12579k
        /* renamed from: c */
        public final C8758a mo17195c(float f) {
            return new C8758a(f);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8758a) && Float.compare(this.f23463a, ((C8758a) obj).f23463a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f23463a);
        }

        @C12579k
        public String toString() {
            return "Horizontal(bias=" + this.f23463a + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.e$b */
    public static final class C8759b implements C8734c.C8737c {

        /* renamed from: b */
        public static final int f23464b = 0;

        /* renamed from: a */
        public final float f23465a;

        public C8759b(float f) {
            this.f23465a = f;
        }

        /* renamed from: d */
        public static /* synthetic */ C8759b m32571d(C8759b bVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = bVar.f23465a;
            }
            return bVar.mo17200c(f);
        }

        /* renamed from: a */
        public int mo17076a(int i, int i2) {
            return C11409d.m43851L0((((float) (i2 - i)) / 2.0f) * (((float) 1) + this.f23465a));
        }

        /* renamed from: b */
        public final float mo17199b() {
            return this.f23465a;
        }

        @C12579k
        /* renamed from: c */
        public final C8759b mo17200c(float f) {
            return new C8759b(f);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8759b) && Float.compare(this.f23465a, ((C8759b) obj).f23465a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f23465a);
        }

        @C12579k
        public String toString() {
            return "Vertical(bias=" + this.f23465a + ')';
        }
    }

    public C8757e(float f, float f2) {
        this.f23460b = f;
        this.f23461c = f2;
    }

    /* renamed from: e */
    public static /* synthetic */ C8757e m32560e(C8757e eVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = eVar.f23460b;
        }
        if ((i & 2) != 0) {
            f2 = eVar.f23461c;
        }
        return eVar.mo17188d(f, f2);
    }

    /* renamed from: a */
    public long mo17059a(long j, long j2, @C12579k LayoutDirection layoutDirection) {
        float f;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        float m = ((float) (C16500q.m74662m(j2) - C16500q.m74662m(j))) / 2.0f;
        float j3 = ((float) (C16500q.m74659j(j2) - C16500q.m74659j(j))) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f = this.f23460b;
        } else {
            f = ((float) -1) * this.f23460b;
        }
        float f2 = (float) 1;
        return C16496n.m74593a(C11409d.m43851L0(m * (f + f2)), C11409d.m43851L0(j3 * (f2 + this.f23461c)));
    }

    /* renamed from: b */
    public final float mo17186b() {
        return this.f23460b;
    }

    /* renamed from: c */
    public final float mo17187c() {
        return this.f23461c;
    }

    @C12579k
    /* renamed from: d */
    public final C8757e mo17188d(float f, float f2) {
        return new C8757e(f, f2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8757e)) {
            return false;
        }
        C8757e eVar = (C8757e) obj;
        return Float.compare(this.f23460b, eVar.f23460b) == 0 && Float.compare(this.f23461c, eVar.f23461c) == 0;
    }

    /* renamed from: f */
    public final float mo17190f() {
        return this.f23460b;
    }

    /* renamed from: g */
    public final float mo17191g() {
        return this.f23461c;
    }

    public int hashCode() {
        return (Float.hashCode(this.f23460b) * 31) + Float.hashCode(this.f23461c);
    }

    @C12579k
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f23460b + ", verticalBias=" + this.f23461c + ')';
    }
}
