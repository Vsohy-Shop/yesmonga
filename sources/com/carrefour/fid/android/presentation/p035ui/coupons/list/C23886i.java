package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.automation.actions.CancelSchedulesAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.i */
public interface C23886i {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.i$a */
    public static final class C23887a implements C23886i {
        @C12579k

        /* renamed from: a */
        public static final C23887a f60054a = new C23887a();

        /* renamed from: b */
        public static final int f60055b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.i$b */
    public static final class C23888b implements C23886i {
        @C12579k

        /* renamed from: a */
        public static final C23888b f60056a = new C23888b();

        /* renamed from: b */
        public static final int f60057b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.i$c */
    public static final class C23889c implements C23886i {

        /* renamed from: d */
        public static final int f60058d = 8;
        @C12579k

        /* renamed from: a */
        public final Throwable f60059a;

        /* renamed from: b */
        public final boolean f60060b;

        /* renamed from: c */
        public final boolean f60061c;

        public C23889c(@C12579k Throwable th, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.f60059a = th;
            this.f60060b = z;
            this.f60061c = z2;
        }

        /* renamed from: e */
        public static /* synthetic */ C23889c m105704e(C23889c cVar, Throwable th, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                th = cVar.f60059a;
            }
            if ((i & 2) != 0) {
                z = cVar.f60060b;
            }
            if ((i & 4) != 0) {
                z2 = cVar.f60061c;
            }
            return cVar.mo69965d(th, z, z2);
        }

        @C12579k
        /* renamed from: a */
        public final Throwable mo69962a() {
            return this.f60059a;
        }

        /* renamed from: b */
        public final boolean mo69963b() {
            return this.f60060b;
        }

        /* renamed from: c */
        public final boolean mo69964c() {
            return this.f60061c;
        }

        @C12579k
        /* renamed from: d */
        public final C23889c mo69965d(@C12579k Throwable th, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            return new C23889c(th, z, z2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23889c)) {
                return false;
            }
            C23889c cVar = (C23889c) obj;
            return Intrinsics.areEqual((Object) this.f60059a, (Object) cVar.f60059a) && this.f60060b == cVar.f60060b && this.f60061c == cVar.f60061c;
        }

        /* renamed from: f */
        public final boolean mo69967f() {
            return this.f60061c;
        }

        @C12579k
        /* renamed from: g */
        public final Throwable mo69968g() {
            return this.f60059a;
        }

        /* renamed from: h */
        public final boolean mo69969h() {
            return this.f60060b;
        }

