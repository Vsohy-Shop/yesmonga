package com.carrefour.fid.android.product.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.C38112f;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.domain.models.product.Term;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProductUpdateFacetUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductUpdateFacetUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductUpdateFacetUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n800#2,11:107\n766#2:118\n857#2,2:119\n1549#2:121\n1620#2,2:122\n766#2:124\n857#2,2:125\n1549#2:127\n1620#2,3:128\n1622#2:131\n766#2:132\n857#2,2:133\n1549#2:135\n1620#2,3:136\n*S KotlinDebug\n*F\n+ 1 ProductUpdateFacetUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductUpdateFacetUseCase\n*L\n93#1:107,11\n93#1:118\n93#1:119,2\n93#1:121\n93#1:122,2\n96#1:124\n96#1:125,2\n96#1:127\n96#1:128,3\n93#1:131\n100#1:132\n100#1:133,2\n100#1:135\n100#1:136,3\n*E\n"})
public final class ProductUpdateFacetUseCase implements C37679f<C27546a, Pair<? extends Facet, ? extends C38104c>> {
    @C12579k

    /* renamed from: a */
    public final C37823k f66893a;
    @C12579k

    /* renamed from: b */
    public final C37857d f66894b;
    @C12579k

    /* renamed from: c */
    public final FacetRepository f66895c;
    @C12579k

    /* renamed from: d */
    public final C27567l f66896d;
    @C12579k

    /* renamed from: e */
    public final C38328d f66897e;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a */
    public static final class C27546a {

        /* renamed from: c */
        public static final int f66898c = 8;
        @C12579k

        /* renamed from: a */
        public final ProductListSource f66899a;
        @C12580l

        /* renamed from: b */
        public final C38104c f66900b;

        public C27546a(@C12579k ProductListSource productListSource, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(productListSource, "source");
            this.f66899a = productListSource;
            this.f66900b = cVar;
        }

        /* renamed from: d */
        public static /* synthetic */ C27546a m115917d(C27546a aVar, ProductListSource productListSource, C38104c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                productListSource = aVar.f66899a;
            }
            if ((i & 2) != 0) {
                cVar = aVar.f66900b;
            }
            return aVar.mo79999c(productListSource, cVar);
        }

        @C12579k
        /* renamed from: a */
        public final ProductListSource mo79997a() {
            return this.f66899a;
        }

        @C12580l
        /* renamed from: b */
        public final C38104c mo79998b() {
            return this.f66900b;
        }

        @C12579k
        /* renamed from: c */
        public final C27546a mo79999c(@C12579k ProductListSource productListSource, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(productListSource, "source");
            return new C27546a(productListSource, cVar);
        }

