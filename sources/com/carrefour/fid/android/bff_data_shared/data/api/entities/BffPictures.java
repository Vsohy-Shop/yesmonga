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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 (2\u00020\u0001:\u0002)(B=\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\"\u0010#BQ\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0014\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001b¨\u0006*"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffItemPicture;", "component1", "component2", "component3", "large", "medium", "small", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getLarge", "()Ljava/util/List;", "getLarge$annotations", "()V", "getMedium", "getMedium$annotations", "getSmall", "getSmall$annotations", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffPictures {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final List<BffItemPicture> large;
    @C12580l
    private final List<BffItemPicture> medium;
    @C12580l
    private final List<BffItemPicture> small;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffPictures> serializer() {
            return BffPictures$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        BffItemPicture$$serializer bffItemPicture$$serializer = BffItemPicture$$serializer.INSTANCE;
        $childSerializers = new C12248g[]{new C12269f(bffItemPicture$$serializer), new C12269f(bffItemPicture$$serializer), new C12269f(bffItemPicture$$serializer)};
    }

    public BffPictures() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffPictures copy$default(BffPictures bffPictures, List<BffItemPicture> list, List<BffItemPicture> list2, List<BffItemPicture> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bffPictures.large;
        }
        if ((i & 2) != 0) {
            list2 = bffPictures.medium;
        }
        if ((i & 4) != 0) {
            list3 = bffPictures.small;
        }
        return bffPictures.copy(list, list2, list3);
    }

    @C12438n("large")
    public static /* synthetic */ void getLarge$annotations() {
    }

    @C12438n("medium")
    public static /* synthetic */ void getMedium$annotations() {
    }

    @C12438n("small")
    public static /* synthetic */ void getSmall$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffPictures bffPictures, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffPictures.large != null) {
            dVar.mo24912i(fVar, 0, gVarArr[0], bffPictures.large);
        }
        if (dVar.mo24897A(fVar, 1) || bffPictures.medium != null) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffPictures.medium);
        }
        if (dVar.mo24897A(fVar, 2) || bffPictures.small != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 2, gVarArr[2], bffPictures.small);
        }
    }

    @C12580l
    public final List<BffItemPicture> component1() {
        return this.large;
    }

    @C12580l
    public final List<BffItemPicture> component2() {
        return this.medium;
    }

    @C12580l
    public final List<BffItemPicture> component3() {
        return this.small;
    }

    @C12579k
    public final BffPictures copy(@C12580l List<BffItemPicture> list, @C12580l List<BffItemPicture> list2, @C12580l List<BffItemPicture> list3) {
        return new BffPictures(list, list2, list3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffPictures)) {
            return false;
        }
        BffPictures bffPictures = (BffPictures) obj;
        return Intrinsics.areEqual((Object) this.large, (Object) bffPictures.large) && Intrinsics.areEqual((Object) this.medium, (Object) bffPictures.medium) && Intrinsics.areEqual((Object) this.small, (Object) bffPictures.small);
    }

    @C12580l
    public final List<BffItemPicture> getLarge() {
        return this.large;
    }

    @C12580l
    public final List<BffItemPicture> getMedium() {
        return this.medium;
    }

    @C12580l
    public final List<BffItemPicture> getSmall() {
        return this.small;
    }

    public int hashCode() {
        List<BffItemPicture> list = this.large;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<BffItemPicture> list2 = this.medium;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BffItemPicture> list3 = this.small;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        List<BffItemPicture> list = this.large;
        List<BffItemPicture> list2 = this.medium;
        List<BffItemPicture> list3 = this.small;
        return "BffPictures(large=" + list + ", medium=" + list2 + ", small=" + list3 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffPictures(int i, @C12438n("large") List list, @C12438n("medium") List list2, @C12438n("small") List list3, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffPictures$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.large = null;
        } else {
            this.large = list;
        }
        if ((i & 2) == 0) {
            this.medium = null;
        } else {
            this.medium = list2;
        }
        if ((i & 4) == 0) {
            this.small = null;
        } else {
            this.small = list3;
        }
    }

    public BffPictures(@C12580l List<BffItemPicture> list, @C12580l List<BffItemPicture> list2, @C12580l List<BffItemPicture> list3) {
        this.large = list;
        this.medium = list2;
        this.small = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffPictures(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
