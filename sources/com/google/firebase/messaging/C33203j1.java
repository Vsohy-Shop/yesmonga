package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import androidx.profileinstaller.C20006f;
import com.google.android.gms.tasks.C31047k;
import com.google.firebase.messaging.C33213m1;

/* renamed from: com.google.firebase.messaging.j1 */
public class C33203j1 extends Binder {

    /* renamed from: n */
    public final C33204a f80722n;

    /* renamed from: com.google.firebase.messaging.j1$a */
    public interface C33204a {
        /* renamed from: a */
        C31047k<Void> mo96101a(Intent intent);
    }

    public C33203j1(C33204a aVar) {
        this.f80722n = aVar;
    }

    /* renamed from: c */
    public void mo96102c(C33213m1.C33214a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            this.f80722n.mo96101a(aVar.f80755a).mo87722f(new C20006f(), new C33199i1(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
