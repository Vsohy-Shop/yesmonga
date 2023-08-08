package kotlin.sequences;

import kotlin.C11097g2;
import kotlin.C11400l1;
import kotlin.C11419p1;
import kotlin.C11531s;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.C11679z1;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.sequences.y */
public class C11577y {
    @C11314h(name = "sumOfUByte")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: a */
    public static final int m44938a(@C12579k C11559m<C11400l1> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i = 0;
        for (C11400l1 e2 : mVar) {
            i = C11419p1.m43971M(i + C11419p1.m43971M(e2.mo22897e2() & 255));
        }
        return i;
    }

    @C11314h(name = "sumOfUInt")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: b */
    public static final int m44939b(@C12579k C11559m<C11419p1> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i = 0;
        for (C11419p1 j2 : mVar) {
            i = C11419p1.m43971M(i + j2.mo22930j2());
        }
        return i;
    }

    @C11314h(name = "sumOfULong")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: c */
    public static final long m44940c(@C12579k C11559m<C11588t1> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        long j = 0;
        for (C11588t1 j2 : mVar) {
            j = C11588t1.m44970M(j + j2.mo23301j2());
        }
        return j;
    }

    @C11314h(name = "sumOfUShort")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    /* renamed from: d */
    public static final int m44941d(@C12579k C11559m<C11679z1> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i = 0;
        for (C11679z1 e2 : mVar) {
            i = C11419p1.m43971M(i + C11419p1.m43971M(e2.mo23548e2() & C11679z1.f28988d));
        }
        return i;
    }
}
