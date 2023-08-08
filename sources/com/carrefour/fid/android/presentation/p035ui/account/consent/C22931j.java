package com.carrefour.fid.android.presentation.p035ui.account.consent;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.j */
public final class C22931j implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C22932a f58527b = new C22932a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f58528c = 0;
    @C12580l

    /* renamed from: a */
    public final String f58529a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.j$a */
    public static final class C22932a {
        public /* synthetic */ C22932a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C22931j mo67442a(@C12579k Bundle bundle) {
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C22931j.class.getClassLoader());
            if (bundle.containsKey("tab_destination")) {
                str = bundle.getString("tab_destination");
            } else {
                str = null;
            }
            return new C22931j(str);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C22931j mo67443b(@C12579k C19456p0 p0Var) {
            String str;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("tab_destination")) {
                str = (String) p0Var.mo57648h("tab_destination");
            } else {
                str = null;
            }
            return new C22931j(str);
        }

        public C22932a() {
        }
    }

    public C22931j() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C22931j m103283c(C22931j jVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jVar.f58529a;
        }
        return jVar.mo67435b(str);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C22931j m103284d(@C12579k C19456p0 p0Var) {
        return f58527b.mo67443b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C22931j fromBundle(@C12579k Bundle bundle) {
        return f58527b.mo67442a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final String mo67434a() {
        return this.f58529a;
    }

    @C12579k
    /* renamed from: b */
    public final C22931j mo67435b(@C12580l String str) {
        return new C22931j(str);
    }

    @C12580l
    /* renamed from: e */
    public final String mo67436e() {
        return this.f58529a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22931j) && Intrinsics.areEqual((Object) this.f58529a, (Object) ((C22931j) obj).f58529a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo67438f() {
        Bundle bundle = new Bundle();
        bundle.putString("tab_destination", this.f58529a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo67439g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("tab_destination", this.f58529a);
        return p0Var;
    }

    public int hashCode() {
        String str = this.f58529a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f58529a;
        return "AccountConsentParameterFragmentArgs(tabDestination=" + str + ")";
    }

    public C22931j(@C12580l String str) {
        this.f58529a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22931j(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
