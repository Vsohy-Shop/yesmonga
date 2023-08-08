package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import android.content.Context;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDeliveryChoiceMessageFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryChoiceMessageFormatter.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/DeliveryChoiceFormatter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n288#2,2:93\n288#2,2:95\n*S KotlinDebug\n*F\n+ 1 DeliveryChoiceMessageFormatter.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/DeliveryChoiceFormatter\n*L\n22#1:93,2\n63#1:95,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.b */
public final class C27855b {
    @C12579k

    /* renamed from: a */
    public final Context f67462a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.b$a */
    public /* synthetic */ class C27856a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType[] r0 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r1 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.DRIVE_CLCV     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r1 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27855b.C27856a.<clinit>():void");
        }
    }

    public C27855b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f67462a = context;
    }

    /* renamed from: a */
    public final boolean mo80931a(OfferDetail offerDetail) {
        String w = offerDetail.mo118705w();
        return w != null && new Regex(C27860e.f67466a).mo23327b(w);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01a7, code lost:
        if (r1 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01be  */
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.carrefour.fid.android.product.presentation.p039ui.details.views.C27934i> mo80932b(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.detail.OfferDetail> r21, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.product.detail.OfferDetail r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "offers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = r21.size()
            r3 = 1
            if (r2 != r3) goto L_0x0023
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r21)
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r2 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r2
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r2 = r2.mo118700s()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r4 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL
            if (r2 == r4) goto L_0x0023
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            return r1
        L_0x0023:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r4 = r1.iterator()
        L_0x002e:
            boolean r5 = r4.hasNext()
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x004b
            java.lang.Object r5 = r4.next()
            r8 = r5
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r8 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r8
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r8 = r8.mo118700s()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r9 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL
            if (r8 == r9) goto L_0x0047
            r8 = r3
            goto L_0x0048
        L_0x0047:
            r8 = r7
        L_0x0048:
            if (r8 == 0) goto L_0x002e
            goto L_0x004c
        L_0x004b:
            r5 = r6
        L_0x004c:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r5
            if (r5 == 0) goto L_0x0055
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r4 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116360a(r5)
            goto L_0x0056
        L_0x0055:
            r4 = r6
        L_0x0056:
            if (r5 == 0) goto L_0x005d
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r8 = r5.mo118700s()
            goto L_0x005e
        L_0x005d:
            r8 = r6
        L_0x005e:
            if (r8 != 0) goto L_0x0062
            r8 = -1
            goto L_0x006a
        L_0x0062:
            int[] r9 = com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27855b.C27856a.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r9[r8]
        L_0x006a:
            if (r8 == r3) goto L_0x00c4
            r9 = 2
            if (r8 == r9) goto L_0x0071
            goto L_0x0163
        L_0x0071:
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r8 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Unavailable
            if (r4 == r8) goto L_0x007c
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r8 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.SoonAvailable
            if (r4 != r8) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r13 = r7
            goto L_0x007d
        L_0x007c:
            r13 = r3
        L_0x007d:
            android.content.Context r4 = r0.f67462a
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_lex_delivery
            java.lang.String r10 = r4.getString(r8)
            android.content.Context r4 = r0.f67462a
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_food_delivery
            java.lang.String r12 = r4.getString(r8)
            if (r22 == 0) goto L_0x0094
            java.lang.String r4 = r22.mo118705w()
            goto L_0x0095
        L_0x0094:
            r4 = r6
        L_0x0095:
            java.lang.String r8 = r5.mo118705w()
            if (r4 != 0) goto L_0x009f
            if (r8 != 0) goto L_0x00a1
            r11 = r3
            goto L_0x00a8
        L_0x009f:
            if (r8 != 0) goto L_0x00a3
        L_0x00a1:
            r11 = r7
            goto L_0x00a8
        L_0x00a3:
            boolean r4 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r4, r8)
            r11 = r4
        L_0x00a8:
            java.lang.String r16 = r5.mo118705w()
            com.carrefour.fid.android.product.presentation.ui.details.views.j$d r17 = com.carrefour.fid.android.product.presentation.p039ui.details.views.C27935j.C27939d.f67776a
            com.carrefour.fid.android.product.presentation.ui.details.views.i r4 = new com.carrefour.fid.android.product.presentation.ui.details.views.i
            java.lang.String r5 = "getString(R.string.pdp_lex_delivery)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            r14 = 0
            r15 = 0
            r18 = 48
            r19 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.add(r4)
            goto L_0x0163
        L_0x00c4:
            boolean r8 = r0.mo80931a(r5)
            if (r8 == 0) goto L_0x0112
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r8 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Unavailable
            if (r4 == r8) goto L_0x00d5
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r8 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.SoonAvailable
            if (r4 != r8) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r13 = r7
            goto L_0x00d6
        L_0x00d5:
            r13 = r3
        L_0x00d6:
            if (r22 == 0) goto L_0x00dd
            java.lang.String r4 = r22.mo118705w()
            goto L_0x00de
        L_0x00dd:
            r4 = r6
        L_0x00de:
            java.lang.String r8 = r5.mo118705w()
            if (r4 != 0) goto L_0x00e8
            if (r8 != 0) goto L_0x00ea
            r11 = r3
            goto L_0x00f1
        L_0x00e8:
            if (r8 != 0) goto L_0x00ec
        L_0x00ea:
            r11 = r7
            goto L_0x00f1
        L_0x00ec:
            boolean r4 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r4, r8)
            r11 = r4
        L_0x00f1:
            android.content.Context r4 = r0.f67462a
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_store_delivery
            java.lang.String r10 = r4.getString(r8)
            java.lang.String r16 = r5.mo118705w()
            com.carrefour.fid.android.product.presentation.ui.details.views.j$b r17 = com.carrefour.fid.android.product.presentation.p039ui.details.views.C27935j.C27937b.f67772a
            com.carrefour.fid.android.product.presentation.ui.details.views.i r4 = new com.carrefour.fid.android.product.presentation.ui.details.views.i
            java.lang.String r5 = "getString(R.string.pdp_store_delivery)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            r12 = 0
            r14 = 0
            r15 = 0
            r18 = 48
            r19 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0160
        L_0x0112:
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r8 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Unavailable
            if (r4 == r8) goto L_0x011d
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r8 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.SoonAvailable
            if (r4 != r8) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r13 = r7
            goto L_0x011e
        L_0x011d:
            r13 = r3
        L_0x011e:
            android.content.Context r4 = r0.f67462a
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_delivery
            java.lang.String r10 = r4.getString(r8)
            android.content.Context r4 = r0.f67462a
            int r8 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_food_delivery
            java.lang.String r12 = r4.getString(r8)
            if (r22 == 0) goto L_0x0135
            java.lang.String r4 = r22.mo118705w()
            goto L_0x0136
        L_0x0135:
            r4 = r6
        L_0x0136:
            java.lang.String r8 = r5.mo118705w()
            if (r4 != 0) goto L_0x0140
            if (r8 != 0) goto L_0x0142
            r11 = r3
            goto L_0x0149
        L_0x0140:
            if (r8 != 0) goto L_0x0144
        L_0x0142:
            r11 = r7
            goto L_0x0149
        L_0x0144:
            boolean r4 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r4, r8)
            r11 = r4
        L_0x0149:
            java.lang.String r16 = r5.mo118705w()
            com.carrefour.fid.android.product.presentation.ui.details.views.j$a r17 = com.carrefour.fid.android.product.presentation.p039ui.details.views.C27935j.C27936a.f67770a
            com.carrefour.fid.android.product.presentation.ui.details.views.i r4 = new com.carrefour.fid.android.product.presentation.ui.details.views.i
            java.lang.String r5 = "getString(R.string.pdp_delivery)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            r14 = 0
            r15 = 0
            r18 = 48
            r19 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0160:
            r2.add(r4)
        L_0x0163:
            java.util.Iterator r1 = r1.iterator()
        L_0x0167:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0182
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r5
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r5 = r5.mo118700s()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r8 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL
            if (r5 != r8) goto L_0x017e
            r5 = r3
            goto L_0x017f
        L_0x017e:
            r5 = r7
        L_0x017f:
            if (r5 == 0) goto L_0x0167
            goto L_0x0183
        L_0x0182:
            r4 = r6
        L_0x0183:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r4 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r4
            if (r4 == 0) goto L_0x018c
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r1 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116360a(r4)
            goto L_0x018d
        L_0x018c:
            r1 = r6
        L_0x018d:
            if (r4 == 0) goto L_0x01ea
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Unavailable
            if (r1 == r5) goto L_0x019a
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.SoonAvailable
            if (r1 != r5) goto L_0x0198
            goto L_0x019a
        L_0x0198:
            r12 = r7
            goto L_0x019b
        L_0x019a:
            r12 = r3
        L_0x019b:
            if (r22 == 0) goto L_0x01a1
            java.lang.String r6 = r22.mo118705w()
        L_0x01a1:
            java.lang.String r1 = r4.mo118705w()
            if (r6 != 0) goto L_0x01aa
            if (r1 != 0) goto L_0x01ac
            goto L_0x01b2
        L_0x01aa:
            if (r1 != 0) goto L_0x01ae
        L_0x01ac:
            r10 = r7
            goto L_0x01b3
        L_0x01ae:
            boolean r3 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r6, r1)
        L_0x01b2:
            r10 = r3
        L_0x01b3:
            boolean r1 = r4.mo118680F()
            if (r1 == 0) goto L_0x01be
            android.content.Context r1 = r0.f67462a
            int r3 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_lad_delivery_or_relay
            goto L_0x01c2
        L_0x01be:
            android.content.Context r1 = r0.f67462a
            int r3 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_lad_delivery
        L_0x01c2:
            java.lang.String r1 = r1.getString(r3)
            r9 = r1
            boolean r14 = r4.mo118680F()
            android.content.Context r1 = r0.f67462a
            int r3 = com.carrefour.fid.android.product.C27609f.C27627r.pdp_service_set_lad_subtitle
            java.lang.String r11 = r1.getString(r3)
            java.lang.String r15 = r4.mo118705w()
            com.carrefour.fid.android.product.presentation.ui.details.views.j$c r16 = com.carrefour.fid.android.product.presentation.p039ui.details.views.C27935j.C27938c.f67774a
            com.carrefour.fid.android.product.presentation.ui.details.views.i r1 = new com.carrefour.fid.android.product.presentation.ui.details.views.i
            java.lang.String r3 = "if (ladOffer.isRelayPoin…                        )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)
            r13 = 1
            r17 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.add(r1)
        L_0x01ea:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27855b.mo80932b(java.util.List, com.carrefour.fid.android.domain.models.product.detail.OfferDetail):java.util.List");
    }
}
