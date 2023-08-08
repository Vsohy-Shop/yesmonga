package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.p004ui.unit.C16476b;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 W2\u00020\u0001:\u0002XWB£\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bQ\u0010RB·\u0001\b\u0017\u0012\u0006\u0010S\u001a\u00020\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bQ\u0010VJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0016HÆ\u0003J¬\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010*\u001a\u00020\fHÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001J\u0013\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u000bR\"\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u00103\u0012\u0004\b6\u00102\u001a\u0004\b4\u00105R\"\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u00103\u0012\u0004\b8\u00102\u001a\u0004\b7\u00105R\"\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u00103\u0012\u0004\b:\u00102\u001a\u0004\b9\u00105R\"\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00103\u0012\u0004\b<\u00102\u001a\u0004\b;\u00105R\"\u0010 \u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u00103\u0012\u0004\b>\u00102\u001a\u0004\b=\u00105R\"\u0010!\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u00103\u0012\u0004\b@\u00102\u001a\u0004\b?\u00105R\"\u0010\"\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010A\u0012\u0004\bD\u00102\u001a\u0004\bB\u0010CR\"\u0010#\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010A\u0012\u0004\bF\u00102\u001a\u0004\bE\u0010CR\"\u0010$\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010G\u0012\u0004\bJ\u00102\u001a\u0004\bH\u0010IR\"\u0010%\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010G\u0012\u0004\bL\u00102\u001a\u0004\bK\u0010IR\"\u0010&\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010A\u0012\u0004\bN\u00102\u001a\u0004\bM\u0010CR\"\u0010'\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010G\u0012\u0004\bP\u00102\u001a\u0004\bO\u0010I¨\u0006Y"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB60PageHeaderDtoAllOf;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "component4", "component5", "component6", "component7", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "component8", "component9", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "component10", "component11", "component12", "component13", "contentId", "title", "description", "subheadTitle", "textColor", "blockPosition", "bgColor", "image", "imageMobile", "cta1", "cta2", "picto", "pictoLink", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB60PageHeaderDtoAllOf;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getContentId", "getContentId$annotations", "()V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "getDescription", "getDescription$annotations", "getSubheadTitle", "getSubheadTitle$annotations", "getTextColor", "getTextColor$annotations", "getBlockPosition", "getBlockPosition$annotations", "getBgColor", "getBgColor$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage$annotations", "getImageMobile", "getImageMobile$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta1", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta1$annotations", "getCta2", "getCta2$annotations", "getPicto", "getPicto$annotations", "getPictoLink", "getPictoLink$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB60PageHeaderDtoAllOf {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String bgColor;
    @C12580l
    private final String blockPosition;
    @C12580l
    private final Integer contentId;
    @C12580l
    private final BffUrlDto cta1;
    @C12580l
    private final BffUrlDto cta2;
    @C12580l
    private final String description;
    @C12580l
    private final BffImageDto image;
    @C12580l
    private final BffImageDto imageMobile;
    @C12580l
    private final BffImageDto picto;
    @C12580l
    private final BffUrlDto pictoLink;
    @C12580l
    private final String subheadTitle;
    @C12580l
    private final String textColor;
    @C12580l
    private final String title;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB60PageHeaderDtoAllOf$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB60PageHeaderDtoAllOf;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB60PageHeaderDtoAllOf> serializer() {
            return BffB60PageHeaderDtoAllOf$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB60PageHeaderDtoAllOf() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffImageDto) null, (BffImageDto) null, (BffUrlDto) null, (BffUrlDto) null, (BffImageDto) null, (BffUrlDto) null, (int) C16476b.f40864p, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB60PageHeaderDtoAllOf copy$default(BffB60PageHeaderDtoAllOf bffB60PageHeaderDtoAllOf, Integer num, String str, String str2, String str3, String str4, String str5, String str6, BffImageDto bffImageDto, BffImageDto bffImageDto2, BffUrlDto bffUrlDto, BffUrlDto bffUrlDto2, BffImageDto bffImageDto3, BffUrlDto bffUrlDto3, int i, Object obj) {
        BffB60PageHeaderDtoAllOf bffB60PageHeaderDtoAllOf2 = bffB60PageHeaderDtoAllOf;
        int i2 = i;
        return bffB60PageHeaderDtoAllOf.copy((i2 & 1) != 0 ? bffB60PageHeaderDtoAllOf2.contentId : num, (i2 & 2) != 0 ? bffB60PageHeaderDtoAllOf2.title : str, (i2 & 4) != 0 ? bffB60PageHeaderDtoAllOf2.description : str2, (i2 & 8) != 0 ? bffB60PageHeaderDtoAllOf2.subheadTitle : str3, (i2 & 16) != 0 ? bffB60PageHeaderDtoAllOf2.textColor : str4, (i2 & 32) != 0 ? bffB60PageHeaderDtoAllOf2.blockPosition : str5, (i2 & 64) != 0 ? bffB60PageHeaderDtoAllOf2.bgColor : str6, (i2 & 128) != 0 ? bffB60PageHeaderDtoAllOf2.image : bffImageDto, (i2 & 256) != 0 ? bffB60PageHeaderDtoAllOf2.imageMobile : bffImageDto2, (i2 & 512) != 0 ? bffB60PageHeaderDtoAllOf2.cta1 : bffUrlDto, (i2 & 1024) != 0 ? bffB60PageHeaderDtoAllOf2.cta2 : bffUrlDto2, (i2 & 2048) != 0 ? bffB60PageHeaderDtoAllOf2.picto : bffImageDto3, (i2 & 4096) != 0 ? bffB60PageHeaderDtoAllOf2.pictoLink : bffUrlDto3);
    }

    @C12438n("bg_color")
    public static /* synthetic */ void getBgColor$annotations() {
    }

    @C12438n("block_position")
    public static /* synthetic */ void getBlockPosition$annotations() {
    }

    @C12438n("content_id")
    public static /* synthetic */ void getContentId$annotations() {
    }

    @C12438n("cta1")
    public static /* synthetic */ void getCta1$annotations() {
    }

    @C12438n("cta2")
    public static /* synthetic */ void getCta2$annotations() {
    }

    @C12438n("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @C12438n("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @C12438n("image_mobile")
    public static /* synthetic */ void getImageMobile$annotations() {
    }

    @C12438n("picto")
    public static /* synthetic */ void getPicto$annotations() {
    }

    @C12438n("picto_link")
    public static /* synthetic */ void getPictoLink$annotations() {
    }

    @C12438n("subhead_title")
    public static /* synthetic */ void getSubheadTitle$annotations() {
    }

    @C12438n("text_color")
    public static /* synthetic */ void getTextColor$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB60PageHeaderDtoAllOf bffB60PageHeaderDtoAllOf, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffB60PageHeaderDtoAllOf.contentId != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffB60PageHeaderDtoAllOf.contentId);
        }
        if (dVar.mo24897A(fVar, 1) || bffB60PageHeaderDtoAllOf.title != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffB60PageHeaderDtoAllOf.title);
        }
        if (dVar.mo24897A(fVar, 2) || bffB60PageHeaderDtoAllOf.description != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffB60PageHeaderDtoAllOf.description);
        }
        if (dVar.mo24897A(fVar, 3) || bffB60PageHeaderDtoAllOf.subheadTitle != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffB60PageHeaderDtoAllOf.subheadTitle);
        }
        if (dVar.mo24897A(fVar, 4) || bffB60PageHeaderDtoAllOf.textColor != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffB60PageHeaderDtoAllOf.textColor);
        }
        if (dVar.mo24897A(fVar, 5) || bffB60PageHeaderDtoAllOf.blockPosition != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffB60PageHeaderDtoAllOf.blockPosition);
        }
        if (dVar.mo24897A(fVar, 6) || bffB60PageHeaderDtoAllOf.bgColor != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffB60PageHeaderDtoAllOf.bgColor);
        }
        if (dVar.mo24897A(fVar, 7) || bffB60PageHeaderDtoAllOf.image != null) {
            dVar.mo24912i(fVar, 7, BffImageDto$$serializer.INSTANCE, bffB60PageHeaderDtoAllOf.image);
        }
        if (dVar.mo24897A(fVar, 8) || bffB60PageHeaderDtoAllOf.imageMobile != null) {
            dVar.mo24912i(fVar, 8, BffImageDto$$serializer.INSTANCE, bffB60PageHeaderDtoAllOf.imageMobile);
        }
        if (dVar.mo24897A(fVar, 9) || bffB60PageHeaderDtoAllOf.cta1 != null) {
            dVar.mo24912i(fVar, 9, BffUrlDto$$serializer.INSTANCE, bffB60PageHeaderDtoAllOf.cta1);
        }
        if (dVar.mo24897A(fVar, 10) || bffB60PageHeaderDtoAllOf.cta2 != null) {
            dVar.mo24912i(fVar, 10, BffUrlDto$$serializer.INSTANCE, bffB60PageHeaderDtoAllOf.cta2);
        }
        if (dVar.mo24897A(fVar, 11) || bffB60PageHeaderDtoAllOf.picto != null) {
            dVar.mo24912i(fVar, 11, BffImageDto$$serializer.INSTANCE, bffB60PageHeaderDtoAllOf.picto);
        }
        if (dVar.mo24897A(fVar, 12) || bffB60PageHeaderDtoAllOf.pictoLink != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 12, BffUrlDto$$serializer.INSTANCE, bffB60PageHeaderDtoAllOf.pictoLink);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.contentId;
    }

    @C12580l
    public final BffUrlDto component10() {
        return this.cta1;
    }

    @C12580l
    public final BffUrlDto component11() {
        return this.cta2;
    }

    @C12580l
    public final BffImageDto component12() {
        return this.picto;
    }

    @C12580l
    public final BffUrlDto component13() {
        return this.pictoLink;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final String component3() {
        return this.description;
    }

    @C12580l
    public final String component4() {
        return this.subheadTitle;
    }

    @C12580l
    public final String component5() {
        return this.textColor;
    }

    @C12580l
    public final String component6() {
        return this.blockPosition;
    }

    @C12580l
    public final String component7() {
        return this.bgColor;
    }

    @C12580l
    public final BffImageDto component8() {
        return this.image;
    }

    @C12580l
    public final BffImageDto component9() {
        return this.imageMobile;
    }

    @C12579k
    public final BffB60PageHeaderDtoAllOf copy(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l BffImageDto bffImageDto, @C12580l BffImageDto bffImageDto2, @C12580l BffUrlDto bffUrlDto, @C12580l BffUrlDto bffUrlDto2, @C12580l BffImageDto bffImageDto3, @C12580l BffUrlDto bffUrlDto3) {
        return new BffB60PageHeaderDtoAllOf(num, str, str2, str3, str4, str5, str6, bffImageDto, bffImageDto2, bffUrlDto, bffUrlDto2, bffImageDto3, bffUrlDto3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffB60PageHeaderDtoAllOf)) {
            return false;
        }
        BffB60PageHeaderDtoAllOf bffB60PageHeaderDtoAllOf = (BffB60PageHeaderDtoAllOf) obj;
        return Intrinsics.areEqual((Object) this.contentId, (Object) bffB60PageHeaderDtoAllOf.contentId) && Intrinsics.areEqual((Object) this.title, (Object) bffB60PageHeaderDtoAllOf.title) && Intrinsics.areEqual((Object) this.description, (Object) bffB60PageHeaderDtoAllOf.description) && Intrinsics.areEqual((Object) this.subheadTitle, (Object) bffB60PageHeaderDtoAllOf.subheadTitle) && Intrinsics.areEqual((Object) this.textColor, (Object) bffB60PageHeaderDtoAllOf.textColor) && Intrinsics.areEqual((Object) this.blockPosition, (Object) bffB60PageHeaderDtoAllOf.blockPosition) && Intrinsics.areEqual((Object) this.bgColor, (Object) bffB60PageHeaderDtoAllOf.bgColor) && Intrinsics.areEqual((Object) this.image, (Object) bffB60PageHeaderDtoAllOf.image) && Intrinsics.areEqual((Object) this.imageMobile, (Object) bffB60PageHeaderDtoAllOf.imageMobile) && Intrinsics.areEqual((Object) this.cta1, (Object) bffB60PageHeaderDtoAllOf.cta1) && Intrinsics.areEqual((Object) this.cta2, (Object) bffB60PageHeaderDtoAllOf.cta2) && Intrinsics.areEqual((Object) this.picto, (Object) bffB60PageHeaderDtoAllOf.picto) && Intrinsics.areEqual((Object) this.pictoLink, (Object) bffB60PageHeaderDtoAllOf.pictoLink);
    }

    @C12580l
    public final String getBgColor() {
        return this.bgColor;
    }

    @C12580l
    public final String getBlockPosition() {
        return this.blockPosition;
    }

    @C12580l
    public final Integer getContentId() {
        return this.contentId;
    }

    @C12580l
    public final BffUrlDto getCta1() {
        return this.cta1;
    }

    @C12580l
    public final BffUrlDto getCta2() {
        return this.cta2;
    }

    @C12580l
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final BffImageDto getImage() {
        return this.image;
    }

    @C12580l
    public final BffImageDto getImageMobile() {
        return this.imageMobile;
    }

    @C12580l
    public final BffImageDto getPicto() {
        return this.picto;
    }

    @C12580l
    public final BffUrlDto getPictoLink() {
        return this.pictoLink;
    }

    @C12580l
    public final String getSubheadTitle() {
        return this.subheadTitle;
    }

    @C12580l
    public final String getTextColor() {
        return this.textColor;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.contentId;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subheadTitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.blockPosition;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bgColor;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BffImageDto bffImageDto = this.image;
        int hashCode8 = (hashCode7 + (bffImageDto == null ? 0 : bffImageDto.hashCode())) * 31;
        BffImageDto bffImageDto2 = this.imageMobile;
        int hashCode9 = (hashCode8 + (bffImageDto2 == null ? 0 : bffImageDto2.hashCode())) * 31;
        BffUrlDto bffUrlDto = this.cta1;
        int hashCode10 = (hashCode9 + (bffUrlDto == null ? 0 : bffUrlDto.hashCode())) * 31;
        BffUrlDto bffUrlDto2 = this.cta2;
        int hashCode11 = (hashCode10 + (bffUrlDto2 == null ? 0 : bffUrlDto2.hashCode())) * 31;
        BffImageDto bffImageDto3 = this.picto;
        int hashCode12 = (hashCode11 + (bffImageDto3 == null ? 0 : bffImageDto3.hashCode())) * 31;
        BffUrlDto bffUrlDto3 = this.pictoLink;
        if (bffUrlDto3 != null) {
            i = bffUrlDto3.hashCode();
        }
        return hashCode12 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.contentId;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.subheadTitle;
        String str4 = this.textColor;
        String str5 = this.blockPosition;
        String str6 = this.bgColor;
        BffImageDto bffImageDto = this.image;
        BffImageDto bffImageDto2 = this.imageMobile;
        BffUrlDto bffUrlDto = this.cta1;
        BffUrlDto bffUrlDto2 = this.cta2;
        BffImageDto bffImageDto3 = this.picto;
        BffUrlDto bffUrlDto3 = this.pictoLink;
        return "BffB60PageHeaderDtoAllOf(contentId=" + num + ", title=" + str + ", description=" + str2 + ", subheadTitle=" + str3 + ", textColor=" + str4 + ", blockPosition=" + str5 + ", bgColor=" + str6 + ", image=" + bffImageDto + ", imageMobile=" + bffImageDto2 + ", cta1=" + bffUrlDto + ", cta2=" + bffUrlDto2 + ", picto=" + bffImageDto3 + ", pictoLink=" + bffUrlDto3 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB60PageHeaderDtoAllOf(int i, @C12438n("content_id") Integer num, @C12438n("title") String str, @C12438n("description") String str2, @C12438n("subhead_title") String str3, @C12438n("text_color") String str4, @C12438n("block_position") String str5, @C12438n("bg_color") String str6, @C12438n("image") BffImageDto bffImageDto, @C12438n("image_mobile") BffImageDto bffImageDto2, @C12438n("cta1") BffUrlDto bffUrlDto, @C12438n("cta2") BffUrlDto bffUrlDto2, @C12438n("picto") BffImageDto bffImageDto3, @C12438n("picto_link") BffUrlDto bffUrlDto3, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB60PageHeaderDtoAllOf$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.contentId = null;
        } else {
            this.contentId = num;
        }
        if ((i2 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i2 & 4) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i2 & 8) == 0) {
            this.subheadTitle = null;
        } else {
            this.subheadTitle = str3;
        }
        if ((i2 & 16) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str4;
        }
        if ((i2 & 32) == 0) {
            this.blockPosition = null;
        } else {
            this.blockPosition = str5;
        }
        if ((i2 & 64) == 0) {
            this.bgColor = null;
        } else {
            this.bgColor = str6;
        }
        if ((i2 & 128) == 0) {
            this.image = null;
        } else {
            this.image = bffImageDto;
        }
        if ((i2 & 256) == 0) {
            this.imageMobile = null;
        } else {
            this.imageMobile = bffImageDto2;
        }
        if ((i2 & 512) == 0) {
            this.cta1 = null;
        } else {
            this.cta1 = bffUrlDto;
        }
        if ((i2 & 1024) == 0) {
            this.cta2 = null;
        } else {
            this.cta2 = bffUrlDto2;
        }
        if ((i2 & 2048) == 0) {
            this.picto = null;
        } else {
            this.picto = bffImageDto3;
        }
        if ((i2 & 4096) == 0) {
            this.pictoLink = null;
        } else {
            this.pictoLink = bffUrlDto3;
        }
    }

    public BffB60PageHeaderDtoAllOf(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l BffImageDto bffImageDto, @C12580l BffImageDto bffImageDto2, @C12580l BffUrlDto bffUrlDto, @C12580l BffUrlDto bffUrlDto2, @C12580l BffImageDto bffImageDto3, @C12580l BffUrlDto bffUrlDto3) {
        this.contentId = num;
        this.title = str;
        this.description = str2;
        this.subheadTitle = str3;
        this.textColor = str4;
        this.blockPosition = str5;
        this.bgColor = str6;
        this.image = bffImageDto;
        this.imageMobile = bffImageDto2;
        this.cta1 = bffUrlDto;
        this.cta2 = bffUrlDto2;
        this.picto = bffImageDto3;
        this.pictoLink = bffUrlDto3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffB60PageHeaderDtoAllOf(java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r22, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r23, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r24, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r25, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r26, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = r2
            goto L_0x005a
        L_0x0058:
            r12 = r25
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = r2
            goto L_0x0062
        L_0x0060:
            r13 = r26
        L_0x0062:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r2 = r27
        L_0x0069:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB60PageHeaderDtoAllOf.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
