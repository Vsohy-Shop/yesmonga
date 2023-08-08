package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1647n;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.m */
public interface C1477m {

    /* renamed from: androidx.camera.core.impl.m$a */
    public interface C1478a {
        @C0359n0
        /* renamed from: a */
        C1477m mo4084a(@C0359n0 Context context, @C0359n0 C1579w wVar, @C0363p0 C1647n nVar) throws InitializationException;
    }

    @C0363p0
    /* renamed from: a */
    Object mo4716a();

    @C0359n0
    /* renamed from: b */
    CameraInternal mo4717b(@C0359n0 String str) throws CameraUnavailableException;

    @C0359n0
    /* renamed from: c */
    Set<String> mo4718c();
}
