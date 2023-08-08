package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8547h2;
import org.jetbrains.annotations.C12579k;

@C8547h2
/* renamed from: androidx.compose.foundation.n0 */
public interface C2628n0 {
    @C12579k

    /* renamed from: a */
    public static final C2629a f6965a = C2629a.f6966a;

    /* renamed from: androidx.compose.foundation.n0$a */
    public static final class C2629a {

        /* renamed from: a */
        public static final /* synthetic */ C2629a f6966a = new C2629a();

        @C8547h2
        @C12579k
        /* renamed from: a */
        public final C2628n0 mo9046a() {
            if (!MagnifierKt.m8979c(0, 1, (Object) null)) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            } else if (Build.VERSION.SDK_INT == 28) {
                return C2856v0.f7483b;
            } else {
                return C2127g1.f5823b;
            }
        }
    }

    @C12579k
    /* renamed from: a */
    C2626m0 mo7315a(@C12579k C2116e0 e0Var, @C12579k View view, @C12579k C16479d dVar, float f);

    /* renamed from: b */
    boolean mo7316b();
}
