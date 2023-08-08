package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a */
public final class C26836a {
    @C12579k

    /* renamed from: a */
    public static final C26836a f65432a = new C26836a();

    /* renamed from: b */
    public static final int f65433b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a */
    public interface C26837a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$a */
        public static final class C26838a implements C26837a {
            @C12579k

            /* renamed from: a */
            public static final C26838a f65434a = new C26838a();

            /* renamed from: b */
            public static final int f65435b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$b */
        public static final class C26839b implements C26837a {

            /* renamed from: b */
            public static final int f65436b = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f65437a;

            public C26839b(@C12580l Throwable th) {
                this.f65437a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26839b m113842c(C26839b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f65437a;
                }
                return bVar.mo77912b(th);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo77911a() {
                return this.f65437a;
            }

            @C12579k
            /* renamed from: b */
            public final C26839b mo77912b(@C12580l Throwable th) {
                return new C26839b(th);
            }

            @C12580l
            /* renamed from: d */
            public final Throwable mo77913d() {
                return this.f65437a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26839b) && Intrinsics.areEqual((Object) this.f65437a, (Object) ((C26839b) obj).f65437a);
            }

            public int hashCode() {
                Throwable th = this.f65437a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65437a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$a$c */
        public static final class C26840c implements C26837a {
            @C12579k

            /* renamed from: a */
            public static final C26840c f65438a = new C26840c();

            /* renamed from: b */
            public static final int f65439b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$b */
    public interface C26841b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$b$a */
        public static final class C26842a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m113846a(@C12579k C26841b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$b$b */
        public static final class C26843b implements C26841b {
            @C12579k

            /* renamed from: b */
            public static final C26843b f65440b = new C26843b();

            /* renamed from: c */
            public static final int f65441c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26842a.m113846a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$b$c */
        public static final class C26844c implements C26841b {
            @C12579k

            /* renamed from: b */
            public static final C26844c f65442b = new C26844c();

            /* renamed from: c */
            public static final int f65443c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26842a.m113846a(this);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$c */
    public interface C26845c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.a$c$a */
        public static final class C26846a implements C26845c {

            /* renamed from: b */
            public static final int f65444b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65445a;

            public C26846a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                this.f65445a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26846a m113847c(C26846a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f65445a;
                }
                return aVar.mo77918b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77917a() {
                return this.f65445a;
            }

            @C12579k
            /* renamed from: b */
            public final C26846a mo77918b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                return new C26846a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo77919d() {
                return this.f65445a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26846a) && Intrinsics.areEqual((Object) this.f65445a, (Object) ((C26846a) obj).f65445a);
            }

            public int hashCode() {
                return this.f65445a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65445a;
                return "InitAdditionalOrderProcess(orderId=" + str + ")";
            }
        }
    }
}
