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

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 N2\u00020\u0001:\u0002ONB\u0001\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017¢\u0006\u0004\bH\u0010IB\u0001\b\u0017\u0012\u0006\u0010J\u001a\u00020\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017\u0012\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bH\u0010MJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017HÆ\u0003J\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u000bR\"\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R\"\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010.\u0012\u0004\b7\u0010-\u001a\u0004\b6\u00100R\"\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010.\u0012\u0004\b9\u0010-\u001a\u0004\b8\u00100R\"\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010.\u0012\u0004\b;\u0010-\u001a\u0004\b:\u00100R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010<\u0012\u0004\b?\u0010-\u001a\u0004\b=\u0010>R\"\u0010 \u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010.\u0012\u0004\bA\u0010-\u001a\u0004\b@\u00100R\"\u0010!\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010.\u0012\u0004\bC\u0010-\u001a\u0004\bB\u00100R(\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010D\u0012\u0004\bG\u0010-\u001a\u0004\bE\u0010F¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB57CategoryXlComponentDtoAllOf;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "component3", "component4", "component5", "component6", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "component7", "component8", "component9", "", "component10", "contentId", "title", "titleLink", "titleColor", "flag", "backgroundColor", "image", "countdown", "description", "links", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB57CategoryXlComponentDtoAllOf;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getContentId", "getContentId$annotations", "()V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getTitleLink", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getTitleLink$annotations", "getTitleColor", "getTitleColor$annotations", "getFlag", "getFlag$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage$annotations", "getCountdown", "getCountdown$annotations", "getDescription", "getDescription$annotations", "Ljava/util/List;", "getLinks", "()Ljava/util/List;", "getLinks$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB57CategoryXlComponentDtoAllOf {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new C12269f(BffUrlDto$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String backgroundColor;
    @C12580l
    private final Integer contentId;
    @C12580l
    private final String countdown;
    @C12580l
    private final String description;
    @C12580l
    private final String flag;
    @C12580l
    private final BffImageDto image;
    @C12580l
    private final List<BffUrlDto> links;
    @C12580l
    private final String title;
    @C12580l
    private final String titleColor;
    @C12580l
    private final BffUrlDto titleLink;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB57CategoryXlComponentDtoAllOf$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB57CategoryXlComponentDtoAllOf;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB57CategoryXlComponentDtoAllOf> serializer() {
            return BffB57CategoryXlComponentDtoAllOf$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB57CategoryXlComponentDtoAllOf() {
        this((Integer) null, (String) null, (BffUrlDto) null, (String) null, (String) null, (String) null, (BffImageDto) null, (String) null, (String) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB57CategoryXlComponentDtoAllOf copy$default(BffB57CategoryXlComponentDtoAllOf bffB57CategoryXlComponentDtoAllOf, Integer num, String str, BffUrlDto bffUrlDto, String str2, String str3, String str4, BffImageDto bffImageDto, String str5, String str6, List list, int i, Object obj) {
        BffB57CategoryXlComponentDtoAllOf bffB57CategoryXlComponentDtoAllOf2 = bffB57CategoryXlComponentDtoAllOf;
        int i2 = i;
        return bffB57CategoryXlComponentDtoAllOf.copy((i2 & 1) != 0 ? bffB57CategoryXlComponentDtoAllOf2.contentId : num, (i2 & 2) != 0 ? bffB57CategoryXlComponentDtoAllOf2.title : str, (i2 & 4) != 0 ? bffB57CategoryXlComponentDtoAllOf2.titleLink : bffUrlDto, (i2 & 8) != 0 ? bffB57CategoryXlComponentDtoAllOf2.titleColor : str2, (i2 & 16) != 0 ? bffB57CategoryXlComponentDtoAllOf2.flag : str3, (i2 & 32) != 0 ? bffB57CategoryXlComponentDtoAllOf2.backgroundColor : str4, (i2 & 64) != 0 ? bffB57CategoryXlComponentDtoAllOf2.image : bffImageDto, (i2 & 128) != 0 ? bffB57CategoryXlComponentDtoAllOf2.countdown : str5, (i2 & 256) != 0 ? bffB57CategoryXlComponentDtoAllOf2.description : str6, (i2 & 512) != 0 ? bffB57CategoryXlComponentDtoAllOf2.links : list);
    }

    @C12438n("background_color")
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    @C12438n("content_id")
    public static /* synthetic */ void getContentId$annotations() {
    }

    @C12438n("countdown")
    public static /* synthetic */ void getCountdown$annotations() {
    }

    @C12438n("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @C12438n("flag")
    public static /* synthetic */ void getFlag$annotations() {
    }

    @C12438n("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @C12438n("links")
    public static /* synthetic */ void getLinks$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C12438n("title_color")
    public static /* synthetic */ void getTitleColor$annotations() {
    }

    @C12438n("title_link")
    public static /* synthetic */ void getTitleLink$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB57CategoryXlComponentDtoAllOf bffB57CategoryXlComponentDtoAllOf, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffB57CategoryXlComponentDtoAllOf.contentId != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffB57CategoryXlComponentDtoAllOf.contentId);
        }
        if (dVar.mo24897A(fVar, 1) || bffB57CategoryXlComponentDtoAllOf.title != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffB57CategoryXlComponentDtoAllOf.title);
        }
        if (dVar.mo24897A(fVar, 2) || bffB57CategoryXlComponentDtoAllOf.titleLink != null) {
            dVar.mo24912i(fVar, 2, BffUrlDto$$serializer.INSTANCE, bffB57CategoryXlComponentDtoAllOf.titleLink);
        }
        if (dVar.mo24897A(fVar, 3) || bffB57CategoryXlComponentDtoAllOf.titleColor != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffB57CategoryXlComponentDtoAllOf.titleColor);
        }
        if (dVar.mo24897A(fVar, 4) || bffB57CategoryXlComponentDtoAllOf.flag != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffB57CategoryXlComponentDtoAllOf.flag);
        }
        if (dVar.mo24897A(fVar, 5) || bffB57CategoryXlComponentDtoAllOf.backgroundColor != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffB57CategoryXlComponentDtoAllOf.backgroundColor);
        }
        if (dVar.mo24897A(fVar, 6) || bffB57CategoryXlComponentDtoAllOf.image != null) {
            dVar.mo24912i(fVar, 6, BffImageDto$$serializer.INSTANCE, bffB57CategoryXlComponentDtoAllOf.image);
        }
        if (dVar.mo24897A(fVar, 7) || bffB57CategoryXlComponentDtoAllOf.countdown != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffB57CategoryXlComponentDtoAllOf.countdown);
        }
        if (dVar.mo24897A(fVar, 8) || bffB57CategoryXlComponentDtoAllOf.description != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffB57CategoryXlComponentDtoAllOf.description);
        }
        if (dVar.mo24897A(fVar, 9) || bffB57CategoryXlComponentDtoAllOf.links != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 9, gVarArr[9], bffB57CategoryXlComponentDtoAllOf.links);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.contentId;
    }

    @C12580l
    public final List<BffUrlDto> component10() {
        return this.links;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final BffUrlDto component3() {
        return this.titleLink;
    }

    @C12580l
    public final String component4() {
        return this.titleColor;
    }

    @C12580l
    public final String component5() {
        return this.flag;
    }

    @C12580l
    public final String component6() {
        return this.backgroundColor;
    }

    @C12580l
    public final BffImageDto component7() {
        return this.image;
    }

    @C12580l
    public final String component8() {
        return this.countdown;
    }

    @C12580l
    public final String component9() {
        return this.description;
    }

    @C12579k
    public final BffB57CategoryXlComponentDtoAllOf copy(@C12580l Integer num, @C12580l String str, @C12580l BffUrlDto bffUrlDto, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l BffImageDto bffImageDto, @C12580l String str5, @C12580l String str6, @C12580l List<BffUrlDto> list) {
        return new BffB57CategoryXlComponentDtoAllOf(num, str, bffUrlDto, str2, str3, str4, bffImageDto, str5, str6, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffB57CategoryXlComponentDtoAllOf)) {
            return false;
        }
        BffB57CategoryXlComponentDtoAllOf bffB57CategoryXlComponentDtoAllOf = (BffB57CategoryXlComponentDtoAllOf) obj;
        return Intrinsics.areEqual((Object) this.contentId, (Object) bffB57CategoryXlComponentDtoAllOf.contentId) && Intrinsics.areEqual((Object) this.title, (Object) bffB57CategoryXlComponentDtoAllOf.title) && Intrinsics.areEqual((Object) this.titleLink, (Object) bffB57CategoryXlComponentDtoAllOf.titleLink) && Intrinsics.areEqual((Object) this.titleColor, (Object) bffB57CategoryXlComponentDtoAllOf.titleColor) && Intrinsics.areEqual((Object) this.flag, (Object) bffB57CategoryXlComponentDtoAllOf.flag) && Intrinsics.areEqual((Object) this.backgroundColor, (Object) bffB57CategoryXlComponentDtoAllOf.backgroundColor) && Intrinsics.areEqual((Object) this.image, (Object) bffB57CategoryXlComponentDtoAllOf.image) && Intrinsics.areEqual((Object) this.countdown, (Object) bffB57CategoryXlComponentDtoAllOf.countdown) && Intrinsics.areEqual((Object) this.description, (Object) bffB57CategoryXlComponentDtoAllOf.description) && Intrinsics.areEqual((Object) this.links, (Object) bffB57CategoryXlComponentDtoAllOf.links);
    }

    @C12580l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @C12580l
    public final Integer getContentId() {
        return this.contentId;
    }

    @C12580l
    public final String getCountdown() {
        return this.countdown;
    }

    @C12580l
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final String getFlag() {
        return this.flag;
    }

    @C12580l
    public final BffImageDto getImage() {
        return this.image;
    }

    @C12580l
    public final List<BffUrlDto> getLinks() {
        return this.links;
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
    public final BffUrlDto getTitleLink() {
        return this.titleLink;
    }

    public int hashCode() {
        Integer num = this.contentId;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BffUrlDto bffUrlDto = this.titleLink;
        int hashCode3 = (hashCode2 + (bffUrlDto == null ? 0 : bffUrlDto.hashCode())) * 31;
        String str2 = this.titleColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flag;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundColor;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BffImageDto bffImageDto = this.image;
        int hashCode7 = (hashCode6 + (bffImageDto == null ? 0 : bffImageDto.hashCode())) * 31;
        String str5 = this.countdown;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<BffUrlDto> list = this.links;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode9 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.contentId;
        String str = this.title;
        BffUrlDto bffUrlDto = this.titleLink;
        String str2 = this.titleColor;
        String str3 = this.flag;
        String str4 = this.backgroundColor;
        BffImageDto bffImageDto = this.image;
        String str5 = this.countdown;
        String str6 = this.description;
        List<BffUrlDto> list = this.links;
        return "BffB57CategoryXlComponentDtoAllOf(contentId=" + num + ", title=" + str + ", titleLink=" + bffUrlDto + ", titleColor=" + str2 + ", flag=" + str3 + ", backgroundColor=" + str4 + ", image=" + bffImageDto + ", countdown=" + str5 + ", description=" + str6 + ", links=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB57CategoryXlComponentDtoAllOf(int i, @C12438n("content_id") Integer num, @C12438n("title") String str, @C12438n("title_link") BffUrlDto bffUrlDto, @C12438n("title_color") String str2, @C12438n("flag") String str3, @C12438n("background_color") String str4, @C12438n("image") BffImageDto bffImageDto, @C12438n("countdown") String str5, @C12438n("description") String str6, @C12438n("links") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB57CategoryXlComponentDtoAllOf$$serializer.INSTANCE.getDescriptor());
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
            this.titleLink = null;
        } else {
            this.titleLink = bffUrlDto;
        }
        if ((i & 8) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = str2;
        }
        if ((i & 16) == 0) {
            this.flag = null;
        } else {
            this.flag = str3;
        }
        if ((i & 32) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str4;
        }
        if ((i & 64) == 0) {
            this.image = null;
        } else {
            this.image = bffImageDto;
        }
        if ((i & 128) == 0) {
            this.countdown = null;
        } else {
            this.countdown = str5;
        }
        if ((i & 256) == 0) {
            this.description = null;
        } else {
            this.description = str6;
        }
        if ((i & 512) == 0) {
            this.links = null;
        } else {
            this.links = list;
        }
    }

    public BffB57CategoryXlComponentDtoAllOf(@C12580l Integer num, @C12580l String str, @C12580l BffUrlDto bffUrlDto, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l BffImageDto bffImageDto, @C12580l String str5, @C12580l String str6, @C12580l List<BffUrlDto> list) {
        this.contentId = num;
        this.title = str;
        this.titleLink = bffUrlDto;
        this.titleColor = str2;
        this.flag = str3;
        this.backgroundColor = str4;
        this.image = bffImageDto;
        this.countdown = str5;
        this.description = str6;
        this.links = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffB57CategoryXlComponentDtoAllOf(java.lang.Integer r12, java.lang.String r13, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r18, java.lang.String r19, java.lang.String r20, java.util.List r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB57CategoryXlComponentDtoAllOf.<init>(java.lang.Integer, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
