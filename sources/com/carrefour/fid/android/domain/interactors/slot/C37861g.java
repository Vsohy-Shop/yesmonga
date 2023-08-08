package com.carrefour.fid.android.domain.interactors.slot;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.slot.ServiceSlot;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.slot.g */
public interface C37861g extends C37679f<C37862a, ServiceSlot> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.slot.g$a */
    public static final class C37862a {
        @C12579k

        /* renamed from: a */
        public final String f94956a;

        public C37862a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "facilityStoreId");
            this.f94956a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37862a m155080c(C37862a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94956a;
            }
            return aVar.mo115309b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115308a() {
            return this.f94956a;
        }

        @C12579k
        /* renamed from: b */
        public final C37862a mo115309b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "facilityStoreId");
            return new C37862a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo115310d() {
            return this.f94956a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37862a) && Intrinsics.areEqual((Object) this.f94956a, (Object) ((C37862a) obj).f94956a);
        }

        public int hashCode() {
            return this.f94956a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94956a;
            return "Params(facilityStoreId=" + str + ")";
        }
    }
}
