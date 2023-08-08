package com.carrefour.fid.android.account.presentation.p018ui.success;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.account.presentation.models.NameLastView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.ui.success.a */
public final class C13555a implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C13556a f33044d = new C13556a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f33045e = 0;
    @C12579k

    /* renamed from: a */
    public final NameLastView f33046a;

    /* renamed from: b */
    public final boolean f33047b;
    @C12580l

    /* renamed from: c */
    public final String f33048c;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.success.a$a */
    public static final class C13556a {
        public /* synthetic */ C13556a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C13555a mo32183a(@C12579k Bundle bundle) {
            boolean z;
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C13555a.class.getClassLoader());
            if (bundle.containsKey("isSuccessLogin")) {
                z = bundle.getBoolean("isSuccessLogin");
            } else {
                z = false;
            }
            if (bundle.containsKey("lastView")) {
                Class<NameLastView> cls = NameLastView.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    NameLastView nameLastView = (NameLastView) bundle.get("lastView");
                    if (nameLastView != null) {
                        if (bundle.containsKey(FirebaseAnalytics.C32531a.f78899m)) {
                            str = bundle.getString(FirebaseAnalytics.C32531a.f78899m);
                        } else {
                            str = null;
                        }
                        return new C13555a(nameLastView, z, str);
                    }
                    throw new IllegalArgumentException("Argument \"lastView\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"lastView\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C13555a mo32184b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            String str;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("isSuccessLogin")) {
                bool = (Boolean) p0Var.mo57648h("isSuccessLogin");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"isSuccessLogin\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            if (p0Var.mo57647f("lastView")) {
                Class<NameLastView> cls = NameLastView.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    NameLastView nameLastView = (NameLastView) p0Var.mo57648h("lastView");
                    if (nameLastView != null) {
                        if (p0Var.mo57647f(FirebaseAnalytics.C32531a.f78899m)) {
                            str = (String) p0Var.mo57648h(FirebaseAnalytics.C32531a.f78899m);
                        } else {
                            str = null;
                        }
                        return new C13555a(nameLastView, bool.booleanValue(), str);
                    }
                    throw new IllegalArgumentException("Argument \"lastView\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"lastView\" is missing and does not have an android:defaultValue");
        }

        public C13556a() {
        }
    }

    public C13555a(@C12579k NameLastView nameLastView, boolean z, @C12580l String str) {
        Intrinsics.checkNotNullParameter(nameLastView, "lastView");
        this.f33046a = nameLastView;
        this.f33047b = z;
        this.f33048c = str;
    }

    /* renamed from: e */
    public static /* synthetic */ C13555a m58114e(C13555a aVar, NameLastView nameLastView, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            nameLastView = aVar.f33046a;
        }
        if ((i & 2) != 0) {
            z = aVar.f33047b;
        }
        if ((i & 4) != 0) {
            str = aVar.f33048c;
        }
        return aVar.mo32174d(nameLastView, z, str);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C13555a m58115f(@C12579k C19456p0 p0Var) {
        return f33044d.mo32184b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C13555a fromBundle(@C12579k Bundle bundle) {
        return f33044d.mo32183a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final NameLastView mo32171a() {
        return this.f33046a;
    }

    /* renamed from: b */
    public final boolean mo32172b() {
        return this.f33047b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo32173c() {
        return this.f33048c;
    }

    @C12579k
    /* renamed from: d */
    public final C13555a mo32174d(@C12579k NameLastView nameLastView, boolean z, @C12580l String str) {
        Intrinsics.checkNotNullParameter(nameLastView, "lastView");
        return new C13555a(nameLastView, z, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13555a)) {
            return false;
        }
        C13555a aVar = (C13555a) obj;
        return this.f33046a == aVar.f33046a && this.f33047b == aVar.f33047b && Intrinsics.areEqual((Object) this.f33048c, (Object) aVar.f33048c);
    }

    @C12579k
    /* renamed from: g */
    public final NameLastView mo32176g() {
        return this.f33046a;
    }

    @C12580l
    /* renamed from: h */
    public final String mo32177h() {
        return this.f33048c;
    }

    public int hashCode() {
        int hashCode = this.f33046a.hashCode() * 31;
        boolean z = this.f33047b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f33048c;
        return i + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final boolean mo32179i() {
        return this.f33047b;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo32180j() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSuccessLogin", this.f33047b);
        Class<NameLastView> cls = NameLastView.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            NameLastView nameLastView = this.f33046a;
            Intrinsics.checkNotNull(nameLastView, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("lastView", (Parcelable) nameLastView);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            NameLastView nameLastView2 = this.f33046a;
            Intrinsics.checkNotNull(nameLastView2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("lastView", nameLastView2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        bundle.putString(FirebaseAnalytics.C32531a.f78899m, this.f33048c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo32181k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("isSuccessLogin", Boolean.valueOf(this.f33047b));
        Class<NameLastView> cls = NameLastView.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            NameLastView nameLastView = this.f33046a;
            Intrinsics.checkNotNull(nameLastView, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("lastView", (Parcelable) nameLastView);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            NameLastView nameLastView2 = this.f33046a;
            Intrinsics.checkNotNull(nameLastView2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("lastView", nameLastView2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        p0Var.mo57656q(FirebaseAnalytics.C32531a.f78899m, this.f33048c);
        return p0Var;
    }

    @C12579k
    public String toString() {
        NameLastView nameLastView = this.f33046a;
        boolean z = this.f33047b;
        String str = this.f33048c;
        return "AccountUpdateSuccessFragmentArgs(lastView=" + nameLastView + ", isSuccessLogin=" + z + ", login=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13555a(NameLastView nameLastView, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameLastView, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }
}
