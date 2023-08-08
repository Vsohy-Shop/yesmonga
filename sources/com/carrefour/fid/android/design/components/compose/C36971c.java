package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.c */
public interface C36971c {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.c$a */
    public static final class C36972a implements C36971c {
        @C12579k

        /* renamed from: a */
        public static final C36972a f92358a = new C36972a();

        /* renamed from: b */
        public static final int f92359b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.c$b */
    public static final class C36973b implements C36971c {
        @C12579k

        /* renamed from: a */
        public static final C36973b f92360a = new C36973b();

        /* renamed from: b */
        public static final int f92361b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.c$c */
    public static final class C36974c implements C36971c {

        /* renamed from: b */
        public static final int f92362b = 0;
        @C12579k

        /* renamed from: a */
        public final String f92363a;

        public C36974c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "code");
            this.f92363a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C36974c m151678c(C36974c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f92363a;
            }
            return cVar.mo112349b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112348a() {
            return this.f92363a;
        }

        @C12579k
        /* renamed from: b */
        public final C36974c mo112349b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "code");
            return new C36974c(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo112350d() {
            return this.f92363a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36974c) && Intrinsics.areEqual((Object) this.f92363a, (Object) ((C36974c) obj).f92363a);
        }

        public int hashCode() {
            return this.f92363a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f92363a;
            return "Prefilled(code=" + str + ")";
        }
    }
}
