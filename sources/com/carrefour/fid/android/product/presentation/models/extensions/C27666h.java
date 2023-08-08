package com.carrefour.fid.android.product.presentation.models.extensions;

import com.carrefour.fid.android.design.components.widgets.NutriscoreComponent;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.models.Advice;
import com.carrefour.fid.android.product.presentation.models.ProductAdviceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.h */
public final class C27666h {

    /* renamed from: com.carrefour.fid.android.product.presentation.models.extensions.h$a */
    public /* synthetic */ class C27667a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore[] r0 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.A     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.B     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.C     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.D     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.E     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.models.extensions.C27666h.C27667a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final List<Advice> m116402a(@C12579k Product product) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(product, "<this>");
        ArrayList arrayList = new ArrayList();
        String d0 = product.mo118433d0();
        boolean z4 = false;
        if (d0 == null || C11622t.isBlank(d0)) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (!z) {
            ProductAdviceType productAdviceType = ProductAdviceType.WARNING_ADVICES;
            String d02 = product.mo118433d0();
            if (d02 == null) {
                d02 = str;
            }
            arrayList.add(new Advice(productAdviceType, d02));
        }
        String b0 = product.mo118429b0();
        if (b0 == null || C11622t.isBlank(b0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ProductAdviceType productAdviceType2 = ProductAdviceType.STORAGE_MODE;
            String b02 = product.mo118429b0();
            if (b02 == null) {
                b02 = str;
            }
            arrayList.add(new Advice(productAdviceType2, b02));
        }
        String J = product.mo118409J();
        if (J == null || C11622t.isBlank(J)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            ProductAdviceType productAdviceType3 = ProductAdviceType.CONSUMER_ADVICE;
            String J2 = product.mo118409J();
            if (J2 == null) {
                J2 = str;
            }
            arrayList.add(new Advice(productAdviceType3, J2));
        }
        String a0 = product.mo118427a0();
        if (a0 == null || C11622t.isBlank(a0)) {
            z4 = true;
        }
        if (!z4) {
            ProductAdviceType productAdviceType4 = ProductAdviceType.SERVICE_CENTER_CONTACT;
            String a02 = product.mo118427a0();
            if (a02 != null) {
                str = a02;
            }
            arrayList.add(new Advice(productAdviceType4, str));
        }
        return arrayList;
    }

    @C12580l
    /* renamed from: b */
    public static final NutriscoreComponent.C37157a m116403b(@C12579k Product product, boolean z, @C12580l NutriscoreComponent.Size size) {
        int i;
        Intrinsics.checkNotNullParameter(product, "<this>");
        ProductNutriScore T = product.mo118419T();
        if (T == null) {
            return null;
        }
        int i2 = C27667a.$EnumSwitchMapping$0[T.ordinal()];
        if (i2 == 1) {
            i = C27609f.C27617h.ds_pa_nutriscorea;
        } else if (i2 == 2) {
            i = C27609f.C27617h.ds_pa_nutriscoreb;
        } else if (i2 == 3) {
            i = C27609f.C27617h.ds_pa_nutriscorec;
        } else if (i2 == 4) {
            i = C27609f.C27617h.ds_pa_nutriscored;
        } else if (i2 == 5) {
            i = C27609f.C27617h.ds_pa_nutriscoree;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new NutriscoreComponent.C37157a(T.mo118184q(), i, z, size);
    }

    /* renamed from: c */
    public static /* synthetic */ NutriscoreComponent.C37157a m116404c(Product product, boolean z, NutriscoreComponent.Size size, int i, Object obj) {
        if ((i & 2) != 0) {
            size = null;
        }
        return m116403b(product, z, size);
    }

    /* renamed from: d */
    public static final boolean m116405d(@C12579k Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.mo118412M().contains(OfferFlag.ORGANIC);
    }

    /* renamed from: e */
    public static final boolean m116406e(@C12579k Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.mo118412M().contains(OfferFlag.CLUB_MARCHE);
    }
}
