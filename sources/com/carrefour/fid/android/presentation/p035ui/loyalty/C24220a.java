package com.carrefour.fid.android.presentation.p035ui.loyalty;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.a */
public interface C24220a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.a$a */
    public static final class C24221a implements C24220a {

        /* renamed from: b */
        public static final int f60584b = 8;
        @C12579k

        /* renamed from: a */
        public final List<LoyaltyBonus> f60585a;

        public C24221a(@C12579k List<LoyaltyBonus> list) {
            Intrinsics.checkNotNullParameter(list, "primes");
            this.f60585a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ C24221a m106635c(C24221a aVar, List<LoyaltyBonus> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f60585a;
            }
            return aVar.mo70888b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<LoyaltyBonus> mo70887a() {
            return this.f60585a;
        }

        @C12579k
        /* renamed from: b */
        public final C24221a mo70888b(@C12579k List<LoyaltyBonus> list) {
            Intrinsics.checkNotNullParameter(list, "primes");
            return new C24221a(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<LoyaltyBonus> mo70889d() {
            return this.f60585a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24221a) && Intrinsics.areEqual((Object) this.f60585a, (Object) ((C24221a) obj).f60585a);
        }

        public int hashCode() {
            return this.f60585a.hashCode();
        }

        @C12579k
        public String toString() {
            List<LoyaltyBonus> list = this.f60585a;
            return "OnLoyaltyDetailClickListener(primes=" + list + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.a$b */
    public static final class C24222b implements C24220a {
        @C12579k

        /* renamed from: a */
        public static final C24222b f60586a = new C24222b();

        /* renamed from: b */
        public static final int f60587b = 0;
    }
}
