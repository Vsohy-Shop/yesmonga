package androidx.compose.runtime;

import androidx.navigation.compose.C19710b;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.b */
public final class C8407b {
    /* renamed from: a */
    public static final void m30215a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "it");
    }

    /* renamed from: b */
    public static final int m30216b(@C12580l Object obj) {
        return System.identityHashCode(obj);
    }

    /* renamed from: c */
    public static final void m30217c(@C12579k C8592o oVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
        Intrinsics.checkNotNullParameter(pVar, C19710b.f50515e);
        ((C11304p) C11370u0.m43701q(pVar, 2)).invoke(oVar, 1);
    }

    /* renamed from: d */
    public static final <T> T m30218d(@C12579k C8592o oVar, @C12579k C11304p<? super C8592o, ? super Integer, ? extends T> pVar) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
        Intrinsics.checkNotNullParameter(pVar, C19710b.f50515e);
        return ((C11304p) C11370u0.m43701q(pVar, 2)).invoke(oVar, 1);
    }

    @C11532s0
    /* renamed from: e */
    public static final <R> R m30219e(@C12579k Object obj, @C12579k C11289a<? extends R> aVar) {
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