        public int hashCode() {
            int hashCode = this.f60059a.hashCode() * 31;
            boolean z = this.f60060b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f60061c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        @C12579k
        public String toString() {
            Throwable th = this.f60059a;
            boolean z = this.f60060b;
            boolean z2 = this.f60061c;
            return "OnErrorUpdatingCoupons(throwable=" + th + ", isAnActivation=" + z + ", hasUnUpdatableCoupons=" + z2 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.i$d */
    public static final class C23890d implements C23886i {

        /* renamed from: d */
        public static final int f60062d = 0;

        /* renamed from: a */
        public final boolean f60063a;

        /* renamed from: b */
        public final boolean f60064b;

        /* renamed from: c */
        public final boolean f60065c;

        public C23890d(boolean z, boolean z2, boolean z3) {
            this.f60063a = z;
            this.f60064b = z2;
            this.f60065c = z3;
        }

        /* renamed from: e */
        public static /* synthetic */ C23890d m105712e(C23890d dVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dVar.f60063a;
            }
            if ((i & 2) != 0) {
                z2 = dVar.f60064b;
            }
            if ((i & 4) != 0) {
                z3 = dVar.f60065c;
            }
            return dVar.mo69975d(z, z2, z3);
        }

        /* renamed from: a */
        public final boolean mo69972a() {
            return this.f60063a;
        }

        /* renamed from: b */
        public final boolean mo69973b() {
            return this.f60064b;
        }

        /* renamed from: c */
        public final boolean mo69974c() {
            return this.f60065c;
        }

        @C12579k
        /* renamed from: d */
        public final C23890d mo69975d(boolean z, boolean z2, boolean z3) {
            return new C23890d(z, z2, z3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23890d)) {
                return false;
            }
            C23890d dVar = (C23890d) obj;
            return this.f60063a == dVar.f60063a && this.f60064b == dVar.f60064b && this.f60065c == dVar.f60065c;
        }

        /* renamed from: f */
        public final boolean mo69977f() {
            return this.f60065c;
        }

        /* renamed from: g */
        public final boolean mo69978g() {
            return this.f60063a;
        }

        /* renamed from: h */
        public final boolean mo69979h() {
            return this.f60064b;
        }

        public int hashCode() {
            boolean z = this.f60063a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f60064b;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f60065c;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        @C12579k
        public String toString() {
            boolean z = this.f60063a;
            boolean z2 = this.f60064b;
            boolean z3 = this.f60065c;
            return "OnFinishUpdatingCouponsWithErrors(isAnActivation=" + z + ", isSwitchAllCoupons=" + z2 + ", hasUnUpdatableCoupons=" + z3 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.i$e */
    public static final class C23891e implements C23886i {

        /* renamed from: d */
        public static final int f60066d = 0;

        /* renamed from: a */
        public final boolean f60067a;

        /* renamed from: b */
        public final boolean f60068b;

        /* renamed from: c */
        public final boolean f60069c;

        public C23891e(boolean z, boolean z2, boolean z3) {
            this.f60067a = z;
            this.f60068b = z2;
            this.f60069c = z3;
        }

        /* renamed from: e */
        public static /* synthetic */ C23891e m105720e(C23891e eVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = eVar.f60067a;
            }
            if ((i & 2) != 0) {
                z2 = eVar.f60068b;
            }
            if ((i & 4) != 0) {
                z3 = eVar.f60069c;
            }
            return eVar.mo69985d(z, z2, z3);
        }

        /* renamed from: a */
        public final boolean mo69982a() {
            return this.f60067a;
        }

        /* renamed from: b */
        public final boolean mo69983b() {
            return this.f60068b;
        }

        /* renamed from: c */
        public final boolean mo69984c() {
            return this.f60069c;
        }

        @C12579k
        /* renamed from: d */
        public final C23891e mo69985d(boolean z, boolean z2, boolean z3) {
            return new C23891e(z, z2, z3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23891e)) {
                return false;
            }
            C23891e eVar = (C23891e) obj;
            return this.f60067a == eVar.f60067a && this.f60068b == eVar.f60068b && this.f60069c == eVar.f60069c;
        }

        /* renamed from: f */
        public final boolean mo69987f() {
            return this.f60069c;
        }

        /* renamed from: g */
        public final boolean mo69988g() {
            return this.f60067a;
        }

        /* renamed from: h */
        public final boolean mo69989h() {
            return this.f60068b;
        }

        public int hashCode() {
            boolean z = this.f60067a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f60068b;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f60069c;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        @C12579k
        public String toString() {
            boolean z = this.f60067a;
            boolean z2 = this.f60068b;
            boolean z3 = this.f60069c;
            return "OnFinishUpdatingCouponsWithSuccess(isAnActivation=" + z + ", isSwitchAllCoupons=" + z2 + ", hasUnUpdatableCoupons=" + z3 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.i$f */
    public static final class C23892f implements C23886i {

        /* renamed from: b */
        public static final int f60070b = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f60071a;

        public C23892f(@C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(list, CancelSchedulesAction.f23548l);
            this.f60071a = list;
        }

        /* renamed from: c */
        public static /* synthetic */ C23892f m105728c(C23892f fVar, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = fVar.f60071a;
            }
            return fVar.mo69993b(list);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo69992a() {
            return this.f60071a;
        }

        @C12579k
        /* renamed from: b */
        public final C23892f mo69993b(@C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(list, CancelSchedulesAction.f23548l);
            return new C23892f(list);
        }

        @C12579k
        /* renamed from: d */
        public final List<String> mo69994d() {
            return this.f60071a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23892f) && Intrinsics.areEqual((Object) this.f60071a, (Object) ((C23892f) obj).f60071a);
        }

        public int hashCode() {
            return this.f60071a.hashCode();
        }

        @C12579k
        public String toString() {
            List<String> list = this.f60071a;
            return "OnLoadingUpdatingCoupons(ids=" + list + ")";
        }
    }
}
