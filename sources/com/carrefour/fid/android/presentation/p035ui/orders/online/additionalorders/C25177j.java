package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.j */
public final class C25177j {
    @C12579k

    /* renamed from: a */
    public static final C25180c f62018a = new C25180c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62019b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.j$a */
    public static final class C25178a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final Bundle f62020a;

        /* renamed from: b */
        public final int f62021b;

        public C25178a() {
            this((Bundle) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C25178a m108843c(C25178a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = aVar.f62020a;
            }
            return aVar.mo73167b(bundle);
        }

        @C12580l
        /* renamed from: a */
        public final Bundle mo73166a() {
            return this.f62020a;
        }

        @C12579k
        /* renamed from: b */
        public final C25178a mo73167b(@C12580l Bundle bundle) {
            return new C25178a(bundle);
        }

        @C12580l
        /* renamed from: d */
        public final Bundle mo73168d() {
            return this.f62020a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25178a) && Intrinsics.areEqual((Object) this.f62020a, (Object) ((C25178a) obj).f62020a);
        }

        public int getActionId() {
            return this.f62021b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Bundle> cls = Bundle.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable(CheckoutConfirmationFragment.f59773I0, this.f62020a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable(CheckoutConfirmationFragment.f59773I0, (Serializable) this.f62020a);
            }
            return bundle;
        }

        public int hashCode() {
            Bundle bundle = this.f62020a;
            if (bundle == null) {
                return 0;
            }
            return bundle.hashCode();
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f62020a;
            return "ActionBasketAdditionalOrderFragmentToCheckoutAdditionalOrderConfirmationFragment(orderConfirmation=" + bundle + ")";
        }

        public C25178a(@C12580l Bundle bundle) {
            this.f62020a = bundle;
            this.f62021b = R.id.action_basketAdditionalOrderFragment_to_checkoutAdditionalOrderConfirmationFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25178a(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bundle);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.j$b */
    public static final class C25179b implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final Bundle f62022a;

        /* renamed from: b */
        public final int f62023b;

        public C25179b() {
            this((Bundle) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C25179b m108847c(C25179b bVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = bVar.f62022a;
            }
            return bVar.mo73173b(bundle);
        }

        @C12580l
        /* renamed from: a */
        public final Bundle mo73172a() {
            return this.f62022a;
        }

        @C12579k
        /* renamed from: b */
        public final C25179b mo73173b(@C12580l Bundle bundle) {
            return new C25179b(bundle);
        }

        @C12580l
        /* renamed from: d */
        public final Bundle mo73174d() {
            return this.f62022a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25179b) && Intrinsics.areEqual((Object) this.f62022a, (Object) ((C25179b) obj).f62022a);
        }

        public int getActionId() {
            return this.f62023b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Bundle> cls = Bundle.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("error_payment", this.f62022a);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("error_payment", (Serializable) this.f62022a);
            }
            return bundle;
        }

        public int hashCode() {
            Bundle bundle = this.f62022a;
            if (bundle == null) {
                return 0;
            }
            return bundle.hashCode();
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f62022a;
            return "ActionBasketAdditionalOrderFragmentToCheckoutAdditionalOrderPaymentErrorFragment(errorPayment=" + bundle + ")";
        }

        public C25179b(@C12580l Bundle bundle) {
            this.f62022a = bundle;
            this.f62023b = R.id.action_basketAdditionalOrderFragment_to_checkoutAdditionalOrderPaymentErrorFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25179b(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bundle);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.j$c */
    public static final class C25180c {
        public /* synthetic */ C25180c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m108851b(C25180c cVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return cVar.mo73178a(bundle);
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m108852d(C25180c cVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return cVar.mo73179c(bundle);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo73178a(@C12580l Bundle bundle) {
            return new C25178a(bundle);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo73179c(@C12580l Bundle bundle) {
            return new C25179b(bundle);
        }

        public C25180c() {
        }
    }
}
