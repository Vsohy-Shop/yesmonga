package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.f */
public interface C27739f {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.f$a */
    public static final class C27740a implements C27739f {

        /* renamed from: b */
        public static final int f67263b = 8;
        @C12579k

        /* renamed from: a */
        public final Throwable f67264a;

        public C27740a(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.f67264a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C27740a m116568c(C27740a aVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = aVar.f67264a;
            }
            return aVar.mo80538b(th);
        }

        @C12579k
        /* renamed from: a */
        public final Throwable mo80537a() {
            return this.f67264a;
        }

        @C12579k
        /* renamed from: b */
        public final C27740a mo80538b(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            return new C27740a(th);
        }

        @C12579k
        /* renamed from: d */
        public final Throwable mo80539d() {
            return this.f67264a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27740a) && Intrinsics.areEqual((Object) this.f67264a, (Object) ((C27740a) obj).f67264a);
        }

        public int hashCode() {
            return this.f67264a.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f67264a;
            return "UpdateError(throwable=" + th + ")";
        }
    }
}
