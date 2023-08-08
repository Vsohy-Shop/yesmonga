package com.carrefour.fid.android.design.components.widgets.productcard.list.divider;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.productcard.list.divider.C37375a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.divider.b */
public final class C37377b extends RecyclerView.C20075n {

    /* renamed from: c */
    public static final int f93933c = 8;
    @C12579k

    /* renamed from: a */
    public final Paint f93934a = new Paint();
    @C12579k

    /* renamed from: b */
    public C37379b f93935b = new C37378a();

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.divider.b$a */
    public final class C37378a implements C37379b {
        @C12579k

        /* renamed from: a */
        public final C37375a f93936a = new C37375a.C37376a().mo113957b(-7829368).mo113959d(2).mo113956a();

        public C37378a() {
        }

        @C12579k
        /* renamed from: a */
        public C37375a mo113911a(int i) {
            return this.f93936a;
        }

        @C12579k
        /* renamed from: b */
        public C37375a mo113912b(int i) {
            return this.f93936a;
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.divider.b$b */
    public interface C37379b {
        @C12580l
        /* renamed from: a */
        C37375a mo113911a(int i);

        @C12580l
        /* renamed from: b */
        C37375a mo113912b(int i);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.divider.b$c */
    public static class C37380c implements C37379b {

        /* renamed from: a */
        public static final int f93938a = 0;

        @C12580l
        /* renamed from: a */
        public C37375a mo113911a(int i) {
            return null;
        }

        @C12580l
        /* renamed from: b */
        public C37375a mo113912b(int i) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo59102g(@C12579k Rect rect, @C12579k View view, @C12579k RecyclerView recyclerView, @C12579k RecyclerView.C20055b0 b0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(b0Var, "state");
        int d = b0Var.mo59729d();
        RecyclerView.C20061e0 t0 = recyclerView.mo59648t0(view);
        if (t0 != null) {
            i = t0.getAbsoluteAdapterPosition();
        } else {
            i = -1;
        }
        if (i >= 0) {
            RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                int D3 = gridLayoutManager.mo59306D3();
                GridLayoutManager.C20044c H3 = gridLayoutManager.mo59313H3();
                int e = H3.mo59351e(i, D3);
                int d2 = H3.mo59357d(i, D3);
                int d3 = H3.mo59357d(d - 1, D3);
                C37375a a = this.f93935b.mo113911a(i);
                C37375a b = this.f93935b.mo113912b(i);
                if (a == null) {
                    i3 = 0;
                } else {
                    i3 = a.mo113951d();
                }
                rect.left = i3;
                if (b == null) {
                    i4 = 0;
                } else {
                    i4 = b.mo113951d();
                }
                rect.bottom = i4;
                if (e == 0) {
                    rect.left = 0;
                }
                if (d3 == d2) {
                    rect.bottom = 0;
                }
            } else if (layoutManager instanceof LinearLayoutManager) {
                C37375a b2 = this.f93935b.mo113912b(i);
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.mo113951d();
                }
                rect.bottom = i2;
                if (i == d) {
                    rect.bottom = 0;
                }
            } else {
                throw new IllegalArgumentException("It is not currently supported StaggeredGridLayoutManager");
            }
        }
    }

    /* renamed from: i */
    public void mo59864i(@C12579k Canvas canvas, @C12579k RecyclerView recyclerView, @C12579k RecyclerView.C20055b0 b0Var) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "c");
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(b0Var, "state");
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = recyclerView.getChildAt(i2);
            RecyclerView.C20061e0 t0 = recyclerView.mo59648t0(childAt);
            if (t0 != null) {
                i = t0.getAbsoluteAdapterPosition();
            } else {
                i = -1;
            }
            if (i >= 0) {
                C37375a a = this.f93935b.mo113911a(i);
                C37375a b = this.f93935b.mo113912b(i);
                if (a != null) {
                    Intrinsics.checkNotNullExpressionValue(childAt, "child");
                    mo113961m(canvas, childAt, a);
                }
                if (b != null) {
                    Intrinsics.checkNotNullExpressionValue(childAt, "child");
                    mo113960l(canvas, childAt, b);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void mo113960l(Canvas canvas, View view, C37375a aVar) {
        this.f93934a.setColor(aVar.mo113948a());
        canvas.drawRect((float) (view.getLeft() + aVar.mo113950c()), (float) view.getBottom(), (float) (view.getRight() - aVar.mo113949b()), (float) (view.getBottom() + aVar.mo113951d()), this.f93934a);
    }

    /* renamed from: m */
    public final void mo113961m(Canvas canvas, View view, C37375a aVar) {
        this.f93934a.setColor(aVar.mo113948a());
        canvas.drawRect((float) view.getRight(), (float) (view.getTop() + aVar.mo113950c()), (float) (view.getRight() + aVar.mo113951d()), (float) (view.getBottom() - aVar.mo113949b()), this.f93934a);
    }

    /* renamed from: n */
    public final void mo113962n(@C12579k C37379b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "dividerLookup");
        this.f93935b = bVar;
    }
}
