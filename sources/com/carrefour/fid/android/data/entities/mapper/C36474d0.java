package com.carrefour.fid.android.data.entities.mapper;

import android.graphics.Color;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.AdServingCriteoResponse;
import com.carrefour.fid.android.data.entities.CriteoFormatRendering;
import com.carrefour.fid.android.data.entities.CriteoPlacement;
import com.carrefour.fid.android.data.entities.CriteoProduct;
import com.carrefour.fid.android.data.entities.CriteoProductOrder;
import com.carrefour.fid.android.data.entities.CriteoViewCategory;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.domain.models.criteo.C38000b;
import com.carrefour.fid.android.domain.models.criteo.C38002d;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.criteo.C38013o;
import com.carrefour.fid.android.domain.models.criteo.C38014p;
import com.carrefour.fid.android.domain.models.criteo.CriteoPageType;
import com.carrefour.fid.android.domain.models.criteo.OptionalFooterType;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.constant.C28607x;
import com.google.firebase.crashlytics.C32648f;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCriteoProductsApiMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoProductsApiMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/CriteoProductsApiMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,277:1\n1549#2:278\n1620#2,3:279\n1855#2:282\n1549#2:283\n1620#2,3:284\n1856#2:287\n766#2:288\n857#2,2:289\n1855#2:291\n1549#2:292\n1620#2,2:293\n1622#2:296\n1856#2:297\n1855#2,2:298\n766#2:300\n857#2,2:301\n1549#2:303\n1620#2,3:304\n1603#2,9:307\n1855#2:316\n1856#2:318\n1612#2:319\n1855#2,2:320\n1#3:295\n1#3:317\n*S KotlinDebug\n*F\n+ 1 CriteoProductsApiMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/CriteoProductsApiMapper\n*L\n45#1:278\n45#1:279,3\n61#1:282\n63#1:283\n63#1:284,3\n61#1:287\n68#1:288\n68#1:289,2\n73#1:291\n75#1:292\n75#1:293,2\n75#1:296\n73#1:297\n100#1:298,2\n135#1:300\n135#1:301,2\n141#1:303\n141#1:304,3\n160#1:307,9\n160#1:316\n160#1:318\n160#1:319\n209#1:320,2\n160#1:317\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.d0 */
public final class C36474d0 extends C28486g<C36475a, C38014p> {

    /* renamed from: b */
    public static final int f90165b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.d0$a */
    public static final class C36475a {

        /* renamed from: c */
        public static final int f90166c = 8;
        @C12579k

        /* renamed from: a */
        public final AdServingCriteoResponse f90167a;
        @C12579k

        /* renamed from: b */
        public final CriteoPageType f90168b;

        public C36475a(@C12579k AdServingCriteoResponse adServingCriteoResponse, @C12579k CriteoPageType criteoPageType) {
            Intrinsics.checkNotNullParameter(adServingCriteoResponse, "entity");
            Intrinsics.checkNotNullParameter(criteoPageType, "pageType");
            this.f90167a = adServingCriteoResponse;
            this.f90168b = criteoPageType;
        }

        /* renamed from: d */
        public static /* synthetic */ C36475a m149628d(C36475a aVar, AdServingCriteoResponse adServingCriteoResponse, CriteoPageType criteoPageType, int i, Object obj) {
            if ((i & 1) != 0) {
                adServingCriteoResponse = aVar.f90167a;
            }
            if ((i & 2) != 0) {
                criteoPageType = aVar.f90168b;
            }
            return aVar.mo111252c(adServingCriteoResponse, criteoPageType);
        }

        @C12579k
        /* renamed from: a */
        public final AdServingCriteoResponse mo111250a() {
            return this.f90167a;
        }

        @C12579k
        /* renamed from: b */
        public final CriteoPageType mo111251b() {
            return this.f90168b;
        }

        @C12579k
        /* renamed from: c */
        public final C36475a mo111252c(@C12579k AdServingCriteoResponse adServingCriteoResponse, @C12579k CriteoPageType criteoPageType) {
            Intrinsics.checkNotNullParameter(adServingCriteoResponse, "entity");
            Intrinsics.checkNotNullParameter(criteoPageType, "pageType");
            return new C36475a(adServingCriteoResponse, criteoPageType);
        }

