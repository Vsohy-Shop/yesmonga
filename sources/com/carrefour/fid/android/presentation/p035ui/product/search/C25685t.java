package com.carrefour.fid.android.presentation.p035ui.product.search;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.t */
public final class C25685t {
    @C12579k

    /* renamed from: a */
    public static final C25687b f62978a = new C25687b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62979b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.t$a */
    public static final class C25686a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final Bundle f62980a;

        /* renamed from: b */
        public final int f62981b;

        /* renamed from: c */
        public final int f62982c;

        public C25686a() {
            this((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C25686a m110350d(C25686a aVar, Bundle bundle, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bundle = aVar.f62980a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f62981b;
            }
            return aVar.mo74627c(bundle, i);
        }

        @C12580l
        /* renamed from: a */
        public final Bundle mo74625a() {
            return this.f62980a;
        }

        /* renamed from: b */
        public final int mo74626b() {
            return this.f62981b;
        }

        @C12579k
        /* renamed from: c */
        public final C25686a mo74627c(@C12580l Bundle bundle, int i) {
            return new C25686a(bundle, i);
        }

        @C12580l
        /* renamed from: e */
        public final Bundle mo74628e() {
            return this.f62980a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25686a)) {
                return false;
            }
            C25686a aVar = (C25686a) obj;
            return Intrinsics.areEqual((Object) this.f62980a, (Object) aVar.f62980a) && this.f62981b == aVar.f62981b;
        }

        /* renamed from: f */
        public final int mo74630f() {
            return this.f62981b;
        }

        public int getActionId() {
            return this.f62982c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Bundle> cls = Bundle.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("search_result", this.f62980a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("search_result", (Serializable) this.f62980a);
            }
            bundle.putInt("tab_by_default", this.f62981b);
            return bundle;
        }

        public int hashCode() {
            Bundle bundle = this.f62980a;
            return ((bundle == null ? 0 : bundle.hashCode()) * 31) + Integer.hashCode(this.f62981b);
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f62980a;
            int i = this.f62981b;
            return "ActionSearchWithListFragmentToSearchWithListResultFragment(searchResult=" + bundle + ", tabByDefault=" + i + ")";
        }

        public C25686a(@C12580l Bundle bundle, int i) {
            this.f62980a = bundle;
            this.f62981b = i;
            this.f62982c = R.id.action_searchWithListFragment_to_searchWithListResultFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25686a(Bundle bundle, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? 0 : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.t$b */
    public static final class C25687b {
        public /* synthetic */ C25687b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m110356b(C25687b bVar, Bundle bundle, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bundle = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return bVar.mo74633a(bundle, i);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo74633a(@C12580l Bundle bundle, int i) {
            return new C25686a(bundle, i);
        }

        public C25687b() {
        }
    }
}
