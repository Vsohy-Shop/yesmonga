package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.C11439a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.random.jdk8.a */
public final class C11445a extends C11439a {
    /* renamed from: i */
    public double mo22982i(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    /* renamed from: n */
    public int mo22987n(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    /* renamed from: p */
    public long mo22989p(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    /* renamed from: q */
    public long mo22990q(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @C12579k
    /* renamed from: r */
    public Random mo22975r() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current()");
        return current;
    }
}
