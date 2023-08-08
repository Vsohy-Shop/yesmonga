package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17994n;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31432x;
import java.util.Calendar;
import java.util.Iterator;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final Calendar f75350a;

    /* renamed from: b */
    public final boolean f75351b;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C31289a extends C18019a {
        public C31289a() {
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52600b1((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    public static int m126066d(@C0359n0 View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    public static boolean m126067e(@C0363p0 Long l, @C0363p0 Long l2, @C0363p0 Long l3, @C0363p0 Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: a */
    public final void mo89327a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo89448i());
        } else if (i == 130) {
            setSelection(getAdapter().mo89436b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @C0359n0
    /* renamed from: b */
    public C31315j getAdapter() {
        return (C31315j) super.getAdapter();
    }

    /* renamed from: c */
    public final View mo89329c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(@C0359n0 Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C31315j b = getAdapter();
        DateSelector<?> dateSelector = b.f75476b;
        C31297b bVar = b.f75478d;
        int max = Math.max(b.mo89436b(), getFirstVisiblePosition());
        int min = Math.min(b.mo89448i(), getLastVisiblePosition());
        Long c = b.getItem(max);
        Long c2 = b.getItem(min);
        Iterator<C17994n<Long, Long>> it = dateSelector.mo89284A2().iterator();
        while (it.hasNext()) {
            C17994n next = it.next();
            F f = next.f46482a;
            if (f == null) {
                materialCalendarGridView = this;
            } else if (next.f46483b != null) {
                long longValue = ((Long) f).longValue();
                long longValue2 = ((Long) next.f46483b).longValue();
                if (!m126067e(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean k = C31432x.m127016k(this);
                    if (longValue < c.longValue()) {
                        if (b.mo89440f(max)) {
                            i10 = 0;
                        } else if (!k) {
                            i10 = materialCalendarGridView.mo89329c(max - 1).getRight();
                        } else {
                            i10 = materialCalendarGridView.mo89329c(max - 1).getLeft();
                        }
                        i = i10;
                        i2 = max;
                    } else {
                        materialCalendarGridView.f75350a.setTimeInMillis(longValue);
                        i2 = b.mo89435a(materialCalendarGridView.f75350a.get(5));
                        i = m126066d(materialCalendarGridView.mo89329c(i2));
                    }
                    if (longValue2 > c2.longValue()) {
                        if (b.mo89441g(min)) {
                            i9 = getWidth();
                        } else if (!k) {
                            i9 = materialCalendarGridView.mo89329c(min).getRight();
                        } else {
                            i9 = materialCalendarGridView.mo89329c(min).getLeft();
                        }
                        i3 = i9;
                        i4 = min;
                    } else {
                        materialCalendarGridView.f75350a.setTimeInMillis(longValue2);
                        i4 = b.mo89435a(materialCalendarGridView.f75350a.get(5));
                        i3 = m126066d(materialCalendarGridView.mo89329c(i4));
                    }
                    int itemId = (int) b.getItemId(i2);
                    int i11 = max;
                    int i12 = min;
                    int itemId2 = (int) b.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c3 = materialCalendarGridView.mo89329c(numColumns);
                        int top = c3.getTop() + bVar.f75383a.mo89382e();
                        C31315j jVar = b;
                        int bottom = c3.getBottom() - bVar.f75383a.mo89379b();
                        if (!k) {
                            if (numColumns > i2) {
                                i6 = 0;
                            } else {
                                i6 = i;
                            }
                            if (i4 > numColumns2) {
                                i5 = getWidth();
                            } else {
                                i5 = i3;
                            }
                        } else {
                            if (i4 > numColumns2) {
                                i7 = 0;
                            } else {
                                i7 = i3;
                            }
                            if (numColumns > i2) {
                                i8 = getWidth();
                            } else {
                                i8 = i;
                            }
                            int i13 = i7;
                            i5 = i8;
                            i6 = i13;
                        }
                        canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, bVar.f75390h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        b = jVar;
                    }
                    materialCalendarGridView = this;
                    max = i11;
                    min = i12;
                }
            }
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            mo89327a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo89436b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo89436b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f75351b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo89436b()) {
            super.setSelection(getAdapter().mo89436b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C31315j) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C31315j.class.getCanonicalName()}));
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75350a = C31324p.m126275v();
        if (C31303f.m126169i1(getContext())) {
            setNextFocusLeftId(C31076a.C31084h.cancel_button);
            setNextFocusRightId(C31076a.C31084h.confirm_button);
        }
        this.f75351b = C31303f.m126170j1(getContext());
        C18196h2.m82474B1(this, new C31289a());
    }
}
