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

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 12\u00020\u0001:\u000221BC\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b+\u0010,BW\b\u0017\u0012\u0006\u0010-\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001eR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b$\u0010 \u001a\u0004\b#\u0010\u001eR\"\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010%\u0012\u0004\b(\u0010 \u001a\u0004\b&\u0010'R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u0012\u0004\b*\u0010 \u001a\u0004\b)\u0010\u001e¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffT9CatalogStoreDto;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "component4", "component5", "templateId", "id", "title", "link", "sourceId", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTemplateId", "()Ljava/lang/String;", "getTemplateId$annotations", "()V", "getId", "getId$annotations", "getTitle", "getTitle$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getLink", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "getLink$annotations", "getSourceId", "getSourceId$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffT9CatalogStoreDto {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: id */
    private final String f100681id;
    @C12580l
    private final BffUrlDto link;
    @C12580l
    private final String sourceId;
    @C12580l
    private final String templateId;
    @C12580l
    private final String title;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffT9CatalogStoreDto$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffT9CatalogStoreDto;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffT9CatalogStoreDto> serializer() {
            return BffT9CatalogStoreDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffT9CatalogStoreDto() {
        this((String) null, (String) null, (String) null, (BffUrlDto) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffT9CatalogStoreDto copy$default(BffT9CatalogStoreDto bffT9CatalogStoreDto, String str, String str2, String str3, BffUrlDto bffUrlDto, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffT9CatalogStoreDto.templateId;
        }
        if ((i & 2) != 0) {
            str2 = bffT9CatalogStoreDto.f100681id;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bffT9CatalogStoreDto.title;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            bffUrlDto = bffT9CatalogStoreDto.link;
        }
        BffUrlDto bffUrlDto2 = bffUrlDto;
        if ((i & 16) != 0) {
            str4 = bffT9CatalogStoreDto.sourceId;
        }
        return bffT9CatalogStoreDto.copy(str, str5, str6, bffUrlDto2, str4);
    }

    @C12438n("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @C12438n("link")
    public static /* synthetic */ void getLink$annotations() {
    }

    @C12438n("source_id")
    public static /* synthetic */ void getSourceId$annotations() {
    }

    @C12438n("template_id")
    public static /* synthetic */ void getTemplateId$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffT9CatalogStoreDto bffT9CatalogStoreDto, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffT9CatalogStoreDto.templateId != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffT9CatalogStoreDto.templateId);
        }
        if (dVar.mo24897A(fVar, 1) || bffT9CatalogStoreDto.f100681id != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffT9CatalogStoreDto.f100681id);
        }
        if (dVar.mo24897A(fVar, 2) || bffT9CatalogStoreDto.title != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffT9CatalogStoreDto.title);
        }
        if (dVar.mo24897A(fVar, 3) || bffT9CatalogStoreDto.link != null) {
            dVar.mo24912i(fVar, 3, BffUrlDto$$serializer.INSTANCE, bffT9CatalogStoreDto.link);
        }
        if (dVar.mo24897A(fVar, 4) || bffT9CatalogStoreDto.sourceId != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffT9CatalogStoreDto.sourceId);
        }
    }

    @C12580l
    public final String component1() {
        return this.templateId;
    }

    @C12580l
    public final String component2() {
        return this.f100681id;
    }

    @C12580l
    public final String component3() {
        return this.title;
    }

    @C12580l
    public final BffUrlDto component4() {
        return this.link;
    }

    @C12580l
    public final String component5() {
        return this.sourceId;
    }

    @C12579k
    public final BffT9CatalogStoreDto copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l BffUrlDto bffUrlDto, @C12580l String str4) {
        return new BffT9CatalogStoreDto(str, str2, str3, bffUrlDto, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffT9CatalogStoreDto)) {
            return false;
        }
        BffT9CatalogStoreDto bffT9CatalogStoreDto = (BffT9CatalogStoreDto) obj;
        return Intrinsics.areEqual((Object) this.templateId, (Object) bffT9CatalogStoreDto.templateId) && Intrinsics.areEqual((Object) this.f100681id, (Object) bffT9CatalogStoreDto.f100681id) && Intrinsics.areEqual((Object) this.title, (Object) bffT9CatalogStoreDto.title) && Intrinsics.areEqual((Object) this.link, (Object) bffT9CatalogStoreDto.link) && Intrinsics.areEqual((Object) this.sourceId, (Object) bffT9CatalogStoreDto.sourceId);
    }

    @C12580l
    public final String getId() {
        return this.f100681id;
    }

    @C12580l
    public final BffUrlDto getLink() {
        return this.link;
    }

    @C12580l
    public final String getSourceId() {
        return this.sourceId;
    }

    @C12580l
    public final String getTemplateId() {
        return this.templateId;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.templateId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f100681id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BffUrlDto bffUrlDto = this.link;
        int hashCode4 = (hashCode3 + (bffUrlDto == null ? 0 : bffUrlDto.hashCode())) * 31;
        String str4 = this.sourceId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.templateId;
        String str2 = this.f100681id;
        String str3 = this.title;
        BffUrlDto bffUrlDto = this.link;
        String str4 = this.sourceId;
        return "BffT9CatalogStoreDto(templateId=" + str + ", id=" + str2 + ", title=" + str3 + ", link=" + bffUrlDto + ", sourceId=" + str4 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffT9CatalogStoreDto(int i, @C12438n("template_id") String str, @C12438n("id") String str2, @C12438n("title") String str3, @C12438n("link") BffUrlDto bffUrlDto, @C12438n("source_id") String str4, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffT9CatalogStoreDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.templateId = null;
        } else {
            this.templateId = str;
        }
        if ((i & 2) == 0) {
            this.f100681id = null;
        } else {
            this.f100681id = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.link = null;
        } else {
            this.link = bffUrlDto;
        }
        if ((i & 16) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str4;
        }
    }

    public BffT9CatalogStoreDto(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l BffUrlDto bffUrlDto, @C12580l String str4) {
        this.templateId = str;
        this.f100681id = str2;
        this.title = str3;
        this.link = bffUrlDto;
        this.sourceId = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffT9CatalogStoreDto(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffT9CatalogStoreDto.<init>(java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
