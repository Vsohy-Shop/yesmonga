package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.domain.models.slot.SlotId;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.e */
public interface C37564e extends C37679f<C37565a, Basket> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.e$a */
    public static final class C37565a {
        @C12579k

        /* renamed from: a */
        public final String f94333a;
        @C12579k

        /* renamed from: b */
        public final String f94334b;

        public /* synthetic */ C37565a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: d */
        public static /* synthetic */ C37565a m154111d(C37565a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94333a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94334b;
            }
            return aVar.mo114374c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114372a() {
            return this.f94333a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114373b() {
            return this.f94334b;
        }

        @C12579k
        /* renamed from: c */
        public final C37565a mo114374c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
            return new C37565a(str, str2, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: e */
        public final String mo114375e() {
            return this.f94334b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37565a)) {
                return false;
            }
            C37565a aVar = (C37565a) obj;
            return SlotId.m158312f(this.f94333a, aVar.f94333a) && FacilityServiceId.m157962f(this.f94334b, aVar.f94334b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114377f() {
            return this.f94333a;
        }

        public int hashCode() {
            return (SlotId.m158313h(this.f94333a) * 31) + FacilityServiceId.m157963h(this.f94334b);
        }

        @C12579k
        public String toString() {
            String i = SlotId.m158314i(this.f94333a);
            String i2 = FacilityServiceId.m157964i(this.f94334b);
            return "Param(slotId=" + i + ", facilityServiceId=" + i2 + ")";
        }

        public C37565a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
            this.f94333a = str;
            this.f94334b = str2;
        }
    }
}
