package com.carrefour.fid.android.presentation.viewmodels.account.home;

import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import com.carrefour.fid.android.domain.models.accountmenu.C37951b;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.home.c */
public final class C25798c {
    @C12579k

    /* renamed from: a */
    public final C28892e<C37950a> f63187a;
    @C12579k

    /* renamed from: b */
    public final C28892e<C37951b> f63188b;

    /* renamed from: c */
    public final boolean f63189c;
    @C12579k

    /* renamed from: d */
    public final List<AccountMenuItem> f63190d;
    @C12580l

    /* renamed from: e */
    public final String f63191e;

    public C25798c() {
        this((C28892e) null, (C28892e) null, false, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ C25798c m110655g(C25798c cVar, C28892e<C37950a> eVar, C28892e<C37951b> eVar2, boolean z, List<AccountMenuItem> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = cVar.f63187a;
        }
        if ((i & 2) != 0) {
            eVar2 = cVar.f63188b;
        }
        C28892e<C37951b> eVar3 = eVar2;
        if ((i & 4) != 0) {
            z = cVar.f63189c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            list = cVar.f63190d;
        }
        List<AccountMenuItem> list2 = list;
        if ((i & 16) != 0) {
            str = cVar.f63191e;
        }
        return cVar.mo74896f(eVar, eVar3, z2, list2, str);
    }

    @C12579k
    /* renamed from: a */
    public final C28892e<C37950a> mo74890a() {
        return this.f63187a;
    }

    @C12579k
    /* renamed from: b */
    public final C28892e<C37951b> mo74891b() {
        return this.f63188b;
    }

    /* renamed from: c */
    public final boolean mo74892c() {
        return this.f63189c;
    }

    @C12579k
    /* renamed from: d */
    public final List<AccountMenuItem> mo74893d() {
        return this.f63190d;
    }

    @C12580l
    /* renamed from: e */
    public final String mo74894e() {
        return this.f63191e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25798c)) {
            return false;
        }
        C25798c cVar = (C25798c) obj;
        return Intrinsics.areEqual((Object) this.f63187a, (Object) cVar.f63187a) && Intrinsics.areEqual((Object) this.f63188b, (Object) cVar.f63188b) && this.f63189c == cVar.f63189c && Intrinsics.areEqual((Object) this.f63190d, (Object) cVar.f63190d) && Intrinsics.areEqual((Object) this.f63191e, (Object) cVar.f63191e);
    }

    @C12579k
    /* renamed from: f */
    public final C25798c mo74896f(@C12579k C28892e<C37950a> eVar, @C12579k C28892e<C37951b> eVar2, boolean z, @C12579k List<? extends AccountMenuItem> list, @C12580l String str) {
        Intrinsics.checkNotNullParameter(eVar, "airshipInbox");
        Intrinsics.checkNotNullParameter(eVar2, "userInfo");
        Intrinsics.checkNotNullParameter(list, "accountMenuItemList");
        return new C25798c(eVar, eVar2, z, list, str);
    }

    @C12579k
    /* renamed from: h */
    public final List<AccountMenuItem> mo74897h() {
        return this.f63190d;
    }

    public int hashCode() {
        int hashCode = ((this.f63187a.hashCode() * 31) + this.f63188b.hashCode()) * 31;
        boolean z = this.f63189c;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f63190d.hashCode()) * 31;
        String str = this.f63191e;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    @C12579k
    /* renamed from: i */
    public final C28892e<C37950a> mo74899i() {
        return this.f63187a;
    }

    /* renamed from: j */
    public final boolean mo74900j() {
        return this.f63189c;
    }

    @C12579k
    /* renamed from: k */
    public final C28892e<C37951b> mo74901k() {
        return this.f63188b;
    }

    @C12580l
    /* renamed from: l */
    public final String mo74902l() {
        return this.f63191e;
    }

    @C12579k
    public String toString() {
        C28892e<C37950a> eVar = this.f63187a;
        C28892e<C37951b> eVar2 = this.f63188b;
        boolean z = this.f63189c;
        List<AccountMenuItem> list = this.f63190d;
        String str = this.f63191e;
        return "AccountMenuUiState(airshipInbox=" + eVar + ", userInfo=" + eVar2 + ", displayUsabillaBanner=" + z + ", accountMenuItemList=" + list + ", userUuid=" + str + ")";
    }

    public C25798c(@C12579k C28892e<C37950a> eVar, @C12579k C28892e<C37951b> eVar2, boolean z, @C12579k List<? extends AccountMenuItem> list, @C12580l String str) {
        Intrinsics.checkNotNullParameter(eVar, "airshipInbox");
        Intrinsics.checkNotNullParameter(eVar2, "userInfo");
        Intrinsics.checkNotNullParameter(list, "accountMenuItemList");
        this.f63187a = eVar;
        this.f63188b = eVar2;
        this.f63189c = z;
        this.f63190d = list;
        this.f63191e = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C25798c(com.carrefour.fid.android.shared.type.C28892e r4, com.carrefour.fid.android.shared.type.C28892e r5, boolean r6, java.util.List r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            com.carrefour.fid.android.shared.type.e$d r4 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            com.carrefour.fid.android.shared.type.e$d r5 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0012
            r6 = 0
        L_0x0012:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001b
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x001b:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            r8 = 0
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.home.C25798c.<init>(com.carrefour.fid.android.shared.type.e, com.carrefour.fid.android.shared.type.e, boolean, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
