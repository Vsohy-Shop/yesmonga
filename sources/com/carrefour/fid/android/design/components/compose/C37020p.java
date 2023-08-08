package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.p */
public interface C37020p {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.p$a */
    public static final class C37021a implements C37020p {

        /* renamed from: c */
        public static final int f92535c = 0;
        @C12579k

        /* renamed from: a */
        public final String f92536a;
        @C12579k

        /* renamed from: b */
        public final String f92537b;

        public C37021a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "date");
            Intrinsics.checkNotNullParameter(str2, "time");
            this.f92536a = str;
            this.f92537b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C37021a m151910d(C37021a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f92536a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f92537b;
            }
            return aVar.mo112657c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112655a() {
            return this.f92536a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo112656b() {
            return this.f92537b;
        }

        @C12579k
        /* renamed from: c */
        public final C37021a mo112657c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "date");
            Intrinsics.checkNotNullParameter(str2, "time");
            return new C37021a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo112658e() {
            return this.f92536a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37021a)) {
                return false;
            }
            C37021a aVar = (C37021a) obj;
            return Intrinsics.areEqual((Object) this.f92536a, (Object) aVar.f92536a) && Intrinsics.areEqual((Object) this.f92537b, (Object) aVar.f92537b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo112660f() {
            return this.f92537b;
        }

        public int hashCode() {
            return (this.f92536a.hashCode() * 31) + this.f92537b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f92536a;
            String str2 = this.f92537b;
            return "SlotBooked(date=" + str + ", time=" + str2 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.p$b */
    public static final class C37022b implements C37020p {
        @C12579k

        /* renamed from: a */
        public static final C37022b f92538a = new C37022b();

        /* renamed from: b */
        public static final int f92539b = 0;
    }
}
