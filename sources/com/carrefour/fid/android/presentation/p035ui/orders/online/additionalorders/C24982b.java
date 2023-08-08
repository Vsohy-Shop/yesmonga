package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.b */
public final class C24982b implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C24983a f61789b = new C24983a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f61790c = 8;
    @C12579k

    /* renamed from: a */
    public final RecommendedProductsByDepartmentModel f61791a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.b$a */
    public static final class C24983a {
        public /* synthetic */ C24983a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24982b mo72782a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24982b.class.getClassLoader());
            if (bundle.containsKey("recommendedProductsByDepartmentModel")) {
                Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = (RecommendedProductsByDepartmentModel) bundle.get("recommendedProductsByDepartmentModel");
                    if (recommendedProductsByDepartmentModel != null) {
                        return new C24982b(recommendedProductsByDepartmentModel);
                    }
                    throw new IllegalArgumentException("Argument \"recommendedProductsByDepartmentModel\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"recommendedProductsByDepartmentModel\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24982b mo72783b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("recommendedProductsByDepartmentModel")) {
                Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = (RecommendedProductsByDepartmentModel) p0Var.mo57648h("recommendedProductsByDepartmentModel");
                    if (recommendedProductsByDepartmentModel != null) {
                        return new C24982b(recommendedProductsByDepartmentModel);
                    }
                    throw new IllegalArgumentException("Argument \"recommendedProductsByDepartmentModel\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"recommendedProductsByDepartmentModel\" is missing and does not have an android:defaultValue");
        }

        public C24983a() {
        }
    }

    public C24982b(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
        Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "recommendedProductsByDepartmentModel");
        this.f61791a = recommendedProductsByDepartmentModel;
    }

    /* renamed from: c */
    public static /* synthetic */ C24982b m108454c(C24982b bVar, RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendedProductsByDepartmentModel = bVar.f61791a;
        }
        return bVar.mo72775b(recommendedProductsByDepartmentModel);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C24982b m108455d(@C12579k C19456p0 p0Var) {
        return f61789b.mo72783b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24982b fromBundle(@C12579k Bundle bundle) {
        return f61789b.mo72782a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final RecommendedProductsByDepartmentModel mo72774a() {
        return this.f61791a;
    }

    @C12579k
    /* renamed from: b */
    public final C24982b mo72775b(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
        Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "recommendedProductsByDepartmentModel");
        return new C24982b(recommendedProductsByDepartmentModel);
    }

    @C12579k
    /* renamed from: e */
    public final RecommendedProductsByDepartmentModel mo72776e() {
        return this.f61791a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24982b) && Intrinsics.areEqual((Object) this.f61791a, (Object) ((C24982b) obj).f61791a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo72778f() {
        Bundle bundle = new Bundle();
        Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f61791a;
            Intrinsics.checkNotNull(recommendedProductsByDepartmentModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("recommendedProductsByDepartmentModel", recommendedProductsByDepartmentModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel2 = this.f61791a;
            Intrinsics.checkNotNull(recommendedProductsByDepartmentModel2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("recommendedProductsByDepartmentModel", (Serializable) recommendedProductsByDepartmentModel2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo72779g() {
        C19456p0 p0Var = new C19456p0();
        Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f61791a;
            Intrinsics.checkNotNull(recommendedProductsByDepartmentModel, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("recommendedProductsByDepartmentModel", recommendedProductsByDepartmentModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel2 = this.f61791a;
            Intrinsics.checkNotNull(recommendedProductsByDepartmentModel2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("recommendedProductsByDepartmentModel", (Serializable) recommendedProductsByDepartmentModel2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f61791a.hashCode();
    }

    @C12579k
    public String toString() {
        RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f61791a;
        return "AdditionalOrderDepartmentFragmentArgs(recommendedProductsByDepartmentModel=" + recommendedProductsByDepartmentModel + ")";
    }
}
