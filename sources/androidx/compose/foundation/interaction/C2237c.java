package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.interaction.c */
public interface C2237c extends C2240d {

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.interaction.c$a */
    public static final class C2238a implements C2237c {

        /* renamed from: a */
        public static final int f5994a = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.interaction.c$b */
    public static final class C2239b implements C2237c {

        /* renamed from: b */
        public static final int f5995b = 0;
        @C12579k

        /* renamed from: a */
        public final C2238a f5996a;

        public C2239b(@C12579k C2238a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "enter");
            this.f5996a = aVar;
        }

        @C12579k
        /* renamed from: a */
        public final C2238a mo7602a() {
            return this.f5996a;
        }
    }
}
