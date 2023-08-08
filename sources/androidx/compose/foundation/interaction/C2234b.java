package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.interaction.b */
public interface C2234b extends C2240d {

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.interaction.b$a */
    public static final class C2235a implements C2234b {

        /* renamed from: a */
        public static final int f5991a = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.interaction.b$b */
    public static final class C2236b implements C2234b {

        /* renamed from: b */
        public static final int f5992b = 0;
        @C12579k

        /* renamed from: a */
        public final C2235a f5993a;

        public C2236b(@C12579k C2235a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "focus");
            this.f5993a = aVar;
        }

        @C12579k
        /* renamed from: a */
        public final C2235a mo7601a() {
            return this.f5993a;
        }
    }
}
