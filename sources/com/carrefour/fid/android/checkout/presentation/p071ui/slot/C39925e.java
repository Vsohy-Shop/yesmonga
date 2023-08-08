package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.e */
public final class C39925e {
    @C12579k

    /* renamed from: a */
    public static final C39927b f101812a = new C39927b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f101813b = 0;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.e$b */
    public static final class C39927b {
        public /* synthetic */ C39927b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m162690b(C39927b bVar, String str, boolean z, BasketSlot basketSlot, Bundle bundle, SlotArgsHome slotArgsHome, String str2, OrderType orderType, int i, Object obj) {
            boolean z2 = (i & 2) != 0 ? false : z;
            OrderType orderType2 = null;
            BasketSlot basketSlot2 = (i & 4) != 0 ? null : basketSlot;
            Bundle bundle2 = (i & 8) != 0 ? null : bundle;
            SlotArgsHome slotArgsHome2 = (i & 16) != 0 ? null : slotArgsHome;
            String str3 = (i & 32) != 0 ? null : str2;
            if ((i & 64) == 0) {
                orderType2 = orderType;
            }
            return bVar.mo131647a(str, z2, basketSlot2, bundle2, slotArgsHome2, str3, orderType2);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo131647a(@C12579k String str, boolean z, @C12580l BasketSlot basketSlot, @C12580l Bundle bundle, @C12580l SlotArgsHome slotArgsHome, @C12580l String str2, @C12580l OrderType orderType) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            return new C39926a(str, z, basketSlot, bundle, slotArgsHome, str2, orderType);
        }

        public C39927b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.e$a */
    public static final class C39926a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f101814a;

        /* renamed from: b */
        public final boolean f101815b;
        @C12580l

        /* renamed from: c */
        public final BasketSlot f101816c;
        @C12580l

        /* renamed from: d */
        public final Bundle f101817d;
        @C12580l

        /* renamed from: e */
        public final SlotArgsHome f101818e;
        @C12580l

        /* renamed from: f */
        public final String f101819f;
        @C12580l

        /* renamed from: g */
        public final OrderType f101820g;

        /* renamed from: h */
        public final int f101821h;

        public C39926a(@C12579k String str, boolean z, @C12580l BasketSlot basketSlot, @C12580l Bundle bundle, @C12580l SlotArgsHome slotArgsHome, @C12580l String str2, @C12580l OrderType orderType) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            this.f101814a = str;
            this.f101815b = z;
            this.f101816c = basketSlot;
            this.f101817d = bundle;
            this.f101818e = slotArgsHome;
            this.f101819f = str2;
            this.f101820g = orderType;
            this.f101821h = C39805b.C39815j.action_serviceSlotFragment_to_serviceSlotOmrFragment;
        }

