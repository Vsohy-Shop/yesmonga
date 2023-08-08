package com.carrefour.fid.android;

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
/* renamed from: com.carrefour.fid.android.q0 */
public final class C14065q0 implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C14066a f34491b = new C14066a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f34492c = 0;

    /* renamed from: a */
    public final int f34493a;

    /* renamed from: com.carrefour.fid.android.q0$a */
    public static final class C14066a {
        public /* synthetic */ C14066a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C14065q0 mo34335a(@C12579k Bundle bundle) {
            int i;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C14065q0.class.getClassLoader());
            if (bundle.containsKey("sourceGraphId")) {
                i = bundle.getInt("sourceGraphId");
            } else {
                i = R.id.home_graph;
            }
            return new C14065q0(i);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C14065q0 mo34336b(@C12579k C19456p0 p0Var) {
            Integer num;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("sourceGraphId")) {
                num = (Integer) p0Var.mo57648h("sourceGraphId");
                if (num == null) {
                    throw new IllegalArgumentException("Argument \"sourceGraphId\" of type reference does not support null values");
                }
            } else {
                num = Integer.valueOf(R.id.home_graph);
            }
            return new C14065q0(num.intValue());
        }

        public C14066a() {
        }
    }

    public C14065q0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C14065q0 m60594c(C14065q0 q0Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = q0Var.f34493a;
        }
        return q0Var.mo34328b(i);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C14065q0 m60595d(@C12579k C19456p0 p0Var) {
        return f34491b.mo34336b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C14065q0 fromBundle(@C12579k Bundle bundle) {
        return f34491b.mo34335a(bundle);
    }

    /* renamed from: a */
    public final int mo34327a() {
        return this.f34493a;
    }

    @C12579k
    /* renamed from: b */
    public final C14065q0 mo34328b(int i) {
        return new C14065q0(i);
    }

    /* renamed from: e */
    public final int mo34329e() {
        return this.f34493a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14065q0) && this.f34493a == ((C14065q0) obj).f34493a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo34331f() {
        Bundle bundle = new Bundle();
        bundle.putInt("sourceGraphId", this.f34493a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo34332g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("sourceGraphId", Integer.valueOf(this.f34493a));
        return p0Var;
    }

    public int hashCode() {
        return Integer.hashCode(this.f34493a);
    }

    @C12579k
    public String toString() {
        int i = this.f34493a;
        return "StoreLocatorGraphArgs(sourceGraphId=" + i + ")";
    }

    public C14065q0(int i) {
        this.f34493a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14065q0(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.id.home_graph : i);
    }
}
