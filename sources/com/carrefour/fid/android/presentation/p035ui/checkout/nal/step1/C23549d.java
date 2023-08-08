package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26143a;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.d */
public final class C23549d implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C23550a f59507b = new C23550a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f59508c = 0;
    @C12579k

    /* renamed from: a */
    public final String f59509a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.d$a */
    public static final class C23550a {
        public /* synthetic */ C23550a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23549d mo69016a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23549d.class.getClassLoader());
            if (bundle.containsKey(C26143a.f63928a)) {
                String string = bundle.getString(C26143a.f63928a);
                if (string != null) {
                    return new C23549d(string);
                }
                throw new IllegalArgumentException("Argument \"reference_id\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"reference_id\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23549d mo69017b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(C26143a.f63928a)) {
                String str = (String) p0Var.mo57648h(C26143a.f63928a);
                if (str != null) {
                    return new C23549d(str);
                }
                throw new IllegalArgumentException("Argument \"reference_id\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"reference_id\" is missing and does not have an android:defaultValue");
        }

        public C23550a() {
        }
    }

    public C23549d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "referenceId");
        this.f59509a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C23549d m104788c(C23549d dVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f59509a;
        }
        return dVar.mo69009b(str);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C23549d m104789d(@C12579k C19456p0 p0Var) {
        return f59507b.mo69017b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23549d fromBundle(@C12579k Bundle bundle) {
        return f59507b.mo69016a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo69008a() {
        return this.f59509a;
    }

    @C12579k
    /* renamed from: b */
    public final C23549d mo69009b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "referenceId");
        return new C23549d(str);
    }

    @C12579k
    /* renamed from: e */
    public final String mo69010e() {
        return this.f59509a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23549d) && Intrinsics.areEqual((Object) this.f59509a, (Object) ((C23549d) obj).f59509a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo69012f() {
        Bundle bundle = new Bundle();
        bundle.putString(C26143a.f63928a, this.f59509a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo69013g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(C26143a.f63928a, this.f59509a);
        return p0Var;
    }

    public int hashCode() {
        return this.f59509a.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f59509a;
        return "NonFoodCheckoutStep1FragmentArgs(referenceId=" + str + ")";
    }
}
