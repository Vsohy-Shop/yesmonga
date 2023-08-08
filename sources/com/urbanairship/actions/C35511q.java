package com.urbanairship.actions;

import android.os.ResultReceiver;
import androidx.core.util.C17970d;
import com.urbanairship.actions.PromptPermissionAction;
import com.urbanairship.app.C36035g;
import com.urbanairship.permission.PermissionStatus;

/* renamed from: com.urbanairship.actions.q */
public final /* synthetic */ class C35511q implements C17970d {

    /* renamed from: a */
    public final /* synthetic */ PromptPermissionAction.C35478a f87568a;

    /* renamed from: b */
    public final /* synthetic */ PromptPermissionAction.C35479b f87569b;

    /* renamed from: c */
    public final /* synthetic */ PermissionStatus f87570c;

    /* renamed from: d */
    public final /* synthetic */ ResultReceiver f87571d;

    /* renamed from: e */
    public final /* synthetic */ C36035g f87572e;

    public /* synthetic */ C35511q(PromptPermissionAction.C35478a aVar, PromptPermissionAction.C35479b bVar, PermissionStatus permissionStatus, ResultReceiver resultReceiver, C36035g gVar) {
        this.f87568a = aVar;
        this.f87569b = bVar;
        this.f87570c = permissionStatus;
        this.f87571d = resultReceiver;
        this.f87572e = gVar;
    }

    public final void accept(Object obj) {
        this.f87568a.m146383d(this.f87569b, this.f87570c, this.f87571d, this.f87572e, (PermissionStatus) obj);
    }
}
