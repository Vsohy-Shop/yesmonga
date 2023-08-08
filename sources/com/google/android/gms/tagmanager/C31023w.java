package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;

/* renamed from: com.google.android.gms.tagmanager.w */
public interface C31023w extends IInterface {
    void initialize(C41016d dVar, C31020t tVar, C31011k kVar) throws RemoteException;

    void preview(Intent intent, C41016d dVar) throws RemoteException;

    void previewIntent(Intent intent, C41016d dVar, C41016d dVar2, C31020t tVar, C31011k kVar) throws RemoteException;
}
