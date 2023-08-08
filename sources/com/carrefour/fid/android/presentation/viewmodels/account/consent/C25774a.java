package com.carrefour.fid.android.presentation.viewmodels.account.consent;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.a */
public final class C25774a {
    @C12579k

    /* renamed from: a */
    public static final C25774a f63129a = new C25774a();

    /* renamed from: b */
    public static final int f63130b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a */
    public static final class C25775a implements C28505u.C28509d {
        @C12579k

        /* renamed from: i */
        public static final C25776a f63131i = new C25776a((DefaultConstructorMarker) null);

        /* renamed from: j */
        public static final int f63132j = 8;
        @C12579k

        /* renamed from: k */
        public static final C25775a f63133k = new C25775a((Integer) null, (List) null, false, false, false, (AccountInfo) null, 63, (DefaultConstructorMarker) null);
        @C12580l

        /* renamed from: b */
        public final Integer f63134b;
        @C12579k

        /* renamed from: c */
        public final List<ConsentOptIn> f63135c;

        /* renamed from: d */
        public final boolean f63136d;

        /* renamed from: e */
        public final boolean f63137e;

        /* renamed from: f */
        public final boolean f63138f;
        @C12580l

        /* renamed from: g */
        public final AccountInfo f63139g;

        /* renamed from: h */
        public final boolean f63140h;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a$a */
        public static final class C25776a {
            public /* synthetic */ C25776a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C25775a mo74841a() {
                return C25775a.f63133k;
            }

            public C25776a() {
            }
        }

        public C25775a() {
            this((Integer) null, (List) null, false, false, false, (AccountInfo) null, 63, (DefaultConstructorMarker) null);
        }

