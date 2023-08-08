package com.carrefour.fid.android.widget;

import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.iam.events.C9175a;
import java.io.File;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/widget/PDFReader;", "Landroidx/recyclerview/widget/RecyclerView;", "", "filePath", "Lkotlin/d2;", "X1", "W1", "Landroid/graphics/pdf/PdfRenderer;", "B2", "Landroid/graphics/pdf/PdfRenderer;", "renderer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class PDFReader extends RecyclerView {

    /* renamed from: C2 */
    public static final int f58408C2 = 8;
    @C12580l

    /* renamed from: B2 */
    public PdfRenderer f58409B2;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PDFReader(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: Y1 */
    public static final void m103110Y1(PDFReader pDFReader, PdfRenderer pdfRenderer) {
        Intrinsics.checkNotNullParameter(pDFReader, "this$0");
        Intrinsics.checkNotNullParameter(pdfRenderer, "$it");
        pDFReader.setAdapter(new C22843d(pdfRenderer, pDFReader.getWidth()));
    }

    /* renamed from: W1 */
    public final void mo67297W1() {
        PdfRenderer pdfRenderer = this.f58409B2;
        if (pdfRenderer != null) {
            pdfRenderer.close();
        }
    }

    /* renamed from: X1 */
    public final void mo67298X1(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        try {
            this.f58409B2 = new PdfRenderer(ParcelFileDescriptor.open(new File(str), 268435456));
        } catch (Exception e) {
            C28935i.m119705e(C28935i.f70940a, "PDFReader", e, 0, 4, (Object) null);
        }
        PdfRenderer pdfRenderer = this.f58409B2;
        if (pdfRenderer != null) {
            post(new C22842c(this, pdfRenderer));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PDFReader(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PDFReader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public PDFReader(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setLayoutManager(new LinearLayoutManager(context));
    }
}
