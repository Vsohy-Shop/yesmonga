package com.carrefour.fid.android.storelocator.p048ui.fragments;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.R;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.b */
public final class C28982b implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C28983a f71068b = new C28983a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f71069c = 0;

    /* renamed from: a */
    public final int f71070a;

    /* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.b$a */
    public static final class C28983a {
        public /* synthetic */ C28983a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C28982b mo84417a(@C12579k Bundle bundle) {
            int i;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C28982b.class.getClassLoader());
            if (bundle.containsKey("sourceGraphId")) {
                i = bundle.getInt("sourceGraphId");
            } else {
                i = R.id.store_graph;
            }
            return new C28982b(i);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C28982b mo84418b(@C12579k C19456p0 p0Var) {
            Integer num;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("sourceGraphId")) {
                num = (Integer) p0Var.mo57648h("sourceGraphId");
                if (num == null) {
                    throw new IllegalArgumentException("Argument \"sourceGraphId\" of type reference does not support null values");
                }
            } else {
                num = Integer.valueOf(R.id.store_graph);
            }
            return new C28982b(num.intValue());
        }

        public C28983a() {
        }
    }

    public C28982b() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C28982b m119934c(C28982b bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f71070a;
        }
        return bVar.mo84410b(i);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C28982b m119935d(@C12579k C19456p0 p0Var) {
        return f71068b.mo84418b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C28982b fromBundle(@C12579k Bundle bundle) {
        return f71068b.mo84417a(bundle);
    }

    /* renamed from: a */
    public final int mo84409a() {
        return this.f71070a;
    }

    @C12579k
    /* renamed from: b */
    public final C28982b mo84410b(int i) {
        return new C28982b(i);
    }

    /* renamed from: e */
    public final int mo84411e() {
        return this.f71070a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28982b) && this.f71070a == ((C28982b) obj).f71070a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo84413f() {
        Bundle bundle = new Bundle();
        bundle.putInt("sourceGraphId", this.f71070a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo84414g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("sourceGraphId", Integer.valueOf(this.f71070a));
        return p0Var;
    }

    public int hashCode() {
        return Integer.hashCode(this.f71070a);
    }

    @C12579k
    public String toString() {
        int i = this.f71070a;
        return "FacilitiesFragmentArgs(sourceGraphId=" + i + ")";
    }

    public C28982b(int i) {
        this.f71070a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28982b(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.id.store_graph : i);
    }
}
