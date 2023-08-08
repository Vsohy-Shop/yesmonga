package kotlin.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.C11440b;
import kotlin.random.Random;
import kotlin.text.C11607h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* renamed from: kotlin.internal.l */
public class C11123l {

    @C11363r0({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    /* renamed from: kotlin.internal.l$a */
    public static final class C11124a {
        @C12579k

        /* renamed from: a */
        public static final C11124a f28282a = new C11124a();
        @C12580l
        @C11287e

        /* renamed from: b */
        public static final Method f28283b;
        @C12580l
        @C11287e

        /* renamed from: c */
        public static final Method f28284c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                kotlin.internal.l$a r0 = new kotlin.internal.l$a
                r0.<init>()
                f28282a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
                java.lang.Object r7 = kotlin.collections.ArraysKt___ArraysKt.m39667bu(r7)
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = r3
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f28283b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f28284c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.C11123l.C11124a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo22535a(@C12579k Throwable th, @C12579k Throwable th2) {
        Intrinsics.checkNotNullParameter(th, "cause");
        Intrinsics.checkNotNullParameter(th2, "exception");
        Method method = C11124a.f28283b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    @C12579k
    /* renamed from: b */
    public Random mo22538b() {
        return new C11440b();
    }

    @C12580l
    /* renamed from: c */
    public C11607h mo22539c(@C12579k MatchResult matchResult, @C12579k String str) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @C12579k
    /* renamed from: d */
    public List<Throwable> mo22536d(@C12579k Throwable th) {
        Object invoke;
        List<Throwable> t;
        Intrinsics.checkNotNullParameter(th, "exception");
        Method method = C11124a.f28284c;
        if (method == null || (invoke = method.invoke(th, new Object[0])) == null || (t = C10956m.m41290t((Throwable[]) invoke)) == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return t;
    }
}
