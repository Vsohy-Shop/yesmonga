package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12311t;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffProductOffer$$serializer implements C12327y<BffProductOffer> {
    @C12579k
    public static final BffProductOffer$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffProductOffer$$serializer bffProductOffer$$serializer = new BffProductOffer$$serializer();
        INSTANCE = bffProductOffer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer", bffProductOffer$$serializer, 49);
        pluginGeneratedSerialDescriptor.mo24966k("gtin", true);
        pluginGeneratedSerialDescriptor.mo24966k("facility_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("facility_service_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("cdbase", true);
        pluginGeneratedSerialDescriptor.mo24966k("meti_ref", true);
        pluginGeneratedSerialDescriptor.mo24966k("assortment", true);
        pluginGeneratedSerialDescriptor.mo24966k("purchasing_step", true);
        pluginGeneratedSerialDescriptor.mo24966k("purchasing_min", true);
        pluginGeneratedSerialDescriptor.mo24966k("purchasing_max", true);
        pluginGeneratedSerialDescriptor.mo24966k("origin", true);
        pluginGeneratedSerialDescriptor.mo24966k("label_highlight", true);
        pluginGeneratedSerialDescriptor.mo24966k("weighting_factor", true);
        pluginGeneratedSerialDescriptor.mo24966k("freshness_garanteed", true);
        pluginGeneratedSerialDescriptor.mo24966k("score", true);
        pluginGeneratedSerialDescriptor.mo24966k(C28534f.f69157h0, true);
        pluginGeneratedSerialDescriptor.mo24966k("prices", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_promo", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_discounts", true);
        pluginGeneratedSerialDescriptor.mo24966k("flags", true);
        pluginGeneratedSerialDescriptor.mo24966k("offer_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_variable_weight", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_alternative_cheaper", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_variable_weight_safety_margin", true);
        pluginGeneratedSerialDescriptor.mo24966k("shop_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("shop_name", true);
        pluginGeneratedSerialDescriptor.mo24966k("product_state_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("offer_rank", true);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78917E, true);
        pluginGeneratedSerialDescriptor.mo24966k("is_new", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_eligible", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_digital_card", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_premium", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_indispensable", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_in_assortment", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_is_stopped", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_is_incontournable", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_is_purchasable", true);
        pluginGeneratedSerialDescriptor.mo24966k("promo_type_sort", true);
        pluginGeneratedSerialDescriptor.mo24966k("promotion_highlight", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_unavoidable", true);
        pluginGeneratedSerialDescriptor.mo24966k("picted_in_warehouse", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_stock_infinite", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_preorder", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_relay_point_eligible", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_express_withdrawal_eligible", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_innovation", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_display_label", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_channel_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("traceability", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffProductOffer$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffProductOffer.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        C12276h0 h0Var = C12276h0.f30067a;
        C12278i iVar = C12278i.f30070a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffProductOfferAssortment$$serializer.INSTANCE), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(h0Var), C12197a.m48817q(s1Var), C12197a.m48817q(C12311t.f30119a), C12197a.m48817q(BffAvailability$$serializer.INSTANCE), C12197a.m48817q(BffPrices$$serializer.INSTANCE), C12197a.m48817q(BffBffDiscount$$serializer.INSTANCE), C12197a.m48817q(access$get$childSerializers$cp[17]), C12197a.m48817q(BffOfferFlags$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffShipping$$serializer.INSTANCE), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(h0Var), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(BffProductOffer$BffDisplayLabel$$serializer.INSTANCE), C12197a.m48817q(BffProductOffer$BffChannelType$$serializer.INSTANCE), C12197a.m48817q(BffTraceability$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r102v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v8, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v8, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v107, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r112v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x02f6, code lost:
        r7 = kotlin.C11079d2.f28267a;
        r77 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x03b5, code lost:
        r26 = r37;
        r27 = r38;
        r28 = r39;
        r29 = r40;
        r30 = r41;
        r31 = r42;
        r32 = r43;
        r33 = r44;
        r34 = r45;
        r35 = r46;
        r25 = r47;
        r24 = r48;
        r23 = r49;
        r21 = r51;
        r20 = r52;
        r19 = r53;
        r16 = r57;
        r17 = r70;
        r8 = r75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x03db, code lost:
        r7 = r76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x03dd, code lost:
        r57 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0582, code lost:
        r68 = r3;
        r26 = r37;
        r27 = r38;
        r28 = r39;
        r29 = r40;
        r30 = r41;
        r31 = r42;
        r32 = r43;
        r33 = r44;
        r34 = r45;
        r35 = r46;
        r25 = r47;
        r24 = r48;
        r23 = r49;
        r21 = r51;
        r20 = r52;
        r19 = r53;
        r16 = r57;
        r3 = r71;
        r7 = r76;
        r71 = r17;
        r57 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0bc4, code lost:
        r16 = r56;
        r3 = r71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0c53, code lost:
        r4 = r16;
        r5 = r22;
        r16 = r56;
        r3 = r71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0c5b, code lost:
        r56 = r7;
        r71 = r17;
        r7 = r76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0c61, code lost:
        r17 = r8;
        r8 = r75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0c65, code lost:
        r70 = r17;
        r53 = r19;
        r52 = r20;
        r51 = r21;
        r49 = r23;
        r48 = r24;
        r47 = r25;
        r37 = r26;
        r38 = r27;
        r39 = r28;
        r40 = r29;
        r41 = r30;
        r42 = r31;
        r43 = r32;
        r44 = r33;
        r45 = r34;
        r46 = r35;
        r50 = r57;
        r2 = r77;
        r57 = r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r112) {
        /*
            r111 = this;
            r0 = r112
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r111.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.$childSerializers
            boolean r3 = r0.mo24886p()
            r12 = 9
            r13 = 7
            r14 = 6
            r15 = 5
            r4 = 3
            r5 = 8
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x01ce
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r0.mo24885n(r1, r9, r3, r10)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r3, r10)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r3, r10)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r10)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r3, r10)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment$$serializer r11 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment$$serializer.INSTANCE
            java.lang.Object r11 = r0.mo24885n(r1, r15, r11, r10)
            kotlinx.serialization.internal.h0 r15 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r14 = r0.mo24885n(r1, r14, r15, r10)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r15, r10)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r15, r10)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r3, r10)
            r26 = r4
            r4 = 10
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r10)
            r25 = r4
            r4 = 11
            java.lang.Object r4 = r0.mo24885n(r1, r4, r15, r10)
            r24 = r4
            r4 = 12
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r10)
            r23 = r4
            kotlinx.serialization.internal.t r4 = kotlinx.serialization.internal.C12311t.f30119a
            r27 = r5
            r5 = 13
            java.lang.Object r4 = r0.mo24885n(r1, r5, r4, r10)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability$$serializer.INSTANCE
            r22 = r4
            r4 = 14
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r10)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices$$serializer.INSTANCE
            r21 = r4
            r4 = 15
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r10)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$$serializer.INSTANCE
            r20 = r4
            r4 = 16
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r10)
            r5 = 17
            r2 = r2[r5]
            java.lang.Object r2 = r0.mo24885n(r1, r5, r2, r10)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags$$serializer.INSTANCE
            r18 = r2
            r2 = 18
            java.lang.Object r2 = r0.mo24885n(r1, r2, r5, r10)
            r5 = 19
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r10)
            r112 = r2
            kotlinx.serialization.internal.i r2 = kotlinx.serialization.internal.C12278i.f30070a
            r16 = r4
            r4 = 20
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r19 = r4
            r4 = 21
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r28 = r4
            r4 = 22
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r10)
            r29 = r4
            r4 = 23
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r10)
            r30 = r4
            r4 = 24
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r10)
            r31 = r4
            r4 = 25
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r10)
            r32 = r4
            r4 = 26
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r10)
            r33 = r4
            r4 = 27
            r34 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r10)
            r5 = 28
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r10)
            r35 = r4
            r4 = 29
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r36 = r4
            r4 = 30
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r37 = r4
            r4 = 31
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r38 = r4
            r4 = 32
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r17 = r4
            r4 = 33
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r39 = r4
            r4 = 34
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r40 = r4
            r4 = 35
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r41 = r4
            r4 = 36
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            r42 = r4
            r4 = 37
            java.lang.Object r4 = r0.mo24885n(r1, r4, r15, r10)
            r15 = 38
            java.lang.Object r3 = r0.mo24885n(r1, r15, r3, r10)
            r15 = 39
            java.lang.Object r15 = r0.mo24885n(r1, r15, r2, r10)
            r43 = r3
            r3 = 40
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r44 = r3
            r3 = 41
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r45 = r3
            r3 = 42
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r46 = r3
            r3 = 43
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r47 = r3
            r3 = 44
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r48 = r3
            r3 = 45
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r10)
            r3 = 46
            r49 = r2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffDisplayLabel$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffDisplayLabel$$serializer.INSTANCE
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r10)
            r3 = 47
            r50 = r2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType$$serializer.INSTANCE
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r10)
            r3 = 48
            r51 = r2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability$$serializer.INSTANCE
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r10)
            r3 = 131071(0x1ffff, float:1.8367E-40)
            r10 = -1
            r55 = r112
            r58 = r3
            r57 = r10
            r3 = r43
            r10 = r7
            r43 = r15
            r15 = r44
            r7 = r5
            r5 = r35
            r35 = r25
            r25 = r14
            r14 = r46
            r109 = r9
            r9 = r2
            r2 = r18
            r18 = r13
            r13 = r12
            r12 = r11
            r11 = r109
            r110 = r6
            r6 = r4
            r4 = r26
            r26 = r8
            r8 = r110
            goto L_0x0d22
        L_0x01ce:
            r54 = r2
            r74 = r8
            r3 = r9
            r68 = r3
            r2 = r10
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r36 = r15
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r53 = r52
            r55 = r53
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r64 = r63
            r65 = r64
            r66 = r65
            r67 = r66
            r69 = r67
            r70 = r69
            r71 = r70
            r72 = r71
            r73 = r72
        L_0x0229:
            if (r74 == 0) goto L_0x0c8f
            r75 = r8
            int r8 = r0.mo24931o(r1)
            switch(r8) {
                case -1: goto L_0x0c16;
                case 0: goto L_0x0bcb;
                case 1: goto L_0x0b78;
                case 2: goto L_0x0b2b;
                case 3: goto L_0x0add;
                case 4: goto L_0x0a8f;
                case 5: goto L_0x0a41;
                case 6: goto L_0x09f3;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0954;
                case 9: goto L_0x0904;
                case 10: goto L_0x08b4;
                case 11: goto L_0x0864;
                case 12: goto L_0x0814;
                case 13: goto L_0x07c6;
                case 14: goto L_0x077a;
                case 15: goto L_0x072d;
                case 16: goto L_0x06e1;
                case 17: goto L_0x0697;
                case 18: goto L_0x064b;
                case 19: goto L_0x05fc;
                case 20: goto L_0x05b1;
                case 21: goto L_0x0564;
                case 22: goto L_0x0545;
                case 23: goto L_0x0526;
                case 24: goto L_0x0507;
                case 25: goto L_0x04e7;
                case 26: goto L_0x04c7;
                case 27: goto L_0x04a7;
                case 28: goto L_0x0487;
                case 29: goto L_0x0467;
                case 30: goto L_0x0447;
                case 31: goto L_0x0427;
                case 32: goto L_0x03e2;
                case 33: goto L_0x039f;
                case 34: goto L_0x0388;
                case 35: goto L_0x0371;
                case 36: goto L_0x0337;
                case 37: goto L_0x02fc;
                case 38: goto L_0x02ea;
                case 39: goto L_0x02dd;
                case 40: goto L_0x02ca;
                case 41: goto L_0x02bd;
                case 42: goto L_0x02aa;
                case 43: goto L_0x0297;
                case 44: goto L_0x0284;
                case 45: goto L_0x0276;
                case 46: goto L_0x0263;
                case 47: goto L_0x024e;
                case 48: goto L_0x023a;
                default: goto L_0x0234;
            }
        L_0x0234:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x023a:
            r8 = 48
            r76 = r7
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability$$serializer r7 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability$$serializer.INSTANCE
            java.lang.Object r7 = r0.mo24885n(r1, r8, r7, r9)
            r8 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r8
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r77 = r2
            r9 = r7
            goto L_0x03b5
        L_0x024e:
            r76 = r7
            r7 = 47
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType$$serializer.INSTANCE
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r11)
            r8 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r8
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r77 = r2
            r11 = r7
            goto L_0x03b5
        L_0x0263:
            r76 = r7
            r7 = 46
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffDisplayLabel$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffDisplayLabel$$serializer.INSTANCE
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r12)
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r77 = r2
            r12 = r7
            goto L_0x03b5
        L_0x0276:
            r76 = r7
            r7 = 45
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r5 = r0.mo24885n(r1, r7, r8, r5)
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            goto L_0x02f6
        L_0x0284:
            r76 = r7
            r7 = 44
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r13)
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r77 = r2
            r13 = r7
            goto L_0x03b5
        L_0x0297:
            r76 = r7
            r7 = 43
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r10)
            r3 = r3 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r77 = r2
            r10 = r7
            goto L_0x03b5
        L_0x02aa:
            r76 = r7
            r7 = 42
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r14)
            r3 = r3 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r77 = r2
            r14 = r7
            goto L_0x03b5
        L_0x02bd:
            r76 = r7
            r7 = 41
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r3 = r3 | 512(0x200, float:7.175E-43)
            goto L_0x02f6
        L_0x02ca:
            r76 = r7
            r7 = 40
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r15)
            r3 = r3 | 256(0x100, float:3.59E-43)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r77 = r2
            r15 = r7
            goto L_0x03b5
        L_0x02dd:
            r76 = r7
            r7 = 39
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r6 = r0.mo24885n(r1, r7, r8, r6)
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x02f6
        L_0x02ea:
            r76 = r7
            r7 = 38
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r7, r8, r4)
            r3 = r3 | 64
        L_0x02f6:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r77 = r2
            goto L_0x03b5
        L_0x02fc:
            r76 = r7
            r7 = 37
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            r77 = r2
            r2 = r76
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r3 = r3 | 32
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r7 = r2
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r16 = r57
            r17 = r70
            r8 = r75
            goto L_0x03dd
        L_0x0337:
            r77 = r2
            r2 = r7
            r7 = 36
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r76 = r2
            r2 = r75
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r3 = r3 | 16
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r8 = r2
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r16 = r57
            r17 = r70
            goto L_0x03db
        L_0x0371:
            r77 = r2
            r76 = r7
            r2 = r75
            r7 = 35
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = r73
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r3 = r3 | 8
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r73 = r2
            goto L_0x03b5
        L_0x0388:
            r77 = r2
            r76 = r7
            r2 = r73
            r7 = 34
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = r72
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r3 = r3 | 4
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r72 = r2
            goto L_0x03b5
        L_0x039f:
            r77 = r2
            r76 = r7
            r2 = r72
            r7 = 33
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = r71
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r3 = r3 | 2
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r71 = r2
        L_0x03b5:
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r16 = r57
            r17 = r70
            r8 = r75
        L_0x03db:
            r7 = r76
        L_0x03dd:
            r2 = 0
            r57 = r50
            goto L_0x0c65
        L_0x03e2:
            r77 = r2
            r76 = r7
            r2 = r71
            kotlinx.serialization.internal.i r7 = kotlinx.serialization.internal.C12278i.f30070a
            r17 = r2
            r8 = r70
            r2 = 32
            java.lang.Object r7 = r0.mo24885n(r1, r2, r7, r8)
            r3 = r3 | 1
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r71 = r17
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r16 = r57
            r8 = r75
            r2 = 0
            r17 = r7
            r57 = r50
            r7 = r76
            goto L_0x0c65
        L_0x0427:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r2 = 32
            r7 = 31
            kotlinx.serialization.internal.i r2 = kotlinx.serialization.internal.C12278i.f30070a
            r71 = r3
            r3 = r69
            java.lang.Object r2 = r0.mo24885n(r1, r7, r2, r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r69 = r2
            goto L_0x0582
        L_0x0447:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r69
            r2 = 30
            kotlinx.serialization.internal.i r7 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r67
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 1073741824(0x40000000, float:2.0)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r67 = r2
            goto L_0x0582
        L_0x0467:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r67
            r2 = 29
            kotlinx.serialization.internal.i r7 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r66
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r66 = r2
            goto L_0x0582
        L_0x0487:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r66
            r2 = 28
            kotlinx.serialization.internal.i r7 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r65
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r65 = r2
            goto L_0x0582
        L_0x04a7:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r65
            r2 = 27
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping$$serializer r7 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping$$serializer.INSTANCE
            r3 = r64
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r64 = r2
            goto L_0x0582
        L_0x04c7:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r64
            r2 = 26
            kotlinx.serialization.internal.s1 r7 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r63
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r63 = r2
            goto L_0x0582
        L_0x04e7:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r63
            r2 = 25
            kotlinx.serialization.internal.s1 r7 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r62
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r62 = r2
            goto L_0x0582
        L_0x0507:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r62
            r2 = 24
            kotlinx.serialization.internal.s1 r7 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r61
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r61 = r2
            goto L_0x0582
        L_0x0526:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r61
            r2 = 23
            kotlinx.serialization.internal.s1 r7 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r60
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r60 = r2
            goto L_0x0582
        L_0x0545:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r60
            r2 = 22
            kotlinx.serialization.internal.s1 r7 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r59
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 4194304(0x400000, float:5.877472E-39)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r59 = r2
            goto L_0x0582
        L_0x0564:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r59
            r2 = 21
            kotlinx.serialization.internal.i r7 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r58
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 2097152(0x200000, float:2.938736E-39)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r58 = r2
        L_0x0582:
            r68 = r3
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r16 = r57
            r3 = r71
            r7 = r76
            r2 = 0
            r71 = r17
            r57 = r50
            goto L_0x0c61
        L_0x05b1:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r58
            r2 = 20
            kotlinx.serialization.internal.i r7 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r57
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r3 = 1048576(0x100000, float:1.469368E-39)
            r3 = r68 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r16 = r2
            r68 = r3
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r57 = r50
            r21 = r51
            r20 = r52
            r19 = r53
            r3 = r71
            r7 = r76
            r2 = 0
            r71 = r17
            goto L_0x0c61
        L_0x05fc:
            r77 = r2
            r76 = r7
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = r57
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r7 = r56
            r56 = r3
            r3 = 19
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r7)
            r7 = 524288(0x80000, float:7.34684E-40)
            r7 = r68 | r7
            kotlin.d2 r57 = kotlin.C11079d2.f28267a
            r68 = r7
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r57 = r50
            r21 = r51
            r20 = r52
            r19 = r53
            r16 = r56
            r3 = r71
            r7 = r76
            r56 = r2
            r71 = r17
            r2 = 0
            goto L_0x0c61
        L_0x064b:
            r77 = r2
            r76 = r7
            r7 = r56
            r56 = r57
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = 19
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags$$serializer.INSTANCE
            r16 = r4
            r3 = r55
            r4 = 18
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r68 | r3
            kotlin.d2 r55 = kotlin.C11079d2.f28267a
            r55 = r2
            r68 = r3
            r4 = r16
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r57 = r50
            r21 = r51
            r20 = r52
            r19 = r53
            goto L_0x0bc4
        L_0x0697:
            r77 = r2
            r16 = r4
            r76 = r7
            r7 = r56
            r56 = r57
            r8 = r70
            r17 = r71
            r2 = 17
            r71 = r3
            r3 = r55
            r4 = r54[r2]
            r3 = r53
            java.lang.Object r3 = r0.mo24885n(r1, r2, r4, r3)
            r4 = 131072(0x20000, float:1.83671E-40)
            r4 = r68 | r4
            kotlin.d2 r53 = kotlin.C11079d2.f28267a
            r19 = r3
            r68 = r4
            r4 = r16
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r57 = r50
            r21 = r51
            r20 = r52
            goto L_0x0bc4
        L_0x06e1:
            r77 = r2
            r16 = r4
            r76 = r7
            r7 = r56
            r56 = r57
            r8 = r70
            r17 = r71
            r2 = 17
            r71 = r3
            r3 = r53
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$$serializer.INSTANCE
            r19 = r3
            r2 = r52
            r3 = 16
            java.lang.Object r2 = r0.mo24885n(r1, r3, r4, r2)
            r4 = 65536(0x10000, float:9.18355E-41)
            r4 = r68 | r4
            kotlin.d2 r52 = kotlin.C11079d2.f28267a
            r20 = r2
            r68 = r4
            r4 = r16
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r57 = r50
            r21 = r51
            goto L_0x0bc4
        L_0x072d:
            r77 = r2
            r16 = r4
            r76 = r7
            r2 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r8 = r70
            r17 = r71
            r71 = r3
            r3 = 16
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices$$serializer.INSTANCE
            r20 = r2
            r3 = r51
            r2 = 15
            java.lang.Object r3 = r0.mo24885n(r1, r2, r4, r3)
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r68 | r4
            kotlin.d2 r51 = kotlin.C11079d2.f28267a
            r21 = r3
            r68 = r4
            r4 = r16
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r57 = r50
            goto L_0x0bc4
        L_0x077a:
            r77 = r2
            r16 = r4
            r76 = r7
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r8 = r70
            r17 = r71
            r2 = 15
            r71 = r3
            r3 = r51
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability$$serializer.INSTANCE
            r21 = r3
            r2 = r50
            r3 = 14
            java.lang.Object r2 = r0.mo24885n(r1, r3, r4, r2)
            r4 = r68
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r50 = kotlin.C11079d2.f28267a
            r57 = r2
            r68 = r4
            r4 = r16
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            goto L_0x0bc4
        L_0x07c6:
            r77 = r2
            r16 = r4
            r76 = r7
            r2 = r50
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r71 = r3
            kotlinx.serialization.internal.t r3 = kotlinx.serialization.internal.C12311t.f30119a
            r57 = r2
            r22 = r5
            r2 = r49
            r5 = 13
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r3 = r4 | 8192(0x2000, float:1.14794E-41)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r23 = r2
            r68 = r3
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            goto L_0x0bc4
        L_0x0814:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r2 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r5 = 13
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r23 = r2
            r5 = r48
            r2 = 12
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r24 = r3
            r68 = r4
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            goto L_0x0bc4
        L_0x0864:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r5 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r2 = 12
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r24 = r5
            r2 = r47
            r5 = 11
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r3 = r4 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r25 = r2
            r68 = r3
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            goto L_0x0bc4
        L_0x08b4:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r2 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r5 = 11
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r25 = r2
            r5 = r46
            r2 = 10
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r35 = r3
            r68 = r4
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            goto L_0x0bc4
        L_0x0904:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r5 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r2 = 10
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r35 = r5
            r2 = r45
            r5 = 9
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r3 = r4 | 512(0x200, float:7.175E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r34 = r2
            r68 = r3
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            goto L_0x0bc4
        L_0x0954:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r2 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r5 = 9
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r34 = r2
            r5 = r44
            r2 = 8
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 256(0x100, float:3.59E-43)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r33 = r3
            r68 = r4
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            goto L_0x0bc4
        L_0x09a4:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r5 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r2 = 8
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r33 = r5
            r2 = r43
            r5 = 7
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r3 = r4 | 128(0x80, float:1.794E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r32 = r2
            r68 = r3
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            goto L_0x0bc4
        L_0x09f3:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r2 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r5 = 7
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r32 = r2
            r5 = r42
            r2 = 6
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 64
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r31 = r3
            r68 = r4
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            goto L_0x0bc4
        L_0x0a41:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r5 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r2 = 6
            r71 = r3
            r57 = r50
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment$$serializer.INSTANCE
            r31 = r5
            r2 = r41
            r5 = 5
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r3 = r4 | 32
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r30 = r2
            r68 = r3
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            goto L_0x0bc4
        L_0x0a8f:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r2 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r5 = 5
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r30 = r2
            r5 = r40
            r2 = 4
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 16
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r29 = r3
            r68 = r4
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            r28 = r39
            goto L_0x0bc4
        L_0x0add:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r5 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r2 = 4
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r29 = r5
            r2 = r39
            r5 = 3
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r3 = r4 | 8
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r28 = r2
            r68 = r3
            r4 = r16
            r5 = r22
            r26 = r37
            r27 = r38
            goto L_0x0bc4
        L_0x0b2b:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r2 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r5 = 3
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r28 = r2
            r5 = r38
            r2 = 2
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 4
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r27 = r3
            r68 = r4
            r4 = r16
            r5 = r22
            r26 = r37
            goto L_0x0bc4
        L_0x0b78:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r5 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r2 = 2
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r27 = r5
            r2 = r37
            r5 = 1
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r3 = r4 | 2
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r26 = r2
            r68 = r3
            r4 = r16
            r5 = r22
        L_0x0bc4:
            r16 = r56
            r3 = r71
            r2 = 0
            goto L_0x0c5b
        L_0x0bcb:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r2 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r5 = 1
            r71 = r3
            r57 = r50
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r26 = r2
            r5 = r36
            r2 = 0
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 1
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r36 = r3
            r68 = r4
            goto L_0x0c53
        L_0x0c16:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r5 = r36
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r2 = 0
            r71 = r3
            r57 = r50
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r74 = r2
        L_0x0c53:
            r4 = r16
            r5 = r22
            r16 = r56
            r3 = r71
        L_0x0c5b:
            r56 = r7
            r71 = r17
            r7 = r76
        L_0x0c61:
            r17 = r8
            r8 = r75
        L_0x0c65:
            r70 = r17
            r53 = r19
            r52 = r20
            r51 = r21
            r49 = r23
            r48 = r24
            r47 = r25
            r37 = r26
            r38 = r27
            r39 = r28
            r40 = r29
            r41 = r30
            r42 = r31
            r43 = r32
            r44 = r33
            r45 = r34
            r46 = r35
            r50 = r57
            r2 = r77
            r57 = r16
            goto L_0x0229
        L_0x0c8f:
            r77 = r2
            r16 = r4
            r22 = r5
            r76 = r7
            r75 = r8
            r5 = r36
            r26 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r34 = r45
            r35 = r46
            r25 = r47
            r24 = r48
            r23 = r49
            r21 = r51
            r20 = r52
            r19 = r53
            r7 = r56
            r56 = r57
            r4 = r68
            r8 = r70
            r17 = r71
            r71 = r3
            r57 = r50
            r43 = r6
            r47 = r10
            r51 = r11
            r50 = r12
            r48 = r13
            r3 = r16
            r39 = r17
            r2 = r19
            r16 = r20
            r20 = r21
            r49 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r10 = r27
            r12 = r30
            r25 = r31
            r18 = r32
            r27 = r33
            r13 = r34
            r19 = r56
            r21 = r57
            r30 = r60
            r31 = r61
            r32 = r62
            r33 = r63
            r36 = r66
            r37 = r67
            r38 = r69
            r40 = r72
            r41 = r73
            r42 = r75
            r6 = r76
            r45 = r77
            r57 = r4
            r11 = r5
            r34 = r7
            r17 = r8
            r4 = r28
            r8 = r29
            r28 = r58
            r29 = r59
            r5 = r64
            r7 = r65
            r58 = r71
        L_0x0d22:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer
            r56 = r0
            r59 = r11
            java.lang.String r59 = (java.lang.String) r59
            r60 = r26
            java.lang.String r60 = (java.lang.String) r60
            r61 = r10
            java.lang.String r61 = (java.lang.String) r61
            r62 = r4
            java.lang.String r62 = (java.lang.String) r62
            r63 = r8
            java.lang.String r63 = (java.lang.String) r63
            r64 = r12
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment r64 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment) r64
            r65 = r25
            java.lang.Integer r65 = (java.lang.Integer) r65
            r66 = r18
            java.lang.Integer r66 = (java.lang.Integer) r66
            r67 = r27
            java.lang.Integer r67 = (java.lang.Integer) r67
            r68 = r13
            java.lang.String r68 = (java.lang.String) r68
            r69 = r35
            java.lang.String r69 = (java.lang.String) r69
            r70 = r24
            java.lang.Integer r70 = (java.lang.Integer) r70
            r71 = r23
            java.lang.String r71 = (java.lang.String) r71
            r72 = r22
            java.lang.Double r72 = (java.lang.Double) r72
            r73 = r21
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability r73 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability) r73
            r74 = r20
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices r74 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices) r74
            r75 = r16
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount r75 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount) r75
            r76 = r2
            java.util.List r76 = (java.util.List) r76
            r77 = r55
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags r77 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags) r77
            r78 = r34
            java.lang.String r78 = (java.lang.String) r78
            r79 = r19
            java.lang.Boolean r79 = (java.lang.Boolean) r79
            r80 = r28
            java.lang.Boolean r80 = (java.lang.Boolean) r80
            r81 = r29
            java.lang.String r81 = (java.lang.String) r81
            r82 = r30
            java.lang.String r82 = (java.lang.String) r82
            r83 = r31
            java.lang.String r83 = (java.lang.String) r83
            r84 = r32
            java.lang.String r84 = (java.lang.String) r84
            r85 = r33
            java.lang.String r85 = (java.lang.String) r85
            r86 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping r86 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping) r86
            r87 = r7
            java.lang.Boolean r87 = (java.lang.Boolean) r87
            r88 = r36
            java.lang.Boolean r88 = (java.lang.Boolean) r88
            r89 = r37
            java.lang.Boolean r89 = (java.lang.Boolean) r89
            r90 = r38
            java.lang.Boolean r90 = (java.lang.Boolean) r90
            r91 = r17
            java.lang.Boolean r91 = (java.lang.Boolean) r91
            r92 = r39
            java.lang.Boolean r92 = (java.lang.Boolean) r92
            r93 = r40
            java.lang.Boolean r93 = (java.lang.Boolean) r93
            r94 = r41
            java.lang.Boolean r94 = (java.lang.Boolean) r94
            r95 = r42
            java.lang.Boolean r95 = (java.lang.Boolean) r95
            r96 = r6
            java.lang.Integer r96 = (java.lang.Integer) r96
            r97 = r3
            java.lang.String r97 = (java.lang.String) r97
            r98 = r43
            java.lang.Boolean r98 = (java.lang.Boolean) r98
            r99 = r15
            java.lang.Boolean r99 = (java.lang.Boolean) r99
            r100 = r45
            java.lang.Boolean r100 = (java.lang.Boolean) r100
            r101 = r14
            java.lang.Boolean r101 = (java.lang.Boolean) r101
            r102 = r47
            java.lang.Boolean r102 = (java.lang.Boolean) r102
            r103 = r48
            java.lang.Boolean r103 = (java.lang.Boolean) r103
            r104 = r49
            java.lang.Boolean r104 = (java.lang.Boolean) r104
            r105 = r50
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffDisplayLabel r105 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffDisplayLabel) r105
            r106 = r51
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r106 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType) r106
            r107 = r9
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability r107 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability) r107
            r108 = 0
            r56.<init>((int) r57, (int) r58, (java.lang.String) r59, (java.lang.String) r60, (java.lang.String) r61, (java.lang.String) r62, (java.lang.String) r63, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOfferAssortment) r64, (java.lang.Integer) r65, (java.lang.Integer) r66, (java.lang.Integer) r67, (java.lang.String) r68, (java.lang.String) r69, (java.lang.Integer) r70, (java.lang.String) r71, (java.lang.Double) r72, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability) r73, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices) r74, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount) r75, (java.util.List) r76, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags) r77, (java.lang.String) r78, (java.lang.Boolean) r79, (java.lang.Boolean) r80, (java.lang.String) r81, (java.lang.String) r82, (java.lang.String) r83, (java.lang.String) r84, (java.lang.String) r85, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffShipping) r86, (java.lang.Boolean) r87, (java.lang.Boolean) r88, (java.lang.Boolean) r89, (java.lang.Boolean) r90, (java.lang.Boolean) r91, (java.lang.Boolean) r92, (java.lang.Boolean) r93, (java.lang.Boolean) r94, (java.lang.Boolean) r95, (java.lang.Integer) r96, (java.lang.String) r97, (java.lang.Boolean) r98, (java.lang.Boolean) r99, (java.lang.Boolean) r100, (java.lang.Boolean) r101, (java.lang.Boolean) r102, (java.lang.Boolean) r103, (java.lang.Boolean) r104, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffDisplayLabel) r105, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType) r106, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability) r107, (kotlinx.serialization.internal.C12295n1) r108)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffProductOffer bffProductOffer) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffProductOffer, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffProductOffer.write$Self(bffProductOffer, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
