package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

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
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.a */
public final class C23209a implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C23210a f58892b = new C23210a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f58893c = 8;
    @C12579k

    /* renamed from: a */
    public final RecommendedProductsByDepartmentModel f58894a;

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.a$a */
    public static final class C23210a {
        public /* synthetic */ C23210a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C23209a mo68036a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C23209a.class.getClassLoader());
            if (bundle.containsKey("basketBuilder")) {
                Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = (RecommendedProductsByDepartmentModel) bundle.get("basketBuilder");
                    if (recommendedProductsByDepartmentModel != null) {
                        return new C23209a(recommendedProductsByDepartmentModel);
                    }
                    throw new IllegalArgumentException("Argument \"basketBuilder\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"basketBuilder\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C23209a mo68037b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("basketBuilder")) {
                Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = (RecommendedProductsByDepartmentModel) p0Var.mo57648h("basketBuilder");
                    if (recommendedProductsByDepartmentModel != null) {
                        return new C23209a(recommendedProductsByDepartmentModel);
                    }
                    throw new IllegalArgumentException("Argument \"basketBuilder\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"basketBuilder\" is missing and does not have an android:defaultValue");
        }

        public C23210a() {
        }
    }

    public C23209a(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
        Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "basketBuilder");
        this.f58894a = recommendedProductsByDepartmentModel;
    }

    /* renamed from: c */
    public static /* synthetic */ C23209a m103850c(C23209a aVar, RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendedProductsByDepartmentModel = aVar.f58894a;
        }
        return aVar.mo68029b(recommendedProductsByDepartmentModel);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C23209a m103851d(@C12579k C19456p0 p0Var) {
        return f58892b.mo68037b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23209a fromBundle(@C12579k Bundle bundle) {
        return f58892b.mo68036a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final RecommendedProductsByDepartmentModel mo68028a() {
        return this.f58894a;
    }

    @C12579k
    /* renamed from: b */
    public final C23209a mo68029b(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
        Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "basketBuilder");
        return new C23209a(recommendedProductsByDepartmentModel);
    }

    @C12579k
    /* renamed from: e */
    public final RecommendedProductsByDepartmentModel mo68030e() {
        return this.f58894a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23209a) && Intrinsics.areEqual((Object) this.f58894a, (Object) ((C23209a) obj).f58894a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo68032f() {
        Bundle bundle = new Bundle();
        Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f58894a;
            Intrinsics.checkNotNull(recommendedProductsByDepartmentModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("basketBuilder", recommendedProductsByDepartmentModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel2 = this.f58894a;
            Intrinsics.checkNotNull(recommendedProductsByDepartmentModel2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("basketBuilder", (Serializable) recommendedProductsByDepartmentModel2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo68033g() {
        C19456p0 p0Var = new C19456p0();
        Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f58894a;
            Intrinsics.checkNotNull(recommendedProductsByDepartmentModel, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("basketBuilder", recommendedProductsByDepartmentModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel2 = this.f58894a;
            Intrinsics.checkNotNull(recommendedProductsByDepartmentModel2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("basketBuilder", (Serializable) recommendedProductsByDepartmentModel2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f58894a.hashCode();
    }

    @C12579k
    public String toString() {
        RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f58894a;
        return "BasketBuilderDepartmentFragmentArgs(basketBuilder=" + recommendedProductsByDepartmentModel + ")";
    }
}
