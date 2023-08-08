package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a */
public interface C23130a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a$a */
    public static final class C23131a implements C23130a {
        @C12579k

        /* renamed from: a */
        public static final C23131a f58797a = new C23131a();

        /* renamed from: b */
        public static final int f58798b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a$b */
    public static final class C23132b implements C23130a {
        @C12579k

        /* renamed from: a */
        public static final C23132b f58799a = new C23132b();

        /* renamed from: b */
        public static final int f58800b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a$c */
    public static final class C23133c implements C23130a {
        @C12579k

        /* renamed from: a */
        public static final C23133c f58801a = new C23133c();

        /* renamed from: b */
        public static final int f58802b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a$d */
    public static final class C23134d implements C23130a {
        @C12579k

        /* renamed from: a */
        public static final C23134d f58803a = new C23134d();

        /* renamed from: b */
        public static final int f58804b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a$e */
    public static final class C23135e implements C23130a {

        /* renamed from: b */
        public static final int f58805b = 0;
        @C12579k

        /* renamed from: a */
        public final AccountMenuItem f58806a;

        public C23135e(@C12579k AccountMenuItem accountMenuItem) {
            Intrinsics.checkNotNullParameter(accountMenuItem, "accountMenuItem");
            this.f58806a = accountMenuItem;
        }

        /* renamed from: c */
        public static /* synthetic */ C23135e m103712c(C23135e eVar, AccountMenuItem accountMenuItem, int i, Object obj) {
            if ((i & 1) != 0) {
                accountMenuItem = eVar.f58806a;
            }
            return eVar.mo67886b(accountMenuItem);
        }

        @C12579k
        /* renamed from: a */
        public final AccountMenuItem mo67885a() {
            return this.f58806a;
        }

        @C12579k
        /* renamed from: b */
        public final C23135e mo67886b(@C12579k AccountMenuItem accountMenuItem) {
            Intrinsics.checkNotNullParameter(accountMenuItem, "accountMenuItem");
            return new C23135e(accountMenuItem);
        }

        @C12579k
        /* renamed from: d */
        public final AccountMenuItem mo67887d() {
            return this.f58806a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23135e) && this.f58806a == ((C23135e) obj).f58806a;
        }

        public int hashCode() {
            return this.f58806a.hashCode();
        }

        @C12579k
        public String toString() {
            AccountMenuItem accountMenuItem = this.f58806a;
            return "OnMenuOptionItemClicked(accountMenuItem=" + accountMenuItem + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a$f */
    public static final class C23136f implements C23130a {

        /* renamed from: b */
        public static final int f58807b = 8;
        @C12579k

        /* renamed from: a */
        public final C37950a f58808a;

        public C23136f(@C12579k C37950a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "airshipInbox");
            this.f58808a = aVar;
        }

        /* renamed from: c */
        public static /* synthetic */ C23136f m103716c(C23136f fVar, C37950a aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar = fVar.f58808a;
            }
            return fVar.mo67892b(aVar);
        }

        @C12579k
        /* renamed from: a */
        public final C37950a mo67891a() {
            return this.f58808a;
        }

        @C12579k
        /* renamed from: b */
        public final C23136f mo67892b(@C12579k C37950a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "airshipInbox");
            return new C23136f(aVar);
        }

        @C12579k
        /* renamed from: d */
        public final C37950a mo67893d() {
            return this.f58808a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23136f) && Intrinsics.areEqual((Object) this.f58808a, (Object) ((C23136f) obj).f58808a);
        }

        public int hashCode() {
            return this.f58808a.hashCode();
        }

        @C12579k
        public String toString() {
            C37950a aVar = this.f58808a;
            return "OnNotificationClicked(airshipInbox=" + aVar + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a$g */
    public static final class C23137g implements C23130a {
        @C12579k

        /* renamed from: a */
        public static final C23137g f58809a = new C23137g();

        /* renamed from: b */
        public static final int f58810b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.a$h */
    public static final class C23138h implements C23130a {
        @C12579k

        /* renamed from: a */
        public static final C23138h f58811a = new C23138h();

        /* renamed from: b */
        public static final int f58812b = 0;
    }
}
