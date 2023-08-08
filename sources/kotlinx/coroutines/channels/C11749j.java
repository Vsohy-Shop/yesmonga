package kotlinx.coroutines.channels;

import kotlin.C11532s0;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12177y1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11288f
/* renamed from: kotlinx.coroutines.channels.j */
public final class C11749j<T> {
    @C12579k

    /* renamed from: b */
    public static final C11751b f29170b = new C11751b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final C11752c f29171c = new C11752c();
    @C12580l

    /* renamed from: a */
    public final Object f29172a;

    /* renamed from: kotlinx.coroutines.channels.j$a */
    public static final class C11750a extends C11752c {
        @C12580l
        @C11287e

        /* renamed from: a */
        public final Throwable f29173a;

        public C11750a(@C12580l Throwable th) {
            this.f29173a = th;
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof C11750a) && Intrinsics.areEqual((Object) this.f29173a, (Object) ((C11750a) obj).f29173a);
        }

        public int hashCode() {
            Throwable th = this.f29173a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @C12579k
        public String toString() {
            return "Closed(" + this.f29173a + ')';
        }
    }

    @C12177y1
    /* renamed from: kotlinx.coroutines.channels.j$b */
    public static final class C11751b {
        public /* synthetic */ C11751b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12177y1
        @C12579k
        /* renamed from: a */
        public final <E> Object mo23925a(@C12580l Throwable th) {
            return C11749j.m46632c(new C11750a(th));
        }

        @C12177y1
        @C12579k
        /* renamed from: b */
        public final <E> Object mo23926b() {
            return C11749j.m46632c(C11749j.f29171c);
        }

        @C12177y1
        @C12579k
        /* renamed from: c */
        public final <E> Object mo23927c(E e) {
            return C11749j.m46632c(e);
        }

        public C11751b() {
        }
    }

    /* renamed from: kotlinx.coroutines.channels.j$c */
    public static class C11752c {
        @C12579k
        public String toString() {
            return "Failed";
        }
    }

    @C11532s0
    public /* synthetic */ C11749j(Object obj) {
        this.f29172a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C11749j m46631b(Object obj) {
        return new C11749j(obj);
    }

    @C12579k
    @C11532s0
    /* renamed from: c */
    public static <T> Object m46632c(@C12580l Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m46633d(Object obj, Object obj2) {
        return (obj2 instanceof C11749j) && Intrinsics.areEqual(obj, ((C11749j) obj2).mo23920o());
    }

    /* renamed from: e */
    public static final boolean m46634e(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @C12580l
    /* renamed from: f */
    public static final Throwable m46635f(Object obj) {
        C11750a aVar = obj instanceof C11750a ? (C11750a) obj : null;
        if (aVar != null) {
            return aVar.f29173a;
        }
        return null;
    }

    @C11532s0
    /* renamed from: g */
    public static /* synthetic */ void m46636g() {
    }

    @C12580l
    /* renamed from: h */
    public static final T m46637h(Object obj) {
        if (!(obj instanceof C11752c)) {
            return obj;
        }
        return null;
    }

    /* renamed from: i */
    public static final T m46638i(Object obj) {
        Throwable th;
        if (!(obj instanceof C11752c)) {
            return obj;
        }
        if (!(obj instanceof C11750a) || (th = ((C11750a) obj).f29173a) == null) {
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
        throw th;
    }

    /* renamed from: j */
    public static int m46639j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: k */
    public static final boolean m46640k(Object obj) {
        return obj instanceof C11750a;
    }

    /* renamed from: l */
    public static final boolean m46641l(Object obj) {
        return obj instanceof C11752c;
    }

    /* renamed from: m */
    public static final boolean m46642m(Object obj) {
        return !(obj instanceof C11752c);
    }

    @C12579k
    /* renamed from: n */
    public static String m46643n(Object obj) {
        if (obj instanceof C11750a) {
            return ((C11750a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m46633d(this.f29172a, obj);
    }

    public int hashCode() {
        return m46639j(this.f29172a);
    }

    /* renamed from: o */
    public final /* synthetic */ Object mo23920o() {
        return this.f29172a;
    }

    @C12579k
    public String toString() {
        return m46643n(this.f29172a);
    }
}
