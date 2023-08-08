package com.carrefour.fid.android.domain.interactors.user;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.user.c */
public interface C37875c extends C37679f<C37876a, Address> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.user.c$a */
    public static final class C37876a {
        @C12579k

        /* renamed from: a */
        public final AddressCategory f94996a;

        public C37876a(@C12579k AddressCategory addressCategory) {
            Intrinsics.checkNotNullParameter(addressCategory, "category");
            this.f94996a = addressCategory;
        }

        /* renamed from: c */
        public static /* synthetic */ C37876a m155129c(C37876a aVar, AddressCategory addressCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                addressCategory = aVar.f94996a;
            }
            return aVar.mo115359b(addressCategory);
        }

        @C12579k
        /* renamed from: a */
        public final AddressCategory mo115358a() {
            return this.f94996a;
        }

        @C12579k
        /* renamed from: b */
        public final C37876a mo115359b(@C12579k AddressCategory addressCategory) {
            Intrinsics.checkNotNullParameter(addressCategory, "category");
            return new C37876a(addressCategory);
        }

        @C12579k
        /* renamed from: d */
        public final AddressCategory mo115360d() {
            return this.f94996a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37876a) && this.f94996a == ((C37876a) obj).f94996a;
        }

        public int hashCode() {
            return this.f94996a.hashCode();
        }

        @C12579k
        public String toString() {
            AddressCategory addressCategory = this.f94996a;
            return "Params(category=" + addressCategory + ")";
        }
    }
}
