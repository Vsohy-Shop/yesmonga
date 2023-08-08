package com.carrefour.fid.android.presentation.p035ui.product.search;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.m */
public final class C25576m implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C25577a f62851c = new C25577a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f62852d = 8;
    @C12580l

    /* renamed from: a */
    public final Bundle f62853a;

    /* renamed from: b */
    public final boolean f62854b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.m$a */
    public static final class C25577a {
        public /* synthetic */ C25577a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25576m mo74446a(@C12579k Bundle bundle) {
            Bundle bundle2;
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25576m.class.getClassLoader());
            if (bundle.containsKey("arguments_settings")) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle2 = (Bundle) bundle.get("arguments_settings");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle2 = null;
            }
            if (bundle.containsKey("should_animate_transition")) {
                z = bundle.getBoolean("should_animate_transition");
            } else {
                z = false;
            }
            return new C25576m(bundle2, z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25576m mo74447b(@C12579k C19456p0 p0Var) {
            Bundle bundle;
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("arguments_settings")) {
                Class<Bundle> cls = Bundle.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    bundle = (Bundle) p0Var.mo57648h("arguments_settings");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle = null;
            }
            if (p0Var.mo57647f("should_animate_transition")) {
                bool = (Boolean) p0Var.mo57648h("should_animate_transition");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"should_animate_transition\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new C25576m(bundle, bool.booleanValue());
        }

        public C25577a() {
        }
    }

    public C25576m() {
        this((Bundle) null, false, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C25576m m110150d(C25576m mVar, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = mVar.f62853a;
        }
        if ((i & 2) != 0) {
            z = mVar.f62854b;
        }
        return mVar.mo74438c(bundle, z);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C25576m m110151e(@C12579k C19456p0 p0Var) {
        return f62851c.mo74447b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25576m fromBundle(@C12579k Bundle bundle) {
        return f62851c.mo74446a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final Bundle mo74436a() {
        return this.f62853a;
    }

    /* renamed from: b */
    public final boolean mo74437b() {
        return this.f62854b;
    }

    @C12579k
    /* renamed from: c */
    public final C25576m mo74438c(@C12580l Bundle bundle, boolean z) {
        return new C25576m(bundle, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25576m)) {
            return false;
        }
        C25576m mVar = (C25576m) obj;
        return Intrinsics.areEqual((Object) this.f62853a, (Object) mVar.f62853a) && this.f62854b == mVar.f62854b;
    }

    @C12580l
    /* renamed from: f */
    public final Bundle mo74440f() {
        return this.f62853a;
    }

    /* renamed from: g */
    public final boolean mo74441g() {
        return this.f62854b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo74442h() {
        Bundle bundle = new Bundle();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("arguments_settings", this.f62853a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("arguments_settings", (Serializable) this.f62853a);
        }
        bundle.putBoolean("should_animate_transition", this.f62854b);
        return bundle;
    }

    public int hashCode() {
        Bundle bundle = this.f62853a;
        int hashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
        boolean z = this.f62854b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo74444i() {
        C19456p0 p0Var = new C19456p0();
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("arguments_settings", this.f62853a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("arguments_settings", (Serializable) this.f62853a);
        }
        p0Var.mo57656q("should_animate_transition", Boolean.valueOf(this.f62854b));
        return p0Var;
    }

    @C12579k
    public String toString() {
        Bundle bundle = this.f62853a;
        boolean z = this.f62854b;
        return "ProductSearchFragmentArgs(argumentsSettings=" + bundle + ", shouldAnimateTransition=" + z + ")";
    }

    public C25576m(@C12580l Bundle bundle, boolean z) {
        this.f62853a = bundle;
        this.f62854b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25576m(Bundle bundle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle, (i & 2) != 0 ? false : z);
    }
}
