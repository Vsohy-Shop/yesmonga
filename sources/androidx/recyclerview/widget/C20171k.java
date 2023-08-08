package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
public class C20171k extends RecyclerView.C20075n {

    /* renamed from: d */
    public static final int f51949d = 0;

    /* renamed from: e */
    public static final int f51950e = 1;

    /* renamed from: f */
    public static final String f51951f = "DividerItem";

    /* renamed from: g */
    public static final int[] f51952g = {16843284};

    /* renamed from: a */
    public Drawable f51953a;

    /* renamed from: b */
    public int f51954b;

    /* renamed from: c */
    public final Rect f51955c = new Rect();

    public C20171k(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f51952g);
        this.f51953a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        mo60497p(i);
    }

    /* renamed from: g */
    public void mo59102g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C20055b0 b0Var) {
        Drawable drawable = this.f51953a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f51954b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: i */
    public void mo59864i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C20055b0 b0Var) {
        if (recyclerView.getLayoutManager() != null && this.f51953a != null) {
            if (this.f51954b == 1) {
                mo60494m(canvas, recyclerView);
            } else {
                mo60493l(canvas, recyclerView);
            }
        }
    }

    /* renamed from: l */
    public final void mo60493l(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo59937f0(childAt, this.f51955c);
            int round = this.f51955c.right + Math.round(childAt.getTranslationX());
            this.f51953a.setBounds(round - this.f51953a.getIntrinsicWidth(), i2, round, i);
            this.f51953a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: m */
    public final void mo60494m(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.mo59653v0(childAt, this.f51955c);
            int round = this.f51955c.bottom + Math.round(childAt.getTranslationY());
            this.f51953a.setBounds(i2, round - this.f51953a.getIntrinsicHeight(), i, round);
            this.f51953a.draw(canvas);
        }
        canvas.restore();
    }

    @C0363p0
    /* renamed from: n */
    public Drawable mo60495n() {
        return this.f51953a;
    }

    /* renamed from: o */
    public void mo60496o(@C0359n0 Drawable drawable) {
        if (drawable != null) {
            this.f51953a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: p */
    public void mo60497p(int i) {
        if (i == 0 || i == 1) {
            this.f51954b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
}
