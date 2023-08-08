package androidx.compose.runtime;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.q2 */
public final class C8605q2 {
    /* renamed from: a */
    public static final <T> T m31230a(@C12579k String str, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(str, "sectionName");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        C8601p2 p2Var = C8601p2.f23036a;
        Object a = p2Var.mo16288a(str);
        try {
            T invoke = aVar.invoke();
            C11322b0.m43481d(1);
            p2Var.mo16289b(a);
            C11322b0.m43480c(1);
            return invoke;
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            C8601p2.f23036a.mo16289b(a);
            C11322b0.m43480c(1);
            throw th;
        }
    }
}
