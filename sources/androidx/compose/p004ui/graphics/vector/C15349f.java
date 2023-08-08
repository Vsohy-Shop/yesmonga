package androidx.compose.p004ui.graphics.vector;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.vector.f */
public abstract class C15349f {

    /* renamed from: a */
    public final boolean f37911a;

    /* renamed from: b */
    public final boolean f37912b;

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$a */
    public static final class C15350a extends C15349f {

        /* renamed from: c */
        public final float f37913c;

        /* renamed from: d */
        public final float f37914d;

        /* renamed from: e */
        public final float f37915e;

        /* renamed from: f */
        public final boolean f37916f;

        /* renamed from: g */
        public final boolean f37917g;

        /* renamed from: h */
        public final float f37918h;

        /* renamed from: i */
        public final float f37919i;

        public C15350a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37913c = f;
            this.f37914d = f2;
            this.f37915e = f3;
            this.f37916f = z;
            this.f37917g = z2;
            this.f37918h = f4;
            this.f37919i = f5;
        }

        /* renamed from: k */
        public static /* synthetic */ C15350a m67002k(C15350a aVar, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = aVar.f37913c;
            }
            if ((i & 2) != 0) {
                f2 = aVar.f37914d;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = aVar.f37915e;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = aVar.f37916f;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = aVar.f37917g;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = aVar.f37918h;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = aVar.f37919i;
            }
            return aVar.mo43297j(f, f6, f7, z3, z4, f8, f5);
        }

        /* renamed from: c */
        public final float mo43288c() {
            return this.f37913c;
        }

        /* renamed from: d */
        public final float mo43289d() {
            return this.f37914d;
        }

        /* renamed from: e */
        public final float mo43290e() {
            return this.f37915e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15350a)) {
                return false;
            }
            C15350a aVar = (C15350a) obj;
            return Float.compare(this.f37913c, aVar.f37913c) == 0 && Float.compare(this.f37914d, aVar.f37914d) == 0 && Float.compare(this.f37915e, aVar.f37915e) == 0 && this.f37916f == aVar.f37916f && this.f37917g == aVar.f37917g && Float.compare(this.f37918h, aVar.f37918h) == 0 && Float.compare(this.f37919i, aVar.f37919i) == 0;
        }

        /* renamed from: f */
        public final boolean mo43292f() {
            return this.f37916f;
        }

        /* renamed from: g */
        public final boolean mo43293g() {
            return this.f37917g;
        }

        /* renamed from: h */
        public final float mo43294h() {
            return this.f37918h;
        }

        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f37913c) * 31) + Float.hashCode(this.f37914d)) * 31) + Float.hashCode(this.f37915e)) * 31;
            boolean z = this.f37916f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f37917g;
            if (!z3) {
                z2 = z3;
            }
            return ((((i + (z2 ? 1 : 0)) * 31) + Float.hashCode(this.f37918h)) * 31) + Float.hashCode(this.f37919i);
        }

        /* renamed from: i */
        public final float mo43296i() {
            return this.f37919i;
        }

        @C12579k
        /* renamed from: j */
        public final C15350a mo43297j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new C15350a(f, f2, f3, z, z2, f4, f5);
        }

        /* renamed from: l */
        public final float mo43298l() {
            return this.f37918h;
        }

        /* renamed from: m */
        public final float mo43299m() {
            return this.f37919i;
        }

        /* renamed from: n */
        public final float mo43300n() {
            return this.f37913c;
        }

        /* renamed from: o */
        public final float mo43301o() {
            return this.f37915e;
        }

        /* renamed from: p */
        public final float mo43302p() {
            return this.f37914d;
        }

        /* renamed from: q */
        public final boolean mo43303q() {
            return this.f37916f;
        }

        /* renamed from: r */
        public final boolean mo43304r() {
            return this.f37917g;
        }

        @C12579k
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f37913c + ", verticalEllipseRadius=" + this.f37914d + ", theta=" + this.f37915e + ", isMoreThanHalf=" + this.f37916f + ", isPositiveArc=" + this.f37917g + ", arcStartX=" + this.f37918h + ", arcStartY=" + this.f37919i + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$b */
    public static final class C15351b extends C15349f {
        @C12579k

        /* renamed from: c */
        public static final C15351b f37920c = new C15351b();

        public C15351b() {
            super(false, false, 3, (DefaultConstructorMarker) null);
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$c */
    public static final class C15352c extends C15349f {

        /* renamed from: c */
        public final float f37921c;

        /* renamed from: d */
        public final float f37922d;

        /* renamed from: e */
        public final float f37923e;

        /* renamed from: f */
        public final float f37924f;

        /* renamed from: g */
        public final float f37925g;

        /* renamed from: h */
        public final float f37926h;

        public C15352c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f37921c = f;
            this.f37922d = f2;
            this.f37923e = f3;
            this.f37924f = f4;
            this.f37925g = f5;
            this.f37926h = f6;
        }

        /* renamed from: j */
        public static /* synthetic */ C15352c m67018j(C15352c cVar, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = cVar.f37921c;
            }
            if ((i & 2) != 0) {
                f2 = cVar.f37922d;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = cVar.f37923e;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = cVar.f37924f;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = cVar.f37925g;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = cVar.f37926h;
            }
            return cVar.mo43314i(f, f7, f8, f9, f10, f6);
        }

        /* renamed from: c */
        public final float mo43306c() {
            return this.f37921c;
        }

        /* renamed from: d */
        public final float mo43307d() {
            return this.f37922d;
        }

        /* renamed from: e */
        public final float mo43308e() {
            return this.f37923e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15352c)) {
                return false;
            }
            C15352c cVar = (C15352c) obj;
            return Float.compare(this.f37921c, cVar.f37921c) == 0 && Float.compare(this.f37922d, cVar.f37922d) == 0 && Float.compare(this.f37923e, cVar.f37923e) == 0 && Float.compare(this.f37924f, cVar.f37924f) == 0 && Float.compare(this.f37925g, cVar.f37925g) == 0 && Float.compare(this.f37926h, cVar.f37926h) == 0;
        }

        /* renamed from: f */
        public final float mo43310f() {
            return this.f37924f;
        }

        /* renamed from: g */
        public final float mo43311g() {
            return this.f37925g;
        }

        /* renamed from: h */
        public final float mo43312h() {
            return this.f37926h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f37921c) * 31) + Float.hashCode(this.f37922d)) * 31) + Float.hashCode(this.f37923e)) * 31) + Float.hashCode(this.f37924f)) * 31) + Float.hashCode(this.f37925g)) * 31) + Float.hashCode(this.f37926h);
        }

        @C12579k
        /* renamed from: i */
        public final C15352c mo43314i(float f, float f2, float f3, float f4, float f5, float f6) {
            return new C15352c(f, f2, f3, f4, f5, f6);
        }

        /* renamed from: k */
        public final float mo43315k() {
            return this.f37921c;
        }

        /* renamed from: l */
        public final float mo43316l() {
            return this.f37923e;
        }

        /* renamed from: m */
        public final float mo43317m() {
            return this.f37925g;
        }

        /* renamed from: n */
        public final float mo43318n() {
            return this.f37922d;
        }

        /* renamed from: o */
        public final float mo43319o() {
            return this.f37924f;
        }

        /* renamed from: p */
        public final float mo43320p() {
            return this.f37926h;
        }

        @C12579k
        public String toString() {
            return "CurveTo(x1=" + this.f37921c + ", y1=" + this.f37922d + ", x2=" + this.f37923e + ", y2=" + this.f37924f + ", x3=" + this.f37925g + ", y3=" + this.f37926h + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$d */
    public static final class C15353d extends C15349f {

        /* renamed from: c */
        public final float f37927c;

        public C15353d(float f) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37927c = f;
        }

        /* renamed from: e */
        public static /* synthetic */ C15353d m67032e(C15353d dVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = dVar.f37927c;
            }
            return dVar.mo43323d(f);
        }

        /* renamed from: c */
        public final float mo43322c() {
            return this.f37927c;
        }

        @C12579k
        /* renamed from: d */
        public final C15353d mo43323d(float f) {
            return new C15353d(f);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15353d) && Float.compare(this.f37927c, ((C15353d) obj).f37927c) == 0;
        }

        /* renamed from: f */
        public final float mo43325f() {
            return this.f37927c;
        }

        public int hashCode() {
            return Float.hashCode(this.f37927c);
        }

        @C12579k
        public String toString() {
            return "HorizontalTo(x=" + this.f37927c + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$e */
    public static final class C15354e extends C15349f {

        /* renamed from: c */
        public final float f37928c;

        /* renamed from: d */
        public final float f37929d;

        public C15354e(float f, float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37928c = f;
            this.f37929d = f2;
        }

        /* renamed from: f */
        public static /* synthetic */ C15354e m67036f(C15354e eVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = eVar.f37928c;
            }
            if ((i & 2) != 0) {
                f2 = eVar.f37929d;
            }
            return eVar.mo43330e(f, f2);
        }

        /* renamed from: c */
        public final float mo43328c() {
            return this.f37928c;
        }

        /* renamed from: d */
        public final float mo43329d() {
            return this.f37929d;
        }

        @C12579k
        /* renamed from: e */
        public final C15354e mo43330e(float f, float f2) {
            return new C15354e(f, f2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15354e)) {
                return false;
            }
            C15354e eVar = (C15354e) obj;
            return Float.compare(this.f37928c, eVar.f37928c) == 0 && Float.compare(this.f37929d, eVar.f37929d) == 0;
        }

        /* renamed from: g */
        public final float mo43332g() {
            return this.f37928c;
        }

        /* renamed from: h */
        public final float mo43333h() {
            return this.f37929d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f37928c) * 31) + Float.hashCode(this.f37929d);
        }

        @C12579k
        public String toString() {
            return "LineTo(x=" + this.f37928c + ", y=" + this.f37929d + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$f */
    public static final class C15355f extends C15349f {

        /* renamed from: c */
        public final float f37930c;

        /* renamed from: d */
        public final float f37931d;

        public C15355f(float f, float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37930c = f;
            this.f37931d = f2;
        }

        /* renamed from: f */
        public static /* synthetic */ C15355f m67042f(C15355f fVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = fVar.f37930c;
            }
            if ((i & 2) != 0) {
                f2 = fVar.f37931d;
            }
            return fVar.mo43338e(f, f2);
        }

        /* renamed from: c */
        public final float mo43336c() {
            return this.f37930c;
        }

        /* renamed from: d */
        public final float mo43337d() {
            return this.f37931d;
        }

        @C12579k
        /* renamed from: e */
        public final C15355f mo43338e(float f, float f2) {
            return new C15355f(f, f2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15355f)) {
                return false;
            }
            C15355f fVar = (C15355f) obj;
            return Float.compare(this.f37930c, fVar.f37930c) == 0 && Float.compare(this.f37931d, fVar.f37931d) == 0;
        }

        /* renamed from: g */
        public final float mo43340g() {
            return this.f37930c;
        }

        /* renamed from: h */
        public final float mo43341h() {
            return this.f37931d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f37930c) * 31) + Float.hashCode(this.f37931d);
        }

        @C12579k
        public String toString() {
            return "MoveTo(x=" + this.f37930c + ", y=" + this.f37931d + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$g */
    public static final class C15356g extends C15349f {

        /* renamed from: c */
        public final float f37932c;

        /* renamed from: d */
        public final float f37933d;

        /* renamed from: e */
        public final float f37934e;

        /* renamed from: f */
        public final float f37935f;

        public C15356g(float f, float f2, float f3, float f4) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f37932c = f;
            this.f37933d = f2;
            this.f37934e = f3;
            this.f37935f = f4;
        }

        /* renamed from: h */
        public static /* synthetic */ C15356g m67048h(C15356g gVar, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = gVar.f37932c;
            }
            if ((i & 2) != 0) {
                f2 = gVar.f37933d;
            }
            if ((i & 4) != 0) {
                f3 = gVar.f37934e;
            }
            if ((i & 8) != 0) {
                f4 = gVar.f37935f;
            }
            return gVar.mo43349g(f, f2, f3, f4);
        }

        /* renamed from: c */
        public final float mo43344c() {
            return this.f37932c;
        }

        /* renamed from: d */
        public final float mo43345d() {
            return this.f37933d;
        }

        /* renamed from: e */
        public final float mo43346e() {
            return this.f37934e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15356g)) {
                return false;
            }
            C15356g gVar = (C15356g) obj;
            return Float.compare(this.f37932c, gVar.f37932c) == 0 && Float.compare(this.f37933d, gVar.f37933d) == 0 && Float.compare(this.f37934e, gVar.f37934e) == 0 && Float.compare(this.f37935f, gVar.f37935f) == 0;
        }

        /* renamed from: f */
        public final float mo43348f() {
            return this.f37935f;
        }

        @C12579k
        /* renamed from: g */
        public final C15356g mo43349g(float f, float f2, float f3, float f4) {
            return new C15356g(f, f2, f3, f4);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f37932c) * 31) + Float.hashCode(this.f37933d)) * 31) + Float.hashCode(this.f37934e)) * 31) + Float.hashCode(this.f37935f);
        }

        /* renamed from: i */
        public final float mo43351i() {
            return this.f37932c;
        }

        /* renamed from: j */
        public final float mo43352j() {
            return this.f37934e;
        }

        /* renamed from: k */
        public final float mo43353k() {
            return this.f37933d;
        }

        /* renamed from: l */
        public final float mo43354l() {
            return this.f37935f;
        }

        @C12579k
        public String toString() {
            return "QuadTo(x1=" + this.f37932c + ", y1=" + this.f37933d + ", x2=" + this.f37934e + ", y2=" + this.f37935f + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$h */
    public static final class C15357h extends C15349f {

        /* renamed from: c */
        public final float f37936c;

        /* renamed from: d */
        public final float f37937d;

        /* renamed from: e */
        public final float f37938e;

        /* renamed from: f */
        public final float f37939f;

        public C15357h(float f, float f2, float f3, float f4) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f37936c = f;
            this.f37937d = f2;
            this.f37938e = f3;
            this.f37939f = f4;
        }

        /* renamed from: h */
        public static /* synthetic */ C15357h m67058h(C15357h hVar, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = hVar.f37936c;
            }
            if ((i & 2) != 0) {
                f2 = hVar.f37937d;
            }
            if ((i & 4) != 0) {
                f3 = hVar.f37938e;
            }
            if ((i & 8) != 0) {
                f4 = hVar.f37939f;
            }
            return hVar.mo43361g(f, f2, f3, f4);
        }

        /* renamed from: c */
        public final float mo43356c() {
            return this.f37936c;
        }

        /* renamed from: d */
        public final float mo43357d() {
            return this.f37937d;
        }

        /* renamed from: e */
        public final float mo43358e() {
            return this.f37938e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15357h)) {
                return false;
            }
            C15357h hVar = (C15357h) obj;
            return Float.compare(this.f37936c, hVar.f37936c) == 0 && Float.compare(this.f37937d, hVar.f37937d) == 0 && Float.compare(this.f37938e, hVar.f37938e) == 0 && Float.compare(this.f37939f, hVar.f37939f) == 0;
        }

        /* renamed from: f */
        public final float mo43360f() {
            return this.f37939f;
        }

        @C12579k
        /* renamed from: g */
        public final C15357h mo43361g(float f, float f2, float f3, float f4) {
            return new C15357h(f, f2, f3, f4);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f37936c) * 31) + Float.hashCode(this.f37937d)) * 31) + Float.hashCode(this.f37938e)) * 31) + Float.hashCode(this.f37939f);
        }

        /* renamed from: i */
        public final float mo43363i() {
            return this.f37936c;
        }

        /* renamed from: j */
        public final float mo43364j() {
            return this.f37938e;
        }

        /* renamed from: k */
        public final float mo43365k() {
            return this.f37937d;
        }

        /* renamed from: l */
        public final float mo43366l() {
            return this.f37939f;
        }

        @C12579k
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f37936c + ", y1=" + this.f37937d + ", x2=" + this.f37938e + ", y2=" + this.f37939f + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$i */
    public static final class C15358i extends C15349f {

        /* renamed from: c */
        public final float f37940c;

        /* renamed from: d */
        public final float f37941d;

        public C15358i(float f, float f2) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f37940c = f;
            this.f37941d = f2;
        }

        /* renamed from: f */
        public static /* synthetic */ C15358i m67068f(C15358i iVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = iVar.f37940c;
            }
            if ((i & 2) != 0) {
                f2 = iVar.f37941d;
            }
            return iVar.mo43370e(f, f2);
        }

        /* renamed from: c */
        public final float mo43368c() {
            return this.f37940c;
        }

        /* renamed from: d */
        public final float mo43369d() {
            return this.f37941d;
        }

        @C12579k
        /* renamed from: e */
        public final C15358i mo43370e(float f, float f2) {
            return new C15358i(f, f2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15358i)) {
                return false;
            }
            C15358i iVar = (C15358i) obj;
            return Float.compare(this.f37940c, iVar.f37940c) == 0 && Float.compare(this.f37941d, iVar.f37941d) == 0;
        }

        /* renamed from: g */
        public final float mo43372g() {
            return this.f37940c;
        }

        /* renamed from: h */
        public final float mo43373h() {
            return this.f37941d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f37940c) * 31) + Float.hashCode(this.f37941d);
        }

        @C12579k
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f37940c + ", y=" + this.f37941d + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$j */
    public static final class C15359j extends C15349f {

        /* renamed from: c */
        public final float f37942c;

        /* renamed from: d */
        public final float f37943d;

        /* renamed from: e */
        public final float f37944e;

        /* renamed from: f */
        public final boolean f37945f;

        /* renamed from: g */
        public final boolean f37946g;

        /* renamed from: h */
        public final float f37947h;

        /* renamed from: i */
        public final float f37948i;

        public C15359j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37942c = f;
            this.f37943d = f2;
            this.f37944e = f3;
            this.f37945f = z;
            this.f37946g = z2;
            this.f37947h = f4;
            this.f37948i = f5;
        }

        /* renamed from: k */
        public static /* synthetic */ C15359j m67074k(C15359j jVar, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = jVar.f37942c;
            }
            if ((i & 2) != 0) {
                f2 = jVar.f37943d;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = jVar.f37944e;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = jVar.f37945f;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = jVar.f37946g;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = jVar.f37947h;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = jVar.f37948i;
            }
            return jVar.mo43385j(f, f6, f7, z3, z4, f8, f5);
        }

        /* renamed from: c */
        public final float mo43376c() {
            return this.f37942c;
        }

        /* renamed from: d */
        public final float mo43377d() {
            return this.f37943d;
        }

        /* renamed from: e */
        public final float mo43378e() {
            return this.f37944e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15359j)) {
                return false;
            }
            C15359j jVar = (C15359j) obj;
            return Float.compare(this.f37942c, jVar.f37942c) == 0 && Float.compare(this.f37943d, jVar.f37943d) == 0 && Float.compare(this.f37944e, jVar.f37944e) == 0 && this.f37945f == jVar.f37945f && this.f37946g == jVar.f37946g && Float.compare(this.f37947h, jVar.f37947h) == 0 && Float.compare(this.f37948i, jVar.f37948i) == 0;
        }

        /* renamed from: f */
        public final boolean mo43380f() {
            return this.f37945f;
        }

        /* renamed from: g */
        public final boolean mo43381g() {
            return this.f37946g;
        }

        /* renamed from: h */
        public final float mo43382h() {
            return this.f37947h;
        }

        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f37942c) * 31) + Float.hashCode(this.f37943d)) * 31) + Float.hashCode(this.f37944e)) * 31;
            boolean z = this.f37945f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f37946g;
            if (!z3) {
                z2 = z3;
            }
            return ((((i + (z2 ? 1 : 0)) * 31) + Float.hashCode(this.f37947h)) * 31) + Float.hashCode(this.f37948i);
        }

        /* renamed from: i */
        public final float mo43384i() {
            return this.f37948i;
        }

        @C12579k
        /* renamed from: j */
        public final C15359j mo43385j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new C15359j(f, f2, f3, z, z2, f4, f5);
        }

        /* renamed from: l */
        public final float mo43386l() {
            return this.f37947h;
        }

        /* renamed from: m */
        public final float mo43387m() {
            return this.f37948i;
        }

        /* renamed from: n */
        public final float mo43388n() {
            return this.f37942c;
        }

        /* renamed from: o */
        public final float mo43389o() {
            return this.f37944e;
        }

        /* renamed from: p */
        public final float mo43390p() {
            return this.f37943d;
        }

        /* renamed from: q */
        public final boolean mo43391q() {
            return this.f37945f;
        }

        /* renamed from: r */
        public final boolean mo43392r() {
            return this.f37946g;
        }

        @C12579k
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f37942c + ", verticalEllipseRadius=" + this.f37943d + ", theta=" + this.f37944e + ", isMoreThanHalf=" + this.f37945f + ", isPositiveArc=" + this.f37946g + ", arcStartDx=" + this.f37947h + ", arcStartDy=" + this.f37948i + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$k */
    public static final class C15360k extends C15349f {

        /* renamed from: c */
        public final float f37949c;

        /* renamed from: d */
        public final float f37950d;

        /* renamed from: e */
        public final float f37951e;

        /* renamed from: f */
        public final float f37952f;

        /* renamed from: g */
        public final float f37953g;

        /* renamed from: h */
        public final float f37954h;

        public C15360k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f37949c = f;
            this.f37950d = f2;
            this.f37951e = f3;
            this.f37952f = f4;
            this.f37953g = f5;
            this.f37954h = f6;
        }

        /* renamed from: j */
        public static /* synthetic */ C15360k m67090j(C15360k kVar, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = kVar.f37949c;
            }
            if ((i & 2) != 0) {
                f2 = kVar.f37950d;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = kVar.f37951e;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = kVar.f37952f;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = kVar.f37953g;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = kVar.f37954h;
            }
            return kVar.mo43402i(f, f7, f8, f9, f10, f6);
        }

        /* renamed from: c */
        public final float mo43394c() {
            return this.f37949c;
        }

        /* renamed from: d */
        public final float mo43395d() {
            return this.f37950d;
        }

        /* renamed from: e */
        public final float mo43396e() {
            return this.f37951e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15360k)) {
                return false;
            }
            C15360k kVar = (C15360k) obj;
            return Float.compare(this.f37949c, kVar.f37949c) == 0 && Float.compare(this.f37950d, kVar.f37950d) == 0 && Float.compare(this.f37951e, kVar.f37951e) == 0 && Float.compare(this.f37952f, kVar.f37952f) == 0 && Float.compare(this.f37953g, kVar.f37953g) == 0 && Float.compare(this.f37954h, kVar.f37954h) == 0;
        }

        /* renamed from: f */
        public final float mo43398f() {
            return this.f37952f;
        }

        /* renamed from: g */
        public final float mo43399g() {
            return this.f37953g;
        }

        /* renamed from: h */
        public final float mo43400h() {
            return this.f37954h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f37949c) * 31) + Float.hashCode(this.f37950d)) * 31) + Float.hashCode(this.f37951e)) * 31) + Float.hashCode(this.f37952f)) * 31) + Float.hashCode(this.f37953g)) * 31) + Float.hashCode(this.f37954h);
        }

        @C12579k
        /* renamed from: i */
        public final C15360k mo43402i(float f, float f2, float f3, float f4, float f5, float f6) {
            return new C15360k(f, f2, f3, f4, f5, f6);
        }

        /* renamed from: k */
        public final float mo43403k() {
            return this.f37949c;
        }

        /* renamed from: l */
        public final float mo43404l() {
            return this.f37951e;
        }

        /* renamed from: m */
        public final float mo43405m() {
            return this.f37953g;
        }

        /* renamed from: n */
        public final float mo43406n() {
            return this.f37950d;
        }

        /* renamed from: o */
        public final float mo43407o() {
            return this.f37952f;
        }

        /* renamed from: p */
        public final float mo43408p() {
            return this.f37954h;
        }

        @C12579k
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f37949c + ", dy1=" + this.f37950d + ", dx2=" + this.f37951e + ", dy2=" + this.f37952f + ", dx3=" + this.f37953g + ", dy3=" + this.f37954h + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$l */
    public static final class C15361l extends C15349f {

        /* renamed from: c */
        public final float f37955c;

        public C15361l(float f) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37955c = f;
        }

        /* renamed from: e */
        public static /* synthetic */ C15361l m67104e(C15361l lVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = lVar.f37955c;
            }
            return lVar.mo43411d(f);
        }

        /* renamed from: c */
        public final float mo43410c() {
            return this.f37955c;
        }

        @C12579k
        /* renamed from: d */
        public final C15361l mo43411d(float f) {
            return new C15361l(f);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15361l) && Float.compare(this.f37955c, ((C15361l) obj).f37955c) == 0;
        }

        /* renamed from: f */
        public final float mo43413f() {
            return this.f37955c;
        }

        public int hashCode() {
            return Float.hashCode(this.f37955c);
        }

        @C12579k
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f37955c + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$m */
    public static final class C15362m extends C15349f {

        /* renamed from: c */
        public final float f37956c;

        /* renamed from: d */
        public final float f37957d;

        public C15362m(float f, float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37956c = f;
            this.f37957d = f2;
        }

        /* renamed from: f */
        public static /* synthetic */ C15362m m67108f(C15362m mVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = mVar.f37956c;
            }
            if ((i & 2) != 0) {
                f2 = mVar.f37957d;
            }
            return mVar.mo43418e(f, f2);
        }

        /* renamed from: c */
        public final float mo43416c() {
            return this.f37956c;
        }

        /* renamed from: d */
        public final float mo43417d() {
            return this.f37957d;
        }

        @C12579k
        /* renamed from: e */
        public final C15362m mo43418e(float f, float f2) {
            return new C15362m(f, f2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15362m)) {
                return false;
            }
            C15362m mVar = (C15362m) obj;
            return Float.compare(this.f37956c, mVar.f37956c) == 0 && Float.compare(this.f37957d, mVar.f37957d) == 0;
        }

        /* renamed from: g */
        public final float mo43420g() {
            return this.f37956c;
        }

        /* renamed from: h */
        public final float mo43421h() {
            return this.f37957d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f37956c) * 31) + Float.hashCode(this.f37957d);
        }

        @C12579k
        public String toString() {
            return "RelativeLineTo(dx=" + this.f37956c + ", dy=" + this.f37957d + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$n */
    public static final class C15363n extends C15349f {

        /* renamed from: c */
        public final float f37958c;

        /* renamed from: d */
        public final float f37959d;

        public C15363n(float f, float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37958c = f;
            this.f37959d = f2;
        }

        /* renamed from: f */
        public static /* synthetic */ C15363n m67114f(C15363n nVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = nVar.f37958c;
            }
            if ((i & 2) != 0) {
                f2 = nVar.f37959d;
            }
            return nVar.mo43426e(f, f2);
        }

        /* renamed from: c */
        public final float mo43424c() {
            return this.f37958c;
        }

        /* renamed from: d */
        public final float mo43425d() {
            return this.f37959d;
        }

        @C12579k
        /* renamed from: e */
        public final C15363n mo43426e(float f, float f2) {
            return new C15363n(f, f2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15363n)) {
                return false;
            }
            C15363n nVar = (C15363n) obj;
            return Float.compare(this.f37958c, nVar.f37958c) == 0 && Float.compare(this.f37959d, nVar.f37959d) == 0;
        }

        /* renamed from: g */
        public final float mo43428g() {
            return this.f37958c;
        }

        /* renamed from: h */
        public final float mo43429h() {
            return this.f37959d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f37958c) * 31) + Float.hashCode(this.f37959d);
        }

        @C12579k
        public String toString() {
            return "RelativeMoveTo(dx=" + this.f37958c + ", dy=" + this.f37959d + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$o */
    public static final class C15364o extends C15349f {

        /* renamed from: c */
        public final float f37960c;

        /* renamed from: d */
        public final float f37961d;

        /* renamed from: e */
        public final float f37962e;

        /* renamed from: f */
        public final float f37963f;

        public C15364o(float f, float f2, float f3, float f4) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f37960c = f;
            this.f37961d = f2;
            this.f37962e = f3;
            this.f37963f = f4;
        }

        /* renamed from: h */
        public static /* synthetic */ C15364o m67120h(C15364o oVar, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = oVar.f37960c;
            }
            if ((i & 2) != 0) {
                f2 = oVar.f37961d;
            }
            if ((i & 4) != 0) {
                f3 = oVar.f37962e;
            }
            if ((i & 8) != 0) {
                f4 = oVar.f37963f;
            }
            return oVar.mo43437g(f, f2, f3, f4);
        }

        /* renamed from: c */
        public final float mo43432c() {
            return this.f37960c;
        }

        /* renamed from: d */
        public final float mo43433d() {
            return this.f37961d;
        }

        /* renamed from: e */
        public final float mo43434e() {
            return this.f37962e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15364o)) {
                return false;
            }
            C15364o oVar = (C15364o) obj;
            return Float.compare(this.f37960c, oVar.f37960c) == 0 && Float.compare(this.f37961d, oVar.f37961d) == 0 && Float.compare(this.f37962e, oVar.f37962e) == 0 && Float.compare(this.f37963f, oVar.f37963f) == 0;
        }

        /* renamed from: f */
        public final float mo43436f() {
            return this.f37963f;
        }

        @C12579k
        /* renamed from: g */
        public final C15364o mo43437g(float f, float f2, float f3, float f4) {
            return new C15364o(f, f2, f3, f4);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f37960c) * 31) + Float.hashCode(this.f37961d)) * 31) + Float.hashCode(this.f37962e)) * 31) + Float.hashCode(this.f37963f);
        }

        /* renamed from: i */
        public final float mo43439i() {
            return this.f37960c;
        }

        /* renamed from: j */
        public final float mo43440j() {
            return this.f37962e;
        }

        /* renamed from: k */
        public final float mo43441k() {
            return this.f37961d;
        }

        /* renamed from: l */
        public final float mo43442l() {
            return this.f37963f;
        }

        @C12579k
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f37960c + ", dy1=" + this.f37961d + ", dx2=" + this.f37962e + ", dy2=" + this.f37963f + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$p */
    public static final class C15365p extends C15349f {

        /* renamed from: c */
        public final float f37964c;

        /* renamed from: d */
        public final float f37965d;

        /* renamed from: e */
        public final float f37966e;

        /* renamed from: f */
        public final float f37967f;

        public C15365p(float f, float f2, float f3, float f4) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f37964c = f;
            this.f37965d = f2;
            this.f37966e = f3;
            this.f37967f = f4;
        }

        /* renamed from: h */
        public static /* synthetic */ C15365p m67130h(C15365p pVar, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = pVar.f37964c;
            }
            if ((i & 2) != 0) {
                f2 = pVar.f37965d;
            }
            if ((i & 4) != 0) {
                f3 = pVar.f37966e;
            }
            if ((i & 8) != 0) {
                f4 = pVar.f37967f;
            }
            return pVar.mo43449g(f, f2, f3, f4);
        }

        /* renamed from: c */
        public final float mo43444c() {
            return this.f37964c;
        }

        /* renamed from: d */
        public final float mo43445d() {
            return this.f37965d;
        }

        /* renamed from: e */
        public final float mo43446e() {
            return this.f37966e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15365p)) {
                return false;
            }
            C15365p pVar = (C15365p) obj;
            return Float.compare(this.f37964c, pVar.f37964c) == 0 && Float.compare(this.f37965d, pVar.f37965d) == 0 && Float.compare(this.f37966e, pVar.f37966e) == 0 && Float.compare(this.f37967f, pVar.f37967f) == 0;
        }

        /* renamed from: f */
        public final float mo43448f() {
            return this.f37967f;
        }

        @C12579k
        /* renamed from: g */
        public final C15365p mo43449g(float f, float f2, float f3, float f4) {
            return new C15365p(f, f2, f3, f4);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f37964c) * 31) + Float.hashCode(this.f37965d)) * 31) + Float.hashCode(this.f37966e)) * 31) + Float.hashCode(this.f37967f);
        }

        /* renamed from: i */
        public final float mo43451i() {
            return this.f37964c;
        }

        /* renamed from: j */
        public final float mo43452j() {
            return this.f37966e;
        }

        /* renamed from: k */
        public final float mo43453k() {
            return this.f37965d;
        }

        /* renamed from: l */
        public final float mo43454l() {
            return this.f37967f;
        }

        @C12579k
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f37964c + ", dy1=" + this.f37965d + ", dx2=" + this.f37966e + ", dy2=" + this.f37967f + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$q */
    public static final class C15366q extends C15349f {

        /* renamed from: c */
        public final float f37968c;

        /* renamed from: d */
        public final float f37969d;

        public C15366q(float f, float f2) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f37968c = f;
            this.f37969d = f2;
        }

        /* renamed from: f */
        public static /* synthetic */ C15366q m67140f(C15366q qVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = qVar.f37968c;
            }
            if ((i & 2) != 0) {
                f2 = qVar.f37969d;
            }
            return qVar.mo43458e(f, f2);
        }

        /* renamed from: c */
        public final float mo43456c() {
            return this.f37968c;
        }

        /* renamed from: d */
        public final float mo43457d() {
            return this.f37969d;
        }

        @C12579k
        /* renamed from: e */
        public final C15366q mo43458e(float f, float f2) {
            return new C15366q(f, f2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15366q)) {
                return false;
            }
            C15366q qVar = (C15366q) obj;
            return Float.compare(this.f37968c, qVar.f37968c) == 0 && Float.compare(this.f37969d, qVar.f37969d) == 0;
        }

        /* renamed from: g */
        public final float mo43460g() {
            return this.f37968c;
        }

        /* renamed from: h */
        public final float mo43461h() {
            return this.f37969d;
        }

        public int hashCode() {
            return (Float.hashCode(this.f37968c) * 31) + Float.hashCode(this.f37969d);
        }

        @C12579k
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f37968c + ", dy=" + this.f37969d + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$r */
    public static final class C15367r extends C15349f {

        /* renamed from: c */
        public final float f37970c;

        public C15367r(float f) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37970c = f;
        }

        /* renamed from: e */
        public static /* synthetic */ C15367r m67146e(C15367r rVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = rVar.f37970c;
            }
            return rVar.mo43465d(f);
        }

        /* renamed from: c */
        public final float mo43464c() {
            return this.f37970c;
        }

        @C12579k
        /* renamed from: d */
        public final C15367r mo43465d(float f) {
            return new C15367r(f);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15367r) && Float.compare(this.f37970c, ((C15367r) obj).f37970c) == 0;
        }

        /* renamed from: f */
        public final float mo43467f() {
            return this.f37970c;
        }

        public int hashCode() {
            return Float.hashCode(this.f37970c);
        }

        @C12579k
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f37970c + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.graphics.vector.f$s */
    public static final class C15368s extends C15349f {

        /* renamed from: c */
        public final float f37971c;

        public C15368s(float f) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f37971c = f;
        }

        /* renamed from: e */
        public static /* synthetic */ C15368s m67150e(C15368s sVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = sVar.f37971c;
            }
            return sVar.mo43471d(f);
        }

        /* renamed from: c */
        public final float mo43470c() {
            return this.f37971c;
        }

        @C12579k
        /* renamed from: d */
        public final C15368s mo43471d(float f) {
            return new C15368s(f);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15368s) && Float.compare(this.f37971c, ((C15368s) obj).f37971c) == 0;
        }

        /* renamed from: f */
        public final float mo43473f() {
            return this.f37971c;
        }

        public int hashCode() {
            return Float.hashCode(this.f37971c);
        }

        @C12579k
        public String toString() {
            return "VerticalTo(y=" + this.f37971c + ')';
        }
    }

    public /* synthetic */ C15349f(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    /* renamed from: a */
    public final boolean mo43286a() {
        return this.f37911a;
    }

    /* renamed from: b */
    public final boolean mo43287b() {
        return this.f37912b;
    }

    public C15349f(boolean z, boolean z2) {
        this.f37911a = z;
        this.f37912b = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15349f(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (DefaultConstructorMarker) null);
    }
}
