package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.history;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.c */
public final class C24518c implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C24519a f61048b = new C24519a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61049c = 0;
    @C12579k

    /* renamed from: a */
    public final String f61050a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.c$a */
    public static final class C24519a {
        public /* synthetic */ C24519a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24518c mo71694a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24518c.class.getClassLoader());
            if (bundle.containsKey("loyaltyBalance")) {
                String string = bundle.getString("loyaltyBalance");
                if (string != null) {
                    return new C24518c(string);
                }
                throw new IllegalArgumentException("Argument \"loyaltyBalance\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"loyaltyBalance\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24518c mo71695b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("loyaltyBalance")) {
                String str = (String) p0Var.mo57648h("loyaltyBalance");
                if (str != null) {
                    return new C24518c(str);
                }
                throw new IllegalArgumentException("Argument \"loyaltyBalance\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"loyaltyBalance\" is missing and does not have an android:defaultValue");
        }

        public C24519a() {
        }
    }

    public C24518c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
        this.f61050a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C24518c m107391c(C24518c cVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f61050a;
        }
        return cVar.mo71687b(str);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C24518c m107392d(@C12579k C19456p0 p0Var) {
        return f61048b.mo71695b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24518c fromBundle(@C12579k Bundle bundle) {
        return f61048b.mo71694a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo71686a() {
        return this.f61050a;
    }

    @C12579k
    /* renamed from: b */
    public final C24518c mo71687b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "loyaltyBalance");
        return new C24518c(str);
    }

    @C12579k
    /* renamed from: e */
    public final String mo71688e() {
        return this.f61050a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24518c) && Intrinsics.areEqual((Object) this.f61050a, (Object) ((C24518c) obj).f61050a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo71690f() {
        Bundle bundle = new Bundle();
        bundle.putString("loyaltyBalance", this.f61050a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo71691g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("loyaltyBalance", this.f61050a);
        return p0Var;
    }

    public int hashCode() {
        return this.f61050a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f61050a;
        return "LoyaltyAmountHistoryFragmentArgs(loyaltyBalance=" + str + ")";
    }
}
