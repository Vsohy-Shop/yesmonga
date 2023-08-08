package kotlin.internal.jdk7;

import java.util.List;
import kotlin.collections.C10956m;
import kotlin.internal.C11123l;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.internal.jdk7.a */
public class C11115a extends C11123l {

    @C11363r0({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    /* renamed from: kotlin.internal.jdk7.a$a */
    public static final class C11116a {
        @C12579k

        /* renamed from: a */
        public static final C11116a f28278a = new C11116a();
        @C12580l
        @C11287e

        /* renamed from: b */
        public static final Integer f28279b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                kotlin.internal.jdk7.a$a r0 = new kotlin.internal.jdk7.a$a
                r0.<init>()
                f28278a = r0
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
                f28279b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk7.C11115a.C11116a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo22535a(@C12579k Throwable th, @C12579k Throwable th2) {
        Intrinsics.checkNotNullParameter(th, "cause");
        Intrinsics.checkNotNullParameter(th2, "exception");
        if (mo22537e(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo22535a(th, th2);
        }
    }

    @C12579k
    /* renamed from: d */
    public List<Throwable> mo22536d(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "exception");
        if (!mo22537e(19)) {
            return super.mo22536d(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "exception.suppressed");
        return C10956m.m41290t(suppressed);
    }

    /* renamed from: e */
    public final boolean mo22537e(int i) {
        Integer num = C11116a.f28279b;
        return num == null || num.intValue() >= i;
    }
}
