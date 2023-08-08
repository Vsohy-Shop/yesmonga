package com.carrefour.fid.android.presentation.p035ui.product.search.result;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.c */
public final class C25663c implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C25664a f62933c = new C25664a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f62934d = 0;
    @C12579k

    /* renamed from: a */
    public final String f62935a;

    /* renamed from: b */
    public final int f62936b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.c$a */
    public static final class C25664a {
        public /* synthetic */ C25664a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25663c mo74582a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25663c.class.getClassLoader());
            if (bundle.containsKey("search_text")) {
                String string = bundle.getString("search_text");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"search_text\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("sourceGraphId")) {
                    return new C25663c(string, bundle.getInt("sourceGraphId"));
                } else {
                    throw new IllegalArgumentException("Required argument \"sourceGraphId\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"search_text\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25663c mo74583b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("search_text")) {
                String str = (String) p0Var.mo57648h("search_text");
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"search_text\" is marked as non-null but was passed a null value");
                } else if (p0Var.mo57647f("sourceGraphId")) {
                    Integer num = (Integer) p0Var.mo57648h("sourceGraphId");
                    if (num != null) {
                        return new C25663c(str, num.intValue());
                    }
                    throw new IllegalArgumentException("Argument \"sourceGraphId\" of type reference does not support null values");
                } else {
                    throw new IllegalArgumentException("Required argument \"sourceGraphId\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"search_text\" is missing and does not have an android:defaultValue");
            }
        }

        public C25664a() {
        }
    }

    public C25663c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "searchText");
        this.f62935a = str;
        this.f62936b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C25663c m110302d(C25663c cVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.f62935a;
        }
        if ((i2 & 2) != 0) {
            i = cVar.f62936b;
        }
        return cVar.mo74574c(str, i);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C25663c m110303e(@C12579k C19456p0 p0Var) {
        return f62933c.mo74583b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25663c fromBundle(@C12579k Bundle bundle) {
        return f62933c.mo74582a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo74572a() {
        return this.f62935a;
    }

    /* renamed from: b */
    public final int mo74573b() {
        return this.f62936b;
    }

    @C12579k
    /* renamed from: c */
    public final C25663c mo74574c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "searchText");
        return new C25663c(str, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25663c)) {
            return false;
        }
        C25663c cVar = (C25663c) obj;
        return Intrinsics.areEqual((Object) this.f62935a, (Object) cVar.f62935a) && this.f62936b == cVar.f62936b;
    }

    @C12579k
    /* renamed from: f */
    public final String mo74576f() {
        return this.f62935a;
    }

    /* renamed from: g */
    public final int mo74577g() {
        return this.f62936b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo74578h() {
        Bundle bundle = new Bundle();
        bundle.putString("search_text", this.f62935a);
        bundle.putInt("sourceGraphId", this.f62936b);
        return bundle;
    }

    public int hashCode() {
        return (this.f62935a.hashCode() * 31) + Integer.hashCode(this.f62936b);
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo74580i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("search_text", this.f62935a);
        p0Var.mo57656q("sourceGraphId", Integer.valueOf(this.f62936b));
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f62935a;
        int i = this.f62936b;
        return "AdditionalOrderSearchResultFragmentArgs(searchText=" + str + ", sourceGraphId=" + i + ")";
    }
}
