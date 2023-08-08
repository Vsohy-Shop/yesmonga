package androidx.compose.p004ui;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.d */
public final class C8738d implements C8734c {

    /* renamed from: d */
    public static final int f23423d = 0;

    /* renamed from: b */
    public final float f23424b;

    /* renamed from: c */
    public final float f23425c;

    @C8585m0
    /* renamed from: androidx.compose.ui.d$a */
    public static final class C8739a implements C8734c.C8736b {

        /* renamed from: b */
        public static final int f23426b = 0;

        /* renamed from: a */
        public final float f23427a;

        public C8739a(float f) {
            this.f23427a = f;
        }

        /* renamed from: d */
        public static /* synthetic */ C8739a m32409d(C8739a aVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = aVar.f23427a;
            }
            return aVar.mo17084c(f);
        }

        /* renamed from: a */
        public int mo17075a(int i, int i2, @C12579k LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return C11409d.m43851L0((((float) (i2 - i)) / 2.0f) * (((float) 1) + this.f23427a));
        }

        /* renamed from: b */
        public final float mo17083b() {
            return this.f23427a;
        }

        @C12579k
        /* renamed from: c */
        public final C8739a mo17084c(float f) {
            return new C8739a(f);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8739a) && Float.compare(this.f23427a, ((C8739a) obj).f23427a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f23427a);
        }

        @C12579k
        public String toString() {
            return "Horizontal(bias=" + this.f23427a + ')';
        }
    }

    public C8738d(float f, float f2) {
        this.f23424b = f;
        this.f23425c = f2;
    }

    /* renamed from: e */
    public static /* synthetic */ C8738d m32404e(C8738d dVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dVar.f23424b;
        }
        if ((i & 2) != 0) {
            f2 = dVar.f23425c;
        }
        return dVar.mo17079d(f, f2);
    }

    /* renamed from: a */
    public long mo17059a(long j, long j2, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long a = C16502r.m74668a(C16500q.m74662m(j2) - C16500q.m74662m(j), C16500q.m74659j(j2) - C16500q.m74659j(j));
        float f = (float) 1;
        return C16496n.m74593a(C11409d.m43851L0((((float) C16500q.m74662m(a)) / 2.0f) * (this.f23424b + f)), C11409d.m43851L0((((float) C16500q.m74659j(a)) / 2.0f) * (f + this.f23425c)));
    }

    /* renamed from: b */
    public final float mo17077b() {
        return this.f23424b;
    }

    /* renamed from: c */
    public final float mo17078c() {
        return this.f23425c;
    }

    @C12579k
    /* renamed from: d */
    public final C8738d mo17079d(float f, float f2) {
        return new C8738d(f, f2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8738d)) {
            return false;
        }
        C8738d dVar = (C8738d) obj;
        return Float.compare(this.f23424b, dVar.f23424b) == 0 && Float.compare(this.f23425c, dVar.f23425c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f23424b) * 31) + Float.hashCode(this.f23425c);
    }

    @C12579k
    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f23424b + ", verticalBias=" + this.f23425c + ')';
    }
}
