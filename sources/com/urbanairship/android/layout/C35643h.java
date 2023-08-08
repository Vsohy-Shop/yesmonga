package com.urbanairship.android.layout;

import android.content.Context;
import android.content.Intent;
import com.urbanairship.android.layout.display.C35578a;
import com.urbanairship.android.layout.display.C35579b;
import com.urbanairship.android.layout.display.DisplayArgsLoader;
import com.urbanairship.android.layout.p053ui.ModalActivity;

/* renamed from: com.urbanairship.android.layout.h */
public final /* synthetic */ class C35643h implements C35579b.C35580a {
    /* renamed from: a */
    public final void mo106604a(Context context, C35578a aVar) {
        context.startActivity(new Intent(context, ModalActivity.class).setFlags(268435456).putExtra(ModalActivity.f88739b1, DisplayArgsLoader.m146843c(aVar)));
    }
}
