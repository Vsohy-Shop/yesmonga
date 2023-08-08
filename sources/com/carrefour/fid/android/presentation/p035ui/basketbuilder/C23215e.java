package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.e */
public final class C23215e {
    @C12579k

    /* renamed from: a */
    public static final C23218c f58900a = new C23218c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f58901b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.e$a */
    public static final class C23216a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final AccountListType f58902a;

        /* renamed from: b */
        public final int f58903b;

        public C23216a() {
            this((AccountListType) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C23216a m103873c(C23216a aVar, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                accountListType = aVar.f58902a;
            }
            return aVar.mo68050b(accountListType);
        }

        @C12580l
        /* renamed from: a */
        public final AccountListType mo68049a() {
            return this.f58902a;
        }

        @C12579k
        /* renamed from: b */
        public final C23216a mo68050b(@C12580l AccountListType accountListType) {
            return new C23216a(accountListType);
        }

        @C12580l
        /* renamed from: d */
        public final AccountListType mo68051d() {
            return this.f58902a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23216a) && Intrinsics.areEqual((Object) this.f58902a, (Object) ((C23216a) obj).f58902a);
        }

        public int getActionId() {
            return this.f58903b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<AccountListType> cls = AccountListType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("account_list_type", this.f58902a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("account_list_type", (Serializable) this.f58902a);
            }
            return bundle;
        }

        public int hashCode() {
            AccountListType accountListType = this.f58902a;
            if (accountListType == null) {
                return 0;
            }
            return accountListType.hashCode();
        }

        @C12579k
        public String toString() {
            AccountListType accountListType = this.f58902a;
            return "ActionBasketBuilderFragmentToAccountList(accountListType=" + accountListType + ")";
        }

        public C23216a(@C12580l AccountListType accountListType) {
            this.f58902a = accountListType;
            this.f58903b = R.id.action_basketBuilderFragment_to_accountList;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23216a(AccountListType accountListType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : accountListType);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.e$b */
    public static final class C23217b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final RecommendedProductsByDepartmentModel f58904a;

        /* renamed from: b */
        public final int f58905b = R.id.action_basketBuilderRecommendedProductsFragment_to_basketBuilderDepartmentFragment;

        public C23217b(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
            Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "basketBuilder");
            this.f58904a = recommendedProductsByDepartmentModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C23217b m103877c(C23217b bVar, RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel, int i, Object obj) {
            if ((i & 1) != 0) {
                recommendedProductsByDepartmentModel = bVar.f58904a;
            }
            return bVar.mo68056b(recommendedProductsByDepartmentModel);
        }

        @C12579k
        /* renamed from: a */
        public final RecommendedProductsByDepartmentModel mo68055a() {
            return this.f58904a;
        }

        @C12579k
        /* renamed from: b */
        public final C23217b mo68056b(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
            Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "basketBuilder");
            return new C23217b(recommendedProductsByDepartmentModel);
        }

        @C12579k
        /* renamed from: d */
        public final RecommendedProductsByDepartmentModel mo68057d() {
            return this.f58904a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23217b) && Intrinsics.areEqual((Object) this.f58904a, (Object) ((C23217b) obj).f58904a);
        }

        public int getActionId() {
            return this.f58905b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<RecommendedProductsByDepartmentModel> cls = RecommendedProductsByDepartmentModel.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f58904a;
                Intrinsics.checkNotNull(recommendedProductsByDepartmentModel, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("basketBuilder", recommendedProductsByDepartmentModel);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel2 = this.f58904a;
                Intrinsics.checkNotNull(recommendedProductsByDepartmentModel2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("basketBuilder", (Serializable) recommendedProductsByDepartmentModel2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f58904a.hashCode();
        }

        @C12579k
        public String toString() {
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f58904a;
            return "ActionBasketBuilderRecommendedProductsFragmentToBasketBuilderDepartmentFragment(basketBuilder=" + recommendedProductsByDepartmentModel + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.e$c */
    public static final class C23218c {
        public /* synthetic */ C23218c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m103881b(C23218c cVar, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                accountListType = null;
            }
            return cVar.mo68061a(accountListType);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo68061a(@C12580l AccountListType accountListType) {
            return new C23216a(accountListType);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo68062c() {
            return new C19690a(R.id.action_basketBuilderFragment_to_searchFragment);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo68063d(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
            Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "basketBuilder");
            return new C23217b(recommendedProductsByDepartmentModel);
        }

        public C23218c() {
        }
    }
}
