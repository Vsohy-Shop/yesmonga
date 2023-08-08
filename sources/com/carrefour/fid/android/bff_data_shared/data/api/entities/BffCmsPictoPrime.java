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

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 .2\u00020\u0001:\u0002/.BC\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b(\u0010)BW\b\u0017\u0012\u0006\u0010*\u001a\u00020\u0016\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b(\u0010-J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001dR\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u001dR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u001dR\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u0012\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010\u001d¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "url", "uri", "alt", "width", "height", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getUrl$annotations", "()V", "getUri", "getUri$annotations", "getAlt", "getAlt$annotations", "getWidth", "getWidth$annotations", "getHeight", "getHeight$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCmsPictoPrime {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String alt;
    @C12580l
    private final String height;
    @C12580l
    private final String uri;
    @C12580l
    private final String url;
    @C12580l
    private final String width;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsPictoPrime;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCmsPictoPrime> serializer() {
            return BffCmsPictoPrime$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffCmsPictoPrime() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCmsPictoPrime copy$default(BffCmsPictoPrime bffCmsPictoPrime, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffCmsPictoPrime.url;
        }
        if ((i & 2) != 0) {
            str2 = bffCmsPictoPrime.uri;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bffCmsPictoPrime.alt;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = bffCmsPictoPrime.width;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = bffCmsPictoPrime.height;
        }
        return bffCmsPictoPrime.copy(str, str6, str7, str8, str5);
    }

    @C12438n("alt")
    public static /* synthetic */ void getAlt$annotations() {
    }

    @C12438n("height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @C12438n("uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    @C12438n("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @C12438n("width")
    public static /* synthetic */ void getWidth$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCmsPictoPrime bffCmsPictoPrime, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCmsPictoPrime.url != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffCmsPictoPrime.url);
        }
        if (dVar.mo24897A(fVar, 1) || bffCmsPictoPrime.uri != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCmsPictoPrime.uri);
        }
        if (dVar.mo24897A(fVar, 2) || bffCmsPictoPrime.alt != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffCmsPictoPrime.alt);
        }
        if (dVar.mo24897A(fVar, 3) || bffCmsPictoPrime.width != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCmsPictoPrime.width);
        }
        if (dVar.mo24897A(fVar, 4) || bffCmsPictoPrime.height != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffCmsPictoPrime.height);
        }
    }

    @C12580l
    public final String component1() {
        return this.url;
    }

    @C12580l
    public final String component2() {
        return this.uri;
    }

    @C12580l
    public final String component3() {
        return this.alt;
    }

    @C12580l
    public final String component4() {
        return this.width;
    }

    @C12580l
    public final String component5() {
        return this.height;
    }

    @C12579k
    public final BffCmsPictoPrime copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new BffCmsPictoPrime(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCmsPictoPrime)) {
            return false;
        }
        BffCmsPictoPrime bffCmsPictoPrime = (BffCmsPictoPrime) obj;
        return Intrinsics.areEqual((Object) this.url, (Object) bffCmsPictoPrime.url) && Intrinsics.areEqual((Object) this.uri, (Object) bffCmsPictoPrime.uri) && Intrinsics.areEqual((Object) this.alt, (Object) bffCmsPictoPrime.alt) && Intrinsics.areEqual((Object) this.width, (Object) bffCmsPictoPrime.width) && Intrinsics.areEqual((Object) this.height, (Object) bffCmsPictoPrime.height);
    }

    @C12580l
    public final String getAlt() {
        return this.alt;
    }

    @C12580l
    public final String getHeight() {
        return this.height;
    }

    @C12580l
    public final String getUri() {
        return this.uri;
    }

    @C12580l
    public final String getUrl() {
        return this.url;
    }

    @C12580l
    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uri;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.alt;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.width;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.height;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.url;
        String str2 = this.uri;
        String str3 = this.alt;
        String str4 = this.width;
        String str5 = this.height;
        return "BffCmsPictoPrime(url=" + str + ", uri=" + str2 + ", alt=" + str3 + ", width=" + str4 + ", height=" + str5 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCmsPictoPrime(int i, @C12438n("url") String str, @C12438n("uri") String str2, @C12438n("alt") String str3, @C12438n("width") String str4, @C12438n("height") String str5, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCmsPictoPrime$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.uri = null;
        } else {
            this.uri = str2;
        }
        if ((i & 4) == 0) {
            this.alt = null;
        } else {
            this.alt = str3;
        }
        if ((i & 8) == 0) {
            this.width = null;
        } else {
            this.width = str4;
        }
        if ((i & 16) == 0) {
            this.height = null;
        } else {
            this.height = str5;
        }
    }

    public BffCmsPictoPrime(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.url = str;
        this.uri = str2;
        this.alt = str3;
        this.width = str4;
        this.height = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCmsPictoPrime(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsPictoPrime.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
