package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.b */
public interface C28007b {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.b$a */
    public static final class C28008a implements C28007b {

        /* renamed from: b */
        public static final int f67852b = 8;
        @C12579k

        /* renamed from: a */
        public final Throwable f67853a;

        public C28008a(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.f67853a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C28008a m117422c(C28008a aVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = aVar.f67853a;
            }
            return aVar.mo81491b(th);
        }

        @C12579k
        /* renamed from: a */
        public final Throwable mo81490a() {
            return this.f67853a;
        }

        @C12579k
        /* renamed from: b */
        public final C28008a mo81491b(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            return new C28008a(th);
        }

        @C12579k
        /* renamed from: d */
        public final Throwable mo81492d() {
            return this.f67853a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28008a) && Intrinsics.areEqual((Object) this.f67853a, (Object) ((C28008a) obj).f67853a);
        }

        public int hashCode() {
            return this.f67853a.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f67853a;
            return "OnError(throwable=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.b$b */
    public static final class C28009b implements C28007b {
        @C12579k

        /* renamed from: a */
        public static final C28009b f67854a = new C28009b();

        /* renamed from: b */
        public static final int f67855b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.b$c */
    public static final class C28010c implements C28007b {
        @C12579k

        /* renamed from: a */
        public static final C28010c f67856a = new C28010c();

        /* renamed from: b */
        public static final int f67857b = 0;
    }
}
