package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo22516d2 = {"Lkotlin/random/PlatformRandom;", "Lkotlin/random/a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/Random;", "impl", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "<init>", "(Ljava/util/Random;)V", "c", "a", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
final class PlatformRandom extends C11439a implements Serializable {
    @C12579k

    /* renamed from: c */
    public static final C11437a f28563c = new C11437a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;
    @C12579k
    private final Random impl;

    /* renamed from: kotlin.random.PlatformRandom$a */
    public static final class C11437a {
        public /* synthetic */ C11437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11437a() {
        }
    }

    public PlatformRandom(@C12579k Random random) {
        Intrinsics.checkNotNullParameter(random, "impl");
        this.impl = random;
    }

    @C12579k
    /* renamed from: r */
    public Random mo22975r() {
        return this.impl;
    }
}
