package com.carrefour.fid.android.presentation.viewmodels.home.event;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.event.a */
public interface C26385a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.event.a$a */
    public static final class C26386a implements C26385a {
        @C12579k

        /* renamed from: a */
        public static final C26386a f64525a = new C26386a();

        /* renamed from: b */
        public static final int f64526b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.event.a$b */
    public static final class C26387b implements C26385a {

        /* renamed from: c */
        public static final int f64527c = 8;
        @C12579k

        /* renamed from: a */
        public final String f64528a;
        @C12580l

        /* renamed from: b */
        public final BasketSlot f64529b;

        public /* synthetic */ C26387b(String str, BasketSlot basketSlot, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, basketSlot);
        }

        /* renamed from: d */
        public static /* synthetic */ C26387b m112732d(C26387b bVar, String str, BasketSlot basketSlot, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f64528a;
            }
            if ((i & 2) != 0) {
                basketSlot = bVar.f64529b;
            }
            return bVar.mo76847c(str, basketSlot);
        }

        @C12579k
        /* renamed from: a */
        public final String mo76845a() {
            return this.f64528a;
        }

        @C12580l
        /* renamed from: b */
        public final BasketSlot mo76846b() {
            return this.f64529b;
        }

        @C12579k
        /* renamed from: c */
        public final C26387b mo76847c(@C12579k String str, @C12580l BasketSlot basketSlot) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            return new C26387b(str, basketSlot, (DefaultConstructorMarker) null);
        }

        @C12580l
        /* renamed from: e */
        public final BasketSlot mo76848e() {
            return this.f64529b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26387b)) {
                return false;
            }
            C26387b bVar = (C26387b) obj;
            return FacilityServiceId.m157962f(this.f64528a, bVar.f64528a) && Intrinsics.areEqual((Object) this.f64529b, (Object) bVar.f64529b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo76850f() {
            return this.f64528a;
        }

        public int hashCode() {
            int h = FacilityServiceId.m157963h(this.f64528a) * 31;
            BasketSlot basketSlot = this.f64529b;
            return h + (basketSlot == null ? 0 : basketSlot.hashCode());
        }

        @C12579k
        public String toString() {
            String i = FacilityServiceId.m157964i(this.f64528a);
            BasketSlot basketSlot = this.f64529b;
            return "NavigateToOmrSlotSelection(facilityServiceId=" + i + ", basketSlot=" + basketSlot + ")";
        }

        public C26387b(String str, BasketSlot basketSlot) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            this.f64528a = str;
            this.f64529b = basketSlot;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26387b(String str, BasketSlot basketSlot, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : basketSlot, (DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.event.a$d */
    public static final class C26389d implements C26385a {
        @C12579k

        /* renamed from: a */
        public static final C26389d f64533a = new C26389d();

        /* renamed from: b */
        public static final int f64534b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.event.a$c */
    public static final class C26388c implements C26385a {

        /* renamed from: c */
        public static final int f64530c = 8;
        @C12579k

        /* renamed from: a */
        public final SlotArgsHome f64531a;
        @C12580l

        /* renamed from: b */
        public final BasketSlot f64532b;

        public C26388c(@C12579k SlotArgsHome slotArgsHome, @C12580l BasketSlot basketSlot) {
            Intrinsics.checkNotNullParameter(slotArgsHome, "slotArgsHome");
            this.f64531a = slotArgsHome;
            this.f64532b = basketSlot;
        }

        /* renamed from: d */
        public static /* synthetic */ C26388c m112738d(C26388c cVar, SlotArgsHome slotArgsHome, BasketSlot basketSlot, int i, Object obj) {
            if ((i & 1) != 0) {
                slotArgsHome = cVar.f64531a;
            }
            if ((i & 2) != 0) {
                basketSlot = cVar.f64532b;
            }
            return cVar.mo76855c(slotArgsHome, basketSlot);
        }

        @C12579k
        /* renamed from: a */
        public final SlotArgsHome mo76853a() {
            return this.f64531a;
        }

        @C12580l
        /* renamed from: b */
        public final BasketSlot mo76854b() {
            return this.f64532b;
        }

        @C12579k
        /* renamed from: c */
        public final C26388c mo76855c(@C12579k SlotArgsHome slotArgsHome, @C12580l BasketSlot basketSlot) {
            Intrinsics.checkNotNullParameter(slotArgsHome, "slotArgsHome");
            return new C26388c(slotArgsHome, basketSlot);
        }

        @C12580l
        /* renamed from: e */
        public final BasketSlot mo76856e() {
            return this.f64532b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26388c)) {
                return false;
            }
            C26388c cVar = (C26388c) obj;
            return Intrinsics.areEqual((Object) this.f64531a, (Object) cVar.f64531a) && Intrinsics.areEqual((Object) this.f64532b, (Object) cVar.f64532b);
        }

        @C12579k
        /* renamed from: f */
        public final SlotArgsHome mo76858f() {
            return this.f64531a;
        }

        public int hashCode() {
            int hashCode = this.f64531a.hashCode() * 31;
            BasketSlot basketSlot = this.f64532b;
            return hashCode + (basketSlot == null ? 0 : basketSlot.hashCode());
        }

        @C12579k
        public String toString() {
            SlotArgsHome slotArgsHome = this.f64531a;
            BasketSlot basketSlot = this.f64532b;
            return "NavigateToSlotSelection(slotArgsHome=" + slotArgsHome + ", basketSlot=" + basketSlot + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26388c(SlotArgsHome slotArgsHome, BasketSlot basketSlot, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(slotArgsHome, (i & 2) != 0 ? null : basketSlot);
        }
    }
}
