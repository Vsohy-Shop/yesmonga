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

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 12\u00020\u0001:\u000221BC\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b+\u0010,BW\b\u0017\u0012\u0006\u0010-\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001eR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b$\u0010 \u001a\u0004\b#\u0010\u001eR\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u001eR\"\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010'\u0012\u0004\b*\u0010 \u001a\u0004\b(\u0010)¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDetailsDto;", "component5", "uri", "title", "target", "design", "image", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "getUri$annotations", "()V", "getTitle", "getTitle$annotations", "getTarget", "getTarget$annotations", "getDesign", "getDesign$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDetailsDto;", "getImage", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDetailsDto;", "getImage$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDetailsDto;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffImageDetailsDto;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCtaImageDto {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String design;
    @C12580l
    private final BffImageDetailsDto image;
    @C12580l
    private final String target;
    @C12580l
    private final String title;
    @C12580l
    private final String uri;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCtaImageDto;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCtaImageDto> serializer() {
            return BffCtaImageDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffCtaImageDto() {
        this((String) null, (String) null, (String) null, (String) null, (BffImageDetailsDto) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCtaImageDto copy$default(BffCtaImageDto bffCtaImageDto, String str, String str2, String str3, String str4, BffImageDetailsDto bffImageDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffCtaImageDto.uri;
        }
        if ((i & 2) != 0) {
            str2 = bffCtaImageDto.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bffCtaImageDto.target;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bffCtaImageDto.design;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bffImageDetailsDto = bffCtaImageDto.image;
        }
        return bffCtaImageDto.copy(str, str5, str6, str7, bffImageDetailsDto);
    }

    @C12438n("design")
    public static /* synthetic */ void getDesign$annotations() {
    }

    @C12438n("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @C12438n("target")
    public static /* synthetic */ void getTarget$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C12438n("uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCtaImageDto bffCtaImageDto, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCtaImageDto.uri != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffCtaImageDto.uri);
        }
        if (dVar.mo24897A(fVar, 1) || bffCtaImageDto.title != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCtaImageDto.title);
        }
        if (dVar.mo24897A(fVar, 2) || bffCtaImageDto.target != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffCtaImageDto.target);
        }
        if (dVar.mo24897A(fVar, 3) || bffCtaImageDto.design != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCtaImageDto.design);
        }
        if (dVar.mo24897A(fVar, 4) || bffCtaImageDto.image != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, BffImageDetailsDto$$serializer.INSTANCE, bffCtaImageDto.image);
        }
    }

    @C12580l
    public final String component1() {
        return this.uri;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final String component3() {
        return this.target;
    }

    @C12580l
    public final String component4() {
        return this.design;
    }

    @C12580l
    public final BffImageDetailsDto component5() {
        return this.image;
    }

    @C12579k
    public final BffCtaImageDto copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l BffImageDetailsDto bffImageDetailsDto) {
        return new BffCtaImageDto(str, str2, str3, str4, bffImageDetailsDto);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCtaImageDto)) {
            return false;
        }
        BffCtaImageDto bffCtaImageDto = (BffCtaImageDto) obj;
        return Intrinsics.areEqual((Object) this.uri, (Object) bffCtaImageDto.uri) && Intrinsics.areEqual((Object) this.title, (Object) bffCtaImageDto.title) && Intrinsics.areEqual((Object) this.target, (Object) bffCtaImageDto.target) && Intrinsics.areEqual((Object) this.design, (Object) bffCtaImageDto.design) && Intrinsics.areEqual((Object) this.image, (Object) bffCtaImageDto.image);
    }

    @C12580l
    public final String getDesign() {
        return this.design;
    }

    @C12580l
    public final BffImageDetailsDto getImage() {
        return this.image;
    }

    @C12580l
    public final String getTarget() {
        return this.target;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    @C12580l
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.design;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BffImageDetailsDto bffImageDetailsDto = this.image;
        if (bffImageDetailsDto != null) {
            i = bffImageDetailsDto.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.uri;
        String str2 = this.title;
        String str3 = this.target;
        String str4 = this.design;
        BffImageDetailsDto bffImageDetailsDto = this.image;
        return "BffCtaImageDto(uri=" + str + ", title=" + str2 + ", target=" + str3 + ", design=" + str4 + ", image=" + bffImageDetailsDto + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCtaImageDto(int i, @C12438n("uri") String str, @C12438n("title") String str2, @C12438n("target") String str3, @C12438n("design") String str4, @C12438n("image") BffImageDetailsDto bffImageDetailsDto, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCtaImageDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.uri = null;
        } else {
            this.uri = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.target = null;
        } else {
            this.target = str3;
        }
        if ((i & 8) == 0) {
            this.design = null;
        } else {
            this.design = str4;
        }
        if ((i & 16) == 0) {
            this.image = null;
        } else {
            this.image = bffImageDetailsDto;
        }
    }

    public BffCtaImageDto(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l BffImageDetailsDto bffImageDetailsDto) {
        this.uri = str;
        this.title = str2;
        this.target = str3;
        this.design = str4;
        this.image = bffImageDetailsDto;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCtaImageDto(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDetailsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
