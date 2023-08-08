package com.carrefour.fid.android.presentation.p035ui.product.search;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.c */
public final class C25563c implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C25564a f62824b = new C25564a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f62825c = 0;

    /* renamed from: a */
    public final int f62826a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.c$a */
    public static final class C25564a {
        public /* synthetic */ C25564a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25563c mo74411a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25563c.class.getClassLoader());
            if (bundle.containsKey("sourceGraphId")) {
                return new C25563c(bundle.getInt("sourceGraphId"));
            }
            throw new IllegalArgumentException("Required argument \"sourceGraphId\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25563c mo74412b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("sourceGraphId")) {
                Integer num = (Integer) p0Var.mo57648h("sourceGraphId");
                if (num != null) {
                    return new C25563c(num.intValue());
                }
                throw new IllegalArgumentException("Argument \"sourceGraphId\" of type reference does not support null values");
            }
            throw new IllegalArgumentException("Required argument \"sourceGraphId\" is missing and does not have an android:defaultValue");
        }

        public C25564a() {
        }
    }

    public C25563c(int i) {
        this.f62826a = i;
    }

    /* renamed from: c */
    public static /* synthetic */ C25563c m110129c(C25563c cVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.f62826a;
        }
        return cVar.mo74404b(i);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C25563c m110130d(@C12579k C19456p0 p0Var) {
        return f62824b.mo74412b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25563c fromBundle(@C12579k Bundle bundle) {
        return f62824b.mo74411a(bundle);
    }

    /* renamed from: a */
    public final int mo74403a() {
        return this.f62826a;
    }

    @C12579k
    /* renamed from: b */
    public final C25563c mo74404b(int i) {
        return new C25563c(i);
    }

    /* renamed from: e */
    public final int mo74405e() {
        return this.f62826a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25563c) && this.f62826a == ((C25563c) obj).f62826a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo74407f() {
        Bundle bundle = new Bundle();
        bundle.putInt("sourceGraphId", this.f62826a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo74408g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("sourceGraphId", Integer.valueOf(this.f62826a));
        return p0Var;
    }

    public int hashCode() {
        return Integer.hashCode(this.f62826a);
    }

    @C12579k
    public String toString() {
        int i = this.f62826a;
        return "AdditionalOrderProductSearchFragmentArgs(sourceGraphId=" + i + ")";
    }
}
