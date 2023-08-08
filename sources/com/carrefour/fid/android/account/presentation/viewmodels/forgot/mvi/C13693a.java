package com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a */
public final class C13693a {
    @C12579k

    /* renamed from: a */
    public static final C13693a f33295a = new C13693a();

    /* renamed from: b */
    public static final int f33296b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$a */
    public static final class C13694a implements C28505u.C28509d {

        /* renamed from: c */
        public static final int f33297c = 0;

        /* renamed from: b */
        public final boolean f33298b;

        public C13694a() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public static /* synthetic */ C13694a m58531g(C13694a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f33298b;
            }
            return aVar.mo32587f(z);
        }

        /* renamed from: e */
        public final boolean mo32585e() {
            return this.f33298b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13694a) && this.f33298b == ((C13694a) obj).f33298b;
        }

        @C12579k
        /* renamed from: f */
        public final C13694a mo32587f(boolean z) {
            return new C13694a(z);
        }

        public int hashCode() {
            boolean z = this.f33298b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isLoading() {
            return this.f33298b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f33298b;
            return "UIState(isLoading=" + z + ")";
        }

        public C13694a(boolean z) {
            this.f33298b = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13694a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$b */
    public interface C13695b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$b$a */
        public static final class C13696a implements C13695b {

            /* renamed from: b */
            public static final int f33299b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f33300a;

            public C13696a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f33300a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C13696a m58534c(C13696a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f33300a;
                }
                return aVar.mo32592b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo32591a() {
                return this.f33300a;
            }

            @C12579k
            /* renamed from: b */
            public final C13696a mo32592b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C13696a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo32593d() {
                return this.f33300a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13696a) && Intrinsics.areEqual((Object) this.f33300a, (Object) ((C13696a) obj).f33300a);
            }

            public int hashCode() {
                return this.f33300a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f33300a;
                return "ErrorForgotPassword(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$b$b */
        public static final class C13697b implements C13695b {
            @C12579k

            /* renamed from: a */
            public static final C13697b f33301a = new C13697b();

            /* renamed from: b */
            public static final int f33302b = 0;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$c */
    public static abstract class C13698c implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f33303a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$c$a */
        public static final class C13699a extends C13698c {

            /* renamed from: c */
            public static final int f33304c = 0;
            @C12579k

            /* renamed from: b */
            public final String f33305b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13699a(@C12579k String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "email");
                this.f33305b = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C13699a m58538c(C13699a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f33305b;
                }
                return aVar.mo32598b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32597a() {
                return this.f33305b;
            }

            @C12579k
            /* renamed from: b */
            public final C13699a mo32598b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "email");
                return new C13699a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo32599d() {
                return this.f33305b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13699a) && Intrinsics.areEqual((Object) this.f33305b, (Object) ((C13699a) obj).f33305b);
            }

            public int hashCode() {
                return this.f33305b.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33305b;
                return "ForgotPassword(email=" + str + ")";
            }
        }

        public /* synthetic */ C13698c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13698c() {
        }
    }
}
