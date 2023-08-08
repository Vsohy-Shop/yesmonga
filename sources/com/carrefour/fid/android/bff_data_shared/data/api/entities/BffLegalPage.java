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

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 :2\u00020\u0001:\u0002;:B[\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b4\u00105Bo\b\u0017\u0012\u0006\u00106\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b4\u00109J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010(\u0012\u0004\b+\u0010%\u001a\u0004\b)\u0010*R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010,\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.R(\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010(\u0012\u0004\b1\u0010%\u001a\u0004\b0\u0010*R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010!\u0012\u0004\b3\u0010%\u001a\u0004\b2\u0010#¨\u0006<"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLegalPage;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB17EditoDto;", "component3", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsMetaTags;", "component4", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsBreadcrumb;", "component5", "component6", "templateId", "title", "blocks", "metatags", "breadcrumb", "slug", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTemplateId", "()Ljava/lang/String;", "getTemplateId$annotations", "()V", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getBlocks", "()Ljava/util/List;", "getBlocks$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsMetaTags;", "getMetatags", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsMetaTags;", "getMetatags$annotations", "getBreadcrumb", "getBreadcrumb$annotations", "getSlug", "getSlug$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsMetaTags;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCmsMetaTags;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffLegalPage {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, new C12269f(BffB17EditoDto$$serializer.INSTANCE), null, new C12269f(BffCmsBreadcrumb$$serializer.INSTANCE), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final List<BffB17EditoDto> blocks;
    @C12580l
    private final List<BffCmsBreadcrumb> breadcrumb;
    @C12580l
    private final BffCmsMetaTags metatags;
    @C12580l
    private final String slug;
    @C12580l
    private final String templateId;
    @C12580l
    private final String title;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLegalPage$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLegalPage;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffLegalPage> serializer() {
            return BffLegalPage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffLegalPage() {
        this((String) null, (String) null, (List) null, (BffCmsMetaTags) null, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffLegalPage copy$default(BffLegalPage bffLegalPage, String str, String str2, List<BffB17EditoDto> list, BffCmsMetaTags bffCmsMetaTags, List<BffCmsBreadcrumb> list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffLegalPage.templateId;
        }
        if ((i & 2) != 0) {
            str2 = bffLegalPage.title;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = bffLegalPage.blocks;
        }
        List<BffB17EditoDto> list3 = list;
        if ((i & 8) != 0) {
            bffCmsMetaTags = bffLegalPage.metatags;
        }
        BffCmsMetaTags bffCmsMetaTags2 = bffCmsMetaTags;
        if ((i & 16) != 0) {
            list2 = bffLegalPage.breadcrumb;
        }
        List<BffCmsBreadcrumb> list4 = list2;
        if ((i & 32) != 0) {
            str3 = bffLegalPage.slug;
        }
        return bffLegalPage.copy(str, str4, list3, bffCmsMetaTags2, list4, str3);
    }

    @C12438n("blocks")
    public static /* synthetic */ void getBlocks$annotations() {
    }

    @C12438n("breadcrumb")
    public static /* synthetic */ void getBreadcrumb$annotations() {
    }

    @C12438n("metatags")
    public static /* synthetic */ void getMetatags$annotations() {
    }

    @C12438n("slug")
    public static /* synthetic */ void getSlug$annotations() {
    }

    @C12438n("template_id")
    public static /* synthetic */ void getTemplateId$annotations() {
    }

    @C12438n("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffLegalPage bffLegalPage, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffLegalPage.templateId != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffLegalPage.templateId);
        }
        if (dVar.mo24897A(fVar, 1) || bffLegalPage.title != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffLegalPage.title);
        }
        if (dVar.mo24897A(fVar, 2) || bffLegalPage.blocks != null) {
            dVar.mo24912i(fVar, 2, gVarArr[2], bffLegalPage.blocks);
        }
        if (dVar.mo24897A(fVar, 3) || bffLegalPage.metatags != null) {
            dVar.mo24912i(fVar, 3, BffCmsMetaTags$$serializer.INSTANCE, bffLegalPage.metatags);
        }
        if (dVar.mo24897A(fVar, 4) || bffLegalPage.breadcrumb != null) {
            dVar.mo24912i(fVar, 4, gVarArr[4], bffLegalPage.breadcrumb);
        }
        if (dVar.mo24897A(fVar, 5) || bffLegalPage.slug != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffLegalPage.slug);
        }
    }

    @C12580l
    public final String component1() {
        return this.templateId;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final List<BffB17EditoDto> component3() {
        return this.blocks;
    }

    @C12580l
    public final BffCmsMetaTags component4() {
        return this.metatags;
    }

    @C12580l
    public final List<BffCmsBreadcrumb> component5() {
        return this.breadcrumb;
    }

    @C12580l
    public final String component6() {
        return this.slug;
    }

    @C12579k
    public final BffLegalPage copy(@C12580l String str, @C12580l String str2, @C12580l List<BffB17EditoDto> list, @C12580l BffCmsMetaTags bffCmsMetaTags, @C12580l List<BffCmsBreadcrumb> list2, @C12580l String str3) {
        return new BffLegalPage(str, str2, list, bffCmsMetaTags, list2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffLegalPage)) {
            return false;
        }
        BffLegalPage bffLegalPage = (BffLegalPage) obj;
        return Intrinsics.areEqual((Object) this.templateId, (Object) bffLegalPage.templateId) && Intrinsics.areEqual((Object) this.title, (Object) bffLegalPage.title) && Intrinsics.areEqual((Object) this.blocks, (Object) bffLegalPage.blocks) && Intrinsics.areEqual((Object) this.metatags, (Object) bffLegalPage.metatags) && Intrinsics.areEqual((Object) this.breadcrumb, (Object) bffLegalPage.breadcrumb) && Intrinsics.areEqual((Object) this.slug, (Object) bffLegalPage.slug);
    }

    @C12580l
    public final List<BffB17EditoDto> getBlocks() {
        return this.blocks;
    }

    @C12580l
    public final List<BffCmsBreadcrumb> getBreadcrumb() {
        return this.breadcrumb;
    }

    @C12580l
    public final BffCmsMetaTags getMetatags() {
        return this.metatags;
    }

    @C12580l
    public final String getSlug() {
        return this.slug;
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
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BffB17EditoDto> list = this.blocks;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BffCmsMetaTags bffCmsMetaTags = this.metatags;
        int hashCode4 = (hashCode3 + (bffCmsMetaTags == null ? 0 : bffCmsMetaTags.hashCode())) * 31;
        List<BffCmsBreadcrumb> list2 = this.breadcrumb;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.slug;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    @C12579k
    public String toString() {
        String str = this.templateId;
        String str2 = this.title;
        List<BffB17EditoDto> list = this.blocks;
        BffCmsMetaTags bffCmsMetaTags = this.metatags;
        List<BffCmsBreadcrumb> list2 = this.breadcrumb;
        String str3 = this.slug;
        return "BffLegalPage(templateId=" + str + ", title=" + str2 + ", blocks=" + list + ", metatags=" + bffCmsMetaTags + ", breadcrumb=" + list2 + ", slug=" + str3 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffLegalPage(int i, @C12438n("template_id") String str, @C12438n("title") String str2, @C12438n("blocks") List list, @C12438n("metatags") BffCmsMetaTags bffCmsMetaTags, @C12438n("breadcrumb") List list2, @C12438n("slug") String str3, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffLegalPage$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.templateId = null;
        } else {
            this.templateId = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.blocks = null;
        } else {
            this.blocks = list;
        }
        if ((i & 8) == 0) {
            this.metatags = null;
        } else {
            this.metatags = bffCmsMetaTags;
        }
        if ((i & 16) == 0) {
            this.breadcrumb = null;
        } else {
            this.breadcrumb = list2;
        }
        if ((i & 32) == 0) {
            this.slug = null;
        } else {
            this.slug = str3;
        }
    }

    public BffLegalPage(@C12580l String str, @C12580l String str2, @C12580l List<BffB17EditoDto> list, @C12580l BffCmsMetaTags bffCmsMetaTags, @C12580l List<BffCmsBreadcrumb> list2, @C12580l String str3) {
        this.templateId = str;
        this.title = str2;
        this.blocks = list;
        this.metatags = bffCmsMetaTags;
        this.breadcrumb = list2;
        this.slug = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffLegalPage(java.lang.String r6, java.lang.String r7, java.util.List r8, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags r9, java.util.List r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPage.<init>(java.lang.String, java.lang.String, java.util.List, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCmsMetaTags, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
