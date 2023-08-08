package com.carrefour.fid.android.shared.presentation.components.decoration;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0364q;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.core.content.C17318d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.presentation.components.decoration.a */
public class C28852a extends RecyclerView.C20075n {

    /* renamed from: e */
    public static final int f70672e = 8;

    /* renamed from: a */
    public final int f70673a;

    /* renamed from: b */
    public final boolean f70674b;

    /* renamed from: c */
    public final int f70675c;
    @C12579k

    /* renamed from: d */
    public final Paint f70676d;

    public C28852a() {
        this(0, false, 0, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public void mo59102g(@C12579k Rect rect, @C12579k View view, @C12579k RecyclerView recyclerView, @C12579k RecyclerView.C20055b0 b0Var) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(b0Var, "state");
        super.mo59102g(rect, view, recyclerView, b0Var);
        if (this.f70674b || b0Var.mo59729d() - 1 >= recyclerView.mo59608p0(view)) {
            rect.setEmpty();
            return;
        }
        int i = this.f70673a;
        rect.set(i, i, i, i);
    }

    /* renamed from: j */
    public void mo59865j(@C12579k Canvas canvas, @C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(canvas, "c");
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int l = mo83965l(recyclerView);
        for (int i = 0; i < l; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((RecyclerView.C20081p) layoutParams).bottomMargin;
            Intrinsics.checkNotNullExpressionValue(childAt, "child");
            int m = mo83966m(childAt) + bottom;
            this.f70676d.setColor(this.f70675c);
            canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) m, this.f70676d);
        }
    }

    /* renamed from: l */
    public int mo83965l(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        if (this.f70674b) {
            return recyclerView.getChildCount();
        }
        return recyclerView.getChildCount() - 1;
    }

    /* renamed from: m */
    public int mo83966m(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        return this.f70673a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28852a(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? -3355444 : i2);
    }

    public C28852a(int i, boolean z, @C0354l int i2) {
        this.f70673a = i;
        this.f70674b = z;
        this.f70675c = i2;
        Paint paint = new Paint();
        this.f70676d = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28852a(Context context, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C28852a(@C12579k Context context, @C0364q int i, boolean z) {
        this(context.getResources().getDimensionPixelSize(i), z, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28852a(Context context, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, i2, (i3 & 8) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C28852a(@C12579k Context context, @C0364q int i, @C0358n int i2, boolean z) {
        this(context.getResources().getDimensionPixelSize(i), z, C17318d.m79723f(context, i2));
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }
}
