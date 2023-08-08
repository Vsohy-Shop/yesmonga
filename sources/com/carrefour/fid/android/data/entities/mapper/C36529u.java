package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C38182t;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.extension.C28746b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.u */
public final class C36529u extends C28486g<C36530a, C38182t> {

    /* renamed from: b */
    public static final int f90222b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.u$a */
    public static final class C36530a {

        /* renamed from: b */
        public static final int f90223b = 0;
        @C12580l

        /* renamed from: a */
        public final Integer f90224a;

        public C36530a(@C12580l Integer num) {
            this.f90224a = num;
        }

        /* renamed from: c */
        public static /* synthetic */ C36530a m149760c(C36530a aVar, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = aVar.f90224a;
            }
            return aVar.mo111322b(num);
        }

        @C12580l
        /* renamed from: a */
        public final Integer mo111321a() {
            return this.f90224a;
        }

        @C12579k
        /* renamed from: b */
        public final C36530a mo111322b(@C12580l Integer num) {
            return new C36530a(num);
        }

        @C12580l
        /* renamed from: d */
        public final Integer mo111323d() {
            return this.f90224a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36530a) && Intrinsics.areEqual((Object) this.f90224a, (Object) ((C36530a) obj).f90224a);
        }

        public int hashCode() {
            Integer num = this.f90224a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @C12579k
        public String toString() {
            Integer num = this.f90224a;
            return "Params(totalHits=" + num + ")";
        }
    }

    @C12579k
    /* renamed from: d */
    public C38182t mo72340a(@C12579k C36530a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(aVar, "entity");
        int i2 = 0;
        if (aVar.mo111323d() == null || aVar.mo111323d().intValue() <= 0) {
            i = 0;
        } else {
            i = C28746b0.m119035f(Double.valueOf(Math.ceil(C28746b0.m119033d(aVar.mo111323d(), 0.0d, 1, (Object) null) / ((double) 10))), 0, 1, (Object) null);
        }
        Integer d = aVar.mo111323d();
        if (d != null) {
            i2 = d.intValue();
        }
        return new C38182t(i, i2);
    }
}
