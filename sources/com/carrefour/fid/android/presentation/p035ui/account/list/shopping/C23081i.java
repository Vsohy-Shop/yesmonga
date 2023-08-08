package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.i */
public interface C23081i {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.i$a */
    public static final class C23082a implements C23081i {

        /* renamed from: b */
        public static final int f58748b = 8;
        @C12579k

        /* renamed from: a */
        public final Throwable f58749a;

        public C23082a(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.f58749a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C23082a m103621c(C23082a aVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = aVar.f58749a;
            }
            return aVar.mo67798b(th);
        }

        @C12579k
        /* renamed from: a */
        public final Throwable mo67797a() {
            return this.f58749a;
        }

        @C12579k
        /* renamed from: b */
        public final C23082a mo67798b(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            return new C23082a(th);
        }

        @C12579k
        /* renamed from: d */
        public final Throwable mo67799d() {
            return this.f58749a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23082a) && Intrinsics.areEqual((Object) this.f58749a, (Object) ((C23082a) obj).f58749a);
        }

        public int hashCode() {
            return this.f58749a.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f58749a;
            return "ShoppingListSideEffectError(throwable=" + th + ")";
        }
    }
}
