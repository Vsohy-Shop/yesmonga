package com.urbanairship.actions;

import android.os.ResultReceiver;
import androidx.core.util.C17970d;
import com.urbanairship.actions.PromptPermissionAction;
import com.urbanairship.permission.C9426c;
import com.urbanairship.permission.C9439p;
import com.urbanairship.permission.PermissionStatus;

/* renamed from: com.urbanairship.actions.o */
public final /* synthetic */ class C35509o implements C17970d {

    /* renamed from: a */
    public final /* synthetic */ PromptPermissionAction f87563a;

    /* renamed from: b */
    public final /* synthetic */ PromptPermissionAction.C35479b f87564b;

    /* renamed from: c */
    public final /* synthetic */ C9439p f87565c;

    /* renamed from: d */
    public final /* synthetic */ PermissionStatus f87566d;

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f87567e;

    public /* synthetic */ C35509o(PromptPermissionAction promptPermissionAction, PromptPermissionAction.C35479b bVar, C9439p pVar, PermissionStatus permissionStatus, ResultReceiver resultReceiver) {
        this.f87563a = promptPermissionAction;
        this.f87564b = bVar;
        this.f87565c = pVar;
        this.f87566d = permissionStatus;
        this.f87567e = resultReceiver;
    }

    public final void accept(Object obj) {
        this.f87563a.m146370k(this.f87564b, this.f87565c, this.f87566d, this.f87567e, (C9426c) obj);
    }
}
