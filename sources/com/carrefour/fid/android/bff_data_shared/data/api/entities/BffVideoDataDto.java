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

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 -2\u00020\u0001:\u0002.-B7\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b'\u0010(BK\b\u0017\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\rR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u0012\u0004\b$\u0010\u001f\u001a\u0004\b#\u0010\u001dR\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010\r¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDataDto;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "fileUrl", "width", "containerType", "sizeInBytes", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDataDto;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getFileUrl", "()Ljava/lang/String;", "getFileUrl$annotations", "()V", "Ljava/lang/Integer;", "getWidth", "getWidth$annotations", "getContainerType", "getContainerType$annotations", "getSizeInBytes", "getSizeInBytes$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffVideoDataDto {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String containerType;
    @C12580l
    private final String fileUrl;
    @C12580l
    private final Integer sizeInBytes;
    @C12580l
    private final Integer width;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDataDto$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDataDto;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffVideoDataDto> serializer() {
            return BffVideoDataDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffVideoDataDto() {
        this((String) null, (Integer) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffVideoDataDto copy$default(BffVideoDataDto bffVideoDataDto, String str, Integer num, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffVideoDataDto.fileUrl;
        }
        if ((i & 2) != 0) {
            num = bffVideoDataDto.width;
        }
        if ((i & 4) != 0) {
            str2 = bffVideoDataDto.containerType;
        }
        if ((i & 8) != 0) {
            num2 = bffVideoDataDto.sizeInBytes;
        }
        return bffVideoDataDto.copy(str, num, str2, num2);
    }

    @C12438n("container_type")
    public static /* synthetic */ void getContainerType$annotations() {
    }

    @C12438n("file_url")
    public static /* synthetic */ void getFileUrl$annotations() {
    }

    @C12438n("size_in_bytes")
    public static /* synthetic */ void getSizeInBytes$annotations() {
    }

    @C12438n("width")
    public static /* synthetic */ void getWidth$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffVideoDataDto bffVideoDataDto, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffVideoDataDto.fileUrl != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffVideoDataDto.fileUrl);
        }
        if (dVar.mo24897A(fVar, 1) || bffVideoDataDto.width != null) {
            dVar.mo24912i(fVar, 1, C12276h0.f30067a, bffVideoDataDto.width);
        }
        if (dVar.mo24897A(fVar, 2) || bffVideoDataDto.containerType != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffVideoDataDto.containerType);
        }
        if (dVar.mo24897A(fVar, 3) || bffVideoDataDto.sizeInBytes != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 3, C12276h0.f30067a, bffVideoDataDto.sizeInBytes);
        }
    }

    @C12580l
    public final String component1() {
        return this.fileUrl;
    }

    @C12580l
    public final Integer component2() {
        return this.width;
    }

    @C12580l
    public final String component3() {
        return this.containerType;
    }

    @C12580l
    public final Integer component4() {
        return this.sizeInBytes;
    }

    @C12579k
    public final BffVideoDataDto copy(@C12580l String str, @C12580l Integer num, @C12580l String str2, @C12580l Integer num2) {
        return new BffVideoDataDto(str, num, str2, num2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffVideoDataDto)) {
            return false;
        }
        BffVideoDataDto bffVideoDataDto = (BffVideoDataDto) obj;
        return Intrinsics.areEqual((Object) this.fileUrl, (Object) bffVideoDataDto.fileUrl) && Intrinsics.areEqual((Object) this.width, (Object) bffVideoDataDto.width) && Intrinsics.areEqual((Object) this.containerType, (Object) bffVideoDataDto.containerType) && Intrinsics.areEqual((Object) this.sizeInBytes, (Object) bffVideoDataDto.sizeInBytes);
    }

    @C12580l
    public final String getContainerType() {
        return this.containerType;
    }

    @C12580l
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @C12580l
    public final Integer getSizeInBytes() {
        return this.sizeInBytes;
    }

    @C12580l
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.fileUrl;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.containerType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.sizeInBytes;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        String str = this.fileUrl;
        Integer num = this.width;
        String str2 = this.containerType;
        Integer num2 = this.sizeInBytes;
        return "BffVideoDataDto(fileUrl=" + str + ", width=" + num + ", containerType=" + str2 + ", sizeInBytes=" + num2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffVideoDataDto(int i, @C12438n("file_url") String str, @C12438n("width") Integer num, @C12438n("container_type") String str2, @C12438n("size_in_bytes") Integer num2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffVideoDataDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.fileUrl = null;
        } else {
            this.fileUrl = str;
        }
        if ((i & 2) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 4) == 0) {
            this.containerType = null;
        } else {
            this.containerType = str2;
        }
        if ((i & 8) == 0) {
            this.sizeInBytes = null;
        } else {
            this.sizeInBytes = num2;
        }
    }

    public BffVideoDataDto(@C12580l String str, @C12580l Integer num, @C12580l String str2, @C12580l Integer num2) {
        this.fileUrl = str;
        this.width = num;
        this.containerType = str2;
        this.sizeInBytes = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffVideoDataDto(String str, Integer num, String str2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2);
    }
}
