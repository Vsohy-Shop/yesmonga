package kotlin.internal.jdk8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.internal.jdk7.C11115a;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.jdk8.C11445a;
import kotlin.ranges.C11466l;
import kotlin.text.C11607h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.internal.jdk8.d */
public class C11120d extends C11115a {

    @C11363r0({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* renamed from: kotlin.internal.jdk8.d$a */
    public static final class C11121a {
        @C12579k

        /* renamed from: a */
        public static final C11121a f28280a = new C11121a();
        @C12580l
        @C11287e

        /* renamed from: b */
        public static final Integer f28281b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                kotlin.internal.jdk8.d$a r0 = new kotlin.internal.jdk8.d$a
                r0.<init>()
                f28280a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f28281b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk8.C11120d.C11121a.<clinit>():void");
        }
    }

    /* renamed from: e */
    private final boolean m42823e(int i) {
        Integer num = C11121a.f28281b;
        return num == null || num.intValue() >= i;
    }

    @C12579k
    /* renamed from: b */
    public Random mo22538b() {
        return m42823e(34) ? new C11445a() : super.mo22538b();
    }

    @C12580l
    /* renamed from: c */
    public C11607h mo22539c(@C12579k MatchResult matchResult, @C12579k String str) {
        Matcher matcher;
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(str, "name");
        if (matchResult instanceof Matcher) {
            matcher = (Matcher) matchResult;
        } else {
            matcher = null;
        }
        if (matcher != null) {
            C11466l lVar = new C11466l(matcher.start(str), matcher.end(str) - 1);
            if (lVar.getStart().intValue() < 0) {
                return null;
            }
            String a = matcher.group(str);
            Intrinsics.checkNotNullExpressionValue(a, "matcher.group(name)");
            return new C11607h(a, lVar);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
