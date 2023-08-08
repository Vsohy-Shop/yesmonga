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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 >2\u00020\u0001:\u0002?>B[\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b8\u00109Bo\b\u0017\u0012\u0006\u0010:\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b8\u0010=J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003Jd\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0011HÖ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\"\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010*\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u000eR\"\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u000eR\"\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010#\u0012\u0004\b0\u0010'\u001a\u0004\b/\u0010%R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00101\u0012\u0004\b3\u0010'\u001a\u0004\b2\u0010\u0013R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u00104\u0012\u0004\b7\u0010'\u001a\u0004\b5\u00106¨\u0006@"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB5ProductListDtoAllOf;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "", "component6", "()Ljava/lang/Integer;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "component7", "title", "displayMode", "displayFilters", "recoEnabled", "esQueryId", "productAmount", "image", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB5ProductListDtoAllOf;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "()V", "getDisplayMode", "getDisplayMode$annotations", "Ljava/lang/Boolean;", "getDisplayFilters", "getDisplayFilters$annotations", "getRecoEnabled", "getRecoEnabled$annotations", "getEsQueryId", "getEsQueryId$annotations", "Ljava/lang/Integer;", "getProductAmount", "getProductAmount$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;", "getImage$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDto;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB5ProductListDtoAllOf {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Boolean displayFilters;
    @C12580l
    private final String displayMode;
    @C12580l
    private final String esQueryId;
    @C12580l
    private final BffImageDto image;
    @C12580l
    private final Integer productAmount;
    @C12580l
    private final Boolean recoEnabled;
    @C12580l
    private final String title;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB5ProductListDtoAllOf$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB5ProductListDtoAllOf;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB5ProductListDtoAllOf> serializer() {
            return BffB5ProductListDtoAllOf$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB5ProductListDtoAllOf() {
        this((String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (Integer) null, (BffImageDto) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB5ProductListDtoAllOf copy$default(BffB5ProductListDtoAllOf bffB5ProductListDtoAllOf, String str, String str2, Boolean bool, Boolean bool2, String str3, Integer num, BffImageDto bffImageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffB5ProductListDtoAllOf.title;
        }
        if ((i & 2) != 0) {
            str2 = bffB5ProductListDtoAllOf.displayMode;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bool = bffB5ProductListDtoAllOf.displayFilters;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            bool2 = bffB5ProductListDtoAllOf.recoEnabled;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            str3 = bffB5ProductListDtoAllOf.esQueryId;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            num = bffB5ProductListDtoAllOf.productAmount;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            bffImageDto = bffB5ProductListDtoAllOf.image;
        }
        return bffB5ProductListDtoAllOf.copy(str, str4, bool3, bool4, str5, num2, bffImageDto);
    }

    @C12438n("display_filters")
    public static /* synthetic */ void getDisplayFilters$annotations() {
    }

    @C12438n("display_mode")
    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    @C12438n("es_query_id")
    public static /* synthetic */ void getEsQueryId$annotations() {
    }

    @C12438n("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @C12438n("product_amount")
    public static /* synthetic */ void getProductAmount$annotations() {
    }

    @C12438n("reco_enabled")
    public static /* synthetic */ void getRecoEnabled$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB5ProductListDtoAllOf bffB5ProductListDtoAllOf, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffB5ProductListDtoAllOf.title != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffB5ProductListDtoAllOf.title);
        }
        if (dVar.mo24897A(fVar, 1) || bffB5ProductListDtoAllOf.displayMode != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffB5ProductListDtoAllOf.displayMode);
        }
        if (dVar.mo24897A(fVar, 2) || bffB5ProductListDtoAllOf.displayFilters != null) {
            dVar.mo24912i(fVar, 2, C12278i.f30070a, bffB5ProductListDtoAllOf.displayFilters);
        }
        if (dVar.mo24897A(fVar, 3) || bffB5ProductListDtoAllOf.recoEnabled != null) {
            dVar.mo24912i(fVar, 3, C12278i.f30070a, bffB5ProductListDtoAllOf.recoEnabled);
        }
        if (dVar.mo24897A(fVar, 4) || bffB5ProductListDtoAllOf.esQueryId != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffB5ProductListDtoAllOf.esQueryId);
        }
        if (dVar.mo24897A(fVar, 5) || bffB5ProductListDtoAllOf.productAmount != null) {
            dVar.mo24912i(fVar, 5, C12276h0.f30067a, bffB5ProductListDtoAllOf.productAmount);
        }
        if (dVar.mo24897A(fVar, 6) || bffB5ProductListDtoAllOf.image != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 6, BffImageDto$$serializer.INSTANCE, bffB5ProductListDtoAllOf.image);
        }
    }

    @C12580l
    public final String component1() {
        return this.title;
    }

    @C12580l
    public final String component2() {
        return this.displayMode;
    }

    @C12580l
    public final Boolean component3() {
        return this.displayFilters;
    }

    @C12580l
    public final Boolean component4() {
        return this.recoEnabled;
    }

    @C12580l
    public final String component5() {
        return this.esQueryId;
    }

    @C12580l
    public final Integer component6() {
        return this.productAmount;
    }

    @C12580l
    public final BffImageDto component7() {
        return this.image;
    }

    @C12579k
    public final BffB5ProductListDtoAllOf copy(@C12580l String str, @C12580l String str2, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l String str3, @C12580l Integer num, @C12580l BffImageDto bffImageDto) {
        return new BffB5ProductListDtoAllOf(str, str2, bool, bool2, str3, num, bffImageDto);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffB5ProductListDtoAllOf)) {
            return false;
        }
        BffB5ProductListDtoAllOf bffB5ProductListDtoAllOf = (BffB5ProductListDtoAllOf) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) bffB5ProductListDtoAllOf.title) && Intrinsics.areEqual((Object) this.displayMode, (Object) bffB5ProductListDtoAllOf.displayMode) && Intrinsics.areEqual((Object) this.displayFilters, (Object) bffB5ProductListDtoAllOf.displayFilters) && Intrinsics.areEqual((Object) this.recoEnabled, (Object) bffB5ProductListDtoAllOf.recoEnabled) && Intrinsics.areEqual((Object) this.esQueryId, (Object) bffB5ProductListDtoAllOf.esQueryId) && Intrinsics.areEqual((Object) this.productAmount, (Object) bffB5ProductListDtoAllOf.productAmount) && Intrinsics.areEqual((Object) this.image, (Object) bffB5ProductListDtoAllOf.image);
    }

    @C12580l
    public final Boolean getDisplayFilters() {
        return this.displayFilters;
    }

    @C12580l
    public final String getDisplayMode() {
        return this.displayMode;
    }

    @C12580l
    public final String getEsQueryId() {
        return this.esQueryId;
    }

    @C12580l
    public final BffImageDto getImage() {
        return this.image;
    }

    @C12580l
    public final Integer getProductAmount() {
        return this.productAmount;
    }

    @C12580l
    public final Boolean getRecoEnabled() {
        return this.recoEnabled;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayMode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.displayFilters;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.recoEnabled;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.esQueryId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.productAmount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        BffImageDto bffImageDto = this.image;
        if (bffImageDto != null) {
            i = bffImageDto.hashCode();
        }
        return hashCode6 + i;
    }

    @C12579k
    public String toString() {
        String str = this.title;
        String str2 = this.displayMode;
        Boolean bool = this.displayFilters;
        Boolean bool2 = this.recoEnabled;
        String str3 = this.esQueryId;
        Integer num = this.productAmount;
        BffImageDto bffImageDto = this.image;
        return "BffB5ProductListDtoAllOf(title=" + str + ", displayMode=" + str2 + ", displayFilters=" + bool + ", recoEnabled=" + bool2 + ", esQueryId=" + str3 + ", productAmount=" + num + ", image=" + bffImageDto + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB5ProductListDtoAllOf(int i, @C12438n("title") String str, @C12438n("display_mode") String str2, @C12438n("display_filters") Boolean bool, @C12438n("reco_enabled") Boolean bool2, @C12438n("es_query_id") String str3, @C12438n("product_amount") Integer num, @C12438n("image") BffImageDto bffImageDto, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB5ProductListDtoAllOf$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.displayMode = null;
        } else {
            this.displayMode = str2;
        }
        if ((i & 4) == 0) {
            this.displayFilters = null;
        } else {
            this.displayFilters = bool;
        }
        if ((i & 8) == 0) {
            this.recoEnabled = null;
        } else {
            this.recoEnabled = bool2;
        }
        if ((i & 16) == 0) {
            this.esQueryId = null;
        } else {
            this.esQueryId = str3;
        }
        if ((i & 32) == 0) {
            this.productAmount = null;
        } else {
            this.productAmount = num;
        }
        if ((i & 64) == 0) {
            this.image = null;
        } else {
            this.image = bffImageDto;
        }
    }

    public BffB5ProductListDtoAllOf(@C12580l String str, @C12580l String str2, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l String str3, @C12580l Integer num, @C12580l BffImageDto bffImageDto) {
        this.title = str;
        this.displayMode = str2;
        this.displayFilters = bool;
        this.recoEnabled = bool2;
        this.esQueryId = str3;
        this.productAmount = num;
        this.image = bffImageDto;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffB5ProductListDtoAllOf(java.lang.String r7, java.lang.String r8, java.lang.Boolean r9, java.lang.Boolean r10, java.lang.String r11, java.lang.Integer r12, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB5ProductListDtoAllOf.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
