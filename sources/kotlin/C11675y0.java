package kotlin;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.y0 */
public class C11675y0 extends C11672x0 {
    @C11110f
    /* renamed from: l */
    public static final <R> R m45798l(Object obj, C11289a<? extends R> aVar) {
        R invoke;
        Intrinsics.checkNotNullParameter(obj, "lock");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        return invoke;
    }
}
