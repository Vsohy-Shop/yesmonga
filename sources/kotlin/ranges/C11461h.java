package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11475r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.ranges.h */
public class C11461h<T extends Comparable<? super T>> implements C11475r<T> {
    @C12579k

    /* renamed from: a */
    public final T f28590a;
    @C12579k

    /* renamed from: b */
    public final T f28591b;

    public C11461h(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "start");
        Intrinsics.checkNotNullParameter(t2, "endExclusive");
        this.f28590a = t;
        this.f28591b = t2;
    }

    /* renamed from: e */
    public boolean mo23006e(@C12579k T t) {
        return C11475r.C11476a.m44299a(this, t);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C11461h) {
            if (!isEmpty() || !((C11461h) obj).isEmpty()) {
                C11461h hVar = (C11461h) obj;
                if (!Intrinsics.areEqual((Object) getStart(), (Object) hVar.getStart()) || !Intrinsics.areEqual((Object) mo23010h(), (Object) hVar.mo23010h())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @C12579k
    public T getStart() {
        return this.f28590a;
    }

    @C12579k
    /* renamed from: h */
    public T mo23010h() {
        return this.f28591b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + mo23010h().hashCode();
    }

    public boolean isEmpty() {
        return C11475r.C11476a.m44300b(this);
    }

    @C12579k
    public String toString() {
        return getStart() + "..<" + mo23010h();
    }
}
