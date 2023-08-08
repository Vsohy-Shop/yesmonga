package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.state.b */
public interface C26105b {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.state.b$a */
    public static final class C26106a implements C26105b {
        @C12579k

        /* renamed from: a */
        public static final C26106a f63790a = new C26106a();

        /* renamed from: b */
        public static final int f63791b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.state.b$b */
    public static final class C26107b implements C26105b {

        /* renamed from: c */
        public static final int f63792c = 8;
        @C12579k

        /* renamed from: a */
        public final Slot f63793a;

        /* renamed from: b */
        public final boolean f63794b;

        public C26107b(@C12579k Slot slot, boolean z) {
            Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
            this.f63793a = slot;
            this.f63794b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C26107b m111597d(C26107b bVar, Slot slot, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                slot = bVar.f63793a;
            }
            if ((i & 2) != 0) {
                z = bVar.f63794b;
            }
            return bVar.mo75807c(slot, z);
        }

        @C12579k
        /* renamed from: a */
        public final Slot mo75805a() {
            return this.f63793a;
        }

        /* renamed from: b */
        public final boolean mo75806b() {
            return this.f63794b;
        }

        @C12579k
        /* renamed from: c */
        public final C26107b mo75807c(@C12579k Slot slot, boolean z) {
            Intrinsics.checkNotNullParameter(slot, OnlineStoreShopFragment.f60516Z);
            return new C26107b(slot, z);
        }

        @C12579k
        /* renamed from: e */
        public final Slot mo75808e() {
            return this.f63793a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26107b)) {
                return false;
            }
            C26107b bVar = (C26107b) obj;
            return Intrinsics.areEqual((Object) this.f63793a, (Object) bVar.f63793a) && this.f63794b == bVar.f63794b;
        }

        /* renamed from: f */
        public final boolean mo75810f() {
            return this.f63794b;
        }

        public int hashCode() {
            int hashCode = this.f63793a.hashCode() * 31;
            boolean z = this.f63794b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            Slot slot = this.f63793a;
            boolean z = this.f63794b;
            return "SlotBooked(slot=" + slot + ", isDelivery=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.state.b$c */
    public static final class C26108c implements C26105b {

        /* renamed from: b */
        public static final int f63795b = 8;
        @C12579k

        /* renamed from: a */
        public final SlotExpress f63796a;

        public C26108c(@C12579k SlotExpress slotExpress) {
            Intrinsics.checkNotNullParameter(slotExpress, "slotExpress");
            this.f63796a = slotExpress;
        }

        /* renamed from: c */
        public static /* synthetic */ C26108c m111603c(C26108c cVar, SlotExpress slotExpress, int i, Object obj) {
            if ((i & 1) != 0) {
                slotExpress = cVar.f63796a;
            }
            return cVar.mo75814b(slotExpress);
        }

        @C12579k
        /* renamed from: a */
        public final SlotExpress mo75813a() {
            return this.f63796a;
        }

        @C12579k
        /* renamed from: b */
        public final C26108c mo75814b(@C12579k SlotExpress slotExpress) {
            Intrinsics.checkNotNullParameter(slotExpress, "slotExpress");
            return new C26108c(slotExpress);
        }

        @C12579k
        /* renamed from: d */
        public final SlotExpress mo75815d() {
            return this.f63796a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26108c) && Intrinsics.areEqual((Object) this.f63796a, (Object) ((C26108c) obj).f63796a);
        }

        public int hashCode() {
            return this.f63796a.hashCode();
        }

        @C12579k
        public String toString() {
            SlotExpress slotExpress = this.f63796a;
            return "SlotExpressBooked(slotExpress=" + slotExpress + ")";
        }
    }
}
