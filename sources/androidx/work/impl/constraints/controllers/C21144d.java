package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.C21138b;
import androidx.work.impl.constraints.trackers.C21164h;
import androidx.work.impl.model.C21249u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.constraints.controllers.d */
public final class C21144d extends C21142c<C21138b> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21144d(@C12579k C21164h<C21138b> hVar) {
        super(hVar);
        Intrinsics.checkNotNullParameter(hVar, "tracker");
    }

    /* renamed from: c */
    public boolean mo63288c(@C12579k C21249u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "workSpec");
        if (uVar.f54813j.mo63128d() == NetworkType.CONNECTED) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo63289d(@C12579k C21138b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar.mo63282g() || !bVar.mo63286j()) {
                return true;
            }
        } else if (!bVar.mo63282g()) {
            return true;
        }
        return false;
    }
}
