package androidx.compose.foundation.pager;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C2855v
/* renamed from: androidx.compose.foundation.pager.b */
public interface C2651b {

    @C2855v
    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.pager.b$a */
    public static final class C2652a implements C2651b {
        @C12579k

        /* renamed from: a */
        public static final C2652a f7021a = new C2652a();

        /* renamed from: b */
        public static final int f7022b = 0;

        /* renamed from: a */
        public int mo9111a(@C12579k C16479d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return i;
        }
    }

    @C2855v
    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.pager.b$b */
    public static final class C2653b implements C2651b {

        /* renamed from: b */
        public static final int f7023b = 0;

        /* renamed from: a */
        public final float f7024a;

        public /* synthetic */ C2653b(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        /* renamed from: a */
        public int mo9111a(@C12579k C16479d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            return dVar.mo7429n2(this.f7024a);
        }

        /* renamed from: b */
        public final float mo9112b() {
            return this.f7024a;
        }

        public C2653b(float f) {
            this.f7024a = f;
        }
    }

    /* renamed from: a */
    int mo9111a(@C12579k C16479d dVar, int i, int i2);
}
