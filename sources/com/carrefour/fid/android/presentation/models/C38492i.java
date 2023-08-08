package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.i */
public final class C38492i {

    /* renamed from: k */
    public static final int f97608k = 8;
    @C12580l

    /* renamed from: a */
    public final OrdersOnlineDetailsHeaderModel f97609a;
    @C12580l

    /* renamed from: b */
    public final List<OrdersOnlineItemModel> f97610b;
    @C12580l

    /* renamed from: c */
    public final StoreServiceType f97611c;

    /* renamed from: d */
    public final boolean f97612d;
    @C12579k

    /* renamed from: e */
    public final String f97613e;
    @C12580l

    /* renamed from: f */
    public final String f97614f;
    @C12580l

    /* renamed from: g */
    public final C38163l f97615g;
    @C12580l

    /* renamed from: h */
    public final Slot f97616h;
    @C12580l

    /* renamed from: i */
    public final String f97617i;

    /* renamed from: j */
    public final boolean f97618j;

    public C38492i(@C12580l OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, @C12580l List<OrdersOnlineItemModel> list, @C12580l StoreServiceType storeServiceType, boolean z, @C12579k String str, @C12580l String str2, @C12580l C38163l lVar, @C12580l Slot slot, @C12580l String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "address");
        this.f97609a = ordersOnlineDetailsHeaderModel;
        this.f97610b = list;
        this.f97611c = storeServiceType;
        this.f97612d = z;
        this.f97613e = str;
        this.f97614f = str2;
        this.f97615g = lVar;
        this.f97616h = slot;
        this.f97617i = str3;
        this.f97618j = z2;
    }

    /* renamed from: l */
    public static /* synthetic */ C38492i m159677l(C38492i iVar, OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, List list, StoreServiceType storeServiceType, boolean z, String str, String str2, C38163l lVar, Slot slot, String str3, boolean z2, int i, Object obj) {
        C38492i iVar2 = iVar;
        int i2 = i;
        return iVar.mo122077k((i2 & 1) != 0 ? iVar2.f97609a : ordersOnlineDetailsHeaderModel, (i2 & 2) != 0 ? iVar2.f97610b : list, (i2 & 4) != 0 ? iVar2.f97611c : storeServiceType, (i2 & 8) != 0 ? iVar2.f97612d : z, (i2 & 16) != 0 ? iVar2.f97613e : str, (i2 & 32) != 0 ? iVar2.f97614f : str2, (i2 & 64) != 0 ? iVar2.f97615g : lVar, (i2 & 128) != 0 ? iVar2.f97616h : slot, (i2 & 256) != 0 ? iVar2.f97617i : str3, (i2 & 512) != 0 ? iVar2.f97618j : z2);
    }

    @C12580l
    /* renamed from: a */
    public final OrdersOnlineDetailsHeaderModel mo122065a() {
        return this.f97609a;
    }

    /* renamed from: b */
    public final boolean mo122066b() {
        return this.f97618j;
    }

    @C12580l
    /* renamed from: c */
    public final List<OrdersOnlineItemModel> mo122067c() {
        return this.f97610b;
    }

    @C12580l
    /* renamed from: d */
    public final StoreServiceType mo122068d() {
        return this.f97611c;
    }

    /* renamed from: e */
    public final boolean mo122069e() {
        return this.f97612d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38492i)) {
            return false;
        }
        C38492i iVar = (C38492i) obj;
        return Intrinsics.areEqual((Object) this.f97609a, (Object) iVar.f97609a) && Intrinsics.areEqual((Object) this.f97610b, (Object) iVar.f97610b) && Intrinsics.areEqual((Object) this.f97611c, (Object) iVar.f97611c) && this.f97612d == iVar.f97612d && Intrinsics.areEqual((Object) this.f97613e, (Object) iVar.f97613e) && Intrinsics.areEqual((Object) this.f97614f, (Object) iVar.f97614f) && Intrinsics.areEqual((Object) this.f97615g, (Object) iVar.f97615g) && Intrinsics.areEqual((Object) this.f97616h, (Object) iVar.f97616h) && Intrinsics.areEqual((Object) this.f97617i, (Object) iVar.f97617i) && this.f97618j == iVar.f97618j;
    }

    @C12579k
    /* renamed from: f */
    public final String mo122071f() {
        return this.f97613e;
    }

    @C12580l
    /* renamed from: g */
    public final String mo122072g() {
        return this.f97614f;
    }

    @C12580l
    /* renamed from: h */
    public final C38163l mo122073h() {
        return this.f97615g;
    }

    public int hashCode() {
        OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel = this.f97609a;
        int i = 0;
        int hashCode = (ordersOnlineDetailsHeaderModel == null ? 0 : ordersOnlineDetailsHeaderModel.hashCode()) * 31;
        List<OrdersOnlineItemModel> list = this.f97610b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        StoreServiceType storeServiceType = this.f97611c;
        int hashCode3 = (hashCode2 + (storeServiceType == null ? 0 : storeServiceType.hashCode())) * 31;
        boolean z = this.f97612d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode4 = (((hashCode3 + (z ? 1 : 0)) * 31) + this.f97613e.hashCode()) * 31;
        String str = this.f97614f;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        C38163l lVar = this.f97615g;
        int hashCode6 = (hashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Slot slot = this.f97616h;
        int hashCode7 = (hashCode6 + (slot == null ? 0 : slot.hashCode())) * 31;
        String str2 = this.f97617i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z3 = this.f97618j;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final Slot mo122075i() {
        return this.f97616h;
    }

    @C12580l
    /* renamed from: j */
    public final String mo122076j() {
        return this.f97617i;
    }

    @C12579k
    /* renamed from: k */
    public final C38492i mo122077k(@C12580l OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, @C12580l List<OrdersOnlineItemModel> list, @C12580l StoreServiceType storeServiceType, boolean z, @C12579k String str, @C12580l String str2, @C12580l C38163l lVar, @C12580l Slot slot, @C12580l String str3, boolean z2) {
        String str4 = str;
        Intrinsics.checkNotNullParameter(str4, "address");
        return new C38492i(ordersOnlineDetailsHeaderModel, list, storeServiceType, z, str4, str2, lVar, slot, str3, z2);
    }

    @C12579k
    /* renamed from: m */
    public final String mo122078m() {
        return this.f97613e;
    }

    @C12580l
    /* renamed from: n */
    public final String mo122079n() {
        return this.f97614f;
    }

    @C12580l
    /* renamed from: o */
    public final OrdersOnlineDetailsHeaderModel mo122080o() {
        return this.f97609a;
    }

    @C12580l
    /* renamed from: p */
    public final String mo122081p() {
        return this.f97617i;
    }

    @C12580l
    /* renamed from: q */
    public final StoreServiceType mo122082q() {
        return this.f97611c;
    }

    @C12580l
    /* renamed from: r */
    public final Slot mo122083r() {
        return this.f97616h;
    }

    @C12580l
    /* renamed from: s */
    public final C38163l mo122084s() {
        return this.f97615g;
    }

    @C12580l
    /* renamed from: t */
    public final List<OrdersOnlineItemModel> mo122085t() {
        return this.f97610b;
    }

    @C12579k
    public String toString() {
        OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel = this.f97609a;
        List<OrdersOnlineItemModel> list = this.f97610b;
        StoreServiceType storeServiceType = this.f97611c;
        boolean z = this.f97612d;
        String str = this.f97613e;
        String str2 = this.f97614f;
        C38163l lVar = this.f97615g;
        Slot slot = this.f97616h;
        String str3 = this.f97617i;
        boolean z2 = this.f97618j;
        return "HomeOrderModel(lastOrderModel=" + ordersOnlineDetailsHeaderModel + ", validOrderList=" + list + ", serviceType=" + storeServiceType + ", isClcv=" + z + ", address=" + str + ", fullOrderAddress=" + str2 + ", store=" + lVar + ", slot=" + slot + ", postCode=" + str3 + ", withErrorSlots=" + z2 + ")";
    }

    /* renamed from: u */
    public final boolean mo122087u() {
        return this.f97618j;
    }

    /* renamed from: v */
    public final boolean mo122088v() {
        return this.f97612d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38492i(com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel r15, java.util.List r16, com.carrefour.fid.android.domain.models.service.models.StoreServiceType r17, boolean r18, java.lang.String r19, java.lang.String r20, com.carrefour.fid.android.domain.models.service.models.C38163l r21, com.carrefour.fid.android.domain.models.slot.Slot r22, java.lang.String r23, boolean r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0010
            r5 = r2
            goto L_0x0012
        L_0x0010:
            r5 = r16
        L_0x0012:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x0019
            r7 = r3
            goto L_0x001b
        L_0x0019:
            r7 = r18
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r8 = r1
            goto L_0x0028
        L_0x0026:
            r8 = r19
        L_0x0028:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002e
            r9 = r2
            goto L_0x0030
        L_0x002e:
            r9 = r20
        L_0x0030:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0036
            r10 = r2
            goto L_0x0038
        L_0x0036:
            r10 = r21
        L_0x0038:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003e
            r11 = r2
            goto L_0x0040
        L_0x003e:
            r11 = r22
        L_0x0040:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0046
            r12 = r2
            goto L_0x0048
        L_0x0046:
            r12 = r23
        L_0x0048:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004e
            r13 = r3
            goto L_0x0050
        L_0x004e:
            r13 = r24
        L_0x0050:
            r3 = r14
            r6 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.C38492i.<init>(com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel, java.util.List, com.carrefour.fid.android.domain.models.service.models.StoreServiceType, boolean, java.lang.String, java.lang.String, com.carrefour.fid.android.domain.models.service.models.l, com.carrefour.fid.android.domain.models.slot.Slot, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
