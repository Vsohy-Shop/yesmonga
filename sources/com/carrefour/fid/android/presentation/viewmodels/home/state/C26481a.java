package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.ArsenalGenericBanner;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.a */
public interface C26481a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.a$a */
    public static final class C26482a implements C26481a {

        /* renamed from: b */
        public static final int f64744b = 8;
        @C12579k

        /* renamed from: a */
        public final List<ArsenalGenericBanner> f64745a;

        public C26482a(@C12579k List<ArsenalGenericBanner> list) {
            Intrinsics.checkNotNullParameter(list, "banners");
            this.f64745a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ C26482a m112884c(C26482a aVar, List<ArsenalGenericBanner> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f64745a;
            }
            return aVar.mo77024b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<ArsenalGenericBanner> mo77023a() {
            return this.f64745a;
        }

        @C12579k
        /* renamed from: b */
        public final C26482a mo77024b(@C12579k List<ArsenalGenericBanner> list) {
            Intrinsics.checkNotNullParameter(list, "banners");
            return new C26482a(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<ArsenalGenericBanner> mo77025d() {
            return this.f64745a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26482a) && Intrinsics.areEqual((Object) this.f64745a, (Object) ((C26482a) obj).f64745a);
        }

        public int hashCode() {
            return this.f64745a.hashCode();
        }

        @C12579k
        public String toString() {
            List<ArsenalGenericBanner> list = this.f64745a;
            return "Available(banners=" + list + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.a$b */
    public static final class C26483b implements C26481a {
        @C12579k

        /* renamed from: a */
        public static final C26483b f64746a = new C26483b();

        /* renamed from: b */
        public static final int f64747b = 0;
    }
}
