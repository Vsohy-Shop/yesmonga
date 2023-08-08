package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.d */
public final class C25665d {
    @C12579k

    /* renamed from: a */
    public static final C25667b f62937a = new C25667b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62938b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.d$a */
    public static final class C25666a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final OrderType f62939a;

        /* renamed from: b */
        public final int f62940b;

        /* renamed from: c */
        public final int f62941c = R.id.action_additionalOrderSearchResultFragment_to_basketAdditionalOrderFragment;

        public C25666a(@C12580l OrderType orderType, int i) {
            this.f62939a = orderType;
            this.f62940b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C25666a m110313d(C25666a aVar, OrderType orderType, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                orderType = aVar.f62939a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f62940b;
            }
            return aVar.mo74586c(orderType, i);
        }

        @C12580l
        /* renamed from: a */
        public final OrderType mo74584a() {
            return this.f62939a;
        }

        /* renamed from: b */
        public final int mo74585b() {
            return this.f62940b;
        }

        @C12579k
        /* renamed from: c */
        public final C25666a mo74586c(@C12580l OrderType orderType, int i) {
            return new C25666a(orderType, i);
        }

        @C12580l
        /* renamed from: e */
        public final OrderType mo74587e() {
            return this.f62939a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25666a)) {
                return false;
            }
            C25666a aVar = (C25666a) obj;
            return Intrinsics.areEqual((Object) this.f62939a, (Object) aVar.f62939a) && this.f62940b == aVar.f62940b;
        }

        /* renamed from: f */
        public final int mo74589f() {
            return this.f62940b;
        }

        public int getActionId() {
            return this.f62941c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<OrderType> cls = OrderType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("orderType", this.f62939a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("orderType", (Serializable) this.f62939a);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putInt("sourceGraphId", this.f62940b);
            return bundle;
        }

        public int hashCode() {
            OrderType orderType = this.f62939a;
            return ((orderType == null ? 0 : orderType.hashCode()) * 31) + Integer.hashCode(this.f62940b);
        }

        @C12579k
        public String toString() {
            OrderType orderType = this.f62939a;
            int i = this.f62940b;
            return "ActionAdditionalOrderSearchResultFragmentToBasketAdditionalOrderFragment(orderType=" + orderType + ", sourceGraphId=" + i + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.d$b */
    public static final class C25667b {
        public /* synthetic */ C25667b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo74592a() {
            return new C19690a(R.id.action_additionalOrderSearchResultFragment_to_additionalOrderScanProductFragment);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo74593b(@C12580l OrderType orderType, int i) {
            return new C25666a(orderType, i);
        }

        public C25667b() {
        }
    }
}
