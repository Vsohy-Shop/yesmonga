package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bm\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011¢\u0006\u0004\b6\u00107B\u0001\b\u0017\u0012\u0006\u00108\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0001\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b6\u0010;J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011HÆ\u0003Jo\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011HÆ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010!\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010#R.\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100R(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u00102\u0012\u0004\b5\u0010%\u001a\u0004\b3\u00104¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCategorySuggestions;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "", "component7", "bffText", "bffHighlight", "text", "highlight", "bffSearchParam", "facetFilter", "matches", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getBffText", "()Ljava/lang/String;", "getBffText$annotations", "()V", "getBffHighlight", "getBffHighlight$annotations", "getText", "getText$annotations", "getHighlight", "getHighlight$annotations", "getBffSearchParam", "getBffSearchParam$annotations", "Ljava/util/Map;", "getFacetFilter", "()Ljava/util/Map;", "getFacetFilter$annotations", "Ljava/util/List;", "getMatches", "()Ljava/util/List;", "getMatches$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCategorySuggestions {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String bffHighlight;
    @C12580l
    private final String bffSearchParam;
    @C12580l
    private final String bffText;
    @C12580l
    private final Map<String, String> facetFilter;
    @C12580l
    private final String highlight;
    @C12580l
    private final List<String> matches;
    @C12580l
    private final String text;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCategorySuggestions$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCategorySuggestions;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCategorySuggestions> serializer() {
            return BffCategorySuggestions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C12310s1 s1Var = C12310s1.f30117a;
        $childSerializers = new C12248g[]{null, null, null, null, null, new C12291m0(s1Var, s1Var), new C12269f(s1Var)};
    }

    public BffCategorySuggestions() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCategorySuggestions copy$default(BffCategorySuggestions bffCategorySuggestions, String str, String str2, String str3, String str4, String str5, Map<String, String> map, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffCategorySuggestions.bffText;
        }
        if ((i & 2) != 0) {
            str2 = bffCategorySuggestions.bffHighlight;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bffCategorySuggestions.text;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = bffCategorySuggestions.highlight;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = bffCategorySuggestions.bffSearchParam;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            map = bffCategorySuggestions.facetFilter;
        }
        Map<String, String> map2 = map;
        if ((i & 64) != 0) {
            list = bffCategorySuggestions.matches;
        }
        return bffCategorySuggestions.copy(str, str6, str7, str8, str9, map2, list);
    }

    @C12438n("bff_highlight")
    public static /* synthetic */ void getBffHighlight$annotations() {
    }

    @C12438n("bff_search_param")
    public static /* synthetic */ void getBffSearchParam$annotations() {
    }

    @C12438n("bff_text")
    public static /* synthetic */ void getBffText$annotations() {
    }

    @C12438n("facetFilter")
    public static /* synthetic */ void getFacetFilter$annotations() {
    }

    @C12438n("highlight")
    public static /* synthetic */ void getHighlight$annotations() {
    }

    @C12438n("matches")
    public static /* synthetic */ void getMatches$annotations() {
    }

    @C12438n("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCategorySuggestions bffCategorySuggestions, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCategorySuggestions.bffText != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffCategorySuggestions.bffText);
        }
        if (dVar.mo24897A(fVar, 1) || bffCategorySuggestions.bffHighlight != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCategorySuggestions.bffHighlight);
        }
        if (dVar.mo24897A(fVar, 2) || bffCategorySuggestions.text != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffCategorySuggestions.text);
        }
        if (dVar.mo24897A(fVar, 3) || bffCategorySuggestions.highlight != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCategorySuggestions.highlight);
        }
        if (dVar.mo24897A(fVar, 4) || bffCategorySuggestions.bffSearchParam != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffCategorySuggestions.bffSearchParam);
        }
        if (dVar.mo24897A(fVar, 5) || bffCategorySuggestions.facetFilter != null) {
            dVar.mo24912i(fVar, 5, gVarArr[5], bffCategorySuggestions.facetFilter);
        }
        if (dVar.mo24897A(fVar, 6) || bffCategorySuggestions.matches != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 6, gVarArr[6], bffCategorySuggestions.matches);
        }
    }

    @C12580l
    public final String component1() {
        return this.bffText;
    }

    @C12580l
    public final String component2() {
        return this.bffHighlight;
    }

    @C12580l
    public final String component3() {
        return this.text;
    }

    @C12580l
    public final String component4() {
        return this.highlight;
    }

    @C12580l
    public final String component5() {
        return this.bffSearchParam;
    }

    @C12580l
    public final Map<String, String> component6() {
        return this.facetFilter;
    }

    @C12580l
    public final List<String> component7() {
        return this.matches;
    }

    @C12579k
    public final BffCategorySuggestions copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l Map<String, String> map, @C12580l List<String> list) {
        return new BffCategorySuggestions(str, str2, str3, str4, str5, map, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCategorySuggestions)) {
            return false;
        }
        BffCategorySuggestions bffCategorySuggestions = (BffCategorySuggestions) obj;
        return Intrinsics.areEqual((Object) this.bffText, (Object) bffCategorySuggestions.bffText) && Intrinsics.areEqual((Object) this.bffHighlight, (Object) bffCategorySuggestions.bffHighlight) && Intrinsics.areEqual((Object) this.text, (Object) bffCategorySuggestions.text) && Intrinsics.areEqual((Object) this.highlight, (Object) bffCategorySuggestions.highlight) && Intrinsics.areEqual((Object) this.bffSearchParam, (Object) bffCategorySuggestions.bffSearchParam) && Intrinsics.areEqual((Object) this.facetFilter, (Object) bffCategorySuggestions.facetFilter) && Intrinsics.areEqual((Object) this.matches, (Object) bffCategorySuggestions.matches);
    }

    @C12580l
    public final String getBffHighlight() {
        return this.bffHighlight;
    }

    @C12580l
    public final String getBffSearchParam() {
        return this.bffSearchParam;
    }

    @C12580l
    public final String getBffText() {
        return this.bffText;
    }

    @C12580l
    public final Map<String, String> getFacetFilter() {
        return this.facetFilter;
    }

    @C12580l
    public final String getHighlight() {
        return this.highlight;
    }

    @C12580l
    public final List<String> getMatches() {
        return this.matches;
    }

    @C12580l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.bffText;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bffHighlight;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.highlight;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bffSearchParam;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.facetFilter;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.matches;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    @C12579k
    public String toString() {
        String str = this.bffText;
        String str2 = this.bffHighlight;
        String str3 = this.text;
        String str4 = this.highlight;
        String str5 = this.bffSearchParam;
        Map<String, String> map = this.facetFilter;
        List<String> list = this.matches;
        return "BffCategorySuggestions(bffText=" + str + ", bffHighlight=" + str2 + ", text=" + str3 + ", highlight=" + str4 + ", bffSearchParam=" + str5 + ", facetFilter=" + map + ", matches=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCategorySuggestions(int i, @C12438n("bff_text") String str, @C12438n("bff_highlight") String str2, @C12438n("text") String str3, @C12438n("highlight") String str4, @C12438n("bff_search_param") String str5, @C12438n("facetFilter") Map map, @C12438n("matches") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCategorySuggestions$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.bffText = null;
        } else {
            this.bffText = str;
        }
        if ((i & 2) == 0) {
            this.bffHighlight = null;
        } else {
            this.bffHighlight = str2;
        }
        if ((i & 4) == 0) {
            this.text = null;
        } else {
            this.text = str3;
        }
        if ((i & 8) == 0) {
            this.highlight = null;
        } else {
            this.highlight = str4;
        }
        if ((i & 16) == 0) {
            this.bffSearchParam = null;
        } else {
            this.bffSearchParam = str5;
        }
        if ((i & 32) == 0) {
            this.facetFilter = null;
        } else {
            this.facetFilter = map;
        }
        if ((i & 64) == 0) {
            this.matches = null;
        } else {
            this.matches = list;
        }
    }

    public BffCategorySuggestions(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l Map<String, String> map, @C12580l List<String> list) {
        this.bffText = str;
        this.bffHighlight = str2;
        this.text = str3;
        this.highlight = str4;
        this.bffSearchParam = str5;
        this.facetFilter = map;
        this.matches = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCategorySuggestions(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map r12, java.util.List r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategorySuggestions.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
