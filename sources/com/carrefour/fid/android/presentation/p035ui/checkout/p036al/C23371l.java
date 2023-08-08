package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36181l;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.shared.constant.C28559l;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.l */
public final class C23371l {
    @C12579k

    /* renamed from: a */
    public static final C23373b f59175a = new C23373b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f59176b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.l$a */
    public static final class C23372a implements C19693b0 {

        /* renamed from: a */
        public final boolean f59177a;
        @C12580l

        /* renamed from: b */
        public final SlotExpress f59178b;

        /* renamed from: c */
        public final boolean f59179c;
        @C12580l

        /* renamed from: d */
        public final Bundle f59180d;

        /* renamed from: e */
        public final int f59181e;

        public C23372a() {
            this(false, (SlotExpress) null, false, (Bundle) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public static /* synthetic */ C23372a m104277f(C23372a aVar, boolean z, SlotExpress slotExpress, boolean z2, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f59177a;
            }
            if ((i & 2) != 0) {
                slotExpress = aVar.f59178b;
            }
            if ((i & 4) != 0) {
                z2 = aVar.f59179c;
            }
            if ((i & 8) != 0) {
                bundle = aVar.f59180d;
            }
            return aVar.mo68475e(z, slotExpress, z2, bundle);
        }

        /* renamed from: a */
        public final boolean mo68471a() {
            return this.f59177a;
        }

        @C12580l
        /* renamed from: b */
        public final SlotExpress mo68472b() {
            return this.f59178b;
        }

        /* renamed from: c */
        public final boolean mo68473c() {
            return this.f59179c;
        }

        @C12580l
        /* renamed from: d */
        public final Bundle mo68474d() {
            return this.f59180d;
        }

        @C12579k
        /* renamed from: e */
        public final C23372a mo68475e(boolean z, @C12580l SlotExpress slotExpress, boolean z2, @C12580l Bundle bundle) {
            return new C23372a(z, slotExpress, z2, bundle);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23372a)) {
                return false;
            }
            C23372a aVar = (C23372a) obj;
            return this.f59177a == aVar.f59177a && Intrinsics.areEqual((Object) this.f59178b, (Object) aVar.f59178b) && this.f59179c == aVar.f59179c && Intrinsics.areEqual((Object) this.f59180d, (Object) aVar.f59180d);
        }

        @C12580l
        /* renamed from: g */
        public final SlotExpress mo68477g() {
            return this.f59178b;
        }

        public int getActionId() {
            return this.f59181e;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C28559l.f69485a, this.f59177a);
            Class<Parcelable> cls = Parcelable.class;
            Class<SlotExpress> cls2 = SlotExpress.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable("basket_slot_express", this.f59178b);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable("basket_slot_express", (Serializable) this.f59178b);
            }
            bundle.putBoolean(C36181l.f89333a, this.f59179c);
            Class<Bundle> cls4 = Bundle.class;
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable(C38212b.f96795c, this.f59180d);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59180d);
            }
            return bundle;
        }

        @C12580l
        /* renamed from: h */
        public final Bundle mo68478h() {
            return this.f59180d;
        }

        public int hashCode() {
            boolean z = this.f59177a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            SlotExpress slotExpress = this.f59178b;
            int i2 = 0;
            int hashCode = (i + (slotExpress == null ? 0 : slotExpress.hashCode())) * 31;
            boolean z3 = this.f59179c;
            if (!z3) {
                z2 = z3;
            }
            int i3 = (hashCode + (z2 ? 1 : 0)) * 31;
            Bundle bundle = this.f59180d;
            if (bundle != null) {
                i2 = bundle.hashCode();
            }
            return i3 + i2;
        }

        /* renamed from: i */
        public final boolean mo68480i() {
            return this.f59177a;
        }

        /* renamed from: j */
        public final boolean mo68481j() {
            return this.f59179c;
        }

        @C12579k
        public String toString() {
            boolean z = this.f59177a;
            SlotExpress slotExpress = this.f59178b;
            boolean z2 = this.f59179c;
            Bundle bundle = this.f59180d;
            return "ActionCheckoutStep2FragmentToCheckoutStep3Fragment(isExpressPickup=" + z + ", basketSlotExpress=" + slotExpress + ", isPostOrderSubstitutionEnabled=" + z2 + ", categoryListByGtin=" + bundle + ")";
        }

        public C23372a(boolean z, @C12580l SlotExpress slotExpress, boolean z2, @C12580l Bundle bundle) {
            this.f59177a = z;
            this.f59178b = slotExpress;
            this.f59179c = z2;
            this.f59180d = bundle;
            this.f59181e = R.id.action_checkoutStep2Fragment_to_checkoutStep3Fragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23372a(boolean z, SlotExpress slotExpress, boolean z2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : slotExpress, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : bundle);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.l$b */
    public static final class C23373b {
        public /* synthetic */ C23373b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m104287b(C23373b bVar, boolean z, SlotExpress slotExpress, boolean z2, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                slotExpress = null;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                bundle = null;
            }
            return bVar.mo68483a(z, slotExpress, z2, bundle);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo68483a(boolean z, @C12580l SlotExpress slotExpress, boolean z2, @C12580l Bundle bundle) {
            return new C23372a(z, slotExpress, z2, bundle);
        }

        public C23373b() {
        }
    }
}
