package com.carrefour.fid.android.presentation.p035ui.challengeFid;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.challengeFid.a */
public final class C23239a implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C23240a f58946c = new C23240a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f58947d = 0;
    @C12579k

    /* renamed from: a */
    public final String f58948a;
    @C12579k

    /* renamed from: b */
    public final String f58949b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.challengeFid.a$a */
    public static final class C23240a {
        public /* synthetic */ C23240a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23239a mo68106a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23239a.class.getClassLoader());
            if (bundle.containsKey("screenName")) {
                String string = bundle.getString("screenName");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"screenName\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("screenTemplate")) {
                    String string2 = bundle.getString("screenTemplate");
                    if (string2 != null) {
                        return new C23239a(string, string2);
                    }
                    throw new IllegalArgumentException("Argument \"screenTemplate\" is marked as non-null but was passed a null value.");
                } else {
                    throw new IllegalArgumentException("Required argument \"screenTemplate\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"screenName\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23239a mo68107b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("screenName")) {
                String str = (String) p0Var.mo57648h("screenName");
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"screenName\" is marked as non-null but was passed a null value");
                } else if (p0Var.mo57647f("screenTemplate")) {
                    String str2 = (String) p0Var.mo57648h("screenTemplate");
                    if (str2 != null) {
                        return new C23239a(str, str2);
                    }
                    throw new IllegalArgumentException("Argument \"screenTemplate\" is marked as non-null but was passed a null value");
                } else {
                    throw new IllegalArgumentException("Required argument \"screenTemplate\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"screenName\" is missing and does not have an android:defaultValue");
            }
        }

        public C23240a() {
        }
    }

    public C23239a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenTemplate");
        this.f58948a = str;
        this.f58949b = str2;
    }

    /* renamed from: d */
    public static /* synthetic */ C23239a m103910d(C23239a aVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f58948a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f58949b;
        }
        return aVar.mo68098c(str, str2);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C23239a m103911e(@C12579k C19456p0 p0Var) {
        return f58946c.mo68107b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23239a fromBundle(@C12579k Bundle bundle) {
        return f58946c.mo68106a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo68096a() {
        return this.f58948a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo68097b() {
        return this.f58949b;
    }

    @C12579k
    /* renamed from: c */
    public final C23239a mo68098c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenTemplate");
        return new C23239a(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23239a)) {
            return false;
        }
        C23239a aVar = (C23239a) obj;
        return Intrinsics.areEqual((Object) this.f58948a, (Object) aVar.f58948a) && Intrinsics.areEqual((Object) this.f58949b, (Object) aVar.f58949b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo68100f() {
        return this.f58948a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo68101g() {
        return this.f58949b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo68102h() {
        Bundle bundle = new Bundle();
        bundle.putString("screenName", this.f58948a);
        bundle.putString("screenTemplate", this.f58949b);
        return bundle;
    }

    public int hashCode() {
        return (this.f58948a.hashCode() * 31) + this.f58949b.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo68104i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("screenName", this.f58948a);
        p0Var.mo57656q("screenTemplate", this.f58949b);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f58948a;
        String str2 = this.f58949b;
        return "ChallengeFidDialogFragmentArgs(screenName=" + str + ", screenTemplate=" + str2 + ")";
    }
}
