package com.carrefour.fid.android.bff_data_shared.data.api.entities;

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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonDetailedFacility.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonDetailedFacility;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffCommonDetailedFacility$$serializer implements C12327y<BffCommonDetailedFacility> {
    @C12579k
    public static final BffCommonDetailedFacility$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffCommonDetailedFacility$$serializer bffCommonDetailedFacility$$serializer = new BffCommonDetailedFacility$$serializer();
        INSTANCE = bffCommonDetailedFacility$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility", bffCommonDetailedFacility$$serializer, 47);
        pluginGeneratedSerialDescriptor.mo24966k("id", true);
        pluginGeneratedSerialDescriptor.mo24966k("facility_service_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("name", true);
        pluginGeneratedSerialDescriptor.mo24966k("label", true);
        pluginGeneratedSerialDescriptor.mo24966k("status", true);
        pluginGeneratedSerialDescriptor.mo24966k("store_format", true);
        pluginGeneratedSerialDescriptor.mo24966k("store_service", true);
        pluginGeneratedSerialDescriptor.mo24966k("opening_date", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("type", true);
        pluginGeneratedSerialDescriptor.mo24966k("weight", true);
        pluginGeneratedSerialDescriptor.mo24966k("category", true);
        pluginGeneratedSerialDescriptor.mo24966k("additional_service_information", true);
        pluginGeneratedSerialDescriptor.mo24966k("promise", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_is_express", true);
        pluginGeneratedSerialDescriptor.mo24966k("minefi_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("meti_reference", true);
        pluginGeneratedSerialDescriptor.mo24966k("wlec_format", true);
        pluginGeneratedSerialDescriptor.mo24966k("wlec_service", true);
        pluginGeneratedSerialDescriptor.mo24966k("wording", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_PVFR", true);
        pluginGeneratedSerialDescriptor.mo24966k("has_variable_weight", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_franchised", true);
        pluginGeneratedSerialDescriptor.mo24966k("delivery_zones", true);
        pluginGeneratedSerialDescriptor.mo24966k("delivery_city_zones", true);
        pluginGeneratedSerialDescriptor.mo24966k("fees", true);
        pluginGeneratedSerialDescriptor.mo24966k("delivery_fees", true);
        pluginGeneratedSerialDescriptor.mo24966k("store_loyalty_preparator", true);
        pluginGeneratedSerialDescriptor.mo24966k("product_max_quantity", true);
        pluginGeneratedSerialDescriptor.mo24966k("bcp_banner_desc", true);
        pluginGeneratedSerialDescriptor.mo24966k("bcp_banner", true);
        pluginGeneratedSerialDescriptor.mo24966k("min_order_amount", true);
        pluginGeneratedSerialDescriptor.mo24966k("preparation_price", true);
        pluginGeneratedSerialDescriptor.mo24966k("preparator_minimum_amount", true);
        pluginGeneratedSerialDescriptor.mo24966k("preparator_cnuf", true);
        pluginGeneratedSerialDescriptor.mo24966k("free_preparation_threshold", true);
        pluginGeneratedSerialDescriptor.mo24966k("google_map_store_URL", true);
        pluginGeneratedSerialDescriptor.mo24966k("max_order_weighting", true);
        pluginGeneratedSerialDescriptor.mo24966k("payment_on_site_activated", true);
        pluginGeneratedSerialDescriptor.mo24966k("payment_choice", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_e_wallet_loyalty_activated", true);
        pluginGeneratedSerialDescriptor.mo24966k("free_delivery_threshold", true);
        pluginGeneratedSerialDescriptor.mo24966k("pass_days", true);
        pluginGeneratedSerialDescriptor.mo24966k("limits", true);
        pluginGeneratedSerialDescriptor.mo24966k("returnable_shopping_bag", true);
        pluginGeneratedSerialDescriptor.mo24966k("yield_eligible", true);
        pluginGeneratedSerialDescriptor.mo24966k("facility_has_in_store_service", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffCommonDetailedFacility$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffCommonDetailedFacility.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        C12278i iVar = C12278i.f30070a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffAdditionalServiceInformation$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[23]), C12197a.m48817q(access$get$childSerializers$cp[24]), C12197a.m48817q(BffServiceFees$$serializer.INSTANCE), C12197a.m48817q(access$get$childSerializers$cp[26]), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[28]), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[31]), C12197a.m48817q(access$get$childSerializers$cp[32]), C12197a.m48817q(access$get$childSerializers$cp[33]), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[35]), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[37]), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[39]), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[41]), C12197a.m48817q(access$get$childSerializers$cp[42]), C12197a.m48817q(access$get$childSerializers$cp[43]), iVar, C12197a.m48817q(iVar), C12197a.m48817q(iVar)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v10, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x029c, code lost:
        r8 = kotlin.C11079d2.f28267a;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x029e, code lost:
        r20 = r4;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x02da, code lost:
        r29 = r38;
        r30 = r39;
        r31 = r40;
        r32 = r41;
        r33 = r42;
        r35 = r46;
        r22 = r61;
        r26 = r62;
        r25 = r64;
        r24 = r66;
        r28 = r71;
        r8 = r73;
        r15 = r74;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0350, code lost:
        r61 = r2;
        r46 = r45;
        r2 = r53;
        r62 = r60;
        r64 = r63;
        r66 = r65;
        r71 = r69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0392, code lost:
        r29 = r38;
        r30 = r39;
        r31 = r40;
        r32 = r41;
        r33 = r42;
        r35 = r46;
        r22 = r61;
        r26 = r62;
        r25 = r64;
        r24 = r66;
        r71 = r69;
        r8 = r73;
        r15 = r75;
        r61 = r2;
        r46 = r45;
        r2 = r53;
        r62 = r60;
        r64 = r63;
        r66 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x03fa, code lost:
        r68 = r8;
        r28 = r22;
        r29 = r38;
        r30 = r39;
        r31 = r40;
        r32 = r41;
        r33 = r42;
        r35 = r46;
        r22 = r61;
        r26 = r62;
        r25 = r64;
        r24 = r66;
        r3 = r70;
        r8 = r73;
        r15 = r75;
        r61 = r2;
        r70 = r4;
        r46 = r45;
        r2 = r53;
        r62 = r60;
        r64 = r63;
        r66 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0499, code lost:
        r3 = r70;
        r8 = r73;
        r15 = r75;
        r61 = r2;
        r70 = r4;
        r46 = r45;
        r2 = r53;
        r62 = r60;
        r64 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0524, code lost:
        r3 = r70;
        r8 = r73;
        r15 = r75;
        r61 = r2;
        r70 = r4;
        r46 = r45;
        r2 = r53;
        r62 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x071f, code lost:
        r68 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0721, code lost:
        r28 = r22;
        r29 = r38;
        r30 = r39;
        r31 = r40;
        r32 = r41;
        r33 = r42;
        r35 = r46;
        r2 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0731, code lost:
        r8 = r73;
        r15 = r75;
        r22 = r3;
        r46 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0785, code lost:
        r3 = r70;
        r70 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x07f8, code lost:
        r68 = r3;
        r2 = r15;
        r29 = r38;
        r30 = r39;
        r31 = r40;
        r32 = r41;
        r33 = r42;
        r35 = r46;
        r3 = r70;
        r8 = r73;
        r15 = r75;
        r70 = r4;
        r46 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x08ea, code lost:
        r2 = r15;
        r29 = r38;
        r30 = r39;
        r31 = r40;
        r32 = r41;
        r33 = r42;
        r35 = r46;
        r8 = r73;
        r15 = r75;
        r46 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x09ec, code lost:
        r2 = r15;
        r29 = r38;
        r30 = r39;
        r31 = r40;
        r32 = r41;
        r33 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0b0c, code lost:
        r8 = r73;
        r15 = r75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0b56, code lost:
        r3 = r70;
        r8 = r73;
        r15 = r75;
        r70 = r68;
        r68 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0bac, code lost:
        r101 = r68;
        r68 = r3;
        r3 = r70;
        r70 = r101;
        r102 = r28;
        r28 = r22;
        r22 = r54;
        r54 = r102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0c01, code lost:
        r101 = r28;
        r28 = r22;
        r22 = r54;
        r54 = r101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0c09, code lost:
        r53 = r2;
        r4 = r20;
        r38 = r29;
        r39 = r30;
        r40 = r31;
        r41 = r32;
        r42 = r33;
        r45 = r46;
        r2 = r61;
        r60 = r62;
        r63 = r64;
        r65 = r66;
        r69 = r71;
        r61 = r22;
        r66 = r24;
        r64 = r25;
        r62 = r26;
        r71 = r28;
        r46 = r35;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0c09, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0c09, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0c09, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0c09, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0c09, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r104) {
        /*
            r103 = this;
            r0 = r104
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r103.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 5
            r5 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x01b9
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r13 = r0.mo24885n(r1, r13, r3, r14)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r3, r14)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r3, r14)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r3, r14)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r14)
            r15 = 6
            java.lang.Object r15 = r0.mo24885n(r1, r15, r3, r14)
            r6 = 7
            java.lang.Object r6 = r0.mo24885n(r1, r6, r3, r14)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r3, r14)
            r7 = 9
            java.lang.Object r7 = r0.mo24885n(r1, r7, r3, r14)
            r8 = 10
            java.lang.Object r8 = r0.mo24885n(r1, r8, r3, r14)
            r29 = r4
            r4 = 11
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r14)
            r30 = r4
            r4 = 12
            r31 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r14)
            r5 = 13
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            r32 = r4
            kotlinx.serialization.internal.i r4 = kotlinx.serialization.internal.C12278i.f30070a
            r33 = r5
            r5 = 14
            java.lang.Object r5 = r0.mo24885n(r1, r5, r4, r14)
            r34 = r5
            r5 = 15
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            r35 = r5
            r5 = 16
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            r28 = r5
            r5 = 17
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            r36 = r5
            r5 = 18
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            r37 = r5
            r5 = 19
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            r38 = r5
            r5 = 20
            java.lang.Object r5 = r0.mo24885n(r1, r5, r4, r14)
            r39 = r5
            r5 = 21
            java.lang.Object r5 = r0.mo24885n(r1, r5, r4, r14)
            r40 = r5
            r5 = 22
            java.lang.Object r5 = r0.mo24885n(r1, r5, r4, r14)
            r41 = r5
            r27 = r6
            r5 = 23
            r6 = r2[r5]
            java.lang.Object r5 = r0.mo24885n(r1, r5, r6, r14)
            r26 = r5
            r6 = 24
            r5 = r2[r6]
            java.lang.Object r5 = r0.mo24885n(r1, r6, r5, r14)
            r6 = 25
            r42 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r6, r5, r14)
            r25 = r5
            r6 = 26
            r5 = r2[r6]
            java.lang.Object r5 = r0.mo24885n(r1, r6, r5, r14)
            r6 = 27
            java.lang.Object r6 = r0.mo24885n(r1, r6, r3, r14)
            r43 = r5
            r24 = r6
            r5 = 28
            r6 = r2[r5]
            java.lang.Object r5 = r0.mo24885n(r1, r5, r6, r14)
            r6 = 29
            java.lang.Object r6 = r0.mo24885n(r1, r6, r3, r14)
            r44 = r5
            r5 = 30
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            r45 = r5
            r23 = r6
            r5 = 31
            r6 = r2[r5]
            java.lang.Object r5 = r0.mo24885n(r1, r5, r6, r14)
            r22 = r5
            r6 = 32
            r5 = r2[r6]
            java.lang.Object r5 = r0.mo24885n(r1, r6, r5, r14)
            r21 = r5
            r6 = 33
            r5 = r2[r6]
            java.lang.Object r5 = r0.mo24885n(r1, r6, r5, r14)
            r6 = 34
            java.lang.Object r6 = r0.mo24885n(r1, r6, r3, r14)
            r46 = r5
            r20 = r6
            r5 = 35
            r6 = r2[r5]
            java.lang.Object r5 = r0.mo24885n(r1, r5, r6, r14)
            r6 = 36
            java.lang.Object r3 = r0.mo24885n(r1, r6, r3, r14)
            r19 = r3
            r6 = 37
            r3 = r2[r6]
            java.lang.Object r3 = r0.mo24885n(r1, r6, r3, r14)
            r6 = 38
            java.lang.Object r6 = r0.mo24885n(r1, r6, r4, r14)
            r47 = r3
            r18 = r5
            r3 = 39
            r5 = r2[r3]
            java.lang.Object r3 = r0.mo24885n(r1, r3, r5, r14)
            r5 = 40
            java.lang.Object r5 = r0.mo24885n(r1, r5, r4, r14)
            r48 = r3
            r17 = r5
            r3 = 41
            r5 = r2[r3]
            java.lang.Object r3 = r0.mo24885n(r1, r3, r5, r14)
            r16 = r3
            r5 = 42
            r3 = r2[r5]
            java.lang.Object r3 = r0.mo24885n(r1, r5, r3, r14)
            r5 = 43
            r2 = r2[r5]
            java.lang.Object r2 = r0.mo24885n(r1, r5, r2, r14)
            r5 = 44
            boolean r5 = r0.mo24866C(r1, r5)
            r104 = r2
            r2 = 45
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r14)
            r49 = r2
            r2 = 46
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r14)
            r4 = 32767(0x7fff, float:4.5916E-41)
            r14 = -1
            r52 = r4
            r97 = r5
            r51 = r14
            r4 = r29
            r5 = r31
            r14 = r3
            r29 = r12
            r3 = r19
            r12 = r10
            r19 = r13
            r10 = r9
            r13 = r11
            r11 = r6
            r9 = r8
            r6 = r27
            r8 = r7
            r27 = r15
            r15 = r28
            r7 = r2
            r2 = r104
            goto L_0x0cbb
        L_0x01b9:
            r72 = r12
            r3 = r13
            r36 = r3
            r68 = r36
            r4 = r14
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r37 = r15
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
            r54 = r53
            r55 = r54
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
        L_0x020f:
            if (r72 == 0) goto L_0x0c31
            r73 = r8
            int r8 = r0.mo24931o(r1)
            switch(r8) {
                case -1: goto L_0x0bbd;
                case 0: goto L_0x0b63;
                case 1: goto L_0x0b13;
                case 2: goto L_0x0ac9;
                case 3: goto L_0x0a84;
                case 4: goto L_0x0a3f;
                case 5: goto L_0x09f9;
                case 6: goto L_0x09b5;
                case 7: goto L_0x097b;
                case 8: goto L_0x0943;
                case 9: goto L_0x0900;
                case 10: goto L_0x08b6;
                case 11: goto L_0x0881;
                case 12: goto L_0x084b;
                case 13: goto L_0x0813;
                case 14: goto L_0x07c4;
                case 15: goto L_0x078c;
                case 16: goto L_0x073a;
                case 17: goto L_0x06ef;
                case 18: goto L_0x06be;
                case 19: goto L_0x068c;
                case 20: goto L_0x065a;
                case 21: goto L_0x0628;
                case 22: goto L_0x05f4;
                case 23: goto L_0x05c4;
                case 24: goto L_0x0584;
                case 25: goto L_0x0536;
                case 26: goto L_0x04ea;
                case 27: goto L_0x04ad;
                case 28: goto L_0x0461;
                case 29: goto L_0x0428;
                case 30: goto L_0x03d8;
                case 31: goto L_0x03bb;
                case 32: goto L_0x0378;
                case 33: goto L_0x0361;
                case 34: goto L_0x0322;
                case 35: goto L_0x02f6;
                case 36: goto L_0x02c7;
                case 37: goto L_0x02b5;
                case 38: goto L_0x02a1;
                case 39: goto L_0x0290;
                case 40: goto L_0x027c;
                case 41: goto L_0x026f;
                case 42: goto L_0x0260;
                case 43: goto L_0x024d;
                case 44: goto L_0x023b;
                case 45: goto L_0x022e;
                case 46: goto L_0x0220;
                default: goto L_0x021a;
            }
        L_0x021a:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x0220:
            r8 = 46
            r74 = r15
            kotlinx.serialization.internal.i r15 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r7 = r0.mo24885n(r1, r8, r15, r7)
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            goto L_0x029c
        L_0x022e:
            r74 = r15
            r8 = 45
            kotlinx.serialization.internal.i r15 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r6 = r0.mo24885n(r1, r8, r15, r6)
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            goto L_0x029c
        L_0x023b:
            r74 = r15
            r8 = 44
            boolean r8 = r0.mo24866C(r1, r8)
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r20 = r4
            r36 = r8
            goto L_0x02da
        L_0x024d:
            r74 = r15
            r15 = 43
            r8 = r2[r15]
            java.lang.Object r8 = r0.mo24885n(r1, r15, r8, r9)
            r3 = r3 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            r20 = r4
            r9 = r8
            goto L_0x02da
        L_0x0260:
            r74 = r15
            r8 = 42
            r15 = r2[r8]
            java.lang.Object r14 = r0.mo24885n(r1, r8, r15, r14)
            r3 = r3 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            goto L_0x029e
        L_0x026f:
            r74 = r15
            r15 = 41
            r8 = r2[r15]
            java.lang.Object r4 = r0.mo24885n(r1, r15, r8, r4)
            r3 = r3 | 512(0x200, float:7.175E-43)
            goto L_0x029c
        L_0x027c:
            r74 = r15
            r15 = 41
            r8 = 40
            kotlinx.serialization.internal.i r15 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r15, r10)
            r3 = r3 | 256(0x100, float:3.59E-43)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            r20 = r4
            r10 = r8
            goto L_0x02da
        L_0x0290:
            r74 = r15
            r15 = 39
            r8 = r2[r15]
            java.lang.Object r5 = r0.mo24885n(r1, r15, r8, r5)
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x029c:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
        L_0x029e:
            r20 = r4
            goto L_0x02da
        L_0x02a1:
            r74 = r15
            r15 = 39
            r8 = 38
            kotlinx.serialization.internal.i r15 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r15, r11)
            r3 = r3 | 64
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            r20 = r4
            r11 = r8
            goto L_0x02da
        L_0x02b5:
            r74 = r15
            r15 = 37
            r8 = r2[r15]
            java.lang.Object r8 = r0.mo24885n(r1, r15, r8, r12)
            r3 = r3 | 32
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            r20 = r4
            r12 = r8
            goto L_0x02da
        L_0x02c7:
            r74 = r15
            r15 = 37
            r8 = 36
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r15, r13)
            r3 = r3 | 16
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r20 = r4
            r13 = r8
        L_0x02da:
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r28 = r71
            r8 = r73
            r15 = r74
            goto L_0x0350
        L_0x02f6:
            r74 = r15
            r15 = 35
            r8 = r2[r15]
            r20 = r4
            r4 = r74
            java.lang.Object r4 = r0.mo24885n(r1, r15, r8, r4)
            r3 = r3 | 8
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r15 = r4
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r28 = r71
            r8 = r73
            goto L_0x0350
        L_0x0322:
            r20 = r4
            r4 = r15
            r15 = 35
            r8 = 34
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r75 = r4
            r4 = r73
            java.lang.Object r4 = r0.mo24885n(r1, r8, r15, r4)
            r3 = r3 | 4
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r8 = r4
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r28 = r71
            r15 = r75
        L_0x0350:
            r4 = 0
            r61 = r2
            r46 = r45
            r2 = r53
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            goto L_0x0c09
        L_0x0361:
            r20 = r4
            r75 = r15
            r4 = r73
            r15 = 33
            r8 = r2[r15]
            r4 = r71
            java.lang.Object r4 = r0.mo24885n(r1, r15, r8, r4)
            r3 = r3 | 2
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r28 = r4
            goto L_0x0392
        L_0x0378:
            r20 = r4
            r75 = r15
            r4 = r71
            r8 = 32
            r15 = r2[r8]
            r22 = r4
            r4 = r70
            java.lang.Object r4 = r0.mo24885n(r1, r8, r15, r4)
            r3 = r3 | 1
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r70 = r4
            r28 = r22
        L_0x0392:
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r71 = r69
            r8 = r73
            r15 = r75
            r4 = 0
            r61 = r2
            r46 = r45
            r2 = r53
            r62 = r60
            r64 = r63
            r66 = r65
            goto L_0x0c09
        L_0x03bb:
            r20 = r4
            r75 = r15
            r4 = r70
            r22 = r71
            r15 = 31
            r8 = r2[r15]
            r70 = r3
            r3 = r69
            java.lang.Object r3 = r0.mo24885n(r1, r15, r8, r3)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r68 | r8
            kotlin.d2 r68 = kotlin.C11079d2.f28267a
            r71 = r3
            goto L_0x03fa
        L_0x03d8:
            r20 = r4
            r75 = r15
            r4 = r70
            r22 = r71
            r15 = 31
            r70 = r3
            r3 = r69
            r8 = 30
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r71 = r3
            r3 = r67
            java.lang.Object r3 = r0.mo24885n(r1, r8, r15, r3)
            r8 = 1073741824(0x40000000, float:2.0)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r67 = r3
        L_0x03fa:
            r68 = r8
            r28 = r22
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r3 = r70
            r8 = r73
            r15 = r75
            r61 = r2
            r70 = r4
            r46 = r45
            r2 = r53
            r62 = r60
            r64 = r63
            r66 = r65
            goto L_0x0789
        L_0x0428:
            r20 = r4
            r75 = r15
            r4 = r70
            r22 = r71
            r70 = r3
            r3 = r67
            r71 = r69
            r8 = 29
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r66
            java.lang.Object r3 = r0.mo24885n(r1, r8, r15, r3)
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r24 = r3
            r68 = r8
            r28 = r22
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
            r25 = r64
            r66 = r65
            goto L_0x0499
        L_0x0461:
            r20 = r4
            r75 = r15
            r4 = r70
            r22 = r71
            r15 = 28
            r70 = r3
            r3 = r66
            r71 = r69
            r8 = r2[r15]
            r24 = r3
            r3 = r65
            java.lang.Object r3 = r0.mo24885n(r1, r15, r8, r3)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r8 = r68 | r8
            kotlin.d2 r65 = kotlin.C11079d2.f28267a
            r66 = r3
            r68 = r8
            r28 = r22
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
            r25 = r64
        L_0x0499:
            r3 = r70
            r8 = r73
            r15 = r75
            r61 = r2
            r70 = r4
            r46 = r45
            r2 = r53
            r62 = r60
            r64 = r63
            goto L_0x0789
        L_0x04ad:
            r20 = r4
            r75 = r15
            r24 = r66
            r4 = r70
            r22 = r71
            r15 = 28
            r70 = r3
            r3 = r65
            r71 = r69
            r8 = 27
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r66 = r3
            r3 = r64
            java.lang.Object r3 = r0.mo24885n(r1, r8, r15, r3)
            r8 = 134217728(0x8000000, float:3.85186E-34)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r25 = r3
            r68 = r8
            r28 = r22
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
            r64 = r63
            goto L_0x0524
        L_0x04ea:
            r20 = r4
            r75 = r15
            r24 = r66
            r4 = r70
            r22 = r71
            r15 = 26
            r70 = r3
            r3 = r64
            r66 = r65
            r71 = r69
            r8 = r2[r15]
            r25 = r3
            r3 = r63
            java.lang.Object r3 = r0.mo24885n(r1, r15, r8, r3)
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            r8 = r68 | r8
            kotlin.d2 r63 = kotlin.C11079d2.f28267a
            r64 = r3
            r68 = r8
            r28 = r22
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r22 = r61
            r26 = r62
        L_0x0524:
            r3 = r70
            r8 = r73
            r15 = r75
            r61 = r2
            r70 = r4
            r46 = r45
            r2 = r53
            r62 = r60
            goto L_0x0789
        L_0x0536:
            r20 = r4
            r75 = r15
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r15 = 26
            r70 = r3
            r3 = r63
            r66 = r65
            r71 = r69
            r8 = 25
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees$$serializer r15 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees$$serializer.INSTANCE
            r64 = r3
            r3 = r62
            java.lang.Object r3 = r0.mo24885n(r1, r8, r15, r3)
            r8 = 33554432(0x2000000, float:9.403955E-38)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r26 = r3
            r68 = r8
            r28 = r22
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r62 = r60
            r22 = r61
            r3 = r70
            r8 = r73
            r15 = r75
            r61 = r2
            r70 = r4
            r46 = r45
            r2 = r53
            goto L_0x0789
        L_0x0584:
            r20 = r4
            r75 = r15
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r15 = 24
            r70 = r3
            r3 = r62
            r64 = r63
            r66 = r65
            r71 = r69
            r8 = r2[r15]
            r26 = r3
            r3 = r61
            java.lang.Object r3 = r0.mo24885n(r1, r15, r8, r3)
            r8 = 16777216(0x1000000, float:2.3509887E-38)
            r8 = r68 | r8
            kotlin.d2 r61 = kotlin.C11079d2.f28267a
            r61 = r2
            r68 = r8
            r28 = r22
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r2 = r53
            r62 = r60
            goto L_0x0731
        L_0x05c4:
            r20 = r4
            r75 = r15
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r8 = 23
            r70 = r3
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r15 = r2[r8]
            r61 = r2
            r2 = r60
            java.lang.Object r2 = r0.mo24885n(r1, r8, r15, r2)
            r15 = 8388608(0x800000, float:1.17549435E-38)
            r15 = r68 | r15
            kotlin.d2 r60 = kotlin.C11079d2.f28267a
            r62 = r2
            r68 = r15
            goto L_0x0721
        L_0x05f4:
            r20 = r4
            r75 = r15
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r8 = 23
            r70 = r3
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r61 = r2
            r2 = r60
            r15 = 22
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r62 = r2
            r2 = r59
            java.lang.Object r2 = r0.mo24885n(r1, r15, r8, r2)
            r8 = 4194304(0x400000, float:5.877472E-39)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r59 = r2
            goto L_0x071f
        L_0x0628:
            r20 = r4
            r75 = r15
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r70 = r3
            r62 = r60
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r61 = r2
            r2 = r59
            r8 = 21
            kotlinx.serialization.internal.i r15 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = r58
            java.lang.Object r2 = r0.mo24885n(r1, r8, r15, r2)
            r8 = 2097152(0x200000, float:2.938736E-39)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r58 = r2
            goto L_0x071f
        L_0x065a:
            r20 = r4
            r75 = r15
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r70 = r3
            r62 = r60
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r61 = r2
            r2 = r58
            r8 = 20
            kotlinx.serialization.internal.i r15 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = r57
            java.lang.Object r2 = r0.mo24885n(r1, r8, r15, r2)
            r8 = 1048576(0x100000, float:1.469368E-39)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r57 = r2
            goto L_0x071f
        L_0x068c:
            r20 = r4
            r75 = r15
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r70 = r3
            r62 = r60
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r61 = r2
            r2 = r57
            r8 = 19
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r56
            java.lang.Object r2 = r0.mo24885n(r1, r8, r15, r2)
            r8 = 524288(0x80000, float:7.34684E-40)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r56 = r2
            goto L_0x071f
        L_0x06be:
            r20 = r4
            r75 = r15
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r70 = r3
            r62 = r60
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r61 = r2
            r2 = r56
            r8 = 18
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r55
            java.lang.Object r2 = r0.mo24885n(r1, r8, r15, r2)
            r8 = 262144(0x40000, float:3.67342E-40)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r55 = r2
            goto L_0x071f
        L_0x06ef:
            r20 = r4
            r75 = r15
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r70 = r3
            r62 = r60
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r61 = r2
            r2 = r55
            r8 = 17
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r54
            java.lang.Object r2 = r0.mo24885n(r1, r8, r15, r2)
            r8 = 131072(0x20000, float:1.83671E-40)
            r8 = r68 | r8
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r54 = r2
        L_0x071f:
            r68 = r8
        L_0x0721:
            r28 = r22
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r2 = r53
        L_0x0731:
            r8 = r73
            r15 = r75
            r22 = r3
            r46 = r45
            goto L_0x0785
        L_0x073a:
            r20 = r4
            r75 = r15
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r70 = r3
            r62 = r60
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r61 = r2
            r2 = r54
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r28 = r2
            r15 = r53
            r2 = 16
            java.lang.Object r8 = r0.mo24885n(r1, r2, r8, r15)
            r15 = 65536(0x10000, float:9.18355E-41)
            r15 = r68 | r15
            kotlin.d2 r53 = kotlin.C11079d2.f28267a
            r2 = r8
            r68 = r15
            r54 = r28
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r8 = r73
            r15 = r75
            r28 = r22
            r46 = r45
            r22 = r3
        L_0x0785:
            r3 = r70
            r70 = r4
        L_0x0789:
            r4 = 0
            goto L_0x0c09
        L_0x078c:
            r20 = r4
            r75 = r15
            r15 = r53
            r28 = r54
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r70 = r3
            r62 = r60
            r3 = r61
            r64 = r63
            r66 = r65
            r71 = r69
            r61 = r2
            r2 = 16
            r8 = 15
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r54 = r3
            r3 = r52
            java.lang.Object r2 = r0.mo24885n(r1, r8, r2, r3)
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r68 | r3
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r52 = r2
            goto L_0x07f8
        L_0x07c4:
            r20 = r4
            r75 = r15
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r4 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r3 = r52
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r2 = 14
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r51
            java.lang.Object r2 = r0.mo24885n(r1, r2, r8, r3)
            r8 = r68
            r3 = r8 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r51 = r2
        L_0x07f8:
            r68 = r3
            r2 = r15
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r3 = r70
            r8 = r73
            r15 = r75
            r70 = r4
            r46 = r45
            goto L_0x0b60
        L_0x0813:
            r20 = r4
            r75 = r15
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r4 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r3 = r51
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r2 = 13
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r68 = r4
            r4 = r50
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r8 | 8192(0x2000, float:1.14794E-41)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r50 = r2
            goto L_0x08ea
        L_0x084b:
            r20 = r4
            r75 = r15
            r4 = r50
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r2 = 12
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation$$serializer.INSTANCE
            r4 = r49
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r8 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r49 = r2
            goto L_0x08ea
        L_0x0881:
            r20 = r4
            r75 = r15
            r4 = r49
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r2 = 11
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r48
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r8 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r48 = r2
            goto L_0x08ea
        L_0x08b6:
            r20 = r4
            r75 = r15
            r4 = r48
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r2 = 10
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r47
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r8 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r47 = r2
        L_0x08ea:
            r2 = r15
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r46
            r8 = r73
            r15 = r75
            r4 = 0
            r46 = r45
            goto L_0x0bac
        L_0x0900:
            r20 = r4
            r75 = r15
            r4 = r47
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r2 = 9
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r46
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r8 | 512(0x200, float:7.175E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r35 = r2
            r2 = r15
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r46 = r45
            goto L_0x0b0c
        L_0x0943:
            r20 = r4
            r75 = r15
            r4 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r35 = r4
            r3 = r45
            r4 = 8
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r8 | 256(0x100, float:3.59E-43)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r46 = r2
            goto L_0x09ec
        L_0x097b:
            r20 = r4
            r75 = r15
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r4 = 8
            r61 = r2
            r70 = r3
            r3 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r2 = 7
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r46 = r3
            r3 = r44
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = r8 | 128(0x80, float:1.794E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r44 = r2
            goto L_0x09ec
        L_0x09b5:
            r20 = r4
            r75 = r15
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r3 = r44
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r2 = 6
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r43
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = r8 | 64
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r43 = r2
        L_0x09ec:
            r2 = r15
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            goto L_0x0b0c
        L_0x09f9:
            r20 = r4
            r75 = r15
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r3 = r43
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r34 = r3
            r4 = r42
            r3 = 5
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r4 = r8 | 32
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r33 = r2
            r2 = r15
            r43 = r34
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            goto L_0x0b56
        L_0x0a3f:
            r20 = r4
            r75 = r15
            r4 = r42
            r34 = r43
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r3 = 5
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r33 = r4
            r3 = r41
            r4 = 4
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r8 | 16
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r32 = r2
            r2 = r15
            r29 = r38
            r30 = r39
            r31 = r40
            goto L_0x0b0c
        L_0x0a84:
            r20 = r4
            r75 = r15
            r33 = r42
            r34 = r43
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r4 = 4
            r61 = r2
            r70 = r3
            r3 = r41
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r32 = r3
            r4 = r40
            r3 = 3
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r4 = r8 | 8
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r31 = r2
            r2 = r15
            r29 = r38
            r30 = r39
            goto L_0x0b56
        L_0x0ac9:
            r20 = r4
            r75 = r15
            r4 = r40
            r32 = r41
            r33 = r42
            r34 = r43
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r3 = 3
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r31 = r4
            r3 = r39
            r4 = 2
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r8 | 4
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r30 = r2
            r2 = r15
            r29 = r38
        L_0x0b0c:
            r8 = r73
            r15 = r75
            r4 = 0
            goto L_0x0bac
        L_0x0b13:
            r20 = r4
            r75 = r15
            r31 = r40
            r32 = r41
            r33 = r42
            r34 = r43
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r4 = 2
            r61 = r2
            r70 = r3
            r3 = r39
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r30 = r3
            r4 = r38
            r3 = 1
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r4 = r8 | 2
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r29 = r2
            r2 = r15
        L_0x0b56:
            r3 = r70
            r8 = r73
            r15 = r75
            r70 = r68
            r68 = r4
        L_0x0b60:
            r4 = 0
            goto L_0x0c01
        L_0x0b63:
            r20 = r4
            r75 = r15
            r4 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r34 = r43
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r61 = r2
            r70 = r3
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r3 = 1
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r29 = r4
            r3 = r37
            r4 = 0
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r8 | 1
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r37 = r2
            r2 = r15
            r8 = r73
            r15 = r75
        L_0x0bac:
            r101 = r68
            r68 = r3
            r3 = r70
            r70 = r101
            r102 = r28
            r28 = r22
            r22 = r54
            r54 = r102
            goto L_0x0c09
        L_0x0bbd:
            r20 = r4
            r75 = r15
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r34 = r43
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r4 = 0
            r61 = r2
            r70 = r3
            r3 = r37
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            kotlin.d2 r2 = kotlin.C11079d2.f28267a
            r72 = r4
            r2 = r15
            r3 = r70
            r15 = r75
            r70 = r68
            r68 = r8
            r8 = r73
        L_0x0c01:
            r101 = r28
            r28 = r22
            r22 = r54
            r54 = r101
        L_0x0c09:
            r53 = r2
            r4 = r20
            r38 = r29
            r39 = r30
            r40 = r31
            r41 = r32
            r42 = r33
            r45 = r46
            r2 = r61
            r60 = r62
            r63 = r64
            r65 = r66
            r69 = r71
            r61 = r22
            r66 = r24
            r64 = r25
            r62 = r26
            r71 = r28
            r46 = r35
            goto L_0x020f
        L_0x0c31:
            r20 = r4
            r73 = r8
            r75 = r15
            r29 = r38
            r30 = r39
            r31 = r40
            r32 = r41
            r33 = r42
            r34 = r43
            r35 = r46
            r15 = r53
            r28 = r54
            r54 = r61
            r26 = r62
            r25 = r64
            r24 = r66
            r8 = r68
            r68 = r70
            r22 = r71
            r70 = r3
            r3 = r37
            r46 = r45
            r62 = r60
            r64 = r63
            r66 = r65
            r71 = r69
            r19 = r3
            r2 = r9
            r17 = r10
            r3 = r13
            r16 = r20
            r23 = r24
            r24 = r25
            r25 = r26
            r13 = r30
            r4 = r33
            r27 = r34
            r97 = r36
            r10 = r46
            r9 = r47
            r30 = r48
            r33 = r50
            r34 = r51
            r42 = r54
            r37 = r55
            r38 = r56
            r39 = r57
            r40 = r58
            r41 = r59
            r26 = r62
            r43 = r64
            r45 = r67
            r21 = r68
            r20 = r73
            r18 = r75
            r48 = r5
            r51 = r8
            r47 = r12
            r46 = r22
            r36 = r28
            r5 = r31
            r12 = r32
            r8 = r35
            r32 = r49
            r35 = r52
            r52 = r70
            r22 = r71
            r49 = r6
            r6 = r44
            r44 = r66
        L_0x0cbb:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility
            r50 = r0
            r53 = r19
            java.lang.String r53 = (java.lang.String) r53
            r54 = r29
            java.lang.String r54 = (java.lang.String) r54
            r55 = r13
            java.lang.String r55 = (java.lang.String) r55
            r56 = r5
            java.lang.String r56 = (java.lang.String) r56
            r57 = r12
            java.lang.String r57 = (java.lang.String) r57
            r58 = r4
            java.lang.String r58 = (java.lang.String) r58
            r59 = r27
            java.lang.String r59 = (java.lang.String) r59
            r60 = r6
            java.lang.String r60 = (java.lang.String) r60
            r61 = r10
            java.lang.String r61 = (java.lang.String) r61
            r62 = r8
            java.lang.String r62 = (java.lang.String) r62
            r63 = r9
            java.lang.String r63 = (java.lang.String) r63
            r64 = r30
            java.lang.String r64 = (java.lang.String) r64
            r65 = r32
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation r65 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation) r65
            r66 = r33
            java.lang.String r66 = (java.lang.String) r66
            r67 = r34
            java.lang.Boolean r67 = (java.lang.Boolean) r67
            r68 = r35
            java.lang.String r68 = (java.lang.String) r68
            r69 = r15
            java.lang.String r69 = (java.lang.String) r69
            r70 = r36
            java.lang.String r70 = (java.lang.String) r70
            r71 = r37
            java.lang.String r71 = (java.lang.String) r71
            r72 = r38
            java.lang.String r72 = (java.lang.String) r72
            r73 = r39
            java.lang.Boolean r73 = (java.lang.Boolean) r73
            r74 = r40
            java.lang.Boolean r74 = (java.lang.Boolean) r74
            r75 = r41
            java.lang.Boolean r75 = (java.lang.Boolean) r75
            r76 = r26
            java.util.List r76 = (java.util.List) r76
            r77 = r42
            java.util.List r77 = (java.util.List) r77
            r78 = r25
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees r78 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees) r78
            r79 = r43
            java.util.List r79 = (java.util.List) r79
            r80 = r24
            java.lang.String r80 = (java.lang.String) r80
            r81 = r44
            java.math.BigDecimal r81 = (java.math.BigDecimal) r81
            r82 = r23
            java.lang.String r82 = (java.lang.String) r82
            r83 = r45
            java.lang.String r83 = (java.lang.String) r83
            r84 = r22
            java.math.BigDecimal r84 = (java.math.BigDecimal) r84
            r85 = r21
            java.math.BigDecimal r85 = (java.math.BigDecimal) r85
            r86 = r46
            java.math.BigDecimal r86 = (java.math.BigDecimal) r86
            r87 = r20
            java.lang.String r87 = (java.lang.String) r87
            r88 = r18
            java.math.BigDecimal r88 = (java.math.BigDecimal) r88
            r89 = r3
            java.lang.String r89 = (java.lang.String) r89
            r90 = r47
            java.math.BigDecimal r90 = (java.math.BigDecimal) r90
            r91 = r11
            java.lang.Boolean r91 = (java.lang.Boolean) r91
            r92 = r48
            java.util.List r92 = (java.util.List) r92
            r93 = r17
            java.lang.Boolean r93 = (java.lang.Boolean) r93
            r94 = r16
            java.math.BigDecimal r94 = (java.math.BigDecimal) r94
            r95 = r14
            java.util.List r95 = (java.util.List) r95
            r96 = r2
            java.util.List r96 = (java.util.List) r96
            r98 = r49
            java.lang.Boolean r98 = (java.lang.Boolean) r98
            r99 = r7
            java.lang.Boolean r99 = (java.lang.Boolean) r99
            r100 = 0
            r50.<init>((int) r51, (int) r52, (java.lang.String) r53, (java.lang.String) r54, (java.lang.String) r55, (java.lang.String) r56, (java.lang.String) r57, (java.lang.String) r58, (java.lang.String) r59, (java.lang.String) r60, (java.lang.String) r61, (java.lang.String) r62, (java.lang.String) r63, (java.lang.String) r64, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation) r65, (java.lang.String) r66, (java.lang.Boolean) r67, (java.lang.String) r68, (java.lang.String) r69, (java.lang.String) r70, (java.lang.String) r71, (java.lang.String) r72, (java.lang.Boolean) r73, (java.lang.Boolean) r74, (java.lang.Boolean) r75, (java.util.List) r76, (java.util.List) r77, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees) r78, (java.util.List) r79, (java.lang.String) r80, (java.math.BigDecimal) r81, (java.lang.String) r82, (java.lang.String) r83, (java.math.BigDecimal) r84, (java.math.BigDecimal) r85, (java.math.BigDecimal) r86, (java.lang.String) r87, (java.math.BigDecimal) r88, (java.lang.String) r89, (java.math.BigDecimal) r90, (java.lang.Boolean) r91, (java.util.List) r92, (java.lang.Boolean) r93, (java.math.BigDecimal) r94, (java.util.List) r95, (java.util.List) r96, (boolean) r97, (java.lang.Boolean) r98, (java.lang.Boolean) r99, (kotlinx.serialization.internal.C12295n1) r100)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffCommonDetailedFacility bffCommonDetailedFacility) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffCommonDetailedFacility, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffCommonDetailedFacility.write$Self(bffCommonDetailedFacility, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