        /* renamed from: m */
        public static /* synthetic */ C25775a m110566m(C25775a aVar, Integer num, List<ConsentOptIn> list, boolean z, boolean z2, boolean z3, AccountInfo accountInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                num = aVar.f63134b;
            }
            if ((i & 2) != 0) {
                list = aVar.f63135c;
            }
            List<ConsentOptIn> list2 = list;
            if ((i & 4) != 0) {
                z = aVar.f63136d;
            }
            boolean z4 = z;
            if ((i & 8) != 0) {
                z2 = aVar.f63137e;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = aVar.f63138f;
            }
            boolean z6 = z3;
            if ((i & 32) != 0) {
                accountInfo = aVar.f63139g;
            }
            return aVar.mo74835l(num, list2, z4, z5, z6, accountInfo);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25775a)) {
                return false;
            }
            C25775a aVar = (C25775a) obj;
            return Intrinsics.areEqual((Object) this.f63134b, (Object) aVar.f63134b) && Intrinsics.areEqual((Object) this.f63135c, (Object) aVar.f63135c) && this.f63136d == aVar.f63136d && this.f63137e == aVar.f63137e && this.f63138f == aVar.f63138f && Intrinsics.areEqual((Object) this.f63139g, (Object) aVar.f63139g);
        }

        @C12580l
        /* renamed from: f */
        public final Integer mo74827f() {
            return this.f63134b;
        }

        @C12579k
        /* renamed from: g */
        public final List<ConsentOptIn> mo74828g() {
            return this.f63135c;
        }

        /* renamed from: h */
        public final boolean mo74829h() {
            return this.f63136d;
        }

        public int hashCode() {
            Integer num = this.f63134b;
            int i = 0;
            int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.f63135c.hashCode()) * 31;
            boolean z = this.f63136d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f63137e;
            if (z3) {
                z3 = true;
            }
            int i3 = (i2 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f63138f;
            if (!z4) {
                z2 = z4;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            AccountInfo accountInfo = this.f63139g;
            if (accountInfo != null) {
                i = accountInfo.hashCode();
            }
            return i4 + i;
        }

        /* renamed from: i */
        public final boolean mo74831i() {
            return this.f63137e;
        }

        public final boolean isLoading() {
            return this.f63137e || this.f63138f;
        }

        /* renamed from: j */
        public final boolean mo74833j() {
            return this.f63138f;
        }

        /* renamed from: k */
        public final AccountInfo mo74834k() {
            return this.f63139g;
        }

        @C12579k
        /* renamed from: l */
        public final C25775a mo74835l(@C12580l Integer num, @C12579k List<ConsentOptIn> list, boolean z, boolean z2, boolean z3, @C12580l AccountInfo accountInfo) {
            Intrinsics.checkNotNullParameter(list, "consentOptIns");
            return new C25775a(num, list, z, z2, z3, accountInfo);
        }

        @C12579k
        /* renamed from: n */
        public final List<ConsentOptIn> mo74836n() {
            return this.f63135c;
        }

        @C12580l
        /* renamed from: o */
        public final Integer mo74837o() {
            return this.f63134b;
        }

        /* renamed from: p */
        public final boolean mo74838p() {
            return this.f63136d;
        }

        /* renamed from: q */
        public final boolean mo74839q() {
            return this.f63140h;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            Integer num = this.f63134b;
            List<ConsentOptIn> list = this.f63135c;
            boolean z = this.f63136d;
            boolean z2 = this.f63137e;
            boolean z3 = this.f63138f;
            AccountInfo accountInfo = this.f63139g;
            return "UIState(errorMessageRes=" + num + ", consentOptIns=" + list + ", hasCardFid=" + z + ", isConsentsLoading=" + z2 + ", isUserInfoLoading=" + z3 + ", userInfo=" + accountInfo + ")";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
            r2 = r7.mo116671x();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25775a(@org.jetbrains.annotations.C12580l java.lang.Integer r2, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.consent.ConsentOptIn> r3, boolean r4, boolean r5, boolean r6, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.account.AccountInfo r7) {
            /*
                r1 = this;
                java.lang.String r0 = "consentOptIns"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.f63134b = r2
                r1.f63135c = r3
                r1.f63136d = r4
                r1.f63137e = r5
                r1.f63138f = r6
                r1.f63139g = r7
                if (r7 == 0) goto L_0x0025
                java.util.List r2 = r7.mo116671x()
                if (r2 == 0) goto L_0x0025
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ 1
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                r1.f63140h = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.<init>(java.lang.Integer, java.util.List, boolean, boolean, boolean, com.carrefour.fid.android.domain.models.account.AccountInfo):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C25775a(java.lang.Integer r6, java.util.List r7, boolean r8, boolean r9, boolean r10, com.carrefour.fid.android.domain.models.account.AccountInfo r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = r0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                if (r6 == 0) goto L_0x0010
                java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            L_0x0010:
                r1 = r7
                r6 = r12 & 4
                r7 = 0
                if (r6 == 0) goto L_0x0018
                r2 = r7
                goto L_0x0019
            L_0x0018:
                r2 = r8
            L_0x0019:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001f
                r3 = r7
                goto L_0x0020
            L_0x001f:
                r3 = r9
            L_0x0020:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0026
                r4 = r7
                goto L_0x0027
            L_0x0026:
                r4 = r10
            L_0x0027:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002d
                r12 = r0
                goto L_0x002e
            L_0x002d:
                r12 = r11
            L_0x002e:
                r6 = r5
                r7 = r13
                r8 = r1
                r9 = r2
                r10 = r3
                r11 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.<init>(java.lang.Integer, java.util.List, boolean, boolean, boolean, com.carrefour.fid.android.domain.models.account.AccountInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.a$b */
    public interface C25777b extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.a$b$a */
        public static final class C25778a implements C25777b {
            @C12579k

            /* renamed from: a */
            public static final C25778a f63141a = new C25778a();

            /* renamed from: b */
            public static final int f63142b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.a$b$b */
        public static final class C25779b implements C25777b {

            /* renamed from: b */
            public static final int f63143b = 8;
            @C12579k

            /* renamed from: a */
            public final List<ConsentOptIn> f63144a;

            public C25779b(@C12579k List<ConsentOptIn> list) {
                Intrinsics.checkNotNullParameter(list, "consentOptIns");
                this.f63144a = list;
            }

            /* renamed from: c */
            public static /* synthetic */ C25779b m110579c(C25779b bVar, List<ConsentOptIn> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = bVar.f63144a;
                }
                return bVar.mo74843b(list);
            }

            @C12579k
            /* renamed from: a */
            public final List<ConsentOptIn> mo74842a() {
                return this.f63144a;
            }

            @C12579k
            /* renamed from: b */
            public final C25779b mo74843b(@C12579k List<ConsentOptIn> list) {
                Intrinsics.checkNotNullParameter(list, "consentOptIns");
                return new C25779b(list);
            }

            @C12579k
            /* renamed from: d */
            public final List<ConsentOptIn> mo74844d() {
                return this.f63144a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25779b) && Intrinsics.areEqual((Object) this.f63144a, (Object) ((C25779b) obj).f63144a);
            }

            public int hashCode() {
                return this.f63144a.hashCode();
            }

            @C12579k
            public String toString() {
                List<ConsentOptIn> list = this.f63144a;
                return "UpdateConsentOptIns(consentOptIns=" + list + ")";
            }
        }
    }
}
