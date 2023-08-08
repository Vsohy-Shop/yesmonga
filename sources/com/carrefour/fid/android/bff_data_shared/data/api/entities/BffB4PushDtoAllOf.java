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
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 S2\u00020\u0001:\u0002TSB\u0001\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bM\u0010NB«\u0001\b\u0017\u0012\u0006\u0010O\u001a\u00020'\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\b\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bM\u0010RJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020'HÖ\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\"\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010.R\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010,\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010.R\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010,\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010.R\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010,\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010.R\"\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010,\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010.R\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010,\u0012\u0004\b<\u00100\u001a\u0004\b;\u0010.R\"\u0010 \u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R\"\u0010!\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010A\u0012\u0004\bD\u00100\u001a\u0004\bB\u0010CR\"\u0010\"\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010E\u0012\u0004\bH\u00100\u001a\u0004\bF\u0010GR\"\u0010#\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010E\u0012\u0004\bJ\u00100\u001a\u0004\bI\u0010GR\"\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010,\u0012\u0004\bL\u00100\u001a\u0004\bK\u0010.¨\u0006U"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB4PushDtoAllOf;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "component8", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "component9", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "component10", "component11", "component12", "title", "description", "bgColor", "titleSize", "titleWeight", "titleColor", "format", "image", "video", "cta", "cta2", "design", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getBgColor", "getBgColor$annotations", "getTitleSize", "getTitleSize$annotations", "getTitleWeight", "getTitleWeight$annotations", "getTitleColor", "getTitleColor$annotations", "getFormat", "getFormat$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "getVideo", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "getVideo$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta$annotations", "getCta2", "getCta2$annotations", "getDesign", "getDesign$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB4PushDtoAllOf {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String bgColor;
    @C12580l
    private final BffUrlDto cta;
    @C12580l
    private final BffUrlDto cta2;
    @C12580l
    private final String description;
    @C12580l
    private final String design;
    @C12580l
    private final String format;
    @C12580l
    private final BffImageDto image;
    @C12580l
    private final String title;
    @C12580l
    private final String titleColor;
    @C12580l
    private final String titleSize;
    @C12580l
    private final String titleWeight;
    @C12580l
    private final BffVideoDto video;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB4PushDtoAllOf$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB4PushDtoAllOf;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB4PushDtoAllOf> serializer() {
            return BffB4PushDtoAllOf$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB4PushDtoAllOf() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffImageDto) null, (BffVideoDto) null, (BffUrlDto) null, (BffUrlDto) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB4PushDtoAllOf copy$default(BffB4PushDtoAllOf bffB4PushDtoAllOf, String str, String str2, String str3, String str4, String str5, String str6, String str7, BffImageDto bffImageDto, BffVideoDto bffVideoDto, BffUrlDto bffUrlDto, BffUrlDto bffUrlDto2, String str8, int i, Object obj) {
        BffB4PushDtoAllOf bffB4PushDtoAllOf2 = bffB4PushDtoAllOf;
        int i2 = i;
        return bffB4PushDtoAllOf.copy((i2 & 1) != 0 ? bffB4PushDtoAllOf2.title : str, (i2 & 2) != 0 ? bffB4PushDtoAllOf2.description : str2, (i2 & 4) != 0 ? bffB4PushDtoAllOf2.bgColor : str3, (i2 & 8) != 0 ? bffB4PushDtoAllOf2.titleSize : str4, (i2 & 16) != 0 ? bffB4PushDtoAllOf2.titleWeight : str5, (i2 & 32) != 0 ? bffB4PushDtoAllOf2.titleColor : str6, (i2 & 64) != 0 ? bffB4PushDtoAllOf2.format : str7, (i2 & 128) != 0 ? bffB4PushDtoAllOf2.image : bffImageDto, (i2 & 256) != 0 ? bffB4PushDtoAllOf2.video : bffVideoDto, (i2 & 512) != 0 ? bffB4PushDtoAllOf2.cta : bffUrlDto, (i2 & 1024) != 0 ? bffB4PushDtoAllOf2.cta2 : bffUrlDto2, (i2 & 2048) != 0 ? bffB4PushDtoAllOf2.design : str8);
    }

    @C12438n("bg_color")
    public static /* synthetic */ void getBgColor$annotations() {
    }

    @C12438n("cta")
    public static /* synthetic */ void getCta$annotations() {
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

    @C12438n("format")
    public static /* synthetic */ void getFormat$annotations() {
    }

    @C12438n("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C12438n("title_color")
    public static /* synthetic */ void getTitleColor$annotations() {
    }

    @C12438n("title_size")
    public static /* synthetic */ void getTitleSize$annotations() {
    }

    @C12438n("title_weight")
    public static /* synthetic */ void getTitleWeight$annotations() {
    }

    @C12438n("video")
    public static /* synthetic */ void getVideo$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB4PushDtoAllOf bffB4PushDtoAllOf, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffB4PushDtoAllOf.title != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffB4PushDtoAllOf.title);
        }
        if (dVar.mo24897A(fVar, 1) || bffB4PushDtoAllOf.description != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffB4PushDtoAllOf.description);
        }
        if (dVar.mo24897A(fVar, 2) || bffB4PushDtoAllOf.bgColor != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffB4PushDtoAllOf.bgColor);
        }
        if (dVar.mo24897A(fVar, 3) || bffB4PushDtoAllOf.titleSize != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffB4PushDtoAllOf.titleSize);
        }
        if (dVar.mo24897A(fVar, 4) || bffB4PushDtoAllOf.titleWeight != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffB4PushDtoAllOf.titleWeight);
        }
        if (dVar.mo24897A(fVar, 5) || bffB4PushDtoAllOf.titleColor != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffB4PushDtoAllOf.titleColor);
        }
        if (dVar.mo24897A(fVar, 6) || bffB4PushDtoAllOf.format != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffB4PushDtoAllOf.format);
        }
        if (dVar.mo24897A(fVar, 7) || bffB4PushDtoAllOf.image != null) {
            dVar.mo24912i(fVar, 7, BffImageDto$$serializer.INSTANCE, bffB4PushDtoAllOf.image);
        }
        if (dVar.mo24897A(fVar, 8) || bffB4PushDtoAllOf.video != null) {
            dVar.mo24912i(fVar, 8, BffVideoDto$$serializer.INSTANCE, bffB4PushDtoAllOf.video);
        }
        if (dVar.mo24897A(fVar, 9) || bffB4PushDtoAllOf.cta != null) {
            dVar.mo24912i(fVar, 9, BffUrlDto$$serializer.INSTANCE, bffB4PushDtoAllOf.cta);
        }
        if (dVar.mo24897A(fVar, 10) || bffB4PushDtoAllOf.cta2 != null) {
            dVar.mo24912i(fVar, 10, BffUrlDto$$serializer.INSTANCE, bffB4PushDtoAllOf.cta2);
        }
        if (dVar.mo24897A(fVar, 11) || bffB4PushDtoAllOf.design != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffB4PushDtoAllOf.design);
        }
    }

    @C12580l
    public final String component1() {
        return this.title;
    }

    @C12580l
    public final BffUrlDto component10() {
        return this.cta;
    }

    @C12580l
    public final BffUrlDto component11() {
        return this.cta2;
    }

    @C12580l
    public final String component12() {
        return this.design;
    }

    @C12580l
    public final String component2() {
        return this.description;
    }

    @C12580l
    public final String component3() {
        return this.bgColor;
    }

    @C12580l
    public final String component4() {
        return this.titleSize;
    }

    @C12580l
    public final String component5() {
        return this.titleWeight;
    }

    @C12580l
    public final String component6() {
        return this.titleColor;
    }

    @C12580l
    public final String component7() {
        return this.format;
    }

    @C12580l
    public final BffImageDto component8() {
        return this.image;
    }

    @C12580l
    public final BffVideoDto component9() {
        return this.video;
    }

    @C12579k
    public final BffB4PushDtoAllOf copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l BffImageDto bffImageDto, @C12580l BffVideoDto bffVideoDto, @C12580l BffUrlDto bffUrlDto, @C12580l BffUrlDto bffUrlDto2, @C12580l String str8) {
        return new BffB4PushDtoAllOf(str, str2, str3, str4, str5, str6, str7, bffImageDto, bffVideoDto, bffUrlDto, bffUrlDto2, str8);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffB4PushDtoAllOf)) {
            return false;
        }
        BffB4PushDtoAllOf bffB4PushDtoAllOf = (BffB4PushDtoAllOf) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) bffB4PushDtoAllOf.title) && Intrinsics.areEqual((Object) this.description, (Object) bffB4PushDtoAllOf.description) && Intrinsics.areEqual((Object) this.bgColor, (Object) bffB4PushDtoAllOf.bgColor) && Intrinsics.areEqual((Object) this.titleSize, (Object) bffB4PushDtoAllOf.titleSize) && Intrinsics.areEqual((Object) this.titleWeight, (Object) bffB4PushDtoAllOf.titleWeight) && Intrinsics.areEqual((Object) this.titleColor, (Object) bffB4PushDtoAllOf.titleColor) && Intrinsics.areEqual((Object) this.format, (Object) bffB4PushDtoAllOf.format) && Intrinsics.areEqual((Object) this.image, (Object) bffB4PushDtoAllOf.image) && Intrinsics.areEqual((Object) this.video, (Object) bffB4PushDtoAllOf.video) && Intrinsics.areEqual((Object) this.cta, (Object) bffB4PushDtoAllOf.cta) && Intrinsics.areEqual((Object) this.cta2, (Object) bffB4PushDtoAllOf.cta2) && Intrinsics.areEqual((Object) this.design, (Object) bffB4PushDtoAllOf.design);
    }

    @C12580l
    public final String getBgColor() {
        return this.bgColor;
    }

    @C12580l
    public final BffUrlDto getCta() {
        return this.cta;
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
    public final String getDesign() {
        return this.design;
    }

    @C12580l
    public final String getFormat() {
        return this.format;
    }

    @C12580l
    public final BffImageDto getImage() {
        return this.image;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    @C12580l
    public final String getTitleColor() {
        return this.titleColor;
    }

    @C12580l
    public final String getTitleSize() {
        return this.titleSize;
    }

    @C12580l
    public final String getTitleWeight() {
        return this.titleWeight;
    }

    @C12580l
    public final BffVideoDto getVideo() {
        return this.video;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bgColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleSize;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleWeight;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.titleColor;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.format;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BffImageDto bffImageDto = this.image;
        int hashCode8 = (hashCode7 + (bffImageDto == null ? 0 : bffImageDto.hashCode())) * 31;
        BffVideoDto bffVideoDto = this.video;
        int hashCode9 = (hashCode8 + (bffVideoDto == null ? 0 : bffVideoDto.hashCode())) * 31;
        BffUrlDto bffUrlDto = this.cta;
        int hashCode10 = (hashCode9 + (bffUrlDto == null ? 0 : bffUrlDto.hashCode())) * 31;
        BffUrlDto bffUrlDto2 = this.cta2;
        int hashCode11 = (hashCode10 + (bffUrlDto2 == null ? 0 : bffUrlDto2.hashCode())) * 31;
        String str8 = this.design;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode11 + i;
    }

    @C12579k
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.bgColor;
        String str4 = this.titleSize;
        String str5 = this.titleWeight;
        String str6 = this.titleColor;
        String str7 = this.format;
        BffImageDto bffImageDto = this.image;
        BffVideoDto bffVideoDto = this.video;
        BffUrlDto bffUrlDto = this.cta;
        BffUrlDto bffUrlDto2 = this.cta2;
        String str8 = this.design;
        return "BffB4PushDtoAllOf(title=" + str + ", description=" + str2 + ", bgColor=" + str3 + ", titleSize=" + str4 + ", titleWeight=" + str5 + ", titleColor=" + str6 + ", format=" + str7 + ", image=" + bffImageDto + ", video=" + bffVideoDto + ", cta=" + bffUrlDto + ", cta2=" + bffUrlDto2 + ", design=" + str8 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB4PushDtoAllOf(int i, @C12438n("title") String str, @C12438n("description") String str2, @C12438n("bg_color") String str3, @C12438n("title_size") String str4, @C12438n("title_weight") String str5, @C12438n("title_color") String str6, @C12438n("format") String str7, @C12438n("image") BffImageDto bffImageDto, @C12438n("video") BffVideoDto bffVideoDto, @C12438n("cta") BffUrlDto bffUrlDto, @C12438n("cta2") BffUrlDto bffUrlDto2, @C12438n("design") String str8, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB4PushDtoAllOf$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.bgColor = null;
        } else {
            this.bgColor = str3;
        }
        if ((i & 8) == 0) {
            this.titleSize = null;
        } else {
            this.titleSize = str4;
        }
        if ((i & 16) == 0) {
            this.titleWeight = null;
        } else {
            this.titleWeight = str5;
        }
        if ((i & 32) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = str6;
        }
        if ((i & 64) == 0) {
            this.format = null;
        } else {
            this.format = str7;
        }
        if ((i & 128) == 0) {
            this.image = null;
        } else {
            this.image = bffImageDto;
        }
        if ((i & 256) == 0) {
            this.video = null;
        } else {
            this.video = bffVideoDto;
        }
        if ((i & 512) == 0) {
            this.cta = null;
        } else {
            this.cta = bffUrlDto;
        }
        if ((i & 1024) == 0) {
            this.cta2 = null;
        } else {
            this.cta2 = bffUrlDto2;
        }
        if ((i & 2048) == 0) {
            this.design = null;
        } else {
            this.design = str8;
        }
    }

    public BffB4PushDtoAllOf(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l BffImageDto bffImageDto, @C12580l BffVideoDto bffVideoDto, @C12580l BffUrlDto bffUrlDto, @C12580l BffUrlDto bffUrlDto2, @C12580l String str8) {
        this.title = str;
        this.description = str2;
        this.bgColor = str3;
        this.titleSize = str4;
        this.titleWeight = str5;
        this.titleColor = str6;
        this.format = str7;
        this.image = bffImageDto;
        this.video = bffVideoDto;
        this.cta = bffUrlDto;
        this.cta2 = bffUrlDto2;
        this.design = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffB4PushDtoAllOf(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r21, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto r22, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r23, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r15
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0019
        L_0x0017:
            r4 = r16
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r22
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r2
            goto L_0x0051
        L_0x004f:
            r11 = r23
        L_0x0051:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0057
            r12 = r2
            goto L_0x0059
        L_0x0057:
            r12 = r24
        L_0x0059:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r2 = r25
        L_0x0060:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB4PushDtoAllOf.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
