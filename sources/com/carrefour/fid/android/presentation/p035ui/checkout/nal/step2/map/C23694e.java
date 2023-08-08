package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.e */
public final class C23694e implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C23695a f59765b = new C23695a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f59766c = 0;

    /* renamed from: a */
    public final float f59767a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.e$a */
    public static final class C23695a {
        public /* synthetic */ C23695a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23694e mo69490a(@C12579k Bundle bundle) {
            float f;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23694e.class.getClassLoader());
            if (bundle.containsKey("external_pickup_price")) {
                f = bundle.getFloat("external_pickup_price");
            } else {
                f = 0.0f;
            }
            return new C23694e(f);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23694e mo69491b(@C12579k C19456p0 p0Var) {
            Float f;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("external_pickup_price")) {
                f = (Float) p0Var.mo57648h("external_pickup_price");
                if (f == null) {
                    throw new IllegalArgumentException("Argument \"external_pickup_price\" of type float does not support null values");
                }
            } else {
                f = Float.valueOf(0.0f);
            }
            return new C23694e(f.floatValue());
        }

        public C23695a() {
        }
    }

    public C23694e() {
        this(0.0f, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C23694e m105194c(C23694e eVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = eVar.f59767a;
        }
        return eVar.mo69483b(f);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C23694e m105195d(@C12579k C19456p0 p0Var) {
        return f59765b.mo69491b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23694e fromBundle(@C12579k Bundle bundle) {
        return f59765b.mo69490a(bundle);
    }

    /* renamed from: a */
    public final float mo69482a() {
        return this.f59767a;
    }

    @C12579k
    /* renamed from: b */
    public final C23694e mo69483b(float f) {
        return new C23694e(f);
    }

    /* renamed from: e */
    public final float mo69484e() {
        return this.f59767a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23694e) && Float.compare(this.f59767a, ((C23694e) obj).f59767a) == 0;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo69486f() {
        Bundle bundle = new Bundle();
        bundle.putFloat("external_pickup_price", this.f59767a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo69487g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("external_pickup_price", Float.valueOf(this.f59767a));
        return p0Var;
    }

    public int hashCode() {
        return Float.hashCode(this.f59767a);
    }

    @C12579k
    public String toString() {
        float f = this.f59767a;
        return "PickupPointsMapFragmentArgs(externalPickupPrice=" + f + ")";
    }

    public C23694e(float f) {
        this.f59767a = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23694e(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }
}
