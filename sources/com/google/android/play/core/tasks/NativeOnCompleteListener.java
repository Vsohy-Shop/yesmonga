package com.google.android.play.core.tasks;

import android.support.annotation.Nullable;

public class NativeOnCompleteListener implements C32224a<Object> {

    /* renamed from: a */
    public final long f78570a;

    /* renamed from: b */
    public final int f78571b;

    public NativeOnCompleteListener(long j, int i) {
        this.f78570a = j;
        this.f78571b = i;
    }

    /* renamed from: a */
    public void mo21579a(C32227d<Object> dVar) {
        if (!dVar.mo93022j()) {
            int i = this.f78571b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("onComplete called for incomplete task: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (dVar.mo93023k()) {
            nativeOnComplete(this.f78570a, this.f78571b, dVar.mo93020h(), 0);
        } else {
            Exception g = dVar.mo93019g();
            if (!(g instanceof C32233j)) {
                nativeOnComplete(this.f78570a, this.f78571b, (Object) null, -100);
                return;
            }
            int a = ((C32233j) g).mo92457a();
            if (a != 0) {
                nativeOnComplete(this.f78570a, this.f78571b, (Object) null, a);
                return;
            }
            int i2 = this.f78571b;
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("TaskException has error code 0 on task: ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public native void nativeOnComplete(long j, int i, @Nullable Object obj, int i2);
}
