package com.carrefour.fid.android.product;

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
/* renamed from: com.carrefour.fid.android.product.d */
public final class C27457d implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C27458a f66578c = new C27458a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f66579d = 0;
    @C12579k

    /* renamed from: a */
    public final String f66580a;
    @C12579k

    /* renamed from: b */
    public final String f66581b;

    /* renamed from: com.carrefour.fid.android.product.d$a */
    public static final class C27458a {
        public /* synthetic */ C27458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27457d mo79824a(@C12579k Bundle bundle) {
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27457d.class.getClassLoader());
            if (bundle.containsKey("query")) {
                String string = bundle.getString("query");
                if (string != null) {
                    if (bundle.containsKey("label")) {
                        str = bundle.getString("label");
                        if (str == null) {
                            throw new IllegalArgumentException("Argument \"label\" is marked as non-null but was passed a null value.");
                        }
                    } else {
                        str = "";
                    }
                    return new C27457d(string, str);
                }
                throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"query\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C27457d mo79825b(@C12579k C19456p0 p0Var) {
            String str;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("query")) {
                String str2 = (String) p0Var.mo57648h("query");
                if (str2 != null) {
                    if (p0Var.mo57647f("label")) {
                        str = (String) p0Var.mo57648h("label");
                        if (str == null) {
                            throw new IllegalArgumentException("Argument \"label\" is marked as non-null but was passed a null value");
                        }
                    } else {
                        str = "";
                    }
                    return new C27457d(str2, str);
                }
                throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"query\" is missing and does not have an android:defaultValue");
        }

        public C27458a() {
        }
    }

    public C27457d(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "query");
        Intrinsics.checkNotNullParameter(str2, "label");
        this.f66580a = str;
        this.f66581b = str2;
    }

    /* renamed from: d */
    public static /* synthetic */ C27457d m115543d(C27457d dVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f66580a;
        }
        if ((i & 2) != 0) {
            str2 = dVar.f66581b;
        }
        return dVar.mo79816c(str, str2);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C27457d m115544e(@C12579k C19456p0 p0Var) {
        return f66578c.mo79825b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27457d fromBundle(@C12579k Bundle bundle) {
        return f66578c.mo79824a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo79814a() {
        return this.f66580a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo79815b() {
        return this.f66581b;
    }

    @C12579k
    /* renamed from: c */
    public final C27457d mo79816c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "query");
        Intrinsics.checkNotNullParameter(str2, "label");
        return new C27457d(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27457d)) {
            return false;
        }
        C27457d dVar = (C27457d) obj;
        return Intrinsics.areEqual((Object) this.f66580a, (Object) dVar.f66580a) && Intrinsics.areEqual((Object) this.f66581b, (Object) dVar.f66581b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo79818f() {
        return this.f66581b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo79819g() {
        return this.f66580a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo79820h() {
        Bundle bundle = new Bundle();
        bundle.putString("query", this.f66580a);
        bundle.putString("label", this.f66581b);
        return bundle;
    }

    public int hashCode() {
        return (this.f66580a.hashCode() * 31) + this.f66581b.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo79822i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("query", this.f66580a);
        p0Var.mo57656q("label", this.f66581b);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f66580a;
        String str2 = this.f66581b;
        return "ProductListQueryGraphArgs(query=" + str + ", label=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27457d(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
