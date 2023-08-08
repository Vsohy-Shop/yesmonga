package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.i */
public interface C26509i {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.i$a */
    public static final class C26510a implements C26509i {

        /* renamed from: b */
        public static final int f64787b = 0;
        @C12579k

        /* renamed from: a */
        public final String f64788a;

        public C26510a() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C26510a m112922c(C26510a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f64788a;
            }
            return aVar.mo77078b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo77077a() {
            return this.f64788a;
        }

        @C12579k
        /* renamed from: b */
        public final C26510a mo77078b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "accountName");
            return new C26510a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo77079d() {
            return this.f64788a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26510a) && Intrinsics.areEqual((Object) this.f64788a, (Object) ((C26510a) obj).f64788a);
        }

        public int hashCode() {
            return this.f64788a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f64788a;
            return "UserConnected(accountName=" + str + ")";
        }

        public C26510a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "accountName");
            this.f64788a = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26510a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.i$b */
    public static final class C26511b implements C26509i {
        @C12579k

        /* renamed from: a */
        public static final C26511b f64789a = new C26511b();

        /* renamed from: b */
        public static final int f64790b = 0;
    }
}
