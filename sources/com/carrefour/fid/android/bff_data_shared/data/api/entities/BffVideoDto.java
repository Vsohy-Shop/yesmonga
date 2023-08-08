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
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 /2\u00020\u0001:\u00020/BC\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0004\b)\u0010*BW\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001eR(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b&\u0010 \u001a\u0004\b$\u0010%R(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b(\u0010 \u001a\u0004\b'\u0010%¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoThumbnailDto;", "component3", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDataDto;", "component4", "uri", "id", "thumbnails", "videos", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "getUri$annotations", "()V", "getId", "getId$annotations", "Ljava/util/List;", "getThumbnails", "()Ljava/util/List;", "getThumbnails$annotations", "getVideos", "getVideos$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffVideoDto {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, new C12269f(BffVideoThumbnailDto$$serializer.INSTANCE), new C12269f(BffVideoDataDto$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: id */
    private final String f100682id;
    @C12580l
    private final List<BffVideoThumbnailDto> thumbnails;
    @C12580l
    private final String uri;
    @C12580l
    private final List<BffVideoDataDto> videos;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffVideoDto;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffVideoDto> serializer() {
            return BffVideoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffVideoDto() {
        this((String) null, (String) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffVideoDto copy$default(BffVideoDto bffVideoDto, String str, String str2, List<BffVideoThumbnailDto> list, List<BffVideoDataDto> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffVideoDto.uri;
        }
        if ((i & 2) != 0) {
            str2 = bffVideoDto.f100682id;
        }
        if ((i & 4) != 0) {
            list = bffVideoDto.thumbnails;
        }
        if ((i & 8) != 0) {
            list2 = bffVideoDto.videos;
        }
        return bffVideoDto.copy(str, str2, list, list2);
    }

    @C12438n("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @C12438n("thumbnails")
    public static /* synthetic */ void getThumbnails$annotations() {
    }

    @C12438n("uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    @C12438n("videos")
    public static /* synthetic */ void getVideos$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffVideoDto bffVideoDto, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffVideoDto.uri != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffVideoDto.uri);
        }
        if (dVar.mo24897A(fVar, 1) || bffVideoDto.f100682id != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffVideoDto.f100682id);
        }
        if (dVar.mo24897A(fVar, 2) || bffVideoDto.thumbnails != null) {
            dVar.mo24912i(fVar, 2, gVarArr[2], bffVideoDto.thumbnails);
        }
        if (dVar.mo24897A(fVar, 3) || bffVideoDto.videos != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 3, gVarArr[3], bffVideoDto.videos);
        }
    }

    @C12580l
    public final String component1() {
        return this.uri;
    }

    @C12580l
    public final String component2() {
        return this.f100682id;
    }

    @C12580l
    public final List<BffVideoThumbnailDto> component3() {
        return this.thumbnails;
    }

    @C12580l
    public final List<BffVideoDataDto> component4() {
        return this.videos;
    }

    @C12579k
    public final BffVideoDto copy(@C12580l String str, @C12580l String str2, @C12580l List<BffVideoThumbnailDto> list, @C12580l List<BffVideoDataDto> list2) {
        return new BffVideoDto(str, str2, list, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffVideoDto)) {
            return false;
        }
        BffVideoDto bffVideoDto = (BffVideoDto) obj;
        return Intrinsics.areEqual((Object) this.uri, (Object) bffVideoDto.uri) && Intrinsics.areEqual((Object) this.f100682id, (Object) bffVideoDto.f100682id) && Intrinsics.areEqual((Object) this.thumbnails, (Object) bffVideoDto.thumbnails) && Intrinsics.areEqual((Object) this.videos, (Object) bffVideoDto.videos);
    }

    @C12580l
    public final String getId() {
        return this.f100682id;
    }

    @C12580l
    public final List<BffVideoThumbnailDto> getThumbnails() {
        return this.thumbnails;
    }

    @C12580l
    public final String getUri() {
        return this.uri;
    }

    @C12580l
    public final List<BffVideoDataDto> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f100682id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BffVideoThumbnailDto> list = this.thumbnails;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BffVideoDataDto> list2 = this.videos;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        String str = this.uri;
        String str2 = this.f100682id;
        List<BffVideoThumbnailDto> list = this.thumbnails;
        List<BffVideoDataDto> list2 = this.videos;
        return "BffVideoDto(uri=" + str + ", id=" + str2 + ", thumbnails=" + list + ", videos=" + list2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffVideoDto(int i, @C12438n("uri") String str, @C12438n("id") String str2, @C12438n("thumbnails") List list, @C12438n("videos") List list2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffVideoDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.uri = null;
        } else {
            this.uri = str;
        }
        if ((i & 2) == 0) {
            this.f100682id = null;
        } else {
            this.f100682id = str2;
        }
        if ((i & 4) == 0) {
            this.thumbnails = null;
        } else {
            this.thumbnails = list;
        }
        if ((i & 8) == 0) {
            this.videos = null;
        } else {
            this.videos = list2;
        }
    }

    public BffVideoDto(@C12580l String str, @C12580l String str2, @C12580l List<BffVideoThumbnailDto> list, @C12580l List<BffVideoDataDto> list2) {
        this.uri = str;
        this.f100682id = str2;
        this.thumbnails = list;
        this.videos = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffVideoDto(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
