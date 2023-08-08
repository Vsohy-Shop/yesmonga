package com.carrefour.fid.android.product.presentation.p039ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.models.ProductImagesModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.urbanairship.iam.C9259x;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.j */
public final class C27810j {
    @C12579k

    /* renamed from: a */
    public static final C27813c f67405a = new C27813c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f67406b = 0;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.j$a */
    public static final class C27811a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final OfferIdentifier f67407a;

        /* renamed from: b */
        public final int f67408b;
        @C12580l

        /* renamed from: c */
        public final String f67409c;

        /* renamed from: d */
        public final int f67410d;

        public C27811a() {
            this((OfferIdentifier) null, 0, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C27811a m116778e(C27811a aVar, OfferIdentifier offerIdentifier, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                offerIdentifier = aVar.f67407a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f67408b;
            }
            if ((i2 & 4) != 0) {
                str = aVar.f67409c;
            }
            return aVar.mo80775d(offerIdentifier, i, str);
        }

        @C12580l
        /* renamed from: a */
        public final OfferIdentifier mo80772a() {
            return this.f67407a;
        }

        /* renamed from: b */
        public final int mo80773b() {
            return this.f67408b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo80774c() {
            return this.f67409c;
        }

        @C12579k
        /* renamed from: d */
        public final C27811a mo80775d(@C12580l OfferIdentifier offerIdentifier, int i, @C12580l String str) {
            return new C27811a(offerIdentifier, i, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27811a)) {
                return false;
            }
            C27811a aVar = (C27811a) obj;
            return Intrinsics.areEqual((Object) this.f67407a, (Object) aVar.f67407a) && this.f67408b == aVar.f67408b && Intrinsics.areEqual((Object) this.f67409c, (Object) aVar.f67409c);
        }

        @C12580l
        /* renamed from: f */
        public final OfferIdentifier mo80777f() {
            return this.f67407a;
        }

        /* renamed from: g */
        public final int mo80778g() {
            return this.f67408b;
        }

        public int getActionId() {
            return this.f67410d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<OfferIdentifier> cls = OfferIdentifier.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("offerIdentifier", this.f67407a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("offerIdentifier", (Serializable) this.f67407a);
            }
            bundle.putInt(C9259x.f25239v, this.f67408b);
            bundle.putString(C28547h2.f69321i, this.f67409c);
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final String mo80779h() {
            return this.f67409c;
        }

        public int hashCode() {
            OfferIdentifier offerIdentifier = this.f67407a;
            int i = 0;
            int hashCode = (((offerIdentifier == null ? 0 : offerIdentifier.hashCode()) * 31) + Integer.hashCode(this.f67408b)) * 31;
            String str = this.f67409c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            OfferIdentifier offerIdentifier = this.f67407a;
            int i = this.f67408b;
            String str = this.f67409c;
            return "ActionProductDetailsFragmentToProductDetailsFragment(offerIdentifier=" + offerIdentifier + ", position=" + i + ", productEan=" + str + ")";
        }

        public C27811a(@C12580l OfferIdentifier offerIdentifier, int i, @C12580l String str) {
            this.f67407a = offerIdentifier;
            this.f67408b = i;
            this.f67409c = str;
            this.f67410d = C27609f.C27619j.action_productDetailsFragment_to_productDetailsFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27811a(OfferIdentifier offerIdentifier, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : offerIdentifier, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.j$b */
    public static final class C27812b implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final ProductImagesModel f67411a;

        /* renamed from: b */
        public final int f67412b;

        public C27812b() {
            this((ProductImagesModel) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C27812b m116786c(C27812b bVar, ProductImagesModel productImagesModel, int i, Object obj) {
            if ((i & 1) != 0) {
                productImagesModel = bVar.f67411a;
            }
            return bVar.mo80783b(productImagesModel);
        }

        @C12580l
        /* renamed from: a */
        public final ProductImagesModel mo80782a() {
            return this.f67411a;
        }

        @C12579k
        /* renamed from: b */
        public final C27812b mo80783b(@C12580l ProductImagesModel productImagesModel) {
            return new C27812b(productImagesModel);
        }

        @C12580l
        /* renamed from: d */
        public final ProductImagesModel mo80784d() {
            return this.f67411a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27812b) && Intrinsics.areEqual((Object) this.f67411a, (Object) ((C27812b) obj).f67411a);
        }

        public int getActionId() {
            return this.f67412b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<ProductImagesModel> cls = ProductImagesModel.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("product_images", this.f67411a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("product_images", (Serializable) this.f67411a);
            }
            return bundle;
        }

        public int hashCode() {
            ProductImagesModel productImagesModel = this.f67411a;
            if (productImagesModel == null) {
                return 0;
            }
            return productImagesModel.hashCode();
        }

        @C12579k
        public String toString() {
            ProductImagesModel productImagesModel = this.f67411a;
            return "ActionProductDetailsFragmentToProductDetailsImageFragment(productImages=" + productImagesModel + ")";
        }

        public C27812b(@C12580l ProductImagesModel productImagesModel) {
            this.f67411a = productImagesModel;
            this.f67412b = C27609f.C27619j.action_productDetailsFragment_to_productDetailsImageFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27812b(ProductImagesModel productImagesModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : productImagesModel);
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.j$c */
    public static final class C27813c {
        public /* synthetic */ C27813c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m116790b(C27813c cVar, OfferIdentifier offerIdentifier, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                offerIdentifier = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            return cVar.mo80788a(offerIdentifier, i, str);
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m116791d(C27813c cVar, ProductImagesModel productImagesModel, int i, Object obj) {
            if ((i & 1) != 0) {
                productImagesModel = null;
            }
            return cVar.mo80789c(productImagesModel);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo80788a(@C12580l OfferIdentifier offerIdentifier, int i, @C12580l String str) {
            return new C27811a(offerIdentifier, i, str);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo80789c(@C12580l ProductImagesModel productImagesModel) {
            return new C27812b(productImagesModel);
        }

        public C27813c() {
        }
    }
}
