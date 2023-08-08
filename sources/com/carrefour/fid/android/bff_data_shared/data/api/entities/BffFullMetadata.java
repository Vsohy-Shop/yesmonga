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

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 82\u00020\u0001:\u000298B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u00103Bo\b\u0017\u0012\u0006\u00104\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJd\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\rR\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\rR\"\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\rR\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010%\u0012\u0004\b-\u0010$\u001a\u0004\b,\u0010\rR\"\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010%\u0012\u0004\b/\u0010$\u001a\u0004\b.\u0010\rR\"\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010%\u0012\u0004\b1\u0010$\u001a\u0004\b0\u0010\r¨\u0006:"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "totalResults", "totalPages", "resultsPerPage", "currentPage", "previousPage", "nextPage", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSelf", "()Ljava/lang/String;", "getSelf$annotations", "()V", "Ljava/lang/Integer;", "getTotalResults", "getTotalResults$annotations", "getTotalPages", "getTotalPages$annotations", "getResultsPerPage", "getResultsPerPage$annotations", "getCurrentPage", "getCurrentPage$annotations", "getPreviousPage", "getPreviousPage$annotations", "getNextPage", "getNextPage$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffFullMetadata {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Integer currentPage;
    @C12580l
    private final Integer nextPage;
    @C12580l
    private final Integer previousPage;
    @C12580l
    private final Integer resultsPerPage;
    @C12580l
    private final String self;
    @C12580l
    private final Integer totalPages;
    @C12580l
    private final Integer totalResults;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFullMetadata;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffFullMetadata> serializer() {
            return BffFullMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffFullMetadata() {
        this((String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffFullMetadata copy$default(BffFullMetadata bffFullMetadata, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffFullMetadata.self;
        }
        if ((i & 2) != 0) {
            num = bffFullMetadata.totalResults;
        }
        Integer num7 = num;
        if ((i & 4) != 0) {
            num2 = bffFullMetadata.totalPages;
        }
        Integer num8 = num2;
        if ((i & 8) != 0) {
            num3 = bffFullMetadata.resultsPerPage;
        }
        Integer num9 = num3;
        if ((i & 16) != 0) {
            num4 = bffFullMetadata.currentPage;
        }
        Integer num10 = num4;
        if ((i & 32) != 0) {
            num5 = bffFullMetadata.previousPage;
        }
        Integer num11 = num5;
        if ((i & 64) != 0) {
            num6 = bffFullMetadata.nextPage;
        }
        return bffFullMetadata.copy(str, num7, num8, num9, num10, num11, num6);
    }

    @C12438n("current_page")
    public static /* synthetic */ void getCurrentPage$annotations() {
    }

    @C12438n("next_page")
    public static /* synthetic */ void getNextPage$annotations() {
    }

    @C12438n("previous_page")
    public static /* synthetic */ void getPreviousPage$annotations() {
    }

    @C12438n("results_per_page")
    public static /* synthetic */ void getResultsPerPage$annotations() {
    }

    @C12438n("self")
    public static /* synthetic */ void getSelf$annotations() {
    }

    @C12438n("total_pages")
    public static /* synthetic */ void getTotalPages$annotations() {
    }

    @C12438n("total_results")
    public static /* synthetic */ void getTotalResults$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffFullMetadata bffFullMetadata, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffFullMetadata.self != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffFullMetadata.self);
        }
        if (dVar.mo24897A(fVar, 1) || bffFullMetadata.totalResults != null) {
            dVar.mo24912i(fVar, 1, C12276h0.f30067a, bffFullMetadata.totalResults);
        }
        if (dVar.mo24897A(fVar, 2) || bffFullMetadata.totalPages != null) {
            dVar.mo24912i(fVar, 2, C12276h0.f30067a, bffFullMetadata.totalPages);
        }
        if (dVar.mo24897A(fVar, 3) || bffFullMetadata.resultsPerPage != null) {
            dVar.mo24912i(fVar, 3, C12276h0.f30067a, bffFullMetadata.resultsPerPage);
        }
        if (dVar.mo24897A(fVar, 4) || bffFullMetadata.currentPage != null) {
            dVar.mo24912i(fVar, 4, C12276h0.f30067a, bffFullMetadata.currentPage);
        }
        if (dVar.mo24897A(fVar, 5) || bffFullMetadata.previousPage != null) {
            dVar.mo24912i(fVar, 5, C12276h0.f30067a, bffFullMetadata.previousPage);
        }
        if (dVar.mo24897A(fVar, 6) || bffFullMetadata.nextPage != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 6, C12276h0.f30067a, bffFullMetadata.nextPage);
        }
    }

    @C12580l
    public final String component1() {
        return this.self;
    }

    @C12580l
    public final Integer component2() {
        return this.totalResults;
    }

    @C12580l
    public final Integer component3() {
        return this.totalPages;
    }

    @C12580l
    public final Integer component4() {
        return this.resultsPerPage;
    }

    @C12580l
    public final Integer component5() {
        return this.currentPage;
    }

    @C12580l
    public final Integer component6() {
        return this.previousPage;
    }

    @C12580l
    public final Integer component7() {
        return this.nextPage;
    }

    @C12579k
    public final BffFullMetadata copy(@C12580l String str, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4, @C12580l Integer num5, @C12580l Integer num6) {
        return new BffFullMetadata(str, num, num2, num3, num4, num5, num6);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffFullMetadata)) {
            return false;
        }
        BffFullMetadata bffFullMetadata = (BffFullMetadata) obj;
        return Intrinsics.areEqual((Object) this.self, (Object) bffFullMetadata.self) && Intrinsics.areEqual((Object) this.totalResults, (Object) bffFullMetadata.totalResults) && Intrinsics.areEqual((Object) this.totalPages, (Object) bffFullMetadata.totalPages) && Intrinsics.areEqual((Object) this.resultsPerPage, (Object) bffFullMetadata.resultsPerPage) && Intrinsics.areEqual((Object) this.currentPage, (Object) bffFullMetadata.currentPage) && Intrinsics.areEqual((Object) this.previousPage, (Object) bffFullMetadata.previousPage) && Intrinsics.areEqual((Object) this.nextPage, (Object) bffFullMetadata.nextPage);
    }

    @C12580l
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @C12580l
    public final Integer getNextPage() {
        return this.nextPage;
    }

    @C12580l
    public final Integer getPreviousPage() {
        return this.previousPage;
    }

    @C12580l
    public final Integer getResultsPerPage() {
        return this.resultsPerPage;
    }

    @C12580l
    public final String getSelf() {
        return this.self;
    }

    @C12580l
    public final Integer getTotalPages() {
        return this.totalPages;
    }

    @C12580l
    public final Integer getTotalResults() {
        return this.totalResults;
    }

    public int hashCode() {
        String str = this.self;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.totalResults;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalPages;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.resultsPerPage;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.currentPage;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.previousPage;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.nextPage;
        if (num6 != null) {
            i = num6.hashCode();
        }
        return hashCode6 + i;
    }

    @C12579k
    public String toString() {
        String str = this.self;
        Integer num = this.totalResults;
        Integer num2 = this.totalPages;
        Integer num3 = this.resultsPerPage;
        Integer num4 = this.currentPage;
        Integer num5 = this.previousPage;
        Integer num6 = this.nextPage;
        return "BffFullMetadata(self=" + str + ", totalResults=" + num + ", totalPages=" + num2 + ", resultsPerPage=" + num3 + ", currentPage=" + num4 + ", previousPage=" + num5 + ", nextPage=" + num6 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffFullMetadata(int i, @C12438n("self") String str, @C12438n("total_results") Integer num, @C12438n("total_pages") Integer num2, @C12438n("results_per_page") Integer num3, @C12438n("current_page") Integer num4, @C12438n("previous_page") Integer num5, @C12438n("next_page") Integer num6, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffFullMetadata$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.self = null;
        } else {
            this.self = str;
        }
        if ((i & 2) == 0) {
            this.totalResults = null;
        } else {
            this.totalResults = num;
        }
        if ((i & 4) == 0) {
            this.totalPages = null;
        } else {
            this.totalPages = num2;
        }
        if ((i & 8) == 0) {
            this.resultsPerPage = null;
        } else {
            this.resultsPerPage = num3;
        }
        if ((i & 16) == 0) {
            this.currentPage = null;
        } else {
            this.currentPage = num4;
        }
        if ((i & 32) == 0) {
            this.previousPage = null;
        } else {
            this.previousPage = num5;
        }
        if ((i & 64) == 0) {
            this.nextPage = null;
        } else {
            this.nextPage = num6;
        }
    }

    public BffFullMetadata(@C12580l String str, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4, @C12580l Integer num5, @C12580l Integer num6) {
        this.self = str;
        this.totalResults = num;
        this.totalPages = num2;
        this.resultsPerPage = num3;
        this.currentPage = num4;
        this.previousPage = num5;
        this.nextPage = num6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffFullMetadata(java.lang.String r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFullMetadata.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
