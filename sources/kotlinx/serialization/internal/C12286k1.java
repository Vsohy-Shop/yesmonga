package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11324c0;
import kotlin.jvm.internal.C11332g0;
import kotlin.jvm.internal.C11341l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11354n;
import kotlin.jvm.internal.C11358p;
import kotlin.jvm.internal.C11359p0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.C11369u;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlin.text.C11601c;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.internal.k1 */
public final class C12286k1 {
    @C12579k

    /* renamed from: a */
    public static final Map<C11494d<? extends Object>, C12248g<? extends Object>> f30082a = C10977s0.m41456W(C11078d1.m42659a(C11342l0.m43547d(String.class), C12197a.m48800F(C11368t0.f28504a)), C11078d1.m42659a(C11342l0.m43547d(Character.TYPE), C12197a.m48826z(C11358p.f28476a)), C11078d1.m42659a(C11342l0.m43547d(char[].class), C12197a.m48805e()), C11078d1.m42659a(C11342l0.m43547d(Double.TYPE), C12197a.m48795A(C11369u.f28505a)), C11078d1.m42659a(C11342l0.m43547d(double[].class), C12197a.m48806f()), C11078d1.m42659a(C11342l0.m43547d(Float.TYPE), C12197a.m48796B(C11377x.f28521a)), C11078d1.m42659a(C11342l0.m43547d(float[].class), C12197a.m48807g()), C11078d1.m42659a(C11342l0.m43547d(Long.TYPE), C12197a.m48798D(C11332g0.f28449a)), C11078d1.m42659a(C11342l0.m43547d(long[].class), C12197a.m48810j()), C11078d1.m42659a(C11342l0.m43547d(Integer.TYPE), C12197a.m48797C(C11324c0.f28435a)), C11078d1.m42659a(C11342l0.m43547d(int[].class), C12197a.m48808h()), C11078d1.m42659a(C11342l0.m43547d(Short.TYPE), C12197a.m48799E(C11359p0.f28487a)), C11078d1.m42659a(C11342l0.m43547d(short[].class), C12197a.m48815o()), C11078d1.m42659a(C11342l0.m43547d(Byte.TYPE), C12197a.m48825y(C11354n.f28470a)), C11078d1.m42659a(C11342l0.m43547d(byte[].class), C12197a.m48804d()), C11078d1.m42659a(C11342l0.m43547d(Boolean.TYPE), C12197a.m48824x(C11341l.f28464a)), C11078d1.m42659a(C11342l0.m43547d(boolean[].class), C12197a.m48803c()), C11078d1.m42659a(C11342l0.m43547d(C11079d2.class), C12197a.m48823w(C11079d2.f28267a)));

    @C12579k
    /* renamed from: a */
    public static final C12217f m49371a(@C12579k String str, @C12579k C12207e eVar) {
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(eVar, "kind");
        m49374d(str);
        return new C12283j1(str, eVar);
    }

    @C12580l
    /* renamed from: b */
    public static final <T> C12248g<T> m49372b(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f30082a.get(dVar);
    }

    /* renamed from: c */
    public static final String m49373c(String str) {
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append(Character.isLowerCase(charAt) ? C11601c.m45208N(charAt) : String.valueOf(charAt));
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m49374d(java.lang.String r4) {
        /*
            java.util.Map<kotlin.reflect.d<? extends java.lang.Object>, kotlinx.serialization.g<? extends java.lang.Object>> r0 = f30082a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r0.next()
            kotlin.reflect.d r1 = (kotlin.reflect.C11494d) r1
            java.lang.String r1 = r1.mo22848s()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r1 = m49373c(r1)
            java.lang.String r2 = "kotlin."
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            r3 = 1
            boolean r2 = kotlin.text.C11622t.equals(r4, r2, r3)
            if (r2 != 0) goto L_0x0035
            boolean r2 = kotlin.text.C11622t.equals(r4, r1, r3)
            if (r2 != 0) goto L_0x0035
            goto L_0x000a
        L_0x0035:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " there already exist "
            r2.append(r4)
            java.lang.String r4 = m49373c(r1)
            r2.append(r4)
            java.lang.String r4 = "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r4 = kotlin.text.StringsKt__IndentKt.trimIndent(r4)
            r0.<init>(r4)
            throw r0
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.C12286k1.m49374d(java.lang.String):void");
    }

    /* renamed from: e */
    public static /* synthetic */ void m49375e() {
    }
}
