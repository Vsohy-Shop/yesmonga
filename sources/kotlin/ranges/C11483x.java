package kotlin.ranges;

import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11419p1;
import kotlin.C11429q;
import kotlin.C11531s;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.5")
@C11097g2(markerClass = {C11531s.class})
/* renamed from: kotlin.ranges.x */
public final class C11483x extends C11480v implements C11459g<C11419p1>, C11475r<C11419p1> {
    @C12579k

    /* renamed from: e */
    public static final C11484a f28626e = new C11484a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final C11483x f28627f = new C11483x(-1, 0, (DefaultConstructorMarker) null);

    /* renamed from: kotlin.ranges.x$a */
    public static final class C11484a {
        public /* synthetic */ C11484a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11483x mo23109a() {
            return C11483x.f28627f;
        }

        public C11484a() {
        }
    }

    public /* synthetic */ C11483x(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @C11395k(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: W */
    public static /* synthetic */ void m44471W() {
    }

    /* renamed from: M */
    public boolean mo23105M(int i) {
        return Integer.compare(mo23096r() ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE) <= 0 && Integer.compare(i ^ Integer.MIN_VALUE, mo23098w() ^ Integer.MIN_VALUE) <= 0;
    }

    /* renamed from: Q */
    public int mo23106Q() {
        if (mo23098w() != -1) {
            return C11419p1.m43971M(mo23098w() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* renamed from: X */
    public int mo23107X() {
        return mo23098w();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23105M(((C11419p1) comparable).mo22930j2());
    }

    /* renamed from: e0 */
    public int mo23108e0() {
        return mo23096r();
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11483x) {
            if (!isEmpty() || !((C11483x) obj).isEmpty()) {
                C11483x xVar = (C11483x) obj;
                if (!(mo23096r() == xVar.mo23096r() && mo23098w() == xVar.mo23098w())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Comparable getStart() {
        return C11419p1.m43993g(mo23108e0());
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ Comparable mo23010h() {
        return C11419p1.m43993g(mo23106Q());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo23096r() * 31) + mo23098w();
    }

    public boolean isEmpty() {
        return Integer.compare(mo23096r() ^ Integer.MIN_VALUE, mo23098w() ^ Integer.MIN_VALUE) > 0;
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ Comparable mo23013q() {
        return C11419p1.m43993g(mo23107X());
    }

    @C12579k
    public String toString() {
        return C11419p1.m43984Y1(mo23096r()) + ".." + C11419p1.m43984Y1(mo23098w());
    }

    public C11483x(int i, int i2) {
        super(i, i2, 1, (DefaultConstructorMarker) null);
    }
}
