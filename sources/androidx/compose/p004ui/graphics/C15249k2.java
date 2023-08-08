package androidx.compose.p004ui.graphics;

import android.graphics.ColorFilter;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.k2 */
public final class C15249k2 {
    @C12579k

    /* renamed from: b */
    public static final C15250a f37569b = new C15250a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final ColorFilter f37570a;

    /* renamed from: androidx.compose.ui.graphics.k2$a */
    public static final class C15250a {
        public /* synthetic */ C15250a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C15249k2 m66144d(C15250a aVar, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = C15325u1.f37708b.mo43042z();
            }
            return aVar.mo42868c(j, i);
        }

        @C8547h2
        @C12579k
        /* renamed from: a */
        public final C15249k2 mo42866a(@C12579k float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, "colorMatrix");
            return C15214g0.m65960a(fArr);
        }

        @C8547h2
        @C12579k
        /* renamed from: b */
        public final C15249k2 mo42867b(long j, long j2) {
            return C15214g0.m65961b(j, j2);
        }

        @C8547h2
        @C12579k
        /* renamed from: c */
        public final C15249k2 mo42868c(long j, int i) {
            return C15214g0.m65962c(j, i);
        }

        public C15250a() {
        }
    }

    public C15249k2(@C12579k ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(colorFilter, "nativeColorFilter");
        this.f37570a = colorFilter;
    }

    @C12579k
    /* renamed from: a */
    public final ColorFilter mo42865a() {
        return this.f37570a;
    }
}
