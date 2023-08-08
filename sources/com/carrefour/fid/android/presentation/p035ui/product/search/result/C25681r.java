package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.r */
public final class C25681r implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C25682a f62973c = new C25682a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f62974d = 8;
    @C12580l

    /* renamed from: a */
    public final Bundle f62975a;

    /* renamed from: b */
    public final int f62976b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.r$a */
    public static final class C25682a {
        public /* synthetic */ C25682a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25681r mo74622a(@C12579k Bundle bundle) {
            Bundle bundle2;
            int i;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25681r.class.getClassLoader());
            if (bundle.containsKey("search_result")) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle2 = (Bundle) bundle.get("search_result");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle2 = null;
            }
            if (bundle.containsKey("tab_by_default")) {
                i = bundle.getInt("tab_by_default");
            } else {
                i = 0;
            }
            return new C25681r(bundle2, i);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25681r mo74623b(@C12579k C19456p0 p0Var) {
            Bundle bundle;
            Integer num;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("search_result")) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle = (Bundle) p0Var.mo57648h("search_result");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle = null;
            }
            if (p0Var.mo57647f("tab_by_default")) {
                num = (Integer) p0Var.mo57648h("tab_by_default");
                if (num == null) {
                    throw new IllegalArgumentException("Argument \"tab_by_default\" of type integer does not support null values");
                }
            } else {
                num = 0;
            }
            return new C25681r(bundle, num.intValue());
        }

        public C25682a() {
        }
    }

    public C25681r() {
        this((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C25681r m110338d(C25681r rVar, Bundle bundle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bundle = rVar.f62975a;
        }
        if ((i2 & 2) != 0) {
            i = rVar.f62976b;
        }
        return rVar.mo74614c(bundle, i);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C25681r m110339e(@C12579k C19456p0 p0Var) {
        return f62973c.mo74623b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25681r fromBundle(@C12579k Bundle bundle) {
        return f62973c.mo74622a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final Bundle mo74612a() {
        return this.f62975a;
    }

    /* renamed from: b */
    public final int mo74613b() {
        return this.f62976b;
    }

    @C12579k
    /* renamed from: c */
    public final C25681r mo74614c(@C12580l Bundle bundle, int i) {
        return new C25681r(bundle, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25681r)) {
            return false;
        }
        C25681r rVar = (C25681r) obj;
        return Intrinsics.areEqual((Object) this.f62975a, (Object) rVar.f62975a) && this.f62976b == rVar.f62976b;
    }

    @C12580l
    /* renamed from: f */
    public final Bundle mo74616f() {
        return this.f62975a;
    }

    /* renamed from: g */
    public final int mo74617g() {
        return this.f62976b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo74618h() {
        Bundle bundle = new Bundle();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("search_result", this.f62975a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("search_result", (Serializable) this.f62975a);
        }
        bundle.putInt("tab_by_default", this.f62976b);
        return bundle;
    }

    public int hashCode() {
        Bundle bundle = this.f62975a;
        return ((bundle == null ? 0 : bundle.hashCode()) * 31) + Integer.hashCode(this.f62976b);
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo74620i() {
        C19456p0 p0Var = new C19456p0();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("search_result", this.f62975a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("search_result", (Serializable) this.f62975a);
        }
        p0Var.mo57656q("tab_by_default", Integer.valueOf(this.f62976b));
        return p0Var;
    }

    @C12579k
    public String toString() {
        Bundle bundle = this.f62975a;
        int i = this.f62976b;
        return "ProductSearchWithListResultFragmentArgs(searchResult=" + bundle + ", tabByDefault=" + i + ")";
    }

    public C25681r(@C12580l Bundle bundle, int i) {
        this.f62975a = bundle;
        this.f62976b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25681r(Bundle bundle, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? 0 : i);
    }
}
