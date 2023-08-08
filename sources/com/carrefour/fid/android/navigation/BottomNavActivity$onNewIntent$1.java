package com.carrefour.fid.android.navigation;

import android.content.Intent;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.navigation.BottomNavActivity$onNewIntent$1", mo22502f = "BottomNavActivity.kt", mo22503i = {0, 3}, mo22504l = {302, 339, 408, 423, 430, 432, 466, 472, 473, 480, 542}, mo22505m = "invokeSuspend", mo22506n = {"uri", "uri"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BottomNavActivity$onNewIntent$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Intent $intent;
    Object L$0;
    int label;
    final /* synthetic */ BottomNavActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavActivity$onNewIntent$1(BottomNavActivity bottomNavActivity, Intent intent, C11045c<? super BottomNavActivity$onNewIntent$1> cVar) {
        super(2, cVar);
        this.this$0 = bottomNavActivity;
        this.$intent = intent;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BottomNavActivity$onNewIntent$1(this.this$0, this.$intent, cVar);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [kotlin.d2] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024d, code lost:
        if (((java.lang.Boolean) r2).booleanValue() == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x024f, code lost:
        r1 = r0.this$0.f97030f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0255, code lost:
        if (r1 != null) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0257, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("_navController");
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025b, code lost:
        r1.mo58152q0();
        r1 = r0.this$0.f97030f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0264, code lost:
        if (r1 != null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0266, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("_navController");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026a, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026b, code lost:
        r8.mo58128V(com.carrefour.fid.android.R.id.loyalty_card_graph);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0272, code lost:
        r0.this$0.mo121121X1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0279, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x043d, code lost:
        r2 = (com.carrefour.fid.android.domain.models.catalog.C37976a) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0441, code lost:
        if ((r2 instanceof com.carrefour.fid.android.domain.models.catalog.C37979d) == false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0443, code lost:
        r1 = r0.this$0.f97030f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0449, code lost:
        if (r1 != null) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x044b, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("_navController");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x044f, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0450, code lost:
        r8.mo58152q0();
        r0.this$0.mo121116S1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x045b, code lost:
        if ((r2 instanceof com.carrefour.fid.android.domain.models.catalog.C37986e) == false) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x045d, code lost:
        r0.this$0.mo121136o2(((com.carrefour.fid.android.domain.models.catalog.C37986e) r2).mo117204d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x046a, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x048c, code lost:
        r3 = (com.carrefour.fid.android.domain.models.catalog.C37976a) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0490, code lost:
        if ((r3 instanceof com.carrefour.fid.android.domain.models.catalog.C37979d) == false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0492, code lost:
        r3 = r2.getQueryParameter("id_catalog");
        r2 = r2.getQueryParameter("ean_product");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x049e, code lost:
        if (r3 == null) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04a4, code lost:
        if (r3.length() != 0) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04a7, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04a9, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04aa, code lost:
        if (r4 != false) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04ac, code lost:
        if (r2 == null) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04b2, code lost:
        if (r2.length() != 0) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04b4, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04b5, code lost:
        if (r5 != false) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04b7, code lost:
        r4 = r0.this$0.mo121093F1();
        r0.L$0 = null;
        r0.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04c6, code lost:
        if (r4.mo76829t0(r3, r2, r0) != r1) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04c8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04c9, code lost:
        r2 = r0.this$0.mo121093F1();
        r0.L$0 = null;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d8, code lost:
        if (r2.mo76827s0(r3, r0) != r1) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04da, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04dd, code lost:
        if ((r3 instanceof com.carrefour.fid.android.domain.models.catalog.C37986e) == false) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04df, code lost:
        r0.this$0.mo121136o2(((com.carrefour.fid.android.domain.models.catalog.C37986e) r3).mo117204d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04ec, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05cd, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0608, code lost:
        r1 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0634, code lost:
        r1 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0638, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0664, code lost:
        if (((java.lang.Boolean) r2).booleanValue() == false) goto L_0x0679;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0666, code lost:
        r1 = r0.this$0.f97030f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x066c, code lost:
        if (r1 != null) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x066e, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("_navController");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0672, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0673, code lost:
        r8.mo58128V(com.carrefour.fid.android.R.id.loyalty_prime_fid_graph);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x067b, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0737, code lost:
        if (r2 == null) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0739, code lost:
        r4 = r2.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x073e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x074c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0.this$0.getString(com.carrefour.fid.android.R.string.onelink_path_account)) == false) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x074e, code lost:
        r0.this$0.mo121109N1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0762, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0.this$0.getString(com.carrefour.fid.android.R.string.onelink_path_login)) == false) goto L_0x0781;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x076a, code lost:
        if (r0.this$0.mo121132i2() != false) goto L_0x077b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x076c, code lost:
        com.carrefour.fid.android.app.extensions.C13825a.m58795x(r0.this$0, false, 0, 0, 0, (android.os.Bundle) null, 30, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x077b, code lost:
        r0.this$0.mo121109N1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x078e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0.this$0.getString(com.carrefour.fid.android.R.string.onelink_path_lists)) == false) goto L_0x0796;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0790, code lost:
        r0.this$0.mo121118U1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07a3, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0.this$0.getString(com.carrefour.fid.android.R.string.onelink_path_loyalty)) == false) goto L_0x07ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07a5, code lost:
        r0.this$0.mo121121X1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07b8, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0.this$0.getString(com.carrefour.fid.android.R.string.onelink_path_store)) == false) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x07ba, code lost:
        r0.this$0.mo121123Z1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x07cd, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0.this$0.getString(com.carrefour.fid.android.R.string.onelink_path_sign_up)) == false) goto L_0x07dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07cf, code lost:
        com.carrefour.fid.android.app.extensions.C13825a.m58795x(r0.this$0, false, 0, 0, 0, (android.os.Bundle) null, 30, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x07dd, code lost:
        if (r2 == null) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07df, code lost:
        r4 = r2.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x07e3, code lost:
        if (r4 == null) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07e5, code lost:
        r7 = r0.this$0.getString(com.carrefour.fid.android.R.string.applink_parameter_pdp);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "getString(R.string.applink_parameter_pdp)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x07f7, code lost:
        if (kotlin.text.C11622t.startsWith$default(r4, r7, false, 2, (java.lang.Object) null) != true) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x07f9, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07fa, code lost:
        if (r5 == false) goto L_0x0818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07fc, code lost:
        r2 = com.carrefour.fid.android.utils.C22720o.m102888a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0800, code lost:
        if (r2 == null) goto L_0x0813;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0802, code lost:
        r3 = r0.this$0;
        r0.L$0 = null;
        r0.label = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x080e, code lost:
        if (r3.mo121134l2(r2, r0) != r1) goto L_0x0811;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0810, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0811, code lost:
        r8 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0813, code lost:
        if (r8 != null) goto L_0x0818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0817, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x081a, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0138, code lost:
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        r9 = r0.this$0.f97030f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        if (r9 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("_navController");
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        r9.mo58152q0();
        r9 = r0.this$0.f97030f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014f, code lost:
        if (r9 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0151, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("_navController");
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0155, code lost:
        r9.mo58128V(com.carrefour.fid.android.R.id.coupons_graph);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        r0.this$0.mo121121X1();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05f5  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x060b  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 2131362730(0x7f0a03aa, float:1.8345249E38)
            r5 = 0
            r6 = 1
            java.lang.String r7 = "_navController"
            r8 = 0
            switch(r2) {
                case 0: goto L_0x0060;
                case 1: goto L_0x0055;
                case 2: goto L_0x004e;
                case 3: goto L_0x0047;
                case 4: goto L_0x003c;
                case 5: goto L_0x0037;
                case 6: goto L_0x0037;
                case 7: goto L_0x0032;
                case 8: goto L_0x002d;
                case 9: goto L_0x0028;
                case 10: goto L_0x0021;
                case 11: goto L_0x001c;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001c:
            kotlin.C11661u0.m45747n(r21)
            goto L_0x0811
        L_0x0021:
            kotlin.C11661u0.m45747n(r21)
            r2 = r21
            goto L_0x065e
        L_0x0028:
            kotlin.C11661u0.m45747n(r21)
            goto L_0x0634
        L_0x002d:
            kotlin.C11661u0.m45747n(r21)
            goto L_0x0608
        L_0x0032:
            kotlin.C11661u0.m45747n(r21)
            goto L_0x05cb
        L_0x0037:
            kotlin.C11661u0.m45747n(r21)
            goto L_0x04ea
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            android.net.Uri r2 = (android.net.Uri) r2
            kotlin.C11661u0.m45747n(r21)
            r3 = r21
            goto L_0x048c
        L_0x0047:
            kotlin.C11661u0.m45747n(r21)
            r2 = r21
            goto L_0x043d
        L_0x004e:
            kotlin.C11661u0.m45747n(r21)
            r2 = r21
            goto L_0x0247
        L_0x0055:
            java.lang.Object r2 = r0.L$0
            android.net.Uri r2 = (android.net.Uri) r2
            kotlin.C11661u0.m45747n(r21)
            r9 = r21
            goto L_0x0132
        L_0x0060:
            kotlin.C11661u0.m45747n(r21)
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            android.content.Intent r9 = r0.$intent
            boolean r2 = r2.mo121131h2(r9)
            if (r2 == 0) goto L_0x0070
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0070:
            android.content.Intent r2 = r0.$intent
            android.net.Uri r2 = r2.getData()
            if (r2 == 0) goto L_0x0087
            java.lang.String r9 = r2.getQuery()
            if (r9 == 0) goto L_0x0087
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            com.carrefour.fid.android.analytics.data.analytics.a r10 = r10.mo121147y1()
            r10.mo32709l(r9)
        L_0x0087:
            if (r2 == 0) goto L_0x008e
            java.lang.String r9 = r2.getHost()
            goto L_0x008f
        L_0x008e:
            r9 = r8
        L_0x008f:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952559(0x7f1303af, float:1.9541564E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00a6
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121120W1()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00a6:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952555(0x7f1303ab, float:1.9541556E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00b7
            r10 = r6
            goto L_0x00c4
        L_0x00b7:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952581(0x7f1303c5, float:1.9541609E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
        L_0x00c4:
            if (r10 == 0) goto L_0x00e4
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            boolean r1 = r1.mo121132i2()
            if (r1 == 0) goto L_0x00d4
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121109N1()
            goto L_0x00e1
        L_0x00d4:
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 30
            r9 = 0
            com.carrefour.fid.android.app.extensions.C13825a.m58795x(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00e1:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00e4:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952548(0x7f1303a4, float:1.9541542E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00fb
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121109N1()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00fb:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952549(0x7f1303a5, float:1.9541544E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0112
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121121X1()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0112:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952554(0x7f1303aa, float:1.9541554E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0161
            com.carrefour.fid.android.navigation.BottomNavActivity r9 = r0.this$0
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r9 = r9.mo121097H1()
            r0.L$0 = r2
            r0.label = r6
            java.lang.Object r9 = r9.hasLoyaltyCard(r0)
            if (r9 != r1) goto L_0x0132
            return r1
        L_0x0132:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x015a
            com.carrefour.fid.android.navigation.BottomNavActivity r9 = r0.this$0
            androidx.navigation.NavController r9 = r9.f97030f1
            if (r9 != 0) goto L_0x0146
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r9 = r8
        L_0x0146:
            r9.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r9 = r0.this$0
            androidx.navigation.NavController r9 = r9.f97030f1
            if (r9 != 0) goto L_0x0155
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r9 = r8
        L_0x0155:
            r9.mo58128V(r4)
            goto L_0x0737
        L_0x015a:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r4.mo121121X1()
            goto L_0x0737
        L_0x0161:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952556(0x7f1303ac, float:1.9541558E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0178
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121121X1()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0178:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952557(0x7f1303ad, float:1.954156E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x018f
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121121X1()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x018f:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952563(0x7f1303b3, float:1.9541572E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            r11 = 2131361886(0x7f0a005e, float:1.8343537E38)
            if (r10 == 0) goto L_0x01c3
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x01ad
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x01ad:
            r1.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x01bc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x01bd
        L_0x01bc:
            r8 = r1
        L_0x01bd:
            r8.mo58128V(r11)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x01c3:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952558(0x7f1303ae, float:1.9541562E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x01e5
            com.carrefour.fid.android.navigation.BottomNavActivity r12 = r0.this$0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 30
            r19 = 0
            com.carrefour.fid.android.app.extensions.C13825a.m58795x(r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x01e5:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952564(0x7f1303b4, float:1.9541574E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0212
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            boolean r1 = r1.mo121132i2()
            if (r1 != 0) goto L_0x020a
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 30
            r9 = 0
            com.carrefour.fid.android.app.extensions.C13825a.m58795x(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x020f
        L_0x020a:
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121109N1()
        L_0x020f:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0212:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952579(0x7f1303c3, float:1.9541605E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0229
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121123Z1()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0229:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952550(0x7f1303a6, float:1.9541546E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x027a
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r2 = r2.mo121097H1()
            r0.label = r3
            java.lang.Object r2 = r2.hasLoyaltyCard(r0)
            if (r2 != r1) goto L_0x0247
            return r1
        L_0x0247:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L_0x0272
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x025b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x025b:
            r1.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x026a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x026b
        L_0x026a:
            r8 = r1
        L_0x026b:
            r1 = 2131363375(0x7f0a062f, float:1.8346557E38)
            r8.mo58128V(r1)
            goto L_0x0277
        L_0x0272:
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121121X1()
        L_0x0277:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x027a:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952580(0x7f1303c4, float:1.9541607E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x02ae
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x0295
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x0295:
            r1.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x02a4
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x02a5
        L_0x02a4:
            r8 = r1
        L_0x02a5:
            r1 = 2131364290(0x7f0a09c2, float:1.8348413E38)
            r8.mo58128V(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x02ae:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952576(0x7f1303c0, float:1.9541599E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            r12 = 2131362879(0x7f0a043f, float:1.8345551E38)
            if (r10 == 0) goto L_0x02e2
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x02cc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x02cc:
            r1.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x02db
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x02dc
        L_0x02db:
            r8 = r1
        L_0x02dc:
            r8.mo58128V(r12)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x02e2:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r13 = 2131952578(0x7f1303c2, float:1.9541603E38)
            java.lang.String r10 = r10.getString(r13)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x031c
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x02fd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x02fd:
            r1.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x030c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x030d
        L_0x030c:
            r8 = r1
        L_0x030d:
            com.carrefour.fid.android.ecosystem.ui.fragment.a r1 = new com.carrefour.fid.android.ecosystem.ui.fragment.a
            r1.<init>(r6)
            android.os.Bundle r1 = r1.mo119667f()
            r8.mo58130W(r12, r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x031c:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952577(0x7f1303c1, float:1.95416E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0333
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121119V1()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0333:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952561(0x7f1303b1, float:1.9541568E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0365
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            androidx.navigation.NavController r4 = r4.f97030f1
            if (r4 != 0) goto L_0x034e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r4 = r8
        L_0x034e:
            r4.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            androidx.navigation.NavController r4 = r4.f97030f1
            if (r4 != 0) goto L_0x035d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r4 = r8
        L_0x035d:
            r7 = 2131363296(0x7f0a05e0, float:1.8346397E38)
            r4.mo58128V(r7)
            goto L_0x0737
        L_0x0365:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952566(0x7f1303b6, float:1.9541578E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x037c
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121118U1()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x037c:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952572(0x7f1303bc, float:1.954159E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0393
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121126c2()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0393:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952568(0x7f1303b8, float:1.9541582E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x03b8
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            boolean r1 = r1.mo121132i2()
            if (r1 == 0) goto L_0x03b0
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121113P1()
            goto L_0x03b5
        L_0x03b0:
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121118U1()
        L_0x03b5:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x03b8:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952553(0x7f1303a9, float:1.9541552E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x03dd
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            boolean r1 = r1.mo121132i2()
            if (r1 == 0) goto L_0x03d5
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121122Y1()
            goto L_0x03da
        L_0x03d5:
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121109N1()
        L_0x03da:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x03dd:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r12 = 2131952562(0x7f1303b2, float:1.954157E38)
            java.lang.String r10 = r10.getString(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x041e
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x03f8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x03f8:
            r1.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x0407
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x0408
        L_0x0407:
            r8 = r1
        L_0x0408:
            com.carrefour.fid.android.presentation.ui.account.list.a r7 = new com.carrefour.fid.android.presentation.ui.account.list.a
            r2 = 0
            com.carrefour.fid.android.core.type.AccountListType$Shopping r3 = com.carrefour.fid.android.core.type.AccountListType.Shopping.f89774d
            r4 = 0
            r5 = 5
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            android.os.Bundle r1 = r7.mo67491j()
            r8.mo58130W(r11, r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x041e:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952552(0x7f1303a8, float:1.954155E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x046b
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r2 = r2.mo121093F1()
            r3 = 3
            r0.label = r3
            java.lang.Object r2 = r2.mo76823F0(r0)
            if (r2 != r1) goto L_0x043d
            return r1
        L_0x043d:
            com.carrefour.fid.android.domain.models.catalog.a r2 = (com.carrefour.fid.android.domain.models.catalog.C37976a) r2
            boolean r1 = r2 instanceof com.carrefour.fid.android.domain.models.catalog.C37979d
            if (r1 == 0) goto L_0x0459
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x044f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x0450
        L_0x044f:
            r8 = r1
        L_0x0450:
            r8.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121116S1()
            goto L_0x0468
        L_0x0459:
            boolean r1 = r2 instanceof com.carrefour.fid.android.domain.models.catalog.C37986e
            if (r1 == 0) goto L_0x0468
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            com.carrefour.fid.android.domain.models.catalog.e r2 = (com.carrefour.fid.android.domain.models.catalog.C37986e) r2
            java.lang.String r2 = r2.mo117204d()
            r1.mo121136o2(r2)
        L_0x0468:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x046b:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952551(0x7f1303a7, float:1.9541548E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x04ed
            com.carrefour.fid.android.navigation.BottomNavActivity r3 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r3 = r3.mo121093F1()
            r0.L$0 = r2
            r4 = 4
            r0.label = r4
            java.lang.Object r3 = r3.mo76823F0(r0)
            if (r3 != r1) goto L_0x048c
            return r1
        L_0x048c:
            com.carrefour.fid.android.domain.models.catalog.a r3 = (com.carrefour.fid.android.domain.models.catalog.C37976a) r3
            boolean r4 = r3 instanceof com.carrefour.fid.android.domain.models.catalog.C37979d
            if (r4 == 0) goto L_0x04db
            java.lang.String r3 = "id_catalog"
            java.lang.String r3 = r2.getQueryParameter(r3)
            java.lang.String r4 = "ean_product"
            java.lang.String r2 = r2.getQueryParameter(r4)
            if (r3 == 0) goto L_0x04a9
            int r4 = r3.length()
            if (r4 != 0) goto L_0x04a7
            goto L_0x04a9
        L_0x04a7:
            r4 = r5
            goto L_0x04aa
        L_0x04a9:
            r4 = r6
        L_0x04aa:
            if (r4 != 0) goto L_0x04ea
            if (r2 == 0) goto L_0x04b4
            int r4 = r2.length()
            if (r4 != 0) goto L_0x04b5
        L_0x04b4:
            r5 = r6
        L_0x04b5:
            if (r5 != 0) goto L_0x04c9
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r4 = r4.mo121093F1()
            r0.L$0 = r8
            r5 = 5
            r0.label = r5
            java.lang.Object r2 = r4.mo76829t0(r3, r2, r0)
            if (r2 != r1) goto L_0x04ea
            return r1
        L_0x04c9:
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r2 = r2.mo121093F1()
            r0.L$0 = r8
            r4 = 6
            r0.label = r4
            java.lang.Object r2 = r2.mo76827s0(r3, r0)
            if (r2 != r1) goto L_0x04ea
            return r1
        L_0x04db:
            boolean r1 = r3 instanceof com.carrefour.fid.android.domain.models.catalog.C37986e
            if (r1 == 0) goto L_0x04ea
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            com.carrefour.fid.android.domain.models.catalog.e r3 = (com.carrefour.fid.android.domain.models.catalog.C37986e) r3
            java.lang.String r2 = r3.mo117204d()
            r1.mo121136o2(r2)
        L_0x04ea:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x04ed:
            com.carrefour.fid.android.navigation.BottomNavActivity r10 = r0.this$0
            r11 = 2131952574(0x7f1303be, float:1.9541595E38)
            java.lang.String r10 = r10.getString(r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x051e
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x0508
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x0508:
            r1.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x0517
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x0518
        L_0x0517:
            r8 = r1
        L_0x0518:
            r8.mo58128V(r4)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x051e:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r10 = 2131952560(0x7f1303b0, float:1.9541566E38)
            java.lang.String r4 = r4.getString(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0563
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            boolean r1 = r1.mo121132i2()
            if (r1 == 0) goto L_0x054e
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            r1.mo121109N1()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x0546
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x0547
        L_0x0546:
            r8 = r1
        L_0x0547:
            r1 = 2131363442(0x7f0a0672, float:1.8346693E38)
            r8.mo58128V(r1)
            goto L_0x0560
        L_0x054e:
            com.carrefour.fid.android.navigation.BottomNavActivity r9 = r0.this$0
            r10 = 0
            r11 = 2130772018(0x7f010032, float:1.7147143E38)
            r12 = 2130772012(0x7f01002c, float:1.714713E38)
            r13 = 0
            r14 = 0
            r15 = 24
            r16 = 0
            com.carrefour.fid.android.app.extensions.C13825a.m58795x(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0560:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0563:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r10 = 2131952565(0x7f1303b5, float:1.9541576E38)
            java.lang.String r4 = r4.getString(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            r11 = 2131361877(0x7f0a0055, float:1.8343519E38)
            if (r4 == 0) goto L_0x0597
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x0581
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x0582
        L_0x0581:
            r8 = r1
        L_0x0582:
            com.carrefour.fid.android.presentation.ui.account.consent.j r1 = new com.carrefour.fid.android.presentation.ui.account.consent.j
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            java.lang.String r2 = r2.getString(r10)
            r1.<init>(r2)
            android.os.Bundle r1 = r1.mo67438f()
            r8.mo58130W(r11, r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0597:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r10 = 2131952573(0x7f1303bd, float:1.9541593E38)
            java.lang.String r4 = r4.getString(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x05ce
            java.lang.String r3 = "ref"
            java.lang.String r4 = r2.getQueryParameter(r3)
            if (r4 == 0) goto L_0x05b4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x05b5
        L_0x05b4:
            r5 = r6
        L_0x05b5:
            if (r5 != 0) goto L_0x05cb
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r4 = r4.mo121093F1()
            java.lang.String r2 = r2.getQueryParameter(r3)
            r3 = 7
            r0.label = r3
            java.lang.Object r2 = r4.mo76830u0(r2, r0)
            if (r2 != r1) goto L_0x05cb
            return r1
        L_0x05cb:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x05ce:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r10 = 2131952571(0x7f1303bb, float:1.9541589E38)
            java.lang.String r4 = r4.getString(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0639
            java.lang.String r3 = "ean"
            java.lang.String r4 = r2.getQueryParameter(r3)
            if (r4 == 0) goto L_0x05f2
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x05ed
            r4 = r6
            goto L_0x05ee
        L_0x05ed:
            r4 = r5
        L_0x05ee:
            if (r4 != r6) goto L_0x05f2
            r4 = r6
            goto L_0x05f3
        L_0x05f2:
            r4 = r5
        L_0x05f3:
            if (r4 == 0) goto L_0x060b
            java.lang.String r2 = r2.getQueryParameter(r3)
            if (r2 == 0) goto L_0x0636
            com.carrefour.fid.android.navigation.BottomNavActivity r3 = r0.this$0
            r4 = 8
            r0.label = r4
            java.lang.Object r2 = r3.mo121134l2(r2, r0)
            if (r2 != r1) goto L_0x0608
            return r1
        L_0x0608:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            goto L_0x0636
        L_0x060b:
            java.lang.String r3 = "product_ean"
            java.lang.String r4 = r2.getQueryParameter(r3)
            if (r4 == 0) goto L_0x061f
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x061b
            r4 = r6
            goto L_0x061c
        L_0x061b:
            r4 = r5
        L_0x061c:
            if (r4 != r6) goto L_0x061f
            r5 = r6
        L_0x061f:
            if (r5 == 0) goto L_0x0636
            java.lang.String r2 = r2.getQueryParameter(r3)
            if (r2 == 0) goto L_0x0636
            com.carrefour.fid.android.navigation.BottomNavActivity r3 = r0.this$0
            r4 = 9
            r0.label = r4
            java.lang.Object r2 = r3.mo121134l2(r2, r0)
            if (r2 != r1) goto L_0x0634
            return r1
        L_0x0634:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
        L_0x0636:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0639:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r10 = 2131952570(0x7f1303ba, float:1.9541586E38)
            java.lang.String r4 = r4.getString(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x067c
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            r2.mo121121X1()
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r2 = r2.mo121097H1()
            r3 = 10
            r0.label = r3
            java.lang.Object r2 = r2.hasLoyaltyCard(r0)
            if (r2 != r1) goto L_0x065e
            return r1
        L_0x065e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L_0x0679
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x0672
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x0673
        L_0x0672:
            r8 = r1
        L_0x0673:
            r1 = 2131363390(0x7f0a063e, float:1.8346587E38)
            r8.mo58128V(r1)
        L_0x0679:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x067c:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r10 = 2131952575(0x7f1303bf, float:1.9541597E38)
            java.lang.String r4 = r4.getString(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0693
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            com.carrefour.fid.android.app.extensions.C13825a.m58783l(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0693:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r10 = 2131952569(0x7f1303b9, float:1.9541584E38)
            java.lang.String r4 = r4.getString(r10)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x06d3
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x06ae
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r1 = r8
        L_0x06ae:
            r1.mo58152q0()
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            androidx.navigation.NavController r1 = r1.f97030f1
            if (r1 != 0) goto L_0x06bd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            goto L_0x06be
        L_0x06bd:
            r8 = r1
        L_0x06be:
            com.carrefour.fid.android.presentation.ui.account.consent.j r1 = new com.carrefour.fid.android.presentation.ui.account.consent.j
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            java.lang.String r2 = r2.getString(r10)
            r1.<init>(r2)
            android.os.Bundle r1 = r1.mo67438f()
            r8.mo58130W(r11, r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x06d3:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r7 = 2131952567(0x7f1303b7, float:1.954158E38)
            java.lang.String r4 = r4.getString(r7)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x06f7
            java.lang.String r1 = com.carrefour.fid.android.utils.C22720o.m102889b(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x06ed
            r5 = r6
        L_0x06ed:
            if (r5 == 0) goto L_0x06f4
            com.carrefour.fid.android.navigation.BottomNavActivity r2 = r0.this$0
            r2.mo121125b2(r1)
        L_0x06f4:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x06f7:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r7 = 2131952582(0x7f1303c6, float:1.954161E38)
            java.lang.String r4 = r4.getString(r7)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0712
            com.carrefour.fid.android.navigation.BottomNavActivity r1 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r1 = r1.mo121093F1()
            r1.mo76826r0()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0712:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r7 = 2131951933(0x7f13013d, float:1.9540294E38)
            java.lang.String r4 = r4.getString(r7)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0723
            r4 = r6
            goto L_0x0730
        L_0x0723:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r7 = 2131951934(0x7f13013e, float:1.9540297E38)
            java.lang.String r4 = r4.getString(r7)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r4)
        L_0x0730:
            if (r4 == 0) goto L_0x0737
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r4.mo121135m2(r2)
        L_0x0737:
            if (r2 == 0) goto L_0x073e
            java.lang.String r4 = r2.getPath()
            goto L_0x073f
        L_0x073e:
            r4 = r8
        L_0x073f:
            com.carrefour.fid.android.navigation.BottomNavActivity r7 = r0.this$0
            r9 = 2131953256(0x7f130668, float:1.9542978E38)
            java.lang.String r7 = r7.getString(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0755
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r4.mo121109N1()
            goto L_0x07dd
        L_0x0755:
            com.carrefour.fid.android.navigation.BottomNavActivity r7 = r0.this$0
            r9 = 2131953258(0x7f13066a, float:1.9542982E38)
            java.lang.String r7 = r7.getString(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0781
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            boolean r4 = r4.mo121132i2()
            if (r4 != 0) goto L_0x077b
            com.carrefour.fid.android.navigation.BottomNavActivity r9 = r0.this$0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 30
            r16 = 0
            com.carrefour.fid.android.app.extensions.C13825a.m58795x(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x07dd
        L_0x077b:
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r4.mo121109N1()
            goto L_0x07dd
        L_0x0781:
            com.carrefour.fid.android.navigation.BottomNavActivity r7 = r0.this$0
            r9 = 2131953257(0x7f130669, float:1.954298E38)
            java.lang.String r7 = r7.getString(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0796
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r4.mo121118U1()
            goto L_0x07dd
        L_0x0796:
            com.carrefour.fid.android.navigation.BottomNavActivity r7 = r0.this$0
            r9 = 2131953259(0x7f13066b, float:1.9542984E38)
            java.lang.String r7 = r7.getString(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x07ab
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r4.mo121121X1()
            goto L_0x07dd
        L_0x07ab:
            com.carrefour.fid.android.navigation.BottomNavActivity r7 = r0.this$0
            r9 = 2131953262(0x7f13066e, float:1.954299E38)
            java.lang.String r7 = r7.getString(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x07c0
            com.carrefour.fid.android.navigation.BottomNavActivity r4 = r0.this$0
            r4.mo121123Z1()
            goto L_0x07dd
        L_0x07c0:
            com.carrefour.fid.android.navigation.BottomNavActivity r7 = r0.this$0
            r9 = 2131953261(0x7f13066d, float:1.9542988E38)
            java.lang.String r7 = r7.getString(r9)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r4 == 0) goto L_0x07dd
            com.carrefour.fid.android.navigation.BottomNavActivity r9 = r0.this$0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 30
            r16 = 0
            com.carrefour.fid.android.app.extensions.C13825a.m58795x(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x07dd:
            if (r2 == 0) goto L_0x07fa
            java.lang.String r4 = r2.getPath()
            if (r4 == 0) goto L_0x07fa
            com.carrefour.fid.android.navigation.BottomNavActivity r7 = r0.this$0
            r9 = 2131951932(0x7f13013c, float:1.9540292E38)
            java.lang.String r7 = r7.getString(r9)
            java.lang.String r9 = "getString(R.string.applink_parameter_pdp)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            boolean r3 = kotlin.text.C11622t.startsWith$default(r4, r7, r5, r3, r8)
            if (r3 != r6) goto L_0x07fa
            r5 = r6
        L_0x07fa:
            if (r5 == 0) goto L_0x0818
            java.lang.String r2 = com.carrefour.fid.android.utils.C22720o.m102888a(r2)
            if (r2 == 0) goto L_0x0813
            com.carrefour.fid.android.navigation.BottomNavActivity r3 = r0.this$0
            r0.L$0 = r8
            r4 = 11
            r0.label = r4
            java.lang.Object r2 = r3.mo121134l2(r2, r0)
            if (r2 != r1) goto L_0x0811
            return r1
        L_0x0811:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
        L_0x0813:
            if (r8 != 0) goto L_0x0818
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0818:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.navigation.BottomNavActivity$onNewIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BottomNavActivity$onNewIntent$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
