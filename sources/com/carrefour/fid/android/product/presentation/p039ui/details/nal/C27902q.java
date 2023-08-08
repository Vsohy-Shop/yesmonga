package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.q */
public final class C27902q implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C27903a f67559b = new C27903a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f67560c = 0;
    @C12579k

    /* renamed from: a */
    public final ReinsuranceType f67561a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.q$a */
    public static final class C27903a {
        public /* synthetic */ C27903a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27902q mo81101a(@C12579k Bundle bundle) {
            ReinsuranceType reinsuranceType;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27902q.class.getClassLoader());
            if (bundle.containsKey("reinsurance_type")) {
                Class<ReinsuranceType> cls = ReinsuranceType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    reinsuranceType = (ReinsuranceType) bundle.get("reinsurance_type");
                    if (reinsuranceType == null) {
                        throw new IllegalArgumentException("Argument \"reinsurance_type\" is marked as non-null but was passed a null value.");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                reinsuranceType = ReinsuranceType.REFUNDED;
            }
            return new C27902q(reinsuranceType);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C27902q mo81102b(@C12579k C19456p0 p0Var) {
            ReinsuranceType reinsuranceType;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("reinsurance_type")) {
                Class<ReinsuranceType> cls = ReinsuranceType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    reinsuranceType = (ReinsuranceType) p0Var.mo57648h("reinsurance_type");
                    if (reinsuranceType == null) {
                        throw new IllegalArgumentException("Argument \"reinsurance_type\" is marked as non-null but was passed a null value");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                reinsuranceType = ReinsuranceType.REFUNDED;
            }
            return new C27902q(reinsuranceType);
        }

        public C27903a() {
        }
    }

    public C27902q() {
        this((ReinsuranceType) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C27902q m117063c(C27902q qVar, ReinsuranceType reinsuranceType, int i, Object obj) {
        if ((i & 1) != 0) {
            reinsuranceType = qVar.f67561a;
        }
        return qVar.mo81094b(reinsuranceType);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C27902q m117064d(@C12579k C19456p0 p0Var) {
        return f67559b.mo81102b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27902q fromBundle(@C12579k Bundle bundle) {
        return f67559b.mo81101a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final ReinsuranceType mo81093a() {
        return this.f67561a;
    }

    @C12579k
    /* renamed from: b */
    public final C27902q mo81094b(@C12579k ReinsuranceType reinsuranceType) {
        Intrinsics.checkNotNullParameter(reinsuranceType, "reinsuranceType");
        return new C27902q(reinsuranceType);
    }

    @C12579k
    /* renamed from: e */
    public final ReinsuranceType mo81095e() {
        return this.f67561a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27902q) && this.f67561a == ((C27902q) obj).f67561a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo81097f() {
        Bundle bundle = new Bundle();
        Class<ReinsuranceType> cls = ReinsuranceType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ReinsuranceType reinsuranceType = this.f67561a;
            Intrinsics.checkNotNull(reinsuranceType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("reinsurance_type", (Parcelable) reinsuranceType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ReinsuranceType reinsuranceType2 = this.f67561a;
            Intrinsics.checkNotNull(reinsuranceType2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("reinsurance_type", reinsuranceType2);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo81098g() {
        C19456p0 p0Var = new C19456p0();
        Class<ReinsuranceType> cls = ReinsuranceType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ReinsuranceType reinsuranceType = this.f67561a;
            Intrinsics.checkNotNull(reinsuranceType, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("reinsurance_type", (Parcelable) reinsuranceType);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ReinsuranceType reinsuranceType2 = this.f67561a;
            Intrinsics.checkNotNull(reinsuranceType2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("reinsurance_type", reinsuranceType2);
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f67561a.hashCode();
    }

    @C12579k
    public String toString() {
        ReinsuranceType reinsuranceType = this.f67561a;
        return "ReinsuranceFragmentArgs(reinsuranceType=" + reinsuranceType + ")";
    }

    public C27902q(@C12579k ReinsuranceType reinsuranceType) {
        Intrinsics.checkNotNullParameter(reinsuranceType, "reinsuranceType");
        this.f67561a = reinsuranceType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27902q(ReinsuranceType reinsuranceType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ReinsuranceType.REFUNDED : reinsuranceType);
    }
}
