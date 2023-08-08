package androidx.compose.p004ui.text.platform;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.platform.y */
public final class C16399y {
    @C12579k
    /* renamed from: a */
    public static final C16400z m73981a() {
        return new C16400z();
    }

    /* renamed from: b */
    public static final <R> R m73982b(@C12579k C16400z zVar, @C12579k C11289a<? extends R> aVar) {
        R invoke;
        Intrinsics.checkNotNullParameter(zVar, "lock");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        synchronized (zVar) {
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
