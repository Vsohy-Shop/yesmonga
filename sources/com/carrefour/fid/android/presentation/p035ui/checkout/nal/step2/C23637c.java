package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.c */
public final class C23637c implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C23638a f59606c = new C23638a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f59607d = 8;
    @C12579k

    /* renamed from: a */
    public final String f59608a;
    @C12580l

    /* renamed from: b */
    public final Bundle f59609b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.c$a */
    public static final class C23638a {
        public /* synthetic */ C23638a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23637c mo69218a(@C12579k Bundle bundle) {
            Bundle bundle2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23637c.class.getClassLoader());
            if (bundle.containsKey(C26190a.f64037a)) {
                String string = bundle.getString(C26190a.f64037a);
                if (string != null) {
                    if (bundle.containsKey(C38212b.f96795c)) {
                        Class<Bundle> cls = Bundle.class;
                        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                            bundle2 = (Bundle) bundle.get(C38212b.f96795c);
                        } else {
                            String name = cls.getName();
                            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                    } else {
                        bundle2 = null;
                    }
                    return new C23637c(string, bundle2);
                }
                throw new IllegalArgumentException("Argument \"sub_basket_id\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"sub_basket_id\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23637c mo69219b(@C12579k C19456p0 p0Var) {
            Bundle bundle;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(C26190a.f64037a)) {
                String str = (String) p0Var.mo57648h(C26190a.f64037a);
                if (str != null) {
                    if (p0Var.mo57647f(C38212b.f96795c)) {
                        Class<Bundle> cls = Bundle.class;
                        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                            bundle = (Bundle) p0Var.mo57648h(C38212b.f96795c);
                        } else {
                            String name = cls.getName();
                            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                    } else {
                        bundle = null;
                    }
                    return new C23637c(str, bundle);
                }
                throw new IllegalArgumentException("Argument \"sub_basket_id\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"sub_basket_id\" is missing and does not have an android:defaultValue");
        }

        public C23638a() {
        }
    }

    public C23637c(@C12579k String str, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "subBasketId");
        this.f59608a = str;
        this.f59609b = bundle;
    }

    /* renamed from: d */
    public static /* synthetic */ C23637c m104972d(C23637c cVar, String str, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f59608a;
        }
        if ((i & 2) != 0) {
            bundle = cVar.f59609b;
        }
        return cVar.mo69210c(str, bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C23637c m104973e(@C12579k C19456p0 p0Var) {
        return f59606c.mo69219b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23637c fromBundle(@C12579k Bundle bundle) {
        return f59606c.mo69218a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo69208a() {
        return this.f59608a;
    }

    @C12580l
    /* renamed from: b */
    public final Bundle mo69209b() {
        return this.f59609b;
    }

    @C12579k
    /* renamed from: c */
    public final C23637c mo69210c(@C12579k String str, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "subBasketId");
        return new C23637c(str, bundle);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23637c)) {
            return false;
        }
        C23637c cVar = (C23637c) obj;
        return Intrinsics.areEqual((Object) this.f59608a, (Object) cVar.f59608a) && Intrinsics.areEqual((Object) this.f59609b, (Object) cVar.f59609b);
    }

    @C12580l
    /* renamed from: f */
    public final Bundle mo69212f() {
        return this.f59609b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo69213g() {
        return this.f59608a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo69214h() {
        Bundle bundle = new Bundle();
        bundle.putString(C26190a.f64037a, this.f59608a);
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable(C38212b.f96795c, this.f59609b);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59609b);
        }
        return bundle;
    }

    public int hashCode() {
        int hashCode = this.f59608a.hashCode() * 31;
        Bundle bundle = this.f59609b;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo69216i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(C26190a.f64037a, this.f59608a);
        Class<Bundle> cls = Bundle.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q(C38212b.f96795c, this.f59609b);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q(C38212b.f96795c, (Serializable) this.f59609b);
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f59608a;
        Bundle bundle = this.f59609b;
        return "NonFoodCheckoutStep2FragmentArgs(subBasketId=" + str + ", categoryListByGtin=" + bundle + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23637c(String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle);
    }
}
