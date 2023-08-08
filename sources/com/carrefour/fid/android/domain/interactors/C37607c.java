package com.carrefour.fid.android.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.carrefour.fid.android.shared.util.environment.C28912a;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.interactors.c */
public final class C37607c implements C37679f<C37608a, C28912a> {

    /* renamed from: b */
    public static final int f94359b = AppEnvironment.f70824e;
    @C12579k

    /* renamed from: a */
    public final AppEnvironment f94360a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.c$a */
    public static final class C37608a {

        /* renamed from: b */
        public static final int f94361b = 0;

        /* renamed from: a */
        public final int f94362a;

        public C37608a(int i) {
            this.f94362a = i;
        }

        /* renamed from: c */
        public static /* synthetic */ C37608a m154183c(C37608a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f94362a;
            }
            return aVar.mo114455b(i);
        }

        /* renamed from: a */
        public final int mo114454a() {
            return this.f94362a;
        }

        @C12579k
        /* renamed from: b */
        public final C37608a mo114455b(int i) {
            return new C37608a(i);
        }

        /* renamed from: d */
        public final int mo114456d() {
            return this.f94362a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37608a) && this.f94362a == ((C37608a) obj).f94362a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f94362a);
        }

        @C12579k
        public String toString() {
            int i = this.f94362a;
            return "Param(position=" + i + ")";
        }
    }

    @Inject
    public C37607c(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        this.f94360a = appEnvironment;
    }

    @C12580l
    /* renamed from: a */
    public Object m172943invokegIAlus(@C12579k C37608a aVar, @C12579k C11045c<? super Result<? extends C28912a>> cVar) {
        C28912a a = C28912a.f70830d.mo84191a(aVar.mo114456d());
        this.f94360a.mo84163J(a);
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38702b(a);
    }
}
