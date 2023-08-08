package com.carrefour.fid.android.presentation.p035ui.product.search;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.d */
public final class C25565d {
    @C12579k

    /* renamed from: a */
    public static final C25567b f62827a = new C25567b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62828b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.d$a */
    public static final class C25566a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f62829a;

        /* renamed from: b */
        public final int f62830b;

        /* renamed from: c */
        public final int f62831c = R.id.action_additionalOrderProductSearchFragment_to_additionalOrderSearchResultFragment;

        public C25566a(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "searchText");
            this.f62829a = str;
            this.f62830b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C25566a m110138d(C25566a aVar, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.f62829a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f62830b;
            }
            return aVar.mo74415c(str, i);
        }

        @C12579k
        /* renamed from: a */
        public final String mo74413a() {
            return this.f62829a;
        }

        /* renamed from: b */
        public final int mo74414b() {
            return this.f62830b;
        }

        @C12579k
        /* renamed from: c */
        public final C25566a mo74415c(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "searchText");
            return new C25566a(str, i);
        }

        @C12579k
        /* renamed from: e */
        public final String mo74416e() {
            return this.f62829a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25566a)) {
                return false;
            }
            C25566a aVar = (C25566a) obj;
            return Intrinsics.areEqual((Object) this.f62829a, (Object) aVar.f62829a) && this.f62830b == aVar.f62830b;
        }

        /* renamed from: f */
        public final int mo74418f() {
            return this.f62830b;
        }

        public int getActionId() {
            return this.f62831c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("search_text", this.f62829a);
            bundle.putInt("sourceGraphId", this.f62830b);
            return bundle;
        }

        public int hashCode() {
            return (this.f62829a.hashCode() * 31) + Integer.hashCode(this.f62830b);
        }

        @C12579k
        public String toString() {
            String str = this.f62829a;
            int i = this.f62830b;
            return "ActionAdditionalOrderProductSearchFragmentToAdditionalOrderSearchResultFragment(searchText=" + str + ", sourceGraphId=" + i + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.d$b */
    public static final class C25567b {
        public /* synthetic */ C25567b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo74421a() {
            return new C19690a(R.id.action_additionalOrderProductSearchFragment_to_additionalOrderScanProductFragment);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo74422b(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "searchText");
            return new C25566a(str, i);
        }

        public C25567b() {
        }
    }
}
