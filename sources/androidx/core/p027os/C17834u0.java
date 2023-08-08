package androidx.core.p027os;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.os.u0 */
public final class C17834u0 {
    @C11395k(message = "Use androidx.tracing.Trace instead", replaceWith = @C11587t0(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    /* renamed from: a */
    public static final <T> T m81277a(@C12579k String str, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(str, "sectionName");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        C17821p0.m81248b(str);
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            C17821p0.m81250d();
            C11322b0.m43480c(1);
        }
    }
}
