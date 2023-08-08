package com.carrefour.fid.android.design.components.divider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0364q;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.core.content.res.C17465i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.divider.a */
public final class C37091a extends RecyclerView.C20075n {
    @C12579k

    /* renamed from: g */
    public static final C37092a f92865g = new C37092a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final int f92866h = 8;

    /* renamed from: i */
    public static final int f92867i = 0;

    /* renamed from: j */
    public static final int f92868j = 1;
    @C12579k

    /* renamed from: k */
    public static final int[] f92869k = {16843284};
    @C12579k

    /* renamed from: a */
    public final Rect f92870a;
    @C12579k

    /* renamed from: b */
    public Drawable f92871b;
    @C12580l

    /* renamed from: c */
    public Drawable f92872c;

    /* renamed from: d */
    public int f92873d;

    /* renamed from: e */
    public int f92874e;

    /* renamed from: f */
    public boolean f92875f;

    /* renamed from: com.carrefour.fid.android.design.components.divider.a$a */
    public static final class C37092a {
        public /* synthetic */ C37092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C37092a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.divider.a$b */
    public static final class C37093b {

        /* renamed from: c */
        public static final int f92876c = 0;

        /* renamed from: a */
        public final int f92877a;

        /* renamed from: b */
        public final int f92878b;

        public C37093b(@C0364q int i, @C0375v int i2) {
            this.f92877a = i;
            this.f92878b = i2;
        }

        /* renamed from: a */
        public final int mo112705a() {
            return this.f92878b;
        }

        /* renamed from: b */
        public final int mo112706b() {
            return this.f92877a;
        }
    }

    public C37091a(@C12579k Context context, int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f92870a = new Rect();
        Drawable drawable = context.obtainStyledAttributes(f92869k).getDrawable(0);
        if (drawable != null) {
            this.f92871b = drawable;
            mo112704n(i);
            this.f92875f = true;
            return;
        }
        throw new IllegalStateException("Can't get default divider for RecyclerView");
    }

    /* renamed from: g */
    public void mo59102g(@C12579k Rect rect, @C12579k View view, @C12579k RecyclerView recyclerView, @C12579k RecyclerView.C20055b0 b0Var) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(b0Var, "state");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int d = ((RecyclerView.C20081p) layoutParams).mo59995d();
        int d2 = b0Var.mo59729d();
        if (this.f92875f) {
            if (this.f92874e == 1) {
                rect.set(0, 0, 0, this.f92871b.getIntrinsicHeight());
            } else {
                rect.set(0, 0, this.f92871b.getIntrinsicWidth(), 0);
            }
        } else if (d == d2 - 1) {
            rect.setEmpty();
        } else if (this.f92874e == 1) {
            rect.set(0, 0, 0, this.f92871b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f92871b.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: i */
    public void mo59864i(@C12579k Canvas canvas, @C12579k RecyclerView recyclerView, @C12579k RecyclerView.C20055b0 b0Var) {
        Intrinsics.checkNotNullParameter(canvas, "c");
        Intrinsics.checkNotNullParameter(recyclerView, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(b0Var, "state");
        if (recyclerView.getLayoutManager() != null) {
            if (this.f92874e == 1) {
                mo112703m(canvas, recyclerView);
            } else {
                mo112702l(canvas, recyclerView);
            }
        }
    }

    /* renamed from: l */
    public final void mo112702l(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        if (this.f92875f) {
            i3 = recyclerView.getChildCount();
        } else {
            i3 = recyclerView.getChildCount() - 1;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager);
            layoutManager.mo59937f0(childAt, this.f92870a);
            int round = this.f92870a.right + Math.round(childAt.getTranslationX());
            int intrinsicWidth = round - this.f92871b.getIntrinsicWidth();
            Drawable drawable = this.f92872c;
            if (drawable != null) {
                drawable.setBounds(intrinsicWidth, i2, round, i);
                drawable.draw(canvas);
            }
            Drawable drawable2 = this.f92871b;
            int i5 = this.f92873d;
            drawable2.setBounds(intrinsicWidth, i2 + i5, round, i - i5);
            this.f92871b.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: m */
    public final void mo112703m(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        if (this.f92875f) {
            i3 = recyclerView.getChildCount();
        } else {
            i3 = recyclerView.getChildCount() - 1;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            recyclerView.mo59653v0(childAt, this.f92870a);
            int round = this.f92870a.bottom + Math.round(childAt.getTranslationY());
            int intrinsicHeight = round - this.f92871b.getIntrinsicHeight();
            Drawable drawable = this.f92872c;
            if (drawable != null) {
                drawable.setBounds(i2, intrinsicHeight, i, round);
                drawable.draw(canvas);
            }
            Drawable drawable2 = this.f92871b;
            int i5 = this.f92873d;
            drawable2.setBounds(i2 + i5, intrinsicHeight, i - i5, round);
            this.f92871b.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: n */
    public final void mo112704n(int i) {
        if (i == 0 || i == 1) {
            this.f92874e = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C37091a(@C12579k Context context, int i, boolean z) {
        this(context, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f92875f = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37091a(Context context, int i, boolean z, Drawable drawable, C37093b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, z, drawable, (i2 & 16) != 0 ? null : bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C37091a(@C12579k Context context, int i, boolean z, @C12579k Drawable drawable, @C12580l C37093b bVar) {
        this(context, i, z);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f92871b = drawable;
        if (bVar != null) {
            this.f92872c = C17465i.m80175g(context.getResources(), bVar.mo112705a(), context.getTheme());
            this.f92873d = context.getResources().getDimensionPixelSize(bVar.mo112706b());
        }
    }
}
