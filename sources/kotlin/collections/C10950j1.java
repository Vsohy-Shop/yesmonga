package kotlin.collections;

import java.util.Collection;
import kotlin.C10857a2;
import kotlin.C11097g2;
import kotlin.C11400l1;
import kotlin.C11404m1;
import kotlin.C11419p1;
import kotlin.C11431q1;
import kotlin.C11531s;
import kotlin.C11588t1;
import kotlin.C11662u1;
import kotlin.C11665v0;
import kotlin.C11679z1;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.j1 */
public class C10950j1 {
    @C11314h(name = "sumOfUByte")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: a */
    public static final int m40987a(@C12579k Iterable<C11400l1> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (C11400l1 e2 : iterable) {
            i = C11419p1.m43971M(i + C11419p1.m43971M(e2.mo22897e2() & 255));
        }
        return i;
    }

    @C11314h(name = "sumOfUInt")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: b */
    public static final int m40988b(@C12579k Iterable<C11419p1> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (C11419p1 j2 : iterable) {
            i = C11419p1.m43971M(i + j2.mo22930j2());
        }
        return i;
    }

    @C11314h(name = "sumOfULong")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: c */
    public static final long m40989c(@C12579k Iterable<C11588t1> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        long j = 0;
        for (C11588t1 j2 : iterable) {
            j = C11588t1.m44970M(j + j2.mo23301j2());
        }
        return j;
    }

    @C11314h(name = "sumOfUShort")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: d */
    public static final int m40990d(@C12579k Iterable<C11679z1> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (C11679z1 e2 : iterable) {
            i = C11419p1.m43971M(i + C11419p1.m43971M(e2.mo23548e2() & C11679z1.f28988d));
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: e */
    public static final byte[] m40991e(@C12579k Collection<C11400l1> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] i = C11404m1.m43814i(collection.size());
        int i2 = 0;
        for (C11400l1 e2 : collection) {
            C11404m1.m43816j0(i, i2, e2.mo22897e2());
            i2++;
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: f */
    public static final int[] m40992f(@C12579k Collection<C11419p1> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] i = C11431q1.m44050i(collection.size());
        int i2 = 0;
        for (C11419p1 j2 : collection) {
            C11431q1.m44052j0(i, i2, j2.mo22930j2());
            i2++;
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: g */
    public static final long[] m40993g(@C12579k Collection<C11588t1> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] i = C11662u1.m45756i(collection.size());
        int i2 = 0;
        for (C11588t1 j2 : collection) {
            C11662u1.m45758j0(i, i2, j2.mo23301j2());
            i2++;
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: h */
    public static final short[] m40994h(@C12579k Collection<C11679z1> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] i = C10857a2.m38732i(collection.size());
        int i2 = 0;
        for (C11679z1 e2 : collection) {
            C10857a2.m38734j0(i, i2, e2.mo23548e2());
            i2++;
        }
        return i;
    }
}
