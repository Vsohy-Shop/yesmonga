package com.google.mlkit.common.sdkinternal.model;

import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.common.internal.C40843u;
import com.google.mlkit.common.MlKitException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

@C0348i1
@C40473a
public class ModelLoader {

    /* renamed from: e */
    public static final C40777k f82382e = new C40777k("ModelLoader", "");
    @C40473a
    @C0344h1
    @RecentlyNullable

    /* renamed from: a */
    public final C33962i f82383a;
    @C40473a
    @RecentlyNullable

    /* renamed from: b */
    public final C33956c f82384b;
    @RecentlyNonNull
    @C40473a

    /* renamed from: c */
    public ModelLoadingState f82385c = ModelLoadingState.NO_MODEL_LOADED;
    @C0359n0

    /* renamed from: d */
    public final C33952b f82386d;

    @C40473a
    public enum ModelLoadingState {
        NO_MODEL_LOADED,
        REMOTE_MODEL_LOADED,
        LOCAL_MODEL_LOADED
    }

    @C40473a
    /* renamed from: com.google.mlkit.common.sdkinternal.model.ModelLoader$a */
    public interface C33951a {
        @C40473a
        /* renamed from: a */
        void mo98739a(@RecentlyNonNull MappedByteBuffer mappedByteBuffer) throws MlKitException;
    }

    @C40473a
    /* renamed from: com.google.mlkit.common.sdkinternal.model.ModelLoader$b */
    public interface C33952b {
        @C40473a
        /* renamed from: a */
        void mo98740a(@RecentlyNonNull List<Integer> list);
    }

