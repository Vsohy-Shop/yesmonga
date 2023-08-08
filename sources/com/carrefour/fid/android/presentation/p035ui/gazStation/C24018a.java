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
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.a */
public final class C24018a implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C24019a f60241c = new C24019a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f60242d = 0;
    @C12579k

    /* renamed from: a */
    public final String f60243a;
    @C12579k

    /* renamed from: b */
    public final String f60244b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.a$a */
    public static final class C24019a {
        public /* synthetic */ C24019a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24018a mo70282a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24018a.class.getClassLoader());
            if (bundle.containsKey("startDate")) {
                String string = bundle.getString("startDate");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"startDate\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("endDate")) {
                    String string2 = bundle.getString("endDate");
                    if (string2 != null) {
                        return new C24018a(string, string2);
                    }
                    throw new IllegalArgumentException("Argument \"endDate\" is marked as non-null but was passed a null value.");
                } else {
                    throw new IllegalArgumentException("Required argument \"endDate\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"startDate\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24018a mo70283b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("startDate")) {
                String str = (String) p0Var.mo57648h("startDate");
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"startDate\" is marked as non-null but was passed a null value");
                } else if (p0Var.mo57647f("endDate")) {
                    String str2 = (String) p0Var.mo57648h("endDate");
                    if (str2 != null) {
                        return new C24018a(str, str2);
                    }
                    throw new IllegalArgumentException("Argument \"endDate\" is marked as non-null but was passed a null value");
                } else {
                    throw new IllegalArgumentException("Required argument \"endDate\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"startDate\" is missing and does not have an android:defaultValue");
            }
        }

        public C24019a() {
        }
    }

    public C24018a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        this.f60243a = str;
        this.f60244b = str2;
    }

    /* renamed from: d */
    public static /* synthetic */ C24018a m106043d(C24018a aVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f60243a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f60244b;
        }
        return aVar.mo70274c(str, str2);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C24018a m106044e(@C12579k C19456p0 p0Var) {
        return f60241c.mo70283b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24018a fromBundle(@C12579k Bundle bundle) {
        return f60241c.mo70282a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo70272a() {
        return this.f60243a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo70273b() {
        return this.f60244b;
    }

    @C12579k
    /* renamed from: c */
    public final C24018a mo70274c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        return new C24018a(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24018a)) {
            return false;
        }
        C24018a aVar = (C24018a) obj;
        return Intrinsics.areEqual((Object) this.f60243a, (Object) aVar.f60243a) && Intrinsics.areEqual((Object) this.f60244b, (Object) aVar.f60244b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo70276f() {
        return this.f60244b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo70277g() {
        return this.f60243a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo70278h() {
        Bundle bundle = new Bundle();
        bundle.putString("startDate", this.f60243a);
        bundle.putString("endDate", this.f60244b);
        return bundle;
    }

    public int hashCode() {
        return (this.f60243a.hashCode() * 31) + this.f60244b.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo70280i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("startDate", this.f60243a);
        p0Var.mo57656q("endDate", this.f60244b);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f60243a;
        String str2 = this.f60244b;
        return "BaseServiceStationsFragmentArgs(startDate=" + str + ", endDate=" + str2 + ")";
    }
}
