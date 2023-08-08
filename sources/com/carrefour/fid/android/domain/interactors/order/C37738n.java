package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.slot.SlotId;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.order.n */
public interface C37738n extends C37679f<C37739a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.order.n$a */
    public static final class C37739a {
        @C12579k

        /* renamed from: a */
        public final String f94731a;
        @C12579k

        /* renamed from: b */
        public final String f94732b;

        public /* synthetic */ C37739a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: d */
        public static /* synthetic */ C37739a m154688d(C37739a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94731a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94732b;
            }
            return aVar.mo114890c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114888a() {
            return this.f94731a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114889b() {
            return this.f94732b;
        }

        @C12579k
        /* renamed from: c */
        public final C37739a mo114890c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69319g);
            return new C37739a(str, str2, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: e */
        public final String mo114891e() {
            return this.f94731a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37739a)) {
                return false;
            }
            C37739a aVar = (C37739a) obj;
            return Intrinsics.areEqual((Object) this.f94731a, (Object) aVar.f94731a) && SlotId.m158312f(this.f94732b, aVar.f94732b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114893f() {
            return this.f94732b;
        }

        public int hashCode() {
            return (this.f94731a.hashCode() * 31) + SlotId.m158313h(this.f94732b);
        }

        @C12579k
        public String toString() {
            String str = this.f94731a;
            String i = SlotId.m158314i(this.f94732b);
            return "Params(orderId=" + str + ", slotId=" + i + ")";
        }

        public C37739a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69319g);
            this.f94731a = str;
            this.f94732b = str2;
        }
    }
}
