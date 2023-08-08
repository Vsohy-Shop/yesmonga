package com.carrefour.fid.android.presentation.p035ui.account.list;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.b */
public final class C22947b {
    @C12579k

    /* renamed from: a */
    public static final C22949b f58565a = new C22949b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f58566b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.b$a */
    public static final class C22948a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final Bundle f58567a;

        /* renamed from: b */
        public final int f58568b;

        /* renamed from: c */
        public final int f58569c;

        public C22948a() {
            this((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C22948a m103334d(C22948a aVar, Bundle bundle, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bundle = aVar.f58567a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f58568b;
            }
            return aVar.mo67498c(bundle, i);
        }

        @C12580l
        /* renamed from: a */
        public final Bundle mo67496a() {
            return this.f58567a;
        }

        /* renamed from: b */
        public final int mo67497b() {
            return this.f58568b;
        }

        @C12579k
        /* renamed from: c */
        public final C22948a mo67498c(@C12580l Bundle bundle, int i) {
            return new C22948a(bundle, i);
        }

        @C12580l
        /* renamed from: e */
        public final Bundle mo67499e() {
            return this.f58567a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22948a)) {
                return false;
            }
            C22948a aVar = (C22948a) obj;
            return Intrinsics.areEqual((Object) this.f58567a, (Object) aVar.f58567a) && this.f58568b == aVar.f58568b;
        }

        /* renamed from: f */
        public final int mo67501f() {
            return this.f58568b;
        }

        public int getActionId() {
            return this.f58569c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Bundle> cls = Bundle.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("search_result", this.f58567a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("search_result", (Serializable) this.f58567a);
            }
            bundle.putInt("tab_by_default", this.f58568b);
            return bundle;
        }

        public int hashCode() {
            Bundle bundle = this.f58567a;
            return ((bundle == null ? 0 : bundle.hashCode()) * 31) + Integer.hashCode(this.f58568b);
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f58567a;
            int i = this.f58568b;
            return "ActionAccountListFragmentToSearchWithListResult(searchResult=" + bundle + ", tabByDefault=" + i + ")";
        }

        public C22948a(@C12580l Bundle bundle, int i) {
            this.f58567a = bundle;
            this.f58568b = i;
            this.f58569c = R.id.action_accountListFragment_to_searchWithListResult;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C22948a(Bundle bundle, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? 0 : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.b$b */
    public static final class C22949b {
        public /* synthetic */ C22949b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C19693b0 m103340c(C22949b bVar, Bundle bundle, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bundle = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return bVar.mo67505b(bundle, i);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo67504a() {
            return new C19690a(R.id.action_accountListFragment_to_catalogProductDetailFragment);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo67505b(@C12580l Bundle bundle, int i) {
            return new C22948a(bundle, i);
        }

        public C22949b() {
        }
    }
}
