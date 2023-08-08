package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.cms.domain.models.FuelPriceDomain;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.g */
public interface C27152g {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.g$a */
    public static final class C27153a implements C27152g {
        @C12579k

        /* renamed from: a */
        public static final C27153a f66020a = new C27153a();

        /* renamed from: b */
        public static final int f66021b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.g$b */
    public static final class C27154b implements C27152g {
        @C12579k

        /* renamed from: a */
        public static final C27154b f66022a = new C27154b();

        /* renamed from: b */
        public static final int f66023b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.g$c */
    public static final class C27155c implements C27152g {

        /* renamed from: b */
        public static final int f66024b = 8;
        @C12579k

        /* renamed from: a */
        public final List<FuelPriceDomain> f66025a;

        public C27155c(@C12579k List<FuelPriceDomain> list) {
            Intrinsics.checkNotNullParameter(list, "fuelPriceDomains");
            this.f66025a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ C27155c m114724c(C27155c cVar, List<FuelPriceDomain> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = cVar.f66025a;
            }
            return cVar.mo78937b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<FuelPriceDomain> mo78936a() {
            return this.f66025a;
        }

        @C12579k
        /* renamed from: b */
        public final C27155c mo78937b(@C12579k List<FuelPriceDomain> list) {
            Intrinsics.checkNotNullParameter(list, "fuelPriceDomains");
            return new C27155c(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<FuelPriceDomain> mo78938d() {
            return this.f66025a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27155c) && Intrinsics.areEqual((Object) this.f66025a, (Object) ((C27155c) obj).f66025a);
        }

        public int hashCode() {
            return this.f66025a.hashCode();
        }

        @C12579k
        public String toString() {
            List<FuelPriceDomain> list = this.f66025a;
            return "Ready(fuelPriceDomains=" + list + ")";
        }
    }
}
