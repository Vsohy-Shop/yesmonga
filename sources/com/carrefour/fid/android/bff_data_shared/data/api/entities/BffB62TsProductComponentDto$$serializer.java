package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.urbanairship.iam.C9127a0;
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
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB62TsProductComponentDto.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB62TsProductComponentDto;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB62TsProductComponentDto$$serializer implements C12327y<BffB62TsProductComponentDto> {
    @C12579k
    public static final BffB62TsProductComponentDto$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB62TsProductComponentDto$$serializer bffB62TsProductComponentDto$$serializer = new BffB62TsProductComponentDto$$serializer();
        INSTANCE = bffB62TsProductComponentDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB62TsProductComponentDto", bffB62TsProductComponentDto$$serializer, 81);
        pluginGeneratedSerialDescriptor.mo24966k(C13814a.f33702X0, true);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("subheader", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta", true);
        pluginGeneratedSerialDescriptor.mo24966k("url", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24709d, true);
        pluginGeneratedSerialDescriptor.mo24966k("discount_design", true);
        pluginGeneratedSerialDescriptor.mo24966k("discount_prefix", true);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78937Y, true);
        pluginGeneratedSerialDescriptor.mo24966k("discount_suffix", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_mobile", true);
        pluginGeneratedSerialDescriptor.mo24966k("subhead_title", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_mobile", true);
        pluginGeneratedSerialDescriptor.mo24966k("validity_dates", true);
        pluginGeneratedSerialDescriptor.mo24966k("es_query_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("legal_mentions", true);
        pluginGeneratedSerialDescriptor.mo24966k("link", true);
        pluginGeneratedSerialDescriptor.mo24966k("design", true);
        pluginGeneratedSerialDescriptor.mo24966k("logo_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("text_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("variant", true);
        pluginGeneratedSerialDescriptor.mo24966k("countdown", true);
        pluginGeneratedSerialDescriptor.mo24966k("offer_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("timetable", true);
        pluginGeneratedSerialDescriptor.mo24966k("flag", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_large", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_mobile_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("brand_logo", true);
        pluginGeneratedSerialDescriptor.mo24966k("ean", true);
        pluginGeneratedSerialDescriptor.mo24966k("offer_prefix", true);
        pluginGeneratedSerialDescriptor.mo24966k(C28547h2.f69318f, true);
        pluginGeneratedSerialDescriptor.mo24966k("offer_suffix", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_link", true);
        pluginGeneratedSerialDescriptor.mo24966k(OTUXParamsKeys.OT_UX_LINKS, true);
        pluginGeneratedSerialDescriptor.mo24966k("title_link", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("template_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("link_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("deeplink", true);
        pluginGeneratedSerialDescriptor.mo24966k("link_secondary", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto_link", true);
        pluginGeneratedSerialDescriptor.mo24966k("bg_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_size", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_weight", true);
        pluginGeneratedSerialDescriptor.mo24966k("format", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24710e, true);
        pluginGeneratedSerialDescriptor.mo24966k("cta2", true);
        pluginGeneratedSerialDescriptor.mo24966k("display_mode", true);
        pluginGeneratedSerialDescriptor.mo24966k("display_filters", true);
        pluginGeneratedSerialDescriptor.mo24966k("reco_enabled", true);
        pluginGeneratedSerialDescriptor.mo24966k("product_amount", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_top", true);
        pluginGeneratedSerialDescriptor.mo24966k("force_display_products", true);
        pluginGeneratedSerialDescriptor.mo24966k("advertising_enabled", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta1", true);
        pluginGeneratedSerialDescriptor.mo24966k("adserver_status", true);
        pluginGeneratedSerialDescriptor.mo24966k("adserver_position", true);
        pluginGeneratedSerialDescriptor.mo24966k("id", true);
        pluginGeneratedSerialDescriptor.mo24966k("sources", true);
        pluginGeneratedSerialDescriptor.mo24966k("all_sources", true);
        pluginGeneratedSerialDescriptor.mo24966k("title_align", true);
        pluginGeneratedSerialDescriptor.mo24966k("id_ddm", true);
        pluginGeneratedSerialDescriptor.mo24966k("shop_url", true);
        pluginGeneratedSerialDescriptor.mo24966k("weight", true);
        pluginGeneratedSerialDescriptor.mo24966k("width", true);
        pluginGeneratedSerialDescriptor.mo24966k("height", true);
        pluginGeneratedSerialDescriptor.mo24966k("loyalty_card_login_enabled", true);
        pluginGeneratedSerialDescriptor.mo24966k("url_contextualized", true);
        pluginGeneratedSerialDescriptor.mo24966k("code", true);
        pluginGeneratedSerialDescriptor.mo24966k("subtitle_left", true);
        pluginGeneratedSerialDescriptor.mo24966k("subtitle_right", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta_left", true);
        pluginGeneratedSerialDescriptor.mo24966k("phone_number", true);
        pluginGeneratedSerialDescriptor.mo24966k("more_information", true);
        pluginGeneratedSerialDescriptor.mo24966k("query_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_format", true);
        pluginGeneratedSerialDescriptor.mo24966k("block_position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB62TsProductComponentDto$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffB62TsProductComponentDto.$childSerializers;
        C12276h0 h0Var = C12276h0.f30067a;
        C12310s1 s1Var = C12310s1.f30117a;
        BffUrlDto$$serializer bffUrlDto$$serializer = BffUrlDto$$serializer.INSTANCE;
        BffImageDto$$serializer bffImageDto$$serializer = BffImageDto$$serializer.INSTANCE;
        C12278i iVar = C12278i.f30070a;
        BffT9CatalogStoreDto$$serializer bffT9CatalogStoreDto$$serializer = BffT9CatalogStoreDto$$serializer.INSTANCE;
        return new C12248g[]{C12197a.m48817q(h0Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffTimeTableDto$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(access$get$childSerializers$cp[37]), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffVideoDto$$serializer.INSTANCE), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(h0Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(iVar), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffT9CatalogStoreDto$$serializer), C12197a.m48817q(bffT9CatalogStoreDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(iVar), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r92v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r76v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r77v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r78v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r81v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r83v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r85v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r86v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r88v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r89v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r90v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r92v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r92v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r90v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r89v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r88v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r86v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r85v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r83v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r81v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r78v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r77v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r76v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r92v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r90v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r89v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r88v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r86v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r85v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r83v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r81v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r78v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r77v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r76v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r75v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r74v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r92v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r90v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r89v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r88v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r86v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r85v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r83v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r81v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r78v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r77v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r76v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r75v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r74v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v9, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v10, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v11, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v12, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v10, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v91, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r92v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r75v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r76v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r77v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r78v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v126, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v128, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r81v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v132, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r83v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v136, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r85v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r86v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r88v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r89v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r90v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v151, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r92v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v8, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v163, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v166, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v9, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v143, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v147, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v149, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v44, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v151, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v153, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v155, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v10, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v157, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v163, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v167, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v193, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v195, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v197, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v200, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v205, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v209, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v10, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v223, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r189v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v227, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v229, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r74v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r92v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v7, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r95v10, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r96v10, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r80v8, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r82v8, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v11, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v10, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v11, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v12, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v12, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0fad, code lost:
        r24 = r16;
        r19 = r27;
        r20 = r28;
        r21 = r29;
        r22 = r30;
        r23 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0fb9, code lost:
        r4 = r91;
        r2 = r102;
        r16 = r3;
        r91 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0fc2, code lost:
        r3 = r94;
        r13 = r101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x1106, code lost:
        r4 = r91;
        r2 = r102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x1183, code lost:
        r4 = r91;
        r2 = r102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x1187, code lost:
        r91 = r13;
        r24 = r16;
        r13 = r101;
        r16 = r3;
        r3 = r94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x1191, code lost:
        r94 = r93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x1193, code lost:
        r93 = r14;
        r14 = r98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x1197, code lost:
        r27 = r19;
        r28 = r20;
        r29 = r21;
        r30 = r22;
        r31 = r23;
        r34 = r35;
        r42 = r43;
        r5 = r57;
        r59 = r60;
        r64 = r66;
        r57 = r16;
        r60 = r17;
        r43 = r18;
        r66 = r24;
        r35 = r25;
        r12 = r12;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x1197, code lost:
        r12 = r12;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x1197, code lost:
        r12 = r12;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0448, code lost:
        r13 = kotlin.C11079d2.f28267a;
        r12 = r12;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x044a, code lost:
        r19 = r27;
        r20 = r28;
        r21 = r29;
        r22 = r30;
        r23 = r31;
        r25 = r35;
        r18 = r43;
        r16 = r57;
        r17 = r60;
        r24 = r66;
        r14 = r98;
        r13 = r101;
        r12 = r12;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x04fc, code lost:
        r19 = r27;
        r20 = r28;
        r21 = r29;
        r22 = r30;
        r23 = r31;
        r25 = r35;
        r18 = r43;
        r16 = r57;
        r17 = r60;
        r24 = r66;
        r14 = r98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0512, code lost:
        r13 = r101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0514, code lost:
        r2 = r102;
        r12 = r12;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0516, code lost:
        r57 = r5;
        r35 = r34;
        r43 = r42;
        r60 = r59;
        r66 = r64;
        r12 = r12;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0799, code lost:
        r91 = r3;
        r19 = r27;
        r20 = r28;
        r21 = r29;
        r22 = r30;
        r23 = r31;
        r25 = r35;
        r18 = r43;
        r16 = r57;
        r17 = r60;
        r24 = r66;
        r3 = r94;
        r13 = r101;
        r2 = r102;
        r57 = r5;
        r35 = r34;
        r43 = r42;
        r60 = r59;
        r66 = r64;
        r94 = r93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x08ae, code lost:
        r19 = r27;
        r20 = r28;
        r21 = r29;
        r22 = r30;
        r23 = r31;
        r25 = r35;
        r18 = r43;
        r16 = r57;
        r17 = r60;
        r24 = r66;
        r4 = r91;
        r13 = r101;
        r2 = r102;
        r91 = r3;
        r57 = r5;
        r35 = r34;
        r43 = r42;
        r60 = r59;
        r66 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x09cf, code lost:
        r24 = r16;
        r19 = r27;
        r20 = r28;
        r21 = r29;
        r22 = r30;
        r23 = r31;
        r25 = r35;
        r18 = r43;
        r16 = r57;
        r17 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x09e3, code lost:
        r4 = r91;
        r13 = r101;
        r2 = r102;
        r91 = r3;
        r57 = r5;
        r35 = r34;
        r43 = r42;
        r60 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0a66, code lost:
        r4 = r91;
        r13 = r101;
        r2 = r102;
        r91 = r3;
        r57 = r5;
        r35 = r34;
        r43 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0a74, code lost:
        r3 = r94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0cdf, code lost:
        r57 = r5;
        r24 = r16;
        r19 = r27;
        r20 = r28;
        r21 = r29;
        r22 = r30;
        r23 = r31;
        r25 = r35;
        r18 = r43;
        r4 = r91;
        r2 = r102;
        r16 = r3;
        r91 = r13;
        r35 = r34;
        r43 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0dec, code lost:
        r57 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0eb5, code lost:
        r24 = r16;
        r19 = r27;
        r20 = r28;
        r21 = r29;
        r22 = r30;
        r23 = r31;
        r25 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0ec3, code lost:
        r4 = r91;
        r2 = r102;
        r16 = r3;
        r91 = r13;
        r35 = r34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB62TsProductComponentDto deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r189) {
        /*
            r188 = this;
            r0 = r189
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r188.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB62TsProductComponentDto.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 5
            r5 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x0301
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r14 = r0.mo24885n(r1, r14, r3, r15)
            kotlinx.serialization.internal.s1 r7 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r13 = r0.mo24885n(r1, r13, r7, r15)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r7, r15)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r7, r15)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r11 = r0.mo24885n(r1, r11, r6, r15)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r9 = 6
            java.lang.Object r9 = r0.mo24885n(r1, r9, r8, r15)
            r19 = r4
            r4 = 7
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r7, r15)
            r20 = r4
            r4 = 9
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r21 = r4
            r4 = 10
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r22 = r4
            r4 = 11
            java.lang.Object r4 = r0.mo24885n(r1, r4, r8, r15)
            r23 = r4
            r4 = 12
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r24 = r4
            r4 = 13
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r25 = r4
            r4 = 14
            java.lang.Object r4 = r0.mo24885n(r1, r4, r8, r15)
            r26 = r4
            r4 = 15
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r27 = r4
            r4 = 16
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r18 = r4
            r4 = 17
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r28 = r4
            r4 = 18
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r15)
            r29 = r4
            r4 = 19
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r30 = r4
            r4 = 20
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r31 = r4
            r4 = 21
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r32 = r4
            r4 = 22
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r33 = r4
            r4 = 23
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r34 = r4
            r4 = 24
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r35 = r4
            r4 = 25
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r36 = r4
            r4 = 26
            r37 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r15)
            r5 = 27
            java.lang.Object r5 = r0.mo24885n(r1, r5, r7, r15)
            r38 = r4
            r4 = 28
            java.lang.Object r4 = r0.mo24885n(r1, r4, r8, r15)
            r39 = r4
            r4 = 29
            java.lang.Object r4 = r0.mo24885n(r1, r4, r8, r15)
            r40 = r4
            r4 = 30
            java.lang.Object r4 = r0.mo24885n(r1, r4, r8, r15)
            r41 = r4
            r4 = 31
            java.lang.Object r4 = r0.mo24885n(r1, r4, r8, r15)
            r42 = r4
            r4 = 32
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r17 = r4
            r4 = 33
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r43 = r4
            r4 = 34
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r44 = r4
            r4 = 35
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r45 = r4
            r4 = 36
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r15)
            r46 = r4
            r4 = 37
            r2 = r2[r4]
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r15)
            r4 = 38
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r15)
            r16 = r2
            r2 = 39
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r47 = r2
            r2 = 40
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r48 = r2
            r2 = 41
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r49 = r2
            r2 = 42
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r50 = r2
            r2 = 43
            java.lang.Object r2 = r0.mo24885n(r1, r2, r6, r15)
            r51 = r2
            r2 = 44
            java.lang.Object r2 = r0.mo24885n(r1, r2, r6, r15)
            r52 = r2
            r2 = 45
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r53 = r2
            r2 = 46
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r54 = r2
            r2 = 47
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r55 = r2
            r2 = 48
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r56 = r2
            r2 = 49
            r57 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer.INSTANCE
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r15)
            r4 = 50
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r15)
            r58 = r2
            r2 = 51
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r59 = r2
            kotlinx.serialization.internal.i r2 = kotlinx.serialization.internal.C12278i.f30070a
            r60 = r4
            r4 = 52
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r15)
            r61 = r4
            r4 = 53
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r15)
            r62 = r4
            r4 = 54
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r15)
            r63 = r4
            r4 = 55
            java.lang.Object r4 = r0.mo24885n(r1, r4, r8, r15)
            r8 = 56
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r15)
            r64 = r4
            r4 = 57
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r15)
            r65 = r4
            r4 = 58
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r15)
            r66 = r4
            r4 = 59
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r15)
            r67 = r4
            r4 = 60
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r68 = r4
            r4 = 61
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r69 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer.INSTANCE
            r70 = r5
            r5 = 62
            java.lang.Object r5 = r0.mo24885n(r1, r5, r4, r15)
            r71 = r5
            r5 = 63
            java.lang.Object r4 = r0.mo24885n(r1, r5, r4, r15)
            r5 = 64
            java.lang.Object r5 = r0.mo24885n(r1, r5, r7, r15)
            r189 = r4
            r4 = 65
            java.lang.Object r4 = r0.mo24885n(r1, r4, r7, r15)
            r72 = r4
            r4 = 66
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r15)
            r73 = r4
            r4 = 67
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r15)
            r74 = r4
            r4 = 68
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r15)
            r75 = r4
            r4 = 69
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r15)
            r4 = 70
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r15)
            r4 = 71
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r15)
            r76 = r2
            r2 = 72
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r77 = r2
            r2 = 73
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r78 = r2
            r2 = 74
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r79 = r2
            r2 = 75
            java.lang.Object r2 = r0.mo24885n(r1, r2, r6, r15)
            r6 = 76
            java.lang.Object r6 = r0.mo24885n(r1, r6, r7, r15)
            r80 = r2
            r2 = 77
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r81 = r2
            r2 = 78
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r82 = r2
            r2 = 79
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r83 = r2
            r2 = 80
            java.lang.Object r2 = r0.mo24885n(r1, r2, r7, r15)
            r7 = 131071(0x1ffff, float:1.8367E-40)
            r15 = -1
            r92 = r189
            r102 = r7
            r84 = r8
            r100 = r15
            r101 = r100
            r7 = r38
            r8 = r39
            r95 = r73
            r96 = r74
            r98 = r75
            r91 = r79
            r94 = r80
            r15 = r82
            r38 = r24
            r39 = r25
            r79 = r59
            r80 = r61
            r82 = r63
            r24 = r9
            r25 = r11
            r61 = r44
            r63 = r46
            r11 = r77
            r9 = r2
            r2 = r16
            r44 = r29
            r46 = r31
            r16 = r57
            r57 = r4
            r29 = r14
            r4 = r19
            r19 = r37
            r14 = r62
            r37 = r23
            r62 = r45
            r23 = r10
            r10 = r40
            r40 = r26
            r26 = r12
            r12 = r76
            r185 = r20
            r20 = r5
            r5 = r33
            r33 = r185
            r186 = r22
            r22 = r6
            r6 = r36
            r36 = r186
            r187 = r27
            r27 = r13
            r13 = r41
            r41 = r187
            goto L_0x1255
        L_0x0301:
            r65 = r2
            r97 = r13
            r7 = r14
            r57 = r7
            r91 = r57
            r2 = r15
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r26 = r14
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
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
            r58 = r56
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r64 = r63
            r66 = r64
            r67 = r66
            r68 = r67
            r69 = r68
            r70 = r69
            r71 = r70
            r72 = r71
            r73 = r72
            r74 = r73
            r75 = r74
            r76 = r75
            r77 = r76
            r78 = r77
            r79 = r78
            r80 = r79
            r81 = r80
            r82 = r81
            r83 = r82
            r84 = r83
            r85 = r84
            r86 = r85
            r87 = r86
            r88 = r87
            r89 = r88
            r90 = r89
            r92 = r90
            r93 = r92
            r94 = r93
            r95 = r94
            r96 = r95
        L_0x039e:
            if (r97 == 0) goto L_0x11b7
            r98 = r14
            int r14 = r0.mo24931o(r1)
            r99 = 65536(0x10000, float:9.18355E-41)
            r100 = 32768(0x8000, float:4.5918E-41)
            switch(r14) {
                case -1: goto L_0x114e;
                case 0: goto L_0x110d;
                case 1: goto L_0x10c8;
                case 2: goto L_0x1089;
                case 3: goto L_0x1049;
                case 4: goto L_0x1009;
                case 5: goto L_0x0fc8;
                case 6: goto L_0x0f7a;
                case 7: goto L_0x0f44;
                case 8: goto L_0x0f10;
                case 9: goto L_0x0ed0;
                case 10: goto L_0x0e85;
                case 11: goto L_0x0e54;
                case 12: goto L_0x0e22;
                case 13: goto L_0x0df0;
                case 14: goto L_0x0dbe;
                case 15: goto L_0x0d8f;
                case 16: goto L_0x0d3e;
                case 17: goto L_0x0d00;
                case 18: goto L_0x0cb5;
                case 19: goto L_0x0c8a;
                case 20: goto L_0x0c5f;
                case 21: goto L_0x0c33;
                case 22: goto L_0x0c07;
                case 23: goto L_0x0bdb;
                case 24: goto L_0x0baf;
                case 25: goto L_0x0b83;
                case 26: goto L_0x0b57;
                case 27: goto L_0x0b2b;
                case 28: goto L_0x0aff;
                case 29: goto L_0x0ad3;
                case 30: goto L_0x0aa7;
                case 31: goto L_0x0a79;
                case 32: goto L_0x0a2e;
                case 33: goto L_0x09f5;
                case 34: goto L_0x09ab;
                case 35: goto L_0x0986;
                case 36: goto L_0x095f;
                case 37: goto L_0x090c;
                case 38: goto L_0x08d6;
                case 39: goto L_0x088e;
                case 40: goto L_0x086d;
                case 41: goto L_0x084c;
                case 42: goto L_0x082a;
                case 43: goto L_0x0808;
                case 44: goto L_0x07e6;
                case 45: goto L_0x07c4;
                case 46: goto L_0x077b;
                case 47: goto L_0x075e;
                case 48: goto L_0x0741;
                case 49: goto L_0x0722;
                case 50: goto L_0x0702;
                case 51: goto L_0x06e2;
                case 52: goto L_0x06c2;
                case 53: goto L_0x06a2;
                case 54: goto L_0x0682;
                case 55: goto L_0x0662;
                case 56: goto L_0x0642;
                case 57: goto L_0x0622;
                case 58: goto L_0x0602;
                case 59: goto L_0x05e2;
                case 60: goto L_0x05c2;
                case 61: goto L_0x05a2;
                case 62: goto L_0x0582;
                case 63: goto L_0x0562;
                case 64: goto L_0x0521;
                case 65: goto L_0x04e6;
                case 66: goto L_0x04cf;
                case 67: goto L_0x04b8;
                case 68: goto L_0x048f;
                case 69: goto L_0x0464;
                case 70: goto L_0x043c;
                case 71: goto L_0x042f;
                case 72: goto L_0x0422;
                case 73: goto L_0x0415;
                case 74: goto L_0x0408;
                case 75: goto L_0x03fb;
                case 76: goto L_0x03ee;
                case 77: goto L_0x03e1;
                case 78: goto L_0x03d0;
                case 79: goto L_0x03c2;
                case 80: goto L_0x03b4;
                default: goto L_0x03ae;
            }
        L_0x03ae:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r14)
            throw r0
        L_0x03b4:
            r14 = 80
            r101 = r13
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r0.mo24885n(r1, r14, r13, r9)
            r7 = r7 | r99
            goto L_0x0448
        L_0x03c2:
            r101 = r13
            r13 = 79
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r0.mo24885n(r1, r13, r14, r8)
            r7 = r7 | r100
            goto L_0x0448
        L_0x03d0:
            r101 = r13
            r13 = 78
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r13 = r0.mo24885n(r1, r13, r14, r15)
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            r15 = r13
            goto L_0x044a
        L_0x03e1:
            r101 = r13
            r13 = 77
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r6 = r0.mo24885n(r1, r13, r14, r6)
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0448
        L_0x03ee:
            r101 = r13
            r13 = 76
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r10 = r0.mo24885n(r1, r13, r14, r10)
            r7 = r7 | 4096(0x1000, float:5.74E-42)
            goto L_0x0448
        L_0x03fb:
            r101 = r13
            r13 = 75
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r14 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r3 = r0.mo24885n(r1, r13, r14, r3)
            r7 = r7 | 2048(0x800, float:2.87E-42)
            goto L_0x0448
        L_0x0408:
            r101 = r13
            r13 = 74
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r13, r14, r4)
            r7 = r7 | 1024(0x400, float:1.435E-42)
            goto L_0x0448
        L_0x0415:
            r101 = r13
            r13 = 73
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r2 = r0.mo24885n(r1, r13, r14, r2)
            r7 = r7 | 512(0x200, float:7.175E-43)
            goto L_0x0448
        L_0x0422:
            r101 = r13
            r13 = 72
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r11 = r0.mo24885n(r1, r13, r14, r11)
            r7 = r7 | 256(0x100, float:3.59E-43)
            goto L_0x0448
        L_0x042f:
            r101 = r13
            r13 = 71
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r14 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r13, r14, r5)
            r7 = r7 | 128(0x80, float:1.794E-43)
            goto L_0x0448
        L_0x043c:
            r101 = r13
            r13 = 70
            kotlinx.serialization.internal.i r14 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r12 = r0.mo24885n(r1, r13, r14, r12)
            r7 = r7 | 64
        L_0x0448:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
        L_0x044a:
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r24 = r66
            r14 = r98
            r13 = r101
            goto L_0x0516
        L_0x0464:
            r101 = r13
            r13 = 69
            kotlinx.serialization.internal.h0 r14 = kotlinx.serialization.internal.C12276h0.f30067a
            r102 = r2
            r2 = r101
            java.lang.Object r2 = r0.mo24885n(r1, r13, r14, r2)
            r7 = r7 | 32
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r13 = r2
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r24 = r66
            r14 = r98
            goto L_0x0514
        L_0x048f:
            r102 = r2
            r2 = r13
            r13 = 68
            kotlinx.serialization.internal.h0 r14 = kotlinx.serialization.internal.C12276h0.f30067a
            r101 = r2
            r2 = r98
            java.lang.Object r2 = r0.mo24885n(r1, r13, r14, r2)
            r7 = r7 | 16
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r14 = r2
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r24 = r66
            goto L_0x0512
        L_0x04b8:
            r102 = r2
            r101 = r13
            r2 = r98
            r13 = 67
            kotlinx.serialization.internal.h0 r14 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = r96
            java.lang.Object r2 = r0.mo24885n(r1, r13, r14, r2)
            r7 = r7 | 8
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r96 = r2
            goto L_0x04fc
        L_0x04cf:
            r102 = r2
            r101 = r13
            r2 = r96
            r13 = 66
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r14 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r2 = r95
            java.lang.Object r2 = r0.mo24885n(r1, r13, r14, r2)
            r7 = r7 | 4
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r95 = r2
            goto L_0x04fc
        L_0x04e6:
            r102 = r2
            r101 = r13
            r2 = r95
            r13 = 65
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r94
            java.lang.Object r2 = r0.mo24885n(r1, r13, r14, r2)
            r7 = r7 | 2
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r94 = r2
        L_0x04fc:
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r24 = r66
            r14 = r98
        L_0x0512:
            r13 = r101
        L_0x0514:
            r2 = r102
        L_0x0516:
            r57 = r5
            r35 = r34
            r43 = r42
            r60 = r59
            r66 = r64
            goto L_0x055f
        L_0x0521:
            r102 = r2
            r101 = r13
            r2 = r94
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            r14 = r93
            r93 = r2
            r2 = 64
            java.lang.Object r13 = r0.mo24885n(r1, r2, r13, r14)
            r7 = r7 | 1
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r24 = r66
            r94 = r93
            r14 = r98
            r2 = r102
            r57 = r5
            r93 = r13
            r35 = r34
            r43 = r42
            r60 = r59
            r66 = r64
            r13 = r101
        L_0x055f:
            r5 = 0
            goto L_0x1197
        L_0x0562:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r2 = 64
            r13 = 63
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer.INSTANCE
            r94 = r3
            r3 = r92
            java.lang.Object r2 = r0.mo24885n(r1, r13, r2, r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r92 = r2
            goto L_0x0799
        L_0x0582:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r92
            r2 = 62
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto$$serializer.INSTANCE
            r3 = r90
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 1073741824(0x40000000, float:2.0)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r90 = r2
            goto L_0x0799
        L_0x05a2:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r90
            r2 = 61
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r89
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r89 = r2
            goto L_0x0799
        L_0x05c2:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r89
            r2 = 60
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r88
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r88 = r2
            goto L_0x0799
        L_0x05e2:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r88
            r2 = 59
            kotlinx.serialization.internal.i r13 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r87
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r87 = r2
            goto L_0x0799
        L_0x0602:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r87
            r2 = 58
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r3 = r86
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r86 = r2
            goto L_0x0799
        L_0x0622:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r86
            r2 = 57
            kotlinx.serialization.internal.i r13 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r85
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r85 = r2
            goto L_0x0799
        L_0x0642:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r85
            r2 = 56
            kotlinx.serialization.internal.i r13 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r84
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r84 = r2
            goto L_0x0799
        L_0x0662:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r84
            r2 = 55
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = r83
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r83 = r2
            goto L_0x0799
        L_0x0682:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r83
            r2 = 54
            kotlinx.serialization.internal.h0 r13 = kotlinx.serialization.internal.C12276h0.f30067a
            r3 = r82
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 4194304(0x400000, float:5.877472E-39)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r82 = r2
            goto L_0x0799
        L_0x06a2:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r82
            r2 = 53
            kotlinx.serialization.internal.i r13 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r81
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 2097152(0x200000, float:2.938736E-39)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r81 = r2
            goto L_0x0799
        L_0x06c2:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r81
            r2 = 52
            kotlinx.serialization.internal.i r13 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r80
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 1048576(0x100000, float:1.469368E-39)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r80 = r2
            goto L_0x0799
        L_0x06e2:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r80
            r2 = 51
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r79
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 524288(0x80000, float:7.34684E-40)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r79 = r2
            goto L_0x0799
        L_0x0702:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r79
            r2 = 50
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r3 = r78
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r78 = r2
            goto L_0x0799
        L_0x0722:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r78
            r2 = 49
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto$$serializer.INSTANCE
            r3 = r77
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = 131072(0x20000, float:1.83671E-40)
            r3 = r91 | r3
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r77 = r2
            goto L_0x0799
        L_0x0741:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r77
            r2 = 48
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r76
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = r91 | r99
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r76 = r2
            goto L_0x0799
        L_0x075e:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r76
            r2 = 47
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r75
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r3 = r91 | r100
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r75 = r2
            goto L_0x0799
        L_0x077b:
            r102 = r2
            r101 = r13
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r75
            r2 = 46
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r74
            java.lang.Object r2 = r0.mo24885n(r1, r2, r13, r3)
            r13 = r91
            r3 = r13 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r74 = r2
        L_0x0799:
            r91 = r3
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r24 = r66
            r3 = r94
            r13 = r101
            r2 = r102
            r57 = r5
            r35 = r34
            r43 = r42
            r60 = r59
            r66 = r64
            r94 = r93
            r5 = 0
            goto L_0x1193
        L_0x07c4:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r3 = r74
            r2 = 45
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r91 = r4
            r4 = r73
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 8192(0x2000, float:1.14794E-41)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r73 = r2
            goto L_0x08ae
        L_0x07e6:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r73
            r2 = 44
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r4 = r72
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r72 = r2
            goto L_0x08ae
        L_0x0808:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r72
            r2 = 43
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r4 = r71
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r71 = r2
            goto L_0x08ae
        L_0x082a:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r71
            r2 = 42
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r70
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r70 = r2
            goto L_0x08ae
        L_0x084c:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r70
            r2 = 41
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r69
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 512(0x200, float:7.175E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r69 = r2
            goto L_0x08ae
        L_0x086d:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r69
            r2 = 40
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r68
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 256(0x100, float:3.59E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r68 = r2
            goto L_0x08ae
        L_0x088e:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r68
            r2 = 39
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r67
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 128(0x80, float:1.794E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r67 = r2
        L_0x08ae:
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r24 = r66
            r4 = r91
            r13 = r101
            r2 = r102
            r91 = r3
            r57 = r5
            r35 = r34
            r43 = r42
            r60 = r59
            r66 = r64
            goto L_0x0a74
        L_0x08d6:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r67
            r2 = 38
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r4 = r66
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 64
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r24 = r2
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r66 = r64
            goto L_0x09e3
        L_0x090c:
            r102 = r2
            r101 = r13
            r13 = r91
            r14 = r93
            r93 = r94
            r2 = 37
            r94 = r3
            r91 = r4
            r4 = r66
            r3 = r65[r2]
            r16 = r4
            r4 = r64
            java.lang.Object r3 = r0.mo24885n(r1, r2, r3, r4)
            r4 = r13 | 32
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r66 = r3
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
            r3 = r94
            r13 = r101
            r2 = r102
            r57 = r5
            r35 = r34
            r43 = r42
            r60 = r59
            r94 = r93
            r5 = 0
            r93 = r14
            r14 = r98
            r185 = r91
            r91 = r4
            r4 = r185
            goto L_0x1197
        L_0x095f:
            r102 = r2
            r101 = r13
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r2 = 37
            r94 = r3
            r91 = r4
            r4 = r64
            r3 = 36
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r66 = r4
            r4 = r63
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r3 = r13 | 16
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r63 = r2
            goto L_0x09cf
        L_0x0986:
            r102 = r2
            r101 = r13
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r63
            r66 = r64
            r2 = 35
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r62
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 8
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r62 = r2
            goto L_0x09cf
        L_0x09ab:
            r102 = r2
            r101 = r13
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r62
            r66 = r64
            r2 = 34
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r61
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 4
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r61 = r2
        L_0x09cf:
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r17 = r60
        L_0x09e3:
            r4 = r91
            r13 = r101
            r2 = r102
            r91 = r3
            r57 = r5
            r35 = r34
            r43 = r42
            r60 = r59
            goto L_0x0a74
        L_0x09f5:
            r102 = r2
            r101 = r13
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r61
            r66 = r64
            r2 = 33
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r60
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r13 | 2
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r17 = r2
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
            r60 = r59
            goto L_0x0a66
        L_0x0a2e:
            r102 = r2
            r101 = r13
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r60
            r66 = r64
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r17 = r4
            r3 = r59
            r4 = 32
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r3)
            r3 = r13 | 1
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            r60 = r2
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r16 = r57
        L_0x0a66:
            r4 = r91
            r13 = r101
            r2 = r102
            r91 = r3
            r57 = r5
            r35 = r34
            r43 = r42
        L_0x0a74:
            r3 = r94
            r5 = 0
            goto L_0x1191
        L_0x0a79:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r59
            r66 = r64
            r4 = 32
            r2 = 31
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r60 = r3
            r3 = r58
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r58 = r2
            goto L_0x0cdf
        L_0x0aa7:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r58
            r60 = r59
            r66 = r64
            r2 = 30
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = r56
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 1073741824(0x40000000, float:2.0)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r56 = r2
            goto L_0x0cdf
        L_0x0ad3:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r56
            r60 = r59
            r66 = r64
            r2 = 29
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = r55
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r55 = r2
            goto L_0x0cdf
        L_0x0aff:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r55
            r60 = r59
            r66 = r64
            r2 = 28
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = r54
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r54 = r2
            goto L_0x0cdf
        L_0x0b2b:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r54
            r60 = r59
            r66 = r64
            r2 = 27
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r53
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r53 = r2
            goto L_0x0cdf
        L_0x0b57:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r53
            r60 = r59
            r66 = r64
            r2 = 26
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto$$serializer.INSTANCE
            r3 = r52
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r52 = r2
            goto L_0x0cdf
        L_0x0b83:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r52
            r60 = r59
            r66 = r64
            r2 = 25
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r51
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r51 = r2
            goto L_0x0cdf
        L_0x0baf:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r51
            r60 = r59
            r66 = r64
            r2 = 24
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r50
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r50 = r2
            goto L_0x0cdf
        L_0x0bdb:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r50
            r60 = r59
            r66 = r64
            r2 = 23
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r49
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r49 = r2
            goto L_0x0cdf
        L_0x0c07:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r49
            r60 = r59
            r66 = r64
            r2 = 22
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r48
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 4194304(0x400000, float:5.877472E-39)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r48 = r2
            goto L_0x0cdf
        L_0x0c33:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r48
            r60 = r59
            r66 = r64
            r2 = 21
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r47
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 2097152(0x200000, float:2.938736E-39)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r47 = r2
            goto L_0x0cdf
        L_0x0c5f:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r47
            r60 = r59
            r66 = r64
            r2 = 20
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r46
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 1048576(0x100000, float:1.469368E-39)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r46 = r2
            goto L_0x0cdf
        L_0x0c8a:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r46
            r60 = r59
            r66 = r64
            r2 = 19
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r45
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 524288(0x80000, float:7.34684E-40)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r45 = r2
            goto L_0x0cdf
        L_0x0cb5:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r45
            r60 = r59
            r66 = r64
            r2 = 18
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r3 = r44
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r44 = r2
        L_0x0cdf:
            r57 = r5
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r18 = r43
            r4 = r91
            r2 = r102
            r5 = 0
            r16 = r3
            r91 = r13
            r35 = r34
            r43 = r42
            goto L_0x0fc2
        L_0x0d00:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r44
            r60 = r59
            r66 = r64
            r2 = 17
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r43
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r3)
            r3 = 131072(0x20000, float:1.83671E-40)
            r3 = r57 | r3
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r18 = r2
            r57 = r5
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r43 = r42
            goto L_0x0ec3
        L_0x0d3e:
            r102 = r2
            r101 = r13
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r3 = r43
            r60 = r59
            r66 = r64
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r18 = r3
            r4 = r42
            r3 = 16
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            r4 = r57 | r99
            kotlin.d2 r42 = kotlin.C11079d2.f28267a
            r43 = r2
            r57 = r5
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
            r3 = r94
            r2 = r102
            r5 = 0
            r16 = r4
            r35 = r34
            r4 = r91
            r94 = r93
            r91 = r13
            r93 = r14
            r14 = r98
            r13 = r101
            goto L_0x1197
        L_0x0d8f:
            r102 = r2
            r101 = r13
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r42
            r60 = r59
            r66 = r64
            r3 = 16
            r2 = 15
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r43 = r4
            r4 = r41
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r57 | r100
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r41 = r2
            goto L_0x0dec
        L_0x0dbe:
            r102 = r2
            r101 = r13
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r41
            r43 = r42
            r60 = r59
            r66 = r64
            r2 = 14
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r4 = r40
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r4)
            r3 = r57
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r40 = r2
        L_0x0dec:
            r57 = r5
            goto L_0x0eb5
        L_0x0df0:
            r102 = r2
            r101 = r13
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r40
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r2 = 13
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r57 = r5
            r5 = r39
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r5)
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r39 = r2
            goto L_0x0eb5
        L_0x0e22:
            r102 = r2
            r101 = r13
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = r39
            r2 = 12
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = r38
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r5)
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r38 = r2
            goto L_0x0eb5
        L_0x0e54:
            r102 = r2
            r101 = r13
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = r38
            r2 = 11
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r5 = r37
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r5)
            r3 = r3 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r37 = r2
            goto L_0x0eb5
        L_0x0e85:
            r102 = r2
            r101 = r13
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = r37
            r2 = 10
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = r36
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r5)
            r3 = r3 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r36 = r2
        L_0x0eb5:
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r25 = r35
        L_0x0ec3:
            r4 = r91
            r2 = r102
            r5 = 0
            r16 = r3
            r91 = r13
            r35 = r34
            goto L_0x0fc2
        L_0x0ed0:
            r102 = r2
            r101 = r13
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = r36
            r2 = 9
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = r35
            java.lang.Object r2 = r0.mo24885n(r1, r2, r4, r5)
            r3 = r3 | 512(0x200, float:7.175E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r25 = r2
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r35 = r34
            goto L_0x0fb9
        L_0x0f10:
            r102 = r2
            r101 = r13
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = r35
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r25 = r5
            r4 = r34
            r5 = 8
            java.lang.Object r2 = r0.mo24885n(r1, r5, r2, r4)
            r3 = r3 | 256(0x100, float:3.59E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r35 = r2
            goto L_0x0fad
        L_0x0f44:
            r102 = r2
            r101 = r13
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = 8
            r2 = 7
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r35 = r4
            r4 = r33
            java.lang.Object r2 = r0.mo24885n(r1, r2, r5, r4)
            r3 = r3 | 128(0x80, float:1.794E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r33 = r2
            goto L_0x0fad
        L_0x0f7a:
            r102 = r2
            r101 = r13
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r33
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r2 = 6
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r4 = r32
            java.lang.Object r2 = r0.mo24885n(r1, r2, r5, r4)
            r3 = r3 | 64
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r32 = r2
        L_0x0fad:
            r24 = r16
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
        L_0x0fb9:
            r4 = r91
            r2 = r102
            r5 = 0
            r16 = r3
            r91 = r13
        L_0x0fc2:
            r3 = r94
            r13 = r101
            goto L_0x1191
        L_0x0fc8:
            r102 = r2
            r101 = r13
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r32
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r24 = r4
            r5 = r31
            r4 = 5
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r5)
            r3 = r3 | 32
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r23 = r2
            r32 = r24
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            goto L_0x1106
        L_0x1009:
            r102 = r2
            r101 = r13
            r24 = r32
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r4 = 5
            r57 = r5
            r5 = r31
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r23 = r5
            r4 = r30
            r5 = 4
            java.lang.Object r2 = r0.mo24885n(r1, r5, r2, r4)
            r3 = r3 | 16
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r22 = r2
            r19 = r27
            r20 = r28
            r21 = r29
            goto L_0x1106
        L_0x1049:
            r102 = r2
            r101 = r13
            r23 = r31
            r24 = r32
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r30
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = 4
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r22 = r4
            r5 = r29
            r4 = 3
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r5)
            r3 = r3 | 8
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r21 = r2
            r19 = r27
            r20 = r28
            goto L_0x1106
        L_0x1089:
            r102 = r2
            r101 = r13
            r22 = r30
            r23 = r31
            r24 = r32
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r4 = 3
            r57 = r5
            r5 = r29
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r21 = r5
            r4 = r28
            r5 = 2
            java.lang.Object r2 = r0.mo24885n(r1, r5, r2, r4)
            r3 = r3 | 4
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r20 = r2
            r19 = r27
            goto L_0x1106
        L_0x10c8:
            r102 = r2
            r101 = r13
            r21 = r29
            r22 = r30
            r23 = r31
            r24 = r32
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r28
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = 2
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r20 = r4
            r5 = r27
            r4 = 1
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r5)
            r3 = r3 | 2
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r19 = r2
        L_0x1106:
            r4 = r91
            r2 = r102
            r5 = 0
            goto L_0x1187
        L_0x110d:
            r102 = r2
            r101 = r13
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r24 = r32
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r4 = 1
            r57 = r5
            r5 = r27
            kotlinx.serialization.internal.h0 r2 = kotlinx.serialization.internal.C12276h0.f30067a
            r19 = r5
            r4 = r26
            r5 = 0
            java.lang.Object r2 = r0.mo24885n(r1, r5, r2, r4)
            r3 = r3 | 1
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r26 = r2
            goto L_0x1183
        L_0x114e:
            r102 = r2
            r101 = r13
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r24 = r32
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r26
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r5 = 0
            kotlin.d2 r2 = kotlin.C11079d2.f28267a
            r97 = r5
        L_0x1183:
            r4 = r91
            r2 = r102
        L_0x1187:
            r91 = r13
            r24 = r16
            r13 = r101
            r16 = r3
            r3 = r94
        L_0x1191:
            r94 = r93
        L_0x1193:
            r93 = r14
            r14 = r98
        L_0x1197:
            r27 = r19
            r28 = r20
            r29 = r21
            r30 = r22
            r31 = r23
            r34 = r35
            r42 = r43
            r5 = r57
            r59 = r60
            r64 = r66
            r57 = r16
            r60 = r17
            r43 = r18
            r66 = r24
            r35 = r25
            goto L_0x039e
        L_0x11b7:
            r102 = r2
            r101 = r13
            r98 = r14
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r30
            r23 = r31
            r24 = r32
            r25 = r35
            r18 = r43
            r17 = r60
            r16 = r66
            r13 = r91
            r14 = r93
            r93 = r94
            r94 = r3
            r91 = r4
            r4 = r26
            r35 = r34
            r43 = r42
            r3 = r57
            r60 = r59
            r66 = r64
            r57 = r5
            r100 = r3
            r29 = r4
            r28 = r18
            r26 = r20
            r19 = r21
            r4 = r23
            r21 = r25
            r23 = r35
            r18 = r43
            r30 = r45
            r32 = r47
            r5 = r48
            r34 = r49
            r35 = r50
            r42 = r58
            r2 = r66
            r47 = r67
            r48 = r68
            r49 = r69
            r50 = r70
            r58 = r77
            r64 = r83
            r65 = r85
            r66 = r86
            r67 = r87
            r68 = r88
            r69 = r89
            r3 = r101
            r83 = r8
            r101 = r13
            r20 = r14
            r43 = r17
            r25 = r22
            r70 = r53
            r8 = r54
            r13 = r56
            r17 = r60
            r53 = r73
            r54 = r74
            r56 = r76
            r60 = r78
            r14 = r81
            r78 = r102
            r81 = r6
            r102 = r7
            r22 = r10
            r6 = r51
            r7 = r52
            r10 = r55
            r51 = r71
            r52 = r72
            r55 = r75
            r71 = r90
            r72 = r93
        L_0x1255:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB62TsProductComponentDto r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB62TsProductComponentDto
            r99 = r0
            r103 = r29
            java.lang.Integer r103 = (java.lang.Integer) r103
            r104 = r27
            java.lang.String r104 = (java.lang.String) r104
            r105 = r26
            java.lang.String r105 = (java.lang.String) r105
            r106 = r19
            java.lang.String r106 = (java.lang.String) r106
            r107 = r25
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r107 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r107
            r108 = r4
            java.lang.String r108 = (java.lang.String) r108
            r109 = r24
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r109 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r109
            r110 = r33
            java.lang.String r110 = (java.lang.String) r110
            r111 = r23
            java.lang.String r111 = (java.lang.String) r111
            r112 = r21
            java.lang.String r112 = (java.lang.String) r112
            r113 = r36
            java.lang.String r113 = (java.lang.String) r113
            r114 = r37
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r114 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r114
            r115 = r38
            java.lang.String r115 = (java.lang.String) r115
            r116 = r39
            java.lang.String r116 = (java.lang.String) r116
            r117 = r40
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r117 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r117
            r118 = r41
            java.lang.String r118 = (java.lang.String) r118
            r119 = r18
            java.lang.String r119 = (java.lang.String) r119
            r120 = r28
            java.lang.String r120 = (java.lang.String) r120
            r121 = r44
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r121 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r121
            r122 = r30
            java.lang.String r122 = (java.lang.String) r122
            r123 = r46
            java.lang.String r123 = (java.lang.String) r123
            r124 = r32
            java.lang.String r124 = (java.lang.String) r124
            r125 = r5
            java.lang.String r125 = (java.lang.String) r125
            r126 = r34
            java.lang.String r126 = (java.lang.String) r126
            r127 = r35
            java.lang.String r127 = (java.lang.String) r127
            r128 = r6
            java.lang.String r128 = (java.lang.String) r128
            r129 = r7
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto r129 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto) r129
            r130 = r70
            java.lang.String r130 = (java.lang.String) r130
            r131 = r8
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r131 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r131
            r132 = r10
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r132 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r132
            r133 = r13
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r133 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r133
            r134 = r42
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r134 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r134
            r135 = r17
            java.lang.String r135 = (java.lang.String) r135
            r136 = r43
            java.lang.String r136 = (java.lang.String) r136
            r137 = r61
            java.lang.String r137 = (java.lang.String) r137
            r138 = r62
            java.lang.String r138 = (java.lang.String) r138
            r139 = r63
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r139 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r139
            r140 = r2
            java.util.List r140 = (java.util.List) r140
            r141 = r16
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r141 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r141
            r142 = r47
            java.lang.String r142 = (java.lang.String) r142
            r143 = r48
            java.lang.String r143 = (java.lang.String) r143
            r144 = r49
            java.lang.String r144 = (java.lang.String) r144
            r145 = r50
            java.lang.String r145 = (java.lang.String) r145
            r146 = r51
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r146 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r146
            r147 = r52
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r147 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r147
            r148 = r53
            java.lang.String r148 = (java.lang.String) r148
            r149 = r54
            java.lang.String r149 = (java.lang.String) r149
            r150 = r55
            java.lang.String r150 = (java.lang.String) r150
            r151 = r56
            java.lang.String r151 = (java.lang.String) r151
            r152 = r58
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto r152 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto) r152
            r153 = r60
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r153 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r153
            r154 = r79
            java.lang.String r154 = (java.lang.String) r154
            r155 = r80
            java.lang.Boolean r155 = (java.lang.Boolean) r155
            r156 = r14
            java.lang.Boolean r156 = (java.lang.Boolean) r156
            r157 = r82
            java.lang.Integer r157 = (java.lang.Integer) r157
            r158 = r64
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r158 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r158
            r159 = r84
            java.lang.Boolean r159 = (java.lang.Boolean) r159
            r160 = r65
            java.lang.Boolean r160 = (java.lang.Boolean) r160
            r161 = r66
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r161 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r161
            r162 = r67
            java.lang.Boolean r162 = (java.lang.Boolean) r162
            r163 = r68
            java.lang.String r163 = (java.lang.String) r163
            r164 = r69
            java.lang.String r164 = (java.lang.String) r164
            r165 = r71
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto r165 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto) r165
            r166 = r92
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto r166 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto) r166
            r167 = r20
            java.lang.String r167 = (java.lang.String) r167
            r168 = r72
            java.lang.String r168 = (java.lang.String) r168
            r169 = r95
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r169 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r169
            r170 = r96
            java.lang.Integer r170 = (java.lang.Integer) r170
            r171 = r98
            java.lang.Integer r171 = (java.lang.Integer) r171
            r172 = r3
            java.lang.Integer r172 = (java.lang.Integer) r172
            r173 = r12
            java.lang.Boolean r173 = (java.lang.Boolean) r173
            r174 = r57
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r174 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r174
            r175 = r11
            java.lang.String r175 = (java.lang.String) r175
            r176 = r78
            java.lang.String r176 = (java.lang.String) r176
            r177 = r91
            java.lang.String r177 = (java.lang.String) r177
            r178 = r94
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r178 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r178
            r179 = r22
            java.lang.String r179 = (java.lang.String) r179
            r180 = r81
            java.lang.String r180 = (java.lang.String) r180
            r181 = r15
            java.lang.String r181 = (java.lang.String) r181
            r182 = r83
            java.lang.String r182 = (java.lang.String) r182
            r183 = r9
            java.lang.String r183 = (java.lang.String) r183
            r184 = 0
            r99.<init>((int) r100, (int) r101, (int) r102, (java.lang.Integer) r103, (java.lang.String) r104, (java.lang.String) r105, (java.lang.String) r106, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r107, (java.lang.String) r108, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r109, (java.lang.String) r110, (java.lang.String) r111, (java.lang.String) r112, (java.lang.String) r113, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r114, (java.lang.String) r115, (java.lang.String) r116, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r117, (java.lang.String) r118, (java.lang.String) r119, (java.lang.String) r120, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r121, (java.lang.String) r122, (java.lang.String) r123, (java.lang.String) r124, (java.lang.String) r125, (java.lang.String) r126, (java.lang.String) r127, (java.lang.String) r128, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTimeTableDto) r129, (java.lang.String) r130, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r131, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r132, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r133, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r134, (java.lang.String) r135, (java.lang.String) r136, (java.lang.String) r137, (java.lang.String) r138, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r139, (java.util.List) r140, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r141, (java.lang.String) r142, (java.lang.String) r143, (java.lang.String) r144, (java.lang.String) r145, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r146, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r147, (java.lang.String) r148, (java.lang.String) r149, (java.lang.String) r150, (java.lang.String) r151, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto) r152, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r153, (java.lang.String) r154, (java.lang.Boolean) r155, (java.lang.Boolean) r156, (java.lang.Integer) r157, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r158, (java.lang.Boolean) r159, (java.lang.Boolean) r160, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r161, (java.lang.Boolean) r162, (java.lang.String) r163, (java.lang.String) r164, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto) r165, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto) r166, (java.lang.String) r167, (java.lang.String) r168, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r169, (java.lang.Integer) r170, (java.lang.Integer) r171, (java.lang.Integer) r172, (java.lang.Boolean) r173, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r174, (java.lang.String) r175, (java.lang.String) r176, (java.lang.String) r177, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r178, (java.lang.String) r179, (java.lang.String) r180, (java.lang.String) r181, (java.lang.String) r182, (java.lang.String) r183, (kotlinx.serialization.internal.C12295n1) r184)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB62TsProductComponentDto$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB62TsProductComponentDto");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB62TsProductComponentDto bffB62TsProductComponentDto) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB62TsProductComponentDto, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB62TsProductComponentDto.write$Self(bffB62TsProductComponentDto, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