        @C12579k
        /* renamed from: e */
        public final AdServingCriteoResponse mo111253e() {
            return this.f90167a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36475a)) {
                return false;
            }
            C36475a aVar = (C36475a) obj;
            return Intrinsics.areEqual((Object) this.f90167a, (Object) aVar.f90167a) && this.f90168b == aVar.f90168b;
        }

        @C12579k
        /* renamed from: f */
        public final CriteoPageType mo111255f() {
            return this.f90168b;
        }

        public int hashCode() {
            return (this.f90167a.hashCode() * 31) + this.f90168b.hashCode();
        }

        @C12579k
        public String toString() {
            AdServingCriteoResponse adServingCriteoResponse = this.f90167a;
            CriteoPageType criteoPageType = this.f90168b;
            return "Params(entity=" + adServingCriteoResponse + ", pageType=" + criteoPageType + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.data.entities.mapper.d0$b */
    public /* synthetic */ class C36476b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType[] r0 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r1 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_CATEGORY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r1 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_SEARCH_RESULT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r1 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_ITEM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r1 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_BASKET     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r1 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_STORE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r1 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_CATALOGUE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r1 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_INSIDE_CATALOGUE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r1 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_HOME     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.C36474d0.C36476b.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.carrefour.fid.android.data.entities.CriteoViewCategory> mo111233d(com.carrefour.fid.android.data.entities.CriteoPlacement r8, com.carrefour.fid.android.domain.models.criteo.CriteoPageType r9) {
        /*
            r7 = this;
            int[] r0 = com.carrefour.fid.android.data.entities.mapper.C36474d0.C36476b.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r0[r9]
            r0 = 5
            r1 = 0
            r2 = 2
            r3 = 0
            if (r9 == r0) goto L_0x00d0
            r0 = 6
            java.lang.String r4 = "ST"
            if (r9 == r0) goto L_0x00a5
            r0 = 7
            if (r9 == r0) goto L_0x007a
            r0 = 8
            if (r9 == r0) goto L_0x001c
            goto L_0x00fc
        L_0x001c:
            com.carrefour.fid.android.data.entities.CriteoViewCategory[] r9 = new com.carrefour.fid.android.data.entities.CriteoViewCategory[r2]
            java.util.List r0 = r8.getHomePlacement()
            java.lang.String r4 = "custom_minibanner"
            if (r0 == 0) goto L_0x0048
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r0.next()
            r6 = r5
            com.carrefour.fid.android.data.entities.CriteoViewCategory r6 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r6
            java.lang.String r6 = r6.getFormat()
            boolean r6 = kotlin.text.C11622t.equals$default(r6, r4, r1, r2, r3)
            if (r6 == 0) goto L_0x002c
            goto L_0x0045
        L_0x0044:
            r5 = r3
        L_0x0045:
            com.carrefour.fid.android.data.entities.CriteoViewCategory r5 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r5
            goto L_0x0049
        L_0x0048:
            r5 = r3
        L_0x0049:
            r9[r1] = r5
            java.util.List r8 = r8.getSecondHomePlacement()
            if (r8 == 0) goto L_0x0071
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0057:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r8.next()
            r5 = r0
            com.carrefour.fid.android.data.entities.CriteoViewCategory r5 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r5
            java.lang.String r5 = r5.getFormat()
            boolean r5 = kotlin.text.C11622t.equals$default(r5, r4, r1, r2, r3)
            if (r5 == 0) goto L_0x0057
            r3 = r0
        L_0x006f:
            com.carrefour.fid.android.data.entities.CriteoViewCategory r3 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r3
        L_0x0071:
            r8 = 1
            r9[r8] = r3
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40450N(r9)
            goto L_0x00fc
        L_0x007a:
            java.util.List r8 = r8.getInsideCatalogPlacement()
            if (r8 == 0) goto L_0x00a0
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0086:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x009e
            java.lang.Object r9 = r8.next()
            r0 = r9
            com.carrefour.fid.android.data.entities.CriteoViewCategory r0 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r0
            java.lang.String r0 = r0.getFormat()
            boolean r0 = kotlin.text.C11622t.equals$default(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L_0x0086
            r3 = r9
        L_0x009e:
            com.carrefour.fid.android.data.entities.CriteoViewCategory r3 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r3
        L_0x00a0:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40449M(r3)
            goto L_0x00fc
        L_0x00a5:
            java.util.List r8 = r8.getCatalogPlacement()
            if (r8 == 0) goto L_0x00cb
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00b1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c9
            java.lang.Object r9 = r8.next()
            r0 = r9
            com.carrefour.fid.android.data.entities.CriteoViewCategory r0 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r0
            java.lang.String r0 = r0.getFormat()
            boolean r0 = kotlin.text.C11622t.equals$default(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L_0x00b1
            r3 = r9
        L_0x00c9:
            com.carrefour.fid.android.data.entities.CriteoViewCategory r3 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r3
        L_0x00cb:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40449M(r3)
            goto L_0x00fc
        L_0x00d0:
            java.util.List r8 = r8.getStorePlacement()
            if (r8 == 0) goto L_0x00f8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00dc:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00f6
            java.lang.Object r9 = r8.next()
            r0 = r9
            com.carrefour.fid.android.data.entities.CriteoViewCategory r0 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r0
            java.lang.String r0 = r0.getFormat()
            java.lang.String r4 = "iab_medium_rectangle"
            boolean r0 = kotlin.text.C11622t.equals$default(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L_0x00dc
            r3 = r9
        L_0x00f6:
            com.carrefour.fid.android.data.entities.CriteoViewCategory r3 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r3
        L_0x00f8:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40449M(r3)
        L_0x00fc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.C36474d0.mo111233d(com.carrefour.fid.android.data.entities.CriteoPlacement, com.carrefour.fid.android.domain.models.criteo.CriteoPageType):java.util.List");
    }

    /* renamed from: e */
    public final List<C37999a> mo111234e(C36475a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String mobileBackgroundImage;
        String backgroundImage;
        ArrayList arrayList = new ArrayList();
        List<CriteoPlacement> placements = aVar.mo111253e().getPlacements();
        if (placements != null) {
            for (CriteoPlacement d : placements) {
                List<CriteoViewCategory> d2 = mo111233d(d, aVar.mo111255f());
                List list = null;
                if (d2 != null) {
                    Iterable<CriteoViewCategory> iterable = d2;
                    ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
                    for (CriteoViewCategory criteoViewCategory : iterable) {
                        CriteoFormatRendering rendering = criteoViewCategory.getRendering();
                        if (rendering == null || (backgroundImage = rendering.getBackgroundImage()) == null) {
                            str = null;
                        } else {
                            str = C28607x.f70006z + backgroundImage;
                        }
                        CriteoFormatRendering rendering2 = criteoViewCategory.getRendering();
                        if (rendering2 == null || (mobileBackgroundImage = rendering2.getMobileBackgroundImage()) == null) {
                            str2 = null;
                        } else {
                            str2 = C28607x.f70006z + mobileBackgroundImage;
                        }
                        CriteoFormatRendering rendering3 = criteoViewCategory.getRendering();
                        if (rendering3 != null) {
                            str3 = rendering3.getHeaderText();
                        } else {
                            str3 = null;
                        }
                        CriteoFormatRendering rendering4 = criteoViewCategory.getRendering();
                        if (rendering4 != null) {
                            str4 = rendering4.getRedirectUrl();
                        } else {
                            str4 = null;
                        }
                        arrayList2.add(new C37999a(str, str2, str3, str4, criteoViewCategory.getOnLoadBeacon(), criteoViewCategory.getOnViewBeacon(), criteoViewCategory.getOnClickBeacon()));
                    }
                    list = arrayList2;
                }
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.m40441E();
                }
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<C38000b> mo111235f(C36475a aVar) {
        List list;
        ArrayList arrayList = new ArrayList();
        List<CriteoPlacement> placements = aVar.mo111253e().getPlacements();
        if (placements != null) {
            for (CriteoPlacement g : placements) {
                List<CriteoViewCategory> g2 = mo111236g(g, aVar.mo111255f());
                if (g2 != null) {
                    Iterable<CriteoViewCategory> iterable = g2;
                    list = new ArrayList(C10978t.m41495Y(iterable, 10));
                    for (CriteoViewCategory h : iterable) {
                        list.add(mo111237h(h));
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.m40441E();
                }
                arrayList.addAll(list);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (!((C38000b) next).mo117385a().isEmpty()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* renamed from: g */
    public final List<CriteoViewCategory> mo111236g(CriteoPlacement criteoPlacement, CriteoPageType criteoPageType) {
        List list;
        List a0;
        List<CriteoViewCategory> list2;
        List<CriteoViewCategory> list3;
        List<CriteoViewCategory> list4;
        List<CriteoViewCategory> list5;
        int i = C36476b.$EnumSwitchMapping$0[criteoPageType.ordinal()];
        ArrayList arrayList = null;
        if (i == 1) {
            List[] listArr = new List[2];
            if (criteoPlacement != null) {
                list2 = criteoPlacement.getCategoryButterflyPlacement();
            } else {
                list2 = null;
            }
            listArr[0] = list2;
            if (criteoPlacement != null) {
                list3 = criteoPlacement.getCategorySecondButterflyPlacement();
            } else {
                list3 = null;
            }
            listArr[1] = list3;
            list = CollectionsKt__CollectionsKt.m40450N(listArr);
        } else if (i != 2) {
            list = null;
        } else {
            List[] listArr2 = new List[2];
            if (criteoPlacement != null) {
                list4 = criteoPlacement.getSearchResultButterflyPlacement();
            } else {
                list4 = null;
            }
            listArr2[0] = list4;
            if (criteoPlacement != null) {
                list5 = criteoPlacement.getSearchResultSecondButterflyPlacement();
            } else {
                list5 = null;
            }
            listArr2[1] = list5;
            list = CollectionsKt__CollectionsKt.m40450N(listArr2);
        }
        if (!(list == null || (a0 = C10978t.m41497a0(list)) == null)) {
            arrayList = new ArrayList();
            for (Object next : a0) {
                if (Intrinsics.areEqual((Object) ((CriteoViewCategory) next).getFormat(), (Object) C28607x.f69998r)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C38000b mo111237h(CriteoViewCategory criteoViewCategory) {
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<CriteoProductOrder> productsOrder = criteoViewCategory.getProductsOrder();
        com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering criteoFormatRendering = null;
        if (productsOrder != null) {
            list = CollectionsKt___CollectionsKt.m40497E5(productsOrder, 4);
        } else {
            list = null;
        }
        List<C38012n> j = mo111239j(list, criteoViewCategory, false);
        if (list != null) {
            Iterable<CriteoProductOrder> iterable = list;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (CriteoProductOrder buttonName : iterable) {
                String buttonName2 = buttonName.getButtonName();
                if (buttonName2 == null) {
                    buttonName2 = "";
                }
                arrayList.add(buttonName2);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList2 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            arrayList2 = arrayList;
        }
        List E = CollectionsKt__CollectionsKt.m40441E();
        CriteoFormatRendering rendering = criteoViewCategory.getRendering();
        if (rendering != null) {
            criteoFormatRendering = mo111248s(rendering);
        }
        return new C38000b(j, E, criteoViewCategory.getOnViewBeacon(), criteoViewCategory.getOnLoadBeacon(), arrayList2, criteoFormatRendering, criteoViewCategory.getOnClickBeacon(), criteoViewCategory.getOnFileClickBeacon());
    }

    /* renamed from: i */
    public final C38002d mo111238i(CriteoViewCategory criteoViewCategory) {
        List<CriteoProductOrder> list;
        com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering criteoFormatRendering;
        String str;
        String str2;
        String str3;
        CriteoFormatRendering rendering;
        String str4 = null;
        if (criteoViewCategory != null) {
            list = criteoViewCategory.getProductsOrder();
        } else {
            list = null;
        }
        List<C38012n> j = mo111239j(list, criteoViewCategory, true);
        if (!(!j.isEmpty())) {
            return null;
        }
        List E = CollectionsKt__CollectionsKt.m40441E();
        if (criteoViewCategory == null || (rendering = criteoViewCategory.getRendering()) == null) {
            criteoFormatRendering = null;
        } else {
            criteoFormatRendering = mo111248s(rendering);
        }
        if (criteoViewCategory != null) {
            str = criteoViewCategory.getOnLoadBeacon();
        } else {
            str = null;
        }
        if (criteoViewCategory != null) {
            str2 = criteoViewCategory.getOnViewBeacon();
        } else {
            str2 = null;
        }
        if (criteoViewCategory != null) {
            str3 = criteoViewCategory.getOnClickBeacon();
        } else {
            str3 = null;
        }
        if (criteoViewCategory != null) {
            str4 = criteoViewCategory.getOnFileClickBeacon();
        }
        return new C38002d(j, E, str, str2, criteoFormatRendering, str3, str4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x000f A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.carrefour.fid.android.domain.models.criteo.C38012n> mo111239j(java.util.List<com.carrefour.fid.android.data.entities.CriteoProductOrder> r15, com.carrefour.fid.android.data.entities.CriteoViewCategory r16, boolean r17) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L_0x0085
            r1 = r15
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x000f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r1.next()
            com.carrefour.fid.android.data.entities.CriteoProductOrder r3 = (com.carrefour.fid.android.data.entities.CriteoProductOrder) r3
            if (r16 == 0) goto L_0x007d
            java.util.List r4 = r16.getProducts()
            if (r4 == 0) goto L_0x007d
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0029:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.carrefour.fid.android.data.entities.CriteoProduct r6 = (com.carrefour.fid.android.data.entities.CriteoProduct) r6
            java.lang.String r6 = r6.getProductId()
            java.util.List r7 = r3.getProducts()
            if (r7 == 0) goto L_0x0047
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0048
        L_0x0047:
            r7 = r0
        L_0x0048:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0029
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            com.carrefour.fid.android.data.entities.CriteoProduct r5 = (com.carrefour.fid.android.data.entities.CriteoProduct) r5
            if (r5 == 0) goto L_0x007d
            com.carrefour.fid.android.domain.models.criteo.n r3 = new com.carrefour.fid.android.domain.models.criteo.n
            java.lang.String r4 = r5.getProductId()
            if (r4 != 0) goto L_0x0061
            java.lang.String r4 = new java.lang.String
            r4.<init>()
        L_0x0061:
            r7 = r4
            java.lang.String r9 = r5.getOnLoadBeacon()
            java.lang.String r10 = r5.getOnViewBeacon()
            java.lang.String r11 = r5.getOnClickBeacon()
            java.lang.String r12 = r5.getOnBasketChangeBeacon()
            java.lang.String r13 = r5.getOnWishListBeacon()
            r6 = r3
            r8 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x007e
        L_0x007d:
            r3 = r0
        L_0x007e:
            if (r3 == 0) goto L_0x000f
            r2.add(r3)
            goto L_0x000f
        L_0x0084:
            r0 = r2
        L_0x0085:
            if (r0 != 0) goto L_0x008b
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x008b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.C36474d0.mo111239j(java.util.List, com.carrefour.fid.android.data.entities.CriteoViewCategory, boolean):java.util.List");
    }

    /* renamed from: k */
    public final C38002d mo111240k(C36475a aVar) {
        return mo111238i(mo111242m(aVar.mo111253e().getPlacements(), aVar.mo111255f()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.data.entities.CriteoViewCategory mo111241l(com.carrefour.fid.android.data.entities.CriteoPlacement r4, com.carrefour.fid.android.domain.models.criteo.CriteoPageType r5) {
        /*
            r3 = this;
            int[] r0 = com.carrefour.fid.android.data.entities.mapper.C36474d0.C36476b.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            r1 = 0
            if (r5 == r0) goto L_0x0018
            r0 = 2
            if (r5 == r0) goto L_0x0011
        L_0x000f:
            r4 = r1
            goto L_0x001e
        L_0x0011:
            if (r4 == 0) goto L_0x000f
            java.util.List r4 = r4.getSearchResultFlagshipPlacement()
            goto L_0x001e
        L_0x0018:
            if (r4 == 0) goto L_0x000f
            java.util.List r4 = r4.getCategoryFlagshipPlacement()
        L_0x001e:
            if (r4 == 0) goto L_0x0042
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0026:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0040
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.carrefour.fid.android.data.entities.CriteoViewCategory r0 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r0
            java.lang.String r0 = r0.getFormat()
            java.lang.String r2 = "FS"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0026
            r1 = r5
        L_0x0040:
            com.carrefour.fid.android.data.entities.CriteoViewCategory r1 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r1
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.C36474d0.mo111241l(com.carrefour.fid.android.data.entities.CriteoPlacement, com.carrefour.fid.android.domain.models.criteo.CriteoPageType):com.carrefour.fid.android.data.entities.CriteoViewCategory");
    }

    /* renamed from: m */
    public final CriteoViewCategory mo111242m(List<CriteoPlacement> list, CriteoPageType criteoPageType) {
        if (list == null) {
            return null;
        }
        for (CriteoPlacement l : list) {
            CriteoViewCategory l2 = mo111241l(l, criteoPageType);
            if (l2 != null) {
                return l2;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final OptionalFooterType mo111243n(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) C28607x.f69979C)) {
            return OptionalFooterType.REDIRECTION;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "file")) {
            return OptionalFooterType.FILE;
        }
        return OptionalFooterType.NONE;
    }

    /* renamed from: o */
    public final String mo111244o(CriteoFormatRendering criteoFormatRendering) {
        String optionalFooterMediaFile;
        String optionalFooterType = criteoFormatRendering.getOptionalFooterType();
        if (Intrinsics.areEqual((Object) optionalFooterType, (Object) C28607x.f69979C)) {
            return criteoFormatRendering.getOptionalFooterRedirectUrl();
        }
        if (!Intrinsics.areEqual((Object) optionalFooterType, (Object) "file") || (optionalFooterMediaFile = criteoFormatRendering.getOptionalFooterMediaFile()) == null) {
            return null;
        }
        return C28607x.f70006z + optionalFooterMediaFile;
    }

    /* renamed from: p */
    public final C38013o mo111245p(C36475a aVar) {
        List list;
        String str;
        List<CriteoProduct> products;
        CriteoViewCategory q = mo111246q(aVar.mo111253e().getPlacements(), aVar.mo111255f());
        String str2 = null;
        if (q == null || (products = q.getProducts()) == null) {
            list = null;
        } else {
            Iterable<CriteoProduct> iterable = products;
            list = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (CriteoProduct criteoProduct : iterable) {
                String productId = criteoProduct.getProductId();
                if (productId == null) {
                    productId = new String();
                }
                list.add(new C38012n(productId, true, criteoProduct.getOnLoadBeacon(), criteoProduct.getOnViewBeacon(), criteoProduct.getOnClickBeacon(), criteoProduct.getOnBasketChangeBeacon(), criteoProduct.getOnWishListBeacon()));
            }
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List E = CollectionsKt__CollectionsKt.m40441E();
        if (q != null) {
            str = q.getOnLoadBeacon();
        } else {
            str = null;
        }
        if (q != null) {
            str2 = q.getOnViewBeacon();
        }
        return new C38013o(list, E, str, str2);
    }

    /* renamed from: q */
    public final CriteoViewCategory mo111246q(List<CriteoPlacement> list, CriteoPageType criteoPageType) {
        if (list == null) {
            return null;
        }
        for (CriteoPlacement r : list) {
            CriteoViewCategory r2 = mo111247r(r, criteoPageType);
            if (r2 != null) {
                return r2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.carrefour.fid.android.data.entities.CriteoViewCategory} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.data.entities.CriteoViewCategory mo111247r(com.carrefour.fid.android.data.entities.CriteoPlacement r4, com.carrefour.fid.android.domain.models.criteo.CriteoPageType r5) {
        /*
            r3 = this;
            int[] r0 = com.carrefour.fid.android.data.entities.mapper.C36474d0.C36476b.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            r1 = 0
            if (r5 == r0) goto L_0x002c
            r0 = 2
            if (r5 == r0) goto L_0x0025
            r0 = 3
            if (r5 == r0) goto L_0x001e
            r0 = 4
            if (r5 == r0) goto L_0x0017
        L_0x0015:
            r4 = r1
            goto L_0x0032
        L_0x0017:
            if (r4 == 0) goto L_0x0015
            java.util.List r4 = r4.getBasketPlacement()
            goto L_0x0032
        L_0x001e:
            if (r4 == 0) goto L_0x0015
            java.util.List r4 = r4.getItemPlacement()
            goto L_0x0032
        L_0x0025:
            if (r4 == 0) goto L_0x0015
            java.util.List r4 = r4.getSearchResultPlacement()
            goto L_0x0032
        L_0x002c:
            if (r4 == 0) goto L_0x0015
            java.util.List r4 = r4.getCategoryPlacement()
        L_0x0032:
            if (r4 == 0) goto L_0x0056
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x003a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0054
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.carrefour.fid.android.data.entities.CriteoViewCategory r0 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r0
            java.lang.String r0 = r0.getFormat()
            java.lang.String r2 = "sponsored_products"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x003a
            r1 = r5
        L_0x0054:
            com.carrefour.fid.android.data.entities.CriteoViewCategory r1 = (com.carrefour.fid.android.data.entities.CriteoViewCategory) r1
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.C36474d0.mo111247r(com.carrefour.fid.android.data.entities.CriteoPlacement, com.carrefour.fid.android.domain.models.criteo.CriteoPageType):com.carrefour.fid.android.data.entities.CriteoViewCategory");
    }

    /* renamed from: s */
    public final com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering mo111248s(CriteoFormatRendering criteoFormatRendering) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        String logoImage = criteoFormatRendering.getLogoImage();
        Integer num6 = null;
        if (logoImage != null) {
            str = C28607x.f70006z + logoImage;
        } else {
            str = null;
        }
        String mobileBackgroundImage = criteoFormatRendering.getMobileBackgroundImage();
        if (mobileBackgroundImage != null) {
            str2 = C28607x.f70006z + mobileBackgroundImage;
        } else {
            str2 = null;
        }
        String backgroundColor = criteoFormatRendering.getBackgroundColor();
        if (backgroundColor != null) {
            num = Integer.valueOf(Color.parseColor(backgroundColor));
        } else {
            num = null;
        }
        String borderColor = criteoFormatRendering.getBorderColor();
        if (borderColor != null) {
            num2 = Integer.valueOf(Color.parseColor(borderColor));
        } else {
            num2 = null;
        }
        String buttonColor = criteoFormatRendering.getButtonColor();
        if (buttonColor != null) {
            num3 = Integer.valueOf(Color.parseColor(buttonColor));
        } else {
            num3 = null;
        }
        String selectedButtonColor = criteoFormatRendering.getSelectedButtonColor();
        if (selectedButtonColor != null) {
            num4 = Integer.valueOf(Color.parseColor(selectedButtonColor));
        } else {
            num4 = null;
        }
        String buttonTextColor = criteoFormatRendering.getButtonTextColor();
        if (buttonTextColor != null) {
            num5 = Integer.valueOf(Color.parseColor(buttonTextColor));
        } else {
            num5 = null;
        }
        String selectedButtonTextColor = criteoFormatRendering.getSelectedButtonTextColor();
        if (selectedButtonTextColor != null) {
            num6 = Integer.valueOf(Color.parseColor(selectedButtonTextColor));
        }
        return new com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering(str, str2, num, num2, num3, num4, num5, num6, mo111243n(criteoFormatRendering.getOptionalFooterType()), mo111244o(criteoFormatRendering));
    }

    @C12579k
    /* renamed from: t */
    public C38014p mo72340a(@C12579k C36475a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C32648f.f79206e);
        return new C38014p(mo111245p(aVar), mo111235f(aVar), mo111234e(aVar), mo111240k(aVar));
    }
}
