package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.d */
public interface C40340d {

    /* renamed from: u */
    public static final int f102815u = -1;

    void addView(View view);

    void addView(View view, int i);

    /* renamed from: b */
    void mo133023b(View view, int i, int i2, C40342f fVar);

    /* renamed from: c */
    int mo133024c(int i, int i2, int i3);

    /* renamed from: e */
    View mo133027e(int i);

    /* renamed from: f */
    int mo133028f(int i, int i2, int i3);

    /* renamed from: g */
    int mo133029g(View view);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<C40342f> getFlexLines();

    List<C40342f> getFlexLinesInternal();

    int getFlexWrap();

    int getJustifyContent();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    /* renamed from: h */
    void mo133047h(C40342f fVar);

    /* renamed from: i */
    View mo133048i(int i);

    /* renamed from: j */
    void mo133049j(int i, View view);

    /* renamed from: k */
    int mo133050k(View view, int i, int i2);

    /* renamed from: l */
    boolean mo133051l();

    void removeAllViews();

    void removeViewAt(int i);

    void setAlignContent(int i);

    void setAlignItems(int i);

    void setFlexDirection(int i);

    void setFlexLines(List<C40342f> list);

    void setFlexWrap(int i);

    void setJustifyContent(int i);

    void setMaxLine(int i);
}
