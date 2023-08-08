package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import com.carrefour.fid.android.product.databinding.C27490h;
import com.carrefour.fid.android.product.databinding.C27492i;
import com.carrefour.fid.android.product.databinding.C27494j;
import com.carrefour.fid.android.product.databinding.C27498l;
import com.carrefour.fid.android.product.databinding.C27500m;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27783b;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27787e;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27789f;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27790g;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27791h;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27793j;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27795k;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27799n;
import com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.c */
public final class C27771c extends BaseExpandableRecyclerView<ProductDetailsSubComponent, ProductDetailsComponent, C27791h, C27790g> {
    @C12579k

    /* renamed from: f */
    public final ProductDetailsFragment.C27747a f67343f;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.c$a */
    public /* synthetic */ class C27772a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsComponentType[] r0 = com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsComponentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsComponentType r1 = com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsComponentType.COMPOSITION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsComponentType r1 = com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsComponentType.TRACEABILITY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsComponentType r1 = com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsComponentType.ADVICE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsComponentType r1 = com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsComponentType.CHARACTERISTICS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27771c.C27772a.<clinit>():void");
        }
    }

    public C27771c(@C12579k ProductDetailsFragment.C27747a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        this.f67343f = aVar;
    }

    /* renamed from: E */
    public void mo80701t(@C12579k C27790g gVar, @C12580l ProductDetailsSubComponent productDetailsSubComponent, @C12579k ProductDetailsComponent productDetailsComponent, int i) {
        Intrinsics.checkNotNullParameter(gVar, "childViewHolder");
        Intrinsics.checkNotNullParameter(productDetailsComponent, "expandableType");
        gVar.mo80728c(productDetailsComponent, productDetailsComponent.mo83380b());
    }

    /* renamed from: F */
    public void mo80702u(@C12579k C27791h hVar, @C12579k ProductDetailsComponent productDetailsComponent, int i) {
        Intrinsics.checkNotNullParameter(hVar, "parentViewHolder");
        Intrinsics.checkNotNullParameter(productDetailsComponent, "expandableType");
        hVar.mo80735c(productDetailsComponent);
    }

    @C12579k
    /* renamed from: G */
    public C27790g mo80703w(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "child");
        if (i == 1) {
            C27492i d = C27492i.m115695d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
            return new C27795k(d);
        } else if (i == 2) {
            ProductDetailsFragment.C27747a aVar = this.f67343f;
            C27490h d2 = C27490h.m115687d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …, false\n                )");
            return new C27793j(aVar, d2);
        } else if (i == 3) {
            C27500m d3 = C27500m.m115721d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d3, "inflate(\n               …, false\n                )");
            return new C27799n(d3);
        } else if (i == 4) {
            C27498l d4 = C27498l.m115715d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d4, "inflate(\n               …, false\n                )");
            return new C27787e(d4);
        } else if (i == 5) {
            C27498l d5 = C27498l.m115715d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d5, "inflate(\n               …, false\n                )");
            return new C27783b(d5);
        } else {
            throw new Throwable("Wrong view type (" + i + ")");
        }
    }

    @C12579k
    /* renamed from: H */
    public C27791h mo80704z(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        ProductDetailsFragment.C27747a aVar = this.f67343f;
        C27494j d = C27494j.m115701d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C27789f(aVar, d);
    }

    public int getItemViewType(int i) {
        int i2 = C27772a.$EnumSwitchMapping$0[((ProductDetailsComponent) mo83371o().get(i)).mo80678e().ordinal()];
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 4;
        }
        return 5;
    }
}
