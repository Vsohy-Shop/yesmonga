package kotlin.time.jdk8;

import kotlin.C11097g2;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11636e;
import kotlin.time.C11639g;
import kotlin.time.C11646k;
import kotlin.time.DurationUnit;
import p073j$.time.Duration;

@C11314h(name = "DurationConversionsJDK8Kt")
@C11363r0({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n720#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
/* renamed from: kotlin.time.jdk8.a */
public final class C11645a {
    @C11097g2(markerClass = {C11646k.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: a */
    public static final Duration m45661a(long j) {
        Duration ofSeconds = Duration.ofSeconds(C11636e.m45494q1(j), (long) C11636e.m45441B1(j));
        Intrinsics.checkNotNullExpressionValue(ofSeconds, "toJavaDuration-LRDsOJo");
        return ofSeconds;
    }

    @C11097g2(markerClass = {C11646k.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: b */
    public static final long m45662b(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return C11636e.m45469c2(C11639g.m45640n0(duration.getSeconds(), DurationUnit.SECONDS), C11639g.m45638m0(duration.getNano(), DurationUnit.NANOSECONDS));
    }
}
