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

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 12\u00020\u0001:\u000221BO\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b+\u0010,Bc\b\u0017\u0012\u0006\u0010-\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b+\u00100J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\fHÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003JQ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001eR(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010#\u0012\u0004\b&\u0010 \u001a\u0004\b$\u0010%R(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b(\u0010 \u001a\u0004\b'\u0010%R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u0012\u0004\b*\u0010 \u001a\u0004\b)\u0010\u001e¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTextSuggestions;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "component3", "component4", "component5", "bffText", "bffHighlight", "text", "highlight", "type", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getBffText", "()Ljava/lang/String;", "getBffText$annotations", "()V", "getBffHighlight", "getBffHighlight$annotations", "Ljava/util/List;", "getText", "()Ljava/util/List;", "getText$annotations", "getHighlight", "getHighlight$annotations", "getType", "getType$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffTextSuggestions {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String bffHighlight;
    @C12580l
    private final String bffText;
    @C12580l
    private final List<String> highlight;
    @C12580l
    private final List<String> text;
    @C12580l
    private final String type;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTextSuggestions$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTextSuggestions;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffTextSuggestions> serializer() {
            return BffTextSuggestions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C12310s1 s1Var = C12310s1.f30117a;
        $childSerializers = new C12248g[]{null, null, new C12269f(s1Var), new C12269f(s1Var), null};
    }

    public BffTextSuggestions() {
        this((String) null, (String) null, (List) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffTextSuggestions copy$default(BffTextSuggestions bffTextSuggestions, String str, String str2, List<String> list, List<String> list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffTextSuggestions.bffText;
        }
        if ((i & 2) != 0) {
            str2 = bffTextSuggestions.bffHighlight;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = bffTextSuggestions.text;
        }
        List<String> list3 = list;
        if ((i & 8) != 0) {
            list2 = bffTextSuggestions.highlight;
        }
        List<String> list4 = list2;
        if ((i & 16) != 0) {
            str3 = bffTextSuggestions.type;
        }
        return bffTextSuggestions.copy(str, str4, list3, list4, str3);
    }

    @C12438n("bff_highlight")
    public static /* synthetic */ void getBffHighlight$annotations() {
    }

    @C12438n("bff_text")
    public static /* synthetic */ void getBffText$annotations() {
    }

    @C12438n("highlight")
    public static /* synthetic */ void getHighlight$annotations() {
    }

    @C12438n("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @C12438n("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffTextSuggestions bffTextSuggestions, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffTextSuggestions.bffText != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffTextSuggestions.bffText);
        }
        if (dVar.mo24897A(fVar, 1) || bffTextSuggestions.bffHighlight != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffTextSuggestions.bffHighlight);
        }
        if (dVar.mo24897A(fVar, 2) || bffTextSuggestions.text != null) {
            dVar.mo24912i(fVar, 2, gVarArr[2], bffTextSuggestions.text);
        }
        if (dVar.mo24897A(fVar, 3) || bffTextSuggestions.highlight != null) {
            dVar.mo24912i(fVar, 3, gVarArr[3], bffTextSuggestions.highlight);
        }
        if (dVar.mo24897A(fVar, 4) || bffTextSuggestions.type != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffTextSuggestions.type);
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
    public final List<String> component3() {
        return this.text;
    }

    @C12580l
    public final List<String> component4() {
        return this.highlight;
    }

    @C12580l
    public final String component5() {
        return this.type;
    }

    @C12579k
    public final BffTextSuggestions copy(@C12580l String str, @C12580l String str2, @C12580l List<String> list, @C12580l List<String> list2, @C12580l String str3) {
        return new BffTextSuggestions(str, str2, list, list2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffTextSuggestions)) {
            return false;
        }
        BffTextSuggestions bffTextSuggestions = (BffTextSuggestions) obj;
        return Intrinsics.areEqual((Object) this.bffText, (Object) bffTextSuggestions.bffText) && Intrinsics.areEqual((Object) this.bffHighlight, (Object) bffTextSuggestions.bffHighlight) && Intrinsics.areEqual((Object) this.text, (Object) bffTextSuggestions.text) && Intrinsics.areEqual((Object) this.highlight, (Object) bffTextSuggestions.highlight) && Intrinsics.areEqual((Object) this.type, (Object) bffTextSuggestions.type);
    }

    @C12580l
    public final String getBffHighlight() {
        return this.bffHighlight;
    }

    @C12580l
    public final String getBffText() {
        return this.bffText;
    }

    @C12580l
    public final List<String> getHighlight() {
        return this.highlight;
    }

    @C12580l
    public final List<String> getText() {
        return this.text;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.bffText;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bffHighlight;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.text;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.highlight;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.bffText;
        String str2 = this.bffHighlight;
        List<String> list = this.text;
        List<String> list2 = this.highlight;
        String str3 = this.type;
        return "BffTextSuggestions(bffText=" + str + ", bffHighlight=" + str2 + ", text=" + list + ", highlight=" + list2 + ", type=" + str3 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffTextSuggestions(int i, @C12438n("bff_text") String str, @C12438n("bff_highlight") String str2, @C12438n("text") List list, @C12438n("highlight") List list2, @C12438n("type") String str3, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffTextSuggestions$$serializer.INSTANCE.getDescriptor());
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
            this.text = list;
        }
        if ((i & 8) == 0) {
            this.highlight = null;
        } else {
            this.highlight = list2;
        }
        if ((i & 16) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
    }

    public BffTextSuggestions(@C12580l String str, @C12580l String str2, @C12580l List<String> list, @C12580l List<String> list2, @C12580l String str3) {
        this.bffText = str;
        this.bffHighlight = str2;
        this.text = list;
        this.highlight = list2;
        this.type = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffTextSuggestions(java.lang.String r5, java.lang.String r6, java.util.List r7, java.util.List r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTextSuggestions.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
