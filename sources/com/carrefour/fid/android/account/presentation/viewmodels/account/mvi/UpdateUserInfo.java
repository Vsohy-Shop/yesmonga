package com.carrefour.fid.android.account.presentation.viewmodels.account.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UpdateUserInfo {
    @C12579k

    /* renamed from: a */
    public static final UpdateUserInfo f33100a = new UpdateUserInfo();
    @C12579k

    /* renamed from: b */
    public static final C28505u.C28508c<C13600b, C13596a> f33101b = C13611e.f33131a;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$FieldError;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum FieldError {
        FIRSTNAME,
        LASTNAME
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a */
    public interface C13596a extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$a */
        public static final class C13597a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m58229a(@C12579k C13596a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$b */
        public static final class C13598b implements C13596a {

            /* renamed from: c */
            public static final int f33105c = 8;
            @C12579k

            /* renamed from: b */
            public final AccountInfo f33106b;

            public C13598b(@C12579k AccountInfo accountInfo) {
                Intrinsics.checkNotNullParameter(accountInfo, "data");
                this.f33106b = accountInfo;
            }

            /* renamed from: g */
            public static /* synthetic */ C13598b m58230g(C13598b bVar, AccountInfo accountInfo, int i, Object obj) {
                if ((i & 1) != 0) {
                    accountInfo = bVar.f33106b;
                }
                return bVar.mo32258f(accountInfo);
            }

            @C12579k
            /* renamed from: e */
            public final AccountInfo mo32256e() {
                return this.f33106b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13598b) && Intrinsics.areEqual((Object) this.f33106b, (Object) ((C13598b) obj).f33106b);
            }

            @C12579k
            /* renamed from: f */
            public final C13598b mo32258f(@C12579k AccountInfo accountInfo) {
                Intrinsics.checkNotNullParameter(accountInfo, "data");
                return new C13598b(accountInfo);
            }

            @C12579k
            /* renamed from: h */
            public final AccountInfo mo32259h() {
                return this.f33106b;
            }

            public int hashCode() {
                return this.f33106b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13597a.m58229a(this);
            }

            @C12579k
            public String toString() {
                AccountInfo accountInfo = this.f33106b;
                return "PushAccountInfoModel(data=" + accountInfo + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$c */
        public static final class C13599c implements C13596a {

            /* renamed from: c */
            public static final int f33107c = 8;
            @C12579k

            /* renamed from: b */
            public final Set<FieldError> f33108b;

            public C13599c(@C12579k Set<? extends FieldError> set) {
                Intrinsics.checkNotNullParameter(set, "fieldsError");
                this.f33108b = set;
            }

            /* renamed from: g */
            public static /* synthetic */ C13599c m58234g(C13599c cVar, Set<FieldError> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = cVar.f33108b;
                }
                return cVar.mo32264f(set);
            }

            @C12579k
            /* renamed from: e */
            public final Set<FieldError> mo32262e() {
                return this.f33108b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13599c) && Intrinsics.areEqual((Object) this.f33108b, (Object) ((C13599c) obj).f33108b);
            }

            @C12579k
            /* renamed from: f */
            public final C13599c mo32264f(@C12579k Set<? extends FieldError> set) {
                Intrinsics.checkNotNullParameter(set, "fieldsError");
                return new C13599c(set);
            }

            @C12579k
            /* renamed from: h */
            public final Set<FieldError> mo32265h() {
                return this.f33108b;
            }

            public int hashCode() {
                return this.f33108b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13597a.m58229a(this);
            }

            @C12579k
            public String toString() {
                Set<FieldError> set = this.f33108b;
                return "PushFieldError(fieldsError=" + set + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$b */
    public static final class C13600b implements C28505u.C28509d {
        @C12579k

        /* renamed from: e */
        public static final C13601a f33109e = new C13601a((DefaultConstructorMarker) null);

        /* renamed from: f */
        public static final int f33110f = 8;
        @C12579k

        /* renamed from: g */
        public static final C13600b f33111g = new C13600b((AccountInfo) null, (Set) null, false, 7, (DefaultConstructorMarker) null);
        @C12580l

        /* renamed from: b */
        public final AccountInfo f33112b;
        @C12579k

        /* renamed from: c */
        public final Set<FieldError> f33113c;

        /* renamed from: d */
        public final boolean f33114d;

        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$b$a */
        public static final class C13601a {
            public /* synthetic */ C13601a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C13600b mo32278a() {
                return C13600b.f33111g;
            }

            public C13601a() {
            }
        }

        public C13600b() {
            this((AccountInfo) null, (Set) null, false, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: j */
        public static /* synthetic */ C13600b m58239j(C13600b bVar, AccountInfo accountInfo, Set<FieldError> set, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                accountInfo = bVar.f33112b;
            }
            if ((i & 2) != 0) {
                set = bVar.f33113c;
            }
            if ((i & 4) != 0) {
                z = bVar.f33114d;
            }
            return bVar.mo32273i(accountInfo, set, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13600b)) {
                return false;
            }
            C13600b bVar = (C13600b) obj;
            return Intrinsics.areEqual((Object) this.f33112b, (Object) bVar.f33112b) && Intrinsics.areEqual((Object) this.f33113c, (Object) bVar.f33113c) && this.f33114d == bVar.f33114d;
        }

        @C12580l
        /* renamed from: f */
        public final AccountInfo mo32269f() {
            return this.f33112b;
        }

        @C12579k
        /* renamed from: g */
        public final Set<FieldError> mo32270g() {
            return this.f33113c;
        }

        /* renamed from: h */
        public final boolean mo32271h() {
            return this.f33114d;
        }

        public int hashCode() {
            AccountInfo accountInfo = this.f33112b;
            int hashCode = (((accountInfo == null ? 0 : accountInfo.hashCode()) * 31) + this.f33113c.hashCode()) * 31;
            boolean z = this.f33114d;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final C13600b mo32273i(@C12580l AccountInfo accountInfo, @C12579k Set<? extends FieldError> set, boolean z) {
            Intrinsics.checkNotNullParameter(set, "fieldsError");
            return new C13600b(accountInfo, set, z);
        }

        public final boolean isLoading() {
            return this.f33114d;
        }

        @C12580l
        /* renamed from: k */
        public final AccountInfo mo32275k() {
            return this.f33112b;
        }

        @C12579k
        /* renamed from: l */
        public final Set<FieldError> mo32276l() {
            return this.f33113c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            AccountInfo accountInfo = this.f33112b;
            Set<FieldError> set = this.f33113c;
            boolean z = this.f33114d;
            return "UIState(accountInfoModel=" + accountInfo + ", fieldsError=" + set + ", isLoading=" + z + ")";
        }

        public C13600b(@C12580l AccountInfo accountInfo, @C12579k Set<? extends FieldError> set, boolean z) {
            Intrinsics.checkNotNullParameter(set, "fieldsError");
            this.f33112b = accountInfo;
            this.f33113c = set;
            this.f33114d = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13600b(AccountInfo accountInfo, Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : accountInfo, (i & 2) != 0 ? C10930d1.m40892k() : set, (i & 4) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$c */
    public interface C13602c extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$c$a */
        public static final class C13603a implements C13602c {
            @C12579k

            /* renamed from: a */
            public static final C13603a f33115a = new C13603a();

            /* renamed from: b */
            public static final int f33116b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$c$b */
        public static final class C13604b implements C13602c {
            @C12579k

            /* renamed from: a */
            public static final C13604b f33117a = new C13604b();

            /* renamed from: b */
            public static final int f33118b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$d */
    public interface C13605d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$d$a */
        public static final class C13606a implements C13605d {

            /* renamed from: b */
            public static final int f33119b = 0;
            @C12579k

            /* renamed from: a */
            public final String f33120a;

            public C13606a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "firstName");
                this.f33120a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C13606a m58247c(C13606a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f33120a;
                }
                return aVar.mo32280b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32279a() {
                return this.f33120a;
            }

            @C12579k
            /* renamed from: b */
            public final C13606a mo32280b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "firstName");
                return new C13606a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo32281d() {
                return this.f33120a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13606a) && Intrinsics.areEqual((Object) this.f33120a, (Object) ((C13606a) obj).f33120a);
            }

            public int hashCode() {
                return this.f33120a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33120a;
                return "CheckFirstName(firstName=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$d$b */
        public static final class C13607b implements C13605d {

            /* renamed from: b */
            public static final int f33121b = 0;
            @C12579k

            /* renamed from: a */
            public final String f33122a;

            public C13607b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "lastName");
                this.f33122a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C13607b m58251c(C13607b bVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f33122a;
                }
                return bVar.mo32286b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32285a() {
                return this.f33122a;
            }

            @C12579k
            /* renamed from: b */
            public final C13607b mo32286b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "lastName");
                return new C13607b(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo32287d() {
                return this.f33122a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13607b) && Intrinsics.areEqual((Object) this.f33122a, (Object) ((C13607b) obj).f33122a);
            }

            public int hashCode() {
                return this.f33122a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33122a;
                return "CheckLastName(lastName=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$d$c */
        public static final class C13608c implements C13605d {
            @C12579k

            /* renamed from: a */
            public static final C13608c f33123a = new C13608c();

            /* renamed from: b */
            public static final int f33124b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$d$d */
        public static final class C13609d implements C13605d {

            /* renamed from: b */
            public static final int f33125b = 0;
            @C12579k

            /* renamed from: a */
            public final CivilityTitle f33126a;

            public C13609d(@C12579k CivilityTitle civilityTitle) {
                Intrinsics.checkNotNullParameter(civilityTitle, "civilityTitle");
                this.f33126a = civilityTitle;
            }

            /* renamed from: c */
            public static /* synthetic */ C13609d m58255c(C13609d dVar, CivilityTitle civilityTitle, int i, Object obj) {
                if ((i & 1) != 0) {
                    civilityTitle = dVar.f33126a;
                }
                return dVar.mo32292b(civilityTitle);
            }

            @C12579k
            /* renamed from: a */
            public final CivilityTitle mo32291a() {
                return this.f33126a;
            }

            @C12579k
            /* renamed from: b */
            public final C13609d mo32292b(@C12579k CivilityTitle civilityTitle) {
                Intrinsics.checkNotNullParameter(civilityTitle, "civilityTitle");
                return new C13609d(civilityTitle);
            }

            @C12579k
            /* renamed from: d */
            public final CivilityTitle mo32293d() {
                return this.f33126a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13609d) && this.f33126a == ((C13609d) obj).f33126a;
            }

            public int hashCode() {
                return this.f33126a.hashCode();
            }

            @C12579k
            public String toString() {
                CivilityTitle civilityTitle = this.f33126a;
                return "RememberCivility(civilityTitle=" + civilityTitle + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$d$e */
        public static final class C13610e implements C13605d {

            /* renamed from: d */
            public static final int f33127d = 0;
            @C12579k

            /* renamed from: a */
            public final String f33128a;
            @C12579k

            /* renamed from: b */
            public final String f33129b;
            @C12579k

            /* renamed from: c */
            public final CivilityTitle f33130c;

            public C13610e(@C12579k String str, @C12579k String str2, @C12579k CivilityTitle civilityTitle) {
                Intrinsics.checkNotNullParameter(str, "firstName");
                Intrinsics.checkNotNullParameter(str2, "lastName");
                Intrinsics.checkNotNullParameter(civilityTitle, "civilityTitle");
                this.f33128a = str;
                this.f33129b = str2;
                this.f33130c = civilityTitle;
            }

            /* renamed from: e */
            public static /* synthetic */ C13610e m58259e(C13610e eVar, String str, String str2, CivilityTitle civilityTitle, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eVar.f33128a;
                }
                if ((i & 2) != 0) {
                    str2 = eVar.f33129b;
                }
                if ((i & 4) != 0) {
                    civilityTitle = eVar.f33130c;
                }
                return eVar.mo32300d(str, str2, civilityTitle);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32297a() {
                return this.f33128a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo32298b() {
                return this.f33129b;
            }

            @C12579k
            /* renamed from: c */
            public final CivilityTitle mo32299c() {
                return this.f33130c;
            }

            @C12579k
            /* renamed from: d */
            public final C13610e mo32300d(@C12579k String str, @C12579k String str2, @C12579k CivilityTitle civilityTitle) {
                Intrinsics.checkNotNullParameter(str, "firstName");
                Intrinsics.checkNotNullParameter(str2, "lastName");
                Intrinsics.checkNotNullParameter(civilityTitle, "civilityTitle");
                return new C13610e(str, str2, civilityTitle);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13610e)) {
                    return false;
                }
                C13610e eVar = (C13610e) obj;
                return Intrinsics.areEqual((Object) this.f33128a, (Object) eVar.f33128a) && Intrinsics.areEqual((Object) this.f33129b, (Object) eVar.f33129b) && this.f33130c == eVar.f33130c;
            }

            @C12579k
            /* renamed from: f */
            public final CivilityTitle mo32302f() {
                return this.f33130c;
            }

            @C12579k
            /* renamed from: g */
            public final String mo32303g() {
                return this.f33128a;
            }

            @C12579k
            /* renamed from: h */
            public final String mo32304h() {
                return this.f33129b;
            }

            public int hashCode() {
                return (((this.f33128a.hashCode() * 31) + this.f33129b.hashCode()) * 31) + this.f33130c.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33128a;
                String str2 = this.f33129b;
                CivilityTitle civilityTitle = this.f33130c;
                return "SaveUser(firstName=" + str + ", lastName=" + str2 + ", civilityTitle=" + civilityTitle + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$e */
    public static final class C13611e implements C28505u.C28508c<C13600b, C13596a> {

        /* renamed from: a */
        public static final C13611e f33131a = new C13611e();

        @C12579k
        /* renamed from: b */
        public final C13600b mo32307a(@C12579k C13600b bVar, @C12579k C13596a aVar) {
            Intrinsics.checkNotNullParameter(bVar, "state");
            Intrinsics.checkNotNullParameter(aVar, "partialState");
            if (aVar instanceof C13596a.C13598b) {
                return C13600b.m58239j(bVar, ((C13596a.C13598b) aVar).mo32259h(), (Set) null, false, 2, (Object) null);
            } else if (aVar instanceof C13596a.C13599c) {
                return C13600b.m58239j(bVar, (AccountInfo) null, ((C13596a.C13599c) aVar).mo32265h(), false, 1, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @C12579k
    /* renamed from: a */
    public final C28505u.C28508c<C13600b, C13596a> mo32255a() {
        return f33101b;
    }
}
