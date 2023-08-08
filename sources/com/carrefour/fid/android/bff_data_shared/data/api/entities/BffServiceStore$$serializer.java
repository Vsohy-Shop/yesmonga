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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceStore.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceStore;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffServiceStore$$serializer implements C12327y<BffServiceStore> {
    @C12579k
    public static final BffServiceStore$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffServiceStore$$serializer bffServiceStore$$serializer = new BffServiceStore$$serializer();
        INSTANCE = bffServiceStore$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceStore", bffServiceStore$$serializer, 46);
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
        pluginGeneratedSerialDescriptor.mo24966k("yield_eligible", true);
        pluginGeneratedSerialDescriptor.mo24966k("facility_has_in_store_service", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffServiceStore$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffServiceStore.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        C12278i iVar = C12278i.f30070a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffAdditionalServiceInformation$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[23]), C12197a.m48817q(access$get$childSerializers$cp[24]), C12197a.m48817q(BffServiceFees$$serializer.INSTANCE), C12197a.m48817q(access$get$childSerializers$cp[26]), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[28]), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[31]), C12197a.m48817q(access$get$childSerializers$cp[32]), C12197a.m48817q(access$get$childSerializers$cp[33]), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[35]), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[37]), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[39]), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[41]), C12197a.m48817q(access$get$childSerializers$cp[42]), C12197a.m48817q(access$get$childSerializers$cp[43]), C12197a.m48817q(iVar), C12197a.m48817q(iVar)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v8, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v9, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0276, code lost:
        r7 = kotlin.C11079d2.f28267a;
        r20 = r4;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x02c6, code lost:
        r29 = r37;
        r30 = r38;
        r31 = r39;
        r32 = r40;
        r33 = r41;
        r35 = r45;
        r22 = r60;
        r26 = r61;
        r25 = r63;
        r24 = r65;
        r28 = r70;
        r7 = r72;
        r8 = r73;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x033c, code lost:
        r60 = r2;
        r45 = r44;
        r2 = r52;
        r61 = r59;
        r63 = r62;
        r65 = r64;
        r70 = r68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x037e, code lost:
        r29 = r37;
        r30 = r38;
        r31 = r39;
        r32 = r40;
        r33 = r41;
        r35 = r45;
        r22 = r60;
        r26 = r61;
        r25 = r63;
        r24 = r65;
        r70 = r68;
        r7 = r72;
        r8 = r74;
        r60 = r2;
        r45 = r44;
        r2 = r52;
        r61 = r59;
        r63 = r62;
        r65 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x03e6, code lost:
        r67 = r7;
        r28 = r22;
        r29 = r37;
        r30 = r38;
        r31 = r39;
        r32 = r40;
        r33 = r41;
        r35 = r45;
        r22 = r60;
        r26 = r61;
        r25 = r63;
        r24 = r65;
        r3 = r69;
        r7 = r72;
        r8 = r74;
        r60 = r2;
        r69 = r4;
        r45 = r44;
        r2 = r52;
        r61 = r59;
        r63 = r62;
        r65 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0485, code lost:
        r3 = r69;
        r7 = r72;
        r8 = r74;
        r60 = r2;
        r69 = r4;
        r45 = r44;
        r2 = r52;
        r61 = r59;
        r63 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0510, code lost:
        r3 = r69;
        r7 = r72;
        r8 = r74;
        r60 = r2;
        r69 = r4;
        r45 = r44;
        r2 = r52;
        r61 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x070b, code lost:
        r67 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x070d, code lost:
        r28 = r22;
        r29 = r37;
        r30 = r38;
        r31 = r39;
        r32 = r40;
        r33 = r41;
        r35 = r45;
        r2 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x071d, code lost:
        r7 = r72;
        r8 = r74;
        r22 = r3;
        r45 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0771, code lost:
        r3 = r69;
        r69 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x07e4, code lost:
        r67 = r3;
        r2 = r8;
        r29 = r37;
        r30 = r38;
        r31 = r39;
        r32 = r40;
        r33 = r41;
        r35 = r45;
        r3 = r69;
        r7 = r72;
        r8 = r74;
        r69 = r4;
        r45 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x08d6, code lost:
        r2 = r8;
        r29 = r37;
        r30 = r38;
        r31 = r39;
        r32 = r40;
        r33 = r41;
        r35 = r45;
        r7 = r72;
        r8 = r74;
        r45 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x09d8, code lost:
        r2 = r8;
        r29 = r37;
        r30 = r38;
        r31 = r39;
        r32 = r40;
        r33 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0af8, code lost:
        r7 = r72;
        r8 = r74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0b42, code lost:
        r3 = r69;
        r7 = r72;
        r8 = r74;
        r69 = r67;
        r67 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0b98, code lost:
        r99 = r67;
        r67 = r3;
        r3 = r69;
        r69 = r99;
        r100 = r28;
        r28 = r22;
        r22 = r53;
        r53 = r100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0bed, code lost:
        r99 = r28;
        r28 = r22;
        r22 = r53;
        r53 = r99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0bf5, code lost:
        r52 = r2;
        r4 = r20;
        r37 = r29;
        r38 = r30;
        r39 = r31;
        r40 = r32;
        r41 = r33;
        r44 = r45;
        r2 = r60;
        r59 = r61;
        r62 = r63;
        r64 = r65;
        r68 = r70;
        r60 = r22;
        r65 = r24;
        r63 = r25;
        r61 = r26;
        r70 = r28;
        r45 = r35;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0bf5, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0bf5, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0bf5, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0bf5, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0bf5, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceStore deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r102) {
        /*
            r101 = this;
            r0 = r102
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r101.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceStore.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 5
            r5 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x01b1
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
            java.lang.Object r5 = r0.mo24885n(r1, r5, r4, r14)
            r102 = r2
            r2 = 45
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r14)
            r4 = 16383(0x3fff, float:2.2957E-41)
            r14 = -1
            r51 = r4
            r4 = r29
            r50 = r34
            r29 = r12
            r34 = r15
            r12 = r6
            r15 = r11
            r6 = r2
            r11 = r9
            r2 = r102
            r9 = r5
            r5 = r31
            r99 = r14
            r14 = r3
            r3 = r19
            r19 = r13
            r13 = r10
            r10 = r8
            r8 = r28
            r28 = r99
            goto L_0x0ca0
        L_0x01b1:
            r71 = r12
            r3 = r13
            r67 = r3
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
            r68 = r66
            r69 = r68
            r70 = r69
        L_0x0205:
            if (r71 == 0) goto L_0x0c1d
            r72 = r7
            int r7 = r0.mo24931o(r1)
            switch(r7) {
                case -1: goto L_0x0ba9;
                case 0: goto L_0x0b4f;
                case 1: goto L_0x0aff;
                case 2: goto L_0x0ab5;
                case 3: goto L_0x0a70;
                case 4: goto L_0x0a2b;
                case 5: goto L_0x09e5;
                case 6: goto L_0x09a1;
                case 7: goto L_0x0967;
                case 8: goto L_0x092f;
                case 9: goto L_0x08ec;
                case 10: goto L_0x08a2;
                case 11: goto L_0x086d;
                case 12: goto L_0x0837;
                case 13: goto L_0x07ff;
                case 14: goto L_0x07b0;
                case 15: goto L_0x0778;
                case 16: goto L_0x0726;
                case 17: goto L_0x06db;
                case 18: goto L_0x06aa;
                case 19: goto L_0x0678;
                case 20: goto L_0x0646;
                case 21: goto L_0x0614;
                case 22: goto L_0x05e0;
                case 23: goto L_0x05b0;
                case 24: goto L_0x0570;
                case 25: goto L_0x0522;
                case 26: goto L_0x04d6;
                case 27: goto L_0x0499;
                case 28: goto L_0x044d;
                case 29: goto L_0x0414;
                case 30: goto L_0x03c4;
                case 31: goto L_0x03a7;
                case 32: goto L_0x0364;
                case 33: goto L_0x034d;
                case 34: goto L_0x030e;
                case 35: goto L_0x02e2;
                case 36: goto L_0x02b3;
                case 37: goto L_0x02a1;
                case 38: goto L_0x028d;
                case 39: goto L_0x027b;
                case 40: goto L_0x0268;
                case 41: goto L_0x0256;
                case 42: goto L_0x0243;
                case 43: goto L_0x0236;
                case 44: goto L_0x0223;
                case 45: goto L_0x0216;
                default: goto L_0x0210;
            }
        L_0x0210:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r7)
            throw r0
        L_0x0216:
            r7 = 45
            r73 = r8
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r6 = r0.mo24885n(r1, r7, r8, r6)
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0276
        L_0x0223:
            r73 = r8
            r7 = 44
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r9)
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r20 = r4
            r9 = r7
            goto L_0x02c6
        L_0x0236:
            r73 = r8
            r8 = 43
            r7 = r2[r8]
            java.lang.Object r4 = r0.mo24885n(r1, r8, r7, r4)
            r3 = r3 | 2048(0x800, float:2.87E-42)
            goto L_0x0276
        L_0x0243:
            r73 = r8
            r7 = 42
            r8 = r2[r7]
            java.lang.Object r8 = r0.mo24885n(r1, r7, r8, r14)
            r3 = r3 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            r20 = r4
            r14 = r8
            goto L_0x02c6
        L_0x0256:
            r73 = r8
            r8 = 41
            r7 = r2[r8]
            java.lang.Object r7 = r0.mo24885n(r1, r8, r7, r10)
            r3 = r3 | 512(0x200, float:7.175E-43)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            r20 = r4
            r10 = r7
            goto L_0x02c6
        L_0x0268:
            r73 = r8
            r8 = 41
            r7 = 40
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r5 = r0.mo24885n(r1, r7, r8, r5)
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x0276:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r20 = r4
            goto L_0x02c6
        L_0x027b:
            r73 = r8
            r8 = 39
            r7 = r2[r8]
            java.lang.Object r7 = r0.mo24885n(r1, r8, r7, r11)
            r3 = r3 | 128(0x80, float:1.794E-43)
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            r20 = r4
            r11 = r7
            goto L_0x02c6
        L_0x028d:
            r73 = r8
            r8 = 39
            r7 = 38
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r12)
            r3 = r3 | 64
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r20 = r4
            r12 = r7
            goto L_0x02c6
        L_0x02a1:
            r73 = r8
            r8 = 37
            r7 = r2[r8]
            java.lang.Object r7 = r0.mo24885n(r1, r8, r7, r13)
            r3 = r3 | 32
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r20 = r4
            r13 = r7
            goto L_0x02c6
        L_0x02b3:
            r73 = r8
            r8 = 37
            r7 = 36
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r8, r15)
            r3 = r3 | 16
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r20 = r4
            r15 = r7
        L_0x02c6:
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r28 = r70
            r7 = r72
            r8 = r73
            goto L_0x033c
        L_0x02e2:
            r73 = r8
            r8 = 35
            r7 = r2[r8]
            r20 = r4
            r4 = r73
            java.lang.Object r4 = r0.mo24885n(r1, r8, r7, r4)
            r3 = r3 | 8
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r8 = r4
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r28 = r70
            r7 = r72
            goto L_0x033c
        L_0x030e:
            r20 = r4
            r4 = r8
            r8 = 35
            r7 = 34
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r74 = r4
            r4 = r72
            java.lang.Object r4 = r0.mo24885n(r1, r7, r8, r4)
            r3 = r3 | 4
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r7 = r4
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r28 = r70
            r8 = r74
        L_0x033c:
            r4 = 0
            r60 = r2
            r45 = r44
            r2 = r52
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            goto L_0x0bf5
        L_0x034d:
            r20 = r4
            r74 = r8
            r4 = r72
            r8 = 33
            r7 = r2[r8]
            r4 = r70
            java.lang.Object r4 = r0.mo24885n(r1, r8, r7, r4)
            r3 = r3 | 2
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r28 = r4
            goto L_0x037e
        L_0x0364:
            r20 = r4
            r74 = r8
            r4 = r70
            r7 = 32
            r8 = r2[r7]
            r22 = r4
            r4 = r69
            java.lang.Object r4 = r0.mo24885n(r1, r7, r8, r4)
            r3 = r3 | 1
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r69 = r4
            r28 = r22
        L_0x037e:
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r70 = r68
            r7 = r72
            r8 = r74
            r4 = 0
            r60 = r2
            r45 = r44
            r2 = r52
            r61 = r59
            r63 = r62
            r65 = r64
            goto L_0x0bf5
        L_0x03a7:
            r20 = r4
            r74 = r8
            r4 = r69
            r22 = r70
            r8 = 31
            r7 = r2[r8]
            r69 = r3
            r3 = r68
            java.lang.Object r3 = r0.mo24885n(r1, r8, r7, r3)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r67 | r7
            kotlin.d2 r67 = kotlin.C11079d2.f28267a
            r70 = r3
            goto L_0x03e6
        L_0x03c4:
            r20 = r4
            r74 = r8
            r4 = r69
            r22 = r70
            r8 = 31
            r69 = r3
            r3 = r68
            r7 = 30
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r70 = r3
            r3 = r66
            java.lang.Object r3 = r0.mo24885n(r1, r7, r8, r3)
            r7 = 1073741824(0x40000000, float:2.0)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r66 = r3
        L_0x03e6:
            r67 = r7
            r28 = r22
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r3 = r69
            r7 = r72
            r8 = r74
            r60 = r2
            r69 = r4
            r45 = r44
            r2 = r52
            r61 = r59
            r63 = r62
            r65 = r64
            goto L_0x0775
        L_0x0414:
            r20 = r4
            r74 = r8
            r4 = r69
            r22 = r70
            r69 = r3
            r3 = r66
            r70 = r68
            r7 = 29
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r65
            java.lang.Object r3 = r0.mo24885n(r1, r7, r8, r3)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r24 = r3
            r67 = r7
            r28 = r22
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
            r25 = r63
            r65 = r64
            goto L_0x0485
        L_0x044d:
            r20 = r4
            r74 = r8
            r4 = r69
            r22 = r70
            r8 = 28
            r69 = r3
            r3 = r65
            r70 = r68
            r7 = r2[r8]
            r24 = r3
            r3 = r64
            java.lang.Object r3 = r0.mo24885n(r1, r8, r7, r3)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = r67 | r7
            kotlin.d2 r64 = kotlin.C11079d2.f28267a
            r65 = r3
            r67 = r7
            r28 = r22
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
            r25 = r63
        L_0x0485:
            r3 = r69
            r7 = r72
            r8 = r74
            r60 = r2
            r69 = r4
            r45 = r44
            r2 = r52
            r61 = r59
            r63 = r62
            goto L_0x0775
        L_0x0499:
            r20 = r4
            r74 = r8
            r24 = r65
            r4 = r69
            r22 = r70
            r8 = 28
            r69 = r3
            r3 = r64
            r70 = r68
            r7 = 27
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r65 = r3
            r3 = r63
            java.lang.Object r3 = r0.mo24885n(r1, r7, r8, r3)
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r25 = r3
            r67 = r7
            r28 = r22
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
            r63 = r62
            goto L_0x0510
        L_0x04d6:
            r20 = r4
            r74 = r8
            r24 = r65
            r4 = r69
            r22 = r70
            r8 = 26
            r69 = r3
            r3 = r63
            r65 = r64
            r70 = r68
            r7 = r2[r8]
            r25 = r3
            r3 = r62
            java.lang.Object r3 = r0.mo24885n(r1, r8, r7, r3)
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r7 = r67 | r7
            kotlin.d2 r62 = kotlin.C11079d2.f28267a
            r63 = r3
            r67 = r7
            r28 = r22
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r22 = r60
            r26 = r61
        L_0x0510:
            r3 = r69
            r7 = r72
            r8 = r74
            r60 = r2
            r69 = r4
            r45 = r44
            r2 = r52
            r61 = r59
            goto L_0x0775
        L_0x0522:
            r20 = r4
            r74 = r8
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r8 = 26
            r69 = r3
            r3 = r62
            r65 = r64
            r70 = r68
            r7 = 25
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees$$serializer.INSTANCE
            r63 = r3
            r3 = r61
            java.lang.Object r3 = r0.mo24885n(r1, r7, r8, r3)
            r7 = 33554432(0x2000000, float:9.403955E-38)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r26 = r3
            r67 = r7
            r28 = r22
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r61 = r59
            r22 = r60
            r3 = r69
            r7 = r72
            r8 = r74
            r60 = r2
            r69 = r4
            r45 = r44
            r2 = r52
            goto L_0x0775
        L_0x0570:
            r20 = r4
            r74 = r8
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r8 = 24
            r69 = r3
            r3 = r61
            r63 = r62
            r65 = r64
            r70 = r68
            r7 = r2[r8]
            r26 = r3
            r3 = r60
            java.lang.Object r3 = r0.mo24885n(r1, r8, r7, r3)
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            r7 = r67 | r7
            kotlin.d2 r60 = kotlin.C11079d2.f28267a
            r60 = r2
            r67 = r7
            r28 = r22
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r2 = r52
            r61 = r59
            goto L_0x071d
        L_0x05b0:
            r20 = r4
            r74 = r8
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r7 = 23
            r69 = r3
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r8 = r2[r7]
            r60 = r2
            r2 = r59
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r8 = 8388608(0x800000, float:1.17549435E-38)
            r8 = r67 | r8
            kotlin.d2 r59 = kotlin.C11079d2.f28267a
            r61 = r2
            r67 = r8
            goto L_0x070d
        L_0x05e0:
            r20 = r4
            r74 = r8
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r7 = 23
            r69 = r3
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r60 = r2
            r2 = r59
            r8 = 22
            kotlinx.serialization.internal.i r7 = kotlinx.serialization.internal.C12278i.f30070a
            r61 = r2
            r2 = r58
            java.lang.Object r2 = r0.mo24885n(r1, r8, r7, r2)
            r7 = 4194304(0x400000, float:5.877472E-39)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r58 = r2
            goto L_0x070b
        L_0x0614:
            r20 = r4
            r74 = r8
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r69 = r3
            r61 = r59
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r60 = r2
            r2 = r58
            r7 = 21
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = r57
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r7 = 2097152(0x200000, float:2.938736E-39)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r57 = r2
            goto L_0x070b
        L_0x0646:
            r20 = r4
            r74 = r8
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r69 = r3
            r61 = r59
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r60 = r2
            r2 = r57
            r7 = 20
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = r56
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r7 = 1048576(0x100000, float:1.469368E-39)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r56 = r2
            goto L_0x070b
        L_0x0678:
            r20 = r4
            r74 = r8
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r69 = r3
            r61 = r59
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r60 = r2
            r2 = r56
            r7 = 19
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r55
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r7 = 524288(0x80000, float:7.34684E-40)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r55 = r2
            goto L_0x070b
        L_0x06aa:
            r20 = r4
            r74 = r8
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r69 = r3
            r61 = r59
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r60 = r2
            r2 = r55
            r7 = 18
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r54
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r7 = 262144(0x40000, float:3.67342E-40)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r54 = r2
            goto L_0x070b
        L_0x06db:
            r20 = r4
            r74 = r8
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r69 = r3
            r61 = r59
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r60 = r2
            r2 = r54
            r7 = 17
            kotlinx.serialization.internal.s1 r8 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r53
            java.lang.Object r2 = r0.mo24885n(r1, r7, r8, r2)
            r7 = 131072(0x20000, float:1.83671E-40)
            r7 = r67 | r7
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r53 = r2
        L_0x070b:
            r67 = r7
        L_0x070d:
            r28 = r22
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r2 = r52
        L_0x071d:
            r7 = r72
            r8 = r74
            r22 = r3
            r45 = r44
            goto L_0x0771
        L_0x0726:
            r20 = r4
            r74 = r8
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r69 = r3
            r61 = r59
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r60 = r2
            r2 = r53
            kotlinx.serialization.internal.s1 r7 = kotlinx.serialization.internal.C12310s1.f30117a
            r28 = r2
            r8 = r52
            r2 = 16
            java.lang.Object r7 = r0.mo24885n(r1, r2, r7, r8)
            r8 = 65536(0x10000, float:9.18355E-41)
            r8 = r67 | r8
            kotlin.d2 r52 = kotlin.C11079d2.f28267a
            r2 = r7
            r67 = r8
            r53 = r28
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r7 = r72
            r8 = r74
            r28 = r22
            r45 = r44
            r22 = r3
        L_0x0771:
            r3 = r69
            r69 = r4
        L_0x0775:
            r4 = 0
            goto L_0x0bf5
        L_0x0778:
            r20 = r4
            r74 = r8
            r8 = r52
            r28 = r53
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r69 = r3
            r61 = r59
            r3 = r60
            r63 = r62
            r65 = r64
            r70 = r68
            r60 = r2
            r2 = 16
            r7 = 15
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r53 = r3
            r3 = r51
            java.lang.Object r2 = r0.mo24885n(r1, r7, r2, r3)
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r67 | r3
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r51 = r2
            goto L_0x07e4
        L_0x07b0:
            r20 = r4
            r74 = r8
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r4 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r3 = r51
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r2 = 14
            kotlinx.serialization.internal.i r7 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r50
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r3)
            r7 = r67
            r3 = r7 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r50 = r2
        L_0x07e4:
            r67 = r3
            r2 = r8
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r3 = r69
            r7 = r72
            r8 = r74
            r69 = r4
            r45 = r44
            goto L_0x0b4c
        L_0x07ff:
            r20 = r4
            r74 = r8
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r4 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r3 = r50
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r2 = 13
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r67 = r4
            r4 = r49
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r7 | 8192(0x2000, float:1.14794E-41)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r49 = r2
            goto L_0x08d6
        L_0x0837:
            r20 = r4
            r74 = r8
            r4 = r49
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r2 = 12
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation$$serializer.INSTANCE
            r4 = r48
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r7 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r48 = r2
            goto L_0x08d6
        L_0x086d:
            r20 = r4
            r74 = r8
            r4 = r48
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r2 = 11
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r47
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r7 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r47 = r2
            goto L_0x08d6
        L_0x08a2:
            r20 = r4
            r74 = r8
            r4 = r47
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r2 = 10
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r46
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r7 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r46 = r2
        L_0x08d6:
            r2 = r8
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r35 = r45
            r7 = r72
            r8 = r74
            r4 = 0
            r45 = r44
            goto L_0x0b98
        L_0x08ec:
            r20 = r4
            r74 = r8
            r4 = r46
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r2 = 9
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r45
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r7 | 512(0x200, float:7.175E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r35 = r2
            r2 = r8
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r45 = r44
            goto L_0x0af8
        L_0x092f:
            r20 = r4
            r74 = r8
            r4 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r35 = r4
            r3 = r44
            r4 = 8
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r7 | 256(0x100, float:3.59E-43)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r45 = r2
            goto L_0x09d8
        L_0x0967:
            r20 = r4
            r74 = r8
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r4 = 8
            r60 = r2
            r69 = r3
            r3 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r2 = 7
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r45 = r3
            r3 = r43
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = r7 | 128(0x80, float:1.794E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r43 = r2
            goto L_0x09d8
        L_0x09a1:
            r20 = r4
            r74 = r8
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r3 = r43
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r2 = 6
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r42
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = r7 | 64
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r42 = r2
        L_0x09d8:
            r2 = r8
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            goto L_0x0af8
        L_0x09e5:
            r20 = r4
            r74 = r8
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r3 = r42
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r34 = r3
            r4 = r41
            r3 = 5
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r4 = r7 | 32
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r33 = r2
            r2 = r8
            r42 = r34
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            goto L_0x0b42
        L_0x0a2b:
            r20 = r4
            r74 = r8
            r4 = r41
            r34 = r42
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r3 = 5
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r33 = r4
            r3 = r40
            r4 = 4
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r7 | 16
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r32 = r2
            r2 = r8
            r29 = r37
            r30 = r38
            r31 = r39
            goto L_0x0af8
        L_0x0a70:
            r20 = r4
            r74 = r8
            r33 = r41
            r34 = r42
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r4 = 4
            r60 = r2
            r69 = r3
            r3 = r40
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r32 = r3
            r4 = r39
            r3 = 3
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r4 = r7 | 8
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r31 = r2
            r2 = r8
            r29 = r37
            r30 = r38
            goto L_0x0b42
        L_0x0ab5:
            r20 = r4
            r74 = r8
            r4 = r39
            r32 = r40
            r33 = r41
            r34 = r42
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r3 = 3
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r31 = r4
            r3 = r38
            r4 = 2
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r7 | 4
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r30 = r2
            r2 = r8
            r29 = r37
        L_0x0af8:
            r7 = r72
            r8 = r74
            r4 = 0
            goto L_0x0b98
        L_0x0aff:
            r20 = r4
            r74 = r8
            r31 = r39
            r32 = r40
            r33 = r41
            r34 = r42
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r4 = 2
            r60 = r2
            r69 = r3
            r3 = r38
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r30 = r3
            r4 = r37
            r3 = 1
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r4 = r7 | 2
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r29 = r2
            r2 = r8
        L_0x0b42:
            r3 = r69
            r7 = r72
            r8 = r74
            r69 = r67
            r67 = r4
        L_0x0b4c:
            r4 = 0
            goto L_0x0bed
        L_0x0b4f:
            r20 = r4
            r74 = r8
            r4 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r34 = r42
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r60 = r2
            r69 = r3
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r3 = 1
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r29 = r4
            r3 = r36
            r4 = 0
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r7 | 1
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            r36 = r2
            r2 = r8
            r7 = r72
            r8 = r74
        L_0x0b98:
            r99 = r67
            r67 = r3
            r3 = r69
            r69 = r99
            r100 = r28
            r28 = r22
            r22 = r53
            r53 = r100
            goto L_0x0bf5
        L_0x0ba9:
            r20 = r4
            r74 = r8
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r34 = r42
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r4 = 0
            r60 = r2
            r69 = r3
            r3 = r36
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            kotlin.d2 r2 = kotlin.C11079d2.f28267a
            r71 = r4
            r2 = r8
            r3 = r69
            r8 = r74
            r69 = r67
            r67 = r7
            r7 = r72
        L_0x0bed:
            r99 = r28
            r28 = r22
            r22 = r53
            r53 = r99
        L_0x0bf5:
            r52 = r2
            r4 = r20
            r37 = r29
            r38 = r30
            r39 = r31
            r40 = r32
            r41 = r33
            r44 = r45
            r2 = r60
            r59 = r61
            r62 = r63
            r64 = r65
            r68 = r70
            r60 = r22
            r65 = r24
            r63 = r25
            r61 = r26
            r70 = r28
            r45 = r35
            goto L_0x0205
        L_0x0c1d:
            r20 = r4
            r72 = r7
            r74 = r8
            r29 = r37
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r41
            r34 = r42
            r35 = r45
            r8 = r52
            r28 = r53
            r53 = r60
            r26 = r61
            r25 = r63
            r24 = r65
            r7 = r67
            r67 = r69
            r22 = r70
            r69 = r3
            r3 = r36
            r45 = r44
            r61 = r59
            r63 = r62
            r65 = r64
            r70 = r68
            r19 = r3
            r17 = r5
            r16 = r10
            r3 = r15
            r2 = r20
            r23 = r24
            r24 = r25
            r25 = r26
            r36 = r28
            r15 = r30
            r5 = r31
            r4 = r33
            r27 = r43
            r10 = r46
            r30 = r47
            r33 = r49
            r42 = r53
            r37 = r54
            r38 = r55
            r39 = r56
            r40 = r57
            r41 = r58
            r26 = r61
            r43 = r63
            r44 = r65
            r21 = r67
            r20 = r72
            r18 = r74
            r28 = r7
            r47 = r13
            r46 = r22
            r13 = r32
            r7 = r35
            r32 = r48
            r35 = r51
            r51 = r69
            r22 = r70
            r48 = r11
            r11 = r45
            r45 = r66
        L_0x0ca0:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceStore r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceStore
            r49 = r0
            r52 = r19
            java.lang.String r52 = (java.lang.String) r52
            r53 = r29
            java.lang.String r53 = (java.lang.String) r53
            r54 = r15
            java.lang.String r54 = (java.lang.String) r54
            r55 = r5
            java.lang.String r55 = (java.lang.String) r55
            r56 = r13
            java.lang.String r56 = (java.lang.String) r56
            r57 = r4
            java.lang.String r57 = (java.lang.String) r57
            r58 = r34
            java.lang.String r58 = (java.lang.String) r58
            r59 = r27
            java.lang.String r59 = (java.lang.String) r59
            r60 = r11
            java.lang.String r60 = (java.lang.String) r60
            r61 = r7
            java.lang.String r61 = (java.lang.String) r61
            r62 = r10
            java.lang.String r62 = (java.lang.String) r62
            r63 = r30
            java.lang.String r63 = (java.lang.String) r63
            r64 = r32
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation r64 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation) r64
            r65 = r33
            java.lang.String r65 = (java.lang.String) r65
            r66 = r50
            java.lang.Boolean r66 = (java.lang.Boolean) r66
            r67 = r35
            java.lang.String r67 = (java.lang.String) r67
            r68 = r8
            java.lang.String r68 = (java.lang.String) r68
            r69 = r36
            java.lang.String r69 = (java.lang.String) r69
            r70 = r37
            java.lang.String r70 = (java.lang.String) r70
            r71 = r38
            java.lang.String r71 = (java.lang.String) r71
            r72 = r39
            java.lang.Boolean r72 = (java.lang.Boolean) r72
            r73 = r40
            java.lang.Boolean r73 = (java.lang.Boolean) r73
            r74 = r41
            java.lang.Boolean r74 = (java.lang.Boolean) r74
            r75 = r26
            java.util.List r75 = (java.util.List) r75
            r76 = r42
            java.util.List r76 = (java.util.List) r76
            r77 = r25
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees r77 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees) r77
            r78 = r43
            java.util.List r78 = (java.util.List) r78
            r79 = r24
            java.lang.String r79 = (java.lang.String) r79
            r80 = r44
            java.math.BigDecimal r80 = (java.math.BigDecimal) r80
            r81 = r23
            java.lang.String r81 = (java.lang.String) r81
            r82 = r45
            java.lang.String r82 = (java.lang.String) r82
            r83 = r22
            java.math.BigDecimal r83 = (java.math.BigDecimal) r83
            r84 = r21
            java.math.BigDecimal r84 = (java.math.BigDecimal) r84
            r85 = r46
            java.math.BigDecimal r85 = (java.math.BigDecimal) r85
            r86 = r20
            java.lang.String r86 = (java.lang.String) r86
            r87 = r18
            java.math.BigDecimal r87 = (java.math.BigDecimal) r87
            r88 = r3
            java.lang.String r88 = (java.lang.String) r88
            r89 = r47
            java.math.BigDecimal r89 = (java.math.BigDecimal) r89
            r90 = r12
            java.lang.Boolean r90 = (java.lang.Boolean) r90
            r91 = r48
            java.util.List r91 = (java.util.List) r91
            r92 = r17
            java.lang.Boolean r92 = (java.lang.Boolean) r92
            r93 = r16
            java.math.BigDecimal r93 = (java.math.BigDecimal) r93
            r94 = r14
            java.util.List r94 = (java.util.List) r94
            r95 = r2
            java.util.List r95 = (java.util.List) r95
            r96 = r9
            java.lang.Boolean r96 = (java.lang.Boolean) r96
            r97 = r6
            java.lang.Boolean r97 = (java.lang.Boolean) r97
            r98 = 0
            r50 = r28
            r49.<init>((int) r50, (int) r51, (java.lang.String) r52, (java.lang.String) r53, (java.lang.String) r54, (java.lang.String) r55, (java.lang.String) r56, (java.lang.String) r57, (java.lang.String) r58, (java.lang.String) r59, (java.lang.String) r60, (java.lang.String) r61, (java.lang.String) r62, (java.lang.String) r63, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation) r64, (java.lang.String) r65, (java.lang.Boolean) r66, (java.lang.String) r67, (java.lang.String) r68, (java.lang.String) r69, (java.lang.String) r70, (java.lang.String) r71, (java.lang.Boolean) r72, (java.lang.Boolean) r73, (java.lang.Boolean) r74, (java.util.List) r75, (java.util.List) r76, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees) r77, (java.util.List) r78, (java.lang.String) r79, (java.math.BigDecimal) r80, (java.lang.String) r81, (java.lang.String) r82, (java.math.BigDecimal) r83, (java.math.BigDecimal) r84, (java.math.BigDecimal) r85, (java.lang.String) r86, (java.math.BigDecimal) r87, (java.lang.String) r88, (java.math.BigDecimal) r89, (java.lang.Boolean) r90, (java.util.List) r91, (java.lang.Boolean) r92, (java.math.BigDecimal) r93, (java.util.List) r94, (java.util.List) r95, (java.lang.Boolean) r96, (java.lang.Boolean) r97, (kotlinx.serialization.internal.C12295n1) r98)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceStore$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceStore");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffServiceStore bffServiceStore) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffServiceStore, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffServiceStore.write$Self(bffServiceStore, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
