package com.carrefour.fid.android.presentation.p035ui.account.anonymous;

import android.view.View;
import android.widget.TextView;

/* renamed from: com.carrefour.fid.android.presentation.ui.account.anonymous.c */
public final /* synthetic */ class C22881c implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ AccountAnonymousFragment f58470a;

    /* renamed from: b */
    public final /* synthetic */ TextView f58471b;

    public /* synthetic */ C22881c(AccountAnonymousFragment accountAnonymousFragment, TextView textView) {
        this.f58470a = accountAnonymousFragment;
        this.f58471b = textView;
    }

    public final boolean onLongClick(View view) {
        return AccountAnonymousFragment.m103177Y0(this.f58470a, this.f58471b, view);
    }
}
