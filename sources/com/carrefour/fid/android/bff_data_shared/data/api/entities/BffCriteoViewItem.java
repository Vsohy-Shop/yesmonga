package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 a2\u00020\u0001:\u0002baBÇ\u0001\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019¢\u0006\u0004\b[\u0010\\BÛ\u0001\b\u0017\u0012\u0006\u0010]\u001a\u00020\r\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019\u0012\b\u0010_\u001a\u0004\u0018\u00010^¢\u0006\u0004\b[\u0010`J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019HÆ\u0003JÐ\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b.\u0010/J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\rHÖ\u0001J\u0013\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R\"\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010:\u0012\u0004\b=\u00109\u001a\u0004\b;\u0010<R\"\u0010!\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010>\u0012\u0004\b@\u00109\u001a\u0004\b?\u0010\u000fR\"\u0010\"\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u00105\u0012\u0004\bB\u00109\u001a\u0004\bA\u00107R\"\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u00105\u0012\u0004\bD\u00109\u001a\u0004\bC\u00107R\"\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u00105\u0012\u0004\bF\u00109\u001a\u0004\bE\u00107R\"\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u00105\u0012\u0004\bH\u00109\u001a\u0004\bG\u00107R\"\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u00105\u0012\u0004\bJ\u00109\u001a\u0004\bI\u00107R\"\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u00105\u0012\u0004\bL\u00109\u001a\u0004\bK\u00107R\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u00105\u0012\u0004\bN\u00109\u001a\u0004\bM\u00107R\"\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u00105\u0012\u0004\bP\u00109\u001a\u0004\bO\u00107R\"\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u00105\u0012\u0004\bR\u00109\u001a\u0004\bQ\u00107R(\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010S\u0012\u0004\bV\u00109\u001a\u0004\bT\u0010UR\"\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u00105\u0012\u0004\bX\u00109\u001a\u0004\bW\u00107R(\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010S\u0012\u0004\bZ\u00109\u001a\u0004\bY\u0010U¨\u0006c"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoProduct;", "component13", "component14", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOrder;", "component15", "format", "rendering", "bffPosition", "onLoadBeacon", "onViewBeacon", "onClickBeacon", "onFileClickBeacon", "onBasketChangeBeacon", "onWishlistBeacon", "onVideoBeacon", "productPage", "onAvailabilityUpdate", "products", "lineItemID", "productsOrder", "copy", "(Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "getFormat$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;", "getRendering", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;", "getRendering$annotations", "Ljava/lang/Integer;", "getBffPosition", "getBffPosition$annotations", "getOnLoadBeacon", "getOnLoadBeacon$annotations", "getOnViewBeacon", "getOnViewBeacon$annotations", "getOnClickBeacon", "getOnClickBeacon$annotations", "getOnFileClickBeacon", "getOnFileClickBeacon$annotations", "getOnBasketChangeBeacon", "getOnBasketChangeBeacon$annotations", "getOnWishlistBeacon", "getOnWishlistBeacon$annotations", "getOnVideoBeacon", "getOnVideoBeacon$annotations", "getProductPage", "getProductPage$annotations", "getOnAvailabilityUpdate", "getOnAvailabilityUpdate$annotations", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "getProducts$annotations", "getLineItemID", "getLineItemID$annotations", "getProductsOrder", "getProductsOrder$annotations", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCriteoViewItem {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new C12269f(BffCriteoProduct$$serializer.INSTANCE), null, new C12269f(BffProductOrder$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Integer bffPosition;
    @C12580l
    private final String format;
    @C12580l
    private final String lineItemID;
    @C12580l
    private final String onAvailabilityUpdate;
    @C12580l
    private final String onBasketChangeBeacon;
    @C12580l
    private final String onClickBeacon;
    @C12580l
    private final String onFileClickBeacon;
    @C12580l
    private final String onLoadBeacon;
    @C12580l
    private final String onVideoBeacon;
    @C12580l
    private final String onViewBeacon;
    @C12580l
    private final String onWishlistBeacon;
    @C12580l
    private final String productPage;
    @C12580l
    private final List<BffCriteoProduct> products;
    @C12580l
    private final List<BffProductOrder> productsOrder;
    @C12580l
    private final BffRendering rendering;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCriteoViewItem> serializer() {
            return BffCriteoViewItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffCriteoViewItem() {
        this((String) null, (BffRendering) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (List) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCriteoViewItem copy$default(BffCriteoViewItem bffCriteoViewItem, String str, BffRendering bffRendering, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, List list2, int i, Object obj) {
        BffCriteoViewItem bffCriteoViewItem2 = bffCriteoViewItem;
        int i2 = i;
        return bffCriteoViewItem.copy((i2 & 1) != 0 ? bffCriteoViewItem2.format : str, (i2 & 2) != 0 ? bffCriteoViewItem2.rendering : bffRendering, (i2 & 4) != 0 ? bffCriteoViewItem2.bffPosition : num, (i2 & 8) != 0 ? bffCriteoViewItem2.onLoadBeacon : str2, (i2 & 16) != 0 ? bffCriteoViewItem2.onViewBeacon : str3, (i2 & 32) != 0 ? bffCriteoViewItem2.onClickBeacon : str4, (i2 & 64) != 0 ? bffCriteoViewItem2.onFileClickBeacon : str5, (i2 & 128) != 0 ? bffCriteoViewItem2.onBasketChangeBeacon : str6, (i2 & 256) != 0 ? bffCriteoViewItem2.onWishlistBeacon : str7, (i2 & 512) != 0 ? bffCriteoViewItem2.onVideoBeacon : str8, (i2 & 1024) != 0 ? bffCriteoViewItem2.productPage : str9, (i2 & 2048) != 0 ? bffCriteoViewItem2.onAvailabilityUpdate : str10, (i2 & 4096) != 0 ? bffCriteoViewItem2.products : list, (i2 & 8192) != 0 ? bffCriteoViewItem2.lineItemID : str11, (i2 & 16384) != 0 ? bffCriteoViewItem2.productsOrder : list2);
    }

    @C12438n("bff_position")
    public static /* synthetic */ void getBffPosition$annotations() {
    }

    @C12438n("format")
    public static /* synthetic */ void getFormat$annotations() {
    }

    @C12438n("line_item_ID")
    public static /* synthetic */ void getLineItemID$annotations() {
    }

    @C12438n("on_availability_update")
    public static /* synthetic */ void getOnAvailabilityUpdate$annotations() {
    }

    @C12438n("on_basket_change_beacon")
    public static /* synthetic */ void getOnBasketChangeBeacon$annotations() {
    }

    @C12438n("on_click_beacon")
    public static /* synthetic */ void getOnClickBeacon$annotations() {
    }

    @C12438n("on_file_click_beacon")
    public static /* synthetic */ void getOnFileClickBeacon$annotations() {
    }

    @C12438n("on_load_beacon")
    public static /* synthetic */ void getOnLoadBeacon$annotations() {
    }

    @C12438n("on_video_beacon")
    public static /* synthetic */ void getOnVideoBeacon$annotations() {
    }

    @C12438n("on_view_beacon")
    public static /* synthetic */ void getOnViewBeacon$annotations() {
    }

    @C12438n("on_wishlist_beacon")
    public static /* synthetic */ void getOnWishlistBeacon$annotations() {
    }

    @C12438n("product_page")
    public static /* synthetic */ void getProductPage$annotations() {
    }

    @C12438n("products")
    public static /* synthetic */ void getProducts$annotations() {
    }

    @C12438n("products_order")
    public static /* synthetic */ void getProductsOrder$annotations() {
    }

    @C12438n("rendering")
    public static /* synthetic */ void getRendering$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCriteoViewItem bffCriteoViewItem, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCriteoViewItem.format != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffCriteoViewItem.format);
        }
        if (dVar.mo24897A(fVar, 1) || bffCriteoViewItem.rendering != null) {
            dVar.mo24912i(fVar, 1, BffRendering$$serializer.INSTANCE, bffCriteoViewItem.rendering);
        }
        if (dVar.mo24897A(fVar, 2) || bffCriteoViewItem.bffPosition != null) {
            dVar.mo24912i(fVar, 2, C12276h0.f30067a, bffCriteoViewItem.bffPosition);
        }
        if (dVar.mo24897A(fVar, 3) || bffCriteoViewItem.onLoadBeacon != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCriteoViewItem.onLoadBeacon);
        }
        if (dVar.mo24897A(fVar, 4) || bffCriteoViewItem.onViewBeacon != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffCriteoViewItem.onViewBeacon);
        }
        if (dVar.mo24897A(fVar, 5) || bffCriteoViewItem.onClickBeacon != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffCriteoViewItem.onClickBeacon);
        }
        if (dVar.mo24897A(fVar, 6) || bffCriteoViewItem.onFileClickBeacon != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffCriteoViewItem.onFileClickBeacon);
        }
        if (dVar.mo24897A(fVar, 7) || bffCriteoViewItem.onBasketChangeBeacon != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffCriteoViewItem.onBasketChangeBeacon);
        }
        if (dVar.mo24897A(fVar, 8) || bffCriteoViewItem.onWishlistBeacon != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffCriteoViewItem.onWishlistBeacon);
        }
        if (dVar.mo24897A(fVar, 9) || bffCriteoViewItem.onVideoBeacon != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffCriteoViewItem.onVideoBeacon);
        }
        if (dVar.mo24897A(fVar, 10) || bffCriteoViewItem.productPage != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffCriteoViewItem.productPage);
        }
        if (dVar.mo24897A(fVar, 11) || bffCriteoViewItem.onAvailabilityUpdate != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffCriteoViewItem.onAvailabilityUpdate);
        }
        if (dVar.mo24897A(fVar, 12) || bffCriteoViewItem.products != null) {
            dVar.mo24912i(fVar, 12, gVarArr[12], bffCriteoViewItem.products);
        }
        if (dVar.mo24897A(fVar, 13) || bffCriteoViewItem.lineItemID != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffCriteoViewItem.lineItemID);
        }
        if (dVar.mo24897A(fVar, 14) || bffCriteoViewItem.productsOrder != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 14, gVarArr[14], bffCriteoViewItem.productsOrder);
        }
    }

    @C12580l
    public final String component1() {
        return this.format;
    }

    @C12580l
    public final String component10() {
        return this.onVideoBeacon;
    }

    @C12580l
    public final String component11() {
        return this.productPage;
    }

    @C12580l
    public final String component12() {
        return this.onAvailabilityUpdate;
    }

    @C12580l
    public final List<BffCriteoProduct> component13() {
        return this.products;
    }

    @C12580l
    public final String component14() {
        return this.lineItemID;
    }

    @C12580l
    public final List<BffProductOrder> component15() {
        return this.productsOrder;
    }

    @C12580l
    public final BffRendering component2() {
        return this.rendering;
    }

    @C12580l
    public final Integer component3() {
        return this.bffPosition;
    }

    @C12580l
    public final String component4() {
        return this.onLoadBeacon;
    }

    @C12580l
    public final String component5() {
        return this.onViewBeacon;
    }

    @C12580l
    public final String component6() {
        return this.onClickBeacon;
    }

    @C12580l
    public final String component7() {
        return this.onFileClickBeacon;
    }

    @C12580l
    public final String component8() {
        return this.onBasketChangeBeacon;
    }

    @C12580l
    public final String component9() {
        return this.onWishlistBeacon;
    }

    @C12579k
    public final BffCriteoViewItem copy(@C12580l String str, @C12580l BffRendering bffRendering, @C12580l Integer num, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l List<BffCriteoProduct> list, @C12580l String str11, @C12580l List<BffProductOrder> list2) {
        return new BffCriteoViewItem(str, bffRendering, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, str11, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCriteoViewItem)) {
            return false;
        }
        BffCriteoViewItem bffCriteoViewItem = (BffCriteoViewItem) obj;
        return Intrinsics.areEqual((Object) this.format, (Object) bffCriteoViewItem.format) && Intrinsics.areEqual((Object) this.rendering, (Object) bffCriteoViewItem.rendering) && Intrinsics.areEqual((Object) this.bffPosition, (Object) bffCriteoViewItem.bffPosition) && Intrinsics.areEqual((Object) this.onLoadBeacon, (Object) bffCriteoViewItem.onLoadBeacon) && Intrinsics.areEqual((Object) this.onViewBeacon, (Object) bffCriteoViewItem.onViewBeacon) && Intrinsics.areEqual((Object) this.onClickBeacon, (Object) bffCriteoViewItem.onClickBeacon) && Intrinsics.areEqual((Object) this.onFileClickBeacon, (Object) bffCriteoViewItem.onFileClickBeacon) && Intrinsics.areEqual((Object) this.onBasketChangeBeacon, (Object) bffCriteoViewItem.onBasketChangeBeacon) && Intrinsics.areEqual((Object) this.onWishlistBeacon, (Object) bffCriteoViewItem.onWishlistBeacon) && Intrinsics.areEqual((Object) this.onVideoBeacon, (Object) bffCriteoViewItem.onVideoBeacon) && Intrinsics.areEqual((Object) this.productPage, (Object) bffCriteoViewItem.productPage) && Intrinsics.areEqual((Object) this.onAvailabilityUpdate, (Object) bffCriteoViewItem.onAvailabilityUpdate) && Intrinsics.areEqual((Object) this.products, (Object) bffCriteoViewItem.products) && Intrinsics.areEqual((Object) this.lineItemID, (Object) bffCriteoViewItem.lineItemID) && Intrinsics.areEqual((Object) this.productsOrder, (Object) bffCriteoViewItem.productsOrder);
    }

    @C12580l
    public final Integer getBffPosition() {
        return this.bffPosition;
    }

    @C12580l
    public final String getFormat() {
        return this.format;
    }

    @C12580l
    public final String getLineItemID() {
        return this.lineItemID;
    }

    @C12580l
    public final String getOnAvailabilityUpdate() {
        return this.onAvailabilityUpdate;
    }

    @C12580l
    public final String getOnBasketChangeBeacon() {
        return this.onBasketChangeBeacon;
    }

    @C12580l
    public final String getOnClickBeacon() {
        return this.onClickBeacon;
    }

    @C12580l
    public final String getOnFileClickBeacon() {
        return this.onFileClickBeacon;
    }

    @C12580l
    public final String getOnLoadBeacon() {
        return this.onLoadBeacon;
    }

    @C12580l
    public final String getOnVideoBeacon() {
        return this.onVideoBeacon;
    }

    @C12580l
    public final String getOnViewBeacon() {
        return this.onViewBeacon;
    }

    @C12580l
    public final String getOnWishlistBeacon() {
        return this.onWishlistBeacon;
    }

    @C12580l
    public final String getProductPage() {
        return this.productPage;
    }

    @C12580l
    public final List<BffCriteoProduct> getProducts() {
        return this.products;
    }

    @C12580l
    public final List<BffProductOrder> getProductsOrder() {
        return this.productsOrder;
    }

    @C12580l
    public final BffRendering getRendering() {
        return this.rendering;
    }

    public int hashCode() {
        String str = this.format;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BffRendering bffRendering = this.rendering;
        int hashCode2 = (hashCode + (bffRendering == null ? 0 : bffRendering.hashCode())) * 31;
        Integer num = this.bffPosition;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.onLoadBeacon;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.onViewBeacon;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.onClickBeacon;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onFileClickBeacon;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.onBasketChangeBeacon;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.onWishlistBeacon;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.onVideoBeacon;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productPage;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.onAvailabilityUpdate;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<BffCriteoProduct> list = this.products;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.lineItemID;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<BffProductOrder> list2 = this.productsOrder;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode14 + i;
    }

    @C12579k
    public String toString() {
        String str = this.format;
        BffRendering bffRendering = this.rendering;
        Integer num = this.bffPosition;
        String str2 = this.onLoadBeacon;
        String str3 = this.onViewBeacon;
        String str4 = this.onClickBeacon;
        String str5 = this.onFileClickBeacon;
        String str6 = this.onBasketChangeBeacon;
        String str7 = this.onWishlistBeacon;
        String str8 = this.onVideoBeacon;
        String str9 = this.productPage;
        String str10 = this.onAvailabilityUpdate;
        List<BffCriteoProduct> list = this.products;
        String str11 = this.lineItemID;
        List<BffProductOrder> list2 = this.productsOrder;
        return "BffCriteoViewItem(format=" + str + ", rendering=" + bffRendering + ", bffPosition=" + num + ", onLoadBeacon=" + str2 + ", onViewBeacon=" + str3 + ", onClickBeacon=" + str4 + ", onFileClickBeacon=" + str5 + ", onBasketChangeBeacon=" + str6 + ", onWishlistBeacon=" + str7 + ", onVideoBeacon=" + str8 + ", productPage=" + str9 + ", onAvailabilityUpdate=" + str10 + ", products=" + list + ", lineItemID=" + str11 + ", productsOrder=" + list2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCriteoViewItem(int i, @C12438n("format") String str, @C12438n("rendering") BffRendering bffRendering, @C12438n("bff_position") Integer num, @C12438n("on_load_beacon") String str2, @C12438n("on_view_beacon") String str3, @C12438n("on_click_beacon") String str4, @C12438n("on_file_click_beacon") String str5, @C12438n("on_basket_change_beacon") String str6, @C12438n("on_wishlist_beacon") String str7, @C12438n("on_video_beacon") String str8, @C12438n("product_page") String str9, @C12438n("on_availability_update") String str10, @C12438n("products") List list, @C12438n("line_item_ID") String str11, @C12438n("products_order") List list2, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCriteoViewItem$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.format = null;
        } else {
            this.format = str;
        }
        if ((i2 & 2) == 0) {
            this.rendering = null;
        } else {
            this.rendering = bffRendering;
        }
        if ((i2 & 4) == 0) {
            this.bffPosition = null;
        } else {
            this.bffPosition = num;
        }
        if ((i2 & 8) == 0) {
            this.onLoadBeacon = null;
        } else {
            this.onLoadBeacon = str2;
        }
        if ((i2 & 16) == 0) {
            this.onViewBeacon = null;
        } else {
            this.onViewBeacon = str3;
        }
        if ((i2 & 32) == 0) {
            this.onClickBeacon = null;
        } else {
            this.onClickBeacon = str4;
        }
        if ((i2 & 64) == 0) {
            this.onFileClickBeacon = null;
        } else {
            this.onFileClickBeacon = str5;
        }
        if ((i2 & 128) == 0) {
            this.onBasketChangeBeacon = null;
        } else {
            this.onBasketChangeBeacon = str6;
        }
        if ((i2 & 256) == 0) {
            this.onWishlistBeacon = null;
        } else {
            this.onWishlistBeacon = str7;
        }
        if ((i2 & 512) == 0) {
            this.onVideoBeacon = null;
        } else {
            this.onVideoBeacon = str8;
        }
        if ((i2 & 1024) == 0) {
            this.productPage = null;
        } else {
            this.productPage = str9;
        }
        if ((i2 & 2048) == 0) {
            this.onAvailabilityUpdate = null;
        } else {
            this.onAvailabilityUpdate = str10;
        }
        if ((i2 & 4096) == 0) {
            this.products = null;
        } else {
            this.products = list;
        }
        if ((i2 & 8192) == 0) {
            this.lineItemID = null;
        } else {
            this.lineItemID = str11;
        }
        if ((i2 & 16384) == 0) {
            this.productsOrder = null;
        } else {
            this.productsOrder = list2;
        }
    }

    public BffCriteoViewItem(@C12580l String str, @C12580l BffRendering bffRendering, @C12580l Integer num, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l List<BffCriteoProduct> list, @C12580l String str11, @C12580l List<BffProductOrder> list2) {
        this.format = str;
        this.rendering = bffRendering;
        this.bffPosition = num;
        this.onLoadBeacon = str2;
        this.onViewBeacon = str3;
        this.onClickBeacon = str4;
        this.onFileClickBeacon = str5;
        this.onBasketChangeBeacon = str6;
        this.onWishlistBeacon = str7;
        this.onVideoBeacon = str8;
        this.productPage = str9;
        this.onAvailabilityUpdate = str10;
        this.products = list;
        this.lineItemID = str11;
        this.productsOrder = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCriteoViewItem(java.lang.String r17, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.List r29, java.lang.String r30, java.util.List r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem.<init>(java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
