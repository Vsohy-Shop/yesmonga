package com.urbanairship.actions;

import android.os.ResultReceiver;
import androidx.core.util.C17970d;
import com.urbanairship.actions.PromptPermissionAction;
import com.urbanairship.permission.C9439p;
import com.urbanairship.permission.PermissionStatus;

/* renamed from: com.urbanairship.actions.n */
public final /* synthetic */ class C35508n implements C17970d {

    /* renamed from: a */
    public final /* synthetic */ PromptPermissionAction f87559a;

    /* renamed from: b */
    public final /* synthetic */ C9439p f87560b;

    /* renamed from: c */
    public final /* synthetic */ PromptPermissionAction.C35479b f87561c;

    /* renamed from: d */
    public final /* synthetic */ ResultReceiver f87562d;

    public /* synthetic */ C35508n(PromptPermissionAction promptPermissionAction, C9439p pVar, PromptPermissionAction.C35479b bVar, ResultReceiver resultReceiver) {
        this.f87559a = promptPermissionAction;
        this.f87560b = pVar;
        this.f87561c = bVar;
        this.f87562d = resultReceiver;
    }

    public final void accept(Object obj) {
        this.f87559a.m146371l(this.f87560b, this.f87561c, this.f87562d, (PermissionStatus) obj);
    }
}
