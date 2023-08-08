package kotlinx.serialization.json.internal;

import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10944i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11621s;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.e */
public final class C12367e {
    @C12579k

    /* renamed from: a */
    public static final C12367e f30287a = new C12367e();
    @C12579k

    /* renamed from: b */
    public static final C10944i<char[]> f30288b = new C10944i<>();

    /* renamed from: c */
    public static int f30289c;

    /* renamed from: d */
    public static final int f30290d;

    static {
        Object obj;
        int i;
        try {
            Result.C10852a aVar = Result.f28060a;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            obj = Result.m38702b(C11621s.toIntOrNull(property));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38709i(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            i = 1048576;
        } else {
            i = num.intValue();
        }
        f30290d = i;
    }

    /* renamed from: a */
    public final void mo25491a(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "array");
        synchronized (this) {
            int i = f30289c;
            if (cArr.length + i < f30290d) {
                f30289c = i + cArr.length;
                f30288b.mo22308q(cArr);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    @C12579k
    /* renamed from: b */
    public final char[] mo25492b() {
        char[] s0;
        synchronized (this) {
            s0 = f30288b.mo22314s0();
            if (s0 == null) {
                s0 = null;
            } else {
                f30289c -= s0.length;
            }
        }
        if (s0 == null) {
            return new char[128];
        }
        return s0;
    }
}
