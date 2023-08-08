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
/* renamed from: com.carrefour.fid.android.product.e */
public final class C27607e implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C27608a f67076b = new C27608a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f67077c = 0;
    @C12579k

    /* renamed from: a */
    public final String f67078a;

    /* renamed from: com.carrefour.fid.android.product.e$a */
    public static final class C27608a {
        public /* synthetic */ C27608a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27607e mo80222a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27607e.class.getClassLoader());
            if (bundle.containsKey("searchText")) {
                String string = bundle.getString("searchText");
                if (string != null) {
                    return new C27607e(string);
                }
                throw new IllegalArgumentException("Argument \"searchText\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"searchText\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C27607e mo80223b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("searchText")) {
                String str = (String) p0Var.mo57648h("searchText");
                if (str != null) {
                    return new C27607e(str);
                }
                throw new IllegalArgumentException("Argument \"searchText\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"searchText\" is missing and does not have an android:defaultValue");
        }

        public C27608a() {
        }
    }

    public C27607e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "searchText");
        this.f67078a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C27607e m116189c(C27607e eVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f67078a;
        }
        return eVar.mo80215b(str);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C27607e m116190d(@C12579k C19456p0 p0Var) {
        return f67076b.mo80223b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27607e fromBundle(@C12579k Bundle bundle) {
        return f67076b.mo80222a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo80214a() {
        return this.f67078a;
    }

    @C12579k
    /* renamed from: b */
    public final C27607e mo80215b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "searchText");
        return new C27607e(str);
    }

    @C12579k
    /* renamed from: e */
    public final String mo80216e() {
        return this.f67078a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27607e) && Intrinsics.areEqual((Object) this.f67078a, (Object) ((C27607e) obj).f67078a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo80218f() {
        Bundle bundle = new Bundle();
        bundle.putString("searchText", this.f67078a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo80219g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("searchText", this.f67078a);
        return p0Var;
    }

    public int hashCode() {
        return this.f67078a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f67078a;
        return "ProductListSearchGraphArgs(searchText=" + str + ")";
    }
}
