package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.interaction.i */
public interface C2245i extends C2240d {

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.interaction.i$a */
    public static final class C2246a implements C2245i {

        /* renamed from: b */
        public static final int f5998b = 0;
        @C12579k

        /* renamed from: a */
        public final C2247b f5999a;

        public C2246a(@C12579k C2247b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "press");
            this.f5999a = bVar;
        }

        @C12579k
        /* renamed from: a */
        public final C2247b mo7607a() {
            return this.f5999a;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.interaction.i$b */
    public static final class C2247b implements C2245i {

        /* renamed from: b */
        public static final int f6000b = 0;

        /* renamed from: a */
        public final long f6001a;

        public /* synthetic */ C2247b(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: a */
        public final long mo7608a() {
            return this.f6001a;
        }

        public C2247b(long j) {
            this.f6001a = j;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.foundation.interaction.i$c */
    public static final class C2248c implements C2245i {

        /* renamed from: b */
        public static final int f6002b = 0;
        @C12579k

        /* renamed from: a */
        public final C2247b f6003a;

        public C2248c(@C12579k C2247b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "press");
            this.f6003a = bVar;
        }

        @C12579k
        /* renamed from: a */
        public final C2247b mo7609a() {
            return this.f6003a;
        }
    }
}
