package com.carrefour.fid.android.domain.interactors.loyalty;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.account.UserCards;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.loyalty.e */
public interface C37701e extends C37679f<C37703b, Boolean> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.loyalty.e$a */
    public static final class C37702a implements C37703b {
        @C12579k

        /* renamed from: a */
        public final List<UserCards> f94562a;

        public C37702a(@C12579k List<UserCards> list) {
            Intrinsics.checkNotNullParameter(list, "userCards");
            this.f94562a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ C37702a m154487c(C37702a aVar, List<UserCards> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f94562a;
            }
            return aVar.mo114740b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<UserCards> mo114739a() {
            return this.f94562a;
        }

        @C12579k
        /* renamed from: b */
        public final C37702a mo114740b(@C12579k List<UserCards> list) {
            Intrinsics.checkNotNullParameter(list, "userCards");
            return new C37702a(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<UserCards> mo114741d() {
            return this.f94562a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37702a) && Intrinsics.areEqual((Object) this.f94562a, (Object) ((C37702a) obj).f94562a);
        }

        public int hashCode() {
            return this.f94562a.hashCode();
        }

        @C12579k
        public String toString() {
            List<UserCards> list = this.f94562a;
            return "Data(userCards=" + list + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.interactors.loyalty.e$b */
    public interface C37703b {
    }
}
