package com.carrefour.fid.android.widget;

import android.graphics.pdf.PdfRenderer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36865w6;
import com.ortiz.touchview.TouchImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.widget.d */
public final class C22843d extends RecyclerView.Adapter<C22844a> {

    /* renamed from: c */
    public static final int f58418c = 8;
    @C12579k

    /* renamed from: a */
    public final PdfRenderer f58419a;

    /* renamed from: b */
    public final int f58420b;

    /* renamed from: com.carrefour.fid.android.widget.d$a */
    public final class C22844a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C36865w6 f58421a;

        /* renamed from: b */
        public final /* synthetic */ C22843d f58422b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22844a(@C12579k C22843d dVar, C36865w6 w6Var) {
            super(w6Var.getRoot());
            Intrinsics.checkNotNullParameter(w6Var, "binding");
            this.f58422b = dVar;
            this.f58421a = w6Var;
        }

        /* renamed from: c */
        public final void mo67307c() {
            TouchImageView touchImageView = this.f58421a.f91864b;
            PdfRenderer.Page openPage = this.f58422b.f58419a.openPage(getBindingAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(openPage, "renderer.openPage(bindingAdapterPosition)");
            touchImageView.setImageBitmap(C22846f.m103130g(openPage, this.f58422b.f58420b));
        }

        @C12579k
        /* renamed from: d */
        public final C36865w6 mo67308d() {
            return this.f58421a;
        }
    }

    public C22843d(@C12579k PdfRenderer pdfRenderer, int i) {
        Intrinsics.checkNotNullParameter(pdfRenderer, "renderer");
        this.f58419a = pdfRenderer;
        this.f58420b = i;
    }

    public int getItemCount() {
        return this.f58419a.getPageCount();
    }

    /* renamed from: m */
    public void onBindViewHolder(@C12579k C22844a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo67307c();
    }

    @C12579k
    /* renamed from: n */
    public C22844a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36865w6 d = C36865w6.m151177d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …      false\n            )");
        C22844a aVar = new C22844a(this, d);
        TouchImageView touchImageView = aVar.mo67308d().f91864b;
        Intrinsics.checkNotNullExpressionValue(touchImageView, "binding.pdfReaderPage");
        C22846f.m103128e(touchImageView);
        return aVar;
    }
}
