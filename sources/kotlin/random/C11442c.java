package kotlin.random;

import java.util.Random;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.internal.C11125m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.random.c */
public final class C11442c {
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: a */
    public static final Random m44115a(@C12579k Random random) {
        C11439a aVar;
        Random r;
        Intrinsics.checkNotNullParameter(random, "<this>");
        if (random instanceof C11439a) {
            aVar = (C11439a) random;
        } else {
            aVar = null;
        }
        if (aVar == null || (r = aVar.mo22975r()) == null) {
            return new KotlinRandom(random);
        }
        return r;
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: b */
    public static final Random m44116b(@C12579k Random random) {
        KotlinRandom kotlinRandom;
        Random a;
        Intrinsics.checkNotNullParameter(random, "<this>");
        if (random instanceof KotlinRandom) {
            kotlinRandom = (KotlinRandom) random;
        } else {
            kotlinRandom = null;
        }
        if (kotlinRandom == null || (a = kotlinRandom.mo22965a()) == null) {
            return new PlatformRandom(random);
        }
        return a;
    }

    @C11110f
    /* renamed from: c */
    public static final Random m44117c() {
        return C11125m.f28285a.mo22538b();
    }

    /* renamed from: d */
    public static final double m44118d(int i, int i2) {
        return ((double) ((((long) i) << 27) + ((long) i2))) / 9.007199254740992E15d;
    }
}
