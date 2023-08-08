package com.carrefour.fid.android.presentation.p035ui.product.search;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.n */
public final class C25578n {
    @C12579k

    /* renamed from: a */
    public static final C25580b f62855a = new C25580b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62856b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.n$a */
    public static final class C25579a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f62857a;
        @C12580l

        /* renamed from: b */
        public final String f62858b;

        /* renamed from: c */
        public final int f62859c;

        public C25579a() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C25579a m110161d(C25579a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f62857a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f62858b;
            }
            return aVar.mo74450c(str, str2);
        }

        @C12580l
        /* renamed from: a */
        public final String mo74448a() {
            return this.f62857a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo74449b() {
            return this.f62858b;
        }

        @C12579k
        /* renamed from: c */
        public final C25579a mo74450c(@C12580l String str, @C12580l String str2) {
            return new C25579a(str, str2);
        }

        @C12580l
        /* renamed from: e */
        public final String mo74451e() {
            return this.f62858b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25579a)) {
                return false;
            }
            C25579a aVar = (C25579a) obj;
            return Intrinsics.areEqual((Object) this.f62857a, (Object) aVar.f62857a) && Intrinsics.areEqual((Object) this.f62858b, (Object) aVar.f62858b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo74453f() {
            return this.f62857a;
        }

        public int getActionId() {
            return this.f62859c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(C28547h2.f69319g, this.f62857a);
            bundle.putString(C28547h2.f69320h, this.f62858b);
            return bundle;
        }

        public int hashCode() {
            String str = this.f62857a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f62858b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            String str = this.f62857a;
            String str2 = this.f62858b;
            return "ActionProductSearchFragmentToScanBarCodeFragment(slotId=" + str + ", facilityServiceId=" + str2 + ")";
        }

        public C25579a(@C12580l String str, @C12580l String str2) {
            this.f62857a = str;
            this.f62858b = str2;
            this.f62859c = R.id.action_productSearchFragment_to_scanBarCodeFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25579a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.n$b */
    public static final class C25580b {
        public /* synthetic */ C25580b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C19693b0 m110167c(C25580b bVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bVar.mo74457b(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo74456a() {
            return new C19690a(R.id.action_productSearchFragment_to_productSearchWithListFragment);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo74457b(@C12580l String str, @C12580l String str2) {
            return new C25579a(str, str2);
        }

        public C25580b() {
        }
    }
}
