package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11459g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.i */
public class C11462i<T extends Comparable<? super T>> implements C11459g<T> {
    @C12579k

    /* renamed from: a */
    public final T f28592a;
    @C12579k

    /* renamed from: b */
    public final T f28593b;

    public C11462i(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "start");
        Intrinsics.checkNotNullParameter(t2, "endInclusive");
        this.f28592a = t;
        this.f28593b = t2;
    }

    /* renamed from: e */
    public boolean mo23006e(@C12579k T t) {
        return C11459g.C11460a.m44245a(this, t);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11462i) {
            if (!isEmpty() || !((C11462i) obj).isEmpty()) {
                C11462i iVar = (C11462i) obj;
                if (!Intrinsics.areEqual((Object) getStart(), (Object) iVar.getStart()) || !Intrinsics.areEqual((Object) mo23013q(), (Object) iVar.mo23013q())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @C12579k
    public T getStart() {
        return this.f28592a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + mo23013q().hashCode();
    }

    public boolean isEmpty() {
        return C11459g.C11460a.m44246b(this);
    }

    @C12579k
    /* renamed from: q */
    public T mo23013q() {
        return this.f28593b;
    }

    @C12579k
    public String toString() {
        return getStart() + ".." + mo23013q();
    }
}
