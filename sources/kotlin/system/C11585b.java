package kotlin.system;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "TimingKt")
/* renamed from: kotlin.system.b */
public final class C11585b {
    /* renamed from: a */
    public static final long m44954a(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        long nanoTime = System.nanoTime();
        aVar.invoke();
        return System.nanoTime() - nanoTime;
    }

    /* renamed from: b */
    public static final long m44955b(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        long currentTimeMillis = System.currentTimeMillis();
        aVar.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
