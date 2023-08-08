package com.carrefour.fid.android.bff_data_shared.data.api.entities;

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

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u0001\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bI\u0010JB\u0001\b\u0017\u0012\u0006\u0010K\u001a\u00020\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bI\u0010NJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b$\u0010%J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u000bR\"\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R\"\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010/\u0012\u0004\b4\u0010.\u001a\u0004\b3\u00101R\"\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010/\u0012\u0004\b6\u0010.\u001a\u0004\b5\u00101R\"\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010/\u0012\u0004\b8\u0010.\u001a\u0004\b7\u00101R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00109\u0012\u0004\b>\u0010.\u001a\u0004\b=\u0010;R\"\u0010 \u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010/\u0012\u0004\b@\u0010.\u001a\u0004\b?\u00101R\"\u0010!\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010/\u0012\u0004\bB\u0010.\u001a\u0004\bA\u00101R\"\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010C\u0012\u0004\bF\u0010.\u001a\u0004\bD\u0010ER\"\u0010#\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010C\u0012\u0004\bH\u0010.\u001a\u0004\bG\u0010E¨\u0006Q"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB59PushImageDtoAllOf;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "component4", "component5", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "component6", "component7", "component8", "component9", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;", "component10", "component11", "contentId", "title", "design", "ean", "imageFormat", "backgroundImage", "backgroundMobileImage", "description", "legalMentions", "cta1", "cta2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB59PushImageDtoAllOf;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getContentId", "getContentId$annotations", "()V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "getDesign", "getDesign$annotations", "getEan", "getEan$annotations", "getImageFormat", "getImageFormat$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getBackgroundImage", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getBackgroundImage$annotations", "getBackgroundMobileImage", "getBackgroundMobileImage$annotations", "getDescription", "getDescription$annotations", "getLegalMentions", "getLegalMentions$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;", "getCta1", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;", "getCta1$annotations", "getCta2", "getCta2$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB59PushImageDtoAllOf {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffImageDto backgroundImage;
    @C12580l
    private final BffImageDto backgroundMobileImage;
    @C12580l
    private final Integer contentId;
    @C12580l
    private final BffCtaImageDto cta1;
    @C12580l
    private final BffCtaImageDto cta2;
    @C12580l
    private final String description;
    @C12580l
    private final String design;
    @C12580l
    private final String ean;
    @C12580l
    private final String imageFormat;
    @C12580l
    private final String legalMentions;
    @C12580l
    private final String title;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB59PushImageDtoAllOf$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB59PushImageDtoAllOf;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB59PushImageDtoAllOf> serializer() {
            return BffB59PushImageDtoAllOf$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB59PushImageDtoAllOf() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (BffImageDto) null, (BffImageDto) null, (String) null, (String) null, (BffCtaImageDto) null, (BffCtaImageDto) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB59PushImageDtoAllOf copy$default(BffB59PushImageDtoAllOf bffB59PushImageDtoAllOf, Integer num, String str, String str2, String str3, String str4, BffImageDto bffImageDto, BffImageDto bffImageDto2, String str5, String str6, BffCtaImageDto bffCtaImageDto, BffCtaImageDto bffCtaImageDto2, int i, Object obj) {
        BffB59PushImageDtoAllOf bffB59PushImageDtoAllOf2 = bffB59PushImageDtoAllOf;
        int i2 = i;
        return bffB59PushImageDtoAllOf.copy((i2 & 1) != 0 ? bffB59PushImageDtoAllOf2.contentId : num, (i2 & 2) != 0 ? bffB59PushImageDtoAllOf2.title : str, (i2 & 4) != 0 ? bffB59PushImageDtoAllOf2.design : str2, (i2 & 8) != 0 ? bffB59PushImageDtoAllOf2.ean : str3, (i2 & 16) != 0 ? bffB59PushImageDtoAllOf2.imageFormat : str4, (i2 & 32) != 0 ? bffB59PushImageDtoAllOf2.backgroundImage : bffImageDto, (i2 & 64) != 0 ? bffB59PushImageDtoAllOf2.backgroundMobileImage : bffImageDto2, (i2 & 128) != 0 ? bffB59PushImageDtoAllOf2.description : str5, (i2 & 256) != 0 ? bffB59PushImageDtoAllOf2.legalMentions : str6, (i2 & 512) != 0 ? bffB59PushImageDtoAllOf2.cta1 : bffCtaImageDto, (i2 & 1024) != 0 ? bffB59PushImageDtoAllOf2.cta2 : bffCtaImageDto2);
    }

    @C12438n("background_image")
    public static /* synthetic */ void getBackgroundImage$annotations() {
    }

    @C12438n("background_mobile_image")
    public static /* synthetic */ void getBackgroundMobileImage$annotations() {
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

    @C12438n("design")
    public static /* synthetic */ void getDesign$annotations() {
    }

    @C12438n("ean")
    public static /* synthetic */ void getEan$annotations() {
    }

    @C12438n("image_format")
    public static /* synthetic */ void getImageFormat$annotations() {
    }

    @C12438n("legal_mentions")
    public static /* synthetic */ void getLegalMentions$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB59PushImageDtoAllOf bffB59PushImageDtoAllOf, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffB59PushImageDtoAllOf.contentId != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffB59PushImageDtoAllOf.contentId);
        }
        if (dVar.mo24897A(fVar, 1) || bffB59PushImageDtoAllOf.title != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffB59PushImageDtoAllOf.title);
        }
        if (dVar.mo24897A(fVar, 2) || bffB59PushImageDtoAllOf.design != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffB59PushImageDtoAllOf.design);
        }
        if (dVar.mo24897A(fVar, 3) || bffB59PushImageDtoAllOf.ean != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffB59PushImageDtoAllOf.ean);
        }
        if (dVar.mo24897A(fVar, 4) || bffB59PushImageDtoAllOf.imageFormat != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffB59PushImageDtoAllOf.imageFormat);
        }
        if (dVar.mo24897A(fVar, 5) || bffB59PushImageDtoAllOf.backgroundImage != null) {
            dVar.mo24912i(fVar, 5, BffImageDto$$serializer.INSTANCE, bffB59PushImageDtoAllOf.backgroundImage);
        }
        if (dVar.mo24897A(fVar, 6) || bffB59PushImageDtoAllOf.backgroundMobileImage != null) {
            dVar.mo24912i(fVar, 6, BffImageDto$$serializer.INSTANCE, bffB59PushImageDtoAllOf.backgroundMobileImage);
        }
        if (dVar.mo24897A(fVar, 7) || bffB59PushImageDtoAllOf.description != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffB59PushImageDtoAllOf.description);
        }
        if (dVar.mo24897A(fVar, 8) || bffB59PushImageDtoAllOf.legalMentions != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffB59PushImageDtoAllOf.legalMentions);
        }
        if (dVar.mo24897A(fVar, 9) || bffB59PushImageDtoAllOf.cta1 != null) {
            dVar.mo24912i(fVar, 9, BffCtaImageDto$$serializer.INSTANCE, bffB59PushImageDtoAllOf.cta1);
        }
        if (dVar.mo24897A(fVar, 10) || bffB59PushImageDtoAllOf.cta2 != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 10, BffCtaImageDto$$serializer.INSTANCE, bffB59PushImageDtoAllOf.cta2);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.contentId;
    }

    @C12580l
    public final BffCtaImageDto component10() {
        return this.cta1;
    }

    @C12580l
    public final BffCtaImageDto component11() {
        return this.cta2;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final String component3() {
        return this.design;
    }

    @C12580l
    public final String component4() {
        return this.ean;
    }

    @C12580l
    public final String component5() {
        return this.imageFormat;
    }

    @C12580l
    public final BffImageDto component6() {
        return this.backgroundImage;
    }

    @C12580l
    public final BffImageDto component7() {
        return this.backgroundMobileImage;
    }

    @C12580l
    public final String component8() {
        return this.description;
    }

    @C12580l
    public final String component9() {
        return this.legalMentions;
    }

    @C12579k
    public final BffB59PushImageDtoAllOf copy(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l BffImageDto bffImageDto, @C12580l BffImageDto bffImageDto2, @C12580l String str5, @C12580l String str6, @C12580l BffCtaImageDto bffCtaImageDto, @C12580l BffCtaImageDto bffCtaImageDto2) {
        return new BffB59PushImageDtoAllOf(num, str, str2, str3, str4, bffImageDto, bffImageDto2, str5, str6, bffCtaImageDto, bffCtaImageDto2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffB59PushImageDtoAllOf)) {
            return false;
        }
        BffB59PushImageDtoAllOf bffB59PushImageDtoAllOf = (BffB59PushImageDtoAllOf) obj;
        return Intrinsics.areEqual((Object) this.contentId, (Object) bffB59PushImageDtoAllOf.contentId) && Intrinsics.areEqual((Object) this.title, (Object) bffB59PushImageDtoAllOf.title) && Intrinsics.areEqual((Object) this.design, (Object) bffB59PushImageDtoAllOf.design) && Intrinsics.areEqual((Object) this.ean, (Object) bffB59PushImageDtoAllOf.ean) && Intrinsics.areEqual((Object) this.imageFormat, (Object) bffB59PushImageDtoAllOf.imageFormat) && Intrinsics.areEqual((Object) this.backgroundImage, (Object) bffB59PushImageDtoAllOf.backgroundImage) && Intrinsics.areEqual((Object) this.backgroundMobileImage, (Object) bffB59PushImageDtoAllOf.backgroundMobileImage) && Intrinsics.areEqual((Object) this.description, (Object) bffB59PushImageDtoAllOf.description) && Intrinsics.areEqual((Object) this.legalMentions, (Object) bffB59PushImageDtoAllOf.legalMentions) && Intrinsics.areEqual((Object) this.cta1, (Object) bffB59PushImageDtoAllOf.cta1) && Intrinsics.areEqual((Object) this.cta2, (Object) bffB59PushImageDtoAllOf.cta2);
    }

    @C12580l
    public final BffImageDto getBackgroundImage() {
        return this.backgroundImage;
    }

    @C12580l
    public final BffImageDto getBackgroundMobileImage() {
        return this.backgroundMobileImage;
    }

    @C12580l
    public final Integer getContentId() {
        return this.contentId;
    }

    @C12580l
    public final BffCtaImageDto getCta1() {
        return this.cta1;
    }

    @C12580l
    public final BffCtaImageDto getCta2() {
        return this.cta2;
    }

    @C12580l
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final String getDesign() {
        return this.design;
    }

    @C12580l
    public final String getEan() {
        return this.ean;
    }

    @C12580l
    public final String getImageFormat() {
        return this.imageFormat;
    }

    @C12580l
    public final String getLegalMentions() {
        return this.legalMentions;
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
        String str2 = this.design;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ean;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageFormat;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BffImageDto bffImageDto = this.backgroundImage;
        int hashCode6 = (hashCode5 + (bffImageDto == null ? 0 : bffImageDto.hashCode())) * 31;
        BffImageDto bffImageDto2 = this.backgroundMobileImage;
        int hashCode7 = (hashCode6 + (bffImageDto2 == null ? 0 : bffImageDto2.hashCode())) * 31;
        String str5 = this.description;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.legalMentions;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BffCtaImageDto bffCtaImageDto = this.cta1;
        int hashCode10 = (hashCode9 + (bffCtaImageDto == null ? 0 : bffCtaImageDto.hashCode())) * 31;
        BffCtaImageDto bffCtaImageDto2 = this.cta2;
        if (bffCtaImageDto2 != null) {
            i = bffCtaImageDto2.hashCode();
        }
        return hashCode10 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.contentId;
        String str = this.title;
        String str2 = this.design;
        String str3 = this.ean;
        String str4 = this.imageFormat;
        BffImageDto bffImageDto = this.backgroundImage;
        BffImageDto bffImageDto2 = this.backgroundMobileImage;
        String str5 = this.description;
        String str6 = this.legalMentions;
        BffCtaImageDto bffCtaImageDto = this.cta1;
        BffCtaImageDto bffCtaImageDto2 = this.cta2;
        return "BffB59PushImageDtoAllOf(contentId=" + num + ", title=" + str + ", design=" + str2 + ", ean=" + str3 + ", imageFormat=" + str4 + ", backgroundImage=" + bffImageDto + ", backgroundMobileImage=" + bffImageDto2 + ", description=" + str5 + ", legalMentions=" + str6 + ", cta1=" + bffCtaImageDto + ", cta2=" + bffCtaImageDto2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB59PushImageDtoAllOf(int i, @C12438n("content_id") Integer num, @C12438n("title") String str, @C12438n("design") String str2, @C12438n("ean") String str3, @C12438n("image_format") String str4, @C12438n("background_image") BffImageDto bffImageDto, @C12438n("background_mobile_image") BffImageDto bffImageDto2, @C12438n("description") String str5, @C12438n("legal_mentions") String str6, @C12438n("cta1") BffCtaImageDto bffCtaImageDto, @C12438n("cta2") BffCtaImageDto bffCtaImageDto2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB59PushImageDtoAllOf$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.contentId = null;
        } else {
            this.contentId = num;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.design = null;
        } else {
            this.design = str2;
        }
        if ((i & 8) == 0) {
            this.ean = null;
        } else {
            this.ean = str3;
        }
        if ((i & 16) == 0) {
            this.imageFormat = null;
        } else {
            this.imageFormat = str4;
        }
        if ((i & 32) == 0) {
            this.backgroundImage = null;
        } else {
            this.backgroundImage = bffImageDto;
        }
        if ((i & 64) == 0) {
            this.backgroundMobileImage = null;
        } else {
            this.backgroundMobileImage = bffImageDto2;
        }
        if ((i & 128) == 0) {
            this.description = null;
        } else {
            this.description = str5;
        }
        if ((i & 256) == 0) {
            this.legalMentions = null;
        } else {
            this.legalMentions = str6;
        }
        if ((i & 512) == 0) {
            this.cta1 = null;
        } else {
            this.cta1 = bffCtaImageDto;
        }
        if ((i & 1024) == 0) {
            this.cta2 = null;
        } else {
            this.cta2 = bffCtaImageDto2;
        }
    }

    public BffB59PushImageDtoAllOf(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l BffImageDto bffImageDto, @C12580l BffImageDto bffImageDto2, @C12580l String str5, @C12580l String str6, @C12580l BffCtaImageDto bffCtaImageDto, @C12580l BffCtaImageDto bffCtaImageDto2) {
        this.contentId = num;
        this.title = str;
        this.design = str2;
        this.ean = str3;
        this.imageFormat = str4;
        this.backgroundImage = bffImageDto;
        this.backgroundMobileImage = bffImageDto2;
        this.description = str5;
        this.legalMentions = str6;
        this.cta1 = bffCtaImageDto;
        this.cta2 = bffCtaImageDto2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffB59PushImageDtoAllOf(java.lang.Integer r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r18, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r19, java.lang.String r20, java.lang.String r21, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto r22, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB59PushImageDtoAllOf.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
