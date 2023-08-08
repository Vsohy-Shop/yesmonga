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

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 -2\u00020\u0001:\u0002.-B1\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b'\u0010(BE\b\u0017\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\rR(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b&\u0010\u001f\u001a\u0004\b$\u0010%¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB50MenuDtoAllOf;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Integer;", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUrlDto;", "component3", "title", "contentId", "links", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB50MenuDtoAllOf;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "()V", "Ljava/lang/Integer;", "getContentId", "getContentId$annotations", "Ljava/util/List;", "getLinks", "()Ljava/util/List;", "getLinks$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffB50MenuDtoAllOf {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, new C12269f(BffUrlDto$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Integer contentId;
    @C12580l
    private final List<BffUrlDto> links;
    @C12580l
    private final String title;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB50MenuDtoAllOf$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB50MenuDtoAllOf;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffB50MenuDtoAllOf> serializer() {
            return BffB50MenuDtoAllOf$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffB50MenuDtoAllOf() {
        this((String) null, (Integer) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffB50MenuDtoAllOf copy$default(BffB50MenuDtoAllOf bffB50MenuDtoAllOf, String str, Integer num, List<BffUrlDto> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffB50MenuDtoAllOf.title;
        }
        if ((i & 2) != 0) {
            num = bffB50MenuDtoAllOf.contentId;
        }
        if ((i & 4) != 0) {
            list = bffB50MenuDtoAllOf.links;
        }
        return bffB50MenuDtoAllOf.copy(str, num, list);
    }

    @C12438n("content_id")
    public static /* synthetic */ void getContentId$annotations() {
    }

    @C12438n("links")
    public static /* synthetic */ void getLinks$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffB50MenuDtoAllOf bffB50MenuDtoAllOf, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffB50MenuDtoAllOf.title != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffB50MenuDtoAllOf.title);
        }
        if (dVar.mo24897A(fVar, 1) || bffB50MenuDtoAllOf.contentId != null) {
            dVar.mo24912i(fVar, 1, C12276h0.f30067a, bffB50MenuDtoAllOf.contentId);
        }
        if (dVar.mo24897A(fVar, 2) || bffB50MenuDtoAllOf.links != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 2, gVarArr[2], bffB50MenuDtoAllOf.links);
        }
    }

    @C12580l
    public final String component1() {
        return this.title;
    }

    @C12580l
    public final Integer component2() {
        return this.contentId;
    }

    @C12580l
    public final List<BffUrlDto> component3() {
        return this.links;
    }

    @C12579k
    public final BffB50MenuDtoAllOf copy(@C12580l String str, @C12580l Integer num, @C12580l List<BffUrlDto> list) {
        return new BffB50MenuDtoAllOf(str, num, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffB50MenuDtoAllOf)) {
            return false;
        }
        BffB50MenuDtoAllOf bffB50MenuDtoAllOf = (BffB50MenuDtoAllOf) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) bffB50MenuDtoAllOf.title) && Intrinsics.areEqual((Object) this.contentId, (Object) bffB50MenuDtoAllOf.contentId) && Intrinsics.areEqual((Object) this.links, (Object) bffB50MenuDtoAllOf.links);
    }

    @C12580l
    public final Integer getContentId() {
        return this.contentId;
    }

    @C12580l
    public final List<BffUrlDto> getLinks() {
        return this.links;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.contentId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<BffUrlDto> list = this.links;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.title;
        Integer num = this.contentId;
        List<BffUrlDto> list = this.links;
        return "BffB50MenuDtoAllOf(title=" + str + ", contentId=" + num + ", links=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffB50MenuDtoAllOf(int i, @C12438n("title") String str, @C12438n("content_id") Integer num, @C12438n("links") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffB50MenuDtoAllOf$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.contentId = null;
        } else {
            this.contentId = num;
        }
        if ((i & 4) == 0) {
            this.links = null;
        } else {
            this.links = list;
        }
    }

    public BffB50MenuDtoAllOf(@C12580l String str, @C12580l Integer num, @C12580l List<BffUrlDto> list) {
        this.title = str;
        this.contentId = num;
        this.links = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffB50MenuDtoAllOf(String str, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}
