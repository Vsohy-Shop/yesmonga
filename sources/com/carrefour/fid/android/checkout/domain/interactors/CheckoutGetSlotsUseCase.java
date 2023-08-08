package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.slot.C37861g;
import com.carrefour.fid.android.domain.interactors.user.C37877d;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCheckoutGetSlotsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutGetSlotsUseCase.kt\ncom/carrefour/fid/android/checkout/domain/interactors/CheckoutGetSlotsUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1#2:74\n288#3,2:75\n*S KotlinDebug\n*F\n+ 1 CheckoutGetSlotsUseCase.kt\ncom/carrefour/fid/android/checkout/domain/interactors/CheckoutGetSlotsUseCase\n*L\n48#1:75,2\n*E\n"})
public final class CheckoutGetSlotsUseCase implements C37861g {
    @C12579k

    /* renamed from: a */
    public final CheckoutGetSlotListUseCase f101662a;
    @C12579k

    /* renamed from: b */
    public final CheckoutGetSlotYieldListUseCase f101663b;
    @C12579k

    /* renamed from: c */
    public final C37877d f101664c;
    @C12579k

    /* renamed from: d */
    public final C37566e0 f101665d;
    @C12579k

    /* renamed from: e */
    public final C37886i f101666e;
    @C12579k

    /* renamed from: f */
    public final C37823k f101667f;

