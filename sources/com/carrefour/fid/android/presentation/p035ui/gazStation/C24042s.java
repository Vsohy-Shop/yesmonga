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
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.s */
public final class C24042s implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C24043a f60285c = new C24043a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f60286d = 0;
    @C12579k

    /* renamed from: a */
    public final String f60287a;
    @C12579k

    /* renamed from: b */
    public final String f60288b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.s$a */
    public static final class C24043a {
        public /* synthetic */ C24043a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24042s mo70338a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24042s.class.getClassLoader());
            if (bundle.containsKey("startDate")) {
                String string = bundle.getString("startDate");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"startDate\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("endDate")) {
                    String string2 = bundle.getString("endDate");
                    if (string2 != null) {
                        return new C24042s(string, string2);
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
        public final C24042s mo70339b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("startDate")) {
                String str = (String) p0Var.mo57648h("startDate");
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"startDate\" is marked as non-null but was passed a null value");
                } else if (p0Var.mo57647f("endDate")) {
                    String str2 = (String) p0Var.mo57648h("endDate");
                    if (str2 != null) {
                        return new C24042s(str, str2);
                    }
                    throw new IllegalArgumentException("Argument \"endDate\" is marked as non-null but was passed a null value");
                } else {
                    throw new IllegalArgumentException("Required argument \"endDate\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"startDate\" is missing and does not have an android:defaultValue");
            }
        }

        public C24043a() {
        }
    }

    public C24042s(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        this.f60287a = str;
        this.f60288b = str2;
    }

    /* renamed from: d */
    public static /* synthetic */ C24042s m106078d(C24042s sVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sVar.f60287a;
        }
        if ((i & 2) != 0) {
            str2 = sVar.f60288b;
        }
        return sVar.mo70330c(str, str2);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C24042s m106079e(@C12579k C19456p0 p0Var) {
        return f60285c.mo70339b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24042s fromBundle(@C12579k Bundle bundle) {
        return f60285c.mo70338a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo70328a() {
        return this.f60287a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo70329b() {
        return this.f60288b;
    }

    @C12579k
    /* renamed from: c */
    public final C24042s mo70330c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        return new C24042s(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24042s)) {
            return false;
        }
        C24042s sVar = (C24042s) obj;
        return Intrinsics.areEqual((Object) this.f60287a, (Object) sVar.f60287a) && Intrinsics.areEqual((Object) this.f60288b, (Object) sVar.f60288b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo70332f() {
        return this.f60288b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo70333g() {
        return this.f60287a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo70334h() {
        Bundle bundle = new Bundle();
        bundle.putString("startDate", this.f60287a);
        bundle.putString("endDate", this.f60288b);
        return bundle;
    }

    public int hashCode() {
        return (this.f60287a.hashCode() * 31) + this.f60288b.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo70336i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("startDate", this.f60287a);
        p0Var.mo57656q("endDate", this.f60288b);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f60287a;
        String str2 = this.f60288b;
        return "ServiceStationsLandingPageFragmentArgs(startDate=" + str + ", endDate=" + str2 + ")";
    }
}
