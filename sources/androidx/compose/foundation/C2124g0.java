package androidx.compose.foundation;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C2855v
/* renamed from: androidx.compose.foundation.g0 */
public interface C2124g0 {
    @C12579k

    /* renamed from: a */
    public static final C2125a f5820a = C2125a.f5821a;

    /* renamed from: androidx.compose.foundation.g0$a */
    public static final class C2125a {

        /* renamed from: a */
        public static final /* synthetic */ C2125a f5821a = new C2125a();

        /* renamed from: androidx.compose.foundation.g0$a$a */
        public static final class C2126a implements C2124g0 {

            /* renamed from: b */
            public final /* synthetic */ float f5822b;

            public C2126a(float f) {
                this.f5822b = f;
            }

            /* renamed from: a */
            public final int mo7127a(@C12579k C16479d dVar, int i, int i2) {
                Intrinsics.checkNotNullParameter(dVar, "$this$MarqueeSpacing");
                return C11409d.m43851L0(this.f5822b * ((float) i2));
            }
        }

        @C2855v
        @C12579k
        /* renamed from: a */
        public final C2124g0 mo7314a(float f) {
            return new C2126a(f);
        }
    }

    @C2855v
    /* renamed from: a */
    int mo7127a(@C12579k C16479d dVar, int i, int i2);
}
