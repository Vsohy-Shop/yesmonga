package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.models.BasketBuilderType;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25980u;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.d */
public final class C23213d implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C23214a f58897b = new C23214a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f58898c = 0;
    @C12579k

    /* renamed from: a */
    public final BasketBuilderType f58899a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.d$a */
    public static final class C23214a {
        public /* synthetic */ C23214a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23213d mo68047a(@C12579k Bundle bundle) {
            BasketBuilderType basketBuilderType;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23213d.class.getClassLoader());
            if (bundle.containsKey(C25980u.f63504a)) {
                Class<BasketBuilderType> cls = BasketBuilderType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    basketBuilderType = (BasketBuilderType) bundle.get(C25980u.f63504a);
                    if (basketBuilderType == null) {
                        throw new IllegalArgumentException("Argument \"basketBuilderType\" is marked as non-null but was passed a null value.");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                basketBuilderType = BasketBuilderType.FREQUENT_PURCHASES;
            }
            return new C23213d(basketBuilderType);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23213d mo68048b(@C12579k C19456p0 p0Var) {
            BasketBuilderType basketBuilderType;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(C25980u.f63504a)) {
                Class<BasketBuilderType> cls = BasketBuilderType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    basketBuilderType = (BasketBuilderType) p0Var.mo57648h(C25980u.f63504a);
                    if (basketBuilderType == null) {
                        throw new IllegalArgumentException("Argument \"basketBuilderType\" is marked as non-null but was passed a null value");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                basketBuilderType = BasketBuilderType.FREQUENT_PURCHASES;
            }
            return new C23213d(basketBuilderType);
        }

        public C23214a() {
        }
    }

    public C23213d() {
        this((BasketBuilderType) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C23213d m103864c(C23213d dVar, BasketBuilderType basketBuilderType, int i, Object obj) {
        if ((i & 1) != 0) {
            basketBuilderType = dVar.f58899a;
        }
        return dVar.mo68040b(basketBuilderType);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C23213d m103865d(@C12579k C19456p0 p0Var) {
        return f58897b.mo68048b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23213d fromBundle(@C12579k Bundle bundle) {
        return f58897b.mo68047a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final BasketBuilderType mo68039a() {
        return this.f58899a;
    }

    @C12579k
    /* renamed from: b */
    public final C23213d mo68040b(@C12579k BasketBuilderType basketBuilderType) {
        Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
        return new C23213d(basketBuilderType);
    }

    @C12579k
    /* renamed from: e */
    public final BasketBuilderType mo68041e() {
        return this.f58899a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23213d) && this.f58899a == ((C23213d) obj).f58899a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo68043f() {
        Bundle bundle = new Bundle();
        Class<BasketBuilderType> cls = BasketBuilderType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            BasketBuilderType basketBuilderType = this.f58899a;
            Intrinsics.checkNotNull(basketBuilderType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable(C25980u.f63504a, (Parcelable) basketBuilderType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            BasketBuilderType basketBuilderType2 = this.f58899a;
            Intrinsics.checkNotNull(basketBuilderType2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable(C25980u.f63504a, basketBuilderType2);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo68044g() {
        C19456p0 p0Var = new C19456p0();
        Class<BasketBuilderType> cls = BasketBuilderType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            BasketBuilderType basketBuilderType = this.f58899a;
            Intrinsics.checkNotNull(basketBuilderType, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q(C25980u.f63504a, (Parcelable) basketBuilderType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            BasketBuilderType basketBuilderType2 = this.f58899a;
            Intrinsics.checkNotNull(basketBuilderType2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q(C25980u.f63504a, basketBuilderType2);
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f58899a.hashCode();
    }

    @C12579k
    public String toString() {
        BasketBuilderType basketBuilderType = this.f58899a;
        return "BasketBuilderFragmentArgs(basketBuilderType=" + basketBuilderType + ")";
    }

    public C23213d(@C12579k BasketBuilderType basketBuilderType) {
        Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
        this.f58899a = basketBuilderType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23213d(BasketBuilderType basketBuilderType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BasketBuilderType.FREQUENT_PURCHASES : basketBuilderType);
    }
}
