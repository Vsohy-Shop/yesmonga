package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.l */
public final class C27891l {
    @C12579k

    /* renamed from: a */
    public static final C27896e f67538a = new C27896e((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f67539b = 0;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.l$a */
    public static final class C27892a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final ReinsuranceType f67540a;

        /* renamed from: b */
        public final int f67541b;

        public C27892a() {
            this((ReinsuranceType) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C27892a m117019c(C27892a aVar, ReinsuranceType reinsuranceType, int i, Object obj) {
            if ((i & 1) != 0) {
                reinsuranceType = aVar.f67540a;
            }
            return aVar.mo81049b(reinsuranceType);
        }

        @C12579k
        /* renamed from: a */
        public final ReinsuranceType mo81048a() {
            return this.f67540a;
        }

        @C12579k
        /* renamed from: b */
        public final C27892a mo81049b(@C12579k ReinsuranceType reinsuranceType) {
            Intrinsics.checkNotNullParameter(reinsuranceType, "reinsuranceType");
            return new C27892a(reinsuranceType);
        }

        @C12579k
        /* renamed from: d */
        public final ReinsuranceType mo81050d() {
            return this.f67540a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27892a) && this.f67540a == ((C27892a) obj).f67540a;
        }

        public int getActionId() {
            return this.f67541b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<ReinsuranceType> cls = ReinsuranceType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                ReinsuranceType reinsuranceType = this.f67540a;
                Intrinsics.checkNotNull(reinsuranceType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("reinsurance_type", (Parcelable) reinsuranceType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                ReinsuranceType reinsuranceType2 = this.f67540a;
                Intrinsics.checkNotNull(reinsuranceType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("reinsurance_type", reinsuranceType2);
            }
            return bundle;
        }

        public int hashCode() {
            return this.f67540a.hashCode();
        }

        @C12579k
        public String toString() {
            ReinsuranceType reinsuranceType = this.f67540a;
            return "ActionNonFoodProductDetailsFragmentToReinsuranceFragment(reinsuranceType=" + reinsuranceType + ")";
        }

        public C27892a(@C12579k ReinsuranceType reinsuranceType) {
            Intrinsics.checkNotNullParameter(reinsuranceType, "reinsuranceType");
            this.f67540a = reinsuranceType;
            this.f67541b = C27609f.C27619j.action_nonFoodProductDetailsFragment_to_reinsuranceFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27892a(ReinsuranceType reinsuranceType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ReinsuranceType.REFUNDED : reinsuranceType);
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.l$b */
    public static final class C27893b implements C19693b0 {

        /* renamed from: a */
        public final boolean f67542a;

        /* renamed from: b */
        public final int f67543b;

        public C27893b() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C27893b m117023c(C27893b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f67542a;
            }
            return bVar.mo81055b(z);
        }

        /* renamed from: a */
        public final boolean mo81054a() {
            return this.f67542a;
        }

        @C12579k
        /* renamed from: b */
        public final C27893b mo81055b(boolean z) {
            return new C27893b(z);
        }

        /* renamed from: d */
        public final boolean mo81056d() {
            return this.f67542a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27893b) && this.f67542a == ((C27893b) obj).f67542a;
        }

        public int getActionId() {
            return this.f67543b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("relayPointEligible", this.f67542a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f67542a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f67542a;
            return "ActionProductDetailsFragmentToDeliveryChoiceInfoFragment(relayPointEligible=" + z + ")";
        }

        public C27893b(boolean z) {
            this.f67542a = z;
            this.f67543b = C27609f.C27619j.action_productDetailsFragment_to_deliveryChoiceInfoFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27893b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.l$c */
    public static final class C27894c implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final OfferIdentifier f67544a;

        /* renamed from: b */
        public final int f67545b;
        @C12580l

        /* renamed from: c */
        public final String f67546c;

        /* renamed from: d */
        public final int f67547d;

        public C27894c() {
            this((OfferIdentifier) null, 0, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C27894c m117027e(C27894c cVar, OfferIdentifier offerIdentifier, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                offerIdentifier = cVar.f67544a;
            }
            if ((i2 & 2) != 0) {
                i = cVar.f67545b;
            }
            if ((i2 & 4) != 0) {
                str = cVar.f67546c;
            }
            return cVar.mo81063d(offerIdentifier, i, str);
        }

        @C12580l
        /* renamed from: a */
        public final OfferIdentifier mo81060a() {
            return this.f67544a;
        }

        /* renamed from: b */
        public final int mo81061b() {
            return this.f67545b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo81062c() {
            return this.f67546c;
        }

        @C12579k
        /* renamed from: d */
        public final C27894c mo81063d(@C12580l OfferIdentifier offerIdentifier, int i, @C12580l String str) {
            return new C27894c(offerIdentifier, i, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27894c)) {
                return false;
            }
            C27894c cVar = (C27894c) obj;
            return Intrinsics.areEqual((Object) this.f67544a, (Object) cVar.f67544a) && this.f67545b == cVar.f67545b && Intrinsics.areEqual((Object) this.f67546c, (Object) cVar.f67546c);
        }

        @C12580l
        /* renamed from: f */
        public final OfferIdentifier mo81065f() {
            return this.f67544a;
        }

        /* renamed from: g */
        public final int mo81066g() {
            return this.f67545b;
        }

        public int getActionId() {
            return this.f67547d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<OfferIdentifier> cls = OfferIdentifier.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("offerIdentifier", this.f67544a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("offerIdentifier", (Serializable) this.f67544a);
            }
            bundle.putInt(C9259x.f25239v, this.f67545b);
            bundle.putString(C28547h2.f69321i, this.f67546c);
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final String mo81067h() {
            return this.f67546c;
        }

        public int hashCode() {
            OfferIdentifier offerIdentifier = this.f67544a;
            int i = 0;
            int hashCode = (((offerIdentifier == null ? 0 : offerIdentifier.hashCode()) * 31) + Integer.hashCode(this.f67545b)) * 31;
            String str = this.f67546c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            OfferIdentifier offerIdentifier = this.f67544a;
            int i = this.f67545b;
            String str = this.f67546c;
            return "ActionProductDetailsFragmentToProductDetailsFragment(offerIdentifier=" + offerIdentifier + ", position=" + i + ", productEan=" + str + ")";
        }

        public C27894c(@C12580l OfferIdentifier offerIdentifier, int i, @C12580l String str) {
            this.f67544a = offerIdentifier;
            this.f67545b = i;
            this.f67546c = str;
            this.f67547d = C27609f.C27619j.action_productDetailsFragment_to_productDetailsFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27894c(OfferIdentifier offerIdentifier, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : offerIdentifier, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.l$d */
    public static final class C27895d implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final ProductImagesModel f67548a;

        /* renamed from: b */
        public final int f67549b;

        public C27895d() {
            this((ProductImagesModel) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C27895d m117035c(C27895d dVar, ProductImagesModel productImagesModel, int i, Object obj) {
            if ((i & 1) != 0) {
                productImagesModel = dVar.f67548a;
            }
            return dVar.mo81071b(productImagesModel);
        }

        @C12580l
        /* renamed from: a */
        public final ProductImagesModel mo81070a() {
            return this.f67548a;
        }

        @C12579k
        /* renamed from: b */
        public final C27895d mo81071b(@C12580l ProductImagesModel productImagesModel) {
            return new C27895d(productImagesModel);
        }

        @C12580l
        /* renamed from: d */
        public final ProductImagesModel mo81072d() {
            return this.f67548a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27895d) && Intrinsics.areEqual((Object) this.f67548a, (Object) ((C27895d) obj).f67548a);
        }

        public int getActionId() {
            return this.f67549b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<ProductImagesModel> cls = ProductImagesModel.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("product_images", this.f67548a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("product_images", (Serializable) this.f67548a);
            }
            return bundle;
        }

        public int hashCode() {
            ProductImagesModel productImagesModel = this.f67548a;
            if (productImagesModel == null) {
                return 0;
            }
            return productImagesModel.hashCode();
        }

        @C12579k
        public String toString() {
            ProductImagesModel productImagesModel = this.f67548a;
            return "ActionProductDetailsFragmentToProductDetailsImageFragment(productImages=" + productImagesModel + ")";
        }

        public C27895d(@C12580l ProductImagesModel productImagesModel) {
            this.f67548a = productImagesModel;
            this.f67549b = C27609f.C27619j.action_productDetailsFragment_to_productDetailsImageFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27895d(ProductImagesModel productImagesModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : productImagesModel);
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.l$e */
    public static final class C27896e {
        public /* synthetic */ C27896e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m117039b(C27896e eVar, ReinsuranceType reinsuranceType, int i, Object obj) {
            if ((i & 1) != 0) {
                reinsuranceType = ReinsuranceType.REFUNDED;
            }
            return eVar.mo81076a(reinsuranceType);
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m117040d(C27896e eVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return eVar.mo81077c(z);
        }

        /* renamed from: f */
        public static /* synthetic */ C19693b0 m117041f(C27896e eVar, OfferIdentifier offerIdentifier, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                offerIdentifier = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            return eVar.mo81078e(offerIdentifier, i, str);
        }

        /* renamed from: h */
        public static /* synthetic */ C19693b0 m117042h(C27896e eVar, ProductImagesModel productImagesModel, int i, Object obj) {
            if ((i & 1) != 0) {
                productImagesModel = null;
            }
            return eVar.mo81079g(productImagesModel);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo81076a(@C12579k ReinsuranceType reinsuranceType) {
            Intrinsics.checkNotNullParameter(reinsuranceType, "reinsuranceType");
            return new C27892a(reinsuranceType);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo81077c(boolean z) {
            return new C27893b(z);
        }

        @C12579k
        /* renamed from: e */
        public final C19693b0 mo81078e(@C12580l OfferIdentifier offerIdentifier, int i, @C12580l String str) {
            return new C27894c(offerIdentifier, i, str);
        }

        @C12579k
        /* renamed from: g */
        public final C19693b0 mo81079g(@C12580l ProductImagesModel productImagesModel) {
            return new C27895d(productImagesModel);
        }

        public C27896e() {
        }
    }
}
