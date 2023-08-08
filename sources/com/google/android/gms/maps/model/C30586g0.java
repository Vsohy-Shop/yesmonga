package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.C0363p0;
import com.google.android.gms.internal.maps.C41833k;

/* renamed from: com.google.android.gms.maps.model.g0 */
public final class C30586g0 implements C30594l {

    /* renamed from: b */
    public final C41833k f73134b;

    /* renamed from: c */
    public final /* synthetic */ TileOverlayOptions f73135c;

    public C30586g0(TileOverlayOptions tileOverlayOptions) {
        this.f73135c = tileOverlayOptions;
        this.f73134b = tileOverlayOptions.f73103a;
    }

    @C0363p0
    /* renamed from: a */
    public final Tile mo86552a(int i, int i2, int i3) {
        try {
            return this.f73134b.mo86583B3(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