        /* renamed from: i */
        public static /* synthetic */ C39926a m162674i(C39926a aVar, String str, boolean z, BasketSlot basketSlot, Bundle bundle, SlotArgsHome slotArgsHome, String str2, OrderType orderType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f101814a;
            }
            if ((i & 2) != 0) {
                z = aVar.f101815b;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                basketSlot = aVar.f101816c;
            }
            BasketSlot basketSlot2 = basketSlot;
            if ((i & 8) != 0) {
                bundle = aVar.f101817d;
            }
            Bundle bundle2 = bundle;
            if ((i & 16) != 0) {
                slotArgsHome = aVar.f101818e;
            }
            SlotArgsHome slotArgsHome2 = slotArgsHome;
            if ((i & 32) != 0) {
                str2 = aVar.f101819f;
            }
            String str3 = str2;
            if ((i & 64) != 0) {
                orderType = aVar.f101820g;
            }
            return aVar.mo131637h(str, z2, basketSlot2, bundle2, slotArgsHome2, str3, orderType);
        }

        @C12579k
        /* renamed from: a */
        public final String mo131629a() {
            return this.f101814a;
        }

        /* renamed from: b */
        public final boolean mo131630b() {
            return this.f101815b;
        }

        @C12580l
        /* renamed from: c */
        public final BasketSlot mo131631c() {
            return this.f101816c;
        }

        @C12580l
        /* renamed from: d */
        public final Bundle mo131632d() {
            return this.f101817d;
        }

        @C12580l
        /* renamed from: e */
        public final SlotArgsHome mo131633e() {
            return this.f101818e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39926a)) {
                return false;
            }
            C39926a aVar = (C39926a) obj;
            return Intrinsics.areEqual((Object) this.f101814a, (Object) aVar.f101814a) && this.f101815b == aVar.f101815b && Intrinsics.areEqual((Object) this.f101816c, (Object) aVar.f101816c) && Intrinsics.areEqual((Object) this.f101817d, (Object) aVar.f101817d) && Intrinsics.areEqual((Object) this.f101818e, (Object) aVar.f101818e) && Intrinsics.areEqual((Object) this.f101819f, (Object) aVar.f101819f) && Intrinsics.areEqual((Object) this.f101820g, (Object) aVar.f101820g);
        }

        @C12580l
        /* renamed from: f */
        public final String mo131635f() {
            return this.f101819f;
        }

        @C12580l
        /* renamed from: g */
        public final OrderType mo131636g() {
            return this.f101820g;
        }

        public int getActionId() {
            return this.f101821h;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_from_home_page", this.f101815b);
            Class<Parcelable> cls = Parcelable.class;
            Class<BasketSlot> cls2 = BasketSlot.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                bundle.putParcelable("basket_slot", this.f101816c);
            } else if (cls3.isAssignableFrom(cls2)) {
                bundle.putSerializable("basket_slot", (Serializable) this.f101816c);
            }
            Class<Bundle> cls4 = Bundle.class;
            if (cls.isAssignableFrom(cls4)) {
                bundle.putParcelable(C38212b.f96795c, this.f101817d);
            } else if (cls3.isAssignableFrom(cls4)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f101817d);
            }
            Class<SlotArgsHome> cls5 = SlotArgsHome.class;
            if (cls.isAssignableFrom(cls5)) {
                bundle.putParcelable("home_args", this.f101818e);
            } else if (cls3.isAssignableFrom(cls5)) {
                bundle.putSerializable("home_args", (Serializable) this.f101818e);
            }
            bundle.putString("order_id", this.f101819f);
            Class<OrderType> cls6 = OrderType.class;
            if (cls.isAssignableFrom(cls6)) {
                bundle.putParcelable(C36178i.f89309d, this.f101820g);
            } else if (cls3.isAssignableFrom(cls6)) {
                bundle.putSerializable(C36178i.f89309d, (Serializable) this.f101820g);
            }
            bundle.putString("facility_service_id", this.f101814a);
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final C39926a mo131637h(@C12579k String str, boolean z, @C12580l BasketSlot basketSlot, @C12580l Bundle bundle, @C12580l SlotArgsHome slotArgsHome, @C12580l String str2, @C12580l OrderType orderType) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            return new C39926a(str, z, basketSlot, bundle, slotArgsHome, str2, orderType);
        }

        public int hashCode() {
            int hashCode = this.f101814a.hashCode() * 31;
            boolean z = this.f101815b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            BasketSlot basketSlot = this.f101816c;
            int i2 = 0;
            int hashCode2 = (i + (basketSlot == null ? 0 : basketSlot.hashCode())) * 31;
            Bundle bundle = this.f101817d;
            int hashCode3 = (hashCode2 + (bundle == null ? 0 : bundle.hashCode())) * 31;
            SlotArgsHome slotArgsHome = this.f101818e;
            int hashCode4 = (hashCode3 + (slotArgsHome == null ? 0 : slotArgsHome.hashCode())) * 31;
            String str = this.f101819f;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            OrderType orderType = this.f101820g;
            if (orderType != null) {
                i2 = orderType.hashCode();
            }
            return hashCode5 + i2;
        }

        @C12580l
        /* renamed from: j */
        public final BasketSlot mo131639j() {
            return this.f101816c;
        }

        @C12580l
        /* renamed from: k */
        public final Bundle mo131640k() {
            return this.f101817d;
        }

        @C12579k
        /* renamed from: l */
        public final String mo131641l() {
            return this.f101814a;
        }

        @C12580l
        /* renamed from: m */
        public final SlotArgsHome mo131642m() {
            return this.f101818e;
        }

        @C12580l
        /* renamed from: n */
        public final String mo131643n() {
            return this.f101819f;
        }

        @C12580l
        /* renamed from: o */
        public final OrderType mo131644o() {
            return this.f101820g;
        }

        /* renamed from: p */
        public final boolean mo131645p() {
            return this.f101815b;
        }

        @C12579k
        public String toString() {
            String str = this.f101814a;
            boolean z = this.f101815b;
            BasketSlot basketSlot = this.f101816c;
            Bundle bundle = this.f101817d;
            SlotArgsHome slotArgsHome = this.f101818e;
            String str2 = this.f101819f;
            OrderType orderType = this.f101820g;
            return "ActionServiceSlotFragmentToServiceSlotOmrFragment(facilityServiceId=" + str + ", isFromHomePage=" + z + ", basketSlot=" + basketSlot + ", categoryListByGtin=" + bundle + ", homeArgs=" + slotArgsHome + ", orderId=" + str2 + ", orderType=" + orderType + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C39926a(java.lang.String r8, boolean r9, com.carrefour.fid.android.domain.models.basket.BasketSlot r10, android.os.Bundle r11, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r12, java.lang.String r13, com.carrefour.fid.android.shared.domain.models.order.OrderType r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
            /*
                r7 = this;
                r0 = r15 & 2
                if (r0 == 0) goto L_0x0006
                r0 = 0
                goto L_0x0007
            L_0x0006:
                r0 = r9
            L_0x0007:
                r1 = r15 & 4
                r2 = 0
                if (r1 == 0) goto L_0x000e
                r1 = r2
                goto L_0x000f
            L_0x000e:
                r1 = r10
            L_0x000f:
                r3 = r15 & 8
                if (r3 == 0) goto L_0x0015
                r3 = r2
                goto L_0x0016
            L_0x0015:
                r3 = r11
            L_0x0016:
                r4 = r15 & 16
                if (r4 == 0) goto L_0x001c
                r4 = r2
                goto L_0x001d
            L_0x001c:
                r4 = r12
            L_0x001d:
                r5 = r15 & 32
                if (r5 == 0) goto L_0x0023
                r5 = r2
                goto L_0x0024
            L_0x0023:
                r5 = r13
            L_0x0024:
                r6 = r15 & 64
                if (r6 == 0) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r2 = r14
            L_0x002a:
                r9 = r7
                r10 = r8
                r11 = r0
                r12 = r1
                r13 = r3
                r14 = r4
                r15 = r5
                r16 = r2
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39925e.C39926a.<init>(java.lang.String, boolean, com.carrefour.fid.android.domain.models.basket.BasketSlot, android.os.Bundle, com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome, java.lang.String, com.carrefour.fid.android.shared.domain.models.order.OrderType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