        @C12580l
        /* renamed from: e */
        public final C38104c mo80000e() {
            return this.f66900b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27546a)) {
                return false;
            }
            C27546a aVar = (C27546a) obj;
            return Intrinsics.areEqual((Object) this.f66899a, (Object) aVar.f66899a) && Intrinsics.areEqual((Object) this.f66900b, (Object) aVar.f66900b);
        }

        @C12579k
        /* renamed from: f */
        public final ProductListSource mo80002f() {
            return this.f66899a;
        }

        public int hashCode() {
            int hashCode = this.f66899a.hashCode() * 31;
            C38104c cVar = this.f66900b;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        @C12579k
        public String toString() {
            ProductListSource productListSource = this.f66899a;
            C38104c cVar = this.f66900b;
            return "Params(source=" + productListSource + ", facetSelection=" + cVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27546a(ProductListSource productListSource, C38104c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(productListSource, (i & 2) != 0 ? null : cVar);
        }
    }

    @Inject
    public ProductUpdateFacetUseCase(@C12579k C37823k kVar, @C12579k C37857d dVar, @C12579k FacetRepository facetRepository, @C12579k C27567l lVar, @C12579k C38328d dVar2) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(dVar, "getSlotSliceUseCase");
        Intrinsics.checkNotNullParameter(facetRepository, "facetRepository");
        Intrinsics.checkNotNullParameter(lVar, "getFacetFlowUseCase");
        Intrinsics.checkNotNullParameter(dVar2, "performance");
        this.f66893a = kVar;
        this.f66894b = dVar;
        this.f66895c = facetRepository;
        this.f66896d = lVar;
        this.f66897e = dVar2;
    }

    /* renamed from: a */
    public final C38104c mo79995a(Facet facet) {
        ArrayList arrayList = new ArrayList();
        for (Object next : facet.mo118343h()) {
            if (next instanceof Filter.CheckboxFilter) {
                arrayList.add(next);
            }
        }
        ArrayList<Filter.CheckboxFilter> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            if (((Filter.CheckboxFilter) next2).isSelected()) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(arrayList2, 10));
        for (Filter.CheckboxFilter checkboxFilter : arrayList2) {
            String Q3 = checkboxFilter.mo118356Q3();
            ArrayList<Term> arrayList4 = new ArrayList<>();
            for (Object next3 : checkboxFilter.mo118368i()) {
                if (((Term) next3).isSelected()) {
                    arrayList4.add(next3);
                }
            }
            ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(arrayList4, 10));
            for (Term e : arrayList4) {
                arrayList5.add(C38112f.m157657a(e.mo118626e()));
            }
            arrayList3.add(new C38105d(Q3, arrayList5, (DefaultConstructorMarker) null));
        }
        ArrayList<Sort> arrayList6 = new ArrayList<>();
        for (Object next4 : facet.mo118345i()) {
            if (((Sort) next4).isSelected()) {
                arrayList6.add(next4);
            }
        }
        ArrayList arrayList7 = new ArrayList(C10978t.m41495Y(arrayList6, 10));
        for (Sort f : arrayList6) {
            arrayList7.add(C38111e.m157649a(f.mo118611f()));
        }
        return new C38104c(arrayList3, arrayList7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r9 = r4;
        r4 = r11;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        if (kotlin.Result.m38709i(r12) == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b3, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        r12 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b6, code lost:
        if (r12 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        r11 = kotlin.Result.f28060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        return kotlin.Result.m38702b(kotlin.C11661u0.m45734a(new java.lang.IllegalStateException("No service selection")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ca, code lost:
        r3 = r1.f66894b;
        r7.L$0 = r1;
        r7.L$1 = r11;
        r7.L$2 = r12;
        r7.label = 2;
        r3 = r3.m172965invokeIoAF18A(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d9, code lost:
        if (r3 != r0) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        r4 = r1;
        r1 = r11;
        r11 = r12;
        r12 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        if (kotlin.Result.m38709i(r12) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e7, code lost:
        r12 = (java.lang.String) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e9, code lost:
        if (r12 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
        r12 = "1A";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ed, code lost:
        r3 = r4.f66896d;
        r7.L$0 = r4;
        r7.L$1 = r1;
        r7.L$2 = r11;
        r7.L$3 = r12;
        r7.label = 3;
        r3 = r3.mo80044a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        if (r3 != r0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0100, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        r9 = r1;
        r1 = r11;
        r11 = r12;
        r12 = r3;
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0106, code lost:
        r7.L$0 = r4;
        r7.L$1 = r3;
        r7.L$2 = r1;
        r7.L$3 = r11;
        r7.label = 4;
        r12 = kotlinx.coroutines.flow.C11909g.m47495u0((kotlinx.coroutines.flow.C11907e) r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0117, code lost:
        if (r12 != r0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011a, code lost:
        r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12;
        r5 = r3.mo80000e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0120, code lost:
        if (r5 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0122, code lost:
        r5 = r5.mo118662e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0126, code lost:
        if (r5 != null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0128, code lost:
        r5 = com.carrefour.fid.android.domain.models.product.C38103b.m157528a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012c, code lost:
        r6 = r3.mo80000e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0130, code lost:
        if (r6 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0132, code lost:
        r6 = r6.mo118664f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
        if (r6 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r6 = com.carrefour.fid.android.domain.models.product.C38103b.m157529b(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013d, code lost:
        r12 = com.carrefour.fid.android.product.presentation.viewmodel.list.C28206e.m118086b(r3.mo80002f(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0147, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Department) == false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0149, code lost:
        r1 = r11.f66895c;
        r8 = ((com.carrefour.fid.android.domain.models.product.ProductListParam.Department) r12).mo118481m();
        r12 = r12.mo118467a();
        r7.L$0 = r11;
        r7.L$1 = null;
        r7.L$2 = null;
        r7.L$3 = null;
        r7.label = 5;
        r12 = r1.mo80172c(r12, r4, r8, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0168, code lost:
        if (r12 != r0) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016d, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Gtins) == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016f, code lost:
        r1 = r11.f66895c;
        r12 = r12.mo118467a();
        r8 = new java.lang.String();
        r7.L$0 = r11;
        r7.L$1 = null;
        r7.L$2 = null;
        r7.L$3 = null;
        r7.label = 6;
        r12 = r1.mo80176i(r12, r4, r8, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018c, code lost:
        if (r12 != r0) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0191, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Promo) == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0193, code lost:
        r1 = r11.f66895c;
        r12 = r12.mo118467a();
        r7.L$0 = r11;
        r7.L$1 = null;
        r7.L$2 = null;
        r7.L$3 = null;
        r7.label = 7;
        r12 = r1.mo80175g(r12, r4, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ad, code lost:
        if (r12 != r0) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01af, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b2, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Query) == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b4, code lost:
        r1 = r11.f66895c;
        r3 = r12.mo118467a();
        r12 = ((com.carrefour.fid.android.domain.models.product.ProductListParam.Query) r12).mo118524f();
        r7.L$0 = r11;
        r7.L$1 = null;
        r7.L$2 = null;
        r7.L$3 = null;
        r7.label = 8;
        r12 = r1.mo80176i(r3, r4, r12, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d3, code lost:
        if (r12 != r0) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d5, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d8, code lost:
        if ((r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Search) == false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01da, code lost:
        r1 = r11.f66895c;
        r3 = r12.mo118467a();
        r12 = ((com.carrefour.fid.android.domain.models.product.ProductListParam.Search) r12).mo118541i();
        r7.L$0 = r11;
        r7.L$1 = null;
        r7.L$2 = null;
        r7.L$3 = null;
        r7.label = 9;
        r12 = r1.mo80177k(r3, r4, r12, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f9, code lost:
        if (r12 != r0) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fb, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0200, code lost:
        if (kotlin.Result.m38709i(r12) == false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0202, code lost:
        r11 = kotlin.Result.f28060a;
        r11 = kotlin.Result.m38705e(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0208, code lost:
        if (r11 != null) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020a, code lost:
        r11 = new java.lang.Throwable();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0217, code lost:
        return kotlin.Result.m38702b(kotlin.C11661u0.m45734a(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0218, code lost:
        r0 = com.carrefour.fid.android.domain.models.product.Facet.f96242f.mo118351a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0222, code lost:
        if (kotlin.Result.m38709i(r12) == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0224, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0225, code lost:
        r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12;
        r0 = new kotlin.Pair(r12, r11.mo79995a(r12));
        r11.f66897e.mo121196e();
        r11 = kotlin.Result.f28060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023b, code lost:
        return kotlin.Result.m38702b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0241, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172818invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase.C27546a r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.Pair<com.carrefour.fid.android.domain.models.product.Facet, com.carrefour.fid.android.domain.models.product.C38104c>>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$invoke$1
            r0.<init>(r10, r12)
        L_0x0018:
            r7 = r0
            java.lang.Object r12 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0092;
                case 1: goto L_0x0080;
                case 2: goto L_0x0069;
                case 3: goto L_0x0054;
                case 4: goto L_0x003c;
                case 5: goto L_0x002d;
                case 6: goto L_0x002d;
                case 7: goto L_0x002d;
                case 8: goto L_0x002d;
                case 9: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002d:
            java.lang.Object r11 = r7.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase r11 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase) r11
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x01fc
        L_0x003c:
            java.lang.Object r11 = r7.L$3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r7.L$2
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            java.lang.Object r3 = r7.L$1
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a r3 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase.C27546a) r3
            java.lang.Object r4 = r7.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase r4 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase) r4
            kotlin.C11661u0.m45747n(r12)
        L_0x004f:
            r9 = r4
            r4 = r11
            r11 = r9
            goto L_0x011a
        L_0x0054:
            java.lang.Object r11 = r7.L$3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r7.L$2
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            java.lang.Object r3 = r7.L$1
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a r3 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase.C27546a) r3
            java.lang.Object r4 = r7.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase r4 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase) r4
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0106
        L_0x0069:
            java.lang.Object r11 = r7.L$2
            com.carrefour.fid.android.domain.models.service.models.k r11 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r11
            java.lang.Object r1 = r7.L$1
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a r1 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase.C27546a) r1
            java.lang.Object r3 = r7.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase r3 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase) r3
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r4 = r3
            goto L_0x00e0
        L_0x0080:
            java.lang.Object r11 = r7.L$1
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a r11 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase.C27546a) r11
            java.lang.Object r1 = r7.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase r1 = (com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase) r1
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x00ad
        L_0x0092:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.performance.d r12 = r10.f66897e
            java.lang.String r1 = "update_product_facets"
            r12.mo121195d(r1)
            com.carrefour.fid.android.domain.interactors.service.k r12 = r10.f66893a
            r7.L$0 = r10
            r7.L$1 = r11
            r1 = 1
            r7.label = r1
            java.lang.Object r12 = r12.m172965invokeIoAF18A(r7)
            if (r12 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            r1 = r10
        L_0x00ad:
            boolean r3 = kotlin.Result.m38709i(r12)
            if (r3 == 0) goto L_0x00b4
            r12 = r2
        L_0x00b4:
            com.carrefour.fid.android.domain.models.service.models.k r12 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r12
            if (r12 != 0) goto L_0x00ca
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "No service selection"
            r11.<init>(r12)
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            return r11
        L_0x00ca:
            com.carrefour.fid.android.domain.interactors.slot.d r3 = r1.f66894b
            r7.L$0 = r1
            r7.L$1 = r11
            r7.L$2 = r12
            r4 = 2
            r7.label = r4
            java.lang.Object r3 = r3.m172965invokeIoAF18A(r7)
            if (r3 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            r4 = r1
            r1 = r11
            r11 = r12
            r12 = r3
        L_0x00e0:
            boolean r3 = kotlin.Result.m38709i(r12)
            if (r3 == 0) goto L_0x00e7
            r12 = r2
        L_0x00e7:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x00ed
            java.lang.String r12 = "1A"
        L_0x00ed:
            com.carrefour.fid.android.product.domain.interactors.l r3 = r4.f66896d
            r7.L$0 = r4
            r7.L$1 = r1
            r7.L$2 = r11
            r7.L$3 = r12
            r5 = 3
            r7.label = r5
            java.lang.Object r3 = r3.invoke(r7)
            if (r3 != r0) goto L_0x0101
            return r0
        L_0x0101:
            r9 = r1
            r1 = r11
            r11 = r12
            r12 = r3
            r3 = r9
        L_0x0106:
            kotlinx.coroutines.flow.e r12 = (kotlinx.coroutines.flow.C11907e) r12
            r7.L$0 = r4
            r7.L$1 = r3
            r7.L$2 = r1
            r7.L$3 = r11
            r5 = 4
            r7.label = r5
            java.lang.Object r12 = kotlinx.coroutines.flow.C11909g.m47495u0(r12, r7)
            if (r12 != r0) goto L_0x004f
            return r0
        L_0x011a:
            com.carrefour.fid.android.domain.models.product.Facet r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12
            com.carrefour.fid.android.domain.models.product.c r5 = r3.mo80000e()
            if (r5 == 0) goto L_0x0128
            java.util.List r5 = r5.mo118662e()
            if (r5 != 0) goto L_0x012c
        L_0x0128:
            java.util.List r5 = com.carrefour.fid.android.domain.models.product.C38103b.m157528a(r12)
        L_0x012c:
            com.carrefour.fid.android.domain.models.product.c r6 = r3.mo80000e()
            if (r6 == 0) goto L_0x0138
            java.util.List r6 = r6.mo118664f()
            if (r6 != 0) goto L_0x013d
        L_0x0138:
            java.util.List r12 = com.carrefour.fid.android.domain.models.product.C38103b.m157529b(r12)
            r6 = r12
        L_0x013d:
            com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource r12 = r3.mo80002f()
            com.carrefour.fid.android.domain.models.product.ProductListParam r12 = com.carrefour.fid.android.product.presentation.viewmodel.list.C28206e.m118086b(r12, r1)
            boolean r1 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Department
            if (r1 == 0) goto L_0x016b
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r1 = r11.f66895c
            r3 = r12
            com.carrefour.fid.android.domain.models.product.ProductListParam$Department r3 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Department) r3
            java.util.List r8 = r3.mo118481m()
            java.lang.String r12 = r12.mo118467a()
            r7.L$0 = r11
            r7.L$1 = r2
            r7.L$2 = r2
            r7.L$3 = r2
            r2 = 5
            r7.label = r2
            r2 = r12
            r3 = r4
            r4 = r8
            java.lang.Object r12 = r1.mo80172c(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L_0x01fc
            return r0
        L_0x016b:
            boolean r1 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Gtins
            if (r1 == 0) goto L_0x018f
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r1 = r11.f66895c
            java.lang.String r12 = r12.mo118467a()
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            r7.L$0 = r11
            r7.L$1 = r2
            r7.L$2 = r2
            r7.L$3 = r2
            r2 = 6
            r7.label = r2
            r2 = r12
            r3 = r4
            r4 = r8
            java.lang.Object r12 = r1.mo80176i(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L_0x01fc
            return r0
        L_0x018f:
            boolean r1 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Promo
            if (r1 == 0) goto L_0x01b0
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r1 = r11.f66895c
            java.lang.String r12 = r12.mo118467a()
            r7.L$0 = r11
            r7.L$1 = r2
            r7.L$2 = r2
            r7.L$3 = r2
            r2 = 7
            r7.label = r2
            r2 = r12
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            java.lang.Object r12 = r1.mo80175g(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L_0x01fc
            return r0
        L_0x01b0:
            boolean r1 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Query
            if (r1 == 0) goto L_0x01d6
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r1 = r11.f66895c
            java.lang.String r3 = r12.mo118467a()
            com.carrefour.fid.android.domain.models.product.ProductListParam$Query r12 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Query) r12
            java.lang.String r12 = r12.mo118524f()
            r7.L$0 = r11
            r7.L$1 = r2
            r7.L$2 = r2
            r7.L$3 = r2
            r2 = 8
            r7.label = r2
            r2 = r3
            r3 = r4
            r4 = r12
            java.lang.Object r12 = r1.mo80176i(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L_0x01fc
            return r0
        L_0x01d6:
            boolean r1 = r12 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Search
            if (r1 == 0) goto L_0x023c
            com.carrefour.fid.android.product.domain.repositories.FacetRepository r1 = r11.f66895c
            java.lang.String r3 = r12.mo118467a()
            com.carrefour.fid.android.domain.models.product.ProductListParam$Search r12 = (com.carrefour.fid.android.domain.models.product.ProductListParam.Search) r12
            java.lang.String r12 = r12.mo118541i()
            r7.L$0 = r11
            r7.L$1 = r2
            r7.L$2 = r2
            r7.L$3 = r2
            r2 = 9
            r7.label = r2
            r2 = r3
            r3 = r4
            r4 = r12
            java.lang.Object r12 = r1.mo80177k(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L_0x01fc
            return r0
        L_0x01fc:
            boolean r0 = kotlin.Result.m38709i(r12)
            if (r0 == 0) goto L_0x0218
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Throwable r11 = kotlin.Result.m38705e(r12)
            if (r11 != 0) goto L_0x020f
            java.lang.Throwable r11 = new java.lang.Throwable
            r11.<init>()
        L_0x020f:
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            return r11
        L_0x0218:
            com.carrefour.fid.android.domain.models.product.Facet$a r0 = com.carrefour.fid.android.domain.models.product.Facet.f96242f
            com.carrefour.fid.android.domain.models.product.Facet r0 = r0.mo118351a()
            boolean r1 = kotlin.Result.m38709i(r12)
            if (r1 == 0) goto L_0x0225
            r12 = r0
        L_0x0225:
            com.carrefour.fid.android.domain.models.product.Facet r12 = (com.carrefour.fid.android.domain.models.product.Facet) r12
            kotlin.Pair r0 = new kotlin.Pair
            com.carrefour.fid.android.domain.models.product.c r1 = r11.mo79995a(r12)
            r0.<init>(r12, r1)
            com.carrefour.fid.android.performance.d r11 = r11.f66897e
            r11.mo121196e()
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.Result.m38702b(r0)
            return r11
        L_0x023c:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase.m172818invokegIAlus(com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
