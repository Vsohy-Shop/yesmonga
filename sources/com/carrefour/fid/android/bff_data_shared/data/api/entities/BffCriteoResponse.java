package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;
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
import kotlinx.serialization.internal.C12291m0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12297o0;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 62\u00020\u0001:\u000276Ba\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\"\b\u0002\u0010\u0015\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f¢\u0006\u0004\b0\u00101Bu\b\u0017\u0012\u0006\u00102\u001a\u00020\u001a\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\"\b\u0001\u0010\u0015\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b0\u00105J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J#\u0010\u0010\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\fHÆ\u0003Jc\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\"\b\u0002\u0010\u0015\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\fHÆ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R:\u0010\u0015\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010&\u0012\u0004\b)\u0010#\u001a\u0004\b'\u0010(R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R(\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010&\u0012\u0004\b/\u0010#\u001a\u0004\b.\u0010(¨\u00068"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;", "component3", "component4", "component5", "status", "pageUid", "placements", "criteoViewItem", "errors", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "getStatus$annotations", "()V", "getPageUid", "getPageUid$annotations", "Ljava/util/List;", "getPlacements", "()Ljava/util/List;", "getPlacements$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;", "getCriteoViewItem", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;", "getCriteoViewItem$annotations", "getErrors", "getErrors$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCriteoResponse {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffCriteoViewItem criteoViewItem;
    @C12580l
    private final List<String> errors;
    @C12580l
    private final String pageUid;
    @C12580l
    private final List<Map<String, Set<BffCriteoViewItem>>> placements;
    @C12580l
    private final String status;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoResponse$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoResponse;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCriteoResponse> serializer() {
            return BffCriteoResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C12310s1 s1Var = C12310s1.f30117a;
        $childSerializers = new C12248g[]{null, null, new C12269f(new C12291m0(s1Var, new C12297o0(BffCriteoViewItem$$serializer.INSTANCE))), null, new C12269f(s1Var)};
    }

    public BffCriteoResponse() {
        this((String) null, (String) null, (List) null, (BffCriteoViewItem) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCriteoResponse copy$default(BffCriteoResponse bffCriteoResponse, String str, String str2, List<Map<String, Set<BffCriteoViewItem>>> list, BffCriteoViewItem bffCriteoViewItem, List<String> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffCriteoResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = bffCriteoResponse.pageUid;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            list = bffCriteoResponse.placements;
        }
        List<Map<String, Set<BffCriteoViewItem>>> list3 = list;
        if ((i & 8) != 0) {
            bffCriteoViewItem = bffCriteoResponse.criteoViewItem;
        }
        BffCriteoViewItem bffCriteoViewItem2 = bffCriteoViewItem;
        if ((i & 16) != 0) {
            list2 = bffCriteoResponse.errors;
        }
        return bffCriteoResponse.copy(str, str3, list3, bffCriteoViewItem2, list2);
    }

    @C12438n("criteoViewItem")
    public static /* synthetic */ void getCriteoViewItem$annotations() {
    }

    @C12438n("errors")
    public static /* synthetic */ void getErrors$annotations() {
    }

    @C12438n("page-uid")
    public static /* synthetic */ void getPageUid$annotations() {
    }

    @C12438n("placements")
    public static /* synthetic */ void getPlacements$annotations() {
    }

    @C12438n("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCriteoResponse bffCriteoResponse, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCriteoResponse.status != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffCriteoResponse.status);
        }
        if (dVar.mo24897A(fVar, 1) || bffCriteoResponse.pageUid != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCriteoResponse.pageUid);
        }
        if (dVar.mo24897A(fVar, 2) || bffCriteoResponse.placements != null) {
            dVar.mo24912i(fVar, 2, gVarArr[2], bffCriteoResponse.placements);
        }
        if (dVar.mo24897A(fVar, 3) || bffCriteoResponse.criteoViewItem != null) {
            dVar.mo24912i(fVar, 3, BffCriteoViewItem$$serializer.INSTANCE, bffCriteoResponse.criteoViewItem);
        }
        if (dVar.mo24897A(fVar, 4) || bffCriteoResponse.errors != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, gVarArr[4], bffCriteoResponse.errors);
        }
    }

    @C12580l
    public final String component1() {
        return this.status;
    }

    @C12580l
    public final String component2() {
        return this.pageUid;
    }

    @C12580l
    public final List<Map<String, Set<BffCriteoViewItem>>> component3() {
        return this.placements;
    }

    @C12580l
    public final BffCriteoViewItem component4() {
        return this.criteoViewItem;
    }

    @C12580l
    public final List<String> component5() {
        return this.errors;
    }

    @C12579k
    public final BffCriteoResponse copy(@C12580l String str, @C12580l String str2, @C12580l List<? extends Map<String, ? extends Set<BffCriteoViewItem>>> list, @C12580l BffCriteoViewItem bffCriteoViewItem, @C12580l List<String> list2) {
        return new BffCriteoResponse(str, str2, list, bffCriteoViewItem, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCriteoResponse)) {
            return false;
        }
        BffCriteoResponse bffCriteoResponse = (BffCriteoResponse) obj;
        return Intrinsics.areEqual((Object) this.status, (Object) bffCriteoResponse.status) && Intrinsics.areEqual((Object) this.pageUid, (Object) bffCriteoResponse.pageUid) && Intrinsics.areEqual((Object) this.placements, (Object) bffCriteoResponse.placements) && Intrinsics.areEqual((Object) this.criteoViewItem, (Object) bffCriteoResponse.criteoViewItem) && Intrinsics.areEqual((Object) this.errors, (Object) bffCriteoResponse.errors);
    }

    @C12580l
    public final BffCriteoViewItem getCriteoViewItem() {
        return this.criteoViewItem;
    }

    @C12580l
    public final List<String> getErrors() {
        return this.errors;
    }

    @C12580l
    public final String getPageUid() {
        return this.pageUid;
    }

    @C12580l
    public final List<Map<String, Set<BffCriteoViewItem>>> getPlacements() {
        return this.placements;
    }

    @C12580l
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pageUid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Map<String, Set<BffCriteoViewItem>>> list = this.placements;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BffCriteoViewItem bffCriteoViewItem = this.criteoViewItem;
        int hashCode4 = (hashCode3 + (bffCriteoViewItem == null ? 0 : bffCriteoViewItem.hashCode())) * 31;
        List<String> list2 = this.errors;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.status;
        String str2 = this.pageUid;
        List<Map<String, Set<BffCriteoViewItem>>> list = this.placements;
        BffCriteoViewItem bffCriteoViewItem = this.criteoViewItem;
        List<String> list2 = this.errors;
        return "BffCriteoResponse(status=" + str + ", pageUid=" + str2 + ", placements=" + list + ", criteoViewItem=" + bffCriteoViewItem + ", errors=" + list2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCriteoResponse(int i, @C12438n("status") String str, @C12438n("page-uid") String str2, @C12438n("placements") List list, @C12438n("criteoViewItem") BffCriteoViewItem bffCriteoViewItem, @C12438n("errors") List list2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCriteoResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.pageUid = null;
        } else {
            this.pageUid = str2;
        }
        if ((i & 4) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i & 8) == 0) {
            this.criteoViewItem = null;
        } else {
            this.criteoViewItem = bffCriteoViewItem;
        }
        if ((i & 16) == 0) {
            this.errors = null;
        } else {
            this.errors = list2;
        }
    }

    public BffCriteoResponse(@C12580l String str, @C12580l String str2, @C12580l List<? extends Map<String, ? extends Set<BffCriteoViewItem>>> list, @C12580l BffCriteoViewItem bffCriteoViewItem, @C12580l List<String> list2) {
        this.status = str;
        this.pageUid = str2;
        this.placements = list;
        this.criteoViewItem = bffCriteoViewItem;
        this.errors = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCriteoResponse(java.lang.String r5, java.lang.String r6, java.util.List r7, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r8, java.util.List r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoResponse.<init>(java.lang.String, java.lang.String, java.util.List, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
