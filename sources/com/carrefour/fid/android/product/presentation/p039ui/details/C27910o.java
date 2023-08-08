package com.carrefour.fid.android.product.presentation.p039ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.product.presentation.models.ProductImagesModel;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.o */
public final class C27910o implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C27911a f67572b = new C27911a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f67573c = 8;
    @C12580l

    /* renamed from: a */
    public final ProductImagesModel f67574a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.o$a */
    public static final class C27911a {
        public /* synthetic */ C27911a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27910o mo81130a(@C12579k Bundle bundle) {
            ProductImagesModel productImagesModel;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27910o.class.getClassLoader());
            if (bundle.containsKey("product_images")) {
                Class<ProductImagesModel> cls = ProductImagesModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    productImagesModel = (ProductImagesModel) bundle.get("product_images");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                productImagesModel = null;
            }
            return new C27910o(productImagesModel);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C27910o mo81131b(@C12579k C19456p0 p0Var) {
            ProductImagesModel productImagesModel;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("product_images")) {
                Class<ProductImagesModel> cls = ProductImagesModel.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    productImagesModel = (ProductImagesModel) p0Var.mo57648h("product_images");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                productImagesModel = null;
            }
            return new C27910o(productImagesModel);
        }

        public C27911a() {
        }
    }

    public C27910o() {
        this((ProductImagesModel) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C27910o m117091c(C27910o oVar, ProductImagesModel productImagesModel, int i, Object obj) {
        if ((i & 1) != 0) {
            productImagesModel = oVar.f67574a;
        }
        return oVar.mo81123b(productImagesModel);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C27910o m117092d(@C12579k C19456p0 p0Var) {
        return f67572b.mo81131b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27910o fromBundle(@C12579k Bundle bundle) {
        return f67572b.mo81130a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final ProductImagesModel mo81122a() {
        return this.f67574a;
    }

    @C12579k
    /* renamed from: b */
    public final C27910o mo81123b(@C12580l ProductImagesModel productImagesModel) {
        return new C27910o(productImagesModel);
    }

    @C12580l
    /* renamed from: e */
    public final ProductImagesModel mo81124e() {
        return this.f67574a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27910o) && Intrinsics.areEqual((Object) this.f67574a, (Object) ((C27910o) obj).f67574a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo81126f() {
        Bundle bundle = new Bundle();
        Class<ProductImagesModel> cls = ProductImagesModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("product_images", this.f67574a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("product_images", (Serializable) this.f67574a);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo81127g() {
        C19456p0 p0Var = new C19456p0();
        Class<ProductImagesModel> cls = ProductImagesModel.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("product_images", this.f67574a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("product_images", (Serializable) this.f67574a);
        }
        return p0Var;
    }

    public int hashCode() {
        ProductImagesModel productImagesModel = this.f67574a;
        if (productImagesModel == null) {
            return 0;
        }
        return productImagesModel.hashCode();
    }

    @C12579k
    public String toString() {
        ProductImagesModel productImagesModel = this.f67574a;
        return "ProductDetailsImageFragmentArgs(productImages=" + productImagesModel + ")";
    }

    public C27910o(@C12580l ProductImagesModel productImagesModel) {
        this.f67574a = productImagesModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27910o(ProductImagesModel productImagesModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : productImagesModel);
    }
}
