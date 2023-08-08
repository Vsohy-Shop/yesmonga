package androidx.compose.p004ui.platform;

import androidx.core.graphics.drawable.IconCompat;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Arrays;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.y0 */
public final class C15999y0 {
    @C12579k
    /* renamed from: a */
    public static final Object m71810a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return obj.getClass();
    }

    @C12579k
    /* renamed from: b */
    public static final String m71811b(@C12579k Object obj, @C12580l String str) {
        Intrinsics.checkNotNullParameter(obj, IconCompat.f45868A);
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    /* renamed from: c */
    public static final <R> R m71812c(@C12579k Object obj, @C12579k C11289a<? extends R> aVar) {
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
