package com.carrefour.fid.android.presentation.viewmodels.confirmation;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.domain.models.TrackingData;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.tracking.C28994a;
import com.contentsquare.android.api.model.C14103e;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutConfirmationAnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutConfirmationAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationAnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n1549#2:214\n1620#2,3:215\n*S KotlinDebug\n*F\n+ 1 CheckoutConfirmationAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationAnalyticsViewModel\n*L\n161#1:214\n161#1:215,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.confirmation.a */
public final class C26196a {

    /* renamed from: f */
    public static final int f64083f = 8;
    @C12579k

    /* renamed from: a */
    public final Context f64084a;
    @C12579k

    /* renamed from: b */
    public C13783a f64085b;
    @C12579k

    /* renamed from: c */
    public final C13814a f64086c;
    @C12579k

    /* renamed from: d */
    public final C28994a f64087d;

    /* renamed from: e */
    public boolean f64088e;

    @Inject
    public C26196a(@C10255b @C12579k Context context, @C12579k C13783a aVar, @C12579k C13814a aVar2, @C12579k C28994a aVar3) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        Intrinsics.checkNotNullParameter(aVar3, "audienceTrackingAdapter");
        this.f64084a = context;
        this.f64085b = aVar;
        this.f64086c = aVar2;
        this.f64087d = aVar3;
    }

    /* renamed from: i */
    public static /* synthetic */ void m112008i(C26196a aVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        aVar.mo76208h(str, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76201a(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.OrderConfirmationModel r40, @org.jetbrains.annotations.C12579k java.lang.String r41, boolean r42) {
        /*
            r39 = this;
            r0 = r39
            r1 = r41
            java.lang.String r2 = "basketTypeAnalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            boolean r2 = r0.f64088e
            if (r2 == 0) goto L_0x000e
            return
        L_0x000e:
            if (r40 == 0) goto L_0x0015
            com.carrefour.fid.android.domain.models.TrackingData r3 = r40.mo116167r()
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            r0.mo76203c(r3)
            com.carrefour.fid.android.analytics.data.appflyer.a r4 = r0.f64086c
            android.content.Context r5 = r0.f64084a
            if (r3 == 0) goto L_0x0024
            java.util.Map r6 = r3.mo116606b()
            goto L_0x0025
        L_0x0024:
            r6 = 0
        L_0x0025:
            java.lang.String r7 = "completed_purchase"
            r4.mo32735i(r5, r7, r6)
            com.carrefour.fid.android.analytics.data.appflyer.a r4 = r0.f64086c
            android.content.Context r5 = r0.f64084a
            if (r3 == 0) goto L_0x0048
            java.util.Map r6 = r3.mo116606b()
            if (r6 == 0) goto L_0x0048
            java.util.Map r6 = kotlin.collections.C10977s0.m41442J0(r6)
            if (r6 == 0) goto L_0x0048
            java.lang.String r8 = "Oui"
            r6.put(r7, r8)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            java.util.Map r6 = kotlin.collections.C10977s0.m41430D0(r6)
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            java.lang.String r7 = "af_purchase"
            r4.mo32735i(r5, r7, r6)
            r4 = 0
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = r3.mo116607c()     // Catch:{ Exception -> 0x005c }
            if (r5 == 0) goto L_0x005c
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r5 = r4
        L_0x005d:
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            r6.setTime(r7)
            r7 = 1
            int r8 = r6.get(r7)
            r9 = 2
            int r10 = r6.get(r9)
            r11 = 5
            int r6 = r6.get(r11)
            com.carrefour.fid.android.analytics.data.analytics.a r12 = r0.f64085b
            r13 = 3
            kotlin.Pair[] r14 = new kotlin.Pair[r13]
            java.lang.String r15 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "user_transactionTotal"
            kotlin.Pair r15 = kotlin.C11078d1.m42659a(r2, r15)
            r14[r4] = r15
            int r15 = kotlin.ranges.C11479u.m44313B(r5, r9)
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r11 = "user_newCustomer"
            kotlin.Pair r15 = kotlin.C11078d1.m42659a(r11, r15)
            r14[r7] = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r8)
            r15.append(r10)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            java.lang.String r13 = "user_lastOrderDate"
            kotlin.Pair r15 = kotlin.C11078d1.m42659a(r13, r15)
            r14[r9] = r15
            java.util.Map r14 = kotlin.collections.C10977s0.m41456W(r14)
            r12.mo32708k(r14)
            java.lang.String r12 = "nonfood-delivery"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x00c5
            java.lang.String r12 = "nonfood"
            goto L_0x00c7
        L_0x00c5:
            java.lang.String r12 = "food"
        L_0x00c7:
            if (r42 == 0) goto L_0x00cc
            java.lang.String r14 = "multi"
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r14 = "simple"
        L_0x00ce:
            com.carrefour.fid.android.analytics.data.analytics.a r15 = r0.f64085b
            java.lang.String r18 = "checkout"
            java.lang.String r19 = "order-confirmation"
            r9 = 6
            kotlin.Pair[] r9 = new kotlin.Pair[r9]
            java.lang.String r7 = "panier_type"
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r7, r1)
            r9[r4] = r1
            java.lang.String r1 = "env_basketBusiness"
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r1, r12)
            r7 = 1
            r9[r7] = r1
            java.lang.String r1 = "env_basketSize"
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r1, r14)
            r7 = 2
            r9[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r2, r1)
            r2 = 3
            r9[r2] = r1
            int r1 = kotlin.ranges.C11479u.m44313B(r5, r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r11, r1)
            r2 = 4
            r9[r2] = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r10)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r13, r1)
            r2 = 5
            r9[r2] = r1
            java.util.Map r1 = kotlin.collections.C10977s0.m41456W(r9)
            if (r3 == 0) goto L_0x012f
            java.util.Map r2 = r3.mo116610e()
            goto L_0x0130
        L_0x012f:
            r2 = 0
        L_0x0130:
            java.util.Map r20 = com.carrefour.fid.android.shared.util.C28942l.m119736a(r1, r2)
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 24
            r25 = 0
            r17 = r15
            com.carrefour.fid.android.analytics.data.analytics.C13783a.m58667i(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.carrefour.fid.android.analytics.data.analytics.a r1 = r0.f64085b
            r2 = 1
            com.carrefour.fid.android.analytics.data.analytics.h[] r3 = new com.carrefour.fid.android.analytics.data.analytics.C13813h[r2]
            r5 = 2
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey[] r5 = new com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey[r5]
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r6 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.ECOMMERCE_PURCHASE
            r5[r4] = r6
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r6 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.PURCHASE
            r5[r2] = r6
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r5)
            if (r40 == 0) goto L_0x015e
            java.lang.String r5 = r40.mo116161l()
            goto L_0x015f
        L_0x015e:
            r5 = 0
        L_0x015f:
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0165
            r8 = r6
            goto L_0x0166
        L_0x0165:
            r8 = r5
        L_0x0166:
            r9 = 0
            r10 = 0
            if (r40 == 0) goto L_0x0176
            java.lang.Double r5 = r40.mo116152d()
            if (r5 == 0) goto L_0x0176
            double r12 = r5.doubleValue()
            goto L_0x0177
        L_0x0176:
            r12 = r10
        L_0x0177:
            float r5 = (float) r12
            if (r40 == 0) goto L_0x0185
            java.lang.Double r7 = r40.mo116157h()
            if (r7 == 0) goto L_0x0185
            double r12 = r7.doubleValue()
            goto L_0x0186
        L_0x0185:
            r12 = r10
        L_0x0186:
            float r12 = (float) r12
            if (r40 == 0) goto L_0x018e
            java.lang.String r7 = r40.mo116155f()
            goto L_0x018f
        L_0x018e:
            r7 = 0
        L_0x018f:
            if (r7 != 0) goto L_0x0193
            r13 = r6
            goto L_0x0194
        L_0x0193:
            r13 = r7
        L_0x0194:
            if (r40 == 0) goto L_0x019b
            java.util.List r7 = r40.mo116160k()
            goto L_0x019c
        L_0x019b:
            r7 = 0
        L_0x019c:
            if (r7 != 0) goto L_0x01a2
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x01a2:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = kotlin.collections.C10978t.m41495Y(r7, r15)
            r14.<init>(r15)
            java.util.Iterator r7 = r7.iterator()
        L_0x01b3:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L_0x020f
            java.lang.Object r15 = r7.next()
            com.carrefour.fid.android.domain.models.OrderProductModel r15 = (com.carrefour.fid.android.domain.models.OrderProductModel) r15
            java.lang.String r16 = r15.mo116210a()
            if (r16 != 0) goto L_0x01c8
            r28 = r6
            goto L_0x01ca
        L_0x01c8:
            r28 = r16
        L_0x01ca:
            java.lang.Integer r32 = r15.mo116212c()
            java.lang.Float r15 = r15.mo116215e()
            if (r15 != 0) goto L_0x01d8
            java.lang.Double r15 = java.lang.Double.valueOf(r10)
        L_0x01d8:
            float r31 = r15.floatValue()
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r15 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.ECOMMERCE_PURCHASE
            boolean r15 = com.carrefour.fid.android.analytics.data.analytics.C13786d.m58689b(r15)
            if (r15 != 0) goto L_0x01f0
            com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey r15 = com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey.PURCHASE
            boolean r15 = com.carrefour.fid.android.analytics.data.analytics.C13786d.m58689b(r15)
            if (r15 == 0) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            r36 = 0
            goto L_0x01f4
        L_0x01f0:
            java.lang.String r15 = "undefined"
            r36 = r15
        L_0x01f4:
            com.carrefour.fid.android.analytics.data.analytics.firebasemodels.j r15 = new com.carrefour.fid.android.analytics.data.analytics.firebasemodels.j
            java.lang.String r27 = ""
            r29 = 0
            r30 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 460(0x1cc, float:6.45E-43)
            r38 = 0
            r26 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r14.add(r15)
            goto L_0x01b3
        L_0x020f:
            r6 = 2
            r15 = 0
            com.carrefour.fid.android.analytics.data.analytics.firebasemodels.l r11 = new com.carrefour.fid.android.analytics.data.analytics.firebasemodels.l
            r7 = r11
            r10 = r5
            r5 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            com.carrefour.fid.android.analytics.data.analytics.f r6 = new com.carrefour.fid.android.analytics.data.analytics.f
            java.lang.String r7 = "order-confirmation"
            java.lang.String r8 = "checkout"
            r6.<init>(r2, r7, r8, r5)
            r3[r4] = r6
            r1.mo32711n(r3)
            r1 = 1
            r0.f64088e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a.mo76201a(com.carrefour.fid.android.domain.models.OrderConfirmationModel, java.lang.String, boolean):void");
    }

    /* renamed from: b */
    public final void mo76202b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        C13783a.m58667i(this.f64085b, "checkout", "order-confirmation-erreur", C10975r0.m41401k(C11078d1.m42659a("panier_type", str)), false, false, false, 56, (Object) null);
    }

    /* renamed from: c */
    public final void mo76203c(@C12580l TrackingData trackingData) {
        Map<String, String> map;
        C28994a aVar = this.f64087d;
        if (trackingData == null || (map = trackingData.mo116605a()) == null) {
            map = C10977s0.m41492z();
        }
        aVar.mo32670e(map);
    }

    /* renamed from: d */
    public final void mo76204d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        C13783a.m58668o(this.f64085b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "ajouter-agenda"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("panier_type", str)), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo76205e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        C13783a.m58668o(this.f64085b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "evaluer-mon-experience"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("panier_type", str)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo76206f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        C13783a.m58668o(this.f64085b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "recapitulatif"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "commande-erreur"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo76207g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        C13783a.m58668o(this.f64085b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation-erreur"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "besoin-aide"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("panier_type", str)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo76208h(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        Map j0 = C10977s0.m41469j0(C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "transaction_panier_" + str));
        if (!z) {
            j0.put(C28526d.f68937k, "");
        }
        C13783a aVar = this.f64085b;
        C13783a.m58669q(aVar, j0, false, "transaction_panier_" + str, 2, (Object) null);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: j */
    public final void mo76209j(@C12580l OrderConfirmationModel orderConfirmationModel) {
        Double d;
        if (orderConfirmationModel != null && (d = orderConfirmationModel.mo116152d()) != null) {
            C14103e.m60627b((float) d.doubleValue(), "EUR").mo34351e(orderConfirmationModel.mo116155f()).mo34350d();
        }
    }
}
