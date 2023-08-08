package kotlin.ranges;

import com.google.firebase.perf.metrics.C33381i;
import kotlin.C11395k;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.c */
public final class C11452c extends C11446a implements C11459g<Character>, C11475r<Character> {
    @C12579k

    /* renamed from: e */
    public static final C11453a f28584e = new C11453a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final C11452c f28585f = new C11452c(1, 0);

    /* renamed from: kotlin.ranges.c$a */
    public static final class C11453a {
        public /* synthetic */ C11453a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C11452c mo23022a() {
            return C11452c.f28585f;
        }

        public C11453a() {
        }
    }

    public C11452c(char c, char c2) {
        super(c, c2, 1);
    }

    @C11395k(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: X */
    public static /* synthetic */ void m44166X() {
    }

    /* renamed from: Q */
    public boolean mo23018Q(char c) {
        return Intrinsics.compare((int) mo22998r(), (int) c) <= 0 && Intrinsics.compare((int) c, (int) mo23000w()) <= 0;
    }

    @C12579k
    /* renamed from: W */
    public Character mo23010h() {
        if (mo23000w() != 65535) {
            return Character.valueOf((char) (mo23000w() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo23006e(Comparable comparable) {
        return mo23018Q(((Character) comparable).charValue());
    }

    @C12579k
    /* renamed from: e0 */
    public Character mo23013q() {
        return Character.valueOf(mo23000w());
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11452c) {
            if (!isEmpty() || !((C11452c) obj).isEmpty()) {
                C11452c cVar = (C11452c) obj;
                if (!(mo22998r() == cVar.mo22998r() && mo23000w() == cVar.mo23000w())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f0 */
    public Character getStart() {
        return Character.valueOf(mo22998r());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo22998r() * C33381i.f81115x) + mo23000w();
    }

    public boolean isEmpty() {
        return Intrinsics.compare((int) mo22998r(), (int) mo23000w()) > 0;
    }

    @C12579k
    public String toString() {
        return mo22998r() + ".." + mo23000w();
    }
}
