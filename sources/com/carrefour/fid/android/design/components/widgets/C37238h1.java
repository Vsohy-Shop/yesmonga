package com.carrefour.fid.android.design.components.widgets;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.carrefour.fid.android.design.components.widgets.h1 */
public final /* synthetic */ class C37238h1 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SearchWithListItemComponent f93397a;

    public /* synthetic */ C37238h1(SearchWithListItemComponent searchWithListItemComponent) {
        this.f93397a = searchWithListItemComponent;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return SearchWithListItemComponent.m152520D(this.f93397a, textView, i, keyEvent);
    }
}