    @C40473a
    public ModelLoader(@C0363p0 C33962i iVar, @C0363p0 C33956c cVar, @RecentlyNonNull C33952b bVar) {
        boolean z = true;
        if (iVar == null && cVar == null) {
            z = false;
        }
        C40843u.m166192b(z, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        C40843u.m166202l(bVar);
        this.f82383a = iVar;
        this.f82384b = cVar;
        this.f82386d = bVar;
    }

    @C40473a
    /* renamed from: a */
    public synchronized boolean mo98734a() {
        if (this.f82385c == ModelLoadingState.REMOTE_MODEL_LOADED) {
            return true;
        }
        return false;
    }

    @C40473a
    /* renamed from: b */
    public synchronized void mo98735b(@RecentlyNonNull C33951a aVar) throws MlKitException {
        Exception exc;
        boolean z;
        String str;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        Exception e = null;
        boolean z2 = false;
        try {
            z = mo98738e(aVar, arrayList);
            exc = null;
        } catch (Exception e2) {
            exc = e2;
            z = false;
        }
        if (z) {
            this.f82386d.mo98740a(arrayList);
            this.f82385c = ModelLoadingState.REMOTE_MODEL_LOADED;
            return;
        }
        try {
            z2 = mo98737d(aVar, arrayList);
        } catch (Exception e3) {
            e = e3;
        }
        if (z2) {
            this.f82386d.mo98740a(arrayList);
            this.f82385c = ModelLoadingState.LOCAL_MODEL_LOADED;
            return;
        }
        arrayList.add(17);
        this.f82386d.mo98740a(arrayList);
        this.f82385c = ModelLoadingState.NO_MODEL_LOADED;
        if (exc != null) {
            String valueOf = String.valueOf(mo98736c());
            if (valueOf.length() != 0) {
                str3 = "Remote model load failed with the model options: ".concat(valueOf);
            } else {
                str3 = new String("Remote model load failed with the model options: ");
            }
            throw new MlKitException(str3, 14, exc);
        } else if (e != null) {
            String valueOf2 = String.valueOf(mo98736c());
            if (valueOf2.length() != 0) {
                str2 = "Local model load failed with the model options: ".concat(valueOf2);
            } else {
                str2 = new String("Local model load failed with the model options: ");
            }
            throw new MlKitException(str2, 14, e);
        } else {
            String valueOf3 = String.valueOf(mo98736c());
            if (valueOf3.length() != 0) {
                str = "Cannot load any model with the model options: ".concat(valueOf3);
            } else {
                str = new String("Cannot load any model with the model options: ");
            }
            throw new MlKitException(str, 14);
        }
    }

    /* renamed from: c */
    public final String mo98736c() {
        String str;
        C33956c cVar = this.f82384b;
        String str2 = null;
        if (cVar != null) {
            if (cVar.mo98760a().mo98665b() != null) {
                str2 = this.f82384b.mo98760a().mo98665b();
            } else if (this.f82384b.mo98760a().mo98664a() != null) {
                str2 = this.f82384b.mo98760a().mo98664a();
            } else if (this.f82384b.mo98760a().mo98666c() != null) {
                str2 = ((Uri) C40843u.m166202l(this.f82384b.mo98760a().mo98666c())).toString();
            }
        }
        C33962i iVar = this.f82383a;
        if (iVar == null) {
            str = "unspecified";
        } else {
            str = iVar.mo98800b().mo98683f();
        }
        return String.format("Local model path: %s. Remote model name: %s. ", new Object[]{str2, str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo98737d(com.google.mlkit.common.sdkinternal.model.ModelLoader.C33951a r2, java.util.List<java.lang.Integer> r3) throws com.google.mlkit.common.MlKitException {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.mlkit.common.sdkinternal.model.c r0 = r1.f82384b     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0025
            java.nio.MappedByteBuffer r0 = r0.mo98761b()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0025
            r2.mo98739a(r0)     // Catch:{ RuntimeException -> 0x001a }
            com.google.android.gms.common.internal.k r2 = f82382e     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "ModelLoader"
            java.lang.String r0 = "Local model source is loaded successfully"
            r2.mo134430c(r3, r0)     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x001a:
            r2 = move-exception
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0028 }
            r3.add(r0)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0025:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0028:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.ModelLoader.mo98737d(com.google.mlkit.common.sdkinternal.model.ModelLoader$a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo98738e(com.google.mlkit.common.sdkinternal.model.ModelLoader.C33951a r4, java.util.List<java.lang.Integer> r5) throws com.google.mlkit.common.MlKitException {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.mlkit.common.sdkinternal.model.i r0 = r3.f82383a     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004c
            java.nio.MappedByteBuffer r0 = r0.mo98801c()     // Catch:{ MlKitException -> 0x0038 }
            if (r0 == 0) goto L_0x0025
            r4.mo98739a(r0)     // Catch:{ RuntimeException -> 0x001a }
            com.google.android.gms.common.internal.k r4 = f82382e     // Catch:{ all -> 0x004f }
            java.lang.String r5 = "ModelLoader"
            java.lang.String r0 = "Remote model source is loaded successfully"
            r4.mo134430c(r5, r0)     // Catch:{ all -> 0x004f }
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x001a:
            r4 = move-exception
            r0 = 19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004f }
            r5.add(r0)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ all -> 0x004f }
        L_0x0025:
            com.google.android.gms.common.internal.k r4 = f82382e     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "ModelLoader"
            java.lang.String r1 = "Remote model source can NOT be loaded, try local model."
            r4.mo134430c(r0, r1)     // Catch:{ all -> 0x004f }
            r4 = 21
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004f }
            r5.add(r4)     // Catch:{ all -> 0x004f }
            goto L_0x004c
        L_0x0038:
            r4 = move-exception
            com.google.android.gms.common.internal.k r0 = f82382e     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "ModelLoader"
            java.lang.String r2 = "Remote model source can NOT be loaded, try local model."
            r0.mo134430c(r1, r2)     // Catch:{ all -> 0x004f }
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004f }
            r5.add(r0)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ all -> 0x004f }
        L_0x004c:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x004f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.ModelLoader.mo98738e(com.google.mlkit.common.sdkinternal.model.ModelLoader$a, java.util.List):boolean");
    }
}
