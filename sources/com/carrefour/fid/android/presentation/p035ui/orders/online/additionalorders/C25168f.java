package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.f */
public final class C25168f {
    @C12579k

    /* renamed from: a */
    public static final C25172d f62004a = new C25172d((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62005b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.f$a */
    public static final class C25169a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final RecommendedProductsByDepartmentModel f62006a;

        /* renamed from: b */
        public final int f62007b = R.id.action_additionalOrderFragment_to_additionalOrderDepartmentFragment;

        public C25169a(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
            Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "recommendedProductsByDepartmentModel");
            this.f62006a = recommendedProductsByDepartmentModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C25169a m108810c(C25169a aVar, RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel, int i, Object obj) {
            if ((i & 1) != 0) {
                recommendedProductsByDepartmentModel = aVar.f62006a;
            }
            return aVar.mo73130b(recommendedProductsByDepartmentModel);
        }

        @C12579k
        /* renamed from: a */
        public final RecommendedProductsByDepartmentModel mo73129a() {
            return this.f62006a;
        }

        @C12579k
        /* renamed from: b */
        public final C25169a mo73130b(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
            Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "recommendedProductsByDepartmentModel");
            return new C25169a(recommendedProductsByDepartmentModel);
        }

        @C12579k
        /* renamed from: d */
        public final RecommendedProductsByDepartmentModel mo73131d() {
            return this.f62006a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25169a) && Intrinsics.areEqual((Object) this.f62006a, (Object) ((C25169a) obj).f62006a);
        }

        public int getActionId() {
            return this.f62007b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f62006a;
                Intrinsics.checkNotNull(recommendedProductsByDepartmentModel, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("recommendedProductsByDepartmentModel", recommendedProductsByDepartmentModel);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel2 = this.f62006a;
                Intrinsics.checkNotNull(recommendedProductsByDepartmentModel2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("recommendedProductsByDepartmentModel", (Serializable) recommendedProductsByDepartmentModel2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f62006a.hashCode();
        }

        @C12579k
        public String toString() {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f62006a;
            return "ActionAdditionalOrderFragmentToAdditionalOrderDepartmentFragment(recommendedProductsByDepartmentModel=" + recommendedProductsByDepartmentModel + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.f$b */
    public static final class C25170b implements C19693b0 {

        /* renamed from: a */
        public final int f62008a;

        /* renamed from: b */
        public final int f62009b = R.id.action_additionalOrderFragment_to_additionalOrderProductSearchFragment;

        public C25170b(int i) {
            this.f62008a = i;
        }

        /* renamed from: c */
        public static /* synthetic */ C25170b m108814c(C25170b bVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.f62008a;
            }
            return bVar.mo73136b(i);
        }

        /* renamed from: a */
        public final int mo73135a() {
            return this.f62008a;
        }

        @C12579k
        /* renamed from: b */
        public final C25170b mo73136b(int i) {
            return new C25170b(i);
        }

        /* renamed from: d */
        public final int mo73137d() {
            return this.f62008a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25170b) && this.f62008a == ((C25170b) obj).f62008a;
        }

        public int getActionId() {
            return this.f62009b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("sourceGraphId", this.f62008a);
            return bundle;
        }

        public int hashCode() {
            return Integer.hashCode(this.f62008a);
        }

        @C12579k
        public String toString() {
            int i = this.f62008a;
            return "ActionAdditionalOrderFragmentToAdditionalOrderProductSearchFragment(sourceGraphId=" + i + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.f$c */
    public static final class C25171c implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final OrderType f62010a;

        /* renamed from: b */
        public final int f62011b;

        /* renamed from: c */
        public final int f62012c = R.id.action_additionalOrderFragment_to_basketAdditionalOrderFragment;

        public C25171c(@C12580l OrderType orderType, int i) {
            this.f62010a = orderType;
            this.f62011b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C25171c m108818d(C25171c cVar, OrderType orderType, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                orderType = cVar.f62010a;
            }
            if ((i2 & 2) != 0) {
                i = cVar.f62011b;
            }
            return cVar.mo73143c(orderType, i);
        }

        @C12580l
        /* renamed from: a */
        public final OrderType mo73141a() {
            return this.f62010a;
        }

        /* renamed from: b */
        public final int mo73142b() {
            return this.f62011b;
        }

        @C12579k
        /* renamed from: c */
        public final C25171c mo73143c(@C12580l OrderType orderType, int i) {
            return new C25171c(orderType, i);
        }

        @C12580l
        /* renamed from: e */
        public final OrderType mo73144e() {
            return this.f62010a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25171c)) {
                return false;
            }
            C25171c cVar = (C25171c) obj;
            return Intrinsics.areEqual((Object) this.f62010a, (Object) cVar.f62010a) && this.f62011b == cVar.f62011b;
        }

        /* renamed from: f */
        public final int mo73146f() {
            return this.f62011b;
        }

        public int getActionId() {
            return this.f62012c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<OrderType> cls = OrderType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("orderType", this.f62010a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("orderType", (Serializable) this.f62010a);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putInt("sourceGraphId", this.f62011b);
            return bundle;
        }

        public int hashCode() {
            OrderType orderType = this.f62010a;
            return ((orderType == null ? 0 : orderType.hashCode()) * 31) + Integer.hashCode(this.f62011b);
        }

        @C12579k
        public String toString() {
            OrderType orderType = this.f62010a;
            int i = this.f62011b;
            return "ActionAdditionalOrderFragmentToBasketAdditionalOrderFragment(orderType=" + orderType + ", sourceGraphId=" + i + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.f$d */
    public static final class C25172d {
        public /* synthetic */ C25172d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo73149a(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
            Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "recommendedProductsByDepartmentModel");
            return new C25169a(recommendedProductsByDepartmentModel);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo73150b(int i) {
            return new C25170b(i);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo73151c() {
            return new C19690a(R.id.action_additionalOrderFragment_to_additionalOrderScanProductFragment);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo73152d(@C12580l OrderType orderType, int i) {
            return new C25171c(orderType, i);
        }

        public C25172d() {
        }
    }
}
