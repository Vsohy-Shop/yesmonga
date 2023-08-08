package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* renamed from: a */
    public int f2245a;

    /* renamed from: b */
    public int f2246b;

    /* renamed from: c */
    public WeakReference<View> f2247c;

    /* renamed from: d */
    public LayoutInflater f2248d;

    /* renamed from: e */
    public C0682a f2249e;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0682a {
        /* renamed from: a */
        void mo3253a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo3241a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f2245a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f2248d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2245a, viewGroup, false);
            int i = this.f2246b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2247c = new WeakReference<>(inflate);
            C0682a aVar = this.f2249e;
            if (aVar != null) {
                aVar.mo3253a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2246b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2248d;
    }

    public int getLayoutResource() {
        return this.f2245a;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2246b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2248d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2245a = i;
    }

    public void setOnInflateListener(C0682a aVar) {
        this.f2249e = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f2247c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo3241a();
        }
    }

    public ViewStubCompat(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2245a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0387a.C0400m.ViewStubCompat, i, 0);
        this.f2246b = obtainStyledAttributes.getResourceId(C0387a.C0400m.ViewStubCompat_android_inflatedId, -1);
        this.f2245a = obtainStyledAttributes.getResourceId(C0387a.C0400m.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0387a.C0400m.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
