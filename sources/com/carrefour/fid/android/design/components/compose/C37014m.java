package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.m */
public interface C37014m {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.m$a */
    public static final class C37015a implements C37014m {
        @C12579k

        /* renamed from: a */
        public static final C37015a f92525a = new C37015a();

        /* renamed from: b */
        public static final int f92526b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.m$b */
    public static final class C37016b implements C37014m {

        /* renamed from: b */
        public static final int f92527b = 8;
        @C12579k

        /* renamed from: a */
        public final Service f92528a;

        public C37016b(@C12579k Service service) {
            Intrinsics.checkNotNullParameter(service, "service");
            this.f92528a = service;
        }

        /* renamed from: c */
        public static /* synthetic */ C37016b m151893c(C37016b bVar, Service service, int i, Object obj) {
            if ((i & 1) != 0) {
                service = bVar.f92528a;
            }
            return bVar.mo112637b(service);
        }

        @C12579k
        /* renamed from: a */
        public final Service mo112636a() {
            return this.f92528a;
        }

        @C12579k
        /* renamed from: b */
        public final C37016b mo112637b(@C12579k Service service) {
            Intrinsics.checkNotNullParameter(service, "service");
            return new C37016b(service);
        }

        @C12579k
        /* renamed from: d */
        public final Service mo112638d() {
            return this.f92528a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37016b) && Intrinsics.areEqual((Object) this.f92528a, (Object) ((C37016b) obj).f92528a);
        }

        public int hashCode() {
            return this.f92528a.hashCode();
        }

        @C12579k
        public String toString() {
            Service service = this.f92528a;
            return "OnSelectServiceClick(service=" + service + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.m$c */
    public static final class C37017c implements C37014m {
        @C12579k

        /* renamed from: a */
        public static final C37017c f92529a = new C37017c();

        /* renamed from: b */
        public static final int f92530b = 0;
    }
}
