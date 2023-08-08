package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h */
public final class C26970h {

    /* renamed from: a */
    public static final int f65666a = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$a */
    public interface C26971a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$a$a */
        public static final class C26972a implements C26971a {

            /* renamed from: b */
            public static final int f65667b = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f65668a;

            public C26972a(@C12580l Throwable th) {
                this.f65668a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26972a m114163c(C26972a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65668a;
                }
                return aVar.mo78374b(th);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo78373a() {
                return this.f65668a;
            }

            @C12579k
            /* renamed from: b */
            public final C26972a mo78374b(@C12580l Throwable th) {
                return new C26972a(th);
            }

            @C12580l
            /* renamed from: d */
            public final Throwable mo78375d() {
                return this.f65668a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26972a) && Intrinsics.areEqual((Object) this.f65668a, (Object) ((C26972a) obj).f65668a);
            }

            public int hashCode() {
                Throwable th = this.f65668a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65668a;
                return "CheckoutError(throwable=" + th + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$b */
    public interface C26973b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$b$a */
        public static final class C26974a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m114167a(@C12579k C26973b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$b$b */
        public static final class C26975b implements C26973b {

            /* renamed from: c */
            public static final int f65669c = 0;
            @C12579k

            /* renamed from: b */
            public final String f65670b;

            public C26975b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "checkoutCGV");
                this.f65670b = str;
            }

            /* renamed from: g */
            public static /* synthetic */ C26975b m114168g(C26975b bVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f65670b;
                }
                return bVar.mo78381f(str);
            }

            @C12579k
            /* renamed from: e */
            public final String mo78379e() {
                return this.f65670b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26975b) && Intrinsics.areEqual((Object) this.f65670b, (Object) ((C26975b) obj).f65670b);
            }

            @C12579k
            /* renamed from: f */
            public final C26975b mo78381f(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "checkoutCGV");
                return new C26975b(str);
            }

            @C12579k
            /* renamed from: h */
            public final String mo78382h() {
                return this.f65670b;
            }

            public int hashCode() {
                return this.f65670b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26974a.m114167a(this);
            }

            @C12579k
            public String toString() {
                String str = this.f65670b;
                return "GetCgvData(checkoutCGV=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$b$c */
        public static final class C26976c implements C26973b {
            @C12579k

            /* renamed from: b */
            public static final C26976c f65671b = new C26976c();

            /* renamed from: c */
            public static final int f65672c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26974a.m114167a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$b$d */
        public static final class C26977d implements C26973b {

            /* renamed from: c */
            public static final int f65673c = 0;

            /* renamed from: b */
            public final boolean f65674b;

            public C26977d(boolean z) {
                this.f65674b = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C26977d m114172g(C26977d dVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f65674b;
                }
                return dVar.mo78387f(z);
            }

            /* renamed from: e */
            public final boolean mo78385e() {
                return this.f65674b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26977d) && this.f65674b == ((C26977d) obj).f65674b;
            }

            @C12579k
            /* renamed from: f */
            public final C26977d mo78387f(boolean z) {
                return new C26977d(z);
            }

            /* renamed from: h */
            public final boolean mo78388h() {
                return this.f65674b;
            }

            public int hashCode() {
                boolean z = this.f65674b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26974a.m114167a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65674b;
                return "LoadingCgv(isLoadingCgv=" + z + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$c */
    public interface C26978c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.h$c$a */
        public static final class C26979a implements C26978c {
            @C12579k

            /* renamed from: a */
            public static final C26979a f65675a = new C26979a();

            /* renamed from: b */
            public static final int f65676b = 0;
        }
    }
}
