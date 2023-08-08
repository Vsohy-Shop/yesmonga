package com.carrefour.fid.android.presentation.p035ui.scan;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.scan.c */
public final class C25711c {
    @C12579k

    /* renamed from: a */
    public static final C25713b f63010a = new C25713b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f63011b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.scan.c$a */
    public static final class C25712a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final Bundle f63012a;

        /* renamed from: b */
        public final boolean f63013b;

        /* renamed from: c */
        public final int f63014c;

        public C25712a() {
            this((Bundle) null, false, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C25712a m110404d(C25712a aVar, Bundle bundle, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = aVar.f63012a;
            }
            if ((i & 2) != 0) {
                z = aVar.f63013b;
            }
            return aVar.mo74680c(bundle, z);
        }

        @C12580l
        /* renamed from: a */
        public final Bundle mo74678a() {
            return this.f63012a;
        }

        /* renamed from: b */
        public final boolean mo74679b() {
            return this.f63013b;
        }

        @C12579k
        /* renamed from: c */
        public final C25712a mo74680c(@C12580l Bundle bundle, boolean z) {
            return new C25712a(bundle, z);
        }

        @C12580l
        /* renamed from: e */
        public final Bundle mo74681e() {
            return this.f63012a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25712a)) {
                return false;
            }
            C25712a aVar = (C25712a) obj;
            return Intrinsics.areEqual((Object) this.f63012a, (Object) aVar.f63012a) && this.f63013b == aVar.f63013b;
        }

        /* renamed from: f */
        public final boolean mo74683f() {
            return this.f63013b;
        }

        public int getActionId() {
            return this.f63014c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Bundle> cls = Bundle.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("arguments_settings", this.f63012a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("arguments_settings", (Serializable) this.f63012a);
            }
            bundle.putBoolean("should_animate_transition", this.f63013b);
            return bundle;
        }

        public int hashCode() {
            Bundle bundle = this.f63012a;
            int hashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
            boolean z = this.f63013b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f63012a;
            boolean z = this.f63013b;
            return "ActionScanBarCodeFragmentToProductSearchFragment(argumentsSettings=" + bundle + ", shouldAnimateTransition=" + z + ")";
        }

        public C25712a(@C12580l Bundle bundle, boolean z) {
            this.f63012a = bundle;
            this.f63013b = z;
            this.f63014c = R.id.action_scanBarCodeFragment_to_productSearchFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25712a(Bundle bundle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bundle, (i & 2) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.scan.c$b */
    public static final class C25713b {
        public /* synthetic */ C25713b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m110410b(C25713b bVar, Bundle bundle, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return bVar.mo74686a(bundle, z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo74686a(@C12580l Bundle bundle, boolean z) {
            return new C25712a(bundle, z);
        }

        public C25713b() {
        }
    }
}