    @Inject
    public CheckoutGetSlotsUseCase(@C12579k CheckoutGetSlotListUseCase checkoutGetSlotListUseCase, @C12579k CheckoutGetSlotYieldListUseCase checkoutGetSlotYieldListUseCase, @C12579k C37877d dVar, @C12579k C37566e0 e0Var, @C12579k C37886i iVar, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(checkoutGetSlotListUseCase, "getSlotListUseCase");
        Intrinsics.checkNotNullParameter(checkoutGetSlotYieldListUseCase, "getSlotYieldListUseCase");
        Intrinsics.checkNotNullParameter(dVar, "getUserInfoStoreUseCase");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(iVar, "isUserConnectedUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f101662a = checkoutGetSlotListUseCase;
        this.f101663b = checkoutGetSlotYieldListUseCase;
        this.f101664c = dVar;
        this.f101665d = e0Var;
        this.f101666e = iVar;
        this.f101667f = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b5, code lost:
        if (r0.hasNext() == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b7, code lost:
        r9 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c4, code lost:
        if (((com.carrefour.fid.android.domain.models.account.Address) r9).mo116683H() != com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c6, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c8, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c9, code lost:
        if (r11 == false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cc, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01cd, code lost:
        r9 = (com.carrefour.fid.android.domain.models.account.Address) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d0, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d1, code lost:
        if (r9 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d3, code lost:
        r0 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9.mo116691P());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01dc, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e3, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, 0.0d) != false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e5, code lost:
        if (r9 == null) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e7, code lost:
        r0 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9.mo116693R());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01f5, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, 0.0d) != false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f7, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f9, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01fc, code lost:
        if (r9 == null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fe, code lost:
        r11 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9.mo116691P());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0207, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0208, code lost:
        if (r9 == null) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x020a, code lost:
        r12 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9.mo116693R());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0214, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0215, code lost:
        if (r10 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0217, code lost:
        r9 = r10.mo116855w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x021b, code lost:
        if (r9 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x021d, code lost:
        r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9.mo116868D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0226, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0227, code lost:
        r18 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x022b, code lost:
        if (r10 == null) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x022d, code lost:
        r9 = r10.mo116855w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0231, code lost:
        if (r9 == null) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0233, code lost:
        r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9.mo116890t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x023c, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x023d, code lost:
        r13 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r18 - com.carrefour.fid.android.shared.extension.C28782t.m119111h(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0247, code lost:
        if (r10 == null) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0249, code lost:
        r16 = r10.mo116822G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0250, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0252, code lost:
        if (r10 == null) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0254, code lost:
        r9 = r10.mo116855w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0258, code lost:
        if (r9 == null) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x025a, code lost:
        r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9.mo116897y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0263, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0264, code lost:
        r5 = r9;
        r7 = r15;
        r9 = new com.carrefour.fid.android.domain.interactors.slot.C37859f.C37860a(r17, r11, r12, r13, r16, kotlin.coroutines.jvm.internal.C11064a.m42618d(com.carrefour.fid.android.shared.extension.C28782t.m119111h(r9)), kotlin.coroutines.jvm.internal.C11064a.m42620f(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x027e, code lost:
        if (r8 == null) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0284, code lost:
        if (r8.mo119182Z() != true) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0287, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0288, code lost:
        if (r6 == false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x028a, code lost:
        if (r0 == false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x028c, code lost:
        r0 = r7.f101663b;
        r2.L$0 = null;
        r2.L$1 = null;
        r2.L$2 = null;
        r2.L$3 = null;
        r2.label = 5;
        r0 = r0.m173113invokegIAlus(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x029e, code lost:
        if (r0 != r3) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02a0, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02a1, code lost:
        r0 = r7.f101662a;
        r4 = new com.carrefour.fid.android.domain.interactors.slot.C37863h(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r17), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r2.L$0 = null;
        r2.L$1 = null;
        r2.L$2 = null;
        r2.L$3 = null;
        r2.label = 6;
        r0 = r0.m173111invokegIAlus(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02bc, code lost:
        if (r0 != r3) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02be, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02bf, code lost:
        r0 = r11.f101662a;
        r4 = new com.carrefour.fid.android.domain.interactors.slot.C37863h(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r9), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r2.L$0 = null;
        r2.L$1 = null;
        r2.L$2 = null;
        r2.label = 7;
        r0 = r0.m173111invokegIAlus(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02d8, code lost:
        if (r0 != r3) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02da, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        return r0.mo21858l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r17 = r9;
        r15 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        if (kotlin.Result.m38710j(r0) == false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r9 = kotlin.Result.f28060a;
        r0 = (kotlin.C11079d2) r0;
        r0 = r8.f101667f;
        r2.L$0 = r8;
        r2.L$1 = r4;
        r2.label = 2;
        r0 = r0.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        if (r0 != r3) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        if (kotlin.Result.m38709i(r0) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (r0 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        r0 = r0.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e8, code lost:
        if (r0 != null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        if (r4.mo115310d().length() != 0) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        if (r9 == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        r0 = kotlin.Result.f28060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        return kotlin.Result.m38702b(kotlin.C11661u0.m45734a(com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r4 = r4.mo115310d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        if (r4.length() != 0) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0110, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0112, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0113, code lost:
        if (r9 == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0115, code lost:
        if (r0 == null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        r4 = r0.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011c, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011d, code lost:
        if (r4 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0121, code lost:
        r4 = com.carrefour.fid.android.shared.extension.C28789y.m119125h(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r9 = r8.f101665d;
        r2.L$0 = r8;
        r2.L$1 = r4;
        r2.L$2 = r0;
        r2.label = 3;
        r9 = r9.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0138, code lost:
        if (r9 != r3) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013b, code lost:
        r11 = r8;
        r8 = r0;
        r0 = r9;
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0143, code lost:
        if (kotlin.Result.m38709i(r0) == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0145, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0146, code lost:
        r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0149, code lost:
        if (r10 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014b, code lost:
        r0 = r10.mo116817B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014f, code lost:
        if (r0 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0151, code lost:
        r0 = r0.iterator();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015c, code lost:
        if (r0.hasNext() == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015e, code lost:
        r4 = r4 + ((com.carrefour.fid.android.domain.models.offer.Offer) r0.next()).mo118012U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016a, code lost:
        r0 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0170, code lost:
        r4 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0174, code lost:
        if (r10 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0176, code lost:
        r0 = r10.mo116826K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017a, code lost:
        if (r0 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017c, code lost:
        r0 = r0.mo116999j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0181, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0182, code lost:
        if (r0 == null) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0184, code lost:
        r0 = r11.f101664c;
        r2.L$0 = r11;
        r2.L$1 = r10;
        r2.L$2 = r9;
        r2.L$3 = r8;
        r2.I$0 = r4;
        r2.label = 4;
        r0 = r0.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0197, code lost:
        if (r0 != r3) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0199, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019e, code lost:
        if (kotlin.Result.m38709i(r0) == false) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a1, code lost:
        r0 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a3, code lost:
        if (r0 == null) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a5, code lost:
        r0 = r0.mo116668v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a9, code lost:
        if (r0 == null) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ab, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A[SYNTHETIC, Splitter:B:10:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173114invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.slot.C37861g.C37862a r23, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            boolean r2 = r0 instanceof com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase$invoke$1 r2 = (com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase$invoke$1 r2 = new com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase$invoke$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x0096;
                case 2: goto L_0x0081;
                case 3: goto L_0x0067;
                case 4: goto L_0x0047;
                case 5: goto L_0x0041;
                case 6: goto L_0x003b;
                case 7: goto L_0x0030;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0030:
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0093 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0093 }
        L_0x0035:
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x0093 }
            goto L_0x02db
        L_0x003b:
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0093 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0093 }
            goto L_0x0035
        L_0x0041:
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0093 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0093 }
            goto L_0x0035
        L_0x0047:
            int r4 = r2.I$0
            java.lang.Object r8 = r2.L$3
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r8
            java.lang.Object r9 = r2.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$1
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase r11 = (com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase) r11
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0093 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x0093 }
        L_0x0062:
            r17 = r9
            r15 = r11
            goto L_0x019a
        L_0x0067:
            java.lang.Object r4 = r2.L$2
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            java.lang.Object r8 = r2.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$0
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase r9 = (com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase) r9
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0093 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x0093 }
            r11 = r9
            r9 = r8
            r8 = r4
            goto L_0x013f
        L_0x0081:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.interactors.slot.g$a r4 = (com.carrefour.fid.android.domain.interactors.slot.C37861g.C37862a) r4
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase r8 = (com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase) r8
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0093 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x0093 }
            goto L_0x00d7
        L_0x0093:
            r0 = move-exception
            goto L_0x02dc
        L_0x0096:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.interactors.slot.g$a r4 = (com.carrefour.fid.android.domain.interactors.slot.C37861g.C37862a) r4
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase r8 = (com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase) r8
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x00bd
        L_0x00a8:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.domain.interactors.user.i r0 = r1.f101666e
            r2.L$0 = r1
            r4 = r23
            r2.L$1 = r4
            r2.label = r6
            java.lang.Object r0 = r0.m172965invokeIoAF18A(r2)
            if (r0 != r3) goto L_0x00bc
            return r3
        L_0x00bc:
            r8 = r1
        L_0x00bd:
            boolean r9 = kotlin.Result.m38710j(r0)
            if (r9 == 0) goto L_0x02e2
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x0093 }
            kotlin.d2 r0 = (kotlin.C11079d2) r0     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.domain.interactors.service.k r0 = r8.f101667f     // Catch:{ all -> 0x0093 }
            r2.L$0 = r8     // Catch:{ all -> 0x0093 }
            r2.L$1 = r4     // Catch:{ all -> 0x0093 }
            r9 = 2
            r2.label = r9     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.m172965invokeIoAF18A(r2)     // Catch:{ all -> 0x0093 }
            if (r0 != r3) goto L_0x00d7
            return r3
        L_0x00d7:
            boolean r9 = kotlin.Result.m38709i(r0)     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x00de
            r0 = 0
        L_0x00de:
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x00e7
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()     // Catch:{ all -> 0x0093 }
            goto L_0x00e8
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            if (r0 != 0) goto L_0x0106
            java.lang.String r9 = r4.mo115310d()     // Catch:{ all -> 0x0093 }
            int r9 = r9.length()     // Catch:{ all -> 0x0093 }
            if (r9 != 0) goto L_0x00f6
            r9 = r6
            goto L_0x00f7
        L_0x00f6:
            r9 = 0
        L_0x00f7:
            if (r9 == 0) goto L_0x0106
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r0 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0093 }
            return r0
        L_0x0106:
            java.lang.String r4 = r4.mo115310d()     // Catch:{ all -> 0x0093 }
            int r9 = r4.length()     // Catch:{ all -> 0x0093 }
            if (r9 != 0) goto L_0x0112
            r9 = r6
            goto L_0x0113
        L_0x0112:
            r9 = 0
        L_0x0113:
            if (r9 == 0) goto L_0x0129
            if (r0 == 0) goto L_0x011c
            java.lang.String r4 = r0.mo119163G()     // Catch:{ all -> 0x0093 }
            goto L_0x011d
        L_0x011c:
            r4 = 0
        L_0x011d:
            if (r4 != 0) goto L_0x0121
            java.lang.String r4 = ""
        L_0x0121:
            java.lang.String r4 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r4)     // Catch:{ all -> 0x0093 }
            java.lang.String r4 = com.carrefour.fid.android.shared.extension.C28789y.m119125h(r4)     // Catch:{ all -> 0x0093 }
        L_0x0129:
            com.carrefour.fid.android.domain.interactors.basket.e0 r9 = r8.f101665d     // Catch:{ all -> 0x0093 }
            r2.L$0 = r8     // Catch:{ all -> 0x0093 }
            r2.L$1 = r4     // Catch:{ all -> 0x0093 }
            r2.L$2 = r0     // Catch:{ all -> 0x0093 }
            r10 = 3
            r2.label = r10     // Catch:{ all -> 0x0093 }
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r2)     // Catch:{ all -> 0x0093 }
            if (r9 != r3) goto L_0x013b
            return r3
        L_0x013b:
            r11 = r8
            r8 = r0
            r0 = r9
            r9 = r4
        L_0x013f:
            boolean r4 = kotlin.Result.m38709i(r0)     // Catch:{ all -> 0x0093 }
            if (r4 == 0) goto L_0x0146
            r0 = 0
        L_0x0146:
            r10 = r0
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0093 }
            if (r10 == 0) goto L_0x016f
            java.util.List r0 = r10.mo116817B()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x016f
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0093 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0093 }
            r4 = 0
        L_0x0158:
            boolean r12 = r0.hasNext()     // Catch:{ all -> 0x0093 }
            if (r12 == 0) goto L_0x016a
            java.lang.Object r12 = r0.next()     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.domain.models.offer.Offer r12 = (com.carrefour.fid.android.domain.models.offer.Offer) r12     // Catch:{ all -> 0x0093 }
            int r12 = r12.mo118012U()     // Catch:{ all -> 0x0093 }
            int r4 = r4 + r12
            goto L_0x0158
        L_0x016a:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r4)     // Catch:{ all -> 0x0093 }
            goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            int r4 = com.carrefour.fid.android.shared.extension.C28746b0.m119036g(r0)     // Catch:{ all -> 0x0093 }
            if (r10 == 0) goto L_0x0181
            com.carrefour.fid.android.domain.models.basket.BasketSlot r0 = r10.mo116826K()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = r0.mo116999j()     // Catch:{ all -> 0x0093 }
            goto L_0x0182
        L_0x0181:
            r0 = 0
        L_0x0182:
            if (r0 == 0) goto L_0x02bf
            com.carrefour.fid.android.domain.interactors.user.d r0 = r11.f101664c     // Catch:{ all -> 0x0093 }
            r2.L$0 = r11     // Catch:{ all -> 0x0093 }
            r2.L$1 = r10     // Catch:{ all -> 0x0093 }
            r2.L$2 = r9     // Catch:{ all -> 0x0093 }
            r2.L$3 = r8     // Catch:{ all -> 0x0093 }
            r2.I$0 = r4     // Catch:{ all -> 0x0093 }
            r12 = 4
            r2.label = r12     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.m172965invokeIoAF18A(r2)     // Catch:{ all -> 0x0093 }
            if (r0 != r3) goto L_0x0062
            return r3
        L_0x019a:
            boolean r9 = kotlin.Result.m38709i(r0)     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x01a1
            r0 = 0
        L_0x01a1:
            com.carrefour.fid.android.domain.models.account.AccountInfo r0 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r0     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x01d0
            java.util.List r0 = r0.mo116668v()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x01d0
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0093 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0093 }
        L_0x01b1:
            boolean r9 = r0.hasNext()     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x01cc
            java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x0093 }
            r11 = r9
            com.carrefour.fid.android.domain.models.account.Address r11 = (com.carrefour.fid.android.domain.models.account.Address) r11     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.domain.models.AddressCategory r11 = r11.mo116683H()     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.domain.models.AddressCategory r12 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY     // Catch:{ all -> 0x0093 }
            if (r11 != r12) goto L_0x01c8
            r11 = r6
            goto L_0x01c9
        L_0x01c8:
            r11 = 0
        L_0x01c9:
            if (r11 == 0) goto L_0x01b1
            goto L_0x01cd
        L_0x01cc:
            r9 = 0
        L_0x01cd:
            com.carrefour.fid.android.domain.models.account.Address r9 = (com.carrefour.fid.android.domain.models.account.Address) r9     // Catch:{ all -> 0x0093 }
            goto L_0x01d1
        L_0x01d0:
            r9 = 0
        L_0x01d1:
            if (r9 == 0) goto L_0x01dc
            double r11 = r9.mo116691P()     // Catch:{ all -> 0x0093 }
            java.lang.Double r0 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r11)     // Catch:{ all -> 0x0093 }
            goto L_0x01dd
        L_0x01dc:
            r0 = 0
        L_0x01dd:
            r11 = 0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Double) r0, (double) r11)     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x01f9
            if (r9 == 0) goto L_0x01f0
            double r13 = r9.mo116693R()     // Catch:{ all -> 0x0093 }
            java.lang.Double r0 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r13)     // Catch:{ all -> 0x0093 }
            goto L_0x01f1
        L_0x01f0:
            r0 = 0
        L_0x01f1:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Double) r0, (double) r11)     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x01f9
            r0 = r6
            goto L_0x01fa
        L_0x01f9:
            r0 = 0
        L_0x01fa:
            com.carrefour.fid.android.domain.interactors.slot.f$a r14 = new com.carrefour.fid.android.domain.interactors.slot.f$a     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x0207
            double r11 = r9.mo116691P()     // Catch:{ all -> 0x0093 }
            java.lang.Double r11 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r11)     // Catch:{ all -> 0x0093 }
            goto L_0x0208
        L_0x0207:
            r11 = 0
        L_0x0208:
            if (r9 == 0) goto L_0x0214
            double r12 = r9.mo116693R()     // Catch:{ all -> 0x0093 }
            java.lang.Double r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r12)     // Catch:{ all -> 0x0093 }
            r12 = r9
            goto L_0x0215
        L_0x0214:
            r12 = 0
        L_0x0215:
            if (r10 == 0) goto L_0x0226
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r9 = r10.mo116855w()     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x0226
            double r18 = r9.mo116868D()     // Catch:{ all -> 0x0093 }
            java.lang.Double r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r18)     // Catch:{ all -> 0x0093 }
            goto L_0x0227
        L_0x0226:
            r9 = 0
        L_0x0227:
            double r18 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r9)     // Catch:{ all -> 0x0093 }
            if (r10 == 0) goto L_0x023c
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r9 = r10.mo116855w()     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x023c
            double r20 = r9.mo116890t()     // Catch:{ all -> 0x0093 }
            java.lang.Double r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r20)     // Catch:{ all -> 0x0093 }
            goto L_0x023d
        L_0x023c:
            r9 = 0
        L_0x023d:
            double r20 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r9)     // Catch:{ all -> 0x0093 }
            double r18 = r18 - r20
            java.lang.Double r13 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r18)     // Catch:{ all -> 0x0093 }
            if (r10 == 0) goto L_0x0250
            java.lang.String r9 = r10.mo116822G()     // Catch:{ all -> 0x0093 }
            r16 = r9
            goto L_0x0252
        L_0x0250:
            r16 = 0
        L_0x0252:
            if (r10 == 0) goto L_0x0263
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r9 = r10.mo116855w()     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x0263
            double r9 = r9.mo116897y()     // Catch:{ all -> 0x0093 }
            java.lang.Double r9 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9)     // Catch:{ all -> 0x0093 }
            goto L_0x0264
        L_0x0263:
            r9 = 0
        L_0x0264:
            double r9 = com.carrefour.fid.android.shared.extension.C28782t.m119111h(r9)     // Catch:{ all -> 0x0093 }
            java.lang.Double r18 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r9)     // Catch:{ all -> 0x0093 }
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r4)     // Catch:{ all -> 0x0093 }
            r9 = r14
            r10 = r17
            r5 = r14
            r14 = r16
            r7 = r15
            r15 = r18
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x0287
            boolean r4 = r8.mo119182Z()     // Catch:{ all -> 0x0093 }
            if (r4 != r6) goto L_0x0287
            goto L_0x0288
        L_0x0287:
            r6 = 0
        L_0x0288:
            if (r6 == 0) goto L_0x02a1
            if (r0 == 0) goto L_0x02a1
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase r0 = r7.f101663b     // Catch:{ all -> 0x0093 }
            r4 = 0
            r2.L$0 = r4     // Catch:{ all -> 0x0093 }
            r2.L$1 = r4     // Catch:{ all -> 0x0093 }
            r2.L$2 = r4     // Catch:{ all -> 0x0093 }
            r2.L$3 = r4     // Catch:{ all -> 0x0093 }
            r4 = 5
            r2.label = r4     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.m173113invokegIAlus(r5, r2)     // Catch:{ all -> 0x0093 }
            if (r0 != r3) goto L_0x02db
            return r3
        L_0x02a1:
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase r0 = r7.f101662a     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.domain.interactors.slot.h r4 = new com.carrefour.fid.android.domain.interactors.slot.h     // Catch:{ all -> 0x0093 }
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r17)     // Catch:{ all -> 0x0093 }
            r6 = 0
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0093 }
            r2.L$0 = r6     // Catch:{ all -> 0x0093 }
            r2.L$1 = r6     // Catch:{ all -> 0x0093 }
            r2.L$2 = r6     // Catch:{ all -> 0x0093 }
            r2.L$3 = r6     // Catch:{ all -> 0x0093 }
            r5 = 6
            r2.label = r5     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.m173111invokegIAlus(r4, r2)     // Catch:{ all -> 0x0093 }
            if (r0 != r3) goto L_0x02db
            return r3
        L_0x02bf:
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase r0 = r11.f101662a     // Catch:{ all -> 0x0093 }
            com.carrefour.fid.android.domain.interactors.slot.h r4 = new com.carrefour.fid.android.domain.interactors.slot.h     // Catch:{ all -> 0x0093 }
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r9)     // Catch:{ all -> 0x0093 }
            r6 = 0
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0093 }
            r2.L$0 = r6     // Catch:{ all -> 0x0093 }
            r2.L$1 = r6     // Catch:{ all -> 0x0093 }
            r2.L$2 = r6     // Catch:{ all -> 0x0093 }
            r5 = 7
            r2.label = r5     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.m173111invokegIAlus(r4, r2)     // Catch:{ all -> 0x0093 }
            if (r0 != r3) goto L_0x02db
            return r3
        L_0x02db:
            return r0
        L_0x02dc:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
        L_0x02e2:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase.m173114invokegIAlus(com.carrefour.fid.android.domain.interactors.slot.g$a, kotlin.coroutines.c):java.lang.Object");
    }
}
