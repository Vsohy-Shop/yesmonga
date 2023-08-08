package com.carrefour.fid.android.presentation.p035ui.gazStation;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.x */
public final class C24051x implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C24052a f60300b = new C24052a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f60301c = 0;
    @C12580l

    /* renamed from: a */
    public final String f60302a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.x$a */
    public static final class C24052a {
        public /* synthetic */ C24052a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24051x mo70365a(@C12579k Bundle bundle) {
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24051x.class.getClassLoader());
            if (bundle.containsKey("pictureMediaPath")) {
                str = bundle.getString("pictureMediaPath");
            } else {
                str = null;
            }
            return new C24051x(str);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24051x mo70366b(@C12579k C19456p0 p0Var) {
            String str;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("pictureMediaPath")) {
                str = (String) p0Var.mo57648h("pictureMediaPath");
            } else {
                str = null;
            }
            return new C24051x(str);
        }

        public C24052a() {
        }
    }

    public C24051x() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C24051x m106106c(C24051x xVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xVar.f60302a;
        }
        return xVar.mo70358b(str);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C24051x m106107d(@C12579k C19456p0 p0Var) {
        return f60300b.mo70366b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24051x fromBundle(@C12579k Bundle bundle) {
        return f60300b.mo70365a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final String mo70357a() {
        return this.f60302a;
    }

    @C12579k
    /* renamed from: b */
    public final C24051x mo70358b(@C12580l String str) {
        return new C24051x(str);
    }

    @C12580l
    /* renamed from: e */
    public final String mo70359e() {
        return this.f60302a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24051x) && Intrinsics.areEqual((Object) this.f60302a, (Object) ((C24051x) obj).f60302a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo70361f() {
        Bundle bundle = new Bundle();
        bundle.putString("pictureMediaPath", this.f60302a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo70362g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("pictureMediaPath", this.f60302a);
        return p0Var;
    }

    public int hashCode() {
        String str = this.f60302a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f60302a;
        return "ServiceStationsResultFragmentArgs(pictureMediaPath=" + str + ")";
    }

    public C24051x(@C12580l String str) {
        this.f60302a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24051x(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
