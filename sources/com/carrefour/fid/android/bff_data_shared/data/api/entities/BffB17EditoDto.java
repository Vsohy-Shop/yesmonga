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

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 V2\u00020\u0001:\u0002WVB\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bP\u0010QB«\u0001\b\u0017\u0012\u0006\u0010R\u001a\u00020\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bP\u0010UJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ \u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b'\u0010(J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0018HÖ\u0001J\u0013\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010.\u0012\u0004\b4\u00102\u001a\u0004\b3\u00100R\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010.\u0012\u0004\b6\u00102\u001a\u0004\b5\u00100R\"\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010.\u0012\u0004\b8\u00102\u001a\u0004\b7\u00100R\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010.\u0012\u0004\b:\u00102\u001a\u0004\b9\u00100R\"\u0010 \u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010.\u0012\u0004\b<\u00102\u001a\u0004\b;\u00100R\"\u0010!\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010.\u0012\u0004\b>\u00102\u001a\u0004\b=\u00100R\"\u0010\"\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010.\u0012\u0004\b@\u00102\u001a\u0004\b?\u00100R\"\u0010#\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010A\u0012\u0004\bD\u00102\u001a\u0004\bB\u0010CR\"\u0010$\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010E\u0012\u0004\bH\u00102\u001a\u0004\bF\u0010GR\"\u0010%\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010I\u0012\u0004\bL\u00102\u001a\u0004\bJ\u0010KR\"\u0010&\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010M\u0012\u0004\bO\u00102\u001a\u0004\bN\u0010\u001a¨\u0006X"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB17EditoDto;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "component9", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "component10", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "component11", "", "component12", "()Ljava/lang/Integer;", "templateId", "title", "bgColor", "titleAlign", "titleSize", "titleWeight", "titleColor", "description", "image", "video", "cta", "weight", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/Integer;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB17EditoDto;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTemplateId", "()Ljava/lang/String;", "getTemplateId$annotations", "()V", "getTitle", "getTitle$annotations", "getBgColor", "getBgColor$annotations", "getTitleAlign", "getTitleAlign$annotations", "getTitleSize", "getTitleSize$annotations", "getTitleWeight", "getTitleWeight$annotations", "getTitleColor", "getTitleColor$annotations", "getDescription", "getDescription$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "getVideo", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "getVideo$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getCta$annotations", "Ljava/lang/Integer;", "getWeight", "getWeight$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/Integer;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB17EditoDto {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String bgColor;
    @C12580l
    private final BffUrlDto cta;
    @C12580l
    private final String description;
    @C12580l
    private final BffImageDto image;
    @C12580l
    private final String templateId;
    @C12580l
    private final String title;
    @C12580l
    private final String titleAlign;
    @C12580l
    private final String titleColor;
    @C12580l
    private final String titleSize;
    @C12580l
    private final String titleWeight;
    @C12580l
    private final BffVideoDto video;
    @C12580l
    private final Integer weight;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB17EditoDto$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB17EditoDto;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB17EditoDto> serializer() {
            return BffB17EditoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB17EditoDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffImageDto) null, (BffVideoDto) null, (BffUrlDto) null, (Integer) null, 4095, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB17EditoDto copy$default(BffB17EditoDto bffB17EditoDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BffImageDto bffImageDto, BffVideoDto bffVideoDto, BffUrlDto bffUrlDto, Integer num, int i, Object obj) {
        BffB17EditoDto bffB17EditoDto2 = bffB17EditoDto;
        int i2 = i;
        return bffB17EditoDto.copy((i2 & 1) != 0 ? bffB17EditoDto2.templateId : str, (i2 & 2) != 0 ? bffB17EditoDto2.title : str2, (i2 & 4) != 0 ? bffB17EditoDto2.bgColor : str3, (i2 & 8) != 0 ? bffB17EditoDto2.titleAlign : str4, (i2 & 16) != 0 ? bffB17EditoDto2.titleSize : str5, (i2 & 32) != 0 ? bffB17EditoDto2.titleWeight : str6, (i2 & 64) != 0 ? bffB17EditoDto2.titleColor : str7, (i2 & 128) != 0 ? bffB17EditoDto2.description : str8, (i2 & 256) != 0 ? bffB17EditoDto2.image : bffImageDto, (i2 & 512) != 0 ? bffB17EditoDto2.video : bffVideoDto, (i2 & 1024) != 0 ? bffB17EditoDto2.cta : bffUrlDto, (i2 & 2048) != 0 ? bffB17EditoDto2.weight : num);
    }

    @C12438n("bg_color")
    public static /* synthetic */ void getBgColor$annotations() {
    }

    @C12438n("cta")
    public static /* synthetic */ void getCta$annotations() {
    }

    @C12438n("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @C12438n("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @C12438n("template_id")
    public static /* synthetic */ void getTemplateId$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C12438n("title_align")
    public static /* synthetic */ void getTitleAlign$annotations() {
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

    @C12438n("weight")
    public static /* synthetic */ void getWeight$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB17EditoDto bffB17EditoDto, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffB17EditoDto.templateId != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffB17EditoDto.templateId);
        }
        if (dVar.mo24897A(fVar, 1) || bffB17EditoDto.title != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffB17EditoDto.title);
        }
        if (dVar.mo24897A(fVar, 2) || bffB17EditoDto.bgColor != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffB17EditoDto.bgColor);
        }
        if (dVar.mo24897A(fVar, 3) || bffB17EditoDto.titleAlign != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffB17EditoDto.titleAlign);
        }
        if (dVar.mo24897A(fVar, 4) || bffB17EditoDto.titleSize != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffB17EditoDto.titleSize);
        }
        if (dVar.mo24897A(fVar, 5) || bffB17EditoDto.titleWeight != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffB17EditoDto.titleWeight);
        }
        if (dVar.mo24897A(fVar, 6) || bffB17EditoDto.titleColor != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffB17EditoDto.titleColor);
        }
        if (dVar.mo24897A(fVar, 7) || bffB17EditoDto.description != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffB17EditoDto.description);
        }
        if (dVar.mo24897A(fVar, 8) || bffB17EditoDto.image != null) {
            dVar.mo24912i(fVar, 8, BffImageDto$$serializer.INSTANCE, bffB17EditoDto.image);
        }
        if (dVar.mo24897A(fVar, 9) || bffB17EditoDto.video != null) {
            dVar.mo24912i(fVar, 9, BffVideoDto$$serializer.INSTANCE, bffB17EditoDto.video);
        }
        if (dVar.mo24897A(fVar, 10) || bffB17EditoDto.cta != null) {
            dVar.mo24912i(fVar, 10, BffUrlDto$$serializer.INSTANCE, bffB17EditoDto.cta);
        }
        if (dVar.mo24897A(fVar, 11) || bffB17EditoDto.weight != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 11, C12276h0.f30067a, bffB17EditoDto.weight);
        }
    }

    @C12580l
    public final String component1() {
        return this.templateId;
    }

    @C12580l
    public final BffVideoDto component10() {
        return this.video;
    }

    @C12580l
    public final BffUrlDto component11() {
        return this.cta;
    }

    @C12580l
    public final Integer component12() {
        return this.weight;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final String component3() {
        return this.bgColor;
    }

    @C12580l
    public final String component4() {
        return this.titleAlign;
    }

    @C12580l
    public final String component5() {
        return this.titleSize;
    }

    @C12580l
    public final String component6() {
        return this.titleWeight;
    }

    @C12580l
    public final String component7() {
        return this.titleColor;
    }

    @C12580l
    public final String component8() {
        return this.description;
    }

    @C12580l
    public final BffImageDto component9() {
        return this.image;
    }

    @C12579k
    public final BffB17EditoDto copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l BffImageDto bffImageDto, @C12580l BffVideoDto bffVideoDto, @C12580l BffUrlDto bffUrlDto, @C12580l Integer num) {
        return new BffB17EditoDto(str, str2, str3, str4, str5, str6, str7, str8, bffImageDto, bffVideoDto, bffUrlDto, num);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffB17EditoDto)) {
            return false;
        }
        BffB17EditoDto bffB17EditoDto = (BffB17EditoDto) obj;
        return Intrinsics.areEqual((Object) this.templateId, (Object) bffB17EditoDto.templateId) && Intrinsics.areEqual((Object) this.title, (Object) bffB17EditoDto.title) && Intrinsics.areEqual((Object) this.bgColor, (Object) bffB17EditoDto.bgColor) && Intrinsics.areEqual((Object) this.titleAlign, (Object) bffB17EditoDto.titleAlign) && Intrinsics.areEqual((Object) this.titleSize, (Object) bffB17EditoDto.titleSize) && Intrinsics.areEqual((Object) this.titleWeight, (Object) bffB17EditoDto.titleWeight) && Intrinsics.areEqual((Object) this.titleColor, (Object) bffB17EditoDto.titleColor) && Intrinsics.areEqual((Object) this.description, (Object) bffB17EditoDto.description) && Intrinsics.areEqual((Object) this.image, (Object) bffB17EditoDto.image) && Intrinsics.areEqual((Object) this.video, (Object) bffB17EditoDto.video) && Intrinsics.areEqual((Object) this.cta, (Object) bffB17EditoDto.cta) && Intrinsics.areEqual((Object) this.weight, (Object) bffB17EditoDto.weight);
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
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final BffImageDto getImage() {
        return this.image;
    }

    @C12580l
    public final String getTemplateId() {
        return this.templateId;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    @C12580l
    public final String getTitleAlign() {
        return this.titleAlign;
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

    @C12580l
    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.templateId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bgColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleAlign;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleSize;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.titleWeight;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.titleColor;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.description;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BffImageDto bffImageDto = this.image;
        int hashCode9 = (hashCode8 + (bffImageDto == null ? 0 : bffImageDto.hashCode())) * 31;
        BffVideoDto bffVideoDto = this.video;
        int hashCode10 = (hashCode9 + (bffVideoDto == null ? 0 : bffVideoDto.hashCode())) * 31;
        BffUrlDto bffUrlDto = this.cta;
        int hashCode11 = (hashCode10 + (bffUrlDto == null ? 0 : bffUrlDto.hashCode())) * 31;
        Integer num = this.weight;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode11 + i;
    }

    @C12579k
    public String toString() {
        String str = this.templateId;
        String str2 = this.title;
        String str3 = this.bgColor;
        String str4 = this.titleAlign;
        String str5 = this.titleSize;
        String str6 = this.titleWeight;
        String str7 = this.titleColor;
        String str8 = this.description;
        BffImageDto bffImageDto = this.image;
        BffVideoDto bffVideoDto = this.video;
        BffUrlDto bffUrlDto = this.cta;
        Integer num = this.weight;
        return "BffB17EditoDto(templateId=" + str + ", title=" + str2 + ", bgColor=" + str3 + ", titleAlign=" + str4 + ", titleSize=" + str5 + ", titleWeight=" + str6 + ", titleColor=" + str7 + ", description=" + str8 + ", image=" + bffImageDto + ", video=" + bffVideoDto + ", cta=" + bffUrlDto + ", weight=" + num + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB17EditoDto(int i, @C12438n("template_id") String str, @C12438n("title") String str2, @C12438n("bg_color") String str3, @C12438n("title_align") String str4, @C12438n("title_size") String str5, @C12438n("title_weight") String str6, @C12438n("title_color") String str7, @C12438n("description") String str8, @C12438n("image") BffImageDto bffImageDto, @C12438n("video") BffVideoDto bffVideoDto, @C12438n("cta") BffUrlDto bffUrlDto, @C12438n("weight") Integer num, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB17EditoDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.templateId = null;
        } else {
            this.templateId = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.bgColor = null;
        } else {
            this.bgColor = str3;
        }
        if ((i & 8) == 0) {
            this.titleAlign = null;
        } else {
            this.titleAlign = str4;
        }
        if ((i & 16) == 0) {
            this.titleSize = null;
        } else {
            this.titleSize = str5;
        }
        if ((i & 32) == 0) {
            this.titleWeight = null;
        } else {
            this.titleWeight = str6;
        }
        if ((i & 64) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = str7;
        }
        if ((i & 128) == 0) {
            this.description = null;
        } else {
            this.description = str8;
        }
        if ((i & 256) == 0) {
            this.image = null;
        } else {
            this.image = bffImageDto;
        }
        if ((i & 512) == 0) {
            this.video = null;
        } else {
            this.video = bffVideoDto;
        }
        if ((i & 1024) == 0) {
            this.cta = null;
        } else {
            this.cta = bffUrlDto;
        }
        if ((i & 2048) == 0) {
            this.weight = null;
        } else {
            this.weight = num;
        }
    }

    public BffB17EditoDto(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l BffImageDto bffImageDto, @C12580l BffVideoDto bffVideoDto, @C12580l BffUrlDto bffUrlDto, @C12580l Integer num) {
        this.templateId = str;
        this.title = str2;
        this.bgColor = str3;
        this.titleAlign = str4;
        this.titleSize = str5;
        this.titleWeight = str6;
        this.titleColor = str7;
        this.description = str8;
        this.image = bffImageDto;
        this.video = bffVideoDto;
        this.cta = bffUrlDto;
        this.weight = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffB17EditoDto(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r22, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto r23, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r24, java.lang.Integer r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB17EditoDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffVideoDto, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
