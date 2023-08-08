package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.e */
public final class C25166e implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C25167a f62001b = new C25167a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f62002c = 0;

    /* renamed from: a */
    public final int f62003a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.e$a */
    public static final class C25167a {
        public /* synthetic */ C25167a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25166e mo73127a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25166e.class.getClassLoader());
            if (bundle.containsKey("sourceGraphId")) {
                return new C25166e(bundle.getInt("sourceGraphId"));
            }
            throw new IllegalArgumentException("Required argument \"sourceGraphId\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C25166e mo73128b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("sourceGraphId")) {
                Integer num = (Integer) p0Var.mo57648h("sourceGraphId");
                if (num != null) {
                    return new C25166e(num.intValue());
                }
                throw new IllegalArgumentException("Argument \"sourceGraphId\" of type reference does not support null values");
            }
            throw new IllegalArgumentException("Required argument \"sourceGraphId\" is missing and does not have an android:defaultValue");
        }

        public C25167a() {
        }
    }

    public C25166e(int i) {
        this.f62003a = i;
    }

    /* renamed from: c */
    public static /* synthetic */ C25166e m108801c(C25166e eVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eVar.f62003a;
        }
        return eVar.mo73120b(i);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C25166e m108802d(@C12579k C19456p0 p0Var) {
        return f62001b.mo73128b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25166e fromBundle(@C12579k Bundle bundle) {
        return f62001b.mo73127a(bundle);
    }

    /* renamed from: a */
    public final int mo73119a() {
        return this.f62003a;
    }

    @C12579k
    /* renamed from: b */
    public final C25166e mo73120b(int i) {
        return new C25166e(i);
    }

    /* renamed from: e */
    public final int mo73121e() {
        return this.f62003a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25166e) && this.f62003a == ((C25166e) obj).f62003a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo73123f() {
        Bundle bundle = new Bundle();
        bundle.putInt("sourceGraphId", this.f62003a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo73124g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("sourceGraphId", Integer.valueOf(this.f62003a));
        return p0Var;
    }

    public int hashCode() {
        return Integer.hashCode(this.f62003a);
    }

    @C12579k
    public String toString() {
        int i = this.f62003a;
        return "AdditionalOrderFragmentArgs(sourceGraphId=" + i + ")";
    }
}
