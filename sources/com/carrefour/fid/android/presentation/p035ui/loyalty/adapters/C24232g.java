package com.carrefour.fid.android.presentation.p035ui.loyalty.adapters;

import android.widget.CompoundButton;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24229f;

/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.g */
public final /* synthetic */ class C24232g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C24229f.C24231b f60612a;

    /* renamed from: b */
    public final /* synthetic */ C24229f.C24230a f60613b;

    /* renamed from: c */
    public final /* synthetic */ DataPrimeCmsResponse f60614c;

    public /* synthetic */ C24232g(C24229f.C24231b bVar, C24229f.C24230a aVar, DataPrimeCmsResponse dataPrimeCmsResponse) {
        this.f60612a = bVar;
        this.f60613b = aVar;
        this.f60614c = dataPrimeCmsResponse;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C24229f.C24231b.m106660f(this.f60612a, this.f60613b, this.f60614c, compoundButton, z);
    }
}
